package co.edu.unbosque.model;

public class Gato {

	private String nombreGato;
	private int edadAnos;
	private String raza;
	private String comidaFavorita;
	private String nombreDuena;

	public Gato() {
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombreGato, int edadAnos, String raza, String comidaFavorita, String nombreDuena) {
		super();
		this.nombreGato = nombreGato;
		this.edadAnos = edadAnos;
		this.raza = raza;
		this.comidaFavorita = comidaFavorita;
		this.nombreDuena = nombreDuena;
	}

	public String getNombreGato() {
		return nombreGato;
	}

	public void setNombreGato(String nombreGato) {
		this.nombreGato = nombreGato;
	}

	public int getEdadAnos() {
		return edadAnos;
	}

	public void setEdadAnos(int edadAnos) {
		this.edadAnos = edadAnos;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getComidaFavorita() {
		return comidaFavorita;
	}

	public void setComidaFavorita(String comidaFavorita) {
		this.comidaFavorita = comidaFavorita;
	}

	public String getNombreDuena() {
		return nombreDuena;
	}

	public void setNombreDuena(String nombreDuena) {
		this.nombreDuena = nombreDuena;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder cadena = new StringBuilder();
		cadena.append("Nombre gato: " + nombreGato + "\n");
		cadena.append("Edad anios: " + edadAnos + "\n");
		cadena.append("Marca preferida para purina: " + comidaFavorita + "\n");
		cadena.append("Nombre duena/o: " + nombreDuena + "\n");

		return cadena.toString();
	}

}
