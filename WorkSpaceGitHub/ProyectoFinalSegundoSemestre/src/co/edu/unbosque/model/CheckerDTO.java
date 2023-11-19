/**
 * 
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * 
 * Clase de Cajero que extiende de gerente de sede
 * 
 */
public class CheckerDTO implements Serializable {

	/*
	 * 
	 * Constructor vacio de la clase cajero
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -283480740690058403L;

	private String user;
	private String password;
	private String id;

	public CheckerDTO() {
		// TODO Auto-generated constructor stub
	}

	public CheckerDTO(String user, String password, String id) {
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
		return "CheckerDTO [user=" + user + ", password=" + password + ", id=" + id + "]";
	}

}
