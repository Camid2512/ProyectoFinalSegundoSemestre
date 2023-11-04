package co.edu.unbosque.model;

public class BushDTO extends Plant {

	private boolean isPoisonous;

	public BushDTO() {
		// TODO Auto-generated constructor stub
	}

	public BushDTO(boolean isPoisonous) {
		super();
		this.isPoisonous = isPoisonous;
	}

	public BushDTO(String name, String scientificName, boolean isFloral, boolean isPoisonous) {
		super(name, scientificName, isFloral);
		this.isPoisonous = isPoisonous;
	}

	public BushDTO(String name, String scientificName, boolean isFloral) {
		super(name, scientificName, isFloral);
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	@Override
	public String toString() {
		return super.toString() + "BushDTO [isPoisonous=" + isPoisonous + "]\n";
	}

	@Override
	public String grow() {
		return "Los arbustos crecen poco en altura pero mucho en ancho";
	}

}
