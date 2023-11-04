package co.edu.unbosque.model;

public class LocalMilitaryDTO extends MilitaryDTO {

	private static final long serialVersionUID = 3871099592303864508L;

	private String rank;
	private int serviceTime;

	public LocalMilitaryDTO() {
		// TODO Auto-generated constructor stub
	}

	public LocalMilitaryDTO(String rank, int serviceTime) {
		super();
		this.rank = rank;
		this.serviceTime = serviceTime;
	}

	public LocalMilitaryDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		// TODO Auto-generated constructor stub
	}

	public LocalMilitaryDTO(long document, String name, int dayOfBirth, int montOfBirth, int yearOfBirth, int age,
			String photoLocation, String rank, int serviceTime) {
		super(document, name, dayOfBirth, montOfBirth, yearOfBirth, age, photoLocation);
		this.rank = rank;
		this.serviceTime = serviceTime;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return super.toString() + "LocalMilitary [rank=" + rank + ", serviceTime=" + serviceTime + "]";
	}

}
