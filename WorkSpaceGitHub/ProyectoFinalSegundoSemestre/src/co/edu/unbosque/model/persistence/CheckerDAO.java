/**
 * Esta clase proporciona funcionalidades CRUD para objetos CheckerDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos CheckerDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CheckerDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos CheckerDTO y
 * gestiona su persistencia. Implementa operaciones para crear, leer, actualizar
 * y eliminar objetos CheckerDTO en archivos y utiliza serialización para
 * almacenar y recuperar objetos.
 */
public class CheckerDAO implements CRUDOperation {

	private ArrayList<CheckerDTO> checkerList;
	/**
	 * Este es el atributo de el nombre de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String FILENAME;
	/**
	 * Este es el atributo de el nombre serial de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String SERIAL_FILENAME;

	/**
	 * Constructor de la clase CheckerDAO que inicializa la lista de apuestas y los
	 * nombres de archivos. También lee archivos si están disponibles y los asigna a
	 * la lista de apuestas.
	 */
	public CheckerDAO() {

		checkerList = new ArrayList<CheckerDTO>();
		FILENAME = "checkerlogin.csv";
		SERIAL_FILENAME = "checkerloginserialized.csv";
		/**
		 * Lee los datos del archivo
		 */
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<CheckerDTO> temp2 = (ArrayList<CheckerDTO>) temp;
			checkerList = temp2;
		} else {
			checkerList = new ArrayList<CheckerDTO>();
		}

		// TODO Auto-generated constructor stub
	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		CheckerDTO checker = new CheckerDTO();

		checker.setUser(attribs[0]);
		checker.setPassword(attribs[1]);
		checker.setId(attribs[2]);

		checkerList.add(checker);
		writeFile();
		writeSerializable();

	}

	/**
	 * Agrega un objeto de tipo BetDTO a la lista.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		checkerList.add((CheckerDTO) obj);
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
		checkerList.forEach(checker -> {
			sb.append(index + "-->" + (checker.toString() + "\n"));
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
		if (index < 0 || index >= checkerList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				checkerList.get(index).setUser(newData[1]);
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				checkerList.get(index).setPassword(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				checkerList.get(index).setId(newData[2]);
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
		if (index < 0 || index >= checkerList.size()) {
			return false;
		} else {
			checkerList.remove(index);
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
		} else if (checkerList.remove((CheckerDTO) obj)) {
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

			checkerList.add(new CheckerDTO(username, password, id));

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
		checkerList.forEach(headquarterManager -> {
			content += headquarterManager.getUser() + ";";
			content += headquarterManager.getPassword() + ";";
			content += headquarterManager.getId() + ";CHECK\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de datos en un archivo serializable.
	 */
	@Override
	public void writeSerializable() {

		// TODO Auto-generated method stub

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, checkerList);

	}

	/**
	 * Devuelve la lista de objetos CheckerDTO.
	 */
	public ArrayList<CheckerDTO> getCheckerList() {
		return checkerList;
	}

	/**
	 * Establece la lista de objetos CheckerDTO.
	 */
	public void setCheckerList(ArrayList<CheckerDTO> checkerList) {
		this.checkerList = checkerList;
	}

	/**
	 * Devuelve el índice actual.
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Establece el índice actual.
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Devuelve el contenido actual.
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
	 * Devuelve el nombre del archivo de datos.
	 */
	public String getFILENAME() {
		return FILENAME;
	}

	/**
	 * Devuelve el nombre del archivo serializado.
	 */
	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}

}
