package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CivilDTO;

public class CivilDAO implements CRUDOperation {

	private ArrayList<CivilDTO> civilList;
	private final String FILENAME;
	private final String SERIAL_FILENAME;

	public CivilDAO() {

		civilList = new ArrayList<CivilDTO>();
		FILENAME = "civil.csv";
		SERIAL_FILENAME = "civilser.csv";

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<CivilDTO> temp2 = (ArrayList<CivilDTO>) temp;
			civilList = temp2;
		} else {
			civilList = new ArrayList<CivilDTO>();
		}
	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		CivilDTO civil = new CivilDTO();
		civil.setDocument(Long.parseLong(attribs[0]));
		civil.setName(attribs[1]);
		civil.setDayOfBirth(Integer.parseInt(attribs[2]));
		civil.setMonthOfBirth(Integer.parseInt(attribs[3]));
		civil.setYearOfBirth(Integer.parseInt(attribs[4]));
		civil.setAge(Integer.parseInt(attribs[5]));
		civil.setPhotoLocation(attribs[6]);
		civil.setStudiesLevel(attribs[7]);
		civil.setTimeWorkingInArmy(Integer.parseInt(attribs[8]));
		civilList.add(civil);
		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

		civilList.add((CivilDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	@Override
	public String readAll() {

		index = 0;
		StringBuilder sb = new StringBuilder();
		civilList.forEach(civil -> {
			sb.append(index + "-->" + (civil.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= civilList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				civilList.get(index).setDocument(Long.parseLong(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				civilList.get(index).setName(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				civilList.get(index).setDayOfBirth(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				civilList.get(index).setMonthOfBirth(Integer.parseInt(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				civilList.get(index).setYearOfBirth(Integer.parseInt(newData[4]));
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				civilList.get(index).setAge(Integer.parseInt(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				civilList.get(index).setPhotoLocation(newData[6]);
			}
			if (!newData[7].isEmpty() || !newData[7].equals("") || newData[7].length() != 0) {
				civilList.get(index).setStudiesLevel(newData[7]);
			}
			if (!newData[8].isEmpty() || !newData[8].equals("") || newData[8].length() != 0) {
				civilList.get(index).setTimeWorkingInArmy(Integer.parseInt(newData[8]));
			}

			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= civilList.size()) {
			return false;
		} else {
			civilList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object obj) {
		if (obj == null) {
			return false;
		} else if (civilList.remove((CivilDTO) obj)) {
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
			int age = Integer.parseInt(cols[5]);
			String photoLocation = cols[6];
			String studiesLevel = cols[7];
			int timeWorkingInArmy = Integer.parseInt(cols[8]);
			civilList.add(new CivilDTO(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation,
					studiesLevel, timeWorkingInArmy));

		}
	}

	String content = "";

	@Override
	public void writeFile() {

		content = "";
		civilList.forEach(civil -> {
			content += civil.getDocument() + ";";
			content += civil.getName() + ";";
			content += civil.getDayOfBirth() + ";";
			content += civil.getMonthOfBirth() + ";";
			content += civil.getYearOfBirth() + ";";
			content += civil.getAge() + ";";
			content += civil.getPhotoLocation() + ";";
			content += civil.getStudiesLevel() + ";";
			content += civil.getTimeWorkingInArmy() + ";CI\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);
	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, civilList);
	}

}
