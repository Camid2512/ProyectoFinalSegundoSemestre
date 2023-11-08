package co.edu.unbosque.model;

public class BetPlayDTO extends BetDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6649047852911984639L;
	private String team1;
	private String team2;
	private String team3;
	private String team4;
	private String team5;
	private String team6;
	private String team7;
	private String team8;
	private String team9;
	private String team10;
	private String team11;
	private String team12;
	private String team13;
	private String team14;
	private String team15;
	private String team16;
	private String team17;
	private String team18;
	private String team19;
	private String team20;

	private int gameResult;

	public BetPlayDTO() {
		// TODO Auto-generated constructor stub
	}

	public BetPlayDTO(String team1, String team2, String team3, String team4, String team5, String team6, String team7,
			String team8, String team9, String team10, String team11, String team12, String team13, String team14,
			String team15, String team16, String team17, String team18, String team19, String team20, int gameResult) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
		this.team4 = team4;
		this.team5 = team5;
		this.team6 = team6;
		this.team7 = team7;
		this.team8 = team8;
		this.team9 = team9;
		this.team10 = team10;
		this.team11 = team11;
		this.team12 = team12;
		this.team13 = team13;
		this.team14 = team14;
		this.team15 = team15;
		this.team16 = team16;
		this.team17 = team17;
		this.team18 = team18;
		this.team19 = team19;
		this.team20 = team20;
		this.gameResult = gameResult;
	}

	public BetPlayDTO(int day, int month, int year, double betPlaced, String headQuarterName, long document,
			String team1, String team2, String team3, String team4, String team5, String team6, String team7,
			String team8, String team9, String team10, String team11, String team12, String team13, String team14,
			String team15, String team16, String team17, String team18, String team19, String team20, int gameResult) {
		super(day, month, year, betPlaced, headQuarterName, document);
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
		this.team4 = team4;
		this.team5 = team5;
		this.team6 = team6;
		this.team7 = team7;
		this.team8 = team8;
		this.team9 = team9;
		this.team10 = team10;
		this.team11 = team11;
		this.team12 = team12;
		this.team13 = team13;
		this.team14 = team14;
		this.team15 = team15;
		this.team16 = team16;
		this.team17 = team17;
		this.team18 = team18;
		this.team19 = team19;
		this.team20 = team20;
		this.gameResult = gameResult;
	}

	public BetPlayDTO(int day, int month, int year, double betPlaced, String headQuarterName, long document) {
		super(day, month, year, betPlaced, headQuarterName, document);
		// TODO Auto-generated constructor stub
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getTeam3() {
		return team3;
	}

	public void setTeam3(String team3) {
		this.team3 = team3;
	}

	public String getTeam4() {
		return team4;
	}

	public void setTeam4(String team4) {
		this.team4 = team4;
	}

	public String getTeam5() {
		return team5;
	}

	public void setTeam5(String team5) {
		this.team5 = team5;
	}

	public String getTeam6() {
		return team6;
	}

	public void setTeam6(String team6) {
		this.team6 = team6;
	}

	public String getTeam7() {
		return team7;
	}

	public void setTeam7(String team7) {
		this.team7 = team7;
	}

	public String getTeam8() {
		return team8;
	}

	public void setTeam8(String team8) {
		this.team8 = team8;
	}

	public String getTeam9() {
		return team9;
	}

	public void setTeam9(String team9) {
		this.team9 = team9;
	}

	public String getTeam10() {
		return team10;
	}

	public void setTeam10(String team10) {
		this.team10 = team10;
	}

	public String getTeam11() {
		return team11;
	}

	public void setTeam11(String team11) {
		this.team11 = team11;
	}

	public String getTeam12() {
		return team12;
	}

	public void setTeam12(String team12) {
		this.team12 = team12;
	}

	public String getTeam13() {
		return team13;
	}

	public void setTeam13(String team13) {
		this.team13 = team13;
	}

	public String getTeam14() {
		return team14;
	}

	public void setTeam14(String team14) {
		this.team14 = team14;
	}

	public String getTeam15() {
		return team15;
	}

	public void setTeam15(String team15) {
		this.team15 = team15;
	}

	public String getTeam16() {
		return team16;
	}

	public void setTeam16(String team16) {
		this.team16 = team16;
	}

	public String getTeam17() {
		return team17;
	}

	public void setTeam17(String team17) {
		this.team17 = team17;
	}

	public String getTeam18() {
		return team18;
	}

	public void setTeam18(String team18) {
		this.team18 = team18;
	}

	public String getTeam19() {
		return team19;
	}

	public void setTeam19(String team19) {
		this.team19 = team19;
	}

	public String getTeam20() {
		return team20;
	}

	public void setTeam20(String team20) {
		this.team20 = team20;
	}

	public int getGameResult() {
		return gameResult;
	}

	public void setGameResult(int gameResult) {
		this.gameResult = gameResult;
	}

	@Override
	public String toString() {
		return "BetPlayDTO [team1=" + team1 + ", team2=" + team2 + ", team3=" + team3 + ", team4=" + team4 + ", team5="
				+ team5 + ", team6=" + team6 + ", team7=" + team7 + ", team8=" + team8 + ", team9=" + team9
				+ ", team10=" + team10 + ", team11=" + team11 + ", team12=" + team12 + ", team13=" + team13
				+ ", team14=" + team14 + ", team15=" + team15 + ", team16=" + team16 + ", team17=" + team17
				+ ", team18=" + team18 + ", team19=" + team19 + ", team20=" + team20 + ", gameResult=" + gameResult
				+ "]" + super.toString();
	}

}
