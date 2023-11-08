package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.HouseSettingDAO;
import co.edu.unbosque.model.persistence.OwnerDAO;
import co.edu.unbosque.view.BettingHouseManagmentWindow;
import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.OwnerWindow;
import co.edu.unbosque.view.SignUpWindow;

public class Controller implements ActionListener {

	private LoginWindow logWind;
	private SignUpWindow signWind;
	private OwnerWindow ownWind;
	private BettingHouseManagmentWindow houseManageWindow;

	private HouseSettingDAO houseDAO;
	private OwnerDAO ownDAO;

	public Controller() {

		houseDAO = new HouseSettingDAO();
		ownDAO = new OwnerDAO();

		logWind = new LoginWindow();
		signWind = new SignUpWindow();
		ownWind = new OwnerWindow();
		houseManageWindow = new BettingHouseManagmentWindow();

		agregarLectores();

	}

	public void run() {

//		if (ownDAO.getOwnerList().isEmpty()) {
//			signWind.setVisible(true);
//		} else {
		logWind.setVisible(true);
//		}

	}

	public void agregarLectores() {

		// BOTONES DE VENTANA REGISTER

		signWind.getExit().addActionListener(this);
		signWind.getExit().setActionCommand("EXITSIGNUP");
		signWind.getBack().addActionListener(this);
		signWind.getBack().setActionCommand("BACKSIGN");

		signWind.getBotonRegistro().addActionListener(this);
		signWind.getBotonRegistro().setActionCommand("BOTONGUARDARREGISTRO");

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

		houseManageWindow.getCreateBtn().addActionListener(this);
		houseManageWindow.getCreateBtn().setActionCommand("CREATEHOUSE");

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

		case "BOTONGUARDARREGISTRO": {

			createAccount();

			signWind.getUsuario().setText("");
			signWind.getPassword().setText("");

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

		case "CREATEHOUSE": {

			createHouse();
			houseManageWindow.getNameHouse().setText("");
			houseManageWindow.getTotalBudget().setText("");
			int aux = 0;
			houseManageWindow.getNumberVenue().setValue(aux);

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
			break;
		}

		default:

			break;
		}

	}

	public void createHouse() {

		String name = houseManageWindow.getNameHouse().getText();
		double budget = Double.parseDouble(houseManageWindow.getTotalBudget().getText());
		int numVenue = Integer.parseInt(houseManageWindow.getNumberVenue().getValue().toString());

		houseDAO.create(name, numVenue, budget);

		JOptionPane.showMessageDialog(houseManageWindow,
				"HAS SETEADO CON EXITO LA CONFIGURACION DE TU CASA DE APUESTAS");

	}

	public void createAccount() {

		String user = "";
		String pass = "";

		user = signWind.getUsuario().getText();
		pass = signWind.getPassword().getText();
//		int response = JOptionPane.showConfirmDialog(signWind, "¿ESTA SEGURO DE LOS DATOS?");

//		if (JOptionPane.OK_OPTION == response) {
		ownDAO.create(user, pass);
//			JOptionPane.showMessageDialog(signWind, "CUENTA CREADA CON EXITO");
//		} else if (JOptionPane.NO_OPTION == response) {

//			JOptionPane.showMessageDialog(signWind, "VUELVE A INGRESAR LOS DATOS");
//			String user1 = signWind.getUsuario().getText();
//			String pass1 = signWind.getPassword().getText();

//			ownDAO.create(user1, pass1);
//		}

	}

}
