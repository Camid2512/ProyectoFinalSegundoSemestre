package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.OwnerDTO;

public class OwnerDAO implements CRUDOperation {

	private ArrayList<OwnerDTO> ownerList;
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

	public OwnerDAO() {

		ownerList = new ArrayList<OwnerDTO>();
		FILENAME = "ownerlogin.csv";
		SERIAL_FILENAME = "ownerloginserialized.csv";
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<OwnerDTO> temp2 = (ArrayList<OwnerDTO>) temp;
			ownerList = temp2;
		} else {
			ownerList = new ArrayList<OwnerDTO>();
		}

		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		OwnerDTO owner = new OwnerDTO();

		owner.setUsername(attribs[0]);
		owner.setPassword(attribs[1]);

		ownerList.add(owner);
		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		ownerList.add((OwnerDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		index = 0;
		StringBuilder sb = new StringBuilder();
		ownerList.forEach(owner -> {
			sb.append(index + "-->" + (owner.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= ownerList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				ownerList.get(index).setUsername(newData[1]);
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				ownerList.get(index).setPassword(newData[1]);
			}
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= ownerList.size()) {
			return false;
		} else {
			ownerList.remove(index);
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
		} else if (ownerList.remove((OwnerDTO) obj)) {
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

			ownerList.add(new OwnerDTO(username, password));

		}
	}

	String content = "";

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

		content = "";
		ownerList.forEach(owner -> {
			content += owner.getUsername() + ";";
			content += owner.getPassword() + ";\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	@Override
	public void writeSerializable() {

		// TODO Auto-generated method stub

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, ownerList);

	}

}