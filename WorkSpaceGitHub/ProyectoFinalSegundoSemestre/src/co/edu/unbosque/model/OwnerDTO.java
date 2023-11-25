package co.edu.unbosque.model;

/**
 * 
 * Clase dueño con datos de registro
 * 
 */

import java.io.Serializable;

/**
 * 
 * Clase dueño con datos de registro
 * 
 * @author Cristhian Diaz & Santiago Rueda
 * @version 1.0
 * @since 28/10/2023
 */

public class OwnerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2327892187158301932L;
	/**
	 * Atributo para usuario del dueño
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * 
	 * @version 1.0
	 * 
	 * @since 28/10/2023
	 */
	private String username;
	/**
	 * Atributo para contraseña del dueño
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * 
	 * @version 1.0
	 * 
	 * @since 28/10/2023
	 */
	private String password;

	/**
	 * 
	 * Constructor vacio de la clase owner
	 * 
	 */
	public OwnerDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Constructor completo de la clase owner
	 * 
	 */
	public OwnerDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * getter de usuario de dueño
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * setter de usuario de dueño
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * getter de contraseña de dueño
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * setter de contraseña de dueño
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * toString de la clase owner
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */
	@Override
	public String toString() {
		return "OwnerDTO [username=" + username + ", password=" + password + "]";
	}

}
