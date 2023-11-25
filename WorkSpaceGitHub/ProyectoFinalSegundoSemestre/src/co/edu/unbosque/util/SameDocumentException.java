/**
 * Encargada de verificar la existencia de documentos ya creados
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.util;


/**
 * Encargada de verificar la existencia de documentos ya creados
 */
public class SameDocumentException extends Exception {

	/**
	 * Identificador de serialización para la clase.
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
