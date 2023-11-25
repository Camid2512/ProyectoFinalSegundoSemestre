package co.edu.unbosque.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.model.persistence.GamblerDAO;


public class GamblerTest {
	static int numPrueba = 1;
	private GamblerDAO gamDAO = new GamblerDAO();
	
	@BeforeClass
	public static void antesDeTodas() 
	{
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de ApostadorDAO \n");
	}
	
	
	@Before
	public void mostrarMensajeEntrePruebas() 
	{
		System.err.println("Empezando la prueba "+numPrueba);
	}
	
	@Test
	public void pruebaCreate()
	{
		gamDAO.getGamblerList().clear();
		System.out.println("Iniciando la prueba de crear");
		String nombre = "Cris";
		String cedula = "1234567";
		String sede = "Usaquen";
		String direccion = "Calle 134";
		String celular = "12344";
		gamDAO.create(nombre, cedula, sede, direccion, celular);
		
		

		int size = gamDAO.getGamblerList().size();
		assertTrue(size == 1 && gamDAO.getGamblerList().get(0).equals(gamDAO.getGamblerList().get(0)));
	}
	@Test
	public void pruebaUpdate()
	{
		System.out.println("Iniciando la prueba de actualizar");
		int index = 0;
		String nombre = "Santi";
		String cedula = "1234567";
		String sede = "Usaquen";
		String direccion = "Calle 134";
		String celular = "12344";
		gamDAO.updateByIndex(index, nombre, cedula, sede, direccion, celular);

		int size = gamDAO.getGamblerList().size();
		assertTrue(size==0);
	}
	
	
	@Test
	public void pruebaDelete()
	{
		System.out.println("Iniciando la prueba de eliminacion de datos");
		int index = 0;
		gamDAO.delete(index);
		int size = gamDAO.getGamblerList().size();
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
