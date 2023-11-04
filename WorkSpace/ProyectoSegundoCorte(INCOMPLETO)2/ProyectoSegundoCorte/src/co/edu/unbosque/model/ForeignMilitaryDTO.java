package co.edu.unbosque.model;

public class ForeignMilitaryDTO extends MilitaryDTO {

	private static final long serialVersionUID = -4936584724766651888L;

	private String countryOfOrigin;
	private int timeInOurCountry;

	public ForeignMilitaryDTO() {
		// TODO Auto-generated constructor stub
	}

	public ForeignMilitaryDTO(String countryOfOrigin, int timeInOurCountry) {
		super();
		this.countryOfOrigin = countryOfOrigin;
		this.timeInOurCountry = timeInOurCountry;
	}

	public ForeignMilitaryDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		// TODO Auto-generated constructor stub
	}

	public ForeignMilitaryDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation, String countryOfOrigin, int timeInOurCountry) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		this.countryOfOrigin = countryOfOrigin;
		this.timeInOurCountry = timeInOurCountry;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getTimeInOurCountry() {
		return timeInOurCountry;
	}

	public void setTimeInOurCountry(int timeInOurCountry) {
		this.timeInOurCountry = timeInOurCountry;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return super.toString() + "ForeignMilitaryDTO [countryOfOrigin=" + countryOfOrigin + ", timeInOurCountry="
				+ timeInOurCountry + "]";
	}

}
