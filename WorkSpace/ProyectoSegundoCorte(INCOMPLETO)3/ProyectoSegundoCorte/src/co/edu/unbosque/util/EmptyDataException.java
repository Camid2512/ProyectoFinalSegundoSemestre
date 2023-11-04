package co.edu.unbosque.util;

/**
 * Esta es la clase de excepcion de datos vacios
 * 
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023
 */

public class EmptyDataException extends Exception {
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	private static final long serialVersionUID = -457852048289649104L;

	/**
	 * Esta es la funcion que devuelve mensaje especifico de informacion vacia
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public EmptyDataException() {

		super("Los datos no estan completos");

	}

	/**
	 * Esta es la funcion que devuelve mensaje para cambiar de informacion vacia
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public EmptyDataException(String mensaje) {

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
