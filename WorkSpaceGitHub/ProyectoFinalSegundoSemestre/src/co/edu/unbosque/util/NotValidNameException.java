package co.edu.unbosque.util;

public class NotValidNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 803116559801740615L;

	public NotValidNameException() {
		// TODO Auto-generated constructor stub
		super("NOMBRE NO VALIDO");
	}

	public NotValidNameException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
