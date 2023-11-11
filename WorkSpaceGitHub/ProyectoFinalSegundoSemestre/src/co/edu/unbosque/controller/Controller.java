package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.GamblerDAO;
import co.edu.unbosque.model.persistence.HeadquarterDAO;
import co.edu.unbosque.model.persistence.HeadquarterManagerDAO;
import co.edu.unbosque.model.persistence.HouseSettingDAO;
import co.edu.unbosque.model.persistence.OwnerDAO;
import co.edu.unbosque.view.BetManagmentByOwnerWindow;
import co.edu.unbosque.view.BettingHouseManagmentWindow;
import co.edu.unbosque.view.CreateGamblerWindow;
import co.edu.unbosque.view.CreateVenueWindow;
import co.edu.unbosque.view.GamblerManagmentByOwnerWindow;
import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.ManagerCreationWindow;
import co.edu.unbosque.view.OwnerWindow;
import co.edu.unbosque.view.SelectCreateBetWindow;
import co.edu.unbosque.view.SelectDeleteGamblerOwnWindow;
import co.edu.unbosque.view.SelectDeleteVenueOwnWindow;
import co.edu.unbosque.view.SelectShowGamblerWindow;
import co.edu.unbosque.view.SelectShowVenueWindow;
import co.edu.unbosque.view.SelectUpdateGamblerWindow;
import co.edu.unbosque.view.SelectUpdateVenueWindow;
import co.edu.unbosque.view.SignUpWindow;
import co.edu.unbosque.view.UpdateVenueByOwnerWindow;
import co.edu.unbosque.view.VenueManagmentByOwnerWindow;

public class Controller implements ActionListener {

	private LoginWindow logWind;
	private SignUpWindow signWind;
	private OwnerWindow ownWind;
	private BettingHouseManagmentWindow houseManageWindow;
	private VenueManagmentByOwnerWindow venueManageOwn;
	private ManagerCreationWindow managerCreationWin;
	private CreateVenueWindow createVenueWin;
	private SelectShowVenueWindow selShowVenOwn;
	private SelectUpdateVenueWindow selUpdateVenOwn;
	private UpdateVenueByOwnerWindow updateVenueOwn;
	private SelectDeleteVenueOwnWindow selDeleteVenueOwn;
	private GamblerManagmentByOwnerWindow gamManageOwn;
	private CreateGamblerWindow createGamblerWinOwn;
	private SelectShowGamblerWindow selShowGamblerOwn;
	private SelectUpdateGamblerWindow selUpdateGamblerOwn;
	private SelectDeleteGamblerOwnWindow selDeleteGamblerOwn;
	private BetManagmentByOwnerWindow betManOwn;
	private SelectCreateBetWindow selcreatebet;

	private HouseSettingDAO houseDAO;
	private OwnerDAO ownDAO;
	private HeadquarterManagerDAO bossDAO;
	private GamblerDAO gamDAO;
	private HeadquarterDAO venueDAO;

	public Controller() {

		houseDAO = new HouseSettingDAO();
		ownDAO = new OwnerDAO();
		bossDAO = new HeadquarterManagerDAO();
		gamDAO = new GamblerDAO();
		venueDAO = new HeadquarterDAO();

		logWind = new LoginWindow();
		signWind = new SignUpWindow();
		ownWind = new OwnerWindow();
		houseManageWindow = new BettingHouseManagmentWindow();
		venueManageOwn = new VenueManagmentByOwnerWindow();
		managerCreationWin = new ManagerCreationWindow();
		createVenueWin = new CreateVenueWindow();
		selShowVenOwn = new SelectShowVenueWindow();
		selUpdateVenOwn = new SelectUpdateVenueWindow();
		updateVenueOwn = new UpdateVenueByOwnerWindow();
		selDeleteVenueOwn = new SelectDeleteVenueOwnWindow();
		gamManageOwn = new GamblerManagmentByOwnerWindow();
		createGamblerWinOwn = new CreateGamblerWindow();
		selShowGamblerOwn = new SelectShowGamblerWindow();
		selUpdateGamblerOwn = new SelectUpdateGamblerWindow();
		selDeleteGamblerOwn = new SelectDeleteGamblerOwnWindow();
		betManOwn = new BetManagmentByOwnerWindow();
		selcreatebet = new SelectCreateBetWindow();
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

		ownWind.getMod3Btn().addActionListener(this);
		ownWind.getMod3Btn().setActionCommand("BOTONMOD3OWN");

		ownWind.getMod4Btn().addActionListener(this);
		ownWind.getMod4Btn().setActionCommand("BOTONMOD4OWN");

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

		venueManageOwn.getRead().addActionListener(this);
		venueManageOwn.getRead().setActionCommand("SELECTVENUESHOWOWN");

		venueManageOwn.getUpdate().addActionListener(this);
		venueManageOwn.getUpdate().setActionCommand("SELECTVENUEUPDATEOWN");

		venueManageOwn.getDelete().addActionListener(this);
		venueManageOwn.getDelete().setActionCommand("SELECTVENUEDELETEOWN");

		// BOTONES CREAR JEFE DE SEDE

		managerCreationWin.getExit().addActionListener(this);
		managerCreationWin.getExit().setActionCommand("EXITCREATEBOSS");

		managerCreationWin.getBack().addActionListener(this);
		managerCreationWin.getBack().setActionCommand("BACKCREATEBOSS");

		managerCreationWin.getCreateAccount().addActionListener(this);
		managerCreationWin.getCreateAccount().setActionCommand("CREATENEWVENUE");

		// BOTONES CREAR SEDE (OWNER)

		createVenueWin.getExit().addActionListener(this);
		createVenueWin.getExit().setActionCommand("EXITCREATEVENUE");

		createVenueWin.getBack().addActionListener(this);
		createVenueWin.getBack().setActionCommand("BACKCREATEVENUE");

		createVenueWin.getCreateVenue().addActionListener(this);
		createVenueWin.getCreateVenue().setActionCommand("CREATENEWNEWVENUE");

		// BOTONES MENU SELECCION SEDE MOSTRAR (OWNER)

		selShowVenOwn.getExit().addActionListener(this);
		selShowVenOwn.getExit().setActionCommand("EXITSELECTSHOWOWN");

		selShowVenOwn.getBack().addActionListener(this);
		selShowVenOwn.getBack().setActionCommand("BACKSELECTSHOWOWN");

		selShowVenOwn.getNext().addActionListener(this);
		selShowVenOwn.getNext().setActionCommand("NEXTSELECTSHOWOWN");

		// BOTONES MENU SELECCION SEDE ACTUALIZAR (OWNER)

		selUpdateVenOwn.getExit().addActionListener(this);
		selUpdateVenOwn.getExit().setActionCommand("EXITSELECTUPDATEOWN");

		selUpdateVenOwn.getBack().addActionListener(this);
		selUpdateVenOwn.getBack().setActionCommand("BACKSELECTUPDATEOWN");

		selUpdateVenOwn.getNext().addActionListener(this);
		selUpdateVenOwn.getNext().setActionCommand("MENUUPDATESELECTED");

		// BOTONES ACTUALIZAR SEDE (OWNER)

		updateVenueOwn.getExit().addActionListener(this);
		updateVenueOwn.getExit().setActionCommand("EXITUPDATEVENUEOWN");

		updateVenueOwn.getBack().addActionListener(this);
		updateVenueOwn.getBack().setActionCommand("BACKUPDATEVENUEOWN");

		updateVenueOwn.getCreateVenue().addActionListener(this);
		updateVenueOwn.getCreateVenue().setActionCommand("UPDATEVENUEOWN");

		// BOTONES MENU SELECCION SEDE ELIMINAR (OWNER)

		selDeleteVenueOwn.getExit().addActionListener(this);
		selDeleteVenueOwn.getExit().setActionCommand("EXITSELECTDELETEOWN");

		selDeleteVenueOwn.getBack().addActionListener(this);
		selDeleteVenueOwn.getBack().setActionCommand("BACKSELECTDELETEVENUEOWN");

		selDeleteVenueOwn.getNext().addActionListener(this);
		selDeleteVenueOwn.getNext().setActionCommand("DELETEVENUEOWN");

		// BOTONES MENU APOSTADORES (OWNER)

		gamManageOwn.getExit().addActionListener(this);
		gamManageOwn.getExit().setActionCommand("EXITMENUGAMBLEROWN");

		gamManageOwn.getBack().addActionListener(this);
		gamManageOwn.getBack().setActionCommand("BACKMENUGAMBLEROWN");

		gamManageOwn.getCreate().addActionListener(this);
		gamManageOwn.getCreate().setActionCommand("CREATEGAMBLER");

		gamManageOwn.getRead().addActionListener(this);
		gamManageOwn.getRead().setActionCommand("SELECTGAMBLERSHOWOWN");

		gamManageOwn.getUpdate().addActionListener(this);
		gamManageOwn.getUpdate().setActionCommand("SELECTGAMBLERUPDATEOWN");

		gamManageOwn.getDelete().addActionListener(this);
		gamManageOwn.getDelete().setActionCommand("SELECTGAMBLERDELETEOWN");

		// BOTONES CREAR APOSTADOR (OWNER)

		createGamblerWinOwn.getExit().addActionListener(this);
		createGamblerWinOwn.getExit().setActionCommand("EXITCREATEGAMBLEROWN");

		createGamblerWinOwn.getBack().addActionListener(this);
		createGamblerWinOwn.getBack().setActionCommand("BACKCREATEGAMBLEROWN");

		// BOTONES MENU SELECCION APOSTADOR MOSTRAR (OWNER)

		selShowGamblerOwn.getExit().addActionListener(this);
		selShowGamblerOwn.getExit().setActionCommand("EXITSELECTSHOWGAMOWN");

		selShowGamblerOwn.getBack().addActionListener(this);
		selShowGamblerOwn.getBack().setActionCommand("BACKSELECTSHOWGAMOWN");

		// BOTONES MENU SELECCION APOSTADOR ACTUALIZAR (OWNER)

		selUpdateGamblerOwn.getExit().addActionListener(this);
		selUpdateGamblerOwn.getExit().setActionCommand("EXITSELECTUPDATEGAMOWN");

		selUpdateGamblerOwn.getBack().addActionListener(this);
		selUpdateGamblerOwn.getBack().setActionCommand("BACKSELECTUPDATEGAMOWN");

		selUpdateGamblerOwn.getNext().addActionListener(this);
		selUpdateGamblerOwn.getNext().setActionCommand("MENUUPDATESELECTEDGAMOWN");

		// BOTONES MENU SELECCION APOSTADOR ELIMINAR (OWNER)

		selDeleteGamblerOwn.getExit().addActionListener(this);
		selDeleteGamblerOwn.getExit().setActionCommand("EXITSELECTDELETEGAMBLEROWN");

		selDeleteGamblerOwn.getBack().addActionListener(this);
		selDeleteGamblerOwn.getBack().setActionCommand("BACKSELECTDELETEGAMBLEROWN");

		selDeleteGamblerOwn.getNext().addActionListener(this);
		selDeleteGamblerOwn.getNext().setActionCommand("DELETEGAMBLEROWN");

		// BOTONES MODULO 4 (OWNER)}

		betManOwn.getExit().addActionListener(this);
		betManOwn.getExit().setActionCommand("EXITMENUBETOWN");

		betManOwn.getBack().addActionListener(this);
		betManOwn.getBack().setActionCommand("BACKMENUBETOWN");

		betManOwn.getCreate().addActionListener(this);
		betManOwn.getCreate().setActionCommand("CREATEBET");

		betManOwn.getRead().addActionListener(this);
		betManOwn.getRead().setActionCommand("SELECTBETSHOWOWN");

		betManOwn.getUpdate().addActionListener(this);
		betManOwn.getUpdate().setActionCommand("SELECTBETRUPDATEOWN");

		betManOwn.getDelete().addActionListener(this);
		betManOwn.getDelete().setActionCommand("SELECTBETDELETEOWN");

		// BOTONES SELECCIONAR SEDE CREAR APUESTA

		selcreatebet.getBack().addActionListener(this);
		selcreatebet.getBack().setActionCommand("BACKSELECTVENUEBETOWN");

		selcreatebet.getExit().addActionListener(this);
		selcreatebet.getExit().setActionCommand("EXITSELECTVENUEBETOWN");
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
			checkLoginOwner();
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

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;

		}
		case "EXITLOGIN": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;

		}
		case "EXITOWN": {

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}
		case "EXITHOUSEMANAGE": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}
		case "EXITVENUEOWN": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}
		case "EXITCREATEBOSS": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}
		case "EXITCREATEVENUE": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}
		case "EXITSELECTSHOWOWN": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}
		case "EXITSELECTUPDATEOWN": {

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;

		}
		case "EXITUPDATEVENUEOWN": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}
		case "EXITMENUGAMBLEROWN": {

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}

		case "EXITSELECTDELETEOWN": {

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}

		case "EXITCREATEGAMBLEROWN": {

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;

		}

		case "EXITSELECTSHOWGAMOWN": {

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}

		case "EXITSELECTUPDATEGAMOWN": {

			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}

		case "EXITMENUBETOWN": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}

		case "EXITSELECTVENUEBETOWN": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
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

		case "BOTONMOD3OWN": {
			ownWind.setVisible(false);
			gamManageOwn.setVisible(true);
			break;
		}

		case "BOTONMOD4OWN": {
			ownWind.setVisible(false);
			betManOwn.setVisible(true);
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
			createBoss();
			managerCreationWin.getUser().setText("");
			managerCreationWin.getPassword().setText("");
			createVenueWin.setVisible(true);
			break;

		}
		case "SELECTVENUESHOWOWN": {

			venueManageOwn.setVisible(false);
			updateBoxSelectShowVenue();
			selShowVenOwn.setVisible(true);
			break;

		}
		case "SELECTVENUEUPDATEOWN": {

			venueManageOwn.setVisible(false);
			updateBoxSelectUpdateVenue();
			selUpdateVenOwn.setVisible(true);
			break;

		}
		case "SELECTVENUEDELETEOWN": {

			venueManageOwn.setVisible(false);
			updateBoxSelectDeleteVenue();
			selDeleteVenueOwn.setVisible(true);
			break;

		}
		case "BACKSELECTUPDATEOWN": {

			selUpdateVenOwn.setVisible(false);
			venueManageOwn.setVisible(true);
			break;

		}
		case "MENUUPDATESELECTED": {

			selUpdateVenOwn.setVisible(false);
			updateVenueOwn.setVisible(true);
			setDataToUpdate();
			break;

		}
		case "BACKSELECTSHOWOWN": {

			selShowVenOwn.setVisible(false);
			venueManageOwn.setVisible(true);

		}

//		case "NEXTSELECTSHOWOWN": {
//			
//			selShowVenOwn.setVisible(false);
//			
//		}
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
		case "BACKCREATEVENUE": {

			createVenueWin.setVisible(false);
			venueManageOwn.setVisible(true);
			break;
		}
		case "BACKUPDATEVENUEOWN": {

			updateVenueOwn.setVisible(false);
			selUpdateVenOwn.setVisible(true);
			break;

		}
		case "BACKSELECTDELETEVENUEOWN": {

			selDeleteVenueOwn.setVisible(false);
			venueManageOwn.setVisible(true);
			break;

		}

		case "BACKMENUGAMBLEROWN": {

			gamManageOwn.setVisible(false);
			ownWind.setVisible(true);
			break;

		}

		case "CREATEGAMBLER": {

			gamManageOwn.setVisible(false);
			createGamblerWinOwn.setVisible(true);
			break;

		}

		case "BACKCREATEGAMBLEROWN": {

			createGamblerWinOwn.setVisible(false);
			gamManageOwn.setVisible(true);
			break;

		}

		case "BACKSELECTSHOWGAMOWN": {

			selShowGamblerOwn.setVisible(false);
			gamManageOwn.setVisible(true);
			break;

		}

		case "BACKSELECTUPDATEGAMOWN": {

			selUpdateGamblerOwn.setVisible(false);
			gamManageOwn.setVisible(true);
			break;

		}

		case "SELECTGAMBLERSHOWOWN": {

			gamManageOwn.setVisible(false);
			updateBoxSelectShowVenueGambler();
			selShowGamblerOwn.setVisible(true);
			break;
		}

		case "SELECTGAMBLERUPDATEOWN": {

			gamManageOwn.setVisible(false);
			updateBoxSelectUpdateVenueGambler();
			selUpdateGamblerOwn.setVisible(true);
			break;
		}

		case "SELECTGAMBLERDELETEOWN": {

			gamManageOwn.setVisible(false);
			updateBoxSelectDeleteVenueGambler();
			selDeleteGamblerOwn.setVisible(true);
			break;
		}

		case "BACKSELECTDELETEGAMBLEROWN": {

			selDeleteGamblerOwn.setVisible(false);
			gamManageOwn.setVisible(true);
			break;
		}

		case "BACKMENUBETOWN": {

			betManOwn.setVisible(false);
			ownWind.setVisible(true);
			break;
		}

		case "CREATEBET": {

			betManOwn.setVisible(false);
			selcreatebet.setVisible(true);
			break;

		}

		case "BACKSELECTVENUEBETOWN": {

			selcreatebet.setVisible(false);
			betManOwn.setVisible(true);
			break;
		}
		case "CREATENEWNEWVENUE": {

			String item = "";
			int itemN = 0;
			createVenue();
			createVenueWin.getVenueName().setText("");
			createVenueWin.getComboLocation().setSelectedItem(item);
			createVenueWin.getNumEmployes().setValue(itemN);
			break;

		}
		case "UPDATEVENUEOWN": {

			updateVenueOwn();
			updateVenueOwn.setVisible(false);
			selUpdateVenOwn.setVisible(true);
			updateBoxSelectUpdateVenue();
			break;

		}
		default:

			break;
		}

	}

	public void checkLoginOwner() {

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

	public void checkLoginBoss() {

		String nameToCheck = logWind.getUsuario().getText();
		@SuppressWarnings("deprecation")
		String passToCheck = logWind.getPassword().getText();

		boolean checked = false;

		for (int i = 0; i < bossDAO.getHeadquarterManagerList().size(); i++) {

			if (nameToCheck.equals(bossDAO.getHeadquarterManagerList().get(i).getUser())
					&& passToCheck.equals(bossDAO.getHeadquarterManagerList().get(i).getPassword())) {

				checked = true;

			} else {

				checked = false;
			}

		}
		if (checked) {
			JOptionPane.showMessageDialog(logWind, "----INGRESANDO JEFE SEDE----");
			createVenueWin.setVisible(true);
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

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS INGRESADOS?", "CONFIRMAR",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");
		user = signWind.getUsuario().getText();
		pass = signWind.getPassword().getText();

		if (JOptionPane.NO_OPTION == response) {

		} else if (JOptionPane.OK_OPTION == response) {
			ownDAO.create(user, pass);
			JOptionPane.showMessageDialog(signWind, "CUENTA CREADA CON EXITO");

		}
	}

	public void createBoss() {

		String user = "";
		String password = "";
		String id = randomString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS INGRESADOS?", "CONFIRMAR",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");
		user = managerCreationWin.getUser().getText();
		password = managerCreationWin.getPassword().getText();

		if (JOptionPane.NO_OPTION == response) {

		} else if (JOptionPane.OK_OPTION == response) {
			bossDAO.create(user, password, id);
			JOptionPane.showMessageDialog(managerCreationWin, "CUENTA CREADA CON EXITO");
			System.out.println(id);
		}
	}

	public void createVenue() {

		String name = createVenueWin.getVenueName().getText();
		String locationVenue = createVenueWin.getComboLocation().getSelectedItem().toString();
		String numEmployes = createVenueWin.getNumEmployes().getValue().toString();
		String id = "";

		for (int i = 0; i < bossDAO.getHeadquarterManagerList().size(); i++) {

			id = bossDAO.getHeadquarterManagerList().get(i).getId();
		}

		System.out.println(id);

		venueDAO.create(name, locationVenue, numEmployes, id);

		JOptionPane.showMessageDialog(createVenueWin, "HAS CREADO CON EXITO UNA NUEVA SEDE");

	}

	public int randomNumberInRange(int minimo, int maximo) {

		return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
	}

	public String randomString() {
		String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String cadena = "";
		int longitud = 20;
		for (int x = 0; x < longitud; x++) {
			int indiceAleatorio = randomNumberInRange(0, banco.length() - 1);
			char caracterAleatorio = banco.charAt(indiceAleatorio);
			cadena += caracterAleatorio;
		}
		return cadena;
	}

	public boolean exitConfirm() {

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO QUE QUIERE CERRAR EL APLICATIVO?", "¿SALIR?",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		return confirmation;

	}

	public void updateBoxSelectShowVenue() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selShowVenOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selShowVenOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}

	}

	public void updateBoxSelectUpdateVenue() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selUpdateVenOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selUpdateVenOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}

	}

	public void updateBoxSelectDeleteVenue() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selDeleteVenueOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selDeleteVenueOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}

	}

	public void updateBoxSelectShowVenueGambler() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selShowGamblerOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selShowGamblerOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}

	}

	public void updateBoxSelectUpdateVenueGambler() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selUpdateGamblerOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selUpdateGamblerOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}

	}

	public void updateBoxSelectDeleteVenueGambler() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selDeleteGamblerOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selDeleteGamblerOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}
	}

	public void setDataToUpdate() {
		updateVenueOwn.getVenueName().setText(selUpdateVenOwn.getComboVenue().getSelectedItem().toString());
		String venue = selUpdateVenOwn.getComboVenue().getSelectedItem().toString();
		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (venue.equals(venueDAO.getHeadquarterList().get(i).getVenueName())) {

				String selLocation = venueDAO.getHeadquarterList().get(i).getLocationVenue();
				int numEmployes = venueDAO.getHeadquarterList().get(i).getEmployeesNumber();

				updateVenueOwn.getComboLocation().setSelectedItem(selLocation);
				updateVenueOwn.getNumEmployes().setValue(numEmployes);

			}

		}

	}

	public void updateVenueOwn() {

		String nameVenue = updateVenueOwn.getVenueName().getText();
		String updateLocation = updateVenueOwn.getComboLocation().getSelectedItem().toString();
		String numEmployes = updateVenueOwn.getNumEmployes().getValue().toString();

		int index = selUpdateGamblerOwn.getComboVenue().getSelectedIndex();

		System.out.println(index);

		venueDAO.updateByIndex(index, nameVenue, updateLocation, numEmployes);

		JOptionPane.showMessageDialog(updateVenueOwn, "HAS ACTUALIZADO CON EXITO LA SEDE: " + nameVenue);

	}

}
