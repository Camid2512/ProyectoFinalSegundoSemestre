package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.HouseSettingDAO;
import co.edu.unbosque.model.persistence.OwnerDAO;
import co.edu.unbosque.view.BettingHouseManagmentWindow;
import co.edu.unbosque.view.CreateVenueWindow;
import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.ManagerCreationWindow;
import co.edu.unbosque.view.OwnerWindow;
import co.edu.unbosque.view.SelectDeleteVenueOwnWindow;
import co.edu.unbosque.view.SelectShowVenueWindow;
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
		selShowVenOwn = new SelectShowVenueWindow();
		selUpdateVenOwn = new SelectUpdateVenueWindow();
		updateVenueOwn = new UpdateVenueByOwnerWindow();
		selDeleteVenueOwn = new SelectDeleteVenueOwnWindow();
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

		venueManageOwn.getRead().addActionListener(this);
		venueManageOwn.getRead().setActionCommand("SELECTVENUEOWN");

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

		// BOTONES MENU SELECCION SEDE MOSTRAR (OWNER)

		selShowVenOwn.getExit().addActionListener(this);
		selShowVenOwn.getExit().setActionCommand("EXITSELECTSHOWOWN");

		selShowVenOwn.getBack().addActionListener(this);
		selShowVenOwn.getBack().setActionCommand("BACKSELECTSHOWOWN");

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

		// BOTONES MENU SELECCION SEDE ACTUALIZAR (OWNER)

		selDeleteVenueOwn.getExit().addActionListener(this);
		selDeleteVenueOwn.getExit().setActionCommand("EXITSELECTDELETEOWN");

		selDeleteVenueOwn.getBack().addActionListener(this);
		selDeleteVenueOwn.getBack().setActionCommand("BACKSELECTDELETEOWN");

		selDeleteVenueOwn.getNext().addActionListener(this);
		selDeleteVenueOwn.getNext().setActionCommand("DELETEVENUEOWN");

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
		case "EXITSELECTDELETEOWN": {

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
		case "SELECTVENUEOWN": {

			venueManageOwn.setVisible(false);
			selShowVenOwn.setVisible(true);
			break;

		}
		case "SELECTVENUEUPDATEOWN": {

			venueManageOwn.setVisible(false);
			selUpdateVenOwn.setVisible(true);
			break;

		}
		case "SELECTVENUEDELETEOWN": {

			venueManageOwn.setVisible(false);
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
			break;

		}
		case "BACKSELECTSHOWOWN": {

			selShowVenOwn.setVisible(false);
			venueManageOwn.setVisible(true);

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
		case "BACKSELECTDELETEOWN": {

			selDeleteVenueOwn.setVisible(false);
			venueManageOwn.setVisible(true);
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
}
