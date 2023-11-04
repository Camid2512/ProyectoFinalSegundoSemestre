package co.edu.unbosque.model;

public class PalabraDTO {

	private String palabra;
	private String significado;

	public PalabraDTO() {
		// TODO Auto-generated constructor stub
	}

	public PalabraDTO(String palabra, String significado) {
		super();
		this.palabra = palabra;
		this.significado = significado;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	@Override
	public String toString() {
		return "PalabraDTO [palabra=" + palabra + "\n significado=" + significado + "]";
	}

}
