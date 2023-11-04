package co.edu.unbosque.util;

/**
 * Esta es la clase de excepcion de numero negativo
 * 
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023
 */

public class NegativeNumberException extends Exception {
	
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	private static final long serialVersionUID = -8725332570790906245L;
	
	/**
	 * Esta es la funcion que devuelve mensaje especifico de numero negativo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public NegativeNumberException() {

		super("No se puede ingresar un numero negativo");

	}
	
	/**
	 * Esta es la funcion que devuelve mensaje para cambiar de numero negativo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public NegativeNumberException(String mensaje) {

		super(mensaje);

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
