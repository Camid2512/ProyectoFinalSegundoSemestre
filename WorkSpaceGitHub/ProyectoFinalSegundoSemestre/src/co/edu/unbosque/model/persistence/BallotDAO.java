/**
 * Esta clase proporciona funcionalidades CRUD para objetos BallotDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos BallotDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */

package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.BallotDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos BallotDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos BallotDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 */
public class BallotDAO implements CRUDOperation {

	private ArrayList<BallotDTO> ballotList;
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
	 * Constructor de la clase BallotDAO que inicializa la lista de apuestas y los
	 * nombres de archivos. También lee archivos si están disponibles y los asigna a
	 * la lista de apuestas.
	 */
	public BallotDAO() {
		/**
		 * Inicializa la lista de apuestas
		 */
		ballotList = new ArrayList<BallotDTO>();

		/**
		 * Nombres de archivos para guardar y leer datos
		 */
		FILENAME = "apuestas-baloto.dat";
		SERIAL_FILENAME = "apuestas-balotoserialized.dat";

		/**
		 * Lee los datos del archivo
		 * 
		 */
		readFromFile();

		/**
		 * Verifica si hay datos serializados disponibles y los carga en la lista de
		 * apuestas
		 * 
		 */
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<BallotDTO> temp2 = (ArrayList<BallotDTO>) temp;
			ballotList = temp2;
		} else {
			/**
			 * Si no hay datos serializados, crea una nueva lista de apuestas
			 * 
			 */
			ballotList = new ArrayList<BallotDTO>();
		}
	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 * Estos atributos incluyen día, mes, año, hora, minuto, segundo, apuesta
	 * realizada, nombre de la sede, documento y número.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		BallotDTO ballot = new BallotDTO();

		/**
		 * Establece los atributos de la apuesta
		 */
		ballot.setDay(Integer.parseInt(attribs[0]));
		ballot.setMonth(Integer.parseInt(attribs[1]));
		ballot.setYear(Integer.parseInt(attribs[2]));
		ballot.setHour(Integer.parseInt(attribs[3]));
		ballot.setMinute(Integer.parseInt(attribs[4]));
		ballot.setSecond(Integer.parseInt(attribs[5]));
		ballot.setBetPlaced(Double.parseDouble(attribs[6]));
		ballot.setHeadQuarterName(attribs[7]);
		ballot.setDocument(Long.parseLong(attribs[8]));
		ballot.setNumber(Integer.parseInt(attribs[9]));

		/**
		 * Agrega la apuesta a la lista y actualiza los archivos
		 */
		ballotList.add(ballot);
		writeFile();
		writeSerializable();
	}

	/**
	 * Agrega un objeto de tipo BallotDTO a la lista de apuestas.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		ballotList.add((BallotDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	/**
	 * Recupera todas las apuestas registradas en la lista.
	 */
	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		index = 0;
		StringBuilder sb = new StringBuilder();
		ballotList.forEach(ballot -> {
			sb.append(index + "-->" + (ballot.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	/**
	 * Actualiza una apuesta en la lista según su índice con nuevos datos
	 * proporcionados.
	 */
	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= ballotList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				ballotList.get(index).setDay(Integer.parseInt(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				ballotList.get(index).setMonth(Integer.parseInt(newData[0]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				ballotList.get(index).setYear(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				ballotList.get(index).setBetPlaced(Double.parseDouble(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				ballotList.get(index).setHeadQuarterName(newData[4]);
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				ballotList.get(index).setDocument(Long.parseLong(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				ballotList.get(index).setNumber(Integer.parseInt(newData[6]));
			}

			writeFile();
			writeSerializable();
			return true;
		}
	}

	/**
	 * Elimina una apuesta de la lista según su índice.
	 */
	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= ballotList.size()) {
			return false;
		} else {
			ballotList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	/**
	 * Elimina una apuesta de la lista según el objeto proporcionado.
	 */
	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		} else if (ballotList.remove((BallotDTO) obj)) {
			writeFile();
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Lee y carga la información de las apuestas desde un archivo de texto. Lee el
	 * contenido del archivo de texto especificado. Si el archivo está vacío, no
	 * realiza ninguna operación. Si el archivo contiene datos, los procesa línea
	 * por línea y crea objetos BallotDTO con la información de cada línea para
	 * agregarlos a la lista de apuestas.
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

			ballotList.add(new BallotDTO(day, month, year, hour, minute, second, betPlaced, headQuarterName, document,
					number));

		}
	}

	String content = "";

	/**
	 * Escribe la información de las apuestas en un archivo de texto. Genera un
	 * String con la información de cada apuesta en la lista `ballotList`.
	 */
	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

		content = "";
		ballotList.forEach(ballot -> {
			content += ballot.getDay() + ";";
			content += ballot.getMonth() + ";";
			content += ballot.getYear() + ";";
			content += ballot.getHour() + ";";
			content += ballot.getMinute() + ";";
			content += ballot.getSecond() + ";";
			content += ballot.getBetPlaced() + ";";
			content += ballot.getHeadQuarterName() + ";";
			content += ballot.getDocument() + ";";
			content += ballot.getNumber() + ";BALL\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de apuestas en un archivo serializable. Utiliza la clase
	 * FileHandler para serializar la lista `ballotList` y la guarda en un archivo
	 * con el nombre SERIAL_FILENAME.
	 */
	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, ballotList);
	}

	/**
	 * Devuelve la lista de apuestas.
	 */
	public ArrayList<BallotDTO> getBallotList() {
		return ballotList;
	}

	/**
	 * Establece la lista de apuestas.
	 */
	public void setBallotList(ArrayList<BallotDTO> ballotList) {
		this.ballotList = ballotList;
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
	 * Establece el contenido
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
