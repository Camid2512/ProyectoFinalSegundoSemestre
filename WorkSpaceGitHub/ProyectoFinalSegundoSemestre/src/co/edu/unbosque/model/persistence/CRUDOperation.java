package co.edu.unbosque.model.persistence;

/**
 * Esta es la clase CRUDOperation, es la clase que se extendera a las otras
 * clases secundarias
 * 
 * @author Cristhian Diaz & Santiago Rueda
 * @version 1.0
 * @since 28/10/2023
 */

public interface CRUDOperation {

	/**
	 * Esta es la funcion de crear por atributo
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public void create(String... attribs);

	/**
	 * Esta es la funcion de crear por objeto
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public void create(Object obj);

	/**
	 * Esta es la funcion de leer todo
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public String readAll();

	/**
	 * Esta es la funcion de actualizar por index
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public boolean updateByIndex(int index, String... newData);

	/**
	 * Esta es la funcion de eliminar por index
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public boolean delete(int index);

	/**
	 * Esta es la funcion de eliminar por objeto
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public boolean delete(Object obj);

	/**
	 * Esta es la funcion de leer el archivo
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public void readFromFile();

	/**
	 * Esta es la funcion de sobreescribir el archivo
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public void writeFile();

	/**
	 * Esta es la funcion de sobreescribir el serializado de el archivo
	 * 
	 * @author Cristhian Diaz & Santiago Rueda
	 * @version 1.0
	 * @since 28/10/2023
	 */

	public void writeSerializable();

}
