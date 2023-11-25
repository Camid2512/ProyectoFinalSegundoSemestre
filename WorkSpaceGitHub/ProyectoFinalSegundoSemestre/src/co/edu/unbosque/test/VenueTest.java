package co.edu.unbosque.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.model.persistence.HeadquarterDAO;

public class VenueTest {

	static int numPrueba = 1;
	private HeadquarterDAO venueDAO = new HeadquarterDAO();

	@BeforeClass
	public static void antesDeTodas() {
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de BranchDAO \n");
	}

	@Before
	public void mostrarMensajeEntrePruebas() {
		System.err.println("Empezando la prueba " + numPrueba);
	}

	@Test
	public void apruebaCreate() {
		venueDAO.getHeadquarterList().clear();
		System.out.println("Iniciando la prueba de crear");
		String name = "Chia";
		String location = "Bosa";
		String employeesNum = "1";
		String id = "AAAAAAxx123";
		venueDAO.create(name, location, employeesNum, id);

		int size = venueDAO.getHeadquarterList().size();
		assertTrue(size == 1 && venueDAO.getHeadquarterList().get(0).equals(venueDAO.getHeadquarterList().get(0)));
	}

	@Test
	public void bpruebaUpdate() {
		System.out.println("Iniciando la prueba de actualizar");
		int index = 2;
		String name = "Subachoque";
		String location = "Bosa";
		String employeesNum = "1";
		String id = "AAAAAAxx123";
		venueDAO.updateByIndex(index, name, location, employeesNum, id);

		int size = venueDAO.getHeadquarterList().size();
		assertTrue(size == 1 && venueDAO.getHeadquarterList().get(0).equals(venueDAO.getHeadquarterList().get(0)));
	}

	@Test
	public void pruebaDelete() {
		System.out.println("Iniciando la prueba de eliminacion");
		int index = 0;
		venueDAO.delete(index);
		int size = venueDAO.getHeadquarterList().size();
		assertTrue(size == 0);
	}

	@After
	public void MostrarMensajeLuegoPrueba() {
		System.err.println("Finalizando prueba " + numPrueba + "\n");
		numPrueba++;
	}

	@AfterClass
	public static void luegoDeTodas() {
		System.out.println("Finalizando las pruebas unitarias");
	}
}
