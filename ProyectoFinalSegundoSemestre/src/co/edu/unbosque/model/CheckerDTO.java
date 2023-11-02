/**
 * 
 */
package co.edu.unbosque.model;

/**
 * 
 * Clase de Cajero que extiende de gerente de sede
 * 
 */
public class CheckerDTO extends HeadquarterManagerDTO {

	/*
	 * 
	 * Constructor vacio de la clase cajero
	 * 
	 */

	public CheckerDTO() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * super constructor de la clase cajero
	 * 
	 */
	public CheckerDTO(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * toString de la clase cajero
	 * 
	 */
	@Override
	public String toString() {
		return "CheckerDTO []" + super.toString();
	}

}
