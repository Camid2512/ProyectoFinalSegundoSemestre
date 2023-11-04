package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import co.edu.unbosque.model.PersonDTO;

public class PersonDAO implements CRUDOperation {

	private ArrayList<PersonDTO> peopleList;
	private final String FILENAME;
	private final String SERIAL_FILENAME;

	public PersonDAO() {

		peopleList = new ArrayList<PersonDTO>();
		FILENAME = "people.csv";
		SERIAL_FILENAME = "peopleser.csv";

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<PersonDTO> temp2 = (ArrayList<PersonDTO>) temp;
			peopleList = temp2;
		} else {
			peopleList = new ArrayList<PersonDTO>();
		}

	}

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
		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		peopleList.add((PersonDTO) obj);
		writeFile();
		writeSerializable();
	}

	int index = 0;

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
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= peopleList.size()) {
			return false;
		} else {
			peopleList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object obj) {
		if (obj == null) {
			return false;
		} else if (peopleList.remove((PersonDTO) obj)) {
			writeFile();
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

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

	@Override
	public void writeSerializable() {

		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, peopleList);

	}

	public String ageCalculation(int dayOfBirth, int monthOfBirth, int yearOfBirth) {

		LocalDate fechaActual = LocalDate.now();

		LocalDate fechaNacimiento = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

		Period age = Period.between(fechaNacimiento, fechaActual);

		return String.format("%d anos, %d meses, % dias", age.getYears(), age.getMonths(), age.getDays());
	}
}
