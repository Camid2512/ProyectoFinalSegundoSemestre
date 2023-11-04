package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistance.AdmitidoDAO;
import co.edu.unbosque.view.AdmitidoWindow;
import co.edu.unbosque.view.CrearAdmitidoWindow;
import co.edu.unbosque.view.MainWindow;

public class Controller implements ActionListener {

	private MainWindow mw;
	private AdmitidoWindow aw;
	private CrearAdmitidoWindow caw;
	private AdmitidoDAO adao;

	public Controller() {
		mw = new MainWindow();
		aw = new AdmitidoWindow();
		caw = new CrearAdmitidoWindow();

		adao = new AdmitidoDAO();
		agregarLectores();
	}

	public void run() {
		mw.setVisible(true);
		aw.setVisible(false);
		caw.setVisible(false);

	}

	public void agregarLectores() {
		// Lectores ventana principal
		mw.getAdmitidobt().addActionListener(this);
		mw.getAdmitidobt().setActionCommand("btnad");
		mw.getNoAdmitidobt().addActionListener(this);
		mw.getNoAdmitidobt().setActionCommand("btnnoad");

		// Lectores Admitidos window
		aw.getCrear().addActionListener(this);
		aw.getCrear().setActionCommand("crearAdm");

		caw.getAceptar().addActionListener(this);
		caw.getAceptar().setActionCommand("aceptarbtn");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "btnad": {
			aw.setVisible(true);

			break;
		}
		case "crearAdm": {
			caw.setVisible(true);

			break;
		}
		case "aceptarbtn": {

			LocalDate hoy = LocalDate.now();
			String documento;
			String fechaNacimiento;
			int edadExacta;
			String nombreCompleto;
			String paisOrigen;
			String ciudadOrigen;
			String fechaEntrada;
			String horaEntrada;
			String fechaSalida;
			int diasEstadia;

			documento = caw.getDocumentoFi().getText();
			fechaNacimiento = caw.getFechaNacimientoFi().getText();
			LocalDate fechaNac = LocalDate.parse(fechaNacimiento);
			edadExacta = Period.between(fechaNac, hoy).getYears();

			nombreCompleto = caw.getNombreCompletoFi().getText();
			paisOrigen = caw.getPaisOrigenFi().getText();
			ciudadOrigen = caw.getCiudadOrigenFi().getText();

			fechaEntrada = caw.getFechaEntradaFi().getText();
			LocalDate fechaEntra = LocalDate.parse(fechaEntrada);

			horaEntrada = caw.getHoraEntradaFi().getText();

			fechaSalida = caw.getFechaSalidaFi().getText();
			LocalDate fechaSal = LocalDate.parse(fechaSalida);

			diasEstadia = Period.between(fechaEntra, fechaSal).getDays();

			adao.crear(documento, fechaNacimiento, Integer.toString(edadExacta), nombreCompleto, paisOrigen,
					ciudadOrigen, fechaEntrada, horaEntrada, fechaSalida, Integer.toString(diasEstadia));

			break;
		}
		default:
			break;
		}

	}

}
