package co.edu.unbosque.model.persistence;

/** 
 * Esta es la clase DAO de militar 
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023*/

import java.util.ArrayList;

import co.edu.unbosque.model.MilitaryDTO;

public class MilitaryDAO implements CRUDOperation {

	/**
	 * Este es el atributo de Array
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private ArrayList<MilitaryDTO> militaryList;
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
	
	/**
	 * Este es el constructor vacio de la clase militar DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public MilitaryDAO() {

		militaryList = new ArrayList<MilitaryDTO>();
		FILENAME = "military.csv";
		SERIAL_FILENAME = "militaryser.csv";

	}

	/**
	 * Esta es la funcion crear por atributo de la clase militar DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
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

	}
	
	/**
	 * Esta es la funcion crear por objeto de la clase militar DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public void create(Object obj) {
		militaryList.add((MilitaryDTO) obj);
	}

	int index = 0;

	/**
	 * Esta es la funcion leer todo de la clase militar DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
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
	
	/**
	 * Esta es la funcion de actualizar por index de la clase militar DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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
			return true;
		}
	}

	/**
	 * Esta es la funcion de eliminar por index de la clase militar DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= militaryList.size()) {
			return false;
		} else {
			militaryList.remove(index);
			return true;
		}
	}
	
	/**
	 * Esta es la funcion de eliminar por objeto de la clase militar DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public boolean delete(Object obj) {
		if (obj == null) {
			return false;
		} else if (militaryList.remove((MilitaryDTO) obj)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Esta es la funcion de leer el archivo por objeto de la clase militar DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */


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
	
	/**
	 * Esta es la funcion de sobreescribir el archivo por objeto de la clase militar DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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
		
		/**
		 * Esta es la funcion de sobreescribir el serializado de archivo por objeto de la clase militar DAO
		 * 
		 * @author Cristhian Diaz
		 * @version 1.0
		 * @since 25/09/2023
		 */
	}

	@Override
	public void writeSerializable() {

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, militaryList);

	}

}
