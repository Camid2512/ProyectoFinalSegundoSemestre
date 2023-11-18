package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.BallotDAO;
import co.edu.unbosque.model.persistence.BetPlayDAO;
import co.edu.unbosque.model.persistence.ChanceDAO;
import co.edu.unbosque.model.persistence.GamblerDAO;
import co.edu.unbosque.model.persistence.GameDAO;
import co.edu.unbosque.model.persistence.HeadquarterDAO;
import co.edu.unbosque.model.persistence.HeadquarterManagerDAO;
import co.edu.unbosque.model.persistence.HouseSettingDAO;
import co.edu.unbosque.model.persistence.LoteryBetDAO;
import co.edu.unbosque.model.persistence.OwnerDAO;
import co.edu.unbosque.model.persistence.ReceiptDAO;
import co.edu.unbosque.model.persistence.SuperAstroDAO;
import co.edu.unbosque.util.SameDocumentException;
import co.edu.unbosque.view.BalotoWindow;
import co.edu.unbosque.view.BetManagmentByOwnerWindow;
import co.edu.unbosque.view.BetMenuOwnerWindow;
import co.edu.unbosque.view.BetPlayWindow;
import co.edu.unbosque.view.BettingHouseManagmentWindow;
import co.edu.unbosque.view.ChanceWindow;
import co.edu.unbosque.view.CreateGamblerWindow;
import co.edu.unbosque.view.CreateVenueWindow;
import co.edu.unbosque.view.GamblerManagmentByOwnerWindow;
import co.edu.unbosque.view.GamblerUpdateOwnWindow;
import co.edu.unbosque.view.GamesSettingWindow;
import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.LoteriaWindowOwner;
import co.edu.unbosque.view.ManagerCreationWindow;
import co.edu.unbosque.view.OwnerWindow;
import co.edu.unbosque.view.ReceiptWindow;
import co.edu.unbosque.view.SelGamblerCreateBetOwnWindow;
import co.edu.unbosque.view.SelectCreateBetWindow;
import co.edu.unbosque.view.SelectDeleteGamblerOwnWindow;
import co.edu.unbosque.view.SelectDeleteVenueOwnWindow;
import co.edu.unbosque.view.SelectGamblerAfterVenueWindow;
import co.edu.unbosque.view.SelectGamblerAfterVenueWindowToDelete;
import co.edu.unbosque.view.SelectShowBetWindow;
import co.edu.unbosque.view.SelectShowGamblerWindow;
import co.edu.unbosque.view.SelectShowVenueWindow;
import co.edu.unbosque.view.SelectUpdateBetWindow;
import co.edu.unbosque.view.SelectUpdateGamblerWindow;
import co.edu.unbosque.view.SelectUpdateVenueWindow;
import co.edu.unbosque.view.SignUpWindow;
import co.edu.unbosque.view.SuperAstroWindow;
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
	private GamblerUpdateOwnWindow gamUpdateWinOwn;
	private SelectDeleteGamblerOwnWindow selDeleteGamblerOwn;
	private BetManagmentByOwnerWindow betManOwn;
	private SelectCreateBetWindow selcreatebet;
	private SelGamblerCreateBetOwnWindow selGamCreateBetOwn;
	private GamesSettingWindow gamesSettingWin;
	private SelectGamblerAfterVenueWindow selGamToUpdateWinOwn;
	private SelectGamblerAfterVenueWindowToDelete selGamToDeleteWinOwn;
	private SelectShowBetWindow selShowBetWinOwn;
	private SelectUpdateBetWindow selUpdBetWinOwn;
	private BetMenuOwnerWindow betMenuOwn;
	private LoteriaWindowOwner loteriaWin;
	private BalotoWindow balotoWin;
	private SuperAstroWindow superastroWin;
	private ChanceWindow chanceWin;
	private BetPlayWindow betplayWin;
	private ReceiptWindow receiptWindow;

	private HouseSettingDAO houseDAO;
	private GameDAO gameDAO;
	private OwnerDAO ownDAO;
	private HeadquarterManagerDAO bossDAO;
	private HeadquarterDAO venueDAO;
	private GamblerDAO gamDAO;
	private LoteryBetDAO loteriaDAO;
	private BallotDAO balotoDAO;
	private SuperAstroDAO superAstroDAO;
	private ChanceDAO chanceDAO;
	private BetPlayDAO betPlayDAO;
	private ReceiptDAO receiptDAO;

	public Controller() {

		houseDAO = new HouseSettingDAO();
		gameDAO = new GameDAO();
		ownDAO = new OwnerDAO();
		bossDAO = new HeadquarterManagerDAO();
		venueDAO = new HeadquarterDAO();
		gamDAO = new GamblerDAO();
		loteriaDAO = new LoteryBetDAO();
		balotoDAO = new BallotDAO();
		superAstroDAO = new SuperAstroDAO();
		chanceDAO = new ChanceDAO();
		betPlayDAO = new BetPlayDAO();
		receiptDAO = new ReceiptDAO();

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
		gamesSettingWin = new GamesSettingWindow();
		selGamToUpdateWinOwn = new SelectGamblerAfterVenueWindow();
		selGamToDeleteWinOwn = new SelectGamblerAfterVenueWindowToDelete();
		selShowBetWinOwn = new SelectShowBetWindow();
		selUpdBetWinOwn = new SelectUpdateBetWindow();
		gamUpdateWinOwn = new GamblerUpdateOwnWindow();
		selGamCreateBetOwn = new SelGamblerCreateBetOwnWindow();
		betMenuOwn = new BetMenuOwnerWindow();
		loteriaWin = new LoteriaWindowOwner();
		balotoWin = new BalotoWindow();
		balotoWin = new BalotoWindow();
		superastroWin = new SuperAstroWindow();
		chanceWin = new ChanceWindow();
		betplayWin = new BetPlayWindow();
		receiptWindow = new ReceiptWindow();

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
		// BOTON RECIBO

		receiptWindow.getExit().addActionListener(this);
		receiptWindow.getExit().setActionCommand("EXITRECEIPT");

		// BOTONES DE VENTANA REGISTER

		signWind.getExit().addActionListener(this);
		signWind.getExit().setActionCommand("EXIT");
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
		logWind.getExit().setActionCommand("EXIT");

		// BOTONES DE VENTANA DUENO

		ownWind.getMod1Btn().addActionListener(this);
		ownWind.getMod1Btn().setActionCommand("BOTONMOD1OWN");

		ownWind.getExit().addActionListener(this);
		ownWind.getExit().setActionCommand("EXIT");

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
		houseManageWindow.getExit().setActionCommand("EXIT");

		houseManageWindow.getBack().addActionListener(this);
		houseManageWindow.getBack().setActionCommand("BACKHOUSEMANAGE");

		houseManageWindow.getCreateBtn().addActionListener(this);
		houseManageWindow.getCreateBtn().setActionCommand("CREATEHOUSE");

		// BOTONES MODULO 1 VENTANA 2 (OWNER)

		gamesSettingWin.getExit().addActionListener(this);
		gamesSettingWin.getExit().setActionCommand("EXIT");

		gamesSettingWin.getBack().addActionListener(this);
		gamesSettingWin.getBack().setActionCommand("BACKGAMESSETING");

		gamesSettingWin.getConfirmData().addActionListener(this);
		gamesSettingWin.getConfirmData().setActionCommand("CONFIRMGAMESSETING");

		// BOTONES MODULO 2 (OWNER)

		venueManageOwn.getExit().addActionListener(this);
		venueManageOwn.getExit().setActionCommand("EXIT");

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
		managerCreationWin.getExit().setActionCommand("EXIT");

		managerCreationWin.getBack().addActionListener(this);
		managerCreationWin.getBack().setActionCommand("BACKCREATEBOSS");

		managerCreationWin.getCreateAccount().addActionListener(this);
		managerCreationWin.getCreateAccount().setActionCommand("CREATENEWVENUE");

		// BOTONES CREAR SEDE (OWNER)

		createVenueWin.getExit().addActionListener(this);
		createVenueWin.getExit().setActionCommand("EXIT");

		createVenueWin.getBack().addActionListener(this);
		createVenueWin.getBack().setActionCommand("BACKCREATEVENUE");

		createVenueWin.getCreateVenue().addActionListener(this);
		createVenueWin.getCreateVenue().setActionCommand("CREATENEWNEWVENUE");

		// BOTONES MENU SELECCION SEDE MOSTRAR (OWNER)

		selShowVenOwn.getExit().addActionListener(this);
		selShowVenOwn.getExit().setActionCommand("EXIT");

		selShowVenOwn.getBack().addActionListener(this);
		selShowVenOwn.getBack().setActionCommand("BACKSELECTSHOWOWN");

		selShowVenOwn.getNext().addActionListener(this);
		selShowVenOwn.getNext().setActionCommand("NEXTSELECTSHOWOWN");

		// BOTONES MENU SELECCION SEDE ACTUALIZAR (OWNER)

		selUpdateVenOwn.getExit().addActionListener(this);
		selUpdateVenOwn.getExit().setActionCommand("EXIT");

		selUpdateVenOwn.getBack().addActionListener(this);
		selUpdateVenOwn.getBack().setActionCommand("BACKSELECTUPDATEOWN");

		selUpdateVenOwn.getNext().addActionListener(this);
		selUpdateVenOwn.getNext().setActionCommand("MENUUPDATESELECTED");

		// BOTONES ACTUALIZAR SEDE (OWNER)

		updateVenueOwn.getExit().addActionListener(this);
		updateVenueOwn.getExit().setActionCommand("EXIT");

		updateVenueOwn.getBack().addActionListener(this);
		updateVenueOwn.getBack().setActionCommand("BACKUPDATEVENUEOWN");

		updateVenueOwn.getCreateVenue().addActionListener(this);
		updateVenueOwn.getCreateVenue().setActionCommand("UPDATEVENUEOWN");

		// BOTONES MENU SELECCION SEDE ELIMINAR (OWNER)

		selDeleteVenueOwn.getExit().addActionListener(this);
		selDeleteVenueOwn.getExit().setActionCommand("EXIT");

		selDeleteVenueOwn.getBack().addActionListener(this);
		selDeleteVenueOwn.getBack().setActionCommand("BACKSELECTDELETEVENUEOWN");

		selDeleteVenueOwn.getNext().addActionListener(this);
		selDeleteVenueOwn.getNext().setActionCommand("DELETEVENUEOWN");

		// BOTONES MENU APOSTADORES (OWNER)

		gamManageOwn.getExit().addActionListener(this);
		gamManageOwn.getExit().setActionCommand("EXIT");

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
		createGamblerWinOwn.getExit().setActionCommand("EXIT");

		createGamblerWinOwn.getBack().addActionListener(this);
		createGamblerWinOwn.getBack().setActionCommand("BACKCREATEGAMBLEROWN");

		createGamblerWinOwn.getCreateGambler().addActionListener(this);
		createGamblerWinOwn.getCreateGambler().setActionCommand("CREATEGAMBLEROWN");

		// BOTONES MENU SELECCION APOSTADOR MOSTRAR (OWNER)

		selShowGamblerOwn.getExit().addActionListener(this);
		selShowGamblerOwn.getExit().setActionCommand("EXIT");

		selShowGamblerOwn.getBack().addActionListener(this);
		selShowGamblerOwn.getBack().setActionCommand("BACKSELECTSHOWGAMOWN");

		// BOTONES MENU SELECCION APOSTADOR ACTUALIZAR (OWNER)

		selUpdateGamblerOwn.getExit().addActionListener(this);
		selUpdateGamblerOwn.getExit().setActionCommand("EXIT");

		selUpdateGamblerOwn.getBack().addActionListener(this);
		selUpdateGamblerOwn.getBack().setActionCommand("BACKSELECTUPDATEGAMOWN");

		selUpdateGamblerOwn.getNext().addActionListener(this);
		selUpdateGamblerOwn.getNext().setActionCommand("MENUUPDATESELECTEDGAMOWN");

		// BOTONES MENU SELECCIONAR APOSTADOR DE SEDE PARA ACTUALIZAR (OWNER)

		selGamToUpdateWinOwn.getExit().addActionListener(this);
		selGamToUpdateWinOwn.getExit().setActionCommand("EXIT");

		selGamToUpdateWinOwn.getBack().addActionListener(this);
		selGamToUpdateWinOwn.getBack().setActionCommand("BACKGAMBLERTOUPDATESELECT");

		selGamToUpdateWinOwn.getNextStep().addActionListener(this);
		selGamToUpdateWinOwn.getNextStep().setActionCommand("ACTUALIZAR APOSTADOROWN");

		// BOTONES ACTUALIZAR APOSTADOR (OWNER)

		gamUpdateWinOwn.getExit().addActionListener(this);
		gamUpdateWinOwn.getExit().setActionCommand("EXIT");

		gamUpdateWinOwn.getBack().addActionListener(this);
		gamUpdateWinOwn.getBack().setActionCommand("BACKUPDATEGAMBLEROWN");

		gamUpdateWinOwn.getCreateGambler().addActionListener(this);
		gamUpdateWinOwn.getCreateGambler().setActionCommand("BOTONACTUALIZAR APOSTADOROWN");

		// BOTONES MENU SELECCION APOSTADOR ELIMINAR VENTANA 1(OWNER)

		selDeleteGamblerOwn.getExit().addActionListener(this);
		selDeleteGamblerOwn.getExit().setActionCommand("EXIT");

		selDeleteGamblerOwn.getBack().addActionListener(this);
		selDeleteGamblerOwn.getBack().setActionCommand("BACKSELECTDELETEGAMBLEROWN");

		selDeleteGamblerOwn.getNext().addActionListener(this);
		selDeleteGamblerOwn.getNext().setActionCommand("NEXTDELETEGAMBLEROWN");

		// BOTONES MENU SELECCION APOSTADOR ELIMINAR VENTANA 2(OWNER)

		selGamToDeleteWinOwn.getExit().addActionListener(this);
		selGamToDeleteWinOwn.getExit().setActionCommand("EXIT");

		selGamToDeleteWinOwn.getBack().addActionListener(this);
		selGamToDeleteWinOwn.getBack().setActionCommand("BACKSELECTDELETEGAMBLEROWN2");

		selGamToDeleteWinOwn.getNextStep().addActionListener(this);
		selGamToDeleteWinOwn.getNextStep().setActionCommand("DELETE GAMBLEROWN");

		// BOTONES MODULO 4 (OWNER)

		betManOwn.getExit().addActionListener(this);
		betManOwn.getExit().setActionCommand("EXIT");

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
		selcreatebet.getExit().setActionCommand("EXIT");

		selcreatebet.getNext().addActionListener(this);
		selcreatebet.getNext().setActionCommand("NEXTOPTIONSELECTGAMBLERTOBET");

		// BOTONES SELECCIONAR APOSTADOR PARA CREAR APUESTA

		selGamCreateBetOwn.getExit().addActionListener(this);
		selGamCreateBetOwn.getExit().setActionCommand("EXIT");

		selGamCreateBetOwn.getBack().addActionListener(this);
		selGamCreateBetOwn.getBack().setActionCommand("BACKSELECTGAMBLERBETOWN");

		selGamCreateBetOwn.getNextStep().addActionListener(this);
		selGamCreateBetOwn.getNextStep().setActionCommand("SELECTBETTODOOWN");

		// BOTONES MENU DE APUESTAS OWNER

		betMenuOwn.getExit().addActionListener(this);
		betMenuOwn.getExit().setActionCommand("EXIT");

		betMenuOwn.getBack().addActionListener(this);
		betMenuOwn.getBack().setActionCommand("BACKMENUBETTODOOWN");

		betMenuOwn.getLoteria().addActionListener(this);
		betMenuOwn.getLoteria().setActionCommand("LOTERIAOWNER");

		betMenuOwn.getBaloto().addActionListener(this);
		betMenuOwn.getBaloto().setActionCommand("BALOTOOWNER");

		betMenuOwn.getSuperAstro().addActionListener(this);
		betMenuOwn.getSuperAstro().setActionCommand("SUPERASTROOWNER");

		betMenuOwn.getChance().addActionListener(this);
		betMenuOwn.getChance().setActionCommand("CHANCEOWNER");

		betMenuOwn.getBetPlay().addActionListener(this);
		betMenuOwn.getBetPlay().setActionCommand("BETPLAYOWNER");

		// BOTONES SELECCIONAR SEDE MOSTRAR APUESTA

		selShowBetWinOwn.getBack().addActionListener(this);
		selShowBetWinOwn.getBack().setActionCommand("BACKSELECTVENUESHOWBETOWN");

		selShowBetWinOwn.getExit().addActionListener(this);
		selShowBetWinOwn.getExit().setActionCommand("EXIT");

		// BOTONES LOTERIA OWNER

		loteriaWin.getExit().addActionListener(this);
		loteriaWin.getExit().setActionCommand("EXIT");

		loteriaWin.getBack().addActionListener(this);
		loteriaWin.getBack().setActionCommand("BACKLOTERIAWIN");

		loteriaWin.getNext().addActionListener(this);
		loteriaWin.getNext().setActionCommand("NEXTLOTERIAWIN");

		// BOTONES BALOTO OWNER

		balotoWin.getExit().addActionListener(this);
		balotoWin.getExit().setActionCommand("EXIT");

		balotoWin.getBack().addActionListener(this);
		balotoWin.getBack().setActionCommand("BACKBALOTOWIN");

		balotoWin.getNext().addActionListener(this);
		balotoWin.getNext().setActionCommand("NEXTBALOTOWIN");

		// BOTONES SUPERASTRO OWNER

		superastroWin.getExit().addActionListener(this);
		superastroWin.getExit().setActionCommand("EXIT");

		superastroWin.getBack().addActionListener(this);
		superastroWin.getBack().setActionCommand("BACKSUPERASTROWIN");

		superastroWin.getNext().addActionListener(this);
		superastroWin.getNext().setActionCommand("NEXTSUPERASTROWIN");

		// BOTONES CHANCE

		chanceWin.getExit().addActionListener(this);
		chanceWin.getExit().setActionCommand("EXIT");

		chanceWin.getBack().addActionListener(this);
		chanceWin.getBack().setActionCommand("BACKCHANCEWIN");

		chanceWin.getNext().addActionListener(this);
		chanceWin.getNext().setActionCommand("NEXTCHANCEWIN");

		// BOTONES BETPLAY

		betplayWin.getExit().addActionListener(this);
		betplayWin.getExit().setActionCommand("EXIT");

		betplayWin.getBack().addActionListener(this);
		betplayWin.getBack().setActionCommand("BACKBETPLAYWIN");

		betplayWin.getNext().addActionListener(this);
		betplayWin.getNext().setActionCommand("NEXTBETPLAYWIN");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "BOTONREGISTRO": {

			signWind.setVisible(true);
			logWind.setVisible(false);

			break;
		}

		case "EXITRECEIPT": {

			receiptWindow.setVisible(false);
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

			logWind.setVisible(true);
			signWind.setVisible(false);

			signWind.getUsuario().setText(null);
			signWind.getPassword().setText(null);
			break;

		}

		case "EXIT": {
			boolean confirm = exitConfirm();
			if (confirm) {
				System.exit(1);
			} else {

			}
			break;
		}

		case "BOTONMOD1OWN": {

			houseManageWindow.setVisible(true);
			logWind.setVisible(false);
			ownWind.setVisible(false);

			break;
		}

		case "CREATEHOUSE": {

			createHouse();

			gamesSettingWin.setVisible(true);
			houseManageWindow.setVisible(false);

			break;
		}

		case "BOTONMOD2OWN": {

			venueManageOwn.setVisible(true);
			ownWind.setVisible(false);

			break;
		}

		case "BOTONMOD3OWN": {
			gamManageOwn.setVisible(true);
			ownWind.setVisible(false);
			break;
		}

		case "BOTONMOD4OWN": {
			betManOwn.setVisible(true);
			ownWind.setVisible(false);
			break;
		}

		case "BACKVENUEOWN": {
			ownWind.setVisible(true);
			venueManageOwn.setVisible(false);
			break;
		}

		case "CREATEVENUE": {
			managerCreationWin.setVisible(true);
			venueManageOwn.setVisible(false);
			break;

		}

		case "CREATENEWVENUE": {
			createVenueWin.setVisible(true);
			managerCreationWin.setVisible(false);
			createBoss();
			managerCreationWin.getUser().setText("");
			managerCreationWin.getPassword().setText("");
			break;

		}
		case "SELECTVENUESHOWOWN": {
			selShowVenOwn.setVisible(true);
			venueManageOwn.setVisible(false);
			updateBoxSelectShowVenue();
			break;

		}
		case "SELECTVENUEUPDATEOWN": {
			selUpdateVenOwn.setVisible(true);
			venueManageOwn.setVisible(false);
			updateBoxSelectUpdateVenue();
			break;

		}
		case "SELECTVENUEDELETEOWN": {
			selDeleteVenueOwn.setVisible(true);
			venueManageOwn.setVisible(false);
			updateBoxSelectDeleteVenue();
			break;
		}
		case "BACKSELECTUPDATEOWN": {
			venueManageOwn.setVisible(true);
			selUpdateVenOwn.setVisible(false);
			break;

		}
		case "MENUUPDATESELECTED": {
			updateVenueOwn.setVisible(true);
			selUpdateVenOwn.setVisible(false);
			setDataToUpdateVenue();
			break;

		}
		case "BACKSELECTSHOWOWN": {
			venueManageOwn.setVisible(true);
			selShowVenOwn.setVisible(false);
		}
		case "BACKCREATEBOSS": {
			venueManageOwn.setVisible(true);
			managerCreationWin.setVisible(false);

			managerCreationWin.getUser().setText(null);
			managerCreationWin.getPassword().setText(null);
			break;

		}

		case "BACKOWN": {
			logWind.setVisible(true);
			ownWind.setVisible(false);
			break;

		}
		case "BACKHOUSEMANAGE": {
			ownWind.setVisible(true);
			houseManageWindow.setVisible(false);
			break;
		}
		case "BACKCREATEVENUE": {
			venueManageOwn.setVisible(true);
			createVenueWin.setVisible(false);

			createVenueWin.getVenueName().setText(null);
			createVenueWin.getComboLocation().setSelectedIndex(0);

			createVenueWin.getNumEmployes().setValue(0);

			break;
		}
		case "BACKUPDATEVENUEOWN": {
			selUpdateVenOwn.setVisible(true);
			updateVenueOwn.setVisible(false);

			updateVenueOwn.getVenueName().setText(null);
			updateVenueOwn.getComboLocation().setSelectedIndex(0);
			updateVenueOwn.getNumEmployes().setValue(0);
			break;

		}
		case "BACKSELECTDELETEVENUEOWN": {
			venueManageOwn.setVisible(true);
			selDeleteVenueOwn.setVisible(false);
			break;
		}

		case "BACKMENUGAMBLEROWN": {
			ownWind.setVisible(true);
			gamManageOwn.setVisible(false);
			break;
		}

		case "CREATEGAMBLER": {
			createGamblerWinOwn.setVisible(true);
			gamManageOwn.setVisible(false);
			updateBoxCreateGambler();
			break;
		}

		case "BACKCREATEGAMBLEROWN": {
			gamManageOwn.setVisible(true);
			createGamblerWinOwn.setVisible(false);

			createGamblerWinOwn.getCompleteName().setText(null);
			createGamblerWinOwn.getDocument().setText(null);
			createGamblerWinOwn.getAdress().setText(null);
			createGamblerWinOwn.getPhoneNumber().setText(null);

			break;

		}

		case "BACKSELECTSHOWGAMOWN": {
			gamManageOwn.setVisible(true);
			selShowGamblerOwn.setVisible(false);
			break;

		}

		case "BACKSELECTUPDATEGAMOWN": {
			gamManageOwn.setVisible(true);
			selUpdateGamblerOwn.setVisible(false);
			break;

		}

		case "SELECTGAMBLERSHOWOWN": {
			selShowGamblerOwn.setVisible(true);
			gamManageOwn.setVisible(false);
			updateBoxSelectShowVenueGambler();
			break;
		}

		case "SELECTGAMBLERUPDATEOWN": {
			selUpdateGamblerOwn.setVisible(true);
			gamManageOwn.setVisible(false);
			updateBoxSelectUpdateVenueGambler();
			break;
		}

		case "SELECTGAMBLERDELETEOWN": {
			selDeleteGamblerOwn.setVisible(true);
			gamManageOwn.setVisible(false);
			updateBoxSelectDeleteVenueGambler();
			break;
		}

		case "BACKSELECTDELETEGAMBLEROWN": {
			gamManageOwn.setVisible(true);
			selDeleteGamblerOwn.setVisible(false);
			break;
		}

		case "BACKMENUBETOWN": {
			ownWind.setVisible(true);
			betManOwn.setVisible(false);
			break;
		}

		case "CREATEBET": {
			selcreatebet.setVisible(true);
			betManOwn.setVisible(false);
			updateBoxCreateBet();
			break;

		}

		case "BACKSELECTVENUEBETOWN": {
			betManOwn.setVisible(true);
			selcreatebet.setVisible(false);
			break;
		}
		case "CREATENEWNEWVENUE": {
			venueManageOwn.setVisible(true);
			String item = "";
			int itemN = 0;
			createVenue();
			createVenueWin.getVenueName().setText("");
			createVenueWin.getComboLocation().setSelectedItem(item);
			createVenueWin.getNumEmployes().setValue(itemN);
			createVenueWin.setVisible(false);
			break;

		}
		case "UPDATEVENUEOWN": {
			selUpdateVenOwn.setVisible(true);
			updateVenueOwn();
			updateVenueOwn.setVisible(false);
			updateBoxSelectUpdateVenue();
			break;
		}
		case "DELETEVENUEOWN": {
			venueManageOwn.setVisible(true);
			deleteVenueOwn();
			selDeleteVenueOwn.setVisible(false);
			break;
		}

		case "BACKGAMESSETING": {
			houseManageWindow.setVisible(true);
			gamesSettingWin.setVisible(false);
			break;
		}

		case "CONFIRMGAMESSETING": {

			setGameSettings();

			break;
		}

		case "CREATEGAMBLEROWN": {

			createGamblerOwner();
			createGamblerWinOwn.getCompleteName().setText(null);
			createGamblerWinOwn.getDocument().setText(null);
			createGamblerWinOwn.getAdress().setText(null);
			createGamblerWinOwn.getPhoneNumber().setText(null);
			break;

		}
		case "MENUUPDATESELECTEDGAMOWN": {

			selGamToUpdateWinOwn.setVisible(true);
			selUpdateGamblerOwn.setVisible(false);
			String venueAux = selUpdateGamblerOwn.getComboVenue().getSelectedItem().toString();
			updateSelectGamblerUpdate(venueAux);
			break;
		}
		case "BACKGAMBLERTOUPDATESELECT": {

			selUpdateGamblerOwn.setVisible(true);
			selGamToUpdateWinOwn.setVisible(false);
			break;

		}
		case "NEXTDELETEGAMBLEROWN": {
			selGamToDeleteWinOwn.setVisible(true);
			selDeleteGamblerOwn.setVisible(false);
			String venueAux = selDeleteGamblerOwn.getComboVenue().getSelectedItem().toString();
			updateSelectGamblerDelete(venueAux);
			break;
		}

		case "BACKSELECTDELETEGAMBLEROWN2": {
			selDeleteGamblerOwn.setVisible(true);
			selGamToDeleteWinOwn.setVisible(false);
			break;
		}

		case "SELECTBETSHOWOWN": {

			selShowBetWinOwn.setVisible(true);
			betManOwn.setVisible(false);
			updateBoxShowBet();
			break;
		}

		case "BACKSELECTVENUESHOWBETOWN": {
			betManOwn.setVisible(true);
			selShowBetWinOwn.setVisible(false);
			break;
		}
		case "ACTUALIZAR APOSTADOROWN": {

			gamUpdateWinOwn.setVisible(true);
			selGamToUpdateWinOwn.setVisible(false);
			setDataToUpdateGambler();
			updateBoxUpdateVenueGamblerUpdate();
			break;

		}
		case "BACKUPDATEGAMBLEROWN": {

			selGamToUpdateWinOwn.setVisible(true);
			gamUpdateWinOwn.setVisible(false);
			break;

		}
		case "BOTONACTUALIZAR APOSTADOROWN": {
			updateGamblerOwner();

			gamManageOwn.setVisible(true);
			gamUpdateWinOwn.setVisible(false);
			break;
		}
		case "DELETE GAMBLEROWN": {

			gamManageOwn.setVisible(true);
			selGamToDeleteWinOwn.setVisible(false);
			updateBoxSelectDeleteVenueGambler();
			deleteGamblerOwner();
		}
		case "NEXTOPTIONSELECTGAMBLERTOBET": {

			selGamCreateBetOwn.setVisible(true);
			selcreatebet.setVisible(false);
			String aux = selcreatebet.getComboVenue().getSelectedItem().toString();
			updateSelectGamblerCreateBet(aux);
			break;
		}
		case "BACKSELECTGAMBLERBETOWN": {

			selcreatebet.setVisible(true);
			selGamCreateBetOwn.setVisible(false);
			break;

		}
		case "SELECTBETTODOOWN": {

			selGamCreateBetOwn.setVisible(false);
			betMenuOwn.setVisible(true);
			break;
		}
		case "BACKMENUBETTODOOWN": {
			betMenuOwn.setVisible(false);
			selGamCreateBetOwn.setVisible(true);
			break;
		}
		case "LOTERIAOWNER": {

			loteriaWin.setVisible(true);
			betMenuOwn.setVisible(false);
			break;

		}
		case "BALOTOOWNER": {

			balotoWin.setVisible(true);
			betMenuOwn.setVisible(false);
			break;

		}
		case "SUPERASTROOWNER": {

			superastroWin.setVisible(true);
			betMenuOwn.setVisible(false);
			break;

		}
		case "CHANCEOWNER": {

			chanceWin.setVisible(true);
			betMenuOwn.setVisible(false);
			for (int i = 0; i < 5; i++) {

				generateRandomNumber();

			}
			break;
		}
		case "BETPLAYOWNER": {

			betplayWin.setVisible(true);
			betMenuOwn.setVisible(false);
			break;

		}
		case "BACKLOTERIAWIN": {
			betMenuOwn.setVisible(true);
			loteriaWin.setVisible(false);
			loteriaWin.getBetAmount().setText("");
			loteriaWin.getNum1().setValue(0);
			loteriaWin.getNum2().setValue(0);
			loteriaWin.getNum3().setValue(0);
			loteriaWin.getNum4().setValue(0);
			break;

		}
		case "BACKBALOTOWIN": {

			betMenuOwn.setVisible(true);
			balotoWin.setVisible(false);
			balotoWin.getBetAmount().setText("");
			balotoWin.getNum1().setValue(1);
			balotoWin.getNum2().setValue(1);
			balotoWin.getNum3().setValue(1);
			balotoWin.getNum4().setValue(1);
			balotoWin.getNum5().setValue(1);
			balotoWin.getNum6().setValue(1);
			break;

		}
		case "BACKSUPERASTROWIN": {

			betMenuOwn.setVisible(true);
			superastroWin.setVisible(false);
			superastroWin.getBetAmount().setText("");
			superastroWin.getNum1().setValue(0);
			superastroWin.getNum2().setValue(0);
			superastroWin.getNum3().setValue(0);
			superastroWin.getNum4().setValue(0);
			break;

		}
		case "BACKCHANCEWIN": {

			betMenuOwn.setVisible(true);
			chanceWin.setVisible(false);
			chanceWin.getBetAmount().setText(null);
			chanceWin.getNum1().removeAllItems();
			chanceWin.getNum2().removeAllItems();
			chanceWin.getNum3().removeAllItems();
			chanceWin.getNum4().removeAllItems();
			break;

		}
		case "BACKBETPLAYWIN": {

			betMenuOwn.setVisible(true);
			betplayWin.setVisible(false);
			betplayWin.getBetAmount().setText(null);
			betplayWin.getMatch1().setValue(0);
			betplayWin.getMatch2().setValue(0);
			betplayWin.getMatch3().setValue(0);
			betplayWin.getMatch4().setValue(0);
			betplayWin.getMatch5().setValue(0);
			betplayWin.getMatch6().setValue(0);
			betplayWin.getMatch7().setValue(0);
			betplayWin.getMatch8().setValue(0);
			betplayWin.getMatch9().setValue(0);
			betplayWin.getMatch10().setValue(0);
			betplayWin.getMatch11().setValue(0);
			betplayWin.getMatch12().setValue(0);
			betplayWin.getMatch13().setValue(0);
			betplayWin.getMatch14().setValue(0);
			break;
		}

		case "NEXTLOTERIAWIN": {

			makeLoteryBetOwn();

			loteriaWin.getBetAmount().setText("");
			loteriaWin.getNum1().setValue(0);
			loteriaWin.getNum2().setValue(0);
			loteriaWin.getNum3().setValue(0);
			loteriaWin.getNum4().setValue(0);

			break;

		}
		case "NEXTBALOTOWIN": {

			makeBalotoBetOwn();

			balotoWin.getBetAmount().setText("");
			balotoWin.getNum1().setValue(1);
			balotoWin.getNum2().setValue(1);
			balotoWin.getNum3().setValue(1);
			balotoWin.getNum4().setValue(1);
			balotoWin.getNum5().setValue(1);
			balotoWin.getNum6().setValue(1);
			break;

		}
		case "NEXTSUPERASTROWIN": {

			makeSuperAstroBetOwn();

			superastroWin.getBetAmount().setText("");
			superastroWin.getNum1().setValue(0);
			superastroWin.getNum2().setValue(0);
			superastroWin.getNum3().setValue(0);
			superastroWin.getNum4().setValue(0);
			break;
		}

		case "NEXTCHANCEWIN": {

			makeChanceBetOwn();
			chanceWin.getBetAmount().setText(null);
			chanceWin.getNum1().removeAllItems();
			chanceWin.getNum2().removeAllItems();
			chanceWin.getNum3().removeAllItems();
			chanceWin.getNum4().removeAllItems();

			break;

		}
		case "NEXTBETPLAYWIN": {

			makeBetPlayBetOwn();
			betplayWin.getBetAmount().setText(null);
			betplayWin.getMatch1().setValue(0);
			betplayWin.getMatch2().setValue(0);
			betplayWin.getMatch3().setValue(0);
			betplayWin.getMatch4().setValue(0);
			betplayWin.getMatch5().setValue(0);
			betplayWin.getMatch6().setValue(0);
			betplayWin.getMatch7().setValue(0);
			betplayWin.getMatch8().setValue(0);
			betplayWin.getMatch9().setValue(0);
			betplayWin.getMatch10().setValue(0);
			betplayWin.getMatch11().setValue(0);
			betplayWin.getMatch12().setValue(0);
			betplayWin.getMatch13().setValue(0);
			betplayWin.getMatch14().setValue(0);

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

		int cont = 0;
		for (int i = 0; i < ownDAO.getOwnerList().size(); i++) {

			if (nameToCheck.equals(ownDAO.getOwnerList().get(i).getUsername())
					&& passToCheck.equals(ownDAO.getOwnerList().get(i).getPassword())) {
				cont = 1;

			} else {
				for (int j = 0; j < bossDAO.getHeadquarterManagerList().size(); j++) {
					if (nameToCheck.equals(bossDAO.getHeadquarterManagerList().get(j).getUser())
							&& passToCheck.equals(bossDAO.getHeadquarterManagerList().get(j).getPassword())) {
						cont = 2;
					} else {

					}
				}

			}

		}

		if (cont == 1) {
			JOptionPane.showMessageDialog(logWind, "----INGRESANDO----");
			ownWind.setVisible(true);
		}
		if (cont == 0) {
			JOptionPane.showMessageDialog(logWind, "Usuario y/o Contraseña ERRADOS", "NO EXIST", 0);
			logWind.setVisible(true);
		}
		if (cont == 2) {

			JOptionPane.showMessageDialog(logWind, "----INGRESANDO----");
			balotoWin.setVisible(true);

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

	public void updateBoxUpdateVenueGamblerUpdate() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			gamUpdateWinOwn.getComboLocation().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				gamUpdateWinOwn.getComboLocation().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());

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

	public void setDataToUpdateVenue() {
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

	public void setDataToUpdateGambler() {

		gamUpdateWinOwn.getDocument().setText(selGamToUpdateWinOwn.getComboGambler().getSelectedItem().toString());

		long gambler = Long.parseLong(selGamToUpdateWinOwn.getComboGambler().getSelectedItem().toString());

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			if (gambler == gamDAO.getGamblerList().get(i).getDocumentId()) {
				String fullName = String.valueOf(gamDAO.getGamblerList().get(i).getFullName());
				String addres = gamDAO.getGamblerList().get(i).getAddres();
				String phoneNumber = String.valueOf(gamDAO.getGamblerList().get(i).getPhoneNumber());
				String gamingVenue = gamDAO.getGamblerList().get(i).getGamingVenue();

				gamUpdateWinOwn.getCompleteName().setText(fullName);
				gamUpdateWinOwn.getAdress().setText(addres);
				gamUpdateWinOwn.getPhoneNumber().setText(phoneNumber);
				gamUpdateWinOwn.getComboLocation().setSelectedItem(gamingVenue);

			}

		}

	}

	public void updateVenueOwn() {

		String nameVenue = updateVenueOwn.getVenueName().getText();
		String updateLocation = updateVenueOwn.getComboLocation().getSelectedItem().toString();
		String numEmployes = updateVenueOwn.getNumEmployes().getValue().toString();
		int index = 0;

		String id = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			String aux = selUpdateVenOwn.getComboVenue().getSelectedItem().toString();

			if (aux.equals(venueDAO.getHeadquarterList().get(i).getVenueName())) {
				index = i;
				id = venueDAO.getHeadquarterList().get(i).getId();
			}

		}

		System.out.println(index);

		venueDAO.updateByIndex(index, nameVenue, updateLocation, numEmployes, id);

		JOptionPane.showMessageDialog(updateVenueOwn, "HAS ACTUALIZADO CON EXITO LA SEDE: " + nameVenue);

	}

	public void deleteVenueOwn() {
		int index = 0;

		String aux = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			aux = selDeleteVenueOwn.getComboVenue().getSelectedItem().toString();

			if (aux.equals(venueDAO.getHeadquarterList().get(i).getVenueName())) {
				index = i;
			}

		}

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE ELIMINAR LA SEDE: " + aux + "?",
				"DELETE_OPTION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {
			venueDAO.delete(index);
		} else {

		}

	}

	public void setGameSettings() {

		double budget1 = Double.parseDouble(gamesSettingWin.getBudget1().getText());
		double budget2 = Double.parseDouble(gamesSettingWin.getBudget2().getText());
		double budget3 = Double.parseDouble(gamesSettingWin.getBudget3().getText());
		double budget4 = Double.parseDouble(gamesSettingWin.getBudget4().getText());
		double budget5 = Double.parseDouble(gamesSettingWin.getBudget5().getText());

		double temp = Double.parseDouble(houseManageWindow.getTotalBudget().getText());
		if (gameDAO.totalBudgetCalculated(budget1, budget2, budget3, budget4, budget5) == temp) {
			gameDAO.create(budget1, budget2, budget3, budget4, budget5);
			JOptionPane.showMessageDialog(gamesSettingWin,
					"HAS ESTABLECIDO CORRECTAMENTE TODOS LOS PARAMETROS DE TU CASA DE APUESTAS");
		} else {
			JOptionPane.showMessageDialog(gamesSettingWin,
					"ALGUNO DE LOS PRESUPUESTOS NO COINCIDE CON EL PRESUPUESTO TOTAL", "error", 0);

		}
	}

	public String updateBoxCreateGambler() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			createGamblerWinOwn.getComboLocation().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				createGamblerWinOwn.getComboLocation().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}

		}
		String opcion = createGamblerWinOwn.getComboLocation().getSelectedItem().toString();
		return opcion;
	}

	public void updateBoxCreateBet() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selcreatebet.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selcreatebet.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}
	}

	public void updateBoxShowBet() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selShowBetWinOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selShowBetWinOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}

		}

	}

	public void updateSelectGamblerUpdate(String data) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGamToUpdateWinOwn.getComboGambler().removeAllItems();
			for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {
				if (data.equals(gamDAO.getGamblerList().get(i).getGamingVenue())) {
					selGamToUpdateWinOwn.getComboGambler().addItem(gamDAO.getGamblerList().get(i).getDocumentId());
				}
			}
		}
	}

	public void updateSelectGamblerCreateBet(String data) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGamCreateBetOwn.getComboGambler().removeAllItems();
			for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {
				if (data.equals(gamDAO.getGamblerList().get(i).getGamingVenue())) {
					selGamCreateBetOwn.getComboGambler().addItem(gamDAO.getGamblerList().get(i).getDocumentId());
				}
			}
		}
	}

	public void updateSelectGamblerDelete(String data) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGamToDeleteWinOwn.getComboGambler().removeAllItems();
			for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {
				if (data.equals(gamDAO.getGamblerList().get(i).getGamingVenue())) {
					selGamToDeleteWinOwn.getComboGambler().addItem(gamDAO.getGamblerList().get(i).getDocumentId());
				}
			}
		}
	}

	public void createGamblerOwner() {

		String fullName = "";
		String document = "";
		String gamingVenue = "";
		String adress = "";
		String phoneNumber = "";
		while (true) {
			try {
				fullName = createGamblerWinOwn.getCompleteName().getText();
				document = createGamblerWinOwn.getDocument().getText();
				checkDuplicatedDocument(document);
				gamingVenue = createGamblerWinOwn.getComboLocation().getSelectedItem().toString();
				adress = createGamblerWinOwn.getAdress().getText();
				phoneNumber = createGamblerWinOwn.getPhoneNumber().getText();

				if (checkDuplicatedDocument(document) == true) {
					gamDAO.create(fullName, document, gamingVenue, adress, phoneNumber);
					JOptionPane.showMessageDialog(gamesSettingWin, "EL APOSTADOR " + fullName + " HA SIDO CREADO");
				} else {

				}

			} catch (SameDocumentException e) {
				// TODO: handle exception

				createGamblerWinOwn.getDocument().setText("");
				gamDAO.delete(0);

			}
			break;
		}
	}

	public void updateGamblerOwner() {

		String fullName = gamUpdateWinOwn.getCompleteName().getText();
		String document = gamUpdateWinOwn.getDocument().getText();
		String addres = gamUpdateWinOwn.getAdress().getText();
		String phoneNumber = gamUpdateWinOwn.getPhoneNumber().getText();
		String gamingVenue = gamUpdateWinOwn.getComboLocation().getSelectedItem().toString();
		int index = 0;

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			long aux = Long.parseLong(gamUpdateWinOwn.getDocument().getText());

			if (aux == gamDAO.getGamblerList().get(i).getDocumentId()) {
				index = i;
			}

		}

		System.out.println(index);

		gamDAO.updateByIndex(index, fullName, document, gamingVenue, addres, phoneNumber);

	}

	public void deleteGamblerOwner() {

		int index = 0;

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			long aux = Long.parseLong(selGamToDeleteWinOwn.getComboGambler().getSelectedItem().toString());

			if (aux == gamDAO.getGamblerList().get(i).getDocumentId()) {
				index = i;
			}

		}

		gamDAO.delete(index);

	}

	public boolean checkDuplicatedDocument(String document) throws SameDocumentException {

		boolean check = true;

		long documentToCheck = Long.parseLong(document);
		int cont = 0;
		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			if (documentToCheck == gamDAO.getGamblerList().get(i).getDocumentId()) {

				cont++;

			} else {

			}

		}
		if (cont > 0) {
			JOptionPane.showMessageDialog(logWind, "NO PUEDEN EXISTIR 2 DOCUMENTOS IGUALES", "EXCEPTION", 0);
			check = false;
		} else if (cont == 0) {
			check = true;

		}
		return check;
	}

	public void makeLoteryBetOwn() {

		LocalDate actualDate = LocalDate.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String date = day + "/" + month + "/" + year;

		String betPlaced = loteriaWin.getBetAmount().getText();

		String headQuarterName = selcreatebet.getComboVenue().getSelectedItem().toString();

		String document = selGamCreateBetOwn.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String loteryName = loteriaWin.getLoteryType().getSelectedItem().toString();

		String typeBet = "LOTERIA";

		String num1 = loteriaWin.getNum1().getValue().toString();
		String num2 = loteriaWin.getNum2().getValue().toString();
		String num3 = loteriaWin.getNum3().getValue().toString();
		String num4 = loteriaWin.getNum4().getValue().toString();

		String numbers = num1 + num2 + num3 + num4;

		String serialNum = loteriaWin.getSerialNumber().getSelectedItem().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {
			loteriaDAO.create(day, month, year, betPlaced, headQuarterName, document, loteryName, numbers, serialNum);
			JOptionPane.showMessageDialog(loteriaWin,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(date, name, document, headQuarterName, typeBet);
			receiptWindow.setVisible(true);
			receiptWindow.getDate().setText(date);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);
		} else {

		}

	}

	public void makeBalotoBetOwn() {

		LocalDate actualDate = LocalDate.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String date = day + "/" + month + "/" + year;

		String betPlaced = balotoWin.getBetAmount().getText();

		String headQuarterName = selcreatebet.getComboVenue().getSelectedItem().toString();

		String document = selGamCreateBetOwn.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "LOTERIA";

		String num1 = balotoWin.getNum1().getValue().toString();
		String num2 = balotoWin.getNum2().getValue().toString();
		String num3 = balotoWin.getNum3().getValue().toString();
		String num4 = balotoWin.getNum4().getValue().toString();
		String num5 = balotoWin.getNum5().getValue().toString();
		String num6 = balotoWin.getNum6().getValue().toString();

		String numbers = num1 + num2 + num3 + num4 + num5 + num6;

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {
			balotoDAO.create(day, month, year, betPlaced, headQuarterName, document, numbers);
			JOptionPane.showMessageDialog(balotoWin, "HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2
					+ "-" + num3 + "-" + num4 + "-" + num5 + "-" + num6);
			receiptDAO.create(date, name, document, headQuarterName, typeBet);
			receiptWindow.setVisible(true);
			receiptWindow.getDate().setText(date);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);
		} else {

		}

	}

	public void makeSuperAstroBetOwn() {

		LocalDate actualDate = LocalDate.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String date = day + "/" + month + "/" + year;

		String betPlaced = superastroWin.getBetAmount().getText();

		String headQuarterName = selcreatebet.getComboVenue().getSelectedItem().toString();

		String document = selGamCreateBetOwn.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "LOTERIA";

		String num1 = superastroWin.getNum1().getValue().toString();
		String num2 = superastroWin.getNum2().getValue().toString();
		String num3 = superastroWin.getNum3().getValue().toString();
		String num4 = superastroWin.getNum4().getValue().toString();

		String numbers = num1 + num2 + num3 + num4;

		String zodiacSign = superastroWin.getZodiacSign().getSelectedItem().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {
			superAstroDAO.create(day, month, year, betPlaced, headQuarterName, document, numbers, zodiacSign);
			JOptionPane.showMessageDialog(superastroWin,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(date, name, document, headQuarterName, typeBet);
			receiptWindow.setVisible(true);
			receiptWindow.getDate().setText(date);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);
		} else {

		}

	}

	public void generateRandomNumber() {

		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		Random rand4 = new Random();
		int num1 = rand1.nextInt(99);
		int num2 = rand2.nextInt(99);
		int num3 = rand3.nextInt(99);
		int num4 = rand4.nextInt(99);

		chanceWin.getNum1().addItem(num1);
		chanceWin.getNum2().addItem(num2);
		chanceWin.getNum3().addItem(num3);
		chanceWin.getNum4().addItem(num4);

	}

	public void makeChanceBetOwn() {
		LocalDate actualDate = LocalDate.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String date = day + "/" + month + "/" + year;

		String betPlaced = chanceWin.getBetAmount().getText();

		String headQuarterName = selcreatebet.getComboVenue().getSelectedItem().toString();

		String document = selGamCreateBetOwn.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String loteryName = "SANTI HACE ESTO POR FAVOR NO SE TE OLVIDE";

		String typeBet = "CHANCE";

		String num1 = chanceWin.getNum1().getSelectedItem().toString();
		String num2 = chanceWin.getNum2().getSelectedItem().toString();
		String num3 = chanceWin.getNum3().getSelectedItem().toString();
		String num4 = chanceWin.getNum4().getSelectedItem().toString();

		String numbers = num1 + num2 + num3 + num4;

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;

		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		} else if (JOptionPane.CANCEL_OPTION == response) {
			confirmation = false;
		}
		if (confirmation) {
			chanceDAO.create(day, month, year, betPlaced, headQuarterName, document, loteryName, numbers);
			JOptionPane.showMessageDialog(chanceWin,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(date, name, document, headQuarterName, typeBet);
			receiptWindow.setVisible(true);
			receiptWindow.getDate().setText(date);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

		} else {
		}

	}

	public void makeBetPlayBetOwn() {
		LocalDate actualDate = LocalDate.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String date = day + "/" + month + "/" + year;

		String betPlaced = betplayWin.getBetAmount().getText();

		String headQuarterName = selcreatebet.getComboVenue().getSelectedItem().toString();

		String document = selGamCreateBetOwn.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "DEPORTIVO";

		String match1 = betplayWin.getMatch1().getValue().toString();
		String match2 = betplayWin.getMatch2().getValue().toString();
		String match3 = betplayWin.getMatch3().getValue().toString();
		String match4 = betplayWin.getMatch4().getValue().toString();
		String match5 = betplayWin.getMatch5().getValue().toString();
		String match6 = betplayWin.getMatch6().getValue().toString();
		String match7 = betplayWin.getMatch7().getValue().toString();
		String match8 = betplayWin.getMatch8().getValue().toString();
		String match9 = betplayWin.getMatch9().getValue().toString();
		String match10 = betplayWin.getMatch10().getValue().toString();
		String match11 = betplayWin.getMatch11().getValue().toString();
		String match12 = betplayWin.getMatch12().getValue().toString();
		String match13 = betplayWin.getMatch13().getValue().toString();
		String match14 = betplayWin.getMatch14().getValue().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {

			betPlayDAO.create(day, month, year, betPlaced, headQuarterName, document, match1, match2, match3, match4,
					match5, match6, match7, match8, match9, match10, match11, match12, match13, match14);

			JOptionPane.showMessageDialog(betplayWin, "HAS REALIZADO LA APUESTA CON EXITO");

			receiptDAO.create(date, name, document, headQuarterName, typeBet);
			receiptWindow.setVisible(true);
			receiptWindow.getDate().setText(date);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);
		} else {

		}

	}

	public String searchNameByDocument(String document) {

		long documentToSearch = Long.parseLong(document);

		String name = "";

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {
			if (documentToSearch == gamDAO.getGamblerList().get(i).getDocumentId()) {
				name = gamDAO.getGamblerList().get(i).getFullName();
			}
		}

		return name;

	}

}