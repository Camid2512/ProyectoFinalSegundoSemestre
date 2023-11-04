package co.edu.unbosque.util;

/**
 * Esta es la clase de excepcion de numero no valido
 * 
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023
 */
public class NumberNotValidException extends Exception {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static final long serialVersionUID = -7730475532035294989L;

	/**
	 * Esta es la funcion que devuelve mensaje especifico de numero invalido
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public NumberNotValidException() {

		super("El numero no tiene un formato valido");
		// TODO Auto-generated constructor stub
	}

	/**
	 * Esta es la funcion que devuelve mensaje para cambiar de numero invalido
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public NumberNotValidException(String message) {
		super(message);
	}

	/**
	 * Este es el getter de el serializado de el serializado
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
