package co.edu.unbosque.model;

import java.io.Serializable;

public class HeadquarterDTO implements Serializable {

	private static final long serialVersionUID = -5608596886658828976L;
	/**
	 * 
	 */

	private String venueName;
	private String locationVenue;
	private int employeesNumber;
	private String id;

	public HeadquarterDTO() {
		// TODO Auto-generated constructor stub
	}

	public HeadquarterDTO(String venueName, String locationVenue, int employeesNumber, String id) {
		super();
		this.venueName = venueName;
		this.locationVenue = locationVenue;
		this.employeesNumber = employeesNumber;
		this.id = id;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getLocationVenue() {
		return locationVenue;
	}

	public void setLocationVenue(String locationVenue) {
		this.locationVenue = locationVenue;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "HeadquarterDTO [venueName=" + venueName + ", locationVenue=" + locationVenue + ", employeesNumber="
				+ employeesNumber + ", id=" + id + "]";
	}

}
