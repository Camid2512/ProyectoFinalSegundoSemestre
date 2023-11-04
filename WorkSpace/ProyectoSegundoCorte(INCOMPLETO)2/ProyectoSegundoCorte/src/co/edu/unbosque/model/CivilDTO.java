package co.edu.unbosque.model;

public class CivilDTO extends PersonDTO {

	private static final long serialVersionUID = -5600273393679028497L;

	private String studiesLevel;
	private int timeWorkingInArmy;

	public CivilDTO() {
		// TODO Auto-generated constructor stub
	}

	public CivilDTO(String studiesLevel, int timeWorkingInArmy) {
		super();
		this.studiesLevel = studiesLevel;
		this.timeWorkingInArmy = timeWorkingInArmy;
	}

	public CivilDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		// TODO Auto-generated constructor stub
	}

	public CivilDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation, String studiesLevel, int timeWorkingInArmy) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		this.studiesLevel = studiesLevel;
		this.timeWorkingInArmy = timeWorkingInArmy;
	}

	public String getStudiesLevel() {
		return studiesLevel;
	}

	public void setStudiesLevel(String studiesLevel) {
		this.studiesLevel = studiesLevel;
	}

	public int getTimeWorkingInArmy() {
		return timeWorkingInArmy;
	}

	public void setTimeWorkingInArmy(int timeWorkingInArmy) {
		this.timeWorkingInArmy = timeWorkingInArmy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return super.toString() + "CivilDTO [studiesLevel=" + studiesLevel + ", timeWorkingInArmy=" + timeWorkingInArmy
				+ "]";
	}

}
