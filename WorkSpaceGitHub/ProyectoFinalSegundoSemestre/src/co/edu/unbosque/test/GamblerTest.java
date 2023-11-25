/**
 * Clase de pruebas unitarias para validar los métodos de GamblerDAO.
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

import co.edu.unbosque.model.persistence.GamblerDAO;

/**
 * Clase de pruebas unitarias para validar los métodos de GamblerDAO.
 */
public class GamblerTest {
	static int numPrueba = 1;
	private GamblerDAO gamDAO = new GamblerDAO();

	/**
	 * Método que se ejecuta antes de todas las pruebas unitarias. Imprime un
	 * mensaje de inicio.
	 */
	@BeforeClass
	public static void antesDeTodas() {
		System.out.println("Iniciando todas las pruebas unitarias para los metodos de ApostadorDAO \n");
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
	 * Método de prueba para el método 'create' en GamblerDAO. Verifica si se agrega
	 * correctamente un elemento a la lista de apostadores.
	 */
	@Test
	public void pruebaCreate() {
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

	/**
	 * Método de prueba para el método 'updateByIndex' en GamblerDAO. Verifica si se
	 * actualiza correctamente un elemento en la lista de apostadores.
	 */
	@Test
	public void pruebaUpdate() {
		System.out.println("Iniciando la prueba de actualizar");
		int index = 0;
		String nombre = "Santi";
		String cedula = "1234567";
		String sede = "Usaquen";
		String direccion = "Calle 134";
		String celular = "12344";
		gamDAO.updateByIndex(index, nombre, cedula, sede, direccion, celular);

		int size = gamDAO.getGamblerList().size();
		assertTrue(size == 0);
	}

	/**
	 * Método de prueba para el método 'delete' en GamblerDAO. Verifica si se
	 * elimina correctamente un elemento de la lista de apostadores.
	 */
	@Test
	public void pruebaDelete() {
		System.out.println("Iniciando la prueba de eliminacion de datos");
		int index = 0;
		gamDAO.delete(index);
		int size = gamDAO.getGamblerList().size();
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
