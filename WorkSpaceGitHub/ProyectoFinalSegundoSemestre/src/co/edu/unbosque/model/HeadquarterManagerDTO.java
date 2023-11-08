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

	/**
	 * 
	 */
	private static final long serialVersionUID = 6385667339937525680L;
	private String headquerterName;

	public HeadquarterManagerDTO() {
		// TODO Auto-generated constructor stub
	}

	public HeadquarterManagerDTO(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	public HeadquarterManagerDTO(String nombreSede) {
		super();
		this.headquerterName = nombreSede;
	}

	public HeadquarterManagerDTO(String username, String password, String nombreSede) {
		super(username, password);
		this.headquerterName = nombreSede;
	}

	public String getNombreSede() {
		return headquerterName;
	}

	public void setNombreSede(String nombreSede) {
		this.headquerterName = nombreSede;
	}

	@Override
	public String toString() {
		return "HeadquarterManagerDTO [nombreSede=" + headquerterName + "]" + super.toString();
	}

}