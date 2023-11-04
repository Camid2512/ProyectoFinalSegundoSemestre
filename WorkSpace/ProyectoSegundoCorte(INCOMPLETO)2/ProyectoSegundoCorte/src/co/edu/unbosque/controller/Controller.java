package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.MainWindow;

public class Controller implements ActionListener {

	private MainWindow mw;

	public Controller() {

		mw = new MainWindow();
		agregarLectores();
	}

	public void run() {
		mw.setVisible(true);

	}

	public void agregarLectores() {
		mw.getCivilBtn().addActionListener(this);
		mw.getCivilBtn().setActionCommand("botonCivilPaginaPrincipal");

		mw.getMilitarBtn().addActionListener(this);
		mw.getMilitarBtn().setActionCommand("botonMilitarPaginaPrincipal");

		mw.getVideoBtn().addActionListener(this);
		mw.getVideoBtn().setActionCommand("botonVideoTutorialPaginaPrincipal");

		mw.getSalir().addActionListener(this);
		mw.getSalir().setActionCommand("botonSalirVentanaPrincipal");

	}

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "botonCivilPaginaPrincipal": {

			JOptionPane.showMessageDialog(mw, "Civil");

			break;

		}

		case "botonMilitarPaginaPrincipal": {

			JOptionPane.showMessageDialog(mw, "Militar");

			break;
		}
		case "botonVideoTutorialPaginaPrincipal": {
			JOptionPane.showMessageDialog(mw, "Videooooo");

			break;
		}
		case "botonSalirVentanaPrincipal": {
			System.exit(1);
			break;

		}
		default:
			break;
		}

	}

}
