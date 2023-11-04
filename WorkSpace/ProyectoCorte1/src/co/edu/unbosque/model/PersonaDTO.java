package co.edu.unbosque.model;

public class PersonaDTO {

	private String documento;
	private String fechaNacimiento;
	private int edadExacta;
	private String nombreCompleto;
	private String paisOrigen;
	private String ciudadOrigen;

	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(String documento, String fechaNacimiento, int edadExacta, String nombreCompleto,
			String paisOrigen, String ciudadOrigen) {
		super();
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.edadExacta = edadExacta;
		this.nombreCompleto = nombreCompleto;
		this.paisOrigen = paisOrigen;
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdadExacta() {
		return edadExacta;
	}

	public void setEdadExacta(int edadExacta) {
		this.edadExacta = edadExacta;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder cadena = new StringBuilder();
		cadena.append("El documento de la persona es: " + documento + "\n");
		cadena.append("La fecha de nacimiento de la persona es: " + fechaNacimiento + "\n");
		cadena.append("El nombre de la persona es : " + nombreCompleto + "\n");
		cadena.append("El pais de origen de la persona es : " + paisOrigen + "\n");
		cadena.append("La ciudad de origen de la persona es : " + ciudadOrigen + "\n");
		cadena.append("La edad exacta de la persona es : " + edadExacta + " años " + "\n");

		return cadena.toString();
	}

}
