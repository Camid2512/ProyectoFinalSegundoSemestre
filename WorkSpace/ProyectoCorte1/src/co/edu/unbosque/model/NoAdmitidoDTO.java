package co.edu.unbosque.model;

public class NoAdmitidoDTO extends PersonaDTO {

	private String ciudadExpulsion;
	private String fechaExpulsion;
	private String motivoExpulsion;

	public NoAdmitidoDTO() {
		// TODO Auto-generated constructor stub
	}

	public NoAdmitidoDTO(String documento, String fechaNacimiento, int edadExacta, String nombreCompleto,
			String paisOrigen, String ciudadOrigen) {
		super(documento, fechaNacimiento, edadExacta, nombreCompleto, paisOrigen, ciudadOrigen);
		// TODO Auto-generated constructor stub
	}

	public NoAdmitidoDTO(String documento, String fechaNacimiento, int edadExacta, String nombreCompleto,
			String paisOrigen, String ciudadOrigen, String ciudadExpulsion, String fechaExpulsion,
			String motivoExpulsion) {
		super(documento, fechaNacimiento, edadExacta, nombreCompleto, paisOrigen, ciudadOrigen);
		this.ciudadExpulsion = ciudadExpulsion;
		this.fechaExpulsion = fechaExpulsion;
		this.motivoExpulsion = motivoExpulsion;
	}

	public NoAdmitidoDTO(String ciudadExpulsion, String fechaExpulsion, String motivoExpulsion) {
		super();
		this.ciudadExpulsion = ciudadExpulsion;
		this.fechaExpulsion = fechaExpulsion;
		this.motivoExpulsion = motivoExpulsion;
	}

	public String getCiudadExpulsion() {
		return ciudadExpulsion;
	}

	public void setCiudadExpulsion(String ciudadExpulsion) {
		this.ciudadExpulsion = ciudadExpulsion;
	}

	public String getFechaExpulsion() {
		return fechaExpulsion;
	}

	public void setFechaExpulsion(String fechaExpulsion) {
		this.fechaExpulsion = fechaExpulsion;
	}

	public String getMotivoExpulsion() {
		return motivoExpulsion;
	}

	public void setMotivoExpulsion(String motivoExpulsion) {
		this.motivoExpulsion = motivoExpulsion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder cadena = new StringBuilder();
		cadena.append("La ciudad de expulsion de la persona es: " + ciudadExpulsion + "\n");
		cadena.append("La fecha de expulsion de la persona es " + fechaExpulsion + "\n");
		cadena.append("El motivo de expulsion de la persona es: " + motivoExpulsion + "\n");
		return super.toString() + cadena.toString();
	}

}
