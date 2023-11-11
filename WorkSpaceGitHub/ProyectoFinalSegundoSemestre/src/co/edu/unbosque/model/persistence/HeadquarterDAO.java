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
	private final String FILENAME = "headquarter.csv";
	/**
	 * Este es el atributo de el nombre serial de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String SERIAL_FILENAME = "headquarterserialized.csv";

	public HeadquarterDAO() {
		// TODO Auto-generated constructor stub
		headquarterList = new ArrayList<HeadquarterDTO>();
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

		headquarter.setVenueName(attribs[0]);
		headquarter.setLocationVenue(attribs[1]);
		headquarter.setEmployeesNumber(Integer.parseInt(attribs[2]));
		headquarter.setId(attribs[3]);

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
				headquarterList.get(index).setVenueName(newData[0]);
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				headquarterList.get(index).setLocationVenue(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				headquarterList.get(index).setEmployeesNumber(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				headquarterList.get(index).setId(newData[3]);
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
			String venueName = cols[0];
			String locationVenue = cols[1];
			int numEmployees = Integer.parseInt(cols[2]);
			String id = cols[3];

			headquarterList.add(new HeadquarterDTO(venueName, locationVenue, numEmployees, id));

		}
	}

	String content = "";

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		content = "";
		headquarterList.forEach(headquarterManager -> {
			content += headquarterManager.getVenueName() + ";";
			content += headquarterManager.getLocationVenue() + ";";
			content += headquarterManager.getEmployeesNumber() + ";";
			content += headquarterManager.getId() + ";HEAD\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);
	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, headquarterList);
	}

}
