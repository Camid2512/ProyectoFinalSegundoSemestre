package co.edu.unbosque.model;

import java.io.Serializable;

public class GamesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1290552394653033596L;

	private String loteria, superAstro, baloto, betPlay, chance;
	private String typeLotery, typeChance, typeSport;
	private double budget1, budget2, budget3, budget4, budget5;

	public GamesDTO() {
		// TODO Auto-generated constructor stub
	}

	public GamesDTO(String loteria, String superAstro, String baloto, String betPlay, String chance, String typeLotery,
			String typeChance, String typeSport, double budget1, double budget2, double budget3, double budget4,
			double budget5) {
		super();
		this.loteria = loteria;
		this.superAstro = superAstro;
		this.baloto = baloto;
		this.betPlay = betPlay;
		this.chance = chance;
		this.typeLotery = typeLotery;
		this.typeChance = typeChance;
		this.typeSport = typeSport;
		this.budget1 = budget1;
		this.budget2 = budget2;
		this.budget3 = budget3;
		this.budget4 = budget4;
		this.budget5 = budget5;
	}

	public String getLoteria() {
		return loteria;
	}

	public void setLoteria(String loteria) {
		this.loteria = loteria;
	}

	public String getSuperAstro() {
		return superAstro;
	}

	public void setSuperAstro(String superAstro) {
		this.superAstro = superAstro;
	}

	public String getBaloto() {
		return baloto;
	}

	public void setBaloto(String baloto) {
		this.baloto = baloto;
	}

	public String getBetPlay() {
		return betPlay;
	}

	public void setBetPlay(String betPlay) {
		this.betPlay = betPlay;
	}

	public String getChance() {
		return chance;
	}

	public void setChance(String chance) {
		this.chance = chance;
	}

	public String getTypeLotery() {
		return typeLotery;
	}

	public void setTypeLotery(String typeLotery) {
		this.typeLotery = typeLotery;
	}

	public String getTypeChance() {
		return typeChance;
	}

	public void setTypeChance(String typeChance) {
		this.typeChance = typeChance;
	}

	public String getTypeSport() {
		return typeSport;
	}

	public void setTypeSport(String typeSport) {
		this.typeSport = typeSport;
	}

	public double getBudget1() {
		return budget1;
	}

	public void setBudget1(double budget1) {
		this.budget1 = budget1;
	}

	public double getBudget2() {
		return budget2;
	}

	public void setBudget2(double budget2) {
		this.budget2 = budget2;
	}

	public double getBudget3() {
		return budget3;
	}

	public void setBudget3(double budget3) {
		this.budget3 = budget3;
	}

	public double getBudget4() {
		return budget4;
	}

	public void setBudget4(double budget4) {
		this.budget4 = budget4;
	}

	public double getBudget5() {
		return budget5;
	}

	public void setBudget5(double budget5) {
		this.budget5 = budget5;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "GamesDTO [loteria=" + loteria + ", superAstro=" + superAstro + ", baloto=" + baloto + ", betPlay="
				+ betPlay + ", chance=" + chance + ", typeLotery=" + typeLotery + ", typeChance=" + typeChance
				+ ", typeSport=" + typeSport + ", budget1=" + budget1 + ", budget2=" + budget2 + ", budget3=" + budget3
				+ ", budget4=" + budget4 + ", budget5=" + budget5 + "]";
	}

}
