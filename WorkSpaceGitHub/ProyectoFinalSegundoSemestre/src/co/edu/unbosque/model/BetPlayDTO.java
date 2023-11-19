package co.edu.unbosque.model;

public class BetPlayDTO extends BetDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6649047852911984639L;
	private int match1;
	private int match2;
	private int match3;
	private int match4;
	private int match5;
	private int match6;
	private int match7;
	private int match8;
	private int match9;
	private int match10;
	private int match11;
	private int match12;
	private int match13;
	private int match14;

	public BetPlayDTO() {
		// TODO Auto-generated constructor stub
	}

	public BetPlayDTO(int match1, int match2, int match3, int match4, int match5, int match6, int match7, int match8,
			int match9, int match10, int match11, int match12, int match13, int match14) {
		super();
		this.match1 = match1;
		this.match2 = match2;
		this.match3 = match3;
		this.match4 = match4;
		this.match5 = match5;
		this.match6 = match6;
		this.match7 = match7;
		this.match8 = match8;
		this.match9 = match9;
		this.match10 = match10;
		this.match11 = match11;
		this.match12 = match12;
		this.match13 = match13;
		this.match14 = match14;
	}

	

	public BetPlayDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	public BetPlayDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document, int match1, int match2, int match3, int match4, int match5,
			int match6, int match7, int match8, int match9, int match10, int match11, int match12, int match13,
			int match14) {
		super(day, month, year, hour, minute, second, betPlaced, headQuarterName, document);
		this.match1 = match1;
		this.match2 = match2;
		this.match3 = match3;
		this.match4 = match4;
		this.match5 = match5;
		this.match6 = match6;
		this.match7 = match7;
		this.match8 = match8;
		this.match9 = match9;
		this.match10 = match10;
		this.match11 = match11;
		this.match12 = match12;
		this.match13 = match13;
		this.match14 = match14;
	}

	public int getMatch1() {
		return match1;
	}

	public void setMatch1(int match1) {
		this.match1 = match1;
	}

	public int getMatch2() {
		return match2;
	}

	public void setMatch2(int match2) {
		this.match2 = match2;
	}

	public int getMatch3() {
		return match3;
	}

	public void setMatch3(int match3) {
		this.match3 = match3;
	}

	public int getMatch4() {
		return match4;
	}

	public void setMatch4(int match4) {
		this.match4 = match4;
	}

	public int getMatch5() {
		return match5;
	}

	public void setMatch5(int match5) {
		this.match5 = match5;
	}

	public int getMatch6() {
		return match6;
	}

	public void setMatch6(int match6) {
		this.match6 = match6;
	}

	public int getMatch7() {
		return match7;
	}

	public void setMatch7(int match7) {
		this.match7 = match7;
	}

	public int getMatch8() {
		return match8;
	}

	public void setMatch8(int match8) {
		this.match8 = match8;
	}

	public int getMatch9() {
		return match9;
	}

	public void setMatch9(int match9) {
		this.match9 = match9;
	}

	public int getMatch10() {
		return match10;
	}

	public void setMatch10(int match10) {
		this.match10 = match10;
	}

	public int getMatch11() {
		return match11;
	}

	public void setMatch11(int match11) {
		this.match11 = match11;
	}

	public int getMatch12() {
		return match12;
	}

	public void setMatch12(int match12) {
		this.match12 = match12;
	}

	public int getMatch13() {
		return match13;
	}

	public void setMatch13(int match13) {
		this.match13 = match13;
	}

	public int getMatch14() {
		return match14;
	}

	public void setMatch14(int match14) {
		this.match14 = match14;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BetPlayDTO [match1=" + match1 + ", match2=" + match2 + ", match3=" + match3 + ", match4=" + match4
				+ ", match5=" + match5 + ", match6=" + match6 + ", match7=" + match7 + ", match8=" + match8
				+ ", match9=" + match9 + ", match10=" + match10 + ", match11=" + match11 + ", match12=" + match12
				+ ", match13=" + match13 + ", match14=" + match14 + "]";
	}

}
