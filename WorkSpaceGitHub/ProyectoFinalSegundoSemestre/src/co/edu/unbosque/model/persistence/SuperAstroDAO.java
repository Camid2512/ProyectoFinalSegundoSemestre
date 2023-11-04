package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SuperAstroDTO;

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

	public SuperAstroDAO() {
		// TODO Auto-generated constructor stub

		superAstroList = new ArrayList<SuperAstroDTO>();
		FILENAME = "superastro.dat";
		SERIAL_FILENAME = "superastroserialized.dat";

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

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		SuperAstroDTO superAstro = new SuperAstroDTO();

		superAstro.setDay(Integer.parseInt(attribs[0]));
		superAstro.setMonth(Integer.parseInt(attribs[1]));
		superAstro.setYear(Integer.parseInt(attribs[2]));
		superAstro.setBetPlaced(Double.parseDouble(attribs[3]));
		superAstro.setHeadQuarterName(attribs[4]);
		superAstro.setDocument(Long.parseLong(attribs[5]));
		superAstro.setNumber(Integer.parseInt(attribs[6]));
		superAstro.setZodiacSign(attribs[7]);

		superAstroList.add(superAstro);
		writeFile();
		writeSerializable();
	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		superAstroList.add((SuperAstroDTO) obj);
		writeFile();
		writeSerializable();
	}

	int index = 0;

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
			double betPlaced = Double.parseDouble(cols[3]);
			String headQuarterName = cols[4];
			long document = Long.parseLong(cols[5]);
			int number = Integer.parseInt(cols[6]);
			String zodiacSign = cols[7];

			superAstroList
					.add(new SuperAstroDTO(day, month, year, betPlaced, headQuarterName, document, number, zodiacSign));

		}
	}

	String content = "";

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

		content = "";
		superAstroList.forEach(superAstro -> {
			content += superAstro.getDay() + ";";
			content += superAstro.getMonth() + ";";
			content += superAstro.getYear() + ";";
			content += superAstro.getBetPlaced() + ";";
			content += superAstro.getHeadQuarterName() + ";";
			content += superAstro.getDocument() + ";";
			content += superAstro.getNumber() + ";";
			content += superAstro.getZodiacSign() + ";SUPERAS\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, superAstroList);
	}

}
