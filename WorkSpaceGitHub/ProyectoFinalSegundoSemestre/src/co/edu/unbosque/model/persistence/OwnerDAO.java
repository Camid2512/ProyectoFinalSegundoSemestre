/**
 * Esta clase proporciona funcionalidades CRUD para objetos OwnerDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos OwnerDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.OwnerDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos OwnerDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos OwnerDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 */
public class OwnerDAO implements CRUDOperation {

	private ArrayList<OwnerDTO> ownerList;
	/**
	 * Este es el atributo de el nombre de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String FILENAME = "ownerlogin.csv";
	/**
	 * Este es el atributo de el nombre serial de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String SERIAL_FILENAME = "ownerloginserialized.csv";

	
	/**
	 * Constructor de la clase OwnerDAO que inicializa la lista de apuestas y los
	 * nombres de archivos. También lee archivos si están disponibles y los asigna a
	 * la lista de apuestas.
	 */
	public OwnerDAO() {

		ownerList = new ArrayList<OwnerDTO>();
		/**
		 * Lee los datos del archivo
		 */
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<OwnerDTO> temp2 = (ArrayList<OwnerDTO>) temp;
			ownerList = temp2;
		} else {
			ownerList = new ArrayList<OwnerDTO>();
		}

		// TODO Auto-generated constructor stub
	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		OwnerDTO owner = new OwnerDTO();

		owner.setUsername(attribs[0]);
		owner.setPassword(attribs[1]);

		ownerList.add(owner);
		writeFile();
		writeSerializable();

	}

	/**
	 * Agrega un objeto de tipo BetDTO a la lista.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		ownerList.add((OwnerDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	/**
	 * Recupera todas las datos registrados en la lista.
	 */
	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		index = 0;
		StringBuilder sb = new StringBuilder();
		ownerList.forEach(owner -> {
			sb.append(index + "-->" + (owner.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	/**
	 * Actualiza la lista segun su indice con datos nuevos
	 */
	@Override
	public boolean updateByIndex(int index, String... newData) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= ownerList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				ownerList.get(index).setUsername(newData[1]);
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				ownerList.get(index).setPassword(newData[1]);
			}
			writeFile();
			writeSerializable();
			return true;
		}
	}
	
	/**
	 * Elimina un dato de la lista segun su indice.
	 */
	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= ownerList.size()) {
			return false;
		} else {
			ownerList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	/**
	 * Elimina undato de la lista según el objeto seleccionado
	 */
	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		} else if (ownerList.remove((OwnerDTO) obj)) {
			writeFile();
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Lee y carga la informacion de la lista desde un archivo de texto, si el
	 * archivo está vacio no realiza ninguna opercacion
	 */
	@Override
	public void readFromFile() {
		// TODO Auto-generated method stub
		String content = FileHandler.openAndReadFile(FILENAME);
		if (content.isEmpty()) {
			return;
		}
		String[] lines = content.split("\n");
		for (int i = 0; i < lines.length; i++) {
			String[] cols = lines[i].split(";");
			String username = cols[0];
			String password = cols[1];

			ownerList.add(new OwnerDTO(username, password));

		}
	}

	String content = "";

	/**
	 * Escribe la información en un archivo de texto
	 */
	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

		content = "";
		ownerList.forEach(owner -> {
			content += owner.getUsername() + ";";
			content += owner.getPassword() + ";\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de datos en un archivo serializable.
	 */
	@Override
	public void writeSerializable() {

		// TODO Auto-generated method stub

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, ownerList);

	}

	/**
	 * Obtiene la lista de propietarios.
	 */
	public ArrayList<OwnerDTO> getOwnerList() {
	    return ownerList;
	}

	/**
	 * Establece la lista de propietarios.
	 */
	public void setOwnerList(ArrayList<OwnerDTO> ownerList) {
	    this.ownerList = ownerList;
	}

	/**
	 * Obtiene el índice.
	 */
	public int getIndex() {
	    return index;
	}

	/**
	 * Establece el índice.
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Obtiene el contenido.
	 */
	public String getContent() {
	    return content;
	}

	/**
	 * Establece el contenido.
	 */
	public void setContent(String content) {
	    this.content = content;
	}

	/**
	 * Obtiene el nombre del archivo.
	 */
	public String getFILENAME() {
	    return FILENAME;
	}

	/**
	 * Obtiene el nombre del archivo serializado.
	 */
	public String getSERIAL_FILENAME() {
	    return SERIAL_FILENAME;
	}

}
