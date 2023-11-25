/**
 * Encargada de verificar la validez de las contraseñas
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.util;


/**
 * Encargada de verificar la validez de las contraseñas
 */
public class NotValidPasswordException extends Exception {

	/**
	 * Identificador de serialización para la clase.
	 */
	private static final long serialVersionUID = -7722503494210032280L;

	/**
	 * Constructor vacio de excepcion con mensaje predeterminado
	 */
	public NotValidPasswordException() {
		// TODO Auto-generated constructor stub
		super("CONTRASEÑA NO VALIDA");

	}

	/**
	 * Constructor vacio de excepcion con mensaje
	 */
	public NotValidPasswordException(String message) {
		// TODO Auto-generated constructor stub
		super(message);

	}

}
