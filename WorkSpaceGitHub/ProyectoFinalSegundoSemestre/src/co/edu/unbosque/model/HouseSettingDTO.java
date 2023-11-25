/**
 * Objeto de transferencia de datos de parametros de la casa de apuestas. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Objeto de transferencia de datos de parametros de la casa de apuestas. Esta
 * clase implementa Serializable para permitir la serialización de objetos.
 */
public class HouseSettingDTO implements Serializable {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = -1121669860161534193L;

	/**
	 * Atributos utilizados
	 */
	private String nameBettingHouse;
	private int numberVenue;
	private double totalBudgetAvailable;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public HouseSettingDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de HouseSettingDTO.
	 */
	public HouseSettingDTO(String nameBettingHouse, int numberVenue, double totalBudgetAvailable) {
		super();
		this.nameBettingHouse = nameBettingHouse;
		this.numberVenue = numberVenue;
		this.totalBudgetAvailable = totalBudgetAvailable;
	}

	/**
	 * Obtiene el nombre de la casa de apuestas.
	 */
	public String getNameBettingHouse() {
		return nameBettingHouse;
	}

	/**
	 * Establece el nombre de la casa de apuestas.
	 */
	public void setNameBettingHouse(String nameBettingHouse) {
		this.nameBettingHouse = nameBettingHouse;
	}

	/**
	 * Obtiene el número de la sede.
	 */
	public int getNumberVenue() {
		return numberVenue;
	}

	/**
	 * Establece el número de la sede.
	 */
	public void setNumberVenue(int numberVenue) {
		this.numberVenue = numberVenue;
	}

	/**
	 * Obtiene el presupuesto total disponible.
	 */
	public double getTotalBudgetAvailable() {
		return totalBudgetAvailable;
	}

	/**
	 * Establece el presupuesto total disponible.
	 */
	public void setTotalBudgetAvailable(double totalBudgetAvailable) {
		this.totalBudgetAvailable = totalBudgetAvailable;
	}

}
