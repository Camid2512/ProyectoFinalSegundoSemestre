/**
  * Esta clase proporciona funcionalidades CRUD para objetos ChanceDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos ChanceDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */

package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ChanceDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos ChanceDTO y gestiona
 * su persistencia. Implementa operaciones para crear, leer, actualizar y
 * eliminar objetos ChanceDTO en archivos y utiliza serialización para almacenar
 * y recuperar objetos.
 */
public class ChanceDAO implements CRUDOperation {

	private ArrayList<ChanceDTO> chanceList;
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
	 * Constructor de la clase ChanceDAO que inicializa la lista de apuestas y los
	 * nombres de archivos. También lee archivos si están disponibles y los asigna a
	 * la lista de apuestas.
	 */
	public ChanceDAO() {
		// TODO Auto-generated constructor stub

		chanceList = new ArrayList<ChanceDTO>();
		FILENAME = "apuestas-chance.dat";
		SERIAL_FILENAME = "apuestas-chanceserializable.dat";
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<ChanceDTO> temp2 = (ArrayList<ChanceDTO>) temp;
			chanceList = temp2;
		} else {
			chanceList = new ArrayList<ChanceDTO>();
		}

	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub
		ChanceDTO cha = new ChanceDTO();

		cha.setDay(Integer.parseInt(attribs[0]));
		cha.setMonth(Integer.parseInt(attribs[1]));
		cha.setYear(Integer.parseInt(attribs[2]));
		cha.setHour(Integer.parseInt(attribs[3]));
		cha.setMinute(Integer.parseInt(attribs[4]));
		cha.setSecond(Integer.parseInt(attribs[5]));
		cha.setBetPlaced(Double.parseDouble(attribs[6]));
		cha.setHeadQuarterName(attribs[7]);
		cha.setDocument(Long.parseLong(attribs[8]));
		cha.setLoteryName(attribs[9]);
		cha.setNumbers(Integer.parseInt(attribs[10]));

		chanceList.add(cha);
		writeFile();
		writeSerializable();
	}

	/**
	 * Agrega un objeto de tipo BetDTO a la lista.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		chanceList.add((ChanceDTO) obj);
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
		chanceList.forEach(bet -> {
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
		if (index < 0 || index >= chanceList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				chanceList.get(index).setDay(Integer.parseInt(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				chanceList.get(index).setMonth(Integer.parseInt(newData[0]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				chanceList.get(index).setYear(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				chanceList.get(index).setBetPlaced(Double.parseDouble(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				chanceList.get(index).setHeadQuarterName(newData[4]);
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				chanceList.get(index).setDocument(Long.parseLong(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				chanceList.get(index).setLoteryName(newData[6]);
			}
			if (!newData[7].isEmpty() || !newData[7].equals("") || newData[7].length() != 0) {
				chanceList.get(index).setNumbers(Integer.parseInt(newData[7]));
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
		if (index < 0 || index >= chanceList.size()) {
			return false;
		} else {
			chanceList.remove(index);
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
		} else if (chanceList.remove((ChanceDTO) obj)) {
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
			String loteryName = cols[9];
			int numbers = Integer.parseInt(cols[10]);

			chanceList.add(new ChanceDTO(day, month, year, hour, minute, second, betPlaced, headQuarterName, document,
					loteryName, numbers));

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
		chanceList.forEach(bet -> {
			content += bet.getDay() + ";";
			content += bet.getMonth() + ";";
			content += bet.getYear() + ";";
			content += bet.getHour() + ";";
			content += bet.getMinute() + ";";
			content += bet.getSecond() + ";";
			content += bet.getBetPlaced() + ";";
			content += bet.getHeadQuarterName() + ";";
			content += bet.getDocument() + ";";
			content += bet.getLoteryName() + ";";
			content += bet.getNumbers() + ";CHANCE\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de datos en un archivo serializable.
	 */
	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, chanceList);
	}

	/**
	 * Devuelve la lista de oportunidades de tipo Chance.
	 */
	public ArrayList<ChanceDTO> getChanceList() {
		return chanceList;
	}

	/**
	 * Establece la lista de oportunidades de tipo Chance.
	 */
	public void setChanceList(ArrayList<ChanceDTO> chanceList) {
		this.chanceList = chanceList;
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