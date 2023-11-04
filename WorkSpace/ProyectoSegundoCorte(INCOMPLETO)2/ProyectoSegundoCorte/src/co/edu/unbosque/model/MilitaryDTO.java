package co.edu.unbosque.model;

public class MilitaryDTO extends PersonDTO {

	private static final long serialVersionUID = -519032929665163478L;

	public MilitaryDTO() {
		// TODO Auto-generated constructor stub
	}

	public MilitaryDTO(long document, String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "Military []";
	}

}
