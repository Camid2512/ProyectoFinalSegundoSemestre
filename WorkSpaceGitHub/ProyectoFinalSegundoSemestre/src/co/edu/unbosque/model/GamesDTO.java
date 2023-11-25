/**
 * Objeto de transferencia de juegos. Esta clase implementa Serializable
 * para permitir la serialización de objetos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Objeto de transferencia de juegos. Esta clase implementa Serializable para
 * permitir la serialización de objetos.
 */
public class GamesDTO implements Serializable {

	/**
	 * Identificador único de la versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = 1290552394653033596L;

	/**
	 * Atributos utilizados
	 */
	private String loteria, superAstro, baloto, betPlay, chance;
	private String typeLotery, typeChance, typeSport;
	private double budget1, budget2, budget3, budget4, budget5;

	/**
	 * Constructor vacío. Inicializa los atributos con valores predeterminados.
	 */
	public GamesDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de GamesDTO con información de los juegos y sus presupuestos.
	 */
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

	/**
	 * Obtiene el nombre del juego de lotería.
	 */
	public String getLoteria() {
		return loteria;
	}

	/**
	 * Establece el nombre del juego de lotería.
	 */
	public void setLoteria(String loteria) {
		this.loteria = loteria;
	}

	/**
	 * Obtiene el nombre del juego Super Astro.
	 */
	public String getSuperAstro() {
		return superAstro;
	}

	/**
	 * Establece el nombre del juego Super Astro.
	 */
	public void setSuperAstro(String superAstro) {
		this.superAstro = superAstro;
	}

	/**
	 * Obtiene el nombre del juego Baloto.
	 */
	public String getBaloto() {
		return baloto;
	}

	/**
	 * Establece el nombre del juego Baloto.
	 */
	public void setBaloto(String baloto) {
		this.baloto = baloto;
	}

	/**
	 * Obtiene el nombre del juego BetPlay.
	 */
	public String getBetPlay() {
		return betPlay;
	}

	/**
	 * Establece el nombre del juego BetPlay.
	 */
	public void setBetPlay(String betPlay) {
		this.betPlay = betPlay;
	}

	/**
	 * Obtiene el nombre del juego Chance.
	 */
	public String getChance() {
		return chance;
	}

	/**
	 * Establece el nombre del juego Chance.
	 */
	public void setChance(String chance) {
		this.chance = chance;
	}

	/**
	 * Obtiene el tipo de lotería.
	 */
	public String getTypeLotery() {
		return typeLotery;
	}

	/**
	 * Establece el tipo de lotería.
	 */
	public void setTypeLotery(String typeLotery) {
		this.typeLotery = typeLotery;
	}

	/**
	 * Obtiene el tipo de chance.
	 */
	public String getTypeChance() {
		return typeChance;
	}

	/**
	 * Establece el tipo de chance.
	 */
	public void setTypeChance(String typeChance) {
		this.typeChance = typeChance;
	}

	/**
	 * Obtiene el tipo de deporte.
	 */
	public String getTypeSport() {
		return typeSport;
	}

	/**
	 * Establece el tipo de deporte.
	 */
	public void setTypeSport(String typeSport) {
		this.typeSport = typeSport;
	}

	/**
	 * Obtiene el presupuesto para el juego 1.
	 */
	public double getBudget1() {
		return budget1;
	}

	/**
	 * Establece el presupuesto para el juego 1.
	 */
	public void setBudget1(double budget1) {
		this.budget1 = budget1;
	}

	/**
	 * Obtiene el presupuesto para el juego 2.
	 */
	public double getBudget2() {
		return budget2;
	}

	/**
	 * Establece el presupuesto para el juego 2.
	 */
	public void setBudget2(double budget2) {
		this.budget2 = budget2;
	}

	/**
	 * Obtiene el presupuesto para el juego 3.
	 */
	public double getBudget3() {
		return budget3;
	}

	/**
	 * Establece el presupuesto para el juego 3.
	 */
	public void setBudget3(double budget3) {
		this.budget3 = budget3;
	}

	/**
	 * Obtiene el presupuesto para el juego 4.
	 */
	public double getBudget4() {
		return budget4;
	}

	/**
	 * Establece el presupuesto para el juego 4.
	 */
	public void setBudget4(double budget4) {
		this.budget4 = budget4;
	}

	/**
	 * Obtiene el presupuesto para el juego 5.
	 */
	public double getBudget5() {
		return budget5;
	}

	/**
	 * Establece el presupuesto para el juego 5.
	 */
	public void setBudget5(double budget5) {
		this.budget5 = budget5;
	}

	/**
	 * Obtiene el valor del serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Genera una representación en cadena de esta instancia.
	 */
	@Override
	public String toString() {
		return "GamesDTO [loteria=" + loteria + ", superAstro=" + superAstro + ", baloto=" + baloto + ", betPlay="
				+ betPlay + ", chance=" + chance + ", typeLotery=" + typeLotery + ", typeChance=" + typeChance
				+ ", typeSport=" + typeSport + ", budget1=" + budget1 + ", budget2=" + budget2 + ", budget3=" + budget3
				+ ", budget4=" + budget4 + ", budget5=" + budget5 + "]";
	}

}
