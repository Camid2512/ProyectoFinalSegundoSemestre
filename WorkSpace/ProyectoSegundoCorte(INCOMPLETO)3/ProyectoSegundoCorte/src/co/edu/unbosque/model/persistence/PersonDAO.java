package co.edu.unbosque.model.persistence;

/** 
 * Esta es la clase DAO de Persona
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023*/

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import co.edu.unbosque.model.PersonDTO;

public class PersonDAO implements CRUDOperation {
	/**
	 * Este es el atributo de Array
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	private ArrayList<PersonDTO> peopleList;
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
	 * Este es el constructor vacio de la clase persona DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public PersonDAO() {

		peopleList = new ArrayList<PersonDTO>();
		FILENAME = "people.csv";
		SERIAL_FILENAME = "peopleser.csv";

	}

	/**
	 * Esta es la funcion crear por atributo de la clase persona DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	@Override
	public void create(String... attribs) {

		PersonDTO person = new PersonDTO();
		person.setDocument(Long.parseLong(attribs[0]));
		person.setName(attribs[1]);
		person.setDayOfBirth(Integer.parseInt(attribs[2]));
		person.setMonthOfBirth(Integer.parseInt(attribs[3]));
		person.setYearOfBirth(Integer.parseInt(attribs[4]));
		person.setAge(Integer.parseInt(attribs[5]));
		person.setPhotoLocation(attribs[6]);
		peopleList.add(person);

	}
	/**
	 * Esta es la funcion crear por objeto de la clase persona DAO extiende de
	 * operaciones CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public void create(Object obj) {
		peopleList.add((PersonDTO) obj);
	}

	int index = 0;
	
	/**
	 * Esta es la funcion leer todo de la clase persona DAO extiende de operaciones
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
		peopleList.forEach(person -> {
			sb.append(index + "-->" + (person.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}
	
	/**
	 * Esta es la funcion de actualizar por index de la clase persona DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public boolean updateByIndex(int index, String... newData) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= peopleList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				peopleList.get(index).setDocument(Long.parseLong(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				peopleList.get(index).setName(newData[1]);
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				peopleList.get(index).setDayOfBirth(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				peopleList.get(index).setMonthOfBirth(Integer.parseInt(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				peopleList.get(index).setYearOfBirth(Integer.parseInt(newData[4]));
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				peopleList.get(index).setAge(Integer.parseInt(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				peopleList.get(index).setPhotoLocation(newData[6]);
			}
			return true;
		}
	}

	/**
	 * Esta es la funcion de eliminar por index de la clase persona DAO extiende de operaciones
	 * CRUD
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= peopleList.size()) {
			return false;
		} else {
			peopleList.remove(index);
			return true;
		}
	}
	
	/**
	 * Esta es la funcion de eliminar por objeto de la clase persona DAO extiende de operaciones
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
		} else if (peopleList.remove((PersonDTO) obj)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Esta es la funcion de leer el archivo por objeto de la clase persona DAO 
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
			peopleList.add(new PersonDTO(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation));

		}
	}

	String content = "";
	
	/**
	 * Esta es la funcion de sobreescribir el archivo por objeto de la clase persona DAO 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	@Override
	public void writeFile() {

		content = "";
		peopleList.forEach(person -> {
			content += person.getDocument() + ";";
			content += person.getName() + ";";
			content += person.getDayOfBirth() + ";";
			content += person.getMonthOfBirth() + ";";
			content += person.getYearOfBirth() + ";";
			content += person.getAge() + ";";
			content += person.getPhotoLocation() + ";\n";
		});
		FileHandler.openAndWriteFile(FILENAME, content);
	}

	/**
	 * Esta es la funcion de sobreescribir el serializado de archivo por objeto de la clase persona DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	@Override
	public void writeSerializable() {

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, peopleList);

	}
	/**
	 * Esta es la funcion que calcula la edad de la clase persona DAO
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public int ageCalculation(int dayOfBirth, int monthOfBirth, int yearOfBirth) {

		LocalDate fechaActual = LocalDate.now();

		LocalDate fechaNacimiento = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

		Period age = Period.between(fechaNacimiento, fechaActual);

		int realAge = age.getYears();

		return realAge;
	}
}
