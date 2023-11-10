package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.HouseSettingDAO;
import co.edu.unbosque.model.persistence.OwnerDAO;
import co.edu.unbosque.view.BettingHouseManagmentWindow;
import co.edu.unbosque.view.CreateVenueWindow;
import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.ManagerCreationWindow;
import co.edu.unbosque.view.OwnerWindow;
import co.edu.unbosque.view.SignUpWindow;
import co.edu.unbosque.view.VenueManagmentByOwnerWindow;

public class Controller implements ActionListener {

	private LoginWindow logWind;
	private SignUpWindow signWind;
	private OwnerWindow ownWind;
	private BettingHouseManagmentWindow houseManageWindow;
	private VenueManagmentByOwnerWindow venueManageOwn;
	private ManagerCreationWindow managerCreationWin;
	private CreateVenueWindow createVenueWin;

	private HouseSettingDAO houseDAO;
	private OwnerDAO ownDAO;

	public Controller() {

		houseDAO = new HouseSettingDAO();
		ownDAO = new OwnerDAO();

		logWind = new LoginWindow();
		signWind = new SignUpWindow();
		ownWind = new OwnerWindow();
		houseManageWindow = new BettingHouseManagmentWindow();
		venueManageOwn = new VenueManagmentByOwnerWindow();
		managerCreationWin = new ManagerCreationWindow();
		createVenueWin = new CreateVenueWindow();
		agregarLectores();

	}

	public void run() {

		if (ownDAO.getOwnerList().isEmpty()) {
			signWind.setVisible(true);
		} else {
			logWind.setVisible(true);
		}

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
		ownWind.getMod1Btn().setActionCommand("BOTONMOD1OWN");

		ownWind.getExit().addActionListener(this);
		ownWind.getExit().setActionCommand("EXITOWN");

		ownWind.getBack().addActionListener(this);
		ownWind.getBack().setActionCommand("BACKOWN");

		ownWind.getMod2Btn().addActionListener(this);
		ownWind.getMod2Btn().setActionCommand("BOTONMOD2OWN");

		// BOTONES MODULO 1 (OWNER)

		houseManageWindow.getExit().addActionListener(this);
		houseManageWindow.getExit().setActionCommand("EXITHOUSEMANAGE");

		houseManageWindow.getBack().addActionListener(this);
		houseManageWindow.getBack().setActionCommand("BACKHOUSEMANAGE");

		houseManageWindow.getCreateBtn().addActionListener(this);
		houseManageWindow.getCreateBtn().setActionCommand("CREATEHOUSE");

		// BOTONES MODULO 2 (OWNER)

		venueManageOwn.getExit().addActionListener(this);
		venueManageOwn.getExit().setActionCommand("EXITVENUEOWN");

		venueManageOwn.getBack().addActionListener(this);
		venueManageOwn.getBack().setActionCommand("BACKVENUEOWN");

		venueManageOwn.getCreate().addActionListener(this);
		venueManageOwn.getCreate().setActionCommand("CREATEVENUE");

		// BOTONES CREAR JEFE DE SEDE

		managerCreationWin.getExit().addActionListener(this);
		managerCreationWin.getExit().setActionCommand("EXITCREATEBOSS");

		managerCreationWin.getBack().addActionListener(this);
		managerCreationWin.getBack().setActionCommand("BACKCREATEBOSS");

		managerCreationWin.getCreateAccount().addActionListener(this);
		managerCreationWin.getCreateAccount().setActionCommand("CREATENEWVENUE");

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
			checkLogin();
			logWind.getUsuario().setText("");
			logWind.getPassword().setText("");

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
		case "EXITVENUEOWN": {
			System.exit(1);
			break;
		}
		case "EXITCREATEBOSS": {
			System.exit(1);
			break;
		}

		case "BOTONMOD1OWN": {

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

		case "BOTONMOD2OWN": {

			ownWind.setVisible(false);
			venueManageOwn.setVisible(true);
			break;
		}
		case "BACKVENUEOWN": {
			venueManageOwn.setVisible(false);
			ownWind.setVisible(true);
			break;
		}

		case "CREATEVENUE": {

			venueManageOwn.setVisible(false);
			managerCreationWin.setVisible(true);

			break;

		}

		case "CREATENEWVENUE": {

			managerCreationWin.setVisible(false);
			createVenueWin.setVisible(true);
			break;

		}
		case "BACKCREATEBOSS": {

			managerCreationWin.setVisible(false);
			venueManageOwn.setVisible(true);
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

	public void checkLogin() {

		String nameToCheck = logWind.getUsuario().getText();
		@SuppressWarnings("deprecation")
		String passToCheck = logWind.getPassword().getText();

		boolean checked = false;

		for (int i = 0; i < ownDAO.getOwnerList().size(); i++) {

			if (nameToCheck.equals(ownDAO.getOwnerList().get(i).getUsername())
					&& passToCheck.equals(ownDAO.getOwnerList().get(i).getPassword())) {

				checked = true;

			} else {

				checked = false;
			}

		}
		if (checked) {
			JOptionPane.showMessageDialog(logWind, "----INGRESANDO----");
			ownWind.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(logWind, "Usuario y/o Contraseña ERRADOS", "NO EXIST", 0);
			logWind.setVisible(true);
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

		int response = JOptionPane.showConfirmDialog(signWind, "¿ESTA SEGURO DE LOS DATOS?");
		user = signWind.getUsuario().getText();
		pass = signWind.getPassword().getText();

		if (JOptionPane.NO_OPTION == response) {

		} else if (JOptionPane.OK_OPTION == response) {
			ownDAO.create(user, pass);
			JOptionPane.showMessageDialog(signWind, "CUENTA CREADA CON EXITO");

		}
	}

}
