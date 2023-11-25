
/**
 * Objeto de transferencia de datos sede. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Objeto de transferencia de datos sede. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
public class HeadquarterDTO implements Serializable {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = -5608596886658828976L;

	/**
	 * Atributos utilizados
	 */
	private String venueName;
	private String locationVenue;
	private int employeesNumber;
	private String id;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public HeadquarterDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de HeadquarterDTO.
	 */
	public HeadquarterDTO(String venueName, String locationVenue, int employeesNumber, String id) {
		super();
		this.venueName = venueName;
		this.locationVenue = locationVenue;
		this.employeesNumber = employeesNumber;
		this.id = id;
	}

	/**
	 * Obtiene el nombre de la sede.
	 */
	public String getVenueName() {
		return venueName;
	}

	/**
	 * Establece el nombre de la sede.
	 */
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	/**
	 * Obtiene la ubicación de la sede.
	 */
	public String getLocationVenue() {
		return locationVenue;
	}

	/**
	 * Establece la ubicación de la sede.
	 */
	public void setLocationVenue(String locationVenue) {
		this.locationVenue = locationVenue;
	}

	/**
	 * Obtiene el número de empleados en la sede.
	 */
	public int getEmployeesNumber() {
		return employeesNumber;
	}

	/**
	 * Establece el número de empleados en la sede.
	 */
	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	/**
	 * Obtiene el identificador de la sede.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Establece el identificador de la sede.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtiene el valor del serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Genera una representación en cadena de esta instancia.
	 */
	@Override
	public String toString() {
		return "HeadquarterDTO [venueName=" + venueName + ", locationVenue=" + locationVenue + ", employeesNumber="
				+ employeesNumber + ", id=" + id + "]";
	}

}
