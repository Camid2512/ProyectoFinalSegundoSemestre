package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.AdmitidoDAO;
import co.edu.unbosque.model.persistence.NoAdmitidoDAO;
import co.edu.unbosque.model.persistence.PersonaDAO;
import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.VentanaAdmitido;
import co.edu.unbosque.view.VentanaAdmitidoActualizar;
import co.edu.unbosque.view.VentanaAdmitidoCrear;
import co.edu.unbosque.view.VentanaAdmitidoEliminar;
import co.edu.unbosque.view.VentanaAdmitidoMostrar;
import co.edu.unbosque.view.VentanaNoAdmitido;
import co.edu.unbosque.view.VentanaNoAdmitidoActualizar;
import co.edu.unbosque.view.VentanaNoAdmitidoCrear;
import co.edu.unbosque.view.VentanaNoAdmitidoEliminar;
import co.edu.unbosque.view.VentanaNoAdmitidoMostrar;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaNoAdmitidoMostrar vam;
	private VentanaNoAdmitidoActualizar vana;
	private VentanaNoAdmitidoEliminar vae;
	private VentanaNoAdmitidoCrear vac;
	private VentanaAdmitidoActualizar vaa;
	private VentanaAdmitidoMostrar vm;
	private VentanaAdmitidoEliminar ve;
	private VentanaAdmitidoCrear vc;
	private VentanaNoAdmitido vn;
	private VentanaAdmitido va;
	private VentanaPrincipal vp;
	private Console con;
	private PersonaDAO pDAO;
	private AdmitidoDAO aDAO;
	private NoAdmitidoDAO noAdDAO;

	public Controller() {

		vam = new VentanaNoAdmitidoMostrar();
		vana = new VentanaNoAdmitidoActualizar();
		vae = new VentanaNoAdmitidoEliminar();
		vac = new VentanaNoAdmitidoCrear();
		vaa = new VentanaAdmitidoActualizar();
		vm = new VentanaAdmitidoMostrar();
		ve = new VentanaAdmitidoEliminar();
		vc = new VentanaAdmitidoCrear();
		vn = new VentanaNoAdmitido();
		va = new VentanaAdmitido();
		vp = new VentanaPrincipal();
		con = new Console();
		pDAO = new PersonaDAO();
		aDAO = new AdmitidoDAO();
		noAdDAO = new NoAdmitidoDAO();
		agregarLectores();
		// TODO Auto-generated constructor stub
	}

	public void agregarLectores() {

		ve.getEliminar1().addActionListener(this);
		ve.getEliminar1().setActionCommand("ELIMINAR ADMITIDO");

		vc.getGuardar().addActionListener(this);
		vc.getGuardar().setActionCommand("GUARDAR ADMITIDO");

		vaa.getActualizar().addActionListener(this);
		vaa.getActualizar().setActionCommand("ACTUALIZAR ADMITIDO");

		va.getMostrar().addActionListener(this);
		va.getMostrar().setActionCommand("MOSTRAR");

		vn.getAtras().addActionListener(this);
		vn.getAtras().setActionCommand("ATRAS N");

		vn.getMostrar().addActionListener(this);
		vn.getMostrar().setActionCommand("MOSTRAR N");

		vn.getActualizar().addActionListener(this);
		vn.getActualizar().setActionCommand("ACTUALIZAR N");

		vana.getGuardar().addActionListener(this);
		vana.getGuardar().setActionCommand("ACTUALIZAR NO ADMITIDO");

		vn.getEliminar().addActionListener(this);
		vn.getEliminar().setActionCommand("ELIMINAR N");

		vae.getEliminar1().addActionListener(this);
		vae.getEliminar1().setActionCommand("ELIMINAR NO ADMITIDO");

		vn.getCrear().addActionListener(this);
		vn.getCrear().setActionCommand("CREAR N");

		vac.getGuardar().addActionListener(this);
		vac.getGuardar().setActionCommand("CREAR NO ADMITIDO");

		va.getAtras().addActionListener(this);
		va.getAtras().setActionCommand("ATRAS");

		va.getActualizar().addActionListener(this);
		va.getActualizar().setActionCommand("ACTUALIZAR");

		va.getEliminar().addActionListener(this);
		va.getEliminar().setActionCommand("ELIMINAR");

		va.getCrear().addActionListener(this);
		va.getCrear().setActionCommand("CREAR");

		vp.getBtn1().addActionListener(this);
		vp.getBtn1().setActionCommand("ADMITIDO");

		vp.getBtn2().addActionListener(this);
		vp.getBtn2().setActionCommand("NO ADMITIDO");

	}

	public void run() {

		vp.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "ADMITIDO": {
			va.setVisible(true);

			break;
		}
		case "NO ADMITIDO": {

			vn.setVisible(true);
			break;
		}
		case "CREAR": {
			vc.setVisible(true);
			break;
		}
		case "GUARDAR ADMITIDO": {
			long numCedula = 0;
			String nombreCompleto = "";
			int diaNacimiento = 0;
			int mesNacimiento = 0;
			int anoNacimiento = 0;
			String pais = "";
			String ciudadOrigen = "";
			int diaEntrada = 0;
			int mesEntrada = 0;
			int anoEntrada = 0;
			int horaEntrada = 0;
			int minutoEntrada = 0;
			int diasEstadia = 0;

			try {
				numCedula = Long.parseLong(vc.getNumDocumento().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "CEDULA NO ES VALIDA");
				vc.getNumDocumento().setText("");
			}
			try {
				diaNacimiento = Integer.parseInt(vc.getDiaNacimiento().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vc.getDiaNacimiento().setText("");
			}
			try {
				mesNacimiento = Integer.parseInt(vc.getMesNacimiento().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vc.getMesNacimiento().setText("");
			}
			try {
				anoNacimiento = Integer.parseInt(vc.getAnoNacimiento().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vc.getAnoNacimiento().setText("");
			}
			try {
				diaEntrada = Integer.parseInt(vc.getDiaEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vc.getDiaEntrada().setText("");
			}
			try {
				mesEntrada = Integer.parseInt(vc.getMesEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vc.getMesEntrada().setText("");
			}
			try {
				anoEntrada = Integer.parseInt(vc.getAnoEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vc.getAnoEntrada().setText("");
			}
			try {
				horaEntrada = Integer.parseInt(vc.getHoraEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA HORA VALIDA");
				vc.getHoraEntrada().setText("");
			}
			try {
				minutoEntrada = Integer.parseInt(vc.getMinutoEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA HORA VALIDA");
				vc.getMinutoEntrada().setText("");
			}
			try {
				diasEstadia = Integer.parseInt(vc.getDiasEstadia().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES NUMERO VALIDO");
				vc.getDiasEstadia().setText("");
			}

			numCedula = Long.parseLong(vc.getNumDocumento().getText());
			nombreCompleto = vc.getNombreCompleto().getText();
			diaNacimiento = Integer.parseInt(vc.getDiaNacimiento().getText());
			mesNacimiento = Integer.parseInt(vc.getMesNacimiento().getText());
			anoNacimiento = Integer.parseInt(vc.getAnoNacimiento().getText());
			pais = vc.getPais().getText();

			ciudadOrigen = vc.getCiudadOrigen().getText();

			diaEntrada = Integer.parseInt(vc.getDiaEntrada().getText());
			mesEntrada = Integer.parseInt(vc.getMesEntrada().getText());
			anoEntrada = Integer.parseInt(vc.getAnoEntrada().getText());
			horaEntrada = Integer.parseInt(vc.getHoraEntrada().getText());
			minutoEntrada = Integer.parseInt(vc.getMinutoEntrada().getText());
			diasEstadia = Integer.parseInt(vc.getDiasEstadia().getText());

			LocalDate fechaHoy = LocalDate.now();
			LocalDate fechaNacimiento = LocalDate.of(anoNacimiento, mesNacimiento, diaNacimiento);

			Period anios = Period.between(fechaNacimiento, fechaHoy);

			int edad = anios.getYears();

			LocalDate fechaEntrada = LocalDate.of(anoEntrada, mesEntrada, diaEntrada);

			LocalDate fechaSalida1 = fechaEntrada.plusDays(diasEstadia);

			String fechaSalida = fechaSalida1.toString();

			aDAO.crear(Long.toString(numCedula), nombreCompleto, Integer.toString(diaNacimiento),
					Integer.toString(mesNacimiento), Integer.toString(anoNacimiento), pais, ciudadOrigen,
					Integer.toString(diaEntrada), Integer.toString(mesEntrada), Integer.toString(anoEntrada),
					Integer.toString(horaEntrada), Integer.toString(minutoEntrada), Integer.toString(diasEstadia),
					fechaSalida, Integer.toString(edad));

			JOptionPane.showMessageDialog(vc, aDAO.mostrar() + "\n");

			vc.setVisible(false);
			vc.getNumDocumento().setText("");
			vc.getNombreCompleto().setText("");
			vc.getDiaNacimiento().setText("");
			vc.getMesNacimiento().setText("");
			vc.getAnoNacimiento().setText("");
			vc.getPais().setText("");
			vc.getCiudadOrigen().setText("");
			vc.getDiaEntrada().setText("");
			vc.getMesEntrada().setText("");
			vc.getAnoEntrada().setText("");
			vc.getHoraEntrada().setText("");
			vc.getMinutoEntrada().setText("");
			vc.getDiasEstadia().setText("");
			break;
		}

		case "ELIMINAR": {
			ve.setVisible(true);
			break;
		}
		case "ELIMINAR ADMITIDO": {
			int index = 0;
			try {
				index = Integer.parseInt(ve.getPosicion().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NUMERO NO VALIDO");
			}
			index = Integer.parseInt(ve.getPosicion().getText());
			aDAO.eliminar(index);
			ve.setVisible(false);
			ve.getPosicion().setText("");
			break;

		}
		case "MOSTRAR": {
			vm.setVisible(true);
			JOptionPane.showMessageDialog(vm, aDAO.mostrar() + "\n");
			vm.setVisible(false);
			break;
		}
		case "ACTUALIZAR": {
			vaa.setVisible(true);
			break;
		}
		case "ACTUALIZAR ADMITIDO": {

			int index = 0;
			long numCedula = 0;
			String nombreCompleto = "";
			int diaNacimiento = 0;
			int mesNacimiento = 0;
			int anoNacimiento = 0;
			String pais = "";
			String ciudadOrigen = "";
			int diaEntrada = 0;
			int mesEntrada = 0;
			int anoEntrada = 0;
			int horaEntrada = 0;
			int minutoEntrada = 0;
			int diasEstadia = 0;

			try {
				index = Integer.parseInt(vaa.getIndex().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "INDEX NO ES VALIDO");
				vaa.getIndex().setText("");
			}

			try {
				numCedula = Long.parseLong(vaa.getNumDocumento().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "CEDULA NO ES VALIDA");
				vaa.getNumDocumento().setText("");
			}
			try {
				diaNacimiento = Integer.parseInt(vaa.getDiaNacimiento().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vaa.getDiaNacimiento().setText("");
			}
			try {
				mesNacimiento = Integer.parseInt(vaa.getMesNacimiento().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vaa.getMesNacimiento().setText("");
			}
			try {
				anoNacimiento = Integer.parseInt(vaa.getAnoNacimiento().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vaa.getAnoNacimiento().setText("");
			}
			try {
				diaEntrada = Integer.parseInt(vaa.getDiaEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vaa.getDiaEntrada().setText("");
			}
			try {
				mesEntrada = Integer.parseInt(vaa.getMesEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vaa.getMesEntrada().setText("");
			}
			try {
				anoEntrada = Integer.parseInt(vaa.getAnoEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vaa.getAnoEntrada().setText("");
			}
			try {
				horaEntrada = Integer.parseInt(vaa.getHoraEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA HORA VALIDA");
				vaa.getHoraEntrada().setText("");
			}
			try {
				minutoEntrada = Integer.parseInt(vaa.getMinutoEntrada().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA HORA VALIDA");
				vaa.getMinutoEntrada().setText("");
			}
			try {
				diasEstadia = Integer.parseInt(vaa.getDiasEstadia().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES NUMERO VALIDO");
				vaa.getDiasEstadia().setText("");
			}

			index = Integer.parseInt(vaa.getIndex().getText());
			numCedula = Long.parseLong(vaa.getNumDocumento().getText());
			nombreCompleto = vaa.getNombreCompleto().getText();
			diaNacimiento = Integer.parseInt(vaa.getDiaNacimiento().getText());
			mesNacimiento = Integer.parseInt(vaa.getMesNacimiento().getText());
			anoNacimiento = Integer.parseInt(vaa.getAnoNacimiento().getText());
			pais = vaa.getPais().getText();
			;
			ciudadOrigen = vaa.getCiudadOrigen().getText();
			;
			diaEntrada = Integer.parseInt(vaa.getDiaEntrada().getText());
			mesEntrada = Integer.parseInt(vaa.getMesEntrada().getText());
			anoEntrada = Integer.parseInt(vaa.getAnoEntrada().getText());
			horaEntrada = Integer.parseInt(vaa.getHoraEntrada().getText());
			minutoEntrada = Integer.parseInt(vaa.getMinutoEntrada().getText());
			diasEstadia = Integer.parseInt(vaa.getDiasEstadia().getText());

			LocalDate fechaHoy = LocalDate.now();
			LocalDate fechaNacimiento = LocalDate.of(anoNacimiento, mesNacimiento, diaNacimiento);

			Period anios = Period.between(fechaNacimiento, fechaHoy);

			int edad = anios.getYears();

			LocalDate fechaEntrada = LocalDate.of(diaEntrada, mesEntrada, anoEntrada);

			LocalDate fechaSalida1 = fechaEntrada.plusDays(diasEstadia);

			String fechaSalida = fechaSalida1.toString();

			aDAO.actualizar(index, Long.toString(numCedula), nombreCompleto, Integer.toString(diaNacimiento),
					Integer.toString(mesNacimiento), Integer.toString(anoNacimiento), pais, ciudadOrigen,
					Integer.toString(diaEntrada), Integer.toString(mesEntrada), Integer.toString(anoEntrada),
					Integer.toString(horaEntrada), Integer.toString(minutoEntrada), Integer.toString(diasEstadia),
					fechaSalida, Integer.toString(edad));

			vaa.setVisible(false);
			vaa.getIndex().setText("");
			vaa.getNumDocumento().setText("");
			vaa.getNombreCompleto().setText("");
			vaa.getDiaNacimiento().setText("");
			vaa.getMesNacimiento().setText("");
			vaa.getAnoNacimiento().setText("");
			vaa.getPais().setText("");
			vaa.getCiudadOrigen().setText("");
			vaa.getDiaEntrada().setText("");
			vaa.getMesEntrada().setText("");
			vaa.getAnoEntrada().setText("");
			vaa.getHoraEntrada().setText("");
			vaa.getMinutoEntrada().setText("");
			vaa.getDiasEstadia().setText("");

			break;
		}

		case "ATRAS": {
			vp.setVisible(true);
			break;
		}
		case "CREAR N": {
			vac.setVisible(true);
			break;
		}

		case "CREAR NO ADMITIDO": {

			long numCedula = 0;
			String nombreCompleto = "";
			int diaNacimiento = 0;
			int mesNacimiento = 0;
			int anoNacimiento = 0;
			String pais = "";
			String ciudadOrigen = "";
			String ciudadDevolucion = "";
			int diaExpulsion = 0;
			int mesExpulsion = 0;
			int anoExpulsion = 0;
			String motivoExpulsion = "";

			try {
				numCedula = Long.parseLong(vac.getNumDocumento().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "CEDULA NO ES VALIDA");
				vac.getNumDocumento().setText("");
			}
			try {
				diaNacimiento = Integer.parseInt(vac.getDiaNacimiento().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vac.getDiaNacimiento().setText("");
			}
			try {
				mesNacimiento = Integer.parseInt(vac.getMesNacimiento().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vac.getMesNacimiento().setText("");
			}
			try {
				anoNacimiento = Integer.parseInt(vac.getAnoNacimiento().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vac.getAnoNacimiento().setText("");
			}
			try {
				diaExpulsion = Integer.parseInt(vac.getDiaExpulsion().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vac.getDiaExpulsion().setText("");
			}
			try {
				mesExpulsion = Integer.parseInt(vac.getMesExpulsion().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vac.getMesExpulsion().setText("");
			}
			try {
				anoExpulsion = Integer.parseInt(vac.getAnoExpulsion().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vac.getAnoExpulsion().setText("");
			}
			numCedula = Long.parseLong(vac.getNumDocumento().getText());
			nombreCompleto = vac.getNombreCompleto().getText();
			diaNacimiento = Integer.parseInt(vac.getDiaNacimiento().getText());
			mesNacimiento = Integer.parseInt(vac.getMesNacimiento().getText());
			anoNacimiento = Integer.parseInt(vac.getAnoNacimiento().getText());
			pais = vac.getPais().getText();
			;
			ciudadOrigen = vac.getCiudadOrigen().getText();
			;
			ciudadDevolucion = vac.getCiudadDevolucion().getText();
			diaExpulsion = Integer.parseInt(vac.getDiaExpulsion().getText());
			mesExpulsion = Integer.parseInt(vac.getMesExpulsion().getText());
			anoExpulsion = Integer.parseInt(vac.getAnoExpulsion().getText());
			motivoExpulsion = vac.getMotivoExpulsion().getText();

			noAdDAO.crear(Long.toString(numCedula), nombreCompleto, Integer.toString(diaNacimiento),
					Integer.toString(mesNacimiento), Integer.toString(anoNacimiento), pais, ciudadOrigen,
					ciudadDevolucion, Integer.toString(diaExpulsion), Integer.toString(mesExpulsion),
					Integer.toString(anoExpulsion), motivoExpulsion);
			JOptionPane.showMessageDialog(vac, noAdDAO.mostrar() + "\n");

			vac.setVisible(false);
			vac.getNumDocumento().setText("");
			vac.getNombreCompleto().setText("");
			vac.getDiaNacimiento().setText("");
			vac.getMesNacimiento().setText("");
			vac.getAnoNacimiento().setText("");
			vac.getPais().setText("");
			vac.getCiudadOrigen().setText("");
			vac.getCiudadDevolucion().setText("");
			vac.getDiaExpulsion().setText("");
			vac.getMesExpulsion().setText("");
			vac.getAnoExpulsion().setText("");
			vac.getMotivoExpulsion().setText("");
			break;
		}

		case "ELIMINAR N": {
			vae.setVisible(true);
			break;
		}
		case "ELIMINAR NO ADMITIDO": {
			int index = 0;
			try {
				index = Integer.parseInt(vae.getPosicion().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NUMERO NO VALIDO");
			}
			index = Integer.parseInt(vae.getPosicion().getText());
			noAdDAO.eliminar(index);
			vae.setVisible(false);
			vae.getPosicion().setText("");
			break;
		}
		case "ACTUALIZAR N": {
			vana.setVisible(true);
			break;
		}
		case "ACTUALIZAR NO ADMITIDO": {
			int index = 0;
			long numCedula = 0;
			String nombreCompleto = "";
			int diaNacimiento = 0;
			int mesNacimiento = 0;
			int anoNacimiento = 0;
			String pais = "";
			String ciudadOrigen = "";
			String ciudadDevolucion = "";
			int diaExpulsion = 0;
			int mesExpulsion = 0;
			int anoExpulsion = 0;
			String motivoExpulsion = "";

			try {
				index = Integer.parseInt(vana.getIndex().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "POSICION NO ES VALIDA");
				vana.getNumDocumento().setText("");
			}
			try {
				numCedula = Long.parseLong(vana.getNumDocumento().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "CEDULA NO ES VALIDA");
				vana.getNumDocumento().setText("");
			}
			try {
				diaNacimiento = Integer.parseInt(vana.getDiaNacimiento().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vana.getDiaNacimiento().setText("");
			}
			try {
				mesNacimiento = Integer.parseInt(vana.getMesNacimiento().getText());

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vana.getMesNacimiento().setText("");
			}
			try {
				anoNacimiento = Integer.parseInt(vana.getAnoNacimiento().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vana.getAnoNacimiento().setText("");
			}
			try {
				diaExpulsion = Integer.parseInt(vana.getDiaExpulsion().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vana.getDiaExpulsion().setText("");
			}
			try {
				mesExpulsion = Integer.parseInt(vana.getMesExpulsion().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vana.getMesExpulsion().setText("");
			}
			try {
				anoExpulsion = Integer.parseInt(vana.getAnoExpulsion().getText());
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(vp, "NO ES UNA FEHCA VALIDA");
				vana.getAnoExpulsion().setText("");
			}
			index = Integer.parseInt(vana.getIndex().getText());
			numCedula = Long.parseLong(vana.getNumDocumento().getText());
			nombreCompleto = vana.getNombreCompleto().getText();
			diaNacimiento = Integer.parseInt(vana.getDiaNacimiento().getText());
			mesNacimiento = Integer.parseInt(vana.getMesNacimiento().getText());
			anoNacimiento = Integer.parseInt(vana.getAnoNacimiento().getText());
			pais = vana.getPais().getText();
			;
			ciudadOrigen = vana.getCiudadOrigen().getText();
			;
			ciudadDevolucion = vana.getCiudadDevolucion().getText();
			diaExpulsion = Integer.parseInt(vana.getDiaExpulsion().getText());
			mesExpulsion = Integer.parseInt(vana.getMesExpulsion().getText());
			anoExpulsion = Integer.parseInt(vana.getAnoExpulsion().getText());
			motivoExpulsion = vana.getMotivoExpulsion().getText();

			noAdDAO.actualizar(index, Long.toString(numCedula), nombreCompleto, Integer.toString(diaNacimiento),
					Integer.toString(mesNacimiento), Integer.toString(anoNacimiento), pais, ciudadOrigen,
					ciudadDevolucion, Integer.toString(diaExpulsion), Integer.toString(mesExpulsion),
					Integer.toString(anoExpulsion), motivoExpulsion);

			vana.setVisible(false);
			vana.getIndex().setText("");
			vana.getNumDocumento().setText("");
			vana.getNombreCompleto().setText("");
			vana.getDiaNacimiento().setText("");
			vana.getMesNacimiento().setText("");
			vana.getAnoNacimiento().setText("");
			vana.getPais().setText("");
			vana.getCiudadOrigen().setText("");
			vana.getCiudadDevolucion().setText("");
			vana.getDiaExpulsion().setText("");
			vana.getMesExpulsion().setText("");
			vana.getAnoExpulsion().setText("");
			vana.getMotivoExpulsion().setText("");
			break;

		}
		case "MOSTRAR N": {
			vam.setVisible(true);
			JOptionPane.showMessageDialog(vam, noAdDAO.mostrar() + "\n");
			vam.setVisible(false);
			break;
		}
		case "ATRAS N": {
			vp.setVisible(true);
			break;
		}

		}

		// TODO Auto-generated method stub

	}

}
