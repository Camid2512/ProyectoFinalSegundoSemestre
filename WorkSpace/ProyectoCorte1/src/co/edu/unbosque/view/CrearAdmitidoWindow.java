package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearAdmitidoWindow extends JFrame {

	private JPanel panelBotones, panelTxt;
	private JTextField documentoFi, fechaNacimientoFi, nombreCompletoFi, paisOrigenFi, ciudadOrigenFi, fechaEntradaFi,
			horaEntradaFi, fechaSalidaFi;
	private JLabel documentoTxt, fechaNacimientoTxt, nombreCompletoTxt, paisOrigenTxt, ciudadOrigenTxt, fechaEntradaTxt,
			horaEntradaTxt, fechaSalidaTxt, formatoFechaTxt;
	private JButton aceptar;

	public CrearAdmitidoWindow() {
		setBounds(0, 0, 500, 700);
		setResizable(false);
		setTitle("Crear admitido");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);

		// Panel texto
		documentoTxt = new JLabel("Imgrese Documento");
		documentoTxt.setBounds(0, 0, 200, 80);
		documentoTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));

		fechaNacimientoTxt = new JLabel("Ingrese Fecha Nacimiento");
		fechaNacimientoTxt.setBounds(0, 0, 250, 200);
		fechaNacimientoTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));

		nombreCompletoTxt = new JLabel("Ingrese Nombre Completo");
		nombreCompletoTxt.setBounds(0, 0, 250, 340);
		nombreCompletoTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));

		paisOrigenTxt = new JLabel("Ingrese Pais de Origen");
		paisOrigenTxt.setBounds(0, 0, 250, 480);
		paisOrigenTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));

		ciudadOrigenTxt = new JLabel("Ingrese Ciudad de Origen");
		ciudadOrigenTxt.setBounds(0, 0, 250, 630);
		ciudadOrigenTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));

		fechaEntradaTxt = new JLabel("Ingrese Fecha de entrada");
		fechaEntradaTxt.setBounds(0, 0, 250, 780);
		fechaEntradaTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));

		horaEntradaTxt = new JLabel("Ingrese Hora de entrada");
		horaEntradaTxt.setBounds(0, 0, 250, 920);
		horaEntradaTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));

		fechaSalidaTxt = new JLabel("Ingrese Fecha de salida");
		fechaSalidaTxt.setBounds(0, 0, 250, 1060);
		fechaSalidaTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));

		formatoFechaTxt = new JLabel("Formato de fechas (AAAA-MM-DD)");
		formatoFechaTxt.setBounds(0, 0, 250, 1210);
		formatoFechaTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 15));

		add(documentoTxt);
		add(fechaNacimientoTxt);
		add(nombreCompletoTxt);
		add(paisOrigenTxt);
		add(ciudadOrigenTxt);
		add(ciudadOrigenTxt);
		add(fechaEntradaTxt);
		add(horaEntradaTxt);
		add(fechaSalidaTxt);
		add(formatoFechaTxt);

		// Panel Botones
		panelBotones = new JPanel();
		documentoFi = new JTextField();
		fechaNacimientoFi = new JTextField();
		nombreCompletoFi = new JTextField();
		paisOrigenFi = new JTextField();
		ciudadOrigenFi = new JTextField();
		fechaEntradaFi = new JTextField();
		horaEntradaFi = new JTextField();
		fechaSalidaFi = new JTextField();

		panelBotones.setBounds(240, 0, 230, 560);
		panelBotones.setLayout(new GridLayout(8, 1));
		panelBotones.add(documentoFi);
		panelBotones.add(fechaNacimientoFi);
		panelBotones.add(nombreCompletoFi);
		panelBotones.add(paisOrigenFi);
		panelBotones.add(ciudadOrigenFi);
		panelBotones.add(fechaEntradaFi);
		panelBotones.add(horaEntradaFi);
		panelBotones.add(fechaSalidaFi);

		aceptar = new JButton("Aceptar");
		aceptar.setBounds(240, 580, 230, 60);

		add(panelBotones);
		add(aceptar);

	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

	public JPanel getPanelTxt() {
		return panelTxt;
	}

	public void setPanelTxt(JPanel panelTxt) {
		this.panelTxt = panelTxt;
	}

	public JTextField getDocumentoFi() {
		return documentoFi;
	}

	public void setDocumentoFi(JTextField documentoFi) {
		this.documentoFi = documentoFi;
	}

	public JTextField getFechaNacimientoFi() {
		return fechaNacimientoFi;
	}

	public void setFechaNacimientoFi(JTextField fechaNacimientoFi) {
		this.fechaNacimientoFi = fechaNacimientoFi;
	}

	public JTextField getNombreCompletoFi() {
		return nombreCompletoFi;
	}

	public void setNombreCompletoFi(JTextField nombreCompletoFi) {
		this.nombreCompletoFi = nombreCompletoFi;
	}

	public JTextField getPaisOrigenFi() {
		return paisOrigenFi;
	}

	public void setPaisOrigenFi(JTextField paisOrigenFi) {
		this.paisOrigenFi = paisOrigenFi;
	}

	public JTextField getCiudadOrigenFi() {
		return ciudadOrigenFi;
	}

	public void setCiudadOrigenFi(JTextField ciudadOrigenFi) {
		this.ciudadOrigenFi = ciudadOrigenFi;
	}

	public JTextField getFechaEntradaFi() {
		return fechaEntradaFi;
	}

	public void setFechaEntradaFi(JTextField fechaEntradaFi) {
		this.fechaEntradaFi = fechaEntradaFi;
	}

	public JTextField getHoraEntradaFi() {
		return horaEntradaFi;
	}

	public void setHoraEntradaFi(JTextField horaEntradaFi) {
		this.horaEntradaFi = horaEntradaFi;
	}

	public JTextField getFechaSalidaFi() {
		return fechaSalidaFi;
	}

	public void setFechaSalidaFi(JTextField fechaSalidaFi) {
		this.fechaSalidaFi = fechaSalidaFi;
	}

	public JLabel getDocumentoTxt() {
		return documentoTxt;
	}

	public void setDocumentoTxt(JLabel documentoTxt) {
		this.documentoTxt = documentoTxt;
	}

	public JLabel getFechaNacimientoTxt() {
		return fechaNacimientoTxt;
	}

	public void setFechaNacimientoTxt(JLabel fechaNacimientoTxt) {
		this.fechaNacimientoTxt = fechaNacimientoTxt;
	}

	public JLabel getNombreCompletoTxt() {
		return nombreCompletoTxt;
	}

	public void setNombreCompletoTxt(JLabel nombreCompletoTxt) {
		this.nombreCompletoTxt = nombreCompletoTxt;
	}

	public JLabel getPaisOrigenTxt() {
		return paisOrigenTxt;
	}

	public void setPaisOrigenTxt(JLabel paisOrigenTxt) {
		this.paisOrigenTxt = paisOrigenTxt;
	}

	public JLabel getCiudadOrigenTxt() {
		return ciudadOrigenTxt;
	}

	public void setCiudadOrigenTxt(JLabel ciudadOrigenTxt) {
		this.ciudadOrigenTxt = ciudadOrigenTxt;
	}

	public JLabel getFechaEntradaTxt() {
		return fechaEntradaTxt;
	}

	public void setFechaEntradaTxt(JLabel fechaEntradaTxt) {
		this.fechaEntradaTxt = fechaEntradaTxt;
	}

	public JLabel getHoraEntradaTxt() {
		return horaEntradaTxt;
	}

	public void setHoraEntradaTxt(JLabel horaEntradaTxt) {
		this.horaEntradaTxt = horaEntradaTxt;
	}

	public JLabel getFechaSalidaTxt() {
		return fechaSalidaTxt;
	}

	public void setFechaSalidaTxt(JLabel fechaSalidaTxt) {
		this.fechaSalidaTxt = fechaSalidaTxt;
	}

	public JLabel getFormatoFechaTxt() {
		return formatoFechaTxt;
	}

	public void setFormatoFechaTxt(JLabel formatoFechaTxt) {
		this.formatoFechaTxt = formatoFechaTxt;
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}

}
