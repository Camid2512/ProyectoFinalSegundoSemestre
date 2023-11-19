package co.edu.unbosque.model;

import java.io.Serializable;

public class BallotDTO extends BetDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5504939515313427010L;
	private int number;

	public BallotDTO() {
		// TODO Auto-generated constructor stub
	}

	public BallotDTO(int number) {
		super();
		this.number = number;
	}

	public BallotDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	public BallotDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document, int number) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BallotDTO [number=" + number + "]" + super.toString();
	}

}
