/**
 * Clase de gerente de sede que extiende de dueño
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase de gerente de sede que extiende de dueño
 */
public class HeadquarterManagerDTO implements Serializable {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = 6385667339937525680L;

	/**
	 * Atributos utilizados
	 */
	private String user;
	private String password;
	private String id;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public HeadquarterManagerDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de HeadquarterManagerDTO.
	 */
	public HeadquarterManagerDTO(String user, String password, String id) {
		super();
		this.user = user;
		this.password = password;
		this.id = id;
	}

	/**
	 * Obtiene el nombre de usuario del administrador.
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Establece el nombre de usuario del administrador.
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * Obtiene la contraseña del administrador.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Establece la contraseña del administrador.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Obtiene el identificador del administrador.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Establece el identificador del administrador.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtiene el valor del serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Genera una representación en cadena de esta instancia.
	 */
	@Override
	public String toString() {
		return "HeadquarterManagerDTO [user=" + user + ", password=" + password + ", id=" + id + "]";
	}

}