package co.edu.unbosque.model.persistence;

/** 
 * Esta es la clase DAO de militar local
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023*/

import java.util.ArrayList;

import co.edu.unbosque.model.LocalMilitaryDTO;

public class LocalMilitaryDAO implements CRUDOperation {
	/**
	 * Este es el atributo de Array
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private ArrayList<LocalMilitaryDTO> localMiList;
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
	 * Este es el constructor vacio de la clase militar local DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public LocalMilitaryDAO() {
		// TODO Auto-generated constructor stub

		localMiList = new ArrayList<LocalMilitaryDTO>();
		FILENAME = "militarlocal.csv";
		SERIAL_FILENAME = "militarlocalser.csv";
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<LocalMilitaryDTO> temp2 = (ArrayList<LocalMilitaryDTO>) temp;
			localMiList = temp2;
		} else {
			localMiList = new ArrayList<LocalMilitaryDTO>();
		}
	}
	
	/**
	 * Esta es la funcion crear por atributo de la clase militar local DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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
	
	/**
	 * Esta es la funcion crear por objeto de la clase militar local DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

		localMiList.add((LocalMilitaryDTO) obj);
		writeFile();
		writeSerializable();

	}

	int index = 0;
	
	/**
	 * Esta es la funcion leer todo de la clase militar local DAO extiende de operaciones
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
		localMiList.forEach(localMilitary -> {
			sb.append(index + "-->" + (localMilitary.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}
	
	/**
	 * Esta es la funcion de actualizar por index de la clase militar local DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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

	/**
	 * Esta es la funcion de eliminar por index de la clase militar local DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
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

	/**
	 * Esta es la funcion de eliminar por objeto de la clase militar local DAO extiende de operaciones
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
		} else if (localMiList.remove((LocalMilitaryDTO) obj)) {
			writeFile();
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Esta es la funcion de leer el archivo por objeto de la clase militar local DAO 
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
			String rank = cols[7];
			int serviceTime = Integer.parseInt(cols[8]);
			localMiList.add(new LocalMilitaryDTO(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age,
					photoLocation, rank, serviceTime));

		}
	}

	String content = "";
	
	/**
	 * Esta es la funcion de sobreescribir el archivo por objeto de la clase militar local DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

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
	
	/**
	 * Esta es la funcion de sobreescribir el serializado de archivo por objeto de la clase militar local DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, localMiList);
	}

	/**
	 * Esta es la funcion de buscar y mostrar documento de la clase militar local DAO 
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public LocalMilitaryDTO searchAndShowByDocument(long documentToSearch) {
		for (int i = 0; i < localMiList.size(); i++) {
			if (localMiList.get(i).getDocument() == documentToSearch) {
				return localMiList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Esta es la funcion de buscar y mostrar nombre de la clase militar local DAO 
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public LocalMilitaryDTO searchAndShowByName(String nameToSearch) {
		for (int i = 0; i < localMiList.size(); i++) {
			if (localMiList.get(i).getName().equals(nameToSearch)) {
				return localMiList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Esta es la funcion de buscar y mostrar rango de la clase militar local DAO 
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public LocalMilitaryDTO searchAndShowByRank(String rankToSearch) {
		for (int i = 0; i < localMiList.size(); i++) {
			if (localMiList.get(i).getRank().equals(rankToSearch)) {
				return localMiList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Esta es la funcion de buscar y mostrar tiempo de servicio de la clase militar local DAO
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public LocalMilitaryDTO searchAndShowByServiceTime(int serviceTimeToSearch) {
		for (int i = 0; i < localMiList.size(); i++) {
			if (localMiList.get(i).getServiceTime() == (serviceTimeToSearch)) {
				return localMiList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Esta es la funcion de buscar y mostrar edad de la clase militar local
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public LocalMilitaryDTO searchAndShowByAge(int ageToSearch) {
		for (int i = 0; i < localMiList.size(); i++) {
			if (localMiList.get(i).getAge() == (ageToSearch)) {
				return localMiList.get(i);
			}
		}
		return null;
	}

	/**
	 * Este es el getter de el array de la clase militar local DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public ArrayList<LocalMilitaryDTO> getLocalMiList() {
		return localMiList;
	}
	/**
	 * Este es el setter de el array de la clase militar local DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public void setLocalMiList(ArrayList<LocalMilitaryDTO> localMiList) {
		this.localMiList = localMiList;
	}
	
	/**
	 * Este es el getter de el index de la clase militar local DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public int getIndex() {
		return index;
	}

	/**
	 * Este es el setter de el index de la clase militar local DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */


	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Este es el getter de el contenido de la clase militar local DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */


	public String getContent() {
		return content;
	}
	/**
	 * Este es el setter de el contenido de la clase militar local DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	
	

	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * Este es el getter de el nombre de archivo de la clase militar local DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public String getFILENAME() {
		return FILENAME;
	}

	/**
	 * Este es el getter de el nombre serial de archivo de la clase militar local DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}
}