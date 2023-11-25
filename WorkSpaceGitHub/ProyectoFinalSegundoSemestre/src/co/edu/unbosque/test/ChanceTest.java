package co.edu.unbosque.test;

import static org.junit.Assert.assertTrue;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.model.persistence.ChanceDAO;


public class ChanceTest {
	
	static int numPrueba = 1;
	private ChanceDAO chanceDAO = new ChanceDAO();
	
	@BeforeClass
	public static void antesDeTodas() 
	{
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de ChanceDAO \n");
	}
	
	
	@Before
	public void mostrarMensajeEntrePruebas() 
	{
		System.err.println("Empezando la prueba "+numPrueba);
	}
	
	@Test
	public void apruebaCreate()
	{
		chanceDAO.getChanceList().clear();
		System.out.println("Iniciando la prueba de crear");
		String day = "01";
		String month = "03";
		String year = "2023";
		String hour = "8";
		String minute = "12";
		String second = "12";
		String betPlaced = "1000";
		String headQuarterName = "2";
		String document = "1011093074";
		String loteryName = "LOTERIA DEL VALLE";
		String number = "1234";
		chanceDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName, number);

		int size = chanceDAO.getChanceList().size();
		assertTrue(size == 1 && chanceDAO.getChanceList().get(0).equals(chanceDAO.getChanceList().get(0)));
	}
	@Test
	public void bpruebaUpdate()
	{
		System.out.println("Iniciando la prueba de actualizar");
		int index = 0;
		String day = "01";
		String month = "03";
		String year = "2023";
		String hour = "8";
		String minute = "12";
		String second = "12";
		String betPlaced = "100022";
		String headQuarterName = "1";
		String document = "1011093075";
		String loteryName = "LOTERIA DEL VALLE";
		String number = "2224";
		chanceDAO.updateByIndex(index, day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName, number);

		int size = chanceDAO.getChanceList().size();
		assertTrue(size == 1 && chanceDAO.getChanceList().get(0).equals(chanceDAO.getChanceList().get(0)));
	}

	@Test
	public void cpruebaDelete()
	{
		System.out.println("Iniciando la prueba de eliminacion");
		int index = 0;
		chanceDAO.delete(index);
		int size =chanceDAO.getChanceList().size();
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
