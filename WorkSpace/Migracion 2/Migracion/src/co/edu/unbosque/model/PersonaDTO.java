package co.edu.unbosque.model;

import java.time.LocalDate;

public class PersonaDTO {
	
	private long numDocumento;
	private String nombreCompleto;
	private int diaNacimiento;
	private int mesNacimiento;
	private int anoNacimiento;
	private String pais;
	private String ciudadOrigen;

	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(long numDocumento, String nombreCompleto, int diaNacimiento, int mesNacimiento, int anoNacimiento,
			String pais, String ciudadOrigen) {
		super();
		this.numDocumento = numDocumento;
		this.nombreCompleto = nombreCompleto;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.anoNacimiento = anoNacimiento;
		this.pais = pais;
		this.ciudadOrigen = ciudadOrigen;
	}

	public long getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(long numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getDia() {
		return diaNacimiento;
	}

	public void setDia(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}

	public int getMes() {
		return mesNacimiento;
	}

	public void setMes(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}

	public int getAno() {
		return anoNacimiento;
	}

	public void setAno(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String calcularEdad(int anoNacido) {
		LocalDate fechaActual = LocalDate.now();
		LocalDate edadCalculada = fechaActual.minusYears(anoNacimiento);
		return "Edad:" + edadCalculada;

	}

	@Override
	public String toString() {

		StringBuilder cadena = new StringBuilder();
		cadena.append("Numero de Documento: " + numDocumento + "\n");
		cadena.append("Nombre: " + nombreCompleto + "\n");
		cadena.append("Fecha de nacimiento: " + diaNacimiento + "/" + mesNacimiento + "/" + anoNacimiento + "\n");
		cadena.append("Pais origen: " + pais + "\n");
		cadena.append("Ciudad origen: " + ciudadOrigen + "\n");
		// TODO Auto-generated method stub
		return cadena.toString();
	}

}
