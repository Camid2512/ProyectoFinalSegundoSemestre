package co.edu.unbosque.model;

/**
 * Objeto de transferencia de datos baloto.
 * Esta clase implementa Serializable para permitir la serialización de objetos.
 */
import java.io.Serializable;

/**
 * Objeto de transferencia de datos baloto.
 * Esta clase implementa Serializable para permitir la serialización de objetos.
 */
public class BallotDTO extends BetDTO implements Serializable {

	
	/**
	 * Este es el atributo de la version serial
	 */
	private static final long serialVersionUID = -5504939515313427010L;

	/**
	 * Atributos utilizados
	 */
	private int number;

	/**
	 * Constructor vacío de BallotDTO.
	 */
	public BallotDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de BallotDTO con el número del boleto.
	 */
	public BallotDTO(int number) {
		super();
		this.number = number;
	}

	/**
	 * Constructor de BallotDTO con detalles de la apuesta y el número del boleto.
	 */
	public BallotDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de BallotDTO con detalles de la apuesta, el número del boleto y
	 * el documento asociado.
	 */
	public BallotDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document, int number) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		this.number = number;
	}

	/**
	 * Obtiene el número del boleto.
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Establece el número del boleto.
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Sobrescritura del método toString para mostrar los detalles del boleto.
	 */
	@Override
	public String toString() {
		return "BallotDTO [number=" + number + "]" + super.toString();
	}

}