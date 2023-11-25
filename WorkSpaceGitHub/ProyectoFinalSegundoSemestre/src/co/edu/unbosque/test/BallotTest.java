package co.edu.unbosque.test;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.model.persistence.BallotDAO;

public class BallotTest {

	static int numPrueba = 1;
	private BallotDAO balotoDAO = new BallotDAO();

	@BeforeClass
	public static void antesDeTodas() {
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de BalotoDAO \n");
	}

	@Before
	public void mostrarMensajeEntrePruebas() {
		System.err.println("Empezando la prueba " + numPrueba);
	}

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

	@Test
	public void cpruebaDelete() {
		System.out.println("Iniciando prueba de eliminacion");
		int index = 0;
		balotoDAO.delete(index);
		int size = balotoDAO.getBallotList().size();
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
