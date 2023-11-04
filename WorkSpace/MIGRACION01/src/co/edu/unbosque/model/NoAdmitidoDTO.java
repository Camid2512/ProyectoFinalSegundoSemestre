package co.edu.unbosque.model;

public class NoAdmitidoDTO extends PersonaDTO{
	
	private String ciudadDevolucion;
	private int diaExpulsion;
	private int mesExpulsion;
	private int anoExpulsion;
	private String motivoExpulsion;

	public NoAdmitidoDTO() {
		// TODO Auto-generated constructor stub
	}

	public NoAdmitidoDTO(String ciudadDevolucion, int diaExpulsion, int mesExpulsion, int anoExpulsion,
			String motivoExpulsion) {
		super();
		this.ciudadDevolucion = ciudadDevolucion;
		this.diaExpulsion = diaExpulsion;
		this.mesExpulsion = mesExpulsion;
		this.anoExpulsion = anoExpulsion;
		this.motivoExpulsion = motivoExpulsion;
	}

	public NoAdmitidoDTO(long numDocumento, String nombreCompleto, int dia, int mes, int ano, String pais,
			String ciudadOrigen) {
		super(numDocumento, nombreCompleto, dia, mes, ano, pais, ciudadOrigen);
		// TODO Auto-generated constructor stub
	}

	public NoAdmitidoDTO(long numDocumento, String nombreCompleto, int dia, int mes, int ano, String pais,
			String ciudadOrigen, String ciudadDevolucion, int diaExpulsion, int mesExpulsion, int anoExpulsion,
			String motivoExpulsion) {
		super(numDocumento, nombreCompleto, dia, mes, ano, pais, ciudadOrigen);
		this.ciudadDevolucion = ciudadDevolucion;
		this.diaExpulsion = diaExpulsion;
		this.mesExpulsion = mesExpulsion;
		this.anoExpulsion = anoExpulsion;
		this.motivoExpulsion = motivoExpulsion;
	}

	public String getCiudadDevolucion() {
		return ciudadDevolucion;
	}

	public void setCiudadDevolucion(String ciudadDevolucion) {
		this.ciudadDevolucion = ciudadDevolucion;
	}

	public int getDiaExpulsion() {
		return diaExpulsion;
	}

	public void setDiaExpulsion(int diaExpulsion) {
		this.diaExpulsion = diaExpulsion;
	}

	public int getMesExpulsion() {
		return mesExpulsion;
	}

	public void setMesExpulsion(int mesExpulsion) {
		this.mesExpulsion = mesExpulsion;
	}

	public int getAnoExpulsion() {
		return anoExpulsion;
	}

	public void setAnoExpulsion(int anoExpulsion) {
		this.anoExpulsion = anoExpulsion;
	}

	public String getMotivoExpulsion() {
		return motivoExpulsion;
	}

	public void setMotivoExpulsion(String motivoExpulsion) {
		this.motivoExpulsion = motivoExpulsion;
	}

	@Override
	public String toString() {

		StringBuilder cadena = new StringBuilder();
		cadena.append("Ciudad Devolucion: " + ciudadDevolucion + "\n");
		cadena.append("Fecha expulsion: " + diaExpulsion + "/" + mesExpulsion + "/" + anoExpulsion + "\n");
		cadena.append("Motivo expulsion: " + motivoExpulsion + "\n");

		// TODO Auto-generated method stub
		return super.toString() + cadena.toString();
	}

}
