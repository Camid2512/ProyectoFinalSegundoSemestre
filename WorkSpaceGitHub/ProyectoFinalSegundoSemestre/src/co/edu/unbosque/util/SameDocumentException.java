package co.edu.unbosque.util;

public class SameDocumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1682480689042693847L;

	/**
	 * Constructor vacio de excepcion con mensaje predeterminado
	 */
	public SameDocumentException() {
		// TODO Auto-generated constructor stub

		super("DOCUMENTO YA REGISTRADO");

	}

	/**
	 * Constructor vacio de excepcion con mensaje
	 */
	public SameDocumentException(String mensaje) {
		// TODO Auto-generated constructor stub

		super(mensaje);

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
