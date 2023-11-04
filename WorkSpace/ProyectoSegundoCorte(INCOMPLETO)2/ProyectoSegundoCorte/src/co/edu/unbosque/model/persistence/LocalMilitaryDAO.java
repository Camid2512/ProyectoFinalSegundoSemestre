package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.LocalMilitaryDTO;

public class LocalMilitaryDAO implements CRUDOperation {

	private ArrayList<LocalMilitaryDTO> localMiList;
	private final String FILENAME;
	private final String SERIAL_FILENAME;

	public LocalMilitaryDAO() {
		// TODO Auto-generated constructor stub

		localMiList = new ArrayList<LocalMilitaryDTO>();
		FILENAME = "militarlocal.csv";
		SERIAL_FILENAME = "militarlocalser.csv";

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<LocalMilitaryDTO> temp2 = (ArrayList<LocalMilitaryDTO>) temp;
			localMiList = temp2;
		} else {
			localMiList = new ArrayList<LocalMilitaryDTO>();
		}
	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		LocalMilitaryDTO localMilitary = new LocalMilitaryDTO();
		localMilitary.setDocument(Long.parseLong(attribs[0]));
		localMilitary.setName(attribs[1]);
		localMilitary.setDayOfBirth(Integer.parseInt(attribs[2]));
		localMilitary.setMonthOfBirth(Integer.parseInt(attribs[3]));
		localMilitary.setYearOfBirth(Integer.parseInt(attribs[4]));
		localMilitary.setAge(Integer.parseInt(attribs[5]));
		localMilitary.setPhotoLocation(attribs[6]);
		localMilitary.setRank(attribs[7]);
		localMilitary.setServiceTime(Integer.parseInt(attribs[8]));
		localMiList.add(localMilitary);
		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

		localMiList.add((LocalMilitaryDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	@Override
	public String readAll() {

		index = 0;
		StringBuilder sb = new StringBuilder();
		localMiList.forEach(localMilitary -> {
			sb.append(index + "-->" + (localMilitary.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= localMiList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				localMiList.get(index).setDocument(Long.parseLong(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				localMiList.get(index).setName(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				localMiList.get(index).setDayOfBirth(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				localMiList.get(index).setMonthOfBirth(Integer.parseInt(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				localMiList.get(index).setYearOfBirth(Integer.parseInt(newData[4]));
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				localMiList.get(index).setAge(Integer.parseInt(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				localMiList.get(index).setPhotoLocation(newData[6]);
			}
			if (!newData[7].isEmpty() || !newData[7].equals("") || newData[7].length() != 0) {
				localMiList.get(index).setRank(newData[7]);
			}
			if (!newData[8].isEmpty() || !newData[8].equals("") || newData[8].length() != 0) {
				localMiList.get(index).setServiceTime(Integer.parseInt(newData[8]));
			}

			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= localMiList.size()) {
			return false;
		} else {
			localMiList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object obj) {
		if (obj == null) {
			return false;
		} else if (localMiList.remove((LocalMilitaryDTO) obj)) {
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
			String rank = cols[7];
			int serviceTime = Integer.parseInt(cols[8]);
			localMiList.add(new LocalMilitaryDTO(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age,
					photoLocation, rank, serviceTime));

		}
	}

	String content = "";

	@Override
	public void writeFile() {

		content = "";
		localMiList.forEach(localMilitary -> {
			content += localMilitary.getDocument() + ";";
			content += localMilitary.getName() + ";";
			content += localMilitary.getDayOfBirth() + ";";
			content += localMilitary.getMonthOfBirth() + ";";
			content += localMilitary.getYearOfBirth() + ";";
			content += localMilitary.getAge() + ";";
			content += localMilitary.getPhotoLocation() + ";";
			content += localMilitary.getRank() + ";";
			content += localMilitary.getServiceTime() + ";ML\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);
	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, localMiList);
	}

}
