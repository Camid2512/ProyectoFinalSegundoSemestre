package co.edu.unbosque.model;

public class TreeDTO extends Plant {

	private float logWidth;

	public TreeDTO() {
		// TODO Auto-generated constructor stub
	}

	public TreeDTO(String name, String scientificName, boolean isFloral) {
		super(name, scientificName, isFloral);
		// TODO Auto-generated constructor stub
	}

	public TreeDTO(String name, String scientificName, boolean isFloral, float logWidth) {
		super(name, scientificName, isFloral);
		this.logWidth = logWidth;
	}

	public TreeDTO(float logWidth) {
		super();
		this.logWidth = logWidth;
	}

	public float getLogWidth() {
		return logWidth;
	}

	public void setLogWidth(float logWidth) {
		this.logWidth = logWidth;
	}

	@Override
	public String grow() {
		return "Los arboles se destacan por tener gran altura, pero poco ancho";
	}

	@Override
	public String toString() {
		return super.toString() + "TreeDTO [logWidth=" + logWidth + "]" + "\n";
	}

}
