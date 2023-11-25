/**
 * Objeto de transferencia de datos jugador. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Objeto de transferencia de datos jugador. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
public class GamblerDTO implements Serializable {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = -7972015745358472339L;

	/**
	 * Atributos utilizados
	 */
	private String fullName;
	private long documentId;
	private String gamingVenue;
	private String addres;
	private long phoneNumber;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public GamblerDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de GamblerDTO con datos personales del apostador.
	 */
	public GamblerDTO(String fullName, long documentId, String gamingVenue, String addres, long phoneNumber) {
		super();
		this.fullName = fullName;
		this.documentId = documentId;
		this.gamingVenue = gamingVenue;
		this.addres = addres;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Obtiene el nombre completo del apostador.
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Establece el nombre completo del apostador.
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Obtiene la identificación del apostador.
	 */
	public long getDocumentId() {
		return documentId;
	}

	/**
	 * Establece la identificación del apostador.
	 */
	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	/**
	 * Obtiene el lugar de juego del apostador.
	 */
	public String getGamingVenue() {
		return gamingVenue;
	}

	/**
	 * Establece el lugar de juego del apostador.
	 */
	public void setGamingVenue(String gamingVenue) {
		this.gamingVenue = gamingVenue;
	}

	/**
	 * Obtiene la dirección del apostador.
	 */
	public String getAddres() {
		return addres;
	}

	/**
	 * Establece la dirección del apostador.
	 */
	public void setAddres(String addres) {
		this.addres = addres;
	}

	/**
	 * Obtiene el número de teléfono del apostador.
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Establece el número de teléfono del apostador.
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Genera una representación en cadena de esta instancia.
	 */
	@Override
	public String toString() {
		return "GamblerDTO [fullName=" + fullName + ", documentId=" + documentId + ", gamingVenue=" + gamingVenue
				+ ", addres=" + addres + ", phoneNumber=" + phoneNumber + "]";
	}

}
