package co.edu.unbosque.model;

public class LoteryBetDTO extends BetDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -670184573400479029L;
	private String loteryName;
	private int numbers;
	private int serialNum;

	public LoteryBetDTO() {
		// TODO Auto-generated constructor stub
	}

	public LoteryBetDTO(String loteryName, int numbers, int serialNum) {
		super();
		this.loteryName = loteryName;
		this.numbers = numbers;
		this.serialNum = serialNum;
	}

	public LoteryBetDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	public LoteryBetDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document, String loteryName, int numbers, int serialNum) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		this.loteryName = loteryName;
		this.numbers = numbers;
		this.serialNum = serialNum;
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

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	@Override
	public String toString() {
		return "LoteryBetDTO [loteryName=" + loteryName + ", numbers=" + numbers + ", serialNum=" + serialNum + "]"
				+ super.toString();
	}

}
