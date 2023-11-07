package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.BettingHouseManagmentWindow;
import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.OwnerWindow;
import co.edu.unbosque.view.SignUpWindow;

public class Controller implements ActionListener {

	private LoginWindow logWind;
	private SignUpWindow signWind;
	private OwnerWindow ownWind;
	private BettingHouseManagmentWindow houseManageWindow;

	public Controller() {

		logWind = new LoginWindow();
		signWind = new SignUpWindow();
		ownWind = new OwnerWindow();
		houseManageWindow = new BettingHouseManagmentWindow();

		agregarLectores();

	}

	public void run() {

		logWind.setVisible(true);

	}

	public void agregarLectores() {

		// BOTONES DE VENTANA REGISTER

		signWind.getExit().addActionListener(this);
		signWind.getExit().setActionCommand("EXITSIGNUP");
		signWind.getBack().addActionListener(this);
		signWind.getBack().setActionCommand("BACKSIGN");

		// BOTONES DE VENTANA LOGIN
		logWind.getRegister().addActionListener(this);
		logWind.getRegister().setActionCommand("BOTONREGISTRO");

		logWind.getLogin().addActionListener(this);
		logWind.getLogin().setActionCommand("BOTONLOGIN");

		logWind.getExit().addActionListener(this);
		logWind.getExit().setActionCommand("EXITLOGIN");

		// BOTONES DE VENTANA DUENO

		ownWind.getMod1Btn().addActionListener(this);
		ownWind.getMod1Btn().setActionCommand("BOTONMOD1");

		ownWind.getExit().addActionListener(this);
		ownWind.getExit().setActionCommand("EXITOWN");

		ownWind.getBack().addActionListener(this);
		ownWind.getBack().setActionCommand("BACKOWN");

		// BOTONES MODULO 1 (OWNER)

		houseManageWindow.getExit().addActionListener(this);
		houseManageWindow.getExit().setActionCommand("EXITHOUSEMANAGE");

		houseManageWindow.getBack().addActionListener(this);
		houseManageWindow.getBack().setActionCommand("BACKHOUSEMANAGE");
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

		case "BACKSIGN": {

			signWind.setVisible(false);
			logWind.setVisible(true);
			break;

		}

		case "EXITSIGNUP": {
			System.exit(1);
			break;

		}
		case "EXITLOGIN": {
			System.exit(1);
			break;

		}
		case "EXITOWN": {

			System.exit(1);
			break;
		}
		case "EXITHOUSEMANAGE": {
			System.exit(1);
			break;
		}

		case "BOTONMOD1": {

			logWind.setVisible(false);
			ownWind.setVisible(false);
			houseManageWindow.setVisible(true);
			break;
		}

		case "BACKOWN": {

			ownWind.setVisible(false);
			logWind.setVisible(true);
			break;

		}
		case "BACKHOUSEMANAGE": {

			houseManageWindow.setVisible(false);
			ownWind.setVisible(true);

		}

		default:

			break;
		}

	}

}
