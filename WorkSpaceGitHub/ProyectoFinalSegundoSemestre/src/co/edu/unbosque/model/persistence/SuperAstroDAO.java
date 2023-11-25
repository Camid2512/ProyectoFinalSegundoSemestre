/**
 * Esta clase proporciona funcionalidades CRUD para objetos SuperAstroDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos SuperAstroDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */

package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SuperAstroDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos SuperAstroDTO y
 * gestiona su persistencia. Implementa operaciones para crear, leer, actualizar
 * y eliminar objetos SuperAstroDTO en archivos y utiliza serialización para
 * almacenar y recuperar objetos.
 */
public class SuperAstroDAO implements CRUDOperation {

	private ArrayList<SuperAstroDTO> superAstroList;
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
	 * Constructor de la clase SuperAstroDAO que inicializa la lista de apuestas y
	 * los nombres de archivos. También lee archivos si están disponibles y los
	 * asigna a la lista de apuestas.
	 */
	public SuperAstroDAO() {
		// TODO Auto-generated constructor stub

		superAstroList = new ArrayList<SuperAstroDTO>();
		FILENAME = "apuestas-superastro.dat";
		SERIAL_FILENAME = "apuestas-superastroserialized.dat";

		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<SuperAstroDTO> temp2 = (ArrayList<SuperAstroDTO>) temp;
			superAstroList = temp2;
		} else {
			superAstroList = new ArrayList<SuperAstroDTO>();
		}

	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		SuperAstroDTO superAstro = new SuperAstroDTO();

		superAstro.setDay(Integer.parseInt(attribs[0]));
		superAstro.setMonth(Integer.parseInt(attribs[1]));
		superAstro.setYear(Integer.parseInt(attribs[2]));
		superAstro.setHour(Integer.parseInt(attribs[3]));
		superAstro.setMinute(Integer.parseInt(attribs[4]));
		superAstro.setSecond(Integer.parseInt(attribs[5]));
		superAstro.setBetPlaced(Double.parseDouble(attribs[6]));
		superAstro.setHeadQuarterName(attribs[7]);
		superAstro.setDocument(Long.parseLong(attribs[8]));
		superAstro.setNumber(Integer.parseInt(attribs[9]));
		superAstro.setZodiacSign(attribs[10]);

		superAstroList.add(superAstro);
		writeFile();
		writeSerializable();
	}

	/**
	 * Agrega un objeto de tipo BetDTO a la lista.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		superAstroList.add((SuperAstroDTO) obj);
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
		superAstroList.forEach(superAstro -> {
			sb.append(index + "-->" + (superAstro.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	/**
	 * Actualiza la lista segun su indice con datos nuevos
	 */
	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= superAstroList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				superAstroList.get(index).setDay(Integer.parseInt(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				superAstroList.get(index).setMonth(Integer.parseInt(newData[0]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				superAstroList.get(index).setYear(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				superAstroList.get(index).setBetPlaced(Double.parseDouble(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				superAstroList.get(index).setHeadQuarterName(newData[4]);
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				superAstroList.get(index).setDocument(Long.parseLong(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				superAstroList.get(index).setNumber(Integer.parseInt(newData[6]));
			}
			if (!newData[7].isEmpty() || !newData[7].equals("") || newData[7].length() != 0) {
				superAstroList.get(index).setZodiacSign(newData[7]);
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
		if (index < 0 || index >= superAstroList.size()) {
			return false;
		} else {
			superAstroList.remove(index);
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
		} else if (superAstroList.remove((SuperAstroDTO) obj)) {
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
			int number = Integer.parseInt(cols[9]);
			String zodiacSign = cols[10];

			superAstroList.add(new SuperAstroDTO(day, month, year, hour, minute, second, betPlaced, headQuarterName,
					document, number, zodiacSign));

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
		superAstroList.forEach(superAstro -> {
			content += superAstro.getDay() + ";";
			content += superAstro.getMonth() + ";";
			content += superAstro.getYear() + ";";
			content += superAstro.getHour() + ";";
			content += superAstro.getMinute() + ";";
			content += superAstro.getSecond() + ";";
			content += superAstro.getBetPlaced() + ";";
			content += superAstro.getHeadQuarterName() + ";";
			content += superAstro.getDocument() + ";";
			content += superAstro.getNumber() + ";";
			content += superAstro.getZodiacSign() + ";SUPERAS\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de datos en un archivo serializable.
	 */
	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, superAstroList);
	}

	/**
	 * Obtiene la lista de SuperAstroDTO.
	 */
	public ArrayList<SuperAstroDTO> getSuperAstroList() {
		return superAstroList;
	}

	/**
	 * Establece la lista de SuperAstroDTO.
	 */
	public void setSuperAstroList(ArrayList<SuperAstroDTO> superAstroList) {
		this.superAstroList = superAstroList;
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
