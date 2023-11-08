package co.edu.unbosque.model;

import java.io.Serializable;

public class HouseSettingDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1121669860161534193L;
	private String nameBettingHouse;
	private int numberVenue;
	private double totalBudgetAvailable;

	public HouseSettingDTO() {
		// TODO Auto-generated constructor stub
	}

	public HouseSettingDTO(String nameBettingHouse, int numberVenue, double totalBudgetAvailable) {
		super();
		this.nameBettingHouse = nameBettingHouse;
		this.numberVenue = numberVenue;
		this.totalBudgetAvailable = totalBudgetAvailable;
	}

	public String getNameBettingHouse() {
		return nameBettingHouse;
	}

	public void setNameBettingHouse(String nameBettingHouse) {
		this.nameBettingHouse = nameBettingHouse;
	}

	public int getNumberVenue() {
		return numberVenue;
	}

	public void setNumberVenue(int numberVenue) {
		this.numberVenue = numberVenue;
	}

	public double getTotalBudgetAvailable() {
		return totalBudgetAvailable;
	}

	public void setTotalBudgetAvailable(double totalBudgetAvailable) {
		this.totalBudgetAvailable = totalBudgetAvailable;
	}

}
