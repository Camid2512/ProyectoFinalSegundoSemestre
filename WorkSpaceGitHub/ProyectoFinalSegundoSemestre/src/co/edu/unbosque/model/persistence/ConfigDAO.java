package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ConfigDTO;

public class ConfigDAO implements CRUDOperation {

	private ArrayList<ConfigDTO> configList;

	/**
	 * Este es el atributo de el nombre de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String FILENAME;

	public ConfigDAO() {
		// TODO Auto-generated constructor stub

		configList = new ArrayList<ConfigDTO>();

		FILENAME = "config.properties";

		readFromFile();

	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		ConfigDTO config = new ConfigDTO();
		config.setNameBettingHouse(attribs[0]);
		config.setNumberLocation(Integer.parseInt(attribs[1]));
		config.setTotalBudgetAllowed(Double.parseDouble(attribs[2]));

		configList.add(config);
		writeFile();
	}

	@Override
	public void create(Object obj) {

		configList.add((ConfigDTO) obj);
		writeFile();

	}

	int index = 0;

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		index = 0;
		StringBuilder sb = new StringBuilder();
		configList.forEach(config -> {
			sb.append(index + "-->" + (config.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= configList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {

				configList.get(index).setNameBettingHouse(newData[0]);

			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				configList.get(index).setNumberLocation(Integer.parseInt(newData[1]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {

				configList.get(index).setTotalBudgetAllowed(Double.parseDouble(newData[2]));

			}
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= configList.size()) {
			return false;
		} else {
			configList.remove(index);
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
		} else if (configList.remove((ConfigDTO) obj)) {
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

			String nameBettingHouse = cols[0];
			int numberLocation = Integer.parseInt(cols[1]);
			double totalBudgetAllowedS = Double.parseDouble(cols[1]);

			configList.add(new ConfigDTO(nameBettingHouse, numberLocation, totalBudgetAllowedS));

		}
	}

	String content = "";

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

		content = "";
		configList.forEach(config -> {
			content += config.getNameBettingHouse() + ";";
			content += config.getNumberLocation() + ";";
			content += config.getTotalBudgetAllowed() + ";CONF\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub

	}

}
