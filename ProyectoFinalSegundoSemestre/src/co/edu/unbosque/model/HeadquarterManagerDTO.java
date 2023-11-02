/**
 * 
 */
package co.edu.unbosque.model;

/**
 * Clase de gerente de sede que extiende de dueño
 */
public class HeadquarterManagerDTO extends OwnerDTO {
	/*
	 * 
	 * Constructor vacio de la clase gerente de sede
	 * 
	 */
	public HeadquarterManagerDTO() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * Super Constructor de la clase gerente de sede
	 * 
	 */
	public HeadquarterManagerDTO(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * toString de la clase gerente de sede
	 * 
	 */
	@Override
	public String toString() {
		return "HeadquarterManagerDTO []" + super.toString();
	}

}
