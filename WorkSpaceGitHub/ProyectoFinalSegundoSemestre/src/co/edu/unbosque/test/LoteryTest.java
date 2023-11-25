package co.edu.unbosque.test;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import co.edu.unbosque.model.persistence.LoteryBetDAO;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoteryTest {
	
	static int numPrueba = 1;
	private LoteryBetDAO loteriaDAO = new LoteryBetDAO();
	
	@BeforeClass
	public static void antesDeTodas() 
	{
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de LoteriaDAO \n");
	}
	
	
	@Before
	public void mostrarMensajeEntrePruebas() 
	{
		System.err.println("Empezando la prueba "+numPrueba);
	}
	
	@Test
	public void apruebaCreate()
	{
		loteriaDAO.getLoteryBetList().clear();
		System.out.println("Iniciando la prueba de crear");

		String day = "01";
		String month = "03";
		String year = "2023";
		String hour = "8";
		String minute = "12";
		String second = "12";
		String betPlaced = "1000";
		String headQuarterName = "1";
		String document = "1011093074";
		String loteryName = "LOTERIADEBOGOTA";
		String numbers = "12345";
		String serialNum = "011";
		loteriaDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName, numbers, serialNum);

		int size = loteriaDAO.getLoteryBetList().size();
		assertTrue(size == 1 && loteriaDAO.getLoteryBetList().get(0).equals(loteriaDAO.getLoteryBetList().get(0)));
	}
	@Test
	public void bpruebaUpdate()
	{
		int index = 0;
		String day = "01";
		String month = "03";
		String year = "2023";
		String hour = "8";
		String minute = "12";
		String second = "12";
		String betPlaced = "1000";
		String headQuarterName = "2";
		String document = "1011093084";
		String loteryName = "LOTERIA DE BOGOTA";
		String numbers = "122456";
		String serialNum = "012";
		loteriaDAO.updateByIndex(index, day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName, numbers, serialNum);


		int size = loteriaDAO.getLoteryBetList().size();
		assertTrue(size == 1 && loteriaDAO.getLoteryBetList().get(0).equals(loteriaDAO.getLoteryBetList().get(0)));
	}
	@Test
	public void cpruebaDelete()
	{
		System.out.println("Iniciando la prueba de eliminacion");
		int pos = 0;
		loteriaDAO.delete(pos);
		int size = loteriaDAO.getLoteryBetList().size();
		assertTrue(size==0);
	}
	
	@After
	public void MostrarMensajeLuegoPrueba() 
	{
		System.err.println("Finalizando prueba "+numPrueba+"\n");
		numPrueba++;
	}
	
	@AfterClass
	public static void luegoDeTodas() 
	{
		System.out.println("Finalizando las pruebas unitarias");
	}
}
