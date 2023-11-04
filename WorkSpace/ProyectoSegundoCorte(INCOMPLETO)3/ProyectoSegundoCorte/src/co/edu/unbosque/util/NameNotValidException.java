package co.edu.unbosque.util;

/**
 * Esta es la clase de excepcion de nombre no valido
 * 
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023
 */

public class NameNotValidException extends Exception {
	
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	private static final long serialVersionUID = -2341252176127444523L;
	
	/**
	 * Esta es la funcion que devuelve mensaje especifico de nombre invalido
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public NameNotValidException() {
		super("Los nombres no son validos");
	}
	/**
	 * Esta es la funcion que devuelve mensaje para cambiar de nombre invalido
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public NameNotValidException(String mensaje) {
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
