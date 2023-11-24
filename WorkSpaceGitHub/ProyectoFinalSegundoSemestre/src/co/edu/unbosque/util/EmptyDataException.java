package co.edu.unbosque.util;

public class EmptyDataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4358355654793907189L;

	/**
	 * Constructor vacio de excepcion con mensaje predeterminado
	 */
	public EmptyDataException() {
		// TODO Auto-generated constructor stub
		super("NO PUEDEN HABER DATOS VACIOS");

	}

	/**
	 * Constructor vacio de excepcion con mensaje
	 */
	public EmptyDataException(String message) {
		// TODO Auto-generated constructor stub
		super(message);

	}

}
