package co.edu.unbosque.model;

/**
 * Esta es la clase DTO de civil
 * 
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023
 */

public class CivilDTO extends PersonDTO {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static final long serialVersionUID = -5600273393679028497L;
	/**
	 * Este es el atributo de nivel de estudio
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private String studiesLevel;
	/**
	 * Este es el atributo de tiempo de trabajo en el ejercito
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private int timeWorkingInArmy;

	/**
	 * Este es el constructor vacio de la clase Civil DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public CivilDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este es el constructor completo de la clase Civil DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public CivilDTO(String studiesLevel, int timeWorkingInArmy) {
		super();
		this.studiesLevel = studiesLevel;
		this.timeWorkingInArmy = timeWorkingInArmy;
	}

	/**
	 * Este es el constructor que desciende de la super clase de la clase Civil DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public CivilDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este es el constructor que desciende de la super clase y toma los atributos
	 * de la clase Civil DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public CivilDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation, String studiesLevel, int timeWorkingInArmy) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		this.studiesLevel = studiesLevel;
		this.timeWorkingInArmy = timeWorkingInArmy;
	}

	/**
	 * Este es el getter de los niveles de estudio de civil
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public String getStudiesLevel() {
		return studiesLevel;
	}

	/**
	 * Este es el setter de los niveles de estudio de civil
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public void setStudiesLevel(String studiesLevel) {
		this.studiesLevel = studiesLevel;
	}

	/**
	 * Este es el getter de el tiempo de trabajo en el ejercito de civil
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public int getTimeWorkingInArmy() {
		return timeWorkingInArmy;
	}

	/**
	 * Este es el setter de el tiempo de trabajo en el ejercito de civil
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public void setTimeWorkingInArmy(int timeWorkingInArmy) {
		this.timeWorkingInArmy = timeWorkingInArmy;
	}

	/**
	 * Esta es el getter del serializado civil
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Este es el toString autogenerado de civil, imprime los datos de civil mas los
	 * de la super clase
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public String toString() {
		return super.toString() + "CivilDTO [studiesLevel=" + studiesLevel + ", timeWorkingInArmy=" + timeWorkingInArmy
				+ "]";
	}

}
