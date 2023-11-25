package co.edu.unbosque.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.unbosque.model.persistence.BetPlayDAO;

public class BetPlayTest {

	static int numPrueba = 1;
	static BetPlayDAO betPlayDAO = new BetPlayDAO();

	@BeforeClass
	public static void antesDeTodas() {
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de BetPlayDAO \n");
	}

	@Before
	public void mostrarMensajeEntrePruebas() {
		System.err.println("Empezando la prueba " + numPrueba);
	}

	@Test
	public void apruebaCreate() {
		betPlayDAO.getBetPlayList().clear();
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
		String match1 = "0";
		String match2 = "0";
		String match3 = "0";
		String match4 = "0";
		String match5 = "0";
		String match6 = "0";
		String match7 = "0";
		String match8 = "0";
		String match9 = "0";
		String match10 = "0";
		String match11 = "0";
		String match12 = "0";
		String match13 = "0";
		String match14 = "0";

		betPlayDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, match1, match2,
				match3, match4, match5, match6, match7, match8, match9, match10, match11, match12, match13, match14);

		int size = betPlayDAO.getBetPlayList().size();
		assertTrue(size == 1 && betPlayDAO.getBetPlayList().get(0).equals(betPlayDAO.getBetPlayList().get(0)));
	}

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
		String betPlaced = "10000";
		String headQuarterName = "1";
		String document = "1011093074";
		String match1 = "1";
		String match2 = "0";
		String match3 = "0";
		String match4 = "0";
		String match5 = "0";
		String match6 = "1";
		String match7 = "0";
		String match8 = "0";
		String match9 = "0";
		String match10 = "0";
		String match11 = "0";
		String match12 = "1";
		String match13 = "0";
		String match14 = "1";
		betPlayDAO.updateByIndex(index, day, month, year, hour, minute, second, betPlaced, headQuarterName, document, match1, match2,
				match3, match4, match5, match6, match7, match8, match9, match10, match11, match12, match13, match14);

		int size = betPlayDAO.getBetPlayList().size();
		assertTrue(size == 1 && betPlayDAO.getBetPlayList().get(0).equals(betPlayDAO.getBetPlayList().get(0)));
	}

	@Test
	public void cpruebaDelete() {
		System.out.println("Iniciando la prueba de eliminacion");
		int index = 0;
		betPlayDAO.delete(index);
		int size = betPlayDAO.getBetPlayList().size();
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
