package co.edu.unbosque.util;

public class NumberNotValidException extends Exception {

	/**
	 * 
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
