package co.edu.unbosque.model;

import java.io.Serializable;

public class PersonDTO implements Serializable {

	private static final long serialVersionUID = 2103772809532417936L;

	private long document;
	private String name;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	private int age;
	private String photoLocation;

	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(long document, String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super();
		this.document = document;
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.age = age;
		this.photoLocation = photoLocation;
	}

	public long getDocument() {
		return document;
	}

	public void setDocument(long document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhotoLocation() {
		return photoLocation;
	}

	public void setPhotoLocation(String photoLocation) {
		this.photoLocation = photoLocation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Person [document=" + document + ", name=" + name + ", dayOfBirth=" + dayOfBirth + ", montOfBirth="
				+ monthOfBirth + ", yearOfBirth=" + yearOfBirth + ", age=" + age + ", photoLocation=" + photoLocation
				+ "]";
	}

}
