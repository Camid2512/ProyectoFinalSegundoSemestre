package co.edu.unbosque.model;

public class SuperAstroDTO extends BetDTO {

	private int number;
	private String zodiacSign;

	public SuperAstroDTO() {
		// TODO Auto-generated constructor stub
	}

	public SuperAstroDTO(int number, String zodiacSign) {
		super();
		this.number = number;
		this.zodiacSign = zodiacSign;
	}

	public SuperAstroDTO(int day, int month, int year, double betPlaced, String headQuarterName, long document,
			int number, String zodiacSign) {
		super(day, month, year, betPlaced, headQuarterName, document);
		this.number = number;
		this.zodiacSign = zodiacSign;
	}

	public SuperAstroDTO(int day, int month, int year, double betPlaced, String headQuarterName, long document) {
		super(day, month, year, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getZodiacSign() {
		return zodiacSign;
	}

	public void setZodiacSign(String zodiacSign) {
		this.zodiacSign = zodiacSign;
	}

	@Override
	public String toString() {
		return "SuperAstroDTO [number=" + number + ", zodiacSign=" + zodiacSign + "]" + super.toString();
	}

}
