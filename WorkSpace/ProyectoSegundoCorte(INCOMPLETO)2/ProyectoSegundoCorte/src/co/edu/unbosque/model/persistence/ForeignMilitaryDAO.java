package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ForeignMilitaryDTO;

public class ForeignMilitaryDAO implements CRUDOperation {

	private ArrayList<ForeignMilitaryDTO> foreignMiList;
	private final String FILENAME;
	private final String SERIAL_FILENAME;

	public ForeignMilitaryDAO() {
		// TODO Auto-generated constructor stub

		foreignMiList = new ArrayList<ForeignMilitaryDTO>();
		FILENAME = "militarlocal.csv";
		SERIAL_FILENAME = "militarlocalser.csv";

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<ForeignMilitaryDTO> temp2 = (ArrayList<ForeignMilitaryDTO>) temp;
			foreignMiList = temp2;
		} else {
			foreignMiList = new ArrayList<ForeignMilitaryDTO>();
		}
	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		ForeignMilitaryDTO foreignMilitary = new ForeignMilitaryDTO();
		foreignMilitary.setDocument(Long.parseLong(attribs[0]));
		foreignMilitary.setName(attribs[1]);
		foreignMilitary.setDayOfBirth(Integer.parseInt(attribs[2]));
		foreignMilitary.setMonthOfBirth(Integer.parseInt(attribs[3]));
		foreignMilitary.setYearOfBirth(Integer.parseInt(attribs[4]));
		foreignMilitary.setAge(Integer.parseInt(attribs[5]));
		foreignMilitary.setPhotoLocation(attribs[6]);
		foreignMilitary.setCountryOfOrigin(attribs[7]);
		foreignMilitary.setTimeInOurCountry(Integer.parseInt(attribs[8]));
		foreignMiList.add(foreignMilitary);
		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

		foreignMiList.add((ForeignMilitaryDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	@Override
	public String readAll() {

		index = 0;
		StringBuilder sb = new StringBuilder();
		foreignMiList.forEach(foreignMilitary -> {
			sb.append(index + "-->" + (foreignMilitary.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= foreignMiList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				foreignMiList.get(index).setDocument(Long.parseLong(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				foreignMiList.get(index).setName(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				foreignMiList.get(index).setDayOfBirth(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				foreignMiList.get(index).setMonthOfBirth(Integer.parseInt(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				foreignMiList.get(index).setYearOfBirth(Integer.parseInt(newData[4]));
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				foreignMiList.get(index).setAge(Integer.parseInt(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				foreignMiList.get(index).setPhotoLocation(newData[6]);
			}
			if (!newData[7].isEmpty() || !newData[7].equals("") || newData[7].length() != 0) {
				foreignMiList.get(index).setCountryOfOrigin(newData[7]);
			}
			if (!newData[8].isEmpty() || !newData[8].equals("") || newData[8].length() != 0) {
				foreignMiList.get(index).setTimeInOurCountry(Integer.parseInt(newData[8]));
			}

			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= foreignMiList.size()) {
			return false;
		} else {
			foreignMiList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object obj) {
		if (obj == null) {
			return false;
		} else if (foreignMiList.remove((ForeignMilitaryDTO) obj)) {
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
			long document = Long.parseLong(cols[0]);
			String name = cols[1];
			int dayOfBirth = Integer.parseInt(cols[2]);
			int monthOfBirth = Integer.parseInt(cols[3]);
			int yearOfBirth = Integer.parseInt(cols[4]);
			int age = Integer.parseInt(cols[4]);
			String photoLocation = cols[5];
			String countryOfOrigin = cols[6];
			int timeInOurCountry = Integer.parseInt(cols[7]);
			foreignMiList.add(new ForeignMilitaryDTO(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age,
					photoLocation, countryOfOrigin, timeInOurCountry));

		}
	}

	String content = "";

	@Override
	public void writeFile() {

		content = "";
		foreignMiList.forEach(foreignMilitary -> {
			content += foreignMilitary.getDocument() + ";";
			content += foreignMilitary.getName() + ";";
			content += foreignMilitary.getDayOfBirth() + ";";
			content += foreignMilitary.getMonthOfBirth() + ";";
			content += foreignMilitary.getYearOfBirth() + ";";
			content += foreignMilitary.getAge() + ";";
			content += foreignMilitary.getPhotoLocation() + ";";
			content += foreignMilitary.getCountryOfOrigin() + ";";
			content += foreignMilitary.getTimeInOurCountry() + ";MF\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);
	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, foreignMiList);
	}

}
