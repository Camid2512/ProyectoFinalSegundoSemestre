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

	}

	public void run() {

		logWind.setVisible(true);

	}

	public void agregarLectores() {

		logWind.getLogin().addActionListener(this);
		logWind.getLogin().setActionCommand("BOTONLOGING");

		logWind.getRegister().addActionListener(this);
		logWind.getRegister().setActionCommand("BOTONREGISTER");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "BOTONREGISTER": {

			logWind.setVisible(false);
			signWind.setVisible(true);

			break;
		}
		default:

			break;
		}

	}

}
