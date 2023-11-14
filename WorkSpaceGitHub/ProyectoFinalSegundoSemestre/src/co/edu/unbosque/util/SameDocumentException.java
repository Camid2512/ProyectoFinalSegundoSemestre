package co.edu.unbosque.util;

public class SameDocumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1682480689042693847L;

	public SameDocumentException() {
		// TODO Auto-generated constructor stub

		super("DOCUMENTO YA REGISTRADO");

	}

	public SameDocumentException(String mensaje) {
		// TODO Auto-generated constructor stub

		super(mensaje);

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
