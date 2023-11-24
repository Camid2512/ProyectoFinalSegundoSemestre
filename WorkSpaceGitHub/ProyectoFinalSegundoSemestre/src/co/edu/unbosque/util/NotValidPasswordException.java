package co.edu.unbosque.util;

public class NotValidPasswordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7722503494210032280L;

	public NotValidPasswordException() {
		// TODO Auto-generated constructor stub
		super("CONTRASEÑA NO VALIDA");

	}

	public NotValidPasswordException(String message) {
		// TODO Auto-generated constructor stub
		super(message);

	}

}
