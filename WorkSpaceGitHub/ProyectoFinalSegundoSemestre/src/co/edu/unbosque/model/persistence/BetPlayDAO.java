/**
 * Esta clase proporciona funcionalidades CRUD para objetos BetPlayDTO y gestiona su persistencia.
 * Implementa operaciones para crear, leer, actualizar y eliminar objetos BetPlayDTO en archivos y utiliza 
 * serialización para almacenar y recuperar objetos.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import co.edu.unbosque.model.BetPlayDTO;

/**
 * Esta clase proporciona funcionalidades CRUD para objetos BetPlayDTO y
 * gestiona su persistencia. Implementa operaciones para crear, leer, actualizar
 * y eliminar objetos BetPlayDTO en archivos y utiliza serialización para
 * almacenar y recuperar objetos.
 */
public class BetPlayDAO implements CRUDOperation {

	private ArrayList<BetPlayDTO> betPlayList;
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
	 * Constructor de la clase BetPlayDAO que inicializa la lista de apuestas y los
	 * nombres de archivos. También lee archivos si están disponibles y los asigna a
	 * la lista de apuestas.
	 */
	public BetPlayDAO() {
		// TODO Auto-generated constructor stub

		betPlayList = new ArrayList<BetPlayDTO>();
		FILENAME = "apuestas-betplay.dat";
		SERIAL_FILENAME = "apuestas-betplayserializable.dat";
		/**
		 * Lee los datos del archivo
		 */
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<BetPlayDTO> temp2 = (ArrayList<BetPlayDTO>) temp;
			betPlayList = temp2;
		} else {
			betPlayList = new ArrayList<BetPlayDTO>();
		}

	}

	/**
	 * Crea una nueva entrada de apuesta a partir de los atributos proporcionados.
	 */
	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub
		BetPlayDTO bet = new BetPlayDTO();

		bet.setDay(Integer.parseInt(attribs[0]));
		bet.setMonth(Integer.parseInt(attribs[1]));
		bet.setYear(Integer.parseInt(attribs[2]));
		bet.setHour(Integer.parseInt(attribs[3]));
		bet.setMinute(Integer.parseInt(attribs[4]));
		bet.setSecond(Integer.parseInt(attribs[5]));
		bet.setBetPlaced(Double.parseDouble(attribs[6]));
		bet.setHeadQuarterName(attribs[7]);
		bet.setDocument(Long.parseLong(attribs[8]));
		bet.setMatch1(Integer.parseInt(attribs[9]));
		bet.setMatch2(Integer.parseInt(attribs[10]));
		bet.setMatch3(Integer.parseInt(attribs[11]));
		bet.setMatch4(Integer.parseInt(attribs[12]));
		bet.setMatch5(Integer.parseInt(attribs[13]));
		bet.setMatch6(Integer.parseInt(attribs[14]));
		bet.setMatch7(Integer.parseInt(attribs[15]));
		bet.setMatch8(Integer.parseInt(attribs[16]));
		bet.setMatch9(Integer.parseInt(attribs[17]));
		bet.setMatch10(Integer.parseInt(attribs[18]));
		bet.setMatch11(Integer.parseInt(attribs[19]));
		bet.setMatch12(Integer.parseInt(attribs[20]));
		bet.setMatch13(Integer.parseInt(attribs[21]));
		bet.setMatch14(Integer.parseInt(attribs[22]));

		betPlayList.add(bet);
		writeFile();
		writeSerializable();
		createListMatches();
	}

	/**
	 * Agrega un objeto de tipo BetPlayDTO a la lista.
	 */
	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		betPlayList.add((BetPlayDTO) obj);
		writeFile();
		writeSerializable();
		createListMatches();
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
		betPlayList.forEach(bet -> {
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
		if (index < 0 || index >= betPlayList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				betPlayList.get(index).setDay(Integer.parseInt(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				betPlayList.get(index).setMonth(Integer.parseInt(newData[0]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				betPlayList.get(index).setYear(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				betPlayList.get(index).setBetPlaced(Double.parseDouble(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				betPlayList.get(index).setHeadQuarterName(newData[4]);
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				betPlayList.get(index).setDocument(Long.parseLong(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				betPlayList.get(index).setMatch1(Integer.parseInt(newData[6]));
			}
			if (!newData[7].isEmpty() || !newData[7].equals("") || newData[7].length() != 0) {
				betPlayList.get(index).setMatch2(Integer.parseInt(newData[7]));
			}
			if (!newData[8].isEmpty() || !newData[8].equals("") || newData[8].length() != 0) {
				betPlayList.get(index).setMatch3(Integer.parseInt(newData[8]));
			}
			if (!newData[9].isEmpty() || !newData[9].equals("") || newData[9].length() != 0) {
				betPlayList.get(index).setMatch4(Integer.parseInt(newData[9]));
			}
			if (!newData[10].isEmpty() || !newData[10].equals("") || newData[10].length() != 0) {
				betPlayList.get(index).setMatch5(Integer.parseInt(newData[10]));
			}
			if (!newData[11].isEmpty() || !newData[11].equals("") || newData[11].length() != 0) {
				betPlayList.get(index).setMatch6(Integer.parseInt(newData[11]));
			}
			if (!newData[12].isEmpty() || !newData[12].equals("") || newData[12].length() != 0) {
				betPlayList.get(index).setMatch7(Integer.parseInt(newData[12]));
			}
			if (!newData[13].isEmpty() || !newData[13].equals("") || newData[13].length() != 0) {
				betPlayList.get(index).setMatch8(Integer.parseInt(newData[13]));
			}
			if (!newData[14].isEmpty() || !newData[14].equals("") || newData[14].length() != 0) {
				betPlayList.get(index).setMatch9(Integer.parseInt(newData[14]));
			}
			if (!newData[15].isEmpty() || !newData[15].equals("") || newData[15].length() != 0) {
				betPlayList.get(index).setMatch10(Integer.parseInt(newData[15]));
			}
			if (!newData[16].isEmpty() || !newData[16].equals("") || newData[16].length() != 0) {
				betPlayList.get(index).setMatch11(Integer.parseInt(newData[16]));
			}
			if (!newData[17].isEmpty() || !newData[17].equals("") || newData[17].length() != 0) {
				betPlayList.get(index).setMatch12(Integer.parseInt(newData[17]));
			}
			if (!newData[18].isEmpty() || !newData[18].equals("") || newData[18].length() != 0) {
				betPlayList.get(index).setMatch13(Integer.parseInt(newData[18]));
			}
			if (!newData[19].isEmpty() || !newData[19].equals("") || newData[19].length() != 0) {
				betPlayList.get(index).setMatch14(Integer.parseInt(newData[19]));
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
		if (index < 0 || index >= betPlayList.size()) {
			return false;
		} else {
			betPlayList.remove(index);
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
		} else if (betPlayList.remove((BetPlayDTO) obj)) {
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
			int match1 = Integer.parseInt(cols[9]);
			int match2 = Integer.parseInt(cols[10]);
			int match3 = Integer.parseInt(cols[11]);
			int match4 = Integer.parseInt(cols[12]);
			int match5 = Integer.parseInt(cols[13]);
			int match6 = Integer.parseInt(cols[14]);
			int match7 = Integer.parseInt(cols[15]);
			int match8 = Integer.parseInt(cols[16]);
			int match9 = Integer.parseInt(cols[17]);
			int match10 = Integer.parseInt(cols[18]);
			int match11 = Integer.parseInt(cols[19]);
			int match12 = Integer.parseInt(cols[20]);
			int match13 = Integer.parseInt(cols[21]);
			int match14 = Integer.parseInt(cols[22]);

			betPlayList.add(new BetPlayDTO(day, month, year, hour, minute, second, betPlaced, headQuarterName, document,
					match1, match2, match3, match4, match5, match6, match7, match8, match9, match10, match11, match12,
					match13, match14));
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
		betPlayList.forEach(bet -> {
			content += bet.getDay() + ";";
			content += bet.getMonth() + ";";
			content += bet.getYear() + ";";
			content += bet.getHour() + ";";
			content += bet.getMinute() + ";";
			content += bet.getSecond() + ";";
			content += bet.getBetPlaced() + ";";
			content += bet.getHeadQuarterName() + ";";
			content += bet.getDocument() + ";";
			content += bet.getMatch1() + ";";
			content += bet.getMatch2() + ";";
			content += bet.getMatch3() + ";";
			content += bet.getMatch4() + ";";
			content += bet.getMatch5() + ";";
			content += bet.getMatch6() + ";";
			content += bet.getMatch7() + ";";
			content += bet.getMatch8() + ";";
			content += bet.getMatch9() + ";";
			content += bet.getMatch10() + ";";
			content += bet.getMatch11() + ";";
			content += bet.getMatch12() + ";";
			content += bet.getMatch13() + ";";
			content += bet.getMatch14() + ";BETPLAY\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	/**
	 * Escribe la lista de datos en un archivo serializable.
	 */
	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, betPlayList);
	}

	/**
	 * Crea la lista de partidos
	 */
	public void createListMatches() {
		File myFile;
		PrintWriter fileWriter;
		myFile = new File("src/co/edu/unbosque/model/persistence/listapartidos.csv");
		myFile.delete();

		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
				fileWriter = new PrintWriter(myFile);
				fileWriter.write(
						"1) USA VS NETHERLAND \n2) ENGLAND VS SENEGAL \n3) NETHERLAND VS ARGENTINA \n4) AUSTRALIA VS ARGENTINA \n5) FRANCE VS POLAND \n6) CROATIA VS BRASIL \n7) JAPON VS CROATIA \n8) MARROCO VS SPAIN \n9) ENGLAND VS FRANCE \n10) BRASIL VS SOUTH KOREA \n11) PORTUGAL VS SWEDEEN \n12) PORTUGAL VS MARROCO \n13) MARROCO VS FRANCE \n14) ARGENTINA VS CROATIA");
				fileWriter.close();
			}
			fileWriter = new PrintWriter(myFile);
			fileWriter.write(
					"1) USA VS NETHERLAND \n2) ENGLAND VS SENEGAL \n3) NETHERLAND VS ARGENTINA \n4) AUSTRALIA VS ARGENTINA \n5) FRANCE VS POLAND \n6) CROATIA VS BRASIL \n7) JAPON VS CROATIA \n8) MARROCO VS SPAIN \n9) ENGLAND VS FRANCE \n10) BRASIL VS SOUTH KOREA \n11) PORTUGAL VS SWEDEEN \n12) PORTUGAL VS MARROCO \n13) MARROCO VS FRANCE \n14) ARGENTINA VS CROATIA");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Problema al crear el archivo, revise problemas de acceso.");
		}

	}

	/**
	 * Devuelve la lista de apuestas de tipo BetPlay.
	 */
	public ArrayList<BetPlayDTO> getBetPlayList() {
		return betPlayList;
	}

	/**
	 * Establece la lista de apuestas de tipo BetPlay.
	 */
	public void setBetPlayList(ArrayList<BetPlayDTO> betPlayList) {
		this.betPlayList = betPlayList;
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