/**
 * Objeto de transferencia de datos. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Objeto de transferencia de datos. Esta clase implementa Serializable para
 * permitir la serialización de objetos.
 */
public class CheckerDTO implements Serializable {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = -283480740690058403L;

	/**
	 * Atributos utilizados
	 */
	private String user;
	private String password;
	private String id;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public CheckerDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de CheckerDTO con nombre de usuario, contraseña y ID.
	 */
	public CheckerDTO(String user, String password, String id) {
		super();
		this.user = user;
		this.password = password;
		this.id = id;
	}

	/**
	 * Obtiene el nombre de usuario.
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Establece el nombre de usuario.
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * Obtiene la contraseña del usuario.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Establece la contraseña del usuario.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Obtiene el identificador del verificador.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Establece el identificador del verificador.
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
		return "CheckerDTO [user=" + user + ", password=" + password + ", id=" + id + "]";
	}

}
