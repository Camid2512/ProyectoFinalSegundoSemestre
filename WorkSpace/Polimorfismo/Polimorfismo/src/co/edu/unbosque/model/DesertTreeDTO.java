package co.edu.unbosque.model;

public class DesertTreeDTO extends TreeDTO {

	private float maxTemperature;

	public DesertTreeDTO() {
		// TODO Auto-generated constructor stub
	}

	public DesertTreeDTO(float maxTemperature) {
		super();
		this.maxTemperature = maxTemperature;
	}

	public DesertTreeDTO(String name, String scientificName, boolean isFloral, float maxTemperature) {
		super(name, scientificName, isFloral);
		this.maxTemperature = maxTemperature;
	}

	public DesertTreeDTO(String name, String scientificName, boolean isFloral, float logWidth, float maxTemperature) {
		super(name, scientificName, isFloral, logWidth);
		this.maxTemperature = maxTemperature;
	}

	public DesertTreeDTO(float logWidth, float maxTemperature) {
		super(logWidth);
		this.maxTemperature = maxTemperature;
	}

	public DesertTreeDTO(String name, String scientificName, boolean isFloral) {
		super(name, scientificName, isFloral);
		// TODO Auto-generated constructor stub
	}

	public float getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(float maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	@Override
	public String toString() {
		return super.toString() + "DesertTreeDTO [maxTemperature=" + maxTemperature + "]" + "\n";
	}

}
