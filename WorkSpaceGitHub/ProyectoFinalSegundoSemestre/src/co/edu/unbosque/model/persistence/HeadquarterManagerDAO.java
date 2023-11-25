/**
 * Esta clase proporciona funcionalidades CRUD para objetos HeadquarterManagerDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos HeadquarterManagerDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.HeadquarterManagerDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos
 * HeadquarterManagerDTO y gestiona su persistencia. Implementa operaciones para
 * crear, leer, actualizar y eliminar objetos HeadquarterManagerDTO en archivos
 * y utiliza serialización para almacenar y recuperar objetos.
 */
public class HeadquarterManagerDAO implements CRUDOperation {

	private ArrayList<HeadquarterManagerDTO> headquarterManagerList;
	/**
	 * Este es el atributo de el nombre de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String FILENAME = "managerlogin.csv";
	/**
	 * Este es el atributo de el nombre serial de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String SERIAL_FILENAME = "managerloginserialized.csv";

	/**
	 * Constructor de la clase HeadquarterManagerDAO que inicializa la lista de
	 * apuestas y los nombres de archivos. También lee archivos si están disponibles
	 * y los asigna a la lista de apuestas.
	 */
	public HeadquarterManagerDAO() {

		headquarterManagerList = new ArrayList<HeadquarterManagerDTO>();

		/**
		 * Lee los datos del archivo
		 */
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<HeadquarterManagerDTO> temp2 = (ArrayList<HeadquarterManagerDTO>) temp;
			headquarterManagerList = temp2;
		} else {
			headquarterManagerList = new ArrayList<HeadquarterManagerDTO>();
		}

		// TODO Auto-generated constructor stub
	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		HeadquarterManagerDTO manager = new HeadquarterManagerDTO();

		manager.setUser(attribs[0]);
		manager.setPassword(attribs[1]);
		manager.setId(attribs[2]);

		headquarterManagerList.add(manager);
		writeFile();
		writeSerializable();

	}

	/**
	 * Agrega un objeto de tipo BetDTO a la lista.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		headquarterManagerList.add((HeadquarterManagerDTO) obj);
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
		headquarterManagerList.forEach(manager -> {
			sb.append(index + "-->" + (manager.toString() + "\n"));
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
		if (index < 0 || index >= headquarterManagerList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				headquarterManagerList.get(index).setUser(newData[0]);
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				headquarterManagerList.get(index).setPassword(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				headquarterManagerList.get(index).setId(newData[2]);
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
		if (index < 0 || index >= headquarterManagerList.size()) {
			return false;
		} else {
			headquarterManagerList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	/**
	 * Elimina un dato de la lista según el objeto seleccionado
	 */
	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		} else if (headquarterManagerList.remove((HeadquarterManagerDTO) obj)) {
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
			String id = cols[2];

			headquarterManagerList.add(new HeadquarterManagerDTO(username, password, id));

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
		headquarterManagerList.forEach(headquarterManager -> {
			content += headquarterManager.getUser() + ";";
			content += headquarterManager.getPassword() + ";";
			content += headquarterManager.getId() + ";MAN\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de datos en un archivo serializable.
	 */
	@Override
	public void writeSerializable() {

		// TODO Auto-generated method stub

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, headquarterManagerList);

	}

	/**
	 * Obtiene la lista de gerentes de sedes.
	 */
	public ArrayList<HeadquarterManagerDTO> getHeadquarterManagerList() {
		return headquarterManagerList;
	}

	/**
	 * Establece la lista de gerentes de sedes.
	 */
	public void setHeadquarterManagerList(ArrayList<HeadquarterManagerDTO> headquarterManagerList) {
		this.headquarterManagerList = headquarterManagerList;
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
