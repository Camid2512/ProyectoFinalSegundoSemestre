/**
 * 
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase de gerente de sede que extiende de dueño
 */
public class HeadquarterManagerDTO implements Serializable {
	/*
	 * 
	 * Constructor vacio de la clase gerente de sede
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 6385667339937525680L;

	private String user;
	private String password;

	private String id;

	public HeadquarterManagerDTO() {
		// TODO Auto-generated constructor stub
	}

	public HeadquarterManagerDTO(String user, String password, String id) {
		super();
		this.user = user;
		this.password = password;
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "HeadquarterManagerDTO [user=" + user + ", password=" + password + ", id=" + id + "]";
	}

}