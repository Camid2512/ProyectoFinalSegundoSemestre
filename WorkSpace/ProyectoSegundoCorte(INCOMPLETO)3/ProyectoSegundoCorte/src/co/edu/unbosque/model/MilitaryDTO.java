package co.edu.unbosque.model;
/** 
 * Esta es la clase padre DTO Militar
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023*/


public class MilitaryDTO extends PersonDTO {
	/** 
	 * Este es el atributo de la version serial
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private static final long serialVersionUID = -519032929665163478L;

	/** 
	 * Este es el constructor vacio de la clase padre Militar DTO
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	public MilitaryDTO() {
		// TODO Auto-generated constructor stub
	}
	
	/** 
	 * Este es el constructor completo de la clase padre Militar DTO
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/

	public MilitaryDTO(long document, String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation);
		// TODO Auto-generated constructor stub
	}

	/** 
	 * Este es el toString autogenerado de militar, imprime los datos de militar
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	@Override
	public String toString() {
		return super.toString() + "Military []";
	}

}
