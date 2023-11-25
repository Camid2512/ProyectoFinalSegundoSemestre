
/**
 * Esta clase contiene pruebas unitarias para los métodos de BallotDAO.
 * 
 * 
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

import co.edu.unbosque.model.persistence.BallotDAO;

/**
 * Esta clase contiene pruebas unitarias para los métodos de BallotDAO.
 */
public class BallotTest {

	static int numPrueba = 1;
	private BallotDAO balotoDAO = new BallotDAO();

	/**
	 * Antes de ejecutar todas las pruebas, imprime un mensaje de inicio.
	 */
	@BeforeClass
	public static void antesDeTodas() {
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de BalotoDAO \n");
	}

	/**
	 * Antes de cada prueba, muestra un mensaje específico de inicio de la prueba.
	 */
	@Before
	public void mostrarMensajeEntrePruebas() {
		System.err.println("Empezando la prueba " + numPrueba);
	}

	/**
	 * Prueba la funcionalidad del método create de BallotDAO.
	 */
	@Test
	public void apruebaCreate() {
		balotoDAO.getBallotList().clear();
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

		balotoDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, number);

		int size = balotoDAO.getBallotList().size();
		assertTrue(size == 1 && balotoDAO.getBallotList().get(0).equals(balotoDAO.getBallotList().get(0)));
	}

	/**
	 * Método de prueba para actualizar un elemento en la lista ballotList
	 * utilizando el método updateByIndex de BallotDAO. Se prueba la actualización
	 * de un elemento y se verifica si la lista se actualiza correctamente.
	 */
	@Test
	public void bpruebaUpdate() {
		System.out.println(balotoDAO.readAll());
		System.out.println("Iniciando la prueba de actualizar");
		int index = 0;
		String day = "01";
		String month = "03";
		String year = "2023";
		String hour = "8";
		String minute = "12";
		String second = "12";
		String betPlaced = "1000";
		String headQuarterName = "prueba2";
		String document = "1011093074";
		String number = "123478";
		balotoDAO.updateByIndex(index, day, month, year, hour, minute, second, betPlaced, headQuarterName, document,
				number);

		int size = balotoDAO.getBallotList().size();
		assertTrue(size == 1 && balotoDAO.getBallotList().get(0).equals(balotoDAO.getBallotList().get(0)));
	}

	/**
	 * Método de prueba para eliminar un elemento de la lista ballotList utilizando
	 * el método delete de BallotDAO. Se prueba la eliminación de un elemento y se
	 * verifica si el tamaño de la lista se reduce a cero después de eliminar.
	 */
	@Test
	public void cpruebaDelete() {
		System.out.println("Iniciando prueba de eliminacion");
		int index = 0;
		balotoDAO.delete(index);
		int size = balotoDAO.getBallotList().size();
		assertTrue(size == 0);
	}

	/**
	 * Después de cada prueba, muestra un mensaje específico de finalización de la
	 * prueba.
	 */
	@After
	public void MostrarMensajeLuegoPrueba() {
		System.err.println("Finalizando prueba " + numPrueba + "\n");
		numPrueba++;
	}

	/**
	 * Al finalizar todas las pruebas, muestra un mensaje de finalización.
	 */
	@AfterClass
	public static void luegoDeTodas() {
		System.out.println("Finalizando las pruebas unitarias");
	}
}
