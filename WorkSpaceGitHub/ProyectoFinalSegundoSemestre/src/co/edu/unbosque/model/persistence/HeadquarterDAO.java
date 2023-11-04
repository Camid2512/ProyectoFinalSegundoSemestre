package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.HeadquarterDTO;

public class HeadquarterDAO implements CRUDOperation {

	private ArrayList<HeadquarterDTO> headquarterList;
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

	public HeadquarterDAO() {
		// TODO Auto-generated constructor stub
		headquarterList = new ArrayList<HeadquarterDTO>();
		FILENAME = "headquarter.csv";
		SERIAL_FILENAME = "headquarterserialized.csv";
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<HeadquarterDTO> temp2 = (ArrayList<HeadquarterDTO>) temp;
			headquarterList = temp2;
		} else {
			headquarterList = new ArrayList<HeadquarterDTO>();
		}
	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		HeadquarterDTO headquarter = new HeadquarterDTO();

		headquarter.setLocation(attribs[0]);
		headquarter.setEmployeesNumber(Integer.parseInt(attribs[1]));

		headquarterList.add(headquarter);

		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		headquarterList.add((HeadquarterDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	@Override
	public String readAll() {

		index = 0;

		index = 0;
		StringBuilder sb = new StringBuilder();
		headquarterList.forEach(headquarter -> {
			sb.append(index + "-->" + (headquarter.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= headquarterList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				headquarterList.get(index).setLocation(newData[0]);
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				headquarterList.get(index).setEmployeesNumber(Integer.parseInt(newData[1]));
			}
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= headquarterList.size()) {
			return false;
		} else {
			headquarterList.remove(index);
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
		} else if (headquarterList.remove((HeadquarterDTO) obj)) {
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
			String location = cols[0];
			int numEmployees = Integer.parseInt(cols[1]);

			headquarterList.add(new HeadquarterDTO(location, numEmployees));

		}
	}

	String content = "";

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		content = "";
		headquarterList.forEach(headquarterManager -> {
			content += headquarterManager.getLocation() + ";";
			content += headquarterManager.getEmployeesNumber() + ";HEAD\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);
	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, headquarterList);
	}

}
