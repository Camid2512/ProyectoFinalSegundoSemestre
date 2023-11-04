package co.edu.unbosque.model.persistence;

/** 
 * Esta es la clase DAO de civil
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023*/

import java.util.ArrayList;

import co.edu.unbosque.model.CivilDTO;

public class CivilDAO implements CRUDOperation {

	/**
	 * Este es el atributo de Array
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private ArrayList<CivilDTO> civilList;
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
	 * Este es el constructor vacio de la clase Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public CivilDAO() {

		civilList = new ArrayList<CivilDTO>();
		FILENAME = "civil.csv";
		SERIAL_FILENAME = "civilser.csv";
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<CivilDTO> temp2 = (ArrayList<CivilDTO>) temp;
			civilList = temp2;
		} else {
			civilList = new ArrayList<CivilDTO>();
		}
	}

	/**
	 * Esta es la funcion crear por atributo de la clase Civil DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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

	/**
	 * Esta es la funcion crear por objeto de la clase Civil DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

		civilList.add((CivilDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;

	/**
	 * Esta es la funcion leer todo de la clase Civil DAO extiende de operaciones
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
		civilList.forEach(civil -> {
			sb.append(index + "-->" + (civil.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	/**
	 * Esta es la funcion actualizar por posicion de la clase Civil DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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

	/**
	 * Esta es la funcion eliminar por posicion de la clase Civil DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
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

	/**
	 * Esta es la funcion eliminar por objeto de la clase Civil DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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

	/**
	 * Esta es la funcion que lee el archivo de la clase Civil DAO
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
			String studiesLevel = cols[7];
			int timeWorkingInArmy = Integer.parseInt(cols[8]);
			civilList.add(new CivilDTO(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation,
					studiesLevel, timeWorkingInArmy));

		}
	}

	String content = "";

	/**
	 * Esta es la funcion que sobreescribe el archivo de la clase Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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

	/**
	 * Esta es la funcion que sobreescribe el serializado de la clase Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, civilList);
	}

	/**
	 * Esta es la funcion buscar y mostrar por documento Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public CivilDTO searchAndShowByDocument(long documentToSearch) {
		for (int i = 0; i < civilList.size(); i++) {
			if (civilList.get(i).getDocument() == documentToSearch) {
				return civilList.get(i);
			}
		}
		return null;
	}

	/**
	 * Esta es la funcion buscar y mostrar por nombre Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public CivilDTO searchAndShowByName(String nameToSearch) {
		for (int i = 0; i < civilList.size(); i++) {
			if (civilList.get(i).getName().equals(nameToSearch)) {
				return civilList.get(i);
			}
		}
		return null;
	}

	/**
	 * Esta es la funcion buscar y mostrar por nivel de estudio Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public CivilDTO searchAndShowByStudiesLevelToSearch(String studiesLevelToSearch) {
		for (int i = 0; i < civilList.size(); i++) {
			if (civilList.get(i).getStudiesLevel().equals(studiesLevelToSearch)) {
				return civilList.get(i);
			}
		}
		return null;
	}

	/**
	 * Esta es la funcion buscar y mostrar por tiempo en el ejercito Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public CivilDTO searchAndShowBytimeWithArmy(int timeWithArmyToSearch) {
		for (int i = 0; i < civilList.size(); i++) {
			if (civilList.get(i).getTimeWorkingInArmy() == (timeWithArmyToSearch)) {
				return civilList.get(i);
			}
		}
		return null;
	}

	/**
	 * Esta es la funcion buscar y mostrar por edad Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public CivilDTO searchAndShowByAge(int ageToSearch) {
		for (int i = 0; i < civilList.size(); i++) {
			if (civilList.get(i).getAge() == (ageToSearch)) {
				return civilList.get(i);
			}
		}
		return null;
	}

	/**
	 * Este es el getter de el array de la lista Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public ArrayList<CivilDTO> getCivilList() {
		return civilList;
	}

	/**
	 * Este es el setter de el array de la lista Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setCivilList(ArrayList<CivilDTO> civilList) {
		this.civilList = civilList;
	}

	/**
	 * Este es el getter de el index de Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public int getIndex() {
		return index;
	}

	/**
	 * Este es el setter de el index de Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Este es el getter de el contenido de Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Este es el setter de el contenido de Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Este es el getter de el nombre del archivo de Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getFILENAME() {
		return FILENAME;
	}

	/**
	 * Este es el getter de el serializado del nombre de Civil DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}
}
