package co.edu.unbosque.model;

public class AdmitidoDTO extends PersonaDTO {

	private String fechaEntrada;
	private String horaEntrada;
	private int diasEstadia;
	private String fechaSalida;

	public AdmitidoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AdmitidoDTO(String documento, String fechaNacimiento, int edadExacta, String nombreCompleto,
			String paisOrigen, String ciudadOrigen) {
		super(documento, fechaNacimiento, edadExacta, nombreCompleto, paisOrigen, ciudadOrigen);
		// TODO Auto-generated constructor stub
	}

	public AdmitidoDTO(String fechaEntrada, String horaEntrada, int diasEstadia, String fechaSalida) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.horaEntrada = horaEntrada;
		this.diasEstadia = diasEstadia;
		this.fechaSalida = fechaSalida;
	}

	public AdmitidoDTO(String documento, String fechaNacimiento, int edadExacta, String nombreCompleto,
			String paisOrigen, String ciudadOrigen, String fechaEntrada, String horaEntrada, int diasEstadia,
			String fechaSalida) {
		super(documento, fechaNacimiento, edadExacta, nombreCompleto, paisOrigen, ciudadOrigen);
		this.fechaEntrada = fechaEntrada;
		this.horaEntrada = horaEntrada;
		this.diasEstadia = diasEstadia;
		this.fechaSalida = fechaSalida;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getDiasEstadia() {
		return diasEstadia;
	}

	public void setDiasEstadia(int diasEstadia) {
		this.diasEstadia = diasEstadia;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder cadena = new StringBuilder();
		cadena.append("La fecha de entrada de la persona es: " + fechaEntrada + "\n");
		cadena.append("La hora de entrada de la persona es: " + horaEntrada + "\n");
		cadena.append("La fecha de salida de la persona es: " + fechaSalida + "\n");
		cadena.append("La persona va a estar en el pais: " + diasEstadia + " dias " + "\n");
		return super.toString() + cadena.toString();
	}
}
