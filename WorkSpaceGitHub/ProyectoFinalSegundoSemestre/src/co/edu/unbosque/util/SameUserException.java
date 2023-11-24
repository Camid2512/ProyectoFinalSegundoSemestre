package co.edu.unbosque.util;

public class SameUserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6384141409319854834L;

	public SameUserException() {
		// TODO Auto-generated constructor stub

		super("NOMBRE DE USUARIO YA EXISTE");

	}

	public SameUserException(String message) {
		// TODO Auto-generated constructor stub

		super(message);

	}

}
