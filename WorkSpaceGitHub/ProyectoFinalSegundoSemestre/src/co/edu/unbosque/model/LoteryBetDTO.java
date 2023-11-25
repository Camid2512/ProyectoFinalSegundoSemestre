/**
 * Objeto de transferencia de datos loteria. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

/**
 * Objeto de transferencia de datos loteria. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
public class LoteryBetDTO extends BetDTO {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = -670184573400479029L;

	/**
	 * Atributos utilizados
	 */
	private String loteryName;
	private int numbers;
	private int serialNum;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public LoteryBetDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de LoteryBetDTO.
	 */
	public LoteryBetDTO(String loteryName, int numbers, int serialNum) {
		super();
		this.loteryName = loteryName;
		this.numbers = numbers;
		this.serialNum = serialNum;
	}

	/**
	 * Constructor de LoteryBetDTO con detalles de la apuesta.
	 */
	public LoteryBetDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de LoteryBetDTO con detalles de la apuesta y la lotería.
	 */
	public LoteryBetDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document, String loteryName, int numbers, int serialNum) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		this.loteryName = loteryName;
		this.numbers = numbers;
		this.serialNum = serialNum;
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
	 * Obtiene los números apostados.
	 */
	public int getNumbers() {
		return numbers;
	}

	/**
	 * Establece los números apostados.
	 */
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	/**
	 * Obtiene el número de serie.
	 */
	public int getSerialNum() {
		return serialNum;
	}

	/**
	 * Establece el número de serie.
	 */
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	/**
	 * Genera una representación en cadena de esta instancia.
	 */
	@Override
	public String toString() {
		return "LoteryBetDTO [loteryName=" + loteryName + ", numbers=" + numbers + ", serialNum=" + serialNum + "]"
				+ super.toString();
	}

}
