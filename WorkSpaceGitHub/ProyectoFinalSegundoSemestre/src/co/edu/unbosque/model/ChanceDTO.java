package co.edu.unbosque.model;


public class ChanceDTO extends BetDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4255194954611632980L;
	private String loteryName;
	private int numbers;

	public ChanceDTO() {
		// TODO Auto-generated constructor stub
	}

	public ChanceDTO(String loteryName, int numbers) {
		super();
		this.loteryName = loteryName;
		this.numbers = numbers;
	}

	public ChanceDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	public ChanceDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document, String loteryName, int numbers) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		this.loteryName = loteryName;
		this.numbers = numbers;
	}

	public String getLoteryName() {
		return loteryName;
	}

	public void setLoteryName(String loteryName) {
		this.loteryName = loteryName;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "ChanceDTO [loteryName=" + loteryName + ", numbers=" + numbers + "]" + super.toString();
	}

}
