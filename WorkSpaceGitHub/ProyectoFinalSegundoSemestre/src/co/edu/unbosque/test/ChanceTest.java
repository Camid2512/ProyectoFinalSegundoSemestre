/**
 * Clase de pruebas unitarias para validar los métodos de ChanceDAO.

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

import co.edu.unbosque.model.persistence.ChanceDAO;

/**
 * Clase de pruebas unitarias para validar los métodos de ChanceDAO.
 */
public class ChanceTest {

	static int numPrueba = 1;
	private ChanceDAO chanceDAO = new ChanceDAO();

	/**
	 * Método que se ejecuta antes de todas las pruebas unitarias. Imprime un
	 * mensaje de inicio.
	 */
	@BeforeClass
	public static void antesDeTodas() {
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de ChanceDAO \n");
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
	 * Método de prueba para el método 'create' en ChanceDAO. Verifica si se agrega
	 * correctamente un elemento a la lista de chances.
	 */
	@Test
	public void apruebaCreate() {
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
		chanceDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName,
				number);

		int size = chanceDAO.getChanceList().size();
		assertTrue(size == 1 && chanceDAO.getChanceList().get(0).equals(chanceDAO.getChanceList().get(0)));
	}

	/**
	 * Método de prueba para el método 'updateByIndex' en ChanceDAO. Verifica si se
	 * actualiza correctamente un elemento en la lista de chances.
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
		String betPlaced = "100022";
		String headQuarterName = "1";
		String document = "1011093075";
		String loteryName = "LOTERIA DEL VALLE";
		String number = "2224";
		chanceDAO.updateByIndex(index, day, month, year, hour, minute, second, betPlaced, headQuarterName, document,
				loteryName, number);

		int size = chanceDAO.getChanceList().size();
		assertTrue(size == 1 && chanceDAO.getChanceList().get(0).equals(chanceDAO.getChanceList().get(0)));
	}

	/**
	 * Método de prueba para el método 'delete' en ChanceDAO. Verifica si se elimina
	 * correctamente un elemento de la lista de chances.
	 */
	@Test
	public void cpruebaDelete() {
		System.out.println("Iniciando la prueba de eliminacion");
		int index = 0;
		chanceDAO.delete(index);
		int size = chanceDAO.getChanceList().size();
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
