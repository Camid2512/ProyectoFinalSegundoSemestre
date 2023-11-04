package co.edu.unbosque.model;

public class Perro {

	private String nombrePerro;
	private String edadMeses;
	private String raza;
	private boolean esMacho;
	private String nombreDueno;

	public Perro() {
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombrePerro, String edadMeses, String raza, boolean esMacho, String nombreDueno) {
		super();
		this.nombrePerro = nombrePerro;
		this.edadMeses = edadMeses;
		this.raza = raza;
		this.esMacho = esMacho;
		this.nombreDueno = nombreDueno;
	}

	public String getNombrePerro() {
		return nombrePerro;
	}

	public void setNombrePerro(String nombrePerro) {
		this.nombrePerro = nombrePerro;
	}

	public String getEdadMeses() {
		return edadMeses;
	}

	public void setEdadMeses(String edadMeses) {
		this.edadMeses = edadMeses;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isEsMacho() {
		return esMacho;
	}

	public void setEsMacho(boolean esMacho) {
		this.esMacho = esMacho;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		StringBuilder cadena = new StringBuilder();

		cadena.append("Nombre perro: " + nombrePerro + "\n");
		cadena.append("Edad en meses de la mascota: " + edadMeses + "\n");
		cadena.append("Raza: " + raza + "\n");
		cadena.append("Sexo: " + (esMacho ? "MACHO" : "HEMBRA") + "\n");
		cadena.append("Nombre Duenio: " + nombreDueno + "\n");

		return cadena.toString();
	}

}
