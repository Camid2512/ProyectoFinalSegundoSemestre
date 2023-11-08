package co.edu.unbosque.model;

import java.io.Serializable;

public class HeadquarterDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7926887290023177109L;
	private String location;
	private int employeesNumber;

	public HeadquarterDTO() {
		// TODO Auto-generated constructor stub
	}

	public HeadquarterDTO(String location, int employeesNumber) {
		super();
		this.location = location;
		this.employeesNumber = employeesNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public String toString() {
		return "HeadquarterDTO [location=" + location + ", employeesNumber=" + employeesNumber + "]";
	}

}
