package co.edu.unbosque.model;

public class ConfigDTO {

	private String nameBettingHouse;
	private int numberLocation;
	private double totalBudgetAllowed;

	public ConfigDTO() {
		// TODO Auto-generated constructor stub
	}

	public ConfigDTO(String nameBettingHouse, int numberLocation, double totalBudgetAllowed) {
		super();
		this.nameBettingHouse = nameBettingHouse;
		this.numberLocation = numberLocation;
		this.totalBudgetAllowed = totalBudgetAllowed;
	}

	public String getNameBettingHouse() {
		return nameBettingHouse;
	}

	public void setNameBettingHouse(String nameBettingHouse) {
		this.nameBettingHouse = nameBettingHouse;
	}

	public int getNumberLocation() {
		return numberLocation;
	}

	public void setNumberLocation(int numberLocation) {
		this.numberLocation = numberLocation;
	}

	public double getTotalBudgetAllowed() {
		return totalBudgetAllowed;
	}

	public void setTotalBudgetAllowed(double totalBudgetAllowed) {
		this.totalBudgetAllowed = totalBudgetAllowed;
	}

	@Override
	public String toString() {
		return "ConfigDTO [nameBettingHouse=" + nameBettingHouse + ", numberLocation=" + numberLocation
				+ ", totalBudgetAllowed=" + totalBudgetAllowed + "]";
	}

}
