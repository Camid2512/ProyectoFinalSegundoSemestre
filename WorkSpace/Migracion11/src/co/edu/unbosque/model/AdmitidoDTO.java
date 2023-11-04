package co.edu.unbosque.model;

import java.time.LocalDate;

public class AdmitidoDTO extends PersonaDTO{
	
	private int diaEntrada;
	private int mesEntrada;
	private int anoEntrada;
	private int horaEntrada;
	private int minutoEntrada;
	private int diasEstadia;

	public AdmitidoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AdmitidoDTO(int diaEntrada, int mesEntrada, int anoEntrada, int horaEntrada, int minutoEntrada,
			int diasEstadia) {
		super();
		this.diaEntrada = diaEntrada;
		this.mesEntrada = mesEntrada;
		this.anoEntrada = anoEntrada;
		this.horaEntrada = horaEntrada;
		this.minutoEntrada = minutoEntrada;
		this.diasEstadia = diasEstadia;
	}

	public AdmitidoDTO(long numDocumento, String nombreCompleto, int dia, int mes, int ano, String pais,
			String ciudadOrigen) {
		super(numDocumento, nombreCompleto, dia, mes, ano, pais, ciudadOrigen);
		// TODO Auto-generated constructor stub
	}

	public AdmitidoDTO(long numDocumento, String nombreCompleto, int dia, int mes, int ano, String pais,
			String ciudadOrigen, int diaEntrada, int mesEntrada, int anoEntrada, int horaEntrada, int minutoEntrada,
			int diasEstadia) {
		super(numDocumento, nombreCompleto, dia, mes, ano, pais, ciudadOrigen);
		this.diaEntrada = diaEntrada;
		this.mesEntrada = mesEntrada;
		this.anoEntrada = anoEntrada;
		this.horaEntrada = horaEntrada;
		this.minutoEntrada = minutoEntrada;
		this.diasEstadia = diasEstadia;
	}

	public int getDiaEntrada() {
		return diaEntrada;
	}

	public void setDiaEntrada(int diaEntrada) {
		this.diaEntrada = diaEntrada;
	}

	public int getMesEntrada() {
		return mesEntrada;
	}

	public void setMesEntrada(int mesEntrada) {
		this.mesEntrada = mesEntrada;
	}

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getMinutoEntrada() {
		return minutoEntrada;
	}

	public void setMinutoEntrada(int minutoEntrada) {
		this.minutoEntrada = minutoEntrada;
	}

	public int getDiasEstadia() {
		return diasEstadia;
	}

	public void setDiasEstadia(int diasEstadia) {
		this.diasEstadia = diasEstadia;
	}

	public String calcularFechaSalida() {

		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaSalida = fechaActual.plusDays(diasEstadia);

		return "Fecha de salida: " + fechaSalida;
	}

	@Override
	public String toString() {

		StringBuilder cadena = new StringBuilder();

		cadena.append("Fecha de entrada: " + diaEntrada + "/" + mesEntrada + "/" + anoEntrada + "/" + "\n");
		cadena.append("Hora de entrada: " + horaEntrada + ":" + minutoEntrada + "\n");
		cadena.append("Dias estadia: " + diasEstadia + "\n");

		// TODO Auto-generated method stub
		return super.toString() + cadena.toString();
	}

}
