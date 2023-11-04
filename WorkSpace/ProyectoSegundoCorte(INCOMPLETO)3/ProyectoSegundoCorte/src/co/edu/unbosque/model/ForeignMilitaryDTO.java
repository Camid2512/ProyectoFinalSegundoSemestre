package co.edu.unbosque.model;

/**
 * Esta es la clase DTO de Militar extranjero
 * 
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023
 */

public class ForeignMilitaryDTO extends MilitaryDTO {
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static final long serialVersionUID = -4936584724766651888L;
	/**
	 * Este es el atributo del pais de origen
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private String countryOfOrigin;
	/**
	 * Este es el atributo del tiempo en nuestro pais
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private int timeInOurCountry;

	/**
	 * Este es el constructor vacio de la clase Militar extranjero DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public ForeignMilitaryDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este es el constructor completo de la clase Militar extranjero DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public ForeignMilitaryDTO(String countryOfOrigin, int timeInOurCountry) {
		super();
		this.countryOfOrigin = countryOfOrigin;
		this.timeInOurCountry = timeInOurCountry;
	}

	/**
	 * Este es el constructor que desciende de la super clase de la clase Militar
	 * extranjero DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public ForeignMilitaryDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este es el constructor que desciende de la super clase y toma los atributos
	 * de la clase Militar extranjero DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public ForeignMilitaryDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation, String countryOfOrigin, int timeInOurCountry) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		this.countryOfOrigin = countryOfOrigin;
		this.timeInOurCountry = timeInOurCountry;
	}

	/**
	 * Este es el getter de el pais de origen de militar extranjero
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * Este es el setter de el pais de origen de militar extranjero
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	/**
	 * Este es el getter de el tiempo de residencia en nuestro pais de militar
	 * extranjero
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public int getTimeInOurCountry() {
		return timeInOurCountry;
	}

	/**
	 * Este es el setter de el tiempo de residencia en nuestro pais de militar
	 * extranjero
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public void setTimeInOurCountry(int timeInOurCountry) {
		this.timeInOurCountry = timeInOurCountry;
	}

	/**
	 * Este es el getter del serializado de militar extranjero
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Este es el toString autogenerado de militar extrangero, imprime los datos de
	 * militar extranjero mas los de la super clase
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	@Override
	public String toString() {
		return super.toString() + "ForeignMilitaryDTO [countryOfOrigin=" + countryOfOrigin + ", timeInOurCountry="
				+ timeInOurCountry + "]";
	}

}
