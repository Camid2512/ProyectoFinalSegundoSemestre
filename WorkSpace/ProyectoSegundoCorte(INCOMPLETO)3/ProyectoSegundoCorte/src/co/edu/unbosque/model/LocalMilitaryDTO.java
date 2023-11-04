package co.edu.unbosque.model;

/**
 * Esta es la clase DTO de Militar Local
 * 
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023
 */

public class LocalMilitaryDTO extends MilitaryDTO {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static final long serialVersionUID = 3871099592303864508L;
	/**
	 * Este es el atributo de rango
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	private String rank;
	/**
	 * Este es el atributo de tiempo de servicio
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private int serviceTime;

	/**
	 * Este es el constructor vacio de la clase Militar local DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public LocalMilitaryDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este es el constructor completo de la clase Militar local DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public LocalMilitaryDTO(String rank, int serviceTime) {
		super();
		this.rank = rank;
		this.serviceTime = serviceTime;
	}

	/**
	 * Este es el constructor que desciende de la super clase de la clase Militar
	 * local DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public LocalMilitaryDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este es el constructor que desciende de la super clase y toma los atributos
	 * de la clase Militar local DTO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public LocalMilitaryDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation, String rank, int serviceTime) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		this.rank = rank;
		this.serviceTime = serviceTime;
	}

	/**
	 * Este es el getter de el rango de militar local
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * Este es el setter de el rango de militar local
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * Este es el getter de el tiempo de servicio de militar local
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public int getServiceTime() {
		return serviceTime;
	}

	/**
	 * Este es el getter de el tiempo de servicio de militar local
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	/**
	 * Este es el getter de el serializado de militar local
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Este es el toString autogenerado de militar local, imprime los datos de
	 * militar local mas los de la super clase
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	@Override
	public String toString() {
		return super.toString() + "LocalMilitary [rank=" + rank + ", serviceTime=" + serviceTime + "]";
	}

}
