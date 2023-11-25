/**
 * Encargada de verificar que el nombre ingresado sea válido
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.util;


/**
 * Encargada de verificar que el nombre ingresado sea válido
 */
public class NotValidNameException extends Exception {

	/**
	 * Identificador de serialización para la clase.
	 */
	private static final long serialVersionUID = 803116559801740615L;

	/**
	 * Constructor vacio de excepcion con mensaje predeterminado
	 */
	public NotValidNameException() {
		// TODO Auto-generated constructor stub
		super("NOMBRE NO VALIDO");
	}

	/**
	 * Constructor vacio de excepcion con mensaje 
	 */
	public NotValidNameException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
