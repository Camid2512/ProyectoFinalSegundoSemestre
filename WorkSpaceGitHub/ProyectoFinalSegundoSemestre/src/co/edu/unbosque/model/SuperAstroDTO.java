/**
 * Objeto de transferencia de datos superastro. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

/**
 * Objeto de transferencia de datos superastro. Esta clase implementa
 * Serializable para permitir la serialización de objetos.
 */
public class SuperAstroDTO extends BetDTO {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = 8782928204611148874L;

	/**
	 * Atributos utilizados
	 */
	private int number;
	private String zodiacSign;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public SuperAstroDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de SuperAstroDTO.
	 */
	public SuperAstroDTO(int number, String zodiacSign) {
		super();
		this.number = number;
		this.zodiacSign = zodiacSign;
	}

	/**
	 * Constructor de SuperAstroDTO con detalles de la apuesta.
	 */
	public SuperAstroDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de SuperAstroDTO con detalles de la apuesta y número de Super
	 * Astro.
	 */
	public SuperAstroDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document, int number, String zodiacSign) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		this.number = number;
		this.zodiacSign = zodiacSign;
	}

	/**
	 * Obtiene el número.
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Establece el número.
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Obtiene el signo del zodíaco.
	 */
	public String getZodiacSign() {
		return zodiacSign;
	}

	/**
	 * Establece el signo del zodíaco.
	 */
	public void setZodiacSign(String zodiacSign) {
		this.zodiacSign = zodiacSign;
	}

	/**
	 * Genera una representación en cadena de esta instancia.
	 */
	@Override
	public String toString() {
		return "SuperAstroDTO [number=" + number + ", zodiacSign=" + zodiacSign + "]" + super.toString();
	}

}
