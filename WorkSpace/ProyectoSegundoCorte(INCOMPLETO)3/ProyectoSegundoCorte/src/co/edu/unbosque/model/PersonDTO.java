package co.edu.unbosque.model;

/** 
 * Esta es la clase abuelo DTO de Persona
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023*/
import java.io.Serializable;

public class PersonDTO implements Serializable {

	/** 
	 * Este es el atributo de la version serial
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private static final long serialVersionUID = 2103772809532417936L;
	/** 
	 * Este es el atributo de el documento
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private long document;
	/** 
	 * Este es el atributo de el nombre
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private String name;
	/** 
	 * Este es el atributo de el dia de nacimiento
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private int dayOfBirth;
	/** 
	 * Este es el atributo de el mes de nacimiento
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private int monthOfBirth;
	/** 
	 * Este es el atributo de el año de nacimiento
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private int yearOfBirth;
	/** 
	 * Este es el atributo de la edad
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private int age;
	/** 
	 * Este es el atributo de la ubicacion de foto
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/
	private String photoLocation;

	/**
	 * Este es el constructor vacio de la clase abuelo persona DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este es el constructor completo de la clase abuelo persona DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public PersonDTO(long document, String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super();
		this.document = document;
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.age = age;
		this.photoLocation = photoLocation;
	}

	/**
	 * Este es el getter de documento de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public long getDocument() {
		return document;
	}

	/**
	 * Este es el setter de documento de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setDocument(long document) {
		this.document = document;
	}

	/**
	 * Este es el getter de nombre de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getName() {
		return name;
	}

	/**
	 * Este es el setter de nombre de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Este es el getter del dia de nacimiento de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	/**
	 * Este es el setter del dia de nacimiento de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	/**
	 * Este es el getter del mes de nacimiento de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	/**
	 * Este es el setter del mes de nacimiento de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	/**
	 * Este es el getter del año de nacimiento de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	/**
	 * Este es el setter del año de nacimiento de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	/**
	 * Este es el getter de edad de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Este es el setter de edad de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Este es el getter de la ubicacion de la foto de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getPhotoLocation() {
		return photoLocation;
	}

	/**
	 * Este es el setter de la ubicacion de la foto de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public void setPhotoLocation(String photoLocation) {
		this.photoLocation = photoLocation;
	}

	/**
	 * Este es el getter de el serializado de la clase abuelo persona
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/** 
	 * Este es el toString autogenerado de la clase abuelo persona
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023*/

	@Override
	public String toString() {
		return "Person [document=" + document + ", name=" + name + ", dayOfBirth=" + dayOfBirth + ", montOfBirth="
				+ monthOfBirth + ", yearOfBirth=" + yearOfBirth + ", age=" + age + ", photoLocation=" + photoLocation
				+ "]";
	}

}
