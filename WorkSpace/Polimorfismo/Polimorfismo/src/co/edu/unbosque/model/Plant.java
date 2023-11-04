package co.edu.unbosque.model;

public abstract class Plant {
	private String name;
	private String scientificName;
	private boolean isFloral;

	public Plant() {

	}

	public Plant(String name, String scientificName, boolean isFloral) {
		super();
		this.name = name;
		this.scientificName = scientificName;
		this.isFloral = isFloral;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public boolean isFloral() {
		return isFloral;
	}

	public void setFloral(boolean isFloral) {
		this.isFloral = isFloral;
	}

	@Override
	public String toString() {
		return "Plant [name=" + name + ", scientificName=" + scientificName + ", isFloral=" + isFloral + "]" + "\n";
	}

	public String doPhotosysntesis() {
		return "Usamos los cloroplastos para hacer la fotosintesis";
	}

	public abstract String grow();

}
