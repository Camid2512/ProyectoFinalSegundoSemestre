package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.OwnerWindow;
import co.edu.unbosque.view.SignUpWindow;

public class Controller implements ActionListener {

	private LoginWindow logWind;
	private SignUpWindow signWind;
	private OwnerWindow ownWind;

	public Controller() {

		logWind = new LoginWindow();
		signWind = new SignUpWindow();
		ownWind = new OwnerWindow();

		agregarLectores();

	}

	public void run() {

		logWind.setVisible(true);

	}

	public void agregarLectores() {

		logWind.getRegister().addActionListener(this);
		logWind.getRegister().setActionCommand("BOTONREGISTRO");

		logWind.getLogin().addActionListener(this);
		logWind.getLogin().setActionCommand("BOTONLOGIN");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "BOTONREGISTRO": {

			logWind.setVisible(false);
			signWind.setVisible(true);

			break;
		}
		case "BOTONLOGIN": {

			logWind.setVisible(false);
			ownWind.setVisible(true);
			break;
		}
		default:

			break;
		}

	}

}
