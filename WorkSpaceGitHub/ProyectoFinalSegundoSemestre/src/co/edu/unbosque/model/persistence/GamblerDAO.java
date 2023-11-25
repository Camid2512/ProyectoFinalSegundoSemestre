/**
 * Esta clase proporciona funcionalidades CRUD para objetos GamblerDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos GamblerDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.GamblerDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos GamblerDTO y
 * gestiona su persistencia. Implementa operaciones para crear, leer, actualizar
 * y eliminar objetos GamblerDTO en archivos y utiliza serialización para
 * almacenar y recuperar objetos.
 */
public class GamblerDAO implements CRUDOperation {

	private ArrayList<GamblerDTO> gamblerList;

	/**
	 * Este es el atributo de el nombre de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String FILENAME = "apostadores.dat";

	/**
	 * Este es el atributo de el nombre serial de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String SERIAL_FILENAME = "apostadoresserialized.dat";

	/**
	 * Constructor de la clase GamblerDAO que inicializa la lista de apuestas y los
	 * nombres de archivos. También lee archivos si están disponibles y los asigna a
	 * la lista de apuestas.
	 */
	public GamblerDAO() {
		// TODO Auto-generated constructor stub

		gamblerList = new ArrayList<GamblerDTO>();
		/**
		 * Lee los datos del archivo
		 */
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<GamblerDTO> temp2 = (ArrayList<GamblerDTO>) temp;
			gamblerList = temp2;
		} else {
			gamblerList = new ArrayList<GamblerDTO>();
		}
	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		GamblerDTO gambler = new GamblerDTO();

		gambler.setFullName(attribs[0]);
		gambler.setDocumentId(Long.parseLong(attribs[1]));
		gambler.setGamingVenue(attribs[2]);
		gambler.setAddres(attribs[3]);
		gambler.setPhoneNumber(Long.parseLong(attribs[4]));

		gamblerList.add(gambler);

		writeFile();
		writeSerializable();

	}

	/**
	 * Agrega un objeto de tipo BetDTO a la lista.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

		gamblerList.add((GamblerDTO) obj);
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
		gamblerList.forEach(gambler -> {
			sb.append(index + "-->" + (gambler.toString() + "\n"));
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
		if (index < 0 || index >= gamblerList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				gamblerList.get(index).setFullName(newData[0]);
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				gamblerList.get(index).setDocumentId(Long.parseLong(newData[1]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				gamblerList.get(index).setGamingVenue(newData[2]);
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				gamblerList.get(index).setAddres(newData[3]);
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				gamblerList.get(index).setPhoneNumber(Long.parseLong(newData[4]));
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
		if (index < 0 || index >= gamblerList.size()) {
			return false;
		} else {
			gamblerList.remove(index);
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
		} else if (gamblerList.remove((GamblerDTO) obj)) {
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
			String fullName = cols[0];
			long document = Long.parseLong(cols[1]);
			String gamingVenue = cols[2];
			String addres = cols[3];
			Long phoneNumber = Long.parseLong(cols[4]);

			gamblerList.add(new GamblerDTO(fullName, document, gamingVenue, addres, phoneNumber));

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
		gamblerList.forEach(gambler -> {
			content += gambler.getFullName() + ";";
			content += gambler.getDocumentId() + ";";
			content += gambler.getGamingVenue() + ";";
			content += gambler.getAddres() + ";";
			content += gambler.getPhoneNumber() + ";\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de datos en un archivo serializable.
	 */
	@Override
	public void writeSerializable() {

		// TODO Auto-generated method stub

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, gamblerList);

	}

	/**
	 * Devuelve la lista de jugadores.
	 */
	public ArrayList<GamblerDTO> getGamblerList() {
		return gamblerList;
	}

	/**
	 * Establece la lista de jugadores.
	 */
	public void setGamblerList(ArrayList<GamblerDTO> gamblerList) {
		this.gamblerList = gamblerList;
	}

	/**
	 * Devuelve el nombre de archivo.
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

	/**
	 * Devuelve el índice.
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
	 * Devuelve el contenido.
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

}
