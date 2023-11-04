package co.edu.unbosque.model;

public class InvernalTreeDTO extends TreeDTO {

	private float minTemperature;

	public InvernalTreeDTO() {
		// TODO Auto-generated constructor stub
	}

	public InvernalTreeDTO(float minTemperature) {
		super();
		this.minTemperature = minTemperature;
	}

	public InvernalTreeDTO(String name, String scientificName, boolean isFloral, float minTemperature) {
		super(name, scientificName, isFloral);
		this.minTemperature = minTemperature;
	}

	public InvernalTreeDTO(String name, String scientificName, boolean isFloral, float logWidth, float minTemperature) {
		super(name, scientificName, isFloral, logWidth);
		this.minTemperature = minTemperature;
	}

	public InvernalTreeDTO(float logWidth, float minTemperature) {
		super(logWidth);
		this.minTemperature = minTemperature;
	}

	public InvernalTreeDTO(String name, String scientificName, boolean isFloral) {
		super(name, scientificName, isFloral);
		// TODO Auto-generated constructor stub
	}

	public float getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(float minTemperature) {
		this.minTemperature = minTemperature;
	}

	@Override
	public String toString() {
		return super.toString() + "InvernalTreeDTO [minTemperature=" + minTemperature + "]\n";
	}

}
