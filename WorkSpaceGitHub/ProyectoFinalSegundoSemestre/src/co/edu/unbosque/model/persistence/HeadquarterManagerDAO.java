package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.HeadquarterManagerDTO;

public class HeadquarterManagerDAO implements CRUDOperation {

	private ArrayList<HeadquarterManagerDTO> headquarterManagerList;
	/**
	 * Este es el atributo de el nombre de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String FILENAME = "managerlogin.csv";
	/**
	 * Este es el atributo de el nombre serial de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String SERIAL_FILENAME = "managerloginserialized.csv";

	public HeadquarterManagerDAO() {

		headquarterManagerList = new ArrayList<HeadquarterManagerDTO>();
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<HeadquarterManagerDTO> temp2 = (ArrayList<HeadquarterManagerDTO>) temp;
			headquarterManagerList = temp2;
		} else {
			headquarterManagerList = new ArrayList<HeadquarterManagerDTO>();
		}

		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		HeadquarterManagerDTO manager = new HeadquarterManagerDTO();

		manager.setUser(attribs[0]);
		manager.setPassword(attribs[1]);
		manager.setId(attribs[2]);

		headquarterManagerList.add(manager);
		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		headquarterManagerList.add((HeadquarterManagerDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		index = 0;
		StringBuilder sb = new StringBuilder();
		headquarterManagerList.forEach(manager -> {
			sb.append(index + "-->" + (manager.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= headquarterManagerList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				headquarterManagerList.get(index).setUser(newData[0]);
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				headquarterManagerList.get(index).setPassword(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				headquarterManagerList.get(index).setId(newData[2]);
			}
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= headquarterManagerList.size()) {
			return false;
		} else {
			headquarterManagerList.remove(index);
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
		} else if (headquarterManagerList.remove((HeadquarterManagerDTO) obj)) {
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
			String username = cols[0];
			String password = cols[1];
			String id = cols[2];

			headquarterManagerList.add(new HeadquarterManagerDTO(username, password, id));

		}
	}

	String content = "";

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

		content = "";
		headquarterManagerList.forEach(headquarterManager -> {
			content += headquarterManager.getUser() + ";";
			content += headquarterManager.getPassword() + ";";
			content += headquarterManager.getId() + ";MAN\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	@Override
	public void writeSerializable() {

		// TODO Auto-generated method stub

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, headquarterManagerList);

	}

	public ArrayList<HeadquarterManagerDTO> getHeadquarterManagerList() {
		return headquarterManagerList;
	}

	public void setHeadquarterManagerList(ArrayList<HeadquarterManagerDTO> headquarterManagerList) {
		this.headquarterManagerList = headquarterManagerList;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFILENAME() {
		return FILENAME;
	}

	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}

}
