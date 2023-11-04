package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import co.edu.unbosque.model.persistence.AdmitidoDAO;
import co.edu.unbosque.model.persistence.NoAdmitidoDAO;
import co.edu.unbosque.model.persistence.PersonaDAO;
import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.VentanaAdmitido;
import co.edu.unbosque.view.VentanaAdmitidoActualizar;
import co.edu.unbosque.view.VentanaAdmitidoCrear;
import co.edu.unbosque.view.VentanaAdmitidoEliminar;
import co.edu.unbosque.view.VentanaNoAdmitido;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaAdmitidoEliminar ve;
	private VentanaAdmitidoCrear vc;
	private VentanaNoAdmitido vn;
	private VentanaAdmitido va;
	private VentanaAdmitidoActualizar vaa;
	private VentanaPrincipal vp;
	private Console con;
	private PersonaDAO pDAO;
	private AdmitidoDAO aDAO;
	private NoAdmitidoDAO noAdDAO;

	public Controller() {

		ve = new VentanaAdmitidoEliminar();
		vc = new VentanaAdmitidoCrear();
		vn = new VentanaNoAdmitido();
		va = new VentanaAdmitido();
		vp = new VentanaPrincipal();
		vaa = new VentanaAdmitidoActualizar();
		con = new Console();
		pDAO = new PersonaDAO();
		aDAO = new AdmitidoDAO();
		noAdDAO = new NoAdmitidoDAO();
		agregarLectores();
		// TODO Auto-generated constructor stub
	}

	public void agregarLectores() {

		va.getEliminar().addActionListener(this);
		va.getEliminar().setActionCommand("ELIMINAR A");

		va.getCrear().addActionListener(this);
		va.getCrear().setActionCommand("CREAR A");

		va.getActualizar().addActionListener(this);
		va.getActualizar().setActionCommand("ACTUALIZAR A");

		ve.getEliminar1().addActionListener(this);
		ve.getEliminar1().setActionCommand("ELIMINAR ADMITIDO");

		vp.getBtn1().addActionListener(this);
		vp.getBtn1().setActionCommand("ADMITIDO");

		vp.getBtn2().addActionListener(this);
		vp.getBtn2().setActionCommand("NO ADMITIDO");

		vc.getGuardar().addActionListener(this);
		vc.getGuardar().setActionCommand("GUARDAR ADMITIDO");

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
		case "CREAR A": {
			vc.setVisible(true);
			break;
		}
		case "ELIMINAR A": {
			ve.setVisible(true);

			break;
		}
		case "ACTUALIZAR A": {
			vaa.setVisible(true);
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
			;
			ciudadOrigen = vc.getCiudadOrigen().getText();
			;
			diaEntrada = Integer.parseInt(vc.getDiaEntrada().getText());
			mesEntrada = Integer.parseInt(vc.getMesEntrada().getText());
			anoEntrada = Integer.parseInt(vc.getAnoEntrada().getText());
			horaEntrada = Integer.parseInt(vc.getHoraEntrada().getText());
			minutoEntrada = Integer.parseInt(vc.getMinutoEntrada().getText());
			diasEstadia = Integer.parseInt(vc.getDiasEstadia().getText());

			aDAO.crear(Long.toString(numCedula), nombreCompleto, Integer.toString(diaNacimiento),
					Integer.toString(mesNacimiento), Integer.toString(anoNacimiento), pais, ciudadOrigen,
					Integer.toString(diaEntrada), Integer.toString(mesEntrada), Integer.toString(anoEntrada),
					Integer.toString(horaEntrada), Integer.toString(minutoEntrada), Integer.toString(diasEstadia));

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
		}

		// TODO Auto-generated method stub

	}

}
