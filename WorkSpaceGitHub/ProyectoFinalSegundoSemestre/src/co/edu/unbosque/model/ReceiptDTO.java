/**
 * Objeto de transferencia de recibos. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

/**
 * Objeto de transferencia de juegos. Esta clase implementa Serializable para
 * permitir la serialización de objetos.
 */
public class ReceiptDTO {

	/**
	 * Atributos utilizados
	 */
	private String date, name, document, venueBet, betType;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public ReceiptDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de ReceiptDTO.
	 */
	public ReceiptDTO(String date, String name, String document, String venueBet, String betType) {
		super();
		this.date = date;
		this.name = name;
		this.document = document;
		this.venueBet = venueBet;
		this.betType = betType;
	}

	/**
	 * Obtiene la fecha.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Establece la fecha.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Obtiene el nombre.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Establece el nombre.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtiene el documento.
	 */
	public String getDocument() {
		return document;
	}

	/**
	 * Establece el documento.
	 */
	public void setDocument(String document) {
		this.document = document;
	}

	/**
	 * Obtiene la apuesta del lugar.
	 */
	public String getVenueBet() {
		return venueBet;
	}

	/**
	 * Establece la apuesta del lugar.
	 */
	public void setVenueBet(String venueBet) {
		this.venueBet = venueBet;
	}

	/**
	 * Obtiene el tipo de apuesta.
	 */
	public String getBetType() {
		return betType;
	}

	/**
	 * Establece el tipo de apuesta.
	 */
	public void setBetType(String betType) {
		this.betType = betType;
	}

	/**
	 * Genera una representación en cadena de esta instancia.
	 */
	@Override
	public String toString() {
		return "ReceiptDTO [fecha=" + date + ", name=" + name + ", document=" + document + ", venueBet=" + venueBet
				+ ", betType=" + betType + "]";
	}

}
