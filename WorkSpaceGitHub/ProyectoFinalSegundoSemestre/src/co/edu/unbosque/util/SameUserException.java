/**
 * Encargada de verificar la existencia de nombres ya creados
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.util;

/**
 * Encargada de verificar la existencia de nombres ya creados
 */
public class SameUserException extends Exception {

	/**
	 * Identificador de serialización para la clase.
	 */
	private static final long serialVersionUID = -6384141409319854834L;

	/**
	 * Constructor vacio de excepcion con mensaje predeterminado
	 */
	public SameUserException() {
		// TODO Auto-generated constructor stub

		super("NOMBRE DE USUARIO YA EXISTE");

	}

	/**
	 * Constructor vacio de excepcion con mensaje
	 */
	public SameUserException(String message) {
		// TODO Auto-generated constructor stub

		super(message);

	}

}
