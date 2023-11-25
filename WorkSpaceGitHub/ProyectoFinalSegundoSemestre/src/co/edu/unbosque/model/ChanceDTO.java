package co.edu.unbosque.model;

/**
 * Objeto de transferencia de datos chance. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */

public class ChanceDTO extends BetDTO {

	/**
	 * Objeto de transferencia de datos apuesta. Esta clase implementa Serializable
	 * para permitir la serialización de objetos.
	 */

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = 4255194954611632980L;

	/**
	 * Atributos utilizados
	 */
	private String loteryName;
	private int numbers;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public ChanceDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de ChanceDTO con nombre de lotería y cantidad de números.
	 */
	public ChanceDTO(String loteryName, int numbers) {
		super();
		this.loteryName = loteryName;
		this.numbers = numbers;
	}

	/**
	 * Constructor de ChanceDTO con detalles de la apuesta.
	 */
	public ChanceDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de ChanceDTO con detalles de la apuesta, nombre de lotería y
	 * cantidad de números.
	 */
	public ChanceDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document, String loteryName, int numbers) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		this.loteryName = loteryName;
		this.numbers = numbers;
	}

	/**
	 * Obtiene el nombre de la lotería.
	 */
	public String getLoteryName() {
		return loteryName;
	}

	/**
	 * Establece el nombre de la lotería.
	 */
	public void setLoteryName(String loteryName) {
		this.loteryName = loteryName;
	}

	/**
	 * Obtiene la cantidad de números asociados al boleto de oportunidad.
	 */
	public int getNumbers() {
		return numbers;
	}

	/**
	 * Establece la cantidad de números asociados al boleto de oportunidad.
	 */
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	/**
	 * Genera una representación en cadena de esta instancia.
	 */
	@Override
	public String toString() {
		return "ChanceDTO [loteryName=" + loteryName + ", numbers=" + numbers + "]" + super.toString();
	}

}
