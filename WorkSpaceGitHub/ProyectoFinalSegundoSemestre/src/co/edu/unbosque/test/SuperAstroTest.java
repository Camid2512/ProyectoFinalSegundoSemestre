package co.edu.unbosque.test;

import static org.junit.Assert.assertTrue;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import co.edu.unbosque.model.persistence.SuperAstroDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SuperAstroTest {

	static int numPrueba = 1;
	private SuperAstroDAO superAstroDAO = new SuperAstroDAO();

	
	@BeforeClass
	public static void antesDeTodas() 
	{
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de SuperAstroDAO \n");
	}
	
	
	@Before
	public void mostrarMensajeEntrePruebas() 
	{
		System.err.println("Empezando la prueba "+numPrueba);
	}
	
	@Test
	public void apruebaCreate()
	{
		superAstroDAO.getSuperAstroList().clear();
		System.out.println("Iniciando la prueba de crear");
		
		String day = "01";
		String month = "03";
		String year = "2023";
		String hour = "8";
		String minute = "12";
		String second = "12";
		String betPlaced = "1000";
		String headQuarterName = "prueba";
		String document = "1011093074";
		String number = "123456";
		String zodiacSign = "Libra";

		superAstroDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, number, zodiacSign);

		int size = superAstroDAO.getSuperAstroList().size();
		assertTrue(size == 1 && superAstroDAO.getSuperAstroList().get(0).equals(superAstroDAO.getSuperAstroList().get(0)));
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
		String betPlaced = "1000";
		String headQuarterName = "prueba3";
		String document = "1011093074";
		String number = "1234577";
		String zodiacSign = "Libra";

		superAstroDAO.updateByIndex(index, day, month, year, hour, minute, second, betPlaced, headQuarterName, document, number, zodiacSign);

		int size = superAstroDAO.getSuperAstroList().size();
		assertTrue(size == 1 && superAstroDAO.getSuperAstroList().get(0).equals(superAstroDAO.getSuperAstroList().get(0)));
	}
	@Test
	public void cpruebaDelete()
	{
		System.out.println("Iniciando la prueba de eliminacion");
		int index = 0;
		superAstroDAO.delete(index);
		int size = superAstroDAO.getSuperAstroList().size();
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
