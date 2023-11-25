/**
 * Clase de pruebas unitarias para validar los métodos de SuperAstroDAO.

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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import co.edu.unbosque.model.persistence.SuperAstroDAO;

/**
 * Clase de pruebas unitarias para validar los métodos de SuperAstroDAO.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SuperAstroTest {

	static int numPrueba = 1;
	private SuperAstroDAO superAstroDAO = new SuperAstroDAO();

	/**
	 * Método que se ejecuta antes de todas las pruebas unitarias. Imprime un
	 * mensaje de inicio.
	 */
	@BeforeClass
	public static void antesDeTodas() {
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de SuperAstroDAO \n");
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
	 * Método de prueba para el método 'create' en SuperAstroDAO. Verifica si se
	 * agrega correctamente un elemento a la lista de SuperAstro.
	 */
	@Test
	public void apruebaCreate() {
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

		superAstroDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, number,
				zodiacSign);

		int size = superAstroDAO.getSuperAstroList().size();
		assertTrue(
				size == 1 && superAstroDAO.getSuperAstroList().get(0).equals(superAstroDAO.getSuperAstroList().get(0)));
	}

	/**
	 * Método de prueba para el método 'updateByIndex' en SuperAstroDAO. Verifica si
	 * se actualiza correctamente un elemento en la lista de SuperAstro.
	 */
	@Test
	public void bpruebaUpdate() {
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

		superAstroDAO.updateByIndex(index, day, month, year, hour, minute, second, betPlaced, headQuarterName, document,
				number, zodiacSign);

		int size = superAstroDAO.getSuperAstroList().size();
		assertTrue(
				size == 1 && superAstroDAO.getSuperAstroList().get(0).equals(superAstroDAO.getSuperAstroList().get(0)));
	}

	/**
	 * Método de prueba para el método 'delete' en SuperAstroDAO. Verifica si se
	 * elimina correctamente un elemento de la lista de SuperAstro.
	 */
	@Test
	public void cpruebaDelete() {
		System.out.println("Iniciando la prueba de eliminacion");
		int index = 0;
		superAstroDAO.delete(index);
		int size = superAstroDAO.getSuperAstroList().size();
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
