package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.SignUpWindow;

public class Controller implements ActionListener {

	private LoginWindow logWind;
	private SignUpWindow signWind;

	public Controller() {

		logWind = new LoginWindow();
		signWind = new SignUpWindow();

		agregarLectores();

	}

	public void run() {

		logWind.setVisible(true);

	}

	public void agregarLectores() {

		logWind.getRegister().addActionListener(this);
		logWind.getRegister().setActionCommand("BotonRegistro");

		logWind.getLogin().addActionListener(this);
		logWind.getLogin().setActionCommand("BOTONLOGING");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "BotonRegistro": {

			logWind.setVisible(false);
			signWind.setVisible(true);

			break;
		}
		case "BOTONLOGIN": {

			break;
		}
		default:

			break;
		}

	}

}
