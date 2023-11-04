package co.edu.unbosque.model.persistence;

/** 
 * Esta es la clase DAO de militar extranjero
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023*/

import java.util.ArrayList;

import co.edu.unbosque.model.ForeignMilitaryDTO;

public class ForeignMilitaryDAO implements CRUDOperation {
	/**
	 * Este es el atributo de Array
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private ArrayList<ForeignMilitaryDTO> foreignMiList;
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
	 * Este es el constructor vacio de la clase militar extranjero DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public ForeignMilitaryDAO() {
		// TODO Auto-generated constructor stub

		foreignMiList = new ArrayList<ForeignMilitaryDTO>();
		FILENAME = "militarextranjero.csv";
		SERIAL_FILENAME = "militarextranjeroser.csv";
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<ForeignMilitaryDTO> temp2 = (ArrayList<ForeignMilitaryDTO>) temp;
			foreignMiList = temp2;
		} else {
			foreignMiList = new ArrayList<ForeignMilitaryDTO>();
		}
	}

	/**
	 * Esta es la funcion crear por atributo de la clase militar extranjero DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
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
	
	/**
	 * Esta es la funcion crear por objeto de la clase militar extranjero DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

		foreignMiList.add((ForeignMilitaryDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	
	/**
	 * Esta es la funcion leer todo de la clase militar extranjero DAO extiende de operaciones
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
		foreignMiList.forEach(foreignMilitary -> {
			sb.append(index + "-->" + (foreignMilitary.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}
	
	/**
	 * Esta es la funcion de actualizar por index de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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

	/**
	 * Esta es la funcion de eliminar por index de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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

	/**
	 * Esta es la funcion de eliminar por objeto de la clase militar extranjero DAO extiende de operaciones
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
		} else if (foreignMiList.remove((ForeignMilitaryDTO) obj)) {
			writeFile();
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Esta es la funcion de leer el archivo por objeto de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
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
			String countryOfOrigin = cols[7];
			int timeInOurCountry = Integer.parseInt(cols[8]);
			foreignMiList.add(new ForeignMilitaryDTO(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age,
					photoLocation, countryOfOrigin, timeInOurCountry));

		}
	}

	String content = "";
	/**
	 * Esta es la funcion de sobreescribir el archivo por objeto de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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

	/**
	 * Esta es la funcion de sobreescribir el serializado de archivo por objeto de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, foreignMiList);
	}
	
	/**
	 * Esta es la funcion de buscar y mostrar documento de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public ForeignMilitaryDTO searchAndShowByDocument(long documentToSearch) {
		for (int i = 0; i < foreignMiList.size(); i++) {
			if (foreignMiList.get(i).getDocument() == documentToSearch) {
				return foreignMiList.get(i);
			}
		}
		return null;
	}
	/**
	 * Esta es la funcion de buscar y mostrar nombre de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */


	public ForeignMilitaryDTO searchAndShowByName(String nameToSearch) {
		for (int i = 0; i < foreignMiList.size(); i++) {
			if (foreignMiList.get(i).getName().equals(nameToSearch)) {
				return foreignMiList.get(i);
			}
		}
		return null;
	}
	/**
	 * Esta es la funcion de buscar y mostrar pais de origen de la clase militar extranjero DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */


	public ForeignMilitaryDTO searchAndShowByCountryOfOrigin(String countryOfOriginToSearch) {
		for (int i = 0; i < foreignMiList.size(); i++) {
			if (foreignMiList.get(i).getCountryOfOrigin().equals(countryOfOriginToSearch)) {
				return foreignMiList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Esta es la funcion de buscar y mostrar tiempo en nuestro paisde la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public ForeignMilitaryDTO searchAndShowBytimeInOurCountry(int timeInOurCountryToSearch) {
		for (int i = 0; i < foreignMiList.size(); i++) {
			if (foreignMiList.get(i).getTimeInOurCountry() == (timeInOurCountryToSearch)) {
				return foreignMiList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Esta es la funcion de buscar y mostrar edad de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public ForeignMilitaryDTO searchAndShowByAge(int ageToSearch) {
		for (int i = 0; i < foreignMiList.size(); i++) {
			if (foreignMiList.get(i).getAge() == (ageToSearch)) {
				return foreignMiList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Este es el getter de el array de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public ArrayList<ForeignMilitaryDTO> getForeignMiList() {
		return foreignMiList;
	}
	
	/**
	 * Este es el setter de el array de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setForeignMiList(ArrayList<ForeignMilitaryDTO> foreignMiList) {
		this.foreignMiList = foreignMiList;
	}
	
	/**
	 * Este es el getter de el index de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public int getIndex() {
		return index;
	}
	/**
	 * Este es el setter de el index de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setIndex(int index) {
		this.index = index;
	}
	
	/**
	 * Este es el getter de el contenido de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getContent() {
		return content;
	}
	
	/**
	 * Este es el setter de el contenido de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * Este es el getter de el nombre del archivo de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getFILENAME() {
		return FILENAME;
	}
	/**
	 * Este es el getter de el serializado nombre del archivo de la clase militar extranjero DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}
}
