/**
 * Clase de pruebas unitarias para validar los métodos de HeadquarterDAO.

 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.model.persistence.HeadquarterDAO;

/**
 * Clase de pruebas unitarias para validar los métodos de HeadquarterDAO.
 */
public class VenueTest {

	static int numPrueba = 1;
	private HeadquarterDAO venueDAO = new HeadquarterDAO();

	/**
	 * Método que se ejecuta antes de todas las pruebas unitarias. Imprime un
	 * mensaje de inicio.
	 */
	@BeforeClass
	public static void antesDeTodas() {
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de BranchDAO \n");
	}

	/**
	 * Método que se ejecuta antes de cada prueba individual. Imprime un mensaje de
	 * inicio de prueba.
	 */
	@Before
	public void mostrarMensajeEntrePruebas() {
		System.err.println("Empezando la prueba " + numPrueba);
	}

	/**
	 * Método de prueba para el método 'create' en HeadquarterDAO. Verifica si se
	 * agrega correctamente un nuevo elemento a la lista de sedes.
	 */
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

	/**
	 * Método de prueba para el método 'updateByIndex' en HeadquarterDAO. Verifica
	 * si se actualiza correctamente un elemento en la lista de sedes.
	 */
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

	/**
	 * Método de prueba para el método 'delete' en HeadquarterDAO. Verifica si se
	 * elimina correctamente un elemento de la lista de sedes.
	 */
	@Test
	public void pruebaDelete() {
		System.out.println("Iniciando la prueba de eliminacion");
		int index = 0;
		venueDAO.delete(index);
		int size = venueDAO.getHeadquarterList().size();
		assertTrue(size == 0);
	}

	/**
	 * Método que se ejecuta después de cada prueba individual. Imprime un mensaje
	 * de finalización de prueba.
	 */
	@After
	public void MostrarMensajeLuegoPrueba() {
		System.err.println("Finalizando prueba " + numPrueba + "\n");
		numPrueba++;
	}

	/**
	 * Método que se ejecuta después de todas las pruebas. Imprime un mensaje de
	 * finalización.
	 */
	@AfterClass
	public static void luegoDeTodas() {
		System.out.println("Finalizando las pruebas unitarias");
	}
}
