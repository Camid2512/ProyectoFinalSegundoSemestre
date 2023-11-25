package co.edu.unbosque.model;

/**
 * Objeto de transferencia de datos apuesta.
 * Esta clase implementa Serializable para permitir la serialización de objetos.
 */

import java.io.Serializable;

/**
 * Objeto de transferencia de datos apuesta. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
public class BetDTO implements Serializable {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = -2754106331524816379L;

	/**
	 * Atributos utilizados
	 */
	private int day;
	private int month;
	private int year;
	private int hour;
	private int minute;
	private int second;
	private double betPlaced;
	private String headQuarterName;
	private long document;

	/**
	 * Constructor vacío de BetDTO. Inicializa los atributos con valores
	 * predeterminados.
	 */
	public BetDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de BetDTO con parámetros para inicializar la apuesta.
	 */
	public BetDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.betPlaced = betPlaced;
		this.headQuarterName = headQuarterName;
		this.document = document;
	}

	/**
	 * Obtiene el día de la apuesta.
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Establece el día de la apuesta.
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Obtiene el mes de la apuesta.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Establece el mes de la apuesta.
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Obtiene el año de la apuesta.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Establece el año de la apuesta.
	 *
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Obtiene la hora de la apuesta.
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Establece la hora de la apuesta.
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * Obtiene el minuto de la apuesta.
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * Establece el minuto de la apuesta.
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * Obtiene el segundo de la apuesta.
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * Establece el segundo de la apuesta.
	 */
	public void setSecond(int second) {
		this.second = second;
	}

	/**
	 * Obtiene la cantidad apostada.
	 */
	public double getBetPlaced() {
		return betPlaced;
	}

	/**
	 * Establece la cantidad apostada.
	 */
	public void setBetPlaced(double betPlaced) {
		this.betPlaced = betPlaced;
	}

	/**
	 * Obtiene el nombre de la sede.
	 */
	public String getHeadQuarterName() {
		return headQuarterName;
	}

	/**
	 * Establece el nombre de la sede.
	 */
	public void setHeadQuarterName(String headQuarterName) {
		this.headQuarterName = headQuarterName;
	}

	/**
	 * Obtiene el documento asociado a la apuesta.
	 */
	public long getDocument() {
		return document;
	}

	/**
	 * Establece el documento asociado a la apuesta.
	 */
	public void setDocument(long document) {
		this.document = document;
	}

	/**
	 * Obtiene el valor de serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}