/**
 * Encargada de verificar la validez de los numeros
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.util;

/**
 * Encargada de verificar la validez de los numeros
 */
public class NumberNotValidException extends Exception {

	/**
	 * Identificador de serialización para la clase.
	 */
	private static final long serialVersionUID = 7387645943625430992L;

	/**
	 * Constructor vacio de excepcion con mensaje predeterminado
	 */
	public NumberNotValidException() {
		// TODO Auto-generated constructor stub

		super("LOS NUMEROS NO PUEDEN SER NEGATIVOS");

	}

	/**
	 * Constructor vacio de excepcion con mensaje
	 */
	public NumberNotValidException(String message) {
		// TODO Auto-generated constructor stub

		super(message);

	}

}
