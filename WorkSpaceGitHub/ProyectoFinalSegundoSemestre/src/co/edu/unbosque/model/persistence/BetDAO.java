/**
 * Esta clase proporciona funcionalidades CRUD para objetos BetDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos BetDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */

package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.BetDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos BetDTO y gestiona su
 * persistencia. Implementa operaciones para crear, leer, actualizar y eliminar
 * objetos BetDTO en archivos y utiliza serialización para almacenar y recuperar
 * objetos.
 */
public class BetDAO implements CRUDOperation {

	private ArrayList<BetDTO> betList;
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
	 * Constructor de la clase BetDAO que inicializa la lista de apuestas y los
	 * nombres de archivos. También lee archivos si están disponibles y los asigna a
	 * la lista de apuestas.
	 */
	public BetDAO() {
		// TODO Auto-generated constructor stub

		betList = new ArrayList<BetDTO>();
		FILENAME = "bet.csv";
		SERIAL_FILENAME = "betserializable.csv";
		/**
		 * Lee los datos del archivo
		 */
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<BetDTO> temp2 = (ArrayList<BetDTO>) temp;
			betList = temp2;
		} else {
			betList = new ArrayList<BetDTO>();
		}

	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub
		BetDTO bet = new BetDTO();

		bet.setDay(Integer.parseInt(attribs[0]));
		bet.setMonth(Integer.parseInt(attribs[1]));
		bet.setYear(Integer.parseInt(attribs[2]));
		bet.setHour(Integer.parseInt(attribs[3]));
		bet.setMinute(Integer.parseInt(attribs[4]));
		bet.setSecond(Integer.parseInt(attribs[5]));
		bet.setBetPlaced(Double.parseDouble(attribs[6]));
		bet.setHeadQuarterName(attribs[7]);
		bet.setDocument(Long.parseLong(attribs[8]));
		betList.add(bet);
		writeFile();
		writeSerializable();
	}

	/**
	 * Agrega un objeto de tipo BetDTO a la lista.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		betList.add((BetDTO) obj);
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
		betList.forEach(bet -> {
			sb.append(index + "-->" + (bet.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	/**
	 * Actualiza la lista segun su indice con datos nuevos
	 */
	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= betList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				betList.get(index).setDay(Integer.parseInt(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				betList.get(index).setMonth(Integer.parseInt(newData[0]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				betList.get(index).setYear(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				betList.get(index).setBetPlaced(Double.parseDouble(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				betList.get(index).setHeadQuarterName(newData[4]);
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				betList.get(index).setDocument(Long.parseLong(newData[5]));
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
		if (index < 0 || index >= betList.size()) {
			return false;
		} else {
			betList.remove(index);
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
		} else if (betList.remove((BetDTO) obj)) {
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

			int day = Integer.parseInt(cols[0]);
			int month = Integer.parseInt(cols[1]);
			int year = Integer.parseInt(cols[2]);
			int hour = Integer.parseInt(cols[3]);
			int minute = Integer.parseInt(cols[4]);
			int second = Integer.parseInt(cols[5]);
			double betPlaced = Double.parseDouble(cols[6]);
			String headQuarterName = cols[7];
			long document = Long.parseLong(cols[8]);

			betList.add(new BetDTO(day, month, year, hour, minute, second, betPlaced, headQuarterName, document));

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
		betList.forEach(bet -> {
			content += bet.getDay() + ";";
			content += bet.getMonth() + ";";
			content += bet.getYear() + ";";
			content += bet.getHour() + ";";
			content += bet.getMinute() + ";";
			content += bet.getSecond() + ";";
			content += bet.getBetPlaced() + ";";
			content += bet.getHeadQuarterName() + ";";
			content += bet.getDocument() + ";BET\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de datos en un archivo serializable.
	 */
	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, betList);
	}

	/**
	 * Devuelve la lista de apuestas.
	 */
	public ArrayList<BetDTO> getBetList() {
		return betList;
	}

	/**
	 * Establece la lista de apuestas.
	 */
	public void setBetList(ArrayList<BetDTO> betList) {
		this.betList = betList;
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