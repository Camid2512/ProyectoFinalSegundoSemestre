package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import co.edu.unbosque.model.MilitaryDTO;

public class MilitaryDAO implements CRUDOperation {

	private ArrayList<MilitaryDTO> militaryList;
	private final String FILENAME;
	private final String SERIAL_FILENAME;

	public MilitaryDAO() {

		militaryList = new ArrayList<MilitaryDTO>();
		FILENAME = "military.csv";
		SERIAL_FILENAME = "militaryser.csv";

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<MilitaryDTO> temp2 = (ArrayList<MilitaryDTO>) temp;
			militaryList = temp2;
		} else {
			militaryList = new ArrayList<MilitaryDTO>();
		}

	}

	@Override
	public void create(String... attribs) {

		MilitaryDTO military = new MilitaryDTO();
		military.setDocument(Long.parseLong(attribs[0]));
		military.setName(attribs[1]);
		military.setDayOfBirth(Integer.parseInt(attribs[2]));
		military.setMonthOfBirth(Integer.parseInt(attribs[3]));
		military.setYearOfBirth(Integer.parseInt(attribs[4]));
		military.setAge(Integer.parseInt(attribs[5]));
		military.setPhotoLocation(attribs[6]);
		militaryList.add(military);
		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		militaryList.add((MilitaryDTO) obj);
		writeFile();
		writeSerializable();
	}

	int index = 0;

	@Override
	public String readAll() {

		index = 0;
		StringBuilder sb = new StringBuilder();
		militaryList.forEach(person -> {
			sb.append(index + "-->" + (person.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= militaryList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				militaryList.get(index).setDocument(Long.parseLong(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				militaryList.get(index).setName(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				militaryList.get(index).setDayOfBirth(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				militaryList.get(index).setMonthOfBirth(Integer.parseInt(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				militaryList.get(index).setYearOfBirth(Integer.parseInt(newData[4]));
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				militaryList.get(index).setAge(Integer.parseInt(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				militaryList.get(index).setPhotoLocation(newData[6]);
			}
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= militaryList.size()) {
			return false;
		} else {
			militaryList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object obj) {
		if (obj == null) {
			return false;
		} else if (militaryList.remove((MilitaryDTO) obj)) {
			writeFile();
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void readFromFile() {

		String content = FileHandler.openAndReadFile(FILENAME);
		if (content.isEmpty()) {
			return;
		}
		String[] lines = content.split("\n");
		for (int i = 0; i < lines.length; i++) {
			String[] cols = lines[i].split(";");
			long document = Long.parseLong(cols[0]);
			String name = cols[1];
			int dayOfBirth = Integer.parseInt(cols[2]);
			int monthOfBirth = Integer.parseInt(cols[3]);
			int yearOfBirth = Integer.parseInt(cols[4]);
			int age = Integer.parseInt(cols[5]);
			String photoLocation = cols[6];
			militaryList
					.add(new MilitaryDTO(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation));

		}
	}

	String content = "";

	@Override
	public void writeFile() {

		content = "";
		militaryList.forEach(military -> {
			content += military.getDocument() + ";";
			content += military.getName() + ";";
			content += military.getDayOfBirth() + ";";
			content += military.getMonthOfBirth() + ";";
			content += military.getYearOfBirth() + ";";
			content += military.getAge() + ";";
			content += military.getPhotoLocation() + ";M\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);
	}

	@Override
	public void writeSerializable() {

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, militaryList);

	}

}
