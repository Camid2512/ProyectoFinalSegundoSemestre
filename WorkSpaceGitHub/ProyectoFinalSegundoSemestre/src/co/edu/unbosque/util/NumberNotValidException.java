package co.edu.unbosque.util;

public class NumberNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7387645943625430992L;

	public NumberNotValidException() {
		// TODO Auto-generated constructor stub

		super("LOS NUMEROS NO PUEDEN SER NEGATIVOS");

	}

	public NumberNotValidException(String message) {
		// TODO Auto-generated constructor stub

		super(message);

	}

}
