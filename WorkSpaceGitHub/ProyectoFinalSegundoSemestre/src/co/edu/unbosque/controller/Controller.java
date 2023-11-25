package co.edu.unbosque.controller;

/**
 * 
 * Clase encargada de llevar el control del programa
 * 
 * @author SOFTPYLSA
 * 
 * @version 1.0
 * 
 * @since 10/11/2023
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.BallotDAO;
import co.edu.unbosque.model.persistence.BetPlayDAO;
import co.edu.unbosque.model.persistence.ChanceDAO;
import co.edu.unbosque.model.persistence.CheckerDAO;
import co.edu.unbosque.model.persistence.GamblerDAO;
import co.edu.unbosque.model.persistence.GameDAO;
import co.edu.unbosque.model.persistence.HeadquarterDAO;
import co.edu.unbosque.model.persistence.HeadquarterManagerDAO;
import co.edu.unbosque.model.persistence.HouseSettingDAO;
import co.edu.unbosque.model.persistence.LoteryBetDAO;
import co.edu.unbosque.model.persistence.OwnerDAO;
import co.edu.unbosque.model.persistence.ReceiptDAO;
import co.edu.unbosque.model.persistence.SuperAstroDAO;
import co.edu.unbosque.util.EmptyDataException;
import co.edu.unbosque.util.NotValidNameException;
import co.edu.unbosque.util.NotValidPasswordException;
import co.edu.unbosque.util.NumberNotValidException;
import co.edu.unbosque.util.SameDocumentException;
import co.edu.unbosque.util.SameUserException;
import co.edu.unbosque.view.BalotoCashier;
import co.edu.unbosque.view.BalotoManager;
import co.edu.unbosque.view.BalotoWindow;
import co.edu.unbosque.view.BetManagmentByCashierWindow;
import co.edu.unbosque.view.BetManagmentByManagerWindow;
import co.edu.unbosque.view.BetManagmentByOwnerWindow;
import co.edu.unbosque.view.BetMenuCashierWindow;
import co.edu.unbosque.view.BetMenuManagerWindow;
import co.edu.unbosque.view.BetMenuOwnerWindow;
import co.edu.unbosque.view.BetPlayCashier;
import co.edu.unbosque.view.BetPlayManager;
import co.edu.unbosque.view.BetPlayWindow;
import co.edu.unbosque.view.BettingHouseManagmentWindow;
import co.edu.unbosque.view.CashierMainMenu;
import co.edu.unbosque.view.ChanceCashier;
import co.edu.unbosque.view.ChanceManager;
import co.edu.unbosque.view.ChanceWindow;
import co.edu.unbosque.view.ConsultWindow;
import co.edu.unbosque.view.CreateCashier;
import co.edu.unbosque.view.CreateGamblerCashierWindow;
import co.edu.unbosque.view.CreateGamblerManagerWindow;
import co.edu.unbosque.view.CreateGamblerWindow;
import co.edu.unbosque.view.CreateVenueWindow;
import co.edu.unbosque.view.GamblerManagmentByCahier;
import co.edu.unbosque.view.GamblerManagmentByManager;
import co.edu.unbosque.view.GamblerManagmentByOwnerWindow;
import co.edu.unbosque.view.GamblerUpdateOwnWindow;
import co.edu.unbosque.view.GamesSettingWindow;
import co.edu.unbosque.view.LoginWindow;
import co.edu.unbosque.view.LoteriaWindowCashier;
import co.edu.unbosque.view.LoteriaWindowManager;
import co.edu.unbosque.view.LoteriaWindowOwner;
import co.edu.unbosque.view.ManageVenueManager;
import co.edu.unbosque.view.ManagerCreationWindow;
import co.edu.unbosque.view.OwnerWindow;
import co.edu.unbosque.view.ReceiptWindow;
import co.edu.unbosque.view.SelBetToDeleteCashier;
import co.edu.unbosque.view.SelBetToDeleteManager;
import co.edu.unbosque.view.SelBetToDeleteOwn;
import co.edu.unbosque.view.SelGamblerCreateBetCashierWindow;
import co.edu.unbosque.view.SelGamblerCreateBetManWindow;
import co.edu.unbosque.view.SelGamblerCreateBetOwnWindow;
import co.edu.unbosque.view.SelGamblerDeleteBetOwnWindow;
import co.edu.unbosque.view.SelVenuToDeleteBetOwner;
import co.edu.unbosque.view.SelectCreateBetWindow;
import co.edu.unbosque.view.SelectDeleteGamblerOwnWindow;
import co.edu.unbosque.view.SelectDeleteVenueOwnWindow;
import co.edu.unbosque.view.SelectGamblerAfterVenueWindow;
import co.edu.unbosque.view.SelectGamblerAfterVenueWindowToDelete;
import co.edu.unbosque.view.SelectGamblerToDeleteBetCashier;
import co.edu.unbosque.view.SelectGamblerToDeleteBetManager;
import co.edu.unbosque.view.SelectGamblerToDeleteCashier;
import co.edu.unbosque.view.SelectGamblerToDeleteManager;
import co.edu.unbosque.view.SelectGamblerToUpdateCashier;
import co.edu.unbosque.view.SelectGamblerToUpdateManager;
import co.edu.unbosque.view.SelectUpdateGamblerWindow;
import co.edu.unbosque.view.SelectUpdateVenueWindow;
import co.edu.unbosque.view.ShowBetCashier;
import co.edu.unbosque.view.ShowBetManager;
import co.edu.unbosque.view.ShowBetOwn;
import co.edu.unbosque.view.ShowConsult;
import co.edu.unbosque.view.ShowGamblerCashier;
import co.edu.unbosque.view.ShowGamblerManager;
import co.edu.unbosque.view.ShowGamblerOwn;
import co.edu.unbosque.view.ShowVenueOwn;
import co.edu.unbosque.view.SignUpWindow;
import co.edu.unbosque.view.SuperAstroCashier;
import co.edu.unbosque.view.SuperAstroManager;
import co.edu.unbosque.view.SuperAstroWindow;
import co.edu.unbosque.view.UpdateGamblerCashierWindow;
import co.edu.unbosque.view.UpdateGamblerManagerWindow;
import co.edu.unbosque.view.UpdateVenueByOwnerWindow;
import co.edu.unbosque.view.VenueManagerMenu;
import co.edu.unbosque.view.VenueManagmentByOwnerWindow;

/**
 * 
 * Clase encargada de llevar el control del programa
 * 
 * @author SOFTPYLSA
 * 
 * @version 1.0
 * 
 * @since 10/11/2023
 * 
 */
public class Controller implements ActionListener {

	/**
	 * Atributo de ventana login
	 */
	private LoginWindow logWind;
	/**
	 * Atributo de ventana register
	 */
	private SignUpWindow signWind;
	/**
	 * Atributo de ventana dueño
	 */
	private OwnerWindow ownWind;
	/**
	 * Atributo de ventana gestion casa de apuestas
	 */
	private BettingHouseManagmentWindow houseManageWindow;
	/**
	 * Atributo de ventana gestion sede
	 */
	private VenueManagmentByOwnerWindow venueManageOwn;
	/**
	 * Atributo de ventana creacion usuario jefe de sede
	 */
	private ManagerCreationWindow managerCreationWin;
	/**
	 * Atributo de ventana creacion sede
	 */
	private CreateVenueWindow createVenueWin;
	/**
	 * Atributo de ventana seleccion sede a actualizar
	 */
	private SelectUpdateVenueWindow selUpdateVenOwn;
	/**
	 * Atributo de ventana actualizar sede por dueño
	 */
	private UpdateVenueByOwnerWindow updateVenueOwn;
	/**
	 * Atributo de ventana seleccion sede a eliminar por el dueño
	 */
	private SelectDeleteVenueOwnWindow selDeleteVenueOwn;
	/**
	 * Atributo de ventana gestion apostadores por dueño
	 */
	private GamblerManagmentByOwnerWindow gamManageOwn;
	/**
	 * Atributo de ventana creacion apostador por dueño
	 */
	private CreateGamblerWindow createGamblerWinOwn;
	/**
	 * Atributo de ventana seleccion apostador a actualizar
	 */
	private SelectUpdateGamblerWindow selUpdateGamblerOwn;
	/**
	 * Atributo de ventana actualizacion apostador por dueño
	 */
	private GamblerUpdateOwnWindow gamUpdateWinOwn;
	/**
	 * Atributo de ventana seleccion apostador a eliminar
	 */
	private SelectDeleteGamblerOwnWindow selDeleteGamblerOwn;
	/**
	 * Atributo de ventana gestion de apuestas por dueño
	 */
	private BetManagmentByOwnerWindow betManOwn;
	/**
	 * Atributo de ventana menu creacion apuestas
	 */
	private SelectCreateBetWindow selcreatebet;
	/**
	 * Atributo de ventana seleccion sede donde se hara apuesta
	 */
	private SelGamblerCreateBetOwnWindow selGamCreateBetOwn;
	/**
	 * Atributo de ventana gestion de presupuestos de juegos
	 */
	private GamesSettingWindow gamesSettingWin;
	/**
	 * Atributo de ventana seleccion sede donde se hizo apuesta para eliminar una
	 * apuesta
	 */
	private SelectGamblerAfterVenueWindow selGamToUpdateWinOwn;
	/**
	 * Atributo de ventana seleccion apostador que hizo apuesta para elminar una
	 * apuesta
	 */
	private SelectGamblerAfterVenueWindowToDelete selGamToDeleteWinOwn;
	/**
	 * Atributo de ventana menu con todoas las apuestas
	 */
	private BetMenuOwnerWindow betMenuOwn;
	/**
	 * Atributo de ventana de la loteria
	 */
	private LoteriaWindowOwner loteriaWin;
	/**
	 * Atributo de ventana del baloto
	 */
	private BalotoWindow balotoWin;
	/**
	 * Atributo de ventana de superastro
	 */
	private SuperAstroWindow superastroWin;
	/**
	 * Atributo de ventana de chance
	 */
	private ChanceWindow chanceWin;
	/**
	 * Atributo de ventana de betPlay
	 */
	private BetPlayWindow betplayWin;
	/**
	 * Atributo de ventana de recibo
	 */
	private ReceiptWindow receiptWindow;
	private ShowVenueOwn showVenueOwn;
	/**
	 * Atributo de ventana mostrar apostador
	 */
	private ShowGamblerOwn showGamOwn;
	/**
	 * Atributo de ventana mostrar apuestas
	 */
	private ShowBetOwn showBetOwn;
	/**
	 * Atributo de ventana seleccion sede para eliminar una apuesta
	 */
	private SelVenuToDeleteBetOwner selVenDelBetOwn;
	/**
	 * Atributo de ventana seleccion apostador para eliminar una apuesta
	 */
	private SelGamblerDeleteBetOwnWindow selGamDelBetOwn;
	/**
	 * Atributo de ventana seleccion apuesta a eliminar
	 */
	private SelBetToDeleteOwn selBetDeleteOwn;
	/**
	 * Atributo de ventana menu principal jefe de sede
	 */
	private VenueManagerMenu managerMenuWin;
	/**
	 * Atributo de ventana gestion sede por jefe de sede
	 */
	private ManageVenueManager manageVenueManager;
	/**
	 * Atributo de ventana creacion usuario de cajero
	 */
	private CreateCashier createCashier;
	/**
	 * Atributo de ventana gestion apostadores por jefe de sede
	 */
	private GamblerManagmentByManager gamblerManagManager;
	/**
	 * Atributo de ventana creacion apostador por jefe de sede
	 */
	private CreateGamblerManagerWindow createGambManager;
	/**
	 * Atributo de ventana actualizar apostador por jefe de sede
	 */
	private UpdateGamblerManagerWindow updateGambManager;
	/**
	 * Atributo de ventana seleccion apostador a actualizar por jefe de sede
	 */
	private SelectGamblerToUpdateManager selGambUpdateManager;
	/**
	 * Atributo de ventana mostrar consultas
	 */
	private ShowConsult showCon;
	/**
	 * Atributo de ventana modulo consulta
	 */
	private ConsultWindow consultwin;
	/**
	 * Atributo de ventana seleccion apostador a eliminar por jefe de sede
	 */
	private SelectGamblerToDeleteManager selGambDeleteManager;
	/**
	 * Atributo de ventana gestion apuestas por jefe de sede
	 */
	private BetManagmentByManagerWindow betManagmentManager;
	/**
	 * Atributo de ventana menu de apuestas en jefe de sede
	 */
	private BetMenuManagerWindow betMenuManager;
	/**
	 * Atributo de ventana seleccion apostador para hacer apuesta por jefe de sede
	 */
	private SelGamblerCreateBetManWindow selGambCreateBetMan;
	/**
	 * Atributo de ventana creacion loteria por jefe de sede
	 */
	private LoteriaWindowManager loteriaMan;
	/**
	 * Atributo de ventana creacion baloto por jefe de sede
	 */
	private BalotoManager balotoMan;
	/**
	 * Atributo de ventana creacion betplay por jefe de sede
	 */
	private BetPlayManager betPlayMan;
	/**
	 * Atributo de ventana creacion chance por jefe de sede
	 */
	private ChanceManager chanceMan;
	/**
	 * Atributo de ventana creacion superastro por jefe de sede
	 */
	private SuperAstroManager superastroMan;
	/**
	 * Atributo de ventana menu principal de cajero
	 */
	private CashierMainMenu cashierMainMenu;
	/**
	 * Atributo de ventana gestion apostadores por cajero
	 */
	private GamblerManagmentByCahier gambManagCashier;
	/**
	 * Atributo de ventana mostrar apostadores en cajero
	 */
	private ShowGamblerManager showGamMan;
	/**
	 * Atributo de ventana creacion apostador por cajero
	 */
	private CreateGamblerCashierWindow createGamblerCashier;
	/**
	 * Atributo de ventana mostrar apuesta por cajero
	 */
	private ShowBetManager showBetManag;
	/**
	 * Atributo de ventana seleccion apuesta a eliminar por jefe de sede
	 */
	private SelBetToDeleteManager selBetDeleteManager;
	/**
	 * Atributo de ventana seleccion apostador a actualizar por cajero
	 */
	private SelectGamblerToUpdateCashier selGambUpdateCashier;
	/**
	 * Atributo de ventana actualizar apostador por cajero
	 */
	private UpdateGamblerCashierWindow updateGamblerCashier;
	/**
	 * Atributo de ventana seleccion apostador a eliminar por cajero
	 */
	private SelectGamblerToDeleteBetManager selGamDeleteBet;
	/**
	 * Atributo de ventana mostrar apostadores en cajero
	 */
	private ShowGamblerCashier showGamCashi;
	/**
	 * Atributo de ventana seleccion apostador a eliminar por cajero
	 */
	private SelectGamblerToDeleteCashier selGamToDelCashi;
	/**
	 * Atributo de ventana gestion de apuestas por cajero
	 */
	private BetManagmentByCashierWindow betManCashier;
	/**
	 * Atributo de ventana menu con todas las apuestas en cajero
	 */
	private BetMenuCashierWindow betMenuCashier;
	/**
	 * Atributo de ventana creacion loteria por cajero
	 */
	private LoteriaWindowCashier loteriaCashier;
	/**
	 * Atributo de ventana seleccion apostador para crear una apuesta en cajero
	 */
	private SelGamblerCreateBetCashierWindow selGambCreateBetCashier;
	/**
	 * Atributo de ventana creacion baloto por cajero
	 */
	private BalotoCashier balotoCashier;
	/**
	 * Atributo de ventana creacion superastro por cajero
	 */
	private SuperAstroCashier superAstroCashier;
	/**
	 * Atributo de ventana creacion chance por cajero
	 */
	private ChanceCashier chanceCashier;
	/**
	 * Atributo de ventana creacion betplay por cajero
	 */
	private BetPlayCashier betPlayCashier;
	/**
	 * Atributo de ventana mostrar apuestas en cajero
	 */
	private ShowBetCashier showBetCashier;
	/**
	 * Atributo de ventana seleccion apostador que hizo apuesta para eliminar
	 * apuesta por cajero
	 */
	private SelectGamblerToDeleteBetCashier selGambBetDeleteCashier;
	/**
	 * Atributo de ventana seleccion apuesta a eliminar por cajero
	 */
	private SelBetToDeleteCashier selBetDeleteCashi;

	/**
	 * Atributo de DAO de configuracion casa de apuestas
	 */
	private HouseSettingDAO houseDAO;
	/**
	 * Atributo de DAO de configuracion juegos de apuestas
	 */
	private GameDAO gameDAO;
	/**
	 * Atributo de DAO de gestion usuarios dueño
	 */
	private OwnerDAO ownDAO;
	/**
	 * Atributo de DAO de gestion usuarios jefe de sede
	 */
	private HeadquarterManagerDAO bossDAO;
	/**
	 * Atributo de DAO de gestion de sedes
	 */
	private HeadquarterDAO venueDAO;
	/**
	 * Atributo de DAO de gestion de apostadores
	 */
	private GamblerDAO gamDAO;
	/**
	 * Atributo de DAO de loteria
	 */
	private LoteryBetDAO loteriaDAO;
	/**
	 * Atributo de DAO de baloto
	 */
	private BallotDAO balotoDAO;
	/**
	 * Atributo de DAO de superastro
	 */
	private SuperAstroDAO superAstroDAO;
	/**
	 * Atributo de DAO de chance
	 */
	private ChanceDAO chanceDAO;
	/**
	 * Atributo de DAO de betplay
	 */
	private BetPlayDAO betPlayDAO;
	/**
	 * Atributo de DAO de gestion recibo
	 */
	private ReceiptDAO receiptDAO;
	/**
	 * Atributo de DAO de gestion usuarios cajero
	 */
	private CheckerDAO cashierDAO;

	String exit = "";

	/**
	 * Constructor vacio de la clase controller donde se inicializan todos los
	 * atributos y se llama la funcion para agregar lectores de botones
	 */

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
		cashierDAO = new CheckerDAO();

		logWind = new LoginWindow();
		signWind = new SignUpWindow();
		ownWind = new OwnerWindow();
		houseManageWindow = new BettingHouseManagmentWindow();
		venueManageOwn = new VenueManagmentByOwnerWindow();
		managerCreationWin = new ManagerCreationWindow();
		createVenueWin = new CreateVenueWindow();
		selUpdateVenOwn = new SelectUpdateVenueWindow();
		updateVenueOwn = new UpdateVenueByOwnerWindow();
		selDeleteVenueOwn = new SelectDeleteVenueOwnWindow();
		gamManageOwn = new GamblerManagmentByOwnerWindow();
		createGamblerWinOwn = new CreateGamblerWindow();
		selUpdateGamblerOwn = new SelectUpdateGamblerWindow();
		selDeleteGamblerOwn = new SelectDeleteGamblerOwnWindow();
		betManOwn = new BetManagmentByOwnerWindow();
		selcreatebet = new SelectCreateBetWindow();
		gamesSettingWin = new GamesSettingWindow();
		selGamToUpdateWinOwn = new SelectGamblerAfterVenueWindow();
		selGamToDeleteWinOwn = new SelectGamblerAfterVenueWindowToDelete();
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
		showVenueOwn = new ShowVenueOwn();
		showGamOwn = new ShowGamblerOwn();
		showBetOwn = new ShowBetOwn();
		selVenDelBetOwn = new SelVenuToDeleteBetOwner();
		selGamDelBetOwn = new SelGamblerDeleteBetOwnWindow();
		selBetDeleteOwn = new SelBetToDeleteOwn();
		managerMenuWin = new VenueManagerMenu();
		manageVenueManager = new ManageVenueManager();
		createCashier = new CreateCashier();
		gamblerManagManager = new GamblerManagmentByManager();
		createGambManager = new CreateGamblerManagerWindow();
		updateGambManager = new UpdateGamblerManagerWindow();
		selGambUpdateManager = new SelectGamblerToUpdateManager();
		consultwin = new ConsultWindow();
		showCon = new ShowConsult();
		selGambDeleteManager = new SelectGamblerToDeleteManager();
		betManagmentManager = new BetManagmentByManagerWindow();
		betMenuManager = new BetMenuManagerWindow();
		selGambCreateBetMan = new SelGamblerCreateBetManWindow();
		loteriaMan = new LoteriaWindowManager();
		balotoMan = new BalotoManager();
		betPlayMan = new BetPlayManager();
		chanceMan = new ChanceManager();
		superastroMan = new SuperAstroManager();
		cashierMainMenu = new CashierMainMenu();
		gambManagCashier = new GamblerManagmentByCahier();
		showGamMan = new ShowGamblerManager();
		createGamblerCashier = new CreateGamblerCashierWindow();
		showBetManag = new ShowBetManager();
		selBetDeleteManager = new SelBetToDeleteManager();
		selGambUpdateCashier = new SelectGamblerToUpdateCashier();
		updateGamblerCashier = new UpdateGamblerCashierWindow();
		selGamDeleteBet = new SelectGamblerToDeleteBetManager();
		showGamCashi = new ShowGamblerCashier();
		selGamToDelCashi = new SelectGamblerToDeleteCashier();
		betManCashier = new BetManagmentByCashierWindow();
		betMenuCashier = new BetMenuCashierWindow();
		selGambCreateBetCashier = new SelGamblerCreateBetCashierWindow();
		loteriaCashier = new LoteriaWindowCashier();
		balotoCashier = new BalotoCashier();
		superAstroCashier = new SuperAstroCashier();
		chanceCashier = new ChanceCashier();
		betPlayCashier = new BetPlayCashier();
		showBetCashier = new ShowBetCashier();
		selGambBetDeleteCashier = new SelectGamblerToDeleteBetCashier();
		selBetDeleteCashi = new SelBetToDeleteCashier();

		agregarLectores();

	}

	/**
	 * Funcion que dicta el inicio del programa
	 */
	public void run() {

		if (ownDAO.getOwnerList().isEmpty()) {
			signWind.setVisible(true);
		} else {
			logWind.setVisible(true);
		}

	}

	/**
	 * Funcion que agrega lectores a todos los botones
	 */

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

		ownWind.getMod5Btn().addActionListener(this);
		ownWind.getMod5Btn().setActionCommand("BOTONMOD5OWN");

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

		showVenueOwn.getExit().addActionListener(this);
		showVenueOwn.getExit().setActionCommand("EXIT");

		showVenueOwn.getBack().addActionListener(this);
		showVenueOwn.getBack().setActionCommand("BACKSELECTSHOWOWN");

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

		showGamOwn.getExit().addActionListener(this);
		showGamOwn.getExit().setActionCommand("EXIT");

		showGamOwn.getBack().addActionListener(this);
		showGamOwn.getBack().setActionCommand("BACKSELECTSHOWGAMOWN");

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

		showBetOwn.getBack().addActionListener(this);
		showBetOwn.getBack().setActionCommand("BACKSELECTVENUESHOWBETOWN");

		showBetOwn.getExit().addActionListener(this);
		showBetOwn.getExit().setActionCommand("EXIT");

		// BOTONES LOTERIA OWNER

		loteriaWin.getExit().addActionListener(this);
		loteriaWin.getExit().setActionCommand("EXIT");

		loteriaWin.getBack().addActionListener(this);
		loteriaWin.getBack().setActionCommand("BACKLOTERIAWIN");

		loteriaWin.getNext().addActionListener(this);
		loteriaWin.getNext().setActionCommand("NEXTLOTERIAWIN");

		// BOTONES LOTERIA MANAGER

		loteriaMan.getExit().addActionListener(this);
		loteriaMan.getExit().setActionCommand("EXIT");

		loteriaMan.getBack().addActionListener(this);
		loteriaMan.getBack().setActionCommand("BACKLOTERIAMAN");

		loteriaMan.getNext().addActionListener(this);
		loteriaMan.getNext().setActionCommand("NEXTLOTERIAMAN");

		// BOTONES LOTERIA CAJERO

		loteriaCashier.getExit().addActionListener(this);
		loteriaCashier.getExit().setActionCommand("EXIT");

		loteriaCashier.getBack().addActionListener(this);
		loteriaCashier.getBack().setActionCommand("BACKLOTERIACASHIER");

		loteriaCashier.getNext().addActionListener(this);
		loteriaCashier.getNext().setActionCommand("NEXTLOTERIACASHIER");

		// BOTONES BALOTO OWNER

		balotoWin.getExit().addActionListener(this);
		balotoWin.getExit().setActionCommand("EXIT");

		balotoWin.getBack().addActionListener(this);
		balotoWin.getBack().setActionCommand("BACKBALOTOWIN");

		balotoWin.getNext().addActionListener(this);
		balotoWin.getNext().setActionCommand("NEXTBALOTOWIN");

		// BOTONES BALOTO CAJERO

		balotoCashier.getExit().addActionListener(this);
		balotoCashier.getExit().setActionCommand("EXIT");

		balotoCashier.getBack().addActionListener(this);
		balotoCashier.getBack().setActionCommand("BACKBALOTOCASHIER");

		balotoCashier.getNext().addActionListener(this);
		balotoCashier.getNext().setActionCommand("NEXTBALOTOCASHIER");

		// BOTONES SUPERASTRO OWNER

		superastroWin.getExit().addActionListener(this);
		superastroWin.getExit().setActionCommand("EXIT");

		superastroWin.getBack().addActionListener(this);
		superastroWin.getBack().setActionCommand("BACKSUPERASTROWIN");

		superastroWin.getNext().addActionListener(this);
		superastroWin.getNext().setActionCommand("NEXTSUPERASTROWIN");

		// BOTONES SUPERASTRO MANAGER

		superastroMan.getExit().addActionListener(this);
		superastroMan.getExit().setActionCommand("EXIT");

		superastroMan.getBack().addActionListener(this);
		superastroMan.getBack().setActionCommand("BACKSUPERASTROMAN");

		superastroMan.getNext().addActionListener(this);
		superastroMan.getNext().setActionCommand("NEXTSUPERASTROMAN");

		// BOTONES SUPERASTRO CAJERO

		superAstroCashier.getExit().addActionListener(this);
		superAstroCashier.getExit().setActionCommand("EXIT");

		superAstroCashier.getBack().addActionListener(this);
		superAstroCashier.getBack().setActionCommand("BACKSUPERASTROCASHIER");

		superAstroCashier.getNext().addActionListener(this);
		superAstroCashier.getNext().setActionCommand("NEXTSUPERASTROCASHIER");

		// BOTONES CHANCE

		chanceWin.getExit().addActionListener(this);
		chanceWin.getExit().setActionCommand("EXIT");

		chanceWin.getBack().addActionListener(this);
		chanceWin.getBack().setActionCommand("BACKCHANCEWIN");

		chanceWin.getNext().addActionListener(this);
		chanceWin.getNext().setActionCommand("NEXTCHANCEWIN");

		// BOTONES CHANCE MANAGER

		chanceMan.getExit().addActionListener(this);
		chanceMan.getExit().setActionCommand("EXIT");

		chanceMan.getBack().addActionListener(this);
		chanceMan.getBack().setActionCommand("BACKCHANCEMAN");

		chanceMan.getNext().addActionListener(this);
		chanceMan.getNext().setActionCommand("NEXTCHANCEMAN");

		// BOTONES CHANCE CASHIER

		chanceCashier.getExit().addActionListener(this);
		chanceCashier.getExit().setActionCommand("EXIT");

		chanceCashier.getBack().addActionListener(this);
		chanceCashier.getBack().setActionCommand("BACKCHANCECASHIER");

		chanceCashier.getNext().addActionListener(this);
		chanceCashier.getNext().setActionCommand("NEXTCHANCECASHIER");

		// BOTONES BETPLAY

		betplayWin.getExit().addActionListener(this);
		betplayWin.getExit().setActionCommand("EXIT");

		betplayWin.getBack().addActionListener(this);
		betplayWin.getBack().setActionCommand("BACKBETPLAYWIN");

		betplayWin.getNext().addActionListener(this);
		betplayWin.getNext().setActionCommand("NEXTBETPLAYWIN");

		// BOTONES BETPLAY MANAGER

		betPlayMan.getExit().addActionListener(this);
		betPlayMan.getExit().setActionCommand("EXIT");

		betPlayMan.getBack().addActionListener(this);
		betPlayMan.getBack().setActionCommand("BACKBETPLAYMAN");

		betPlayMan.getNext().addActionListener(this);
		betPlayMan.getNext().setActionCommand("NEXTBETPLAYMAN");

		// BOTONES BETPLAY MANAGER

		betPlayCashier.getExit().addActionListener(this);
		betPlayCashier.getExit().setActionCommand("EXIT");

		betPlayCashier.getBack().addActionListener(this);
		betPlayCashier.getBack().setActionCommand("BACKBETPLAYCASHIER");

		betPlayCashier.getNext().addActionListener(this);
		betPlayCashier.getNext().setActionCommand("NEXTBETPLAYCASHIER");

		// BOTONES SELECCIONAR SEDE PARA ELIMINAR APUESTA

		selVenDelBetOwn.getExit().addActionListener(this);
		selVenDelBetOwn.getExit().setActionCommand("EXIT");

		selVenDelBetOwn.getBack().addActionListener(this);
		selVenDelBetOwn.getBack().setActionCommand("BACKSELECTVENUEDELETEBETOWN");

		selVenDelBetOwn.getNext().addActionListener(this);
		selVenDelBetOwn.getNext().setActionCommand("NEXTSELECTVENUEDELETEBETOWN");

		// BOTONES SELECCIONAR APOSTADOR PARA ELIMINAR APUESTA

		selGamDelBetOwn.getExit().addActionListener(this);
		selGamDelBetOwn.getExit().setActionCommand("EXIT");

		selGamDelBetOwn.getBack().addActionListener(this);
		selGamDelBetOwn.getBack().setActionCommand("BACKSELECTGAMBLERDELETEBETOWN");

		selGamDelBetOwn.getNextStep().addActionListener(this);
		selGamDelBetOwn.getNextStep().setActionCommand("NEXTSELECTGAMBLERDELETEBETOWN");

		// BOTONES SELECCIONAR APUESTA A ELIMINAR OWNER

		selBetDeleteOwn.getExit().addActionListener(this);
		selBetDeleteOwn.getExit().setActionCommand("EXIT");

		selBetDeleteOwn.getBack().addActionListener(this);
		selBetDeleteOwn.getBack().setActionCommand("BACKSELBETTODELETEOWN");

		selBetDeleteOwn.getNextStep().addActionListener(this);
		selBetDeleteOwn.getNextStep().setActionCommand("DELETEBET");

		// BOTONES MODULO 5 SELECCIONAR SEDE
		consultwin.getExit().addActionListener(this);
		consultwin.getExit().setActionCommand("EXIT");

		consultwin.getBack().addActionListener(this);
		consultwin.getBack().setActionCommand("BACKSELECTVENUECONSULT");

		consultwin.getNext().addActionListener(this);
		consultwin.getNext().setActionCommand("NEXTSELECTVENUECONSULT");

		// BOTONES MODULO 5 TABLA

		showCon.getExit().addActionListener(this);
		showCon.getExit().setActionCommand("EXIT");

		showCon.getBack().addActionListener(this);
		showCon.getBack().setActionCommand("BACKTABLECONSULT");

		showCon.getConsultGam().addActionListener(this);
		showCon.getConsultGam().setActionCommand("CONSULTGAMTOTAL");

		// BOTONES MENU PRINCIPAL JEFE DE SEDE

		managerMenuWin.getExit().addActionListener(this);
		managerMenuWin.getExit().setActionCommand("EXIT");

		managerMenuWin.getBack().addActionListener(this);
		managerMenuWin.getBack().setActionCommand("BACKMENUMANAGER");

		managerMenuWin.getManageVenue().addActionListener(this);
		managerMenuWin.getManageVenue().setActionCommand("MANAGE VENUE MANAGER");

		managerMenuWin.getGamblers().addActionListener(this);
		managerMenuWin.getGamblers().setActionCommand("MANAGE GAMBLER MANAGER");

		managerMenuWin.getBets().addActionListener(this);
		managerMenuWin.getBets().setActionCommand("MANAGE BET MANAGER");
		// BOTONES GESTIONAR SEDE JEFE DE SEDE

		manageVenueManager.getExit().addActionListener(this);
		manageVenueManager.getExit().setActionCommand("EXIT");

		manageVenueManager.getBack().addActionListener(this);
		manageVenueManager.getBack().setActionCommand("BACK MANAGEVENUE MANAGER");

		manageVenueManager.getCreateVenue().addActionListener(this);
		manageVenueManager.getCreateVenue().setActionCommand("SAVE MANAGEVENUE MANAGER");

		manageVenueManager.getCreateCashier().addActionListener(this);
		manageVenueManager.getCreateCashier().setActionCommand("CREATE CASHIER");

		// BOTONES CREAR CAJERO

		createCashier.getExit().addActionListener(this);
		createCashier.getExit().setActionCommand("EXIT");

		createCashier.getBack().addActionListener(this);
		createCashier.getBack().setActionCommand("BACK CREATECASHIER");

		createCashier.getCreateAccount().addActionListener(this);
		createCashier.getCreateAccount().setActionCommand("CREATE ACOUNT CASHIER");

		// BOTONES GESTION APOSTADOR POR JEFE DE SEDE

		gamblerManagManager.getExit().addActionListener(this);
		gamblerManagManager.getExit().setActionCommand("EXIT");

		gamblerManagManager.getBack().addActionListener(this);
		gamblerManagManager.getBack().setActionCommand("BACK MANAGMENT GAMBLER MANAGER");

		gamblerManagManager.getCreate().addActionListener(this);
		gamblerManagManager.getCreate().setActionCommand("CREATE MANAGMENT GAMBLER MANAGER");

		gamblerManagManager.getUpdate().addActionListener(this);
		gamblerManagManager.getUpdate().setActionCommand("UPDATE MANAGMENT GAMBLER MANAGER");

		gamblerManagManager.getDelete().addActionListener(this);
		gamblerManagManager.getDelete().setActionCommand("DELETE MANAGMENT GAMBLER MANAGER");

		gamblerManagManager.getRead().addActionListener(this);
		gamblerManagManager.getRead().setActionCommand("READ MANAGMENT GAMBLER MANAGER");

		// BOTONES CREAR APOSTADOR POR JEFE DE SEDE

		createGambManager.getExit().addActionListener(this);
		createGambManager.getExit().setActionCommand("EXIT");

		createGambManager.getBack().addActionListener(this);
		createGambManager.getBack().setActionCommand("BACK CREATE GAMBLER MANAGER");

		createGambManager.getCreateGambler().addActionListener(this);
		createGambManager.getCreateGambler().setActionCommand("CREATE GAMBLER MANAGER");

		// BOTONES ELEGIR APOSTADOR A ACTUALIZAR POR JEFE DE SEDE

		selGambUpdateManager.getExit().addActionListener(this);
		selGambUpdateManager.getExit().setActionCommand("EXIT");

		selGambUpdateManager.getBack().addActionListener(this);
		selGambUpdateManager.getBack().setActionCommand("BACK SELECTGAM UPDATE MANAGER");

		selGambUpdateManager.getNextStep().addActionListener(this);
		selGambUpdateManager.getNextStep().setActionCommand("NEXT SELECTGAM UPDATE MANAGER");

		// BOTONES ACTUALIZAR APOSTADOR POR JEFE DE SEDE

		updateGambManager.getExit().addActionListener(this);
		updateGambManager.getExit().setActionCommand("EXIT");

		updateGambManager.getBack().addActionListener(this);
		updateGambManager.getBack().setActionCommand("BACK UPDATE GAMBLER MANAGER");

		updateGambManager.getCreateGambler().addActionListener(this);
		updateGambManager.getCreateGambler().setActionCommand("UPDATE GAMBLER MANAGER");

		// BOTONES ELIMINAR APOSTADOR POR JEFE DE SEDE

		selGambDeleteManager.getExit().addActionListener(this);
		selGambDeleteManager.getExit().setActionCommand("EXIT");

		selGambDeleteManager.getBack().addActionListener(this);
		selGambDeleteManager.getBack().setActionCommand("BACK DELETE GAMBLER MANAGER");

		selGambDeleteManager.getNextStep().addActionListener(this);
		selGambDeleteManager.getNextStep().setActionCommand("DELETE GAMBLER BY MANAGER");

		// BOTONES GESTION DE APUESTAS POR JEFE DE SEDE

		betManagmentManager.getExit().addActionListener(this);
		betManagmentManager.getExit().setActionCommand("EXIT");

		betManagmentManager.getBack().addActionListener(this);
		betManagmentManager.getBack().setActionCommand("BACK MANAGE BET MANAGER");

		betManagmentManager.getCreate().addActionListener(this);
		betManagmentManager.getCreate().setActionCommand("CREATE BET MENU MANAGER");

		betManagmentManager.getRead().addActionListener(this);
		betManagmentManager.getRead().setActionCommand("SHOW BET MENU MANAGER");

		betManagmentManager.getDelete().addActionListener(this);
		betManagmentManager.getDelete().setActionCommand("DELETE BET MENU MANAGER");

		// BOTONES MOSTRAR APUESTAS JEFE DE SEDE

		showBetManag.getExit().addActionListener(this);
		showBetManag.getExit().setActionCommand("EXIT");

		showBetManag.getBack().addActionListener(this);
		showBetManag.getBack().setActionCommand("BACK SHOW BET MANAGER");

		// BOTONES SELECCIONAR APOSTADOR ELIMINAR APUESTA

		selGamDeleteBet.getExit().addActionListener(this);
		selGamDeleteBet.getExit().setActionCommand("EXIT");

		selGamDeleteBet.getBack().addActionListener(this);
		selGamDeleteBet.getBack().setActionCommand("BACK SELECT GAMBLER BET MANAGER");

		selGamDeleteBet.getNextStep().addActionListener(this);
		selGamDeleteBet.getNextStep().setActionCommand("NEXT SELECT GAMBLER BET MANAGER");

		// BOTONES ELIMINAR APUESTA JEFE DE SEDE

		selBetDeleteManager.getExit().addActionListener(this);
		selBetDeleteManager.getExit().setActionCommand("EXIT");

		selBetDeleteManager.getBack().addActionListener(this);
		selBetDeleteManager.getBack().setActionCommand("BACK DELETE BET MANAGER");

		selBetDeleteManager.getNextStep().addActionListener(this);
		selBetDeleteManager.getNextStep().setActionCommand("DELETE BET MANAGER");

		// BOTONES ELEGIR APOSTADOR A HACER APUESTAS POR EL JEFE DE SEDE

		selGambCreateBetMan.getExit().addActionListener(this);
		selGambCreateBetMan.getExit().setActionCommand("EXIT");

		selGambCreateBetMan.getBack().addActionListener(this);
		selGambCreateBetMan.getBack().setActionCommand("BACKSELECTGAMBLERBETMAN");

		selGambCreateBetMan.getNextStep().addActionListener(this);
		selGambCreateBetMan.getNextStep().setActionCommand("SELECTBETTODOMAN");

		// BOTONES MENU DE APUESTAS JEFE DE SEDE

		betMenuManager.getExit().addActionListener(this);
		betMenuManager.getExit().setActionCommand("EXIT");

		betMenuManager.getBack().addActionListener(this);
		betMenuManager.getBack().setActionCommand("BACK MENU BET MANAGER");

		betMenuManager.getLoteria().addActionListener(this);
		betMenuManager.getLoteria().setActionCommand("CREATE LOTERIA MANAGER");

		betMenuManager.getBaloto().addActionListener(this);
		betMenuManager.getBaloto().setActionCommand("CREATE BALOTO MANAGER");

		betMenuManager.getBetPlay().addActionListener(this);
		betMenuManager.getBetPlay().setActionCommand("CREATE BETPLAY MANAGER");

		betMenuManager.getChance().addActionListener(this);
		betMenuManager.getChance().setActionCommand("CREATE CHANCE MANAGER");

		betMenuManager.getSuperAstro().addActionListener(this);
		betMenuManager.getSuperAstro().setActionCommand("CREATE SUPERASTRO MANAGER");

		// BOTONES MENU PRINCIPAL CAJERO

		cashierMainMenu.getExit().addActionListener(this);
		cashierMainMenu.getExit().setActionCommand("EXIT");

		cashierMainMenu.getBack().addActionListener(this);
		cashierMainMenu.getBack().setActionCommand("BACK MENU CASHIER");

		cashierMainMenu.getGamblerManagment().addActionListener(this);
		cashierMainMenu.getGamblerManagment().setActionCommand("MENU APOSTADORES CAJERO");

		cashierMainMenu.getBetManagment().addActionListener(this);
		cashierMainMenu.getBetManagment().setActionCommand("MENU APUESTAS CAJERO");

		// BOTONES MENU APOSTADORES CAJERO

		gambManagCashier.getExit().addActionListener(this);
		gambManagCashier.getExit().setActionCommand("EXIT");

		gambManagCashier.getBack().addActionListener(this);
		gambManagCashier.getBack().setActionCommand("BACK MENU GAMBLER CASHIER");

		gambManagCashier.getCreate().addActionListener(this);
		gambManagCashier.getCreate().setActionCommand("CREATE GAMBLER CASHIER");

		gambManagCashier.getUpdate().addActionListener(this);
		gambManagCashier.getUpdate().setActionCommand("UPDATE GAMBLER CASHIER");

		gambManagCashier.getRead().addActionListener(this);
		gambManagCashier.getRead().setActionCommand("READ GAMBLER CASHIER");

		gambManagCashier.getDelete().addActionListener(this);
		gambManagCashier.getDelete().setActionCommand("DELETE GAMBLER CASHIER");

		// BOTONES MOSTRAR GAMBLER MANAGER

		showGamMan.getExit().addActionListener(this);
		showGamMan.getExit().setActionCommand("EXIT");

		showGamMan.getBack().addActionListener(this);
		showGamMan.getBack().setActionCommand("BACK MENU GAMBLER SHOW");

		// BOTONES CREAR APOSTADORES POR CAJERO

		createGamblerCashier.getExit().addActionListener(this);
		createGamblerCashier.getExit().setActionCommand("EXIT");

		createGamblerCashier.getBack().addActionListener(this);
		createGamblerCashier.getBack().setActionCommand("BACK CREATE GAMBLER CASHIER");

		createGamblerCashier.getCreateGambler().addActionListener(this);
		createGamblerCashier.getCreateGambler().setActionCommand("CREATE GAMBLER BY CASHIER");

		// BOTONES SELECCIONAR APOSTADOR A ACTUALIZAR APOSTADOR POR CAJERO

		selGambUpdateCashier.getExit().addActionListener(this);
		selGambUpdateCashier.getExit().setActionCommand("EXIT");

		selGambUpdateCashier.getBack().addActionListener(this);
		selGambUpdateCashier.getBack().setActionCommand("BACK SEL UPDATE GAMB CASHIER");

		selGambUpdateCashier.getNextStep().addActionListener(this);
		selGambUpdateCashier.getNextStep().setActionCommand("NEXT SEL UPDATE GAMB CASHIER");

		// BOTONES ACTUALIZAR APOSTADOR POR CAJERO

		updateGamblerCashier.getExit().addActionListener(this);
		updateGamblerCashier.getExit().setActionCommand("EXIT");

		updateGamblerCashier.getBack().addActionListener(this);
		updateGamblerCashier.getBack().setActionCommand("BACK UPTADE GAMB CASHIER");

		updateGamblerCashier.getCreateGambler().addActionListener(this);
		updateGamblerCashier.getCreateGambler().setActionCommand("UPTADE GAMBLER BY CASHIER");

		// BOTONES MOSTRAR APOSTADOR POR CAJERO

		showGamCashi.getExit().addActionListener(this);
		showGamCashi.getExit().setActionCommand("EXIT");

		showGamCashi.getBack().addActionListener(this);
		showGamCashi.getBack().setActionCommand("BACK SHOW GAMB CASHIER");

		// BOTONES ELIMINAR APOSTADOR POR CAJERO

		selGamToDelCashi.getExit().addActionListener(this);
		selGamToDelCashi.getExit().setActionCommand("EXIT");

		selGamToDelCashi.getBack().addActionListener(this);
		selGamToDelCashi.getBack().setActionCommand("BACK DELETE GAMB CASHIER");

		selGamToDelCashi.getNextStep().addActionListener(this);
		selGamToDelCashi.getNextStep().setActionCommand("DELETE GAMB CASHIER");

		// BOTONES GESTION APUESTAS CAJERO

		betManCashier.getExit().addActionListener(this);
		betManCashier.getExit().setActionCommand("EXIT");

		betManCashier.getBack().addActionListener(this);
		betManCashier.getBack().setActionCommand("BACK MENU BET CASHIER");

		betManCashier.getCreate().addActionListener(this);
		betManCashier.getCreate().setActionCommand("CREATE BET CASHIER");

		betManCashier.getDelete().addActionListener(this);
		betManCashier.getDelete().setActionCommand("DELETE BET CASHIER");

		betManCashier.getRead().addActionListener(this);
		betManCashier.getRead().setActionCommand("SHOW BET CASHIER");

		// BOTONES SELECCIONAR APOSTADOR PARA APUESTA

		selGambCreateBetCashier.getExit().addActionListener(this);
		selGambCreateBetCashier.getExit().setActionCommand("EXIT");

		selGambCreateBetCashier.getBack().addActionListener(this);
		selGambCreateBetCashier.getBack().setActionCommand("BACK SEL GAMB CREATE BET CASHIER");

		selGambCreateBetCashier.getNextStep().addActionListener(this);
		selGambCreateBetCashier.getNextStep().setActionCommand("NEXT SEL GAMB CREATE BET CASHIER");

		// BOTONES MENU CREAR APUESTAS POR CAJERO

		betMenuCashier.getExit().addActionListener(this);
		betMenuCashier.getExit().setActionCommand("EXIT");

		betMenuCashier.getBack().addActionListener(this);
		betMenuCashier.getBack().setActionCommand("BACK MENU CREATE BET CASHIER");

		betMenuCashier.getLoteria().addActionListener(this);
		betMenuCashier.getLoteria().setActionCommand("LOTERIACASHIER");

		betMenuCashier.getBaloto().addActionListener(this);
		betMenuCashier.getBaloto().setActionCommand("BALOTOCASHIER");

		betMenuCashier.getSuperAstro().addActionListener(this);
		betMenuCashier.getSuperAstro().setActionCommand("SUPERASTROCASHIER");

		betMenuCashier.getChance().addActionListener(this);
		betMenuCashier.getChance().setActionCommand("CHANCECASHIER");

		betMenuCashier.getBetPlay().addActionListener(this);
		betMenuCashier.getBetPlay().setActionCommand("BETPLAYCASHIER");

		// MOSTRAR APUESTAS CAJERO

		showBetCashier.getExit().addActionListener(this);
		showBetCashier.getExit().setActionCommand("EXIT");

		showBetCashier.getBack().addActionListener(this);
		showBetCashier.getBack().setActionCommand("BACK SHOW BET CASHIER");

		// ELIMINAR APUESTAS SELECCIONAR APOSTADOR CAJERO

		selGambBetDeleteCashier.getExit().addActionListener(this);
		selGambBetDeleteCashier.getExit().setActionCommand("EXIT");

		selGambBetDeleteCashier.getBack().addActionListener(this);
		selGambBetDeleteCashier.getBack().setActionCommand("BACK DELETE BET CASHIER");

		selGambBetDeleteCashier.getNextStep().addActionListener(this);
		selGambBetDeleteCashier.getNextStep().setActionCommand("NEXTDELETEBETCASHIER");

		// ELIMINAR APUESTAS CAJERO

		selBetDeleteCashi.getExit().addActionListener(this);
		selBetDeleteCashi.getExit().setActionCommand("EXIT");

		selBetDeleteCashi.getBack().addActionListener(this);
		selBetDeleteCashi.getBack().setActionCommand("BACK DELETE BET");

		selBetDeleteCashi.getNextStep().addActionListener(this);
		selBetDeleteCashi.getNextStep().setActionCommand("NEXT DELETE BET");

	}

	/**
	 * Funcion que obtiene los gestos realizados por el usuario al clickear un boton
	 */

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

			String nameHouse = "";
			int cantVenueMax = 0;
			String budget = "";

			Properties prop = new Properties();
			try {
				prop.load(new FileInputStream(new File("src/co/edu/unbosque/model/persistence/config.properties")));
				nameHouse = prop.getProperty(
						"PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.nombrecasa")
						.toString();
				cantVenueMax = Integer.parseInt(prop.get(
						"PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.numerosede")
						.toString());
				budget = prop.getProperty(
						"PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.presupuesto")
						.toString();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
			} catch (IOException e1) {
				// TODO Auto-generated catch block
			}

			houseManageWindow.getNameHouse().setText(nameHouse);
			houseManageWindow.getNumberVenue().setValue(cantVenueMax);
			houseManageWindow.getTotalBudget().setText(budget);
			houseManageWindow.setVisible(true);
			logWind.setVisible(false);
			ownWind.setVisible(false);

			break;
		}

		case "CREATEHOUSE": {

			createHouse();

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

			createBoss();
			managerCreationWin.getUser().setText("");
			managerCreationWin.getPassword().setText("");
			break;

		}
		case "SELECTVENUESHOWOWN": {
			showVenueOwn.setVisible(true);
			venueManageOwn.setVisible(false);
			showTableVenue();
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
			showVenueOwn.setVisible(false);
			updateTableVenue();
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
			showGamOwn.setVisible(false);
			updateTableGambler();
			break;

		}

		case "BACKSELECTUPDATEGAMOWN": {
			gamManageOwn.setVisible(true);
			selUpdateGamblerOwn.setVisible(false);
			break;

		}

		case "SELECTGAMBLERSHOWOWN": {
			showGamOwn.setVisible(true);
			gamManageOwn.setVisible(false);
			showTableGambler();
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

			showBetOwn.setVisible(true);
			betManOwn.setVisible(false);
			showTableBet();
			break;
		}

		case "BACKSELECTVENUESHOWBETOWN": {
			betManOwn.setVisible(true);
			showBetOwn.setVisible(false);
			updateTableBet();
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
		case "NEXTLOTERIAMAN": {

			makeLoteryBetMan();

			loteriaMan.getBetAmount().setText("");
			loteriaMan.getNum1().setValue(0);
			loteriaMan.getNum2().setValue(0);
			loteriaMan.getNum3().setValue(0);
			loteriaMan.getNum4().setValue(0);

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
		case "NEXTBALOTOMAN": {

			makeBalotoBetMan();

			balotoMan.getBetAmount().setText("");
			balotoMan.getNum1().setValue(1);
			balotoMan.getNum2().setValue(1);
			balotoMan.getNum3().setValue(1);
			balotoMan.getNum4().setValue(1);
			balotoMan.getNum5().setValue(1);
			balotoMan.getNum6().setValue(1);
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
		case "NEXTSUPERASTROMAN": {

			makeSuperAstroBetMan();

			superastroMan.getBetAmount().setText("");
			superastroMan.getNum1().setValue(0);
			superastroMan.getNum2().setValue(0);
			superastroMan.getNum3().setValue(0);
			superastroMan.getNum4().setValue(0);
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
		case "NEXTCHANCEMAN": {

			makeChanceBetMan();
			chanceMan.getBetAmount().setText(null);
			chanceMan.getNum1().removeAllItems();
			chanceMan.getNum2().removeAllItems();
			chanceMan.getNum3().removeAllItems();
			chanceMan.getNum4().removeAllItems();

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

		case "NEXTBETPLAYMAN": {

			makeBetPlayBetMan();
			betPlayMan.getBetAmount().setText(null);
			betPlayMan.getMatch1().setValue(0);
			betPlayMan.getMatch2().setValue(0);
			betPlayMan.getMatch3().setValue(0);
			betPlayMan.getMatch4().setValue(0);
			betPlayMan.getMatch5().setValue(0);
			betPlayMan.getMatch6().setValue(0);
			betPlayMan.getMatch7().setValue(0);
			betPlayMan.getMatch8().setValue(0);
			betPlayMan.getMatch9().setValue(0);
			betPlayMan.getMatch10().setValue(0);
			betPlayMan.getMatch11().setValue(0);
			betPlayMan.getMatch12().setValue(0);
			betPlayMan.getMatch13().setValue(0);
			betPlayMan.getMatch14().setValue(0);

			break;
		}
		case "BACKSELECTVENUEDELETEBETOWN": {

			betManOwn.setVisible(true);
			selVenDelBetOwn.setVisible(false);

			break;
		}
		case "SELECTBETDELETEOWN": {

			selVenDelBetOwn.setVisible(true);
			betManOwn.setVisible(false);
			updateBoxSelectDeleteVenueBet();

			break;
		}
		case "NEXTSELECTVENUEDELETEBETOWN": {

			selGamDelBetOwn.setVisible(true);
			selVenDelBetOwn.setVisible(false);
			String aux = selVenDelBetOwn.getComboVenue().getSelectedItem().toString();
			updateSelectGamblerDeleteBet(aux);
			break;

		}
		case "BACKSELECTGAMBLERDELETEBETOWN": {

			selVenDelBetOwn.setVisible(true);
			selGamDelBetOwn.setVisible(false);

			break;
		}
		case "NEXTSELECTGAMBLERDELETEBETOWN": {

			selBetDeleteOwn.setVisible(true);
			selGamDelBetOwn.setVisible(false);
			Long aux = Long.parseLong(selGamDelBetOwn.getComboGambler().getSelectedItem().toString());
			updateSelectBetDeleteBet(aux);
			break;

		}
		case "BACKSELBETTODELETEOWN": {

			selGamDelBetOwn.setVisible(true);
			selBetDeleteOwn.setVisible(false);
			break;

		}
		case "BACKMENUMANAGER": {

			logWind.setVisible(true);
			managerMenuWin.setVisible(false);

			break;

		}
		case "DELETEBET": {
			betManOwn.setVisible(true);
			selBetDeleteOwn.setVisible(false);
			String s = selBetDeleteOwn.getComboGambler().getSelectedItem().toString();
			DeleteBet(s);
			break;
		}
		case "MANAGE VENUE MANAGER": {

			manageVenueManager.setVisible(true);
			managerMenuWin.setVisible(false);
			setDataVenueManager();

			break;

		}
		case "BACK MANAGEVENUE MANAGER": {

			managerMenuWin.setVisible(true);
			manageVenueManager.setVisible(false);
			break;

		}
		case "SAVE MANAGEVENUE MANAGER": {
			saveDataVenueManager();
			managerMenuWin.setVisible(true);
			manageVenueManager.setVisible(false);
			break;

		}
		case "CREATE CASHIER": {

			createCashier.setVisible(true);
			manageVenueManager.setVisible(false);
			break;

		}
		case "BACK CREATECASHIER": {

			manageVenueManager.setVisible(true);
			createCashier.setVisible(false);
			createCashier.getUser().setText("");
			createCashier.getPassword().setText("");
			break;

		}
		case "CREATE ACOUNT CASHIER": {
			createCashier();

			createCashier.getUser().setText("");
			createCashier.getPassword().setText("");
			break;
		}
		case "MANAGE GAMBLER MANAGER": {

			gamblerManagManager.setVisible(true);
			managerMenuWin.setVisible(false);
			break;
		}
		case "BACK MANAGMENT GAMBLER MANAGER": {

			managerMenuWin.setVisible(true);
			gamblerManagManager.setVisible(false);
			break;

		}
		case "CREATE MANAGMENT GAMBLER MANAGER": {
			createGambManager.setVisible(true);
			gamblerManagManager.setVisible(false);
			createGambManager.getComboLocation().addItem(managerMenuWin.getNameVenue().getText());
			break;

		}
		case "BACK CREATE GAMBLER MANAGER": {
			gamblerManagManager.setVisible(true);
			createGambManager.setVisible(false);
			createGambManager.getComboLocation().removeAllItems();
			break;

		}
		case "CREATE GAMBLER MANAGER": {
			createGamblerManager();
			createGambManager.getCompleteName().setText(null);
			createGambManager.getDocument().setText(null);
			createGambManager.getAdress().setText(null);
			createGambManager.getPhoneNumber().setText(null);
			gamblerManagManager.setVisible(true);
			createGambManager.setVisible(false);
			break;
		}

		case "UPDATE MANAGMENT GAMBLER MANAGER": {

			selGambUpdateManager.setVisible(true);
			gamblerManagManager.setVisible(false);
			updateBoxSelectGamblerManager(exit);
			break;

		}
		case "BACK SELECTGAM UPDATE MANAGER": {

			gamblerManagManager.setVisible(true);
			selGambUpdateManager.setVisible(false);
			break;

		}
		case "NEXT SELECTGAM UPDATE MANAGER": {

			updateGambManager.setVisible(true);
			setDataToUpdateGamblerManager();
			selGambUpdateManager.setVisible(false);
			break;

		}
		case "BACK UPDATE GAMBLER MANAGER": {

			selGambUpdateManager.setVisible(true);
			updateGambManager.setVisible(false);
			updateGambManager.getComboLocation().removeAllItems();
			break;

		}
		case "UPDATE GAMBLER MANAGER": {
			updateGamblerManager();
			updateGambManager.getComboLocation().removeAllItems();
			break;
		}
		case "BOTONMOD5OWN": {
			consultwin.setVisible(true);
			ownWind.setVisible(false);
			updateBoxModule5();
			break;
		}
		case "BACKSELECTVENUECONSULT": {
			ownWind.setVisible(true);
			consultwin.setVisible(false);
			break;
		}
		case "NEXTSELECTVENUECONSULT": {
			showCon.setVisible(true);
			consultwin.setVisible(false);
			String aux = consultwin.getComboVenue().getSelectedItem().toString();
			showTableConsult(aux);
			String totalAmount = sumAllTheBets(aux);
			showCon.getTotalBetAmount().setText(totalAmount);
			updateBoxGamblerConsult(aux);
			break;
		}
		case "BACKTABLECONSULT": {
			consultwin.setVisible(true);
			showCon.setVisible(false);
			updateTableConsult();
			showCon.getTotalBetAmountGambler().setText("");
			break;
		}
		case "CONSULTGAMTOTAL": {
			Long aux = Long.parseLong(showCon.getComboGambler().getSelectedItem().toString());
			String aux2 = sumAllTheBetsGambler(aux);
			showCon.getTotalBetAmountGambler().setText(aux2);
			break;
		}
		case "DELETE MANAGMENT GAMBLER MANAGER": {

			selGambDeleteManager.setVisible(true);
			gamblerManagManager.setVisible(false);
			updateBoxSelectGamblerManagerToDelete(exit);
			break;
		}
		case "BACK DELETE GAMBLER MANAGER": {
			gamblerManagManager.setVisible(true);
			selGambDeleteManager.setVisible(false);
			break;
		}
		case "DELETE GAMBLER BY MANAGER": {
			deleteGamblerManager();
			break;
		}
		case "MANAGE BET MANAGER": {
			betManagmentManager.setVisible(true);
			managerMenuWin.setVisible(false);
			break;
		}
		case "BACK MANAGE BET MANAGER": {

			managerMenuWin.setVisible(true);
			betManagmentManager.setVisible(false);
			break;

		}
		case "CREATE BET MENU MANAGER": {
			selGambCreateBetMan.setVisible(true);
			betManagmentManager.setVisible(false);
			updateBoxSelectGamblerManagerForBet(exit);
			break;
		}
		case "BACKSELECTGAMBLERBETMAN": {

			betManagmentManager.setVisible(true);
			selGambCreateBetMan.setVisible(false);
			break;

		}
		case "SELECTBETTODOMAN": {

			betMenuManager.setVisible(true);
			selGambCreateBetMan.setVisible(false);
			break;

		}
		case "BACK MENU BET MANAGER": {

			selGambCreateBetMan.setVisible(true);
			betMenuManager.setVisible(false);
			break;

		}
		case "CREATE LOTERIA MANAGER": {

			loteriaMan.setVisible(true);
			betMenuManager.setVisible(false);
			break;

		}
		case "BACKLOTERIAMAN": {

			betMenuManager.setVisible(true);
			loteriaMan.setVisible(false);
			loteriaMan.getBetAmount().setText("");
			loteriaMan.getNum1().setValue(0);
			loteriaMan.getNum2().setValue(0);
			loteriaMan.getNum3().setValue(0);
			loteriaMan.getNum4().setValue(0);
			break;

		}
		case "CREATE BALOTO MANAGER": {

			balotoMan.setVisible(true);
			betMenuManager.setVisible(false);
			break;

		}
		case "BACKBALOTOMAN": {

			betMenuManager.setVisible(true);
			balotoMan.setVisible(false);
			balotoMan.getBetAmount().setText("");
			balotoMan.getNum1().setValue(1);
			balotoMan.getNum2().setValue(1);
			balotoMan.getNum3().setValue(1);
			balotoMan.getNum4().setValue(1);
			balotoMan.getNum5().setValue(1);
			balotoMan.getNum6().setValue(1);
			break;

		}
		case "CREATE BETPLAY MANAGER": {

			betPlayMan.setVisible(true);
			betMenuManager.setVisible(false);
			break;

		}
		case "BACKBETPLAYMAN": {

			betMenuManager.setVisible(true);
			betPlayMan.setVisible(false);
			betPlayMan.getBetAmount().setText(null);
			betPlayMan.getMatch1().setValue(0);
			betPlayMan.getMatch2().setValue(0);
			betPlayMan.getMatch3().setValue(0);
			betPlayMan.getMatch4().setValue(0);
			betPlayMan.getMatch5().setValue(0);
			betPlayMan.getMatch6().setValue(0);
			betPlayMan.getMatch7().setValue(0);
			betPlayMan.getMatch8().setValue(0);
			betPlayMan.getMatch9().setValue(0);
			betPlayMan.getMatch10().setValue(0);
			betPlayMan.getMatch11().setValue(0);
			betPlayMan.getMatch12().setValue(0);
			betPlayMan.getMatch13().setValue(0);
			betPlayMan.getMatch14().setValue(0);
			break;

		}
		case "CREATE CHANCE MANAGER": {

			chanceMan.setVisible(true);
			betMenuManager.setVisible(false);
			for (int i = 0; i < 5; i++) {

				generateRandomNumberMan();

			}
			break;

		}
		case "BACKCHANCEMAN": {

			betMenuManager.setVisible(true);
			chanceMan.setVisible(false);
			chanceMan.getBetAmount().setText(null);
			chanceMan.getNum1().removeAllItems();
			chanceMan.getNum2().removeAllItems();
			chanceMan.getNum3().removeAllItems();
			chanceMan.getNum4().removeAllItems();
			break;

		}
		case "CREATE SUPERASTRO MANAGER": {

			superastroMan.setVisible(true);
			betMenuManager.setVisible(false);

			break;

		}
		case "BACKSUPERASTROMAN": {

			betMenuManager.setVisible(true);
			superastroMan.setVisible(false);
			superastroMan.getBetAmount().setText("");
			superastroMan.getNum1().setValue(0);
			superastroMan.getNum2().setValue(0);
			superastroMan.getNum3().setValue(0);
			superastroMan.getNum4().setValue(0);
			break;

		}
		case "BACK MENU CASHIER": {

			logWind.setVisible(true);
			cashierMainMenu.setVisible(false);
			break;

		}
		case "MENU APOSTADORES CAJERO": {

			gambManagCashier.setVisible(true);
			cashierMainMenu.setVisible(false);
			break;

		}
		case "BACK MENU GAMBLER CASHIER": {
			cashierMainMenu.setVisible(true);
			gambManagCashier.setVisible(false);
			break;

		}
		case "READ MANAGMENT GAMBLER MANAGER": {
			showGamMan.setVisible(true);
			betManagmentManager.setVisible(false);
			showTableGamblerManager(exit);
			break;
		}
		case "BACK MENU GAMBLER SHOW": {
			gamblerManagManager.setVisible(true);
			showGamMan.setVisible(false);
			updateTableGamblerManager();
			break;
		}
		case "CREATE GAMBLER CASHIER": {

			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

				if (exit.equals(venueDAO.getHeadquarterList().get(i).getId())) {

					createGamblerCashier.getComboLocation()
							.addItem(venueDAO.getHeadquarterList().get(i).getVenueName());

				}

			}
			createGamblerCashier.setVisible(true);
			gambManagCashier.setVisible(false);

			break;
		}
		case "BACK CREATE GAMBLER CASHIER": {

			gambManagCashier.setVisible(true);
			createGamblerCashier.setVisible(false);

			createGamblerCashier.getCompleteName().setText("");
			createGamblerCashier.getComboLocation().removeAllItems();
			createGamblerCashier.getDocument().setText(null);
			createGamblerCashier.getAdress().setText(null);
			createGamblerCashier.getPhoneNumber().setText(null);
			break;

		}
		case "CREATE GAMBLER BY CASHIER": {
			createGamblerCashier();
			gambManagCashier.setVisible(true);
			createGamblerCashier.setVisible(false);
			createGamblerCashier.getCompleteName().setText("");
			createGamblerCashier.getComboLocation().removeAllItems();
			createGamblerCashier.getDocument().setText(null);
			createGamblerCashier.getAdress().setText(null);
			createGamblerCashier.getPhoneNumber().setText(null);

			break;

		}
		case "SHOW BET MENU MANAGER": {
			showTableBetManager(exit);
			showBetManag.setVisible(true);
			betManagmentManager.setVisible(false);
			break;

		}
		case "BACK SHOW BET MANAGER": {
			updateTableBetManager();
			betManagmentManager.setVisible(true);
			showBetManag.setVisible(false);
			break;
		}
		case "NEXT SELECT GAMBLER BET MANAGER": {
			selBetDeleteManager.setVisible(true);
			selGamDeleteBet.setVisible(false);
			long aux = Long.parseLong(selGamDeleteBet.getComboGambler().getSelectedItem().toString());
			updateSelectBetDeleteBetManager(aux);
			break;
		}
		case "BACK SELECT GAMBLER BET MANAGER": {
			betManagmentManager.setVisible(true);
			selGamDeleteBet.setVisible(false);
			break;
		}
		case "DELETE BET MENU MANAGER": {
			updateBoxSelectGamblerManagerForDeleteBet();
			selGamDeleteBet.setVisible(true);
			betManagmentManager.setVisible(false);
			break;
		}
		case "BACK DELETE BET MANAGER": {
			selGamDeleteBet.setVisible(true);
			selBetDeleteManager.setVisible(false);
			break;
		}
		case "DELETE BET MANAGER": {
			String aux = selBetDeleteManager.getComboGambler().getSelectedItem().toString();
			DeleteBetManager(aux);
			betManagmentManager.setVisible(true);
			selBetDeleteManager.setVisible(false);
			break;
		}
		case "UPDATE GAMBLER CASHIER": {

			selGambUpdateCashier.setVisible(true);
			gambManagCashier.setVisible(false);
			updateBoxSelectGamblerCashier(exit);
			break;

		}
		case "BACK SEL UPDATE GAMB CASHIER": {

			gambManagCashier.setVisible(true);
			selGambUpdateCashier.setVisible(false);
			break;
		}
		case "NEXT SEL UPDATE GAMB CASHIER": {

			setDataToUpdateGamblerCashier();
			updateGamblerCashier.setVisible(true);
			selGambUpdateCashier.setVisible(false);

			break;
		}
		case "BACK UPTADE GAMB CASHIER": {

			selGambUpdateCashier.setVisible(true);
			updateGamblerCashier.setVisible(false);
			updateGamblerCashier.getComboLocation().removeAllItems();
			break;
		}
		case "UPTADE GAMBLER BY CASHIER": {
			updateGamblerCashier();
			updateGamblerCashier.getComboLocation().removeAllItems();
			break;
		}

		case "READ GAMBLER CASHIER": {
			showGamCashi.setVisible(true);
			gambManagCashier.setVisible(false);
			showTableGamblerCashier(exit);
			break;
		}

		case "BACK SHOW GAMB CASHIER": {
			gambManagCashier.setVisible(true);
			showGamCashi.setVisible(false);
			updateTableGamblerCashier();
			break;
		}

		case "DELETE GAMBLER CASHIER": {
			updateBoxSelectGamblerCashierToDelete(exit);
			selGamToDelCashi.setVisible(true);
			gambManagCashier.setVisible(false);
			break;
		}
		case "BACK DELETE GAMB CASHIER": {
			gambManagCashier.setVisible(true);
			selGamToDelCashi.setVisible(false);
			break;
		}
		case "DELETE GAMB CASHIER": {
			deleteGamblerCashier();

			break;
		}
		case "MENU APUESTAS CAJERO": {

			betManCashier.setVisible(true);
			cashierMainMenu.setVisible(false);
			break;

		}
		case "BACK MENU BET CASHIER": {

			cashierMainMenu.setVisible(true);
			betManCashier.setVisible(false);
			break;

		}
		case "CREATE BET CASHIER": {

			updateBoxSelectGamblerCashierForBet(exit);
			selGambCreateBetCashier.setVisible(true);
			betManCashier.setVisible(false);
			break;
		}
		case "BACK SEL GAMB CREATE BET CASHIER": {

			betManCashier.setVisible(true);
			selGambCreateBetCashier.setVisible(false);
			break;
		}
		case "NEXT SEL GAMB CREATE BET CASHIER": {

			betMenuCashier.setVisible(true);
			selGambCreateBetCashier.setVisible(false);
			break;

		}
		case "BACK MENU CREATE BET CASHIER": {

			selGambCreateBetCashier.setVisible(true);
			betMenuCashier.setVisible(false);
			break;

		}
		case "LOTERIACASHIER": {

			loteriaCashier.setVisible(true);
			betMenuCashier.setVisible(false);
			break;

		}
		case "BACKLOTERIACASHIER": {

			betMenuCashier.setVisible(true);
			loteriaCashier.setVisible(false);
			loteriaCashier.getBetAmount().setText("");
			loteriaCashier.getNum1().setValue(0);
			loteriaCashier.getNum2().setValue(0);
			loteriaCashier.getNum3().setValue(0);
			loteriaCashier.getNum4().setValue(0);
			break;
		}
		case "NEXTLOTERIACASHIER": {

			makeLoteryBetCashier();
			loteriaCashier.getBetAmount().setText("");
			loteriaCashier.getNum1().setValue(0);
			loteriaCashier.getNum2().setValue(0);
			loteriaCashier.getNum3().setValue(0);
			loteriaCashier.getNum4().setValue(0);
			break;
		}
		case "BALOTOCASHIER": {

			balotoCashier.setVisible(true);
			betMenuCashier.setVisible(false);
			break;
		}
		case "BACKBALOTOCASHIER": {

			betMenuCashier.setVisible(true);
			balotoCashier.setVisible(false);

			balotoCashier.getBetAmount().setText("");
			balotoCashier.getNum1().setValue(1);
			balotoCashier.getNum2().setValue(1);
			balotoCashier.getNum3().setValue(1);
			balotoCashier.getNum4().setValue(1);
			balotoCashier.getNum5().setValue(1);
			balotoCashier.getNum6().setValue(1);
			break;
		}
		case "NEXTBALOTOCASHIER": {

			makeBalotoBetCashier();
			balotoCashier.getBetAmount().setText("");
			balotoCashier.getNum1().setValue(1);
			balotoCashier.getNum2().setValue(1);
			balotoCashier.getNum3().setValue(1);
			balotoCashier.getNum4().setValue(1);
			balotoCashier.getNum5().setValue(1);
			balotoCashier.getNum6().setValue(1);

			break;
		}
		case "SUPERASTROCASHIER": {

			superAstroCashier.setVisible(true);
			betMenuCashier.setVisible(false);

			break;

		}
		case "BACKSUPERASTROCASHIER": {

			betMenuCashier.setVisible(true);
			superAstroCashier.setVisible(false);
			superAstroCashier.getBetAmount().setText("");
			superAstroCashier.getNum1().setValue(0);
			superAstroCashier.getNum2().setValue(0);
			superAstroCashier.getNum3().setValue(0);
			superAstroCashier.getNum4().setValue(0);
			break;

		}
		case "NEXTSUPERASTROCASHIER": {
			makeSuperAstroBetCashier();
			superAstroCashier.getBetAmount().setText("");
			superAstroCashier.getNum1().setValue(0);
			superAstroCashier.getNum2().setValue(0);
			superAstroCashier.getNum3().setValue(0);
			superAstroCashier.getNum4().setValue(0);
			break;
		}
		case "CHANCECASHIER": {

			chanceCashier.setVisible(true);
			betMenuCashier.setVisible(false);
			for (int i = 0; i < 5; i++) {

				generateRandomNumberCashier();

			}

		}
		case "BACKCHANCECASHIER": {

			betMenuCashier.setVisible(true);
			chanceCashier.setVisible(false);
			chanceCashier.getBetAmount().setText(null);
			chanceCashier.getNum1().removeAllItems();
			chanceCashier.getNum2().removeAllItems();
			chanceCashier.getNum3().removeAllItems();
			chanceCashier.getNum4().removeAllItems();
			break;
		}
		case "NEXTCHANCECASHIER": {

			makeChanceBetCashier();
			chanceCashier.getBetAmount().setText(null);
			chanceCashier.getNum1().removeAllItems();
			chanceCashier.getNum2().removeAllItems();
			chanceCashier.getNum3().removeAllItems();
			chanceCashier.getNum4().removeAllItems();
			break;
		}
		case "BETPLAYCASHIER": {

			betPlayCashier.setVisible(true);
			betMenuCashier.setVisible(false);
			break;
		}
		case "BACKBETPLAYCASHIER": {

			betMenuCashier.setVisible(true);
			betPlayCashier.setVisible(false);
			betPlayCashier.getBetAmount().setText(null);
			betPlayCashier.getMatch1().setValue(0);
			betPlayCashier.getMatch2().setValue(0);
			betPlayCashier.getMatch3().setValue(0);
			betPlayCashier.getMatch4().setValue(0);
			betPlayCashier.getMatch5().setValue(0);
			betPlayCashier.getMatch6().setValue(0);
			betPlayCashier.getMatch7().setValue(0);
			betPlayCashier.getMatch8().setValue(0);
			betPlayCashier.getMatch9().setValue(0);
			betPlayCashier.getMatch10().setValue(0);
			betPlayCashier.getMatch11().setValue(0);
			betPlayCashier.getMatch12().setValue(0);
			betPlayCashier.getMatch13().setValue(0);
			betPlayCashier.getMatch14().setValue(0);
			break;
		}
		case "NEXTBETPLAYCASHIER": {

			makeBetPlayBetCashier();
			betPlayCashier.getBetAmount().setText(null);
			betPlayCashier.getMatch1().setValue(0);
			betPlayCashier.getMatch2().setValue(0);
			betPlayCashier.getMatch3().setValue(0);
			betPlayCashier.getMatch4().setValue(0);
			betPlayCashier.getMatch5().setValue(0);
			betPlayCashier.getMatch6().setValue(0);
			betPlayCashier.getMatch7().setValue(0);
			betPlayCashier.getMatch8().setValue(0);
			betPlayCashier.getMatch9().setValue(0);
			betPlayCashier.getMatch10().setValue(0);
			betPlayCashier.getMatch11().setValue(0);
			betPlayCashier.getMatch12().setValue(0);
			betPlayCashier.getMatch13().setValue(0);
			betPlayCashier.getMatch14().setValue(0);
			break;
		}
		case "SHOW BET CASHIER": {
			showBetCashier.setVisible(true);
			betManCashier.setVisible(false);
			showTableBetCashier(exit);
			break;

		}
		case "BACK SHOW BET CASHIER": {
			betManCashier.setVisible(true);
			showBetCashier.setVisible(false);
			updateTableBetCashier();
			break;
		}
		case "DELETE BET CASHIER": {
			updateBoxSelectGamblerCashierForDeleteBet();
			selGambBetDeleteCashier.setVisible(true);
			betManCashier.setVisible(false);
			break;

		}
		case "BACK DELETE BET CASHIER": {
			betManCashier.setVisible(true);
			selGambBetDeleteCashier.setVisible(false);
			break;
		}
		case "NEXTDELETEBETCASHIER": {
			selBetDeleteCashi.setVisible(true);
			selGambBetDeleteCashier.setVisible(false);
			long aux = Long.parseLong(selGambBetDeleteCashier.getComboGambler().getSelectedItem().toString());
			updateSelectBetDeleteBetCashier(aux);
			break;
		}
		case "BACK DELETE BET": {
			selGambBetDeleteCashier.setVisible(true);
			selBetDeleteCashi.setVisible(false);
			break;
		}
		case "NEXT DELETE BET": {
			betManCashier.setVisible(true);
			selBetDeleteCashi.setVisible(false);
			String aux = selBetDeleteCashi.getComboGambler().getSelectedItem().toString();
			DeleteBetCashier(aux);
			break;
		}
		default:

			break;
		}

	}

	/**
	 * Funcion revisando si el usuario y contraseña existen y a que pertenece
	 */

	public void checkLoginOwner() {

		String nameToCheck = logWind.getUsuario().getText();
		@SuppressWarnings("deprecation")
		String passToCheck = logWind.getPassword().getText();

		int cont = 0;
		String id = "";

		for (int i = 0; i < ownDAO.getOwnerList().size(); i++) {

			if (nameToCheck.equals(ownDAO.getOwnerList().get(i).getUsername())
					&& passToCheck.equals(ownDAO.getOwnerList().get(i).getPassword())) {
				cont = 1;

			} else {
				for (int j = 0; j < bossDAO.getHeadquarterManagerList().size(); j++) {
					if (nameToCheck.equals(bossDAO.getHeadquarterManagerList().get(j).getUser())
							&& passToCheck.equals(bossDAO.getHeadquarterManagerList().get(j).getPassword())) {
						cont = 2;
						id = bossDAO.getHeadquarterManagerList().get(j).getId();
					} else {
						for (int j2 = 0; j2 < cashierDAO.getCheckerList().size(); j2++) {
							if (nameToCheck.equals(cashierDAO.getCheckerList().get(j2).getUser())
									&& passToCheck.equals(cashierDAO.getCheckerList().get(j2).getPassword())) {
								cont = 3;
								id = cashierDAO.getCheckerList().get(j2).getId();
							} else {

							}

						}
					}

				}

			}

		}

		if (cont == 1) {
			JOptionPane.showMessageDialog(logWind, "----INGRESANDO DUEÑO----");
			ownWind.setVisible(true);
			logWind.setVisible(false);
			exit = "no";
		}
		if (cont == 0) {
			JOptionPane.showMessageDialog(logWind, "Usuario y/o Contraseña ERRADOS", "NO EXIST", 0);
			logWind.setVisible(true);
			exit = "no";
		}
		if (cont == 2) {

			JOptionPane.showMessageDialog(logWind, "----INGRESANDO JEFE DE SEDE----");

			for (int j = 0; j < venueDAO.getHeadquarterList().size(); j++) {

				if (id.equals(venueDAO.getHeadquarterList().get(j).getId())) {

					managerMenuWin.getNameVenue().setText(venueDAO.getHeadquarterList().get(j).getVenueName());
					exit = id;
				}

			}

			managerMenuWin.setVisible(true);
			logWind.setVisible(false);

		}
		if (cont == 3) {

			JOptionPane.showMessageDialog(logWind, "----INGRESANDO CAJERO----");

			cashierMainMenu.setVisible(true);
			exit = id;
			logWind.setVisible(false);

		}

	}

	/**
	 * Funcion para crear la casa de apuestas
	 */

	public void createHouse() {

		String name = "";
		String budgetCheck = "";
		String numVenueCheck = "";
		while (true) {

			try {
				name = houseManageWindow.getNameHouse().getText();
				checkName(name);
				emptyData(name);
				budgetCheck = houseManageWindow.getTotalBudget().getText();
				numNotValid(budgetCheck);
				emptyData(budgetCheck);
				Double budget = Double.parseDouble(budgetCheck);
				numVenueCheck = houseManageWindow.getNumberVenue().getValue().toString();
				int numVenue = Integer.parseInt(numVenueCheck);
				numNotValid(numVenueCheck);
				emptyData(numVenueCheck);

				houseDAO.create(name, numVenue, budget);

				JOptionPane.showMessageDialog(houseManageWindow,
						"HAS SETEADO CON EXITO LA CONFIGURACION DE TU CASA DE APUESTAS");
				gamesSettingWin.setVisible(true);
				houseManageWindow.setVisible(false);

			} catch (NotValidNameException e) {
				// TODO Auto-generated catch block
				houseManageWindow.getNameHouse().setText(null);
				houseManageWindow.getTotalBudget().setText(null);
				houseManageWindow.getNumberVenue().setValue(0);
			} catch (NumberNotValidException e) {
				// TODO Auto-generated catch block
				houseManageWindow.getNameHouse().setText(null);
				houseManageWindow.getTotalBudget().setText(null);
				houseManageWindow.getNumberVenue().setValue(0);
			} catch (EmptyDataException e) {
				// TODO Auto-generated catch block
				houseManageWindow.getNameHouse().setText(null);
				houseManageWindow.getTotalBudget().setText(null);
				houseManageWindow.getNumberVenue().setValue(0);
			}

			break;
		}
	}

	/**
	 * Funcion para crear cuenta de dueño
	 */

	public void createAccount() {

		String user = "";
		String pass = "";
		while (true) {

			try {
				user = signWind.getUsuario().getText();
				sameUserException(user);
				emptyData(user);
				pass = signWind.getPassword().getText();
				validPassword(pass);
				emptyData(pass);

				int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS INGRESADOS?",
						"CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "SI", "NO" }, "SI");

				if (JOptionPane.NO_OPTION == response) {

					signWind.getUsuario().setText(null);
					signWind.getPassword().setText(null);

				} else if (JOptionPane.OK_OPTION == response) {
					ownDAO.create(user, pass);
					JOptionPane.showMessageDialog(signWind, "CUENTA CREADA CON EXITO");

					logWind.setVisible(true);
					signWind.setVisible(false);

				}

			} catch (NotValidPasswordException e) {
				// TODO Auto-generated catch block
				signWind.getUsuario().setText(null);
				signWind.getPassword().setText(null);
			} catch (EmptyDataException e) {
				// TODO Auto-generated catch block
				signWind.getUsuario().setText(null);
				signWind.getPassword().setText(null);
			} catch (SameUserException e) {
				// TODO Auto-generated catch block
				signWind.getUsuario().setText(null);
				signWind.getPassword().setText(null);
			}
			break;
		}

	}

	/**
	 * Funcion para crear cuenta de jefe de sede
	 */
	public void createBoss() {

		String user = "";
		String password = "";
		String id = randomString();

		while (true) {

			try {
				user = managerCreationWin.getUser().getText();
				sameUserException(user);
				emptyData(user);
				password = managerCreationWin.getPassword().getText();
				validPassword(password);
				emptyData(password);

				int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS INGRESADOS?",
						"CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "SI", "NO" }, "SI");

				if (JOptionPane.NO_OPTION == response) {
					managerCreationWin.getUser().setText("");
					managerCreationWin.getPassword().setText("");
				} else if (JOptionPane.OK_OPTION == response) {
					bossDAO.create(user, password, id);
					JOptionPane.showMessageDialog(managerCreationWin, "CUENTA CREADA CON EXITO");
					createVenueWin.setVisible(true);
					managerCreationWin.setVisible(false);
				}
			} catch (SameUserException e) {
				// TODO Auto-generated catch block
				managerCreationWin.getUser().setText("");
				managerCreationWin.getPassword().setText("");
			} catch (NotValidPasswordException e) {
				// TODO Auto-generated catch block
				managerCreationWin.getUser().setText("");
				managerCreationWin.getPassword().setText("");
			} catch (EmptyDataException e) {
				// TODO Auto-generated catch block
				managerCreationWin.getUser().setText("");
				managerCreationWin.getPassword().setText("");
			}
			break;
		}

	}

	/**
	 * Funcion para crear cuenta de cajero
	 */

	public void createCashier() {

		String user = "";
		String password = "";
		String aux = managerMenuWin.getNameVenue().getText();

		String id = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (aux.equals(venueDAO.getHeadquarterList().get(i).getVenueName())) {

				id = venueDAO.getHeadquarterList().get(i).getId();

			}

		}

		while (true) {

			try {
				user = createCashier.getUser().getText();
				sameUserException(user);
				emptyData(user);
				password = createCashier.getPassword().getText();
				validPassword(password);
				emptyData(password);

				int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS INGRESADOS?",
						"CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "SI", "NO" }, "SI");
				if (JOptionPane.NO_OPTION == response) {

					createCashier.getUser().setText("");
					createCashier.getPassword().setText("");

				} else if (JOptionPane.OK_OPTION == response) {
					cashierDAO.create(user, password, id);
					JOptionPane.showMessageDialog(createCashier, "CUENTA CREADA CON EXITO");
					manageVenueManager.setVisible(true);
					createCashier.setVisible(false);
				}

			} catch (NotValidPasswordException e) {
				// TODO Auto-generated catch block
				createCashier.getUser().setText("");
				createCashier.getPassword().setText("");
			} catch (EmptyDataException e) {
				// TODO Auto-generated catch block
				createCashier.getUser().setText("");
				createCashier.getPassword().setText("");
			} catch (SameUserException e) {
				// TODO Auto-generated catch block
				createCashier.getUser().setText("");
				createCashier.getPassword().setText("");
			}
			break;
		}

	}

	/**
	 * Funcion para crear una nueva sede
	 */

	public void createVenue() {

		String name = createVenueWin.getVenueName().getText();
		String locationVenue = createVenueWin.getComboLocation().getSelectedItem().toString();
		String numEmployes = createVenueWin.getNumEmployes().getValue().toString();
		String id = "";

		for (int i = 0; i < bossDAO.getHeadquarterManagerList().size(); i++) {

			id = bossDAO.getHeadquarterManagerList().get(i).getId();
		}

		int cantVenueMax = 0;
		int numVenue = venueDAO.getHeadquarterList().size();

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("src/co/edu/unbosque/model/persistence/config.properties")));
			cantVenueMax = Integer.parseInt(prop.get(
					"PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.numerosede")
					.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (cantVenueMax < numVenue) {
			JOptionPane.showMessageDialog(logWind, "NO SE PUEDEN CREAR MAS DE " + cantVenueMax + " sedes", "EXCEPTION",
					0);
			venueDAO.delete(cantVenueMax + 1);
		} else {

			venueDAO.create(name, locationVenue, numEmployes, id);

			JOptionPane.showMessageDialog(createVenueWin, "HAS CREADO CON EXITO UNA NUEVA SEDE");

		}

	}

	/**
	 * Funcion para generar un numero aleaotrio entre numeros elegidos
	 */

	public int randomNumberInRange(int minimo, int maximo) {

		return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
	}

	/**
	 * Funcion para generar ID aleatorio con respecto a un rango especificado
	 */

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

	/**
	 * Funcion para confirmar salida del programa
	 */

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

	/**
	 * Funcion para actualizar ComboBox de sede
	 */

	public void updateBoxSelectUpdateVenue() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selUpdateVenOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

				selUpdateVenOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}

	}

	/**
	 * Funcion para actualizar ComboBox de sede a eliminar
	 */
	public void updateBoxSelectDeleteVenue() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selDeleteVenueOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selDeleteVenueOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}

	}

	/**
	 * Funcion para actualizar ComboBox de seleccion apostador para eliminar sede
	 */
	public void updateBoxSelectUpdateVenueGambler() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selUpdateGamblerOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selUpdateGamblerOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());

			}

		}

	}

	/**
	 * Funcion para actualizar ComboBox seleccionar apuesta a eliminar
	 */

	public void updateBoxSelectDeleteVenueBet() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selVenDelBetOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selVenDelBetOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());

			}

		}

	}

	/**
	 * Funcion para actualizar ComboBox seleccionar apostador a actualizar
	 */

	public void updateBoxUpdateVenueGamblerUpdate() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			gamUpdateWinOwn.getComboLocation().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				gamUpdateWinOwn.getComboLocation().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());

			}

		}

	}

	/**
	 * Funcion para actualizar ComboBox seleccionar apostador a eliminar
	 */

	public void updateBoxSelectDeleteVenueGambler() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selDeleteGamblerOwn.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selDeleteGamblerOwn.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}
	}

	/**
	 * Funcion para settear datos para actualizar sede
	 */
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

	/**
	 * Funcion para settear datos para actualizar apostador
	 */

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

	/**
	 * Funcion para actualizar sede por dueño
	 */

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

		venueDAO.updateByIndex(index, nameVenue, updateLocation, numEmployes, id);

		JOptionPane.showMessageDialog(updateVenueOwn, "HAS ACTUALIZADO CON EXITO LA SEDE: " + nameVenue);

	}

	/**
	 * Funcion para eliminar sede por dueño
	 */

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

	/**
	 * Funcion para crear los parametros de los juegos de la casa de apuestas
	 */

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

		ownWind.setVisible(true);
		gamesSettingWin.setVisible(false);

	}

	/**
	 * Funcion para actualizar ComboBox que crea un apostador
	 */
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

	/**
	 * Funcion para actualizar ComboBox creacion apuesta
	 */

	public void updateBoxCreateBet() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			selcreatebet.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				selcreatebet.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}
	}

	/**
	 * Funcion para actualizar ComboBox seleccionar apostador a actualizar
	 */

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

	/**
	 * Funcion para actualizar ComboBox seleccionar apostador que hara apuesta
	 */

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

	/**
	 * Funcion para actualizar ComboBox seleccionar apostador que hizo apuesta para
	 * eliminar apuesta
	 */

	public void updateSelectGamblerDeleteBet(String data) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGamDelBetOwn.getComboGambler().removeAllItems();
			for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {
				if (data.equals(gamDAO.getGamblerList().get(i).getGamingVenue())) {
					selGamDelBetOwn.getComboGambler().addItem(gamDAO.getGamblerList().get(i).getDocumentId());
				}
			}
		}
	}

	/**
	 * Funcion para actualizar ComboBox seleccionar apuesta a eliminar
	 */

	public void updateSelectBetDeleteBet(long data) {
		if (!loteriaDAO.getLoteryBetList().isEmpty() || !balotoDAO.getBallotList().isEmpty()
				|| !superAstroDAO.getSuperAstroList().isEmpty() || !chanceDAO.getChanceList().isEmpty()
				|| !betPlayDAO.getBetPlayList().isEmpty()) {
			selBetDeleteOwn.getComboGambler().removeAllItems();
			for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {
				if (data == (loteriaDAO.getLoteryBetList().get(i).getDocument())) {
					selBetDeleteOwn.getComboGambler().addItem(
							"Apuesta en loteria de valor " + loteriaDAO.getLoteryBetList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {
				if (data == (balotoDAO.getBallotList().get(i).getDocument())) {
					selBetDeleteOwn.getComboGambler()
							.addItem("Apuesta en baloto de valor " + balotoDAO.getBallotList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {
				if (data == (superAstroDAO.getSuperAstroList().get(i).getDocument())) {
					selBetDeleteOwn.getComboGambler().addItem("Apuesta en super astro de valor "
							+ superAstroDAO.getSuperAstroList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {
				if (data == (chanceDAO.getChanceList().get(i).getDocument())) {
					selBetDeleteOwn.getComboGambler()
							.addItem("Apuesta en chance de valor " + chanceDAO.getChanceList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {
				if (data == (betPlayDAO.getBetPlayList().get(i).getDocument())) {
					selBetDeleteOwn.getComboGambler().addItem(
							"Apuesta en bet play de valor " + betPlayDAO.getBetPlayList().get(i).getBetPlaced());
				}
			}

		}
	}

	/**
	 * Funcion para actualizar ComboBox seleccionar apostador a eliminar
	 */

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

	/**
	 * Funcion para crear apostador por el dueño
	 */

	public void createGamblerOwner() {

		String fullName = "";
		String document = "";
		String gamingVenue = "";
		String adress = "";
		String phoneNumber = "";
		while (true) {
			try {
				fullName = createGamblerWinOwn.getCompleteName().getText();
				checkName(fullName);
				emptyData(fullName);
				document = createGamblerWinOwn.getDocument().getText();
				checkDuplicatedDocument(document);
				numNotValid(document);
				emptyData(document);
				gamingVenue = createGamblerWinOwn.getComboLocation().getSelectedItem().toString();
				emptyData(gamingVenue);
				adress = createGamblerWinOwn.getAdress().getText();
				emptyData(adress);
				phoneNumber = createGamblerWinOwn.getPhoneNumber().getText();
				numNotValid(phoneNumber);
				emptyData(phoneNumber);

				gamDAO.create(fullName, document, gamingVenue, adress, phoneNumber);
				JOptionPane.showMessageDialog(gamesSettingWin, "EL APOSTADOR " + fullName + " HA SIDO CREADO");

			} catch (SameDocumentException e) {

				createGamblerWinOwn.getDocument().setText("");
				gamDAO.delete(0);

			} catch (EmptyDataException e) {
				// TODO Auto-generated catch block
				createGamblerWinOwn.getDocument().setText("");
				createGamblerWinOwn.getCompleteName().setText("");
				createGamblerWinOwn.getAdress().setText("");
				createGamblerWinOwn.getPhoneNumber().setText("");
			} catch (NotValidNameException e) {
				// TODO Auto-generated catch block
				createGamblerWinOwn.getDocument().setText("");
				createGamblerWinOwn.getCompleteName().setText("");
				createGamblerWinOwn.getAdress().setText("");
				createGamblerWinOwn.getPhoneNumber().setText("");
			} catch (NumberNotValidException e) {
				// TODO Auto-generated catch block
				createGamblerWinOwn.getDocument().setText("");
				createGamblerWinOwn.getCompleteName().setText("");
				createGamblerWinOwn.getAdress().setText("");
				createGamblerWinOwn.getPhoneNumber().setText("");
			}
			break;
		}
	}

	/**
	 * Funcion para crear apostador por jefe de sede
	 */

	public void createGamblerManager() {

		String fullName = "";
		String document = "";
		String gamingVenue = managerMenuWin.getNameVenue().getText();
		String adress = "";
		String phoneNumber = "";
		while (true) {
			try {
				fullName = createGambManager.getCompleteName().getText();
				checkName(fullName);
				emptyData(fullName);
				document = createGambManager.getDocument().getText();
				checkDuplicatedDocument(document);
				numNotValid(document);
				emptyData(document);
				checkDuplicatedDocument(document);
				emptyData(gamingVenue);
				adress = createGambManager.getAdress().getText();
				phoneNumber = createGambManager.getPhoneNumber().getText();
				gamDAO.create(fullName, document, gamingVenue, adress, phoneNumber);
				JOptionPane.showMessageDialog(createGambManager, "EL APOSTADOR " + fullName + " HA SIDO CREADO");
				createGambManager.getComboLocation().removeAllItems();

			} catch (SameDocumentException e) {

				createGambManager.getDocument().setText("");
				gamDAO.delete(0);

			} catch (NotValidNameException e) {
				// TODO Auto-generated catch block
				createGambManager.getDocument().setText("");
				createGambManager.getCompleteName().setText("");
				createGambManager.getAdress().setText("");
				createGambManager.getPhoneNumber().setText("");
			} catch (EmptyDataException e) {
				// TODO Auto-generated catch block
				createGambManager.getDocument().setText("");
				createGambManager.getCompleteName().setText("");
				createGambManager.getAdress().setText("");
				createGambManager.getPhoneNumber().setText("");
			} catch (NumberNotValidException e) {
				// TODO Auto-generated catch block
				createGambManager.getDocument().setText("");
				createGambManager.getCompleteName().setText("");
				createGambManager.getAdress().setText("");
				createGambManager.getPhoneNumber().setText("");
			}
			break;
		}

	}

	/**
	 * Funcion para crear apostador por cajero
	 */

	public void createGamblerCashier() {

		String gamingVenue = "";
		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (exit.equals(venueDAO.getHeadquarterList().get(i).getId())) {

				gamingVenue = venueDAO.getHeadquarterList().get(i).getVenueName();

			}

		}

		String fullName = "";
		String document = "";
		String adress = "";
		String phoneNumber = "";
		while (true) {
			try {
				fullName = createGamblerCashier.getCompleteName().getText();
				checkName(fullName);
				emptyData(fullName);
				document = createGamblerCashier.getDocument().getText();
				checkDuplicatedDocument(document);
				numNotValid(document);
				emptyData(document);
				adress = createGamblerCashier.getAdress().getText();
				phoneNumber = createGamblerCashier.getPhoneNumber().getText();
				gamDAO.create(fullName, document, gamingVenue, adress, phoneNumber);
				JOptionPane.showMessageDialog(createGamblerCashier, "EL APOSTADOR " + fullName + " HA SIDO CREADO");
				createGamblerCashier.getComboLocation().removeAllItems();

			} catch (SameDocumentException e) {

				createGamblerCashier.getDocument().setText("");
				gamDAO.delete(0);

			} catch (NotValidNameException e) {
				// TODO Auto-generated catch block
				createGamblerCashier.getDocument().setText("");
				createGamblerCashier.getCompleteName().setText("");
				createGamblerCashier.getAdress().setText("");
				createGamblerCashier.getPhoneNumber().setText("");
			} catch (EmptyDataException e) {
				// TODO Auto-generated catch block
				createGamblerCashier.getDocument().setText("");
				createGamblerCashier.getCompleteName().setText("");
				createGamblerCashier.getAdress().setText("");
				createGamblerCashier.getPhoneNumber().setText("");
			} catch (NumberNotValidException e) {
				// TODO Auto-generated catch block
				createGamblerCashier.getDocument().setText("");
				createGamblerCashier.getCompleteName().setText("");
				createGamblerCashier.getAdress().setText("");
				createGamblerCashier.getPhoneNumber().setText("");
			}
			break;
		}

	}

	/**
	 * Funcion para actualizar apostador por dueño
	 */

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

		gamDAO.updateByIndex(index, fullName, document, gamingVenue, addres, phoneNumber);

		JOptionPane.showMessageDialog(gamUpdateWinOwn, "ACTUALIZADO CON EXITO");

	}

	/**
	 * Funcion para actualizar apostador por jefe de sede
	 */
	public void updateGamblerManager() {

		String fullName = updateGambManager.getCompleteName().getText();
		String document = updateGambManager.getDocument().getText();
		String addres = updateGambManager.getAdress().getText();
		String phoneNumber = updateGambManager.getPhoneNumber().getText();
		String gamingVenue = managerMenuWin.getNameVenue().getText();
		int index = 0;

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			long aux = Long.parseLong(updateGambManager.getDocument().getText());

			if (aux == gamDAO.getGamblerList().get(i).getDocumentId()) {
				index = i;
			}

		}

		gamDAO.updateByIndex(index, fullName, document, gamingVenue, addres, phoneNumber);

		JOptionPane.showMessageDialog(updateGambManager, "ACTUALIZADO CON EXITO");

		gamblerManagManager.setVisible(true);
		updateGambManager.setVisible(false);

	}

	/**
	 * Funcion para actualizar apostador por cajero
	 */

	public void updateGamblerCashier() {
		String gamingVenue = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (exit.equals(venueDAO.getHeadquarterList().get(i).getId())) {

				gamingVenue = venueDAO.getHeadquarterList().get(i).getVenueName();

			}

		}

		String fullName = updateGamblerCashier.getCompleteName().getText();
		String document = updateGamblerCashier.getDocument().getText();
		String addres = updateGamblerCashier.getAdress().getText();
		String phoneNumber = updateGamblerCashier.getPhoneNumber().getText();
		int index = 0;

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			long aux = Long.parseLong(updateGamblerCashier.getDocument().getText());

			if (aux == gamDAO.getGamblerList().get(i).getDocumentId()) {
				index = i;
			}

		}

		gamDAO.updateByIndex(index, fullName, document, gamingVenue, addres, phoneNumber);

		JOptionPane.showMessageDialog(updateGamblerCashier, "ACTUALIZADO CON EXITO");

		gambManagCashier.setVisible(true);
		updateGamblerCashier.setVisible(false);

	}

	/**
	 * Funcion para eliminar apostador por dueño
	 */

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

	/**
	 * Funcion para eliminar apostador por jefe de sede
	 */

	public void deleteGamblerManager() {

		int index = 0;

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			long aux = Long.parseLong(selGambDeleteManager.getComboGambler().getSelectedItem().toString());

			if (aux == gamDAO.getGamblerList().get(i).getDocumentId()) {
				index = i;
			}

		}

		gamDAO.delete(index);
		JOptionPane.showMessageDialog(selGambDeleteManager, "ELIMINADO CON EXITO");
		gamblerManagManager.setVisible(true);
		selGambDeleteManager.setVisible(false);

	}

	/**
	 * Funcion para verificar que los numeros de documento de apostadores no se
	 * repiten
	 */

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
			throw new SameDocumentException();
		} else if (cont == 0) {
			check = true;

		}
		return check;
	}

	/**
	 * Funcion para realizar una apuesta de loteria
	 */

	public void makeLoteryBetOwn() {

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

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
			loteriaDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName,
					numbers, serialNum);

			betManOwn.setVisible(true);
			loteriaWin.setVisible(false);

			JOptionPane.showMessageDialog(loteriaWin,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);
			betManOwn.setVisible(true);
			receiptWindow.setVisible(true);
			loteriaWin.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de loteria
	 */
	public void makeLoteryBetMan() {

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = loteriaMan.getBetAmount().getText();

		String headQuarterName = managerMenuWin.getNameVenue().getText();

		String document = selGambCreateBetMan.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String loteryName = loteriaMan.getLoteryType().getSelectedItem().toString();

		String typeBet = "LOTERIA";

		String num1 = loteriaMan.getNum1().getValue().toString();
		String num2 = loteriaMan.getNum2().getValue().toString();
		String num3 = loteriaMan.getNum3().getValue().toString();
		String num4 = loteriaMan.getNum4().getValue().toString();

		String numbers = num1 + num2 + num3 + num4;

		String serialNum = loteriaMan.getSerialNumber().getSelectedItem().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {
			loteriaDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName,
					numbers, serialNum);

			JOptionPane.showMessageDialog(loteriaMan,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);
			betManagmentManager.setVisible(true);
			receiptWindow.setVisible(true);
			loteriaMan.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de loteria
	 */
	public void makeLoteryBetCashier() {

		String headQuarterName = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (exit.equals(venueDAO.getHeadquarterList().get(i).getId())) {

				headQuarterName = venueDAO.getHeadquarterList().get(i).getVenueName();

			}

		}

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = loteriaCashier.getBetAmount().getText();

		String document = selGambCreateBetCashier.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String loteryName = loteriaCashier.getLoteryType().getSelectedItem().toString();

		String typeBet = "LOTERIA";

		String num1 = loteriaCashier.getNum1().getValue().toString();
		String num2 = loteriaCashier.getNum2().getValue().toString();
		String num3 = loteriaCashier.getNum3().getValue().toString();
		String num4 = loteriaCashier.getNum4().getValue().toString();

		String numbers = num1 + num2 + num3 + num4;

		String serialNum = loteriaCashier.getSerialNumber().getSelectedItem().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {
			loteriaDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName,
					numbers, serialNum);

			JOptionPane.showMessageDialog(loteriaCashier,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);
			betMenuCashier.setVisible(true);
			receiptWindow.setVisible(true);
			loteriaCashier.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de baloto
	 */
	public void makeBalotoBetOwn() {

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

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
			balotoDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, numbers);
			JOptionPane.showMessageDialog(balotoWin, "HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2
					+ "-" + num3 + "-" + num4 + "-" + num5 + "-" + num6);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betManOwn.setVisible(true);
			receiptWindow.setVisible(true);
			balotoWin.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de baloto
	 */
	public void makeBalotoBetMan() {

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = balotoMan.getBetAmount().getText();

		String headQuarterName = managerMenuWin.getNameVenue().getText();

		String document = selGambCreateBetMan.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "LOTERIA";

		String num1 = balotoMan.getNum1().getValue().toString();
		String num2 = balotoMan.getNum2().getValue().toString();
		String num3 = balotoMan.getNum3().getValue().toString();
		String num4 = balotoMan.getNum4().getValue().toString();
		String num5 = balotoMan.getNum5().getValue().toString();
		String num6 = balotoMan.getNum6().getValue().toString();

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
			balotoDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, numbers);
			JOptionPane.showMessageDialog(balotoMan, "HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2
					+ "-" + num3 + "-" + num4 + "-" + num5 + "-" + num6);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betManagmentManager.setVisible(true);
			receiptWindow.setVisible(true);
			balotoMan.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de baloto
	 */
	public void makeBalotoBetCashier() {

		String headQuarterName = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (exit.equals(venueDAO.getHeadquarterList().get(i).getId())) {

				headQuarterName = venueDAO.getHeadquarterList().get(i).getVenueName();

			}

		}
		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = balotoCashier.getBetAmount().getText();

		String document = selGambCreateBetCashier.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "LOTERIA";

		String num1 = balotoCashier.getNum1().getValue().toString();
		String num2 = balotoCashier.getNum2().getValue().toString();
		String num3 = balotoCashier.getNum3().getValue().toString();
		String num4 = balotoCashier.getNum4().getValue().toString();
		String num5 = balotoCashier.getNum5().getValue().toString();
		String num6 = balotoCashier.getNum6().getValue().toString();

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
			balotoDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, numbers);
			JOptionPane.showMessageDialog(balotoCashier, "HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-"
					+ num2 + "-" + num3 + "-" + num4 + "-" + num5 + "-" + num6);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betMenuCashier.setVisible(true);
			receiptWindow.setVisible(true);
			balotoCashier.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de Super astro
	 */
	public void makeSuperAstroBetOwn() {

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

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
			superAstroDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, numbers,
					zodiacSign);
			JOptionPane.showMessageDialog(superastroWin,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betManOwn.setVisible(true);
			receiptWindow.setVisible(true);
			superastroWin.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de Super astro
	 */
	public void makeSuperAstroBetMan() {

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = superastroMan.getBetAmount().getText();

		String headQuarterName = managerMenuWin.getNameVenue().getText();

		String document = selGambCreateBetMan.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "LOTERIA";

		String num1 = superastroMan.getNum1().getValue().toString();
		String num2 = superastroMan.getNum2().getValue().toString();
		String num3 = superastroMan.getNum3().getValue().toString();
		String num4 = superastroMan.getNum4().getValue().toString();

		String numbers = num1 + num2 + num3 + num4;

		String zodiacSign = superastroMan.getZodiacSign().getSelectedItem().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {
			superAstroDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, numbers,
					zodiacSign);
			JOptionPane.showMessageDialog(superastroMan,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betManagmentManager.setVisible(true);
			receiptWindow.setVisible(true);
			superastroMan.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de Super astro
	 */
	public void makeSuperAstroBetCashier() {

		String headQuarterName = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (exit.equals(venueDAO.getHeadquarterList().get(i).getId())) {

				headQuarterName = venueDAO.getHeadquarterList().get(i).getVenueName();

			}

		}

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = superAstroCashier.getBetAmount().getText();

		String document = selGambCreateBetCashier.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "LOTERIA";

		String num1 = superAstroCashier.getNum1().getValue().toString();
		String num2 = superAstroCashier.getNum2().getValue().toString();
		String num3 = superAstroCashier.getNum3().getValue().toString();
		String num4 = superAstroCashier.getNum4().getValue().toString();

		String numbers = num1 + num2 + num3 + num4;

		String zodiacSign = superAstroCashier.getZodiacSign().getSelectedItem().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {
			superAstroDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, numbers,
					zodiacSign);
			JOptionPane.showMessageDialog(superAstroCashier,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betMenuCashier.setVisible(true);
			receiptWindow.setVisible(true);
			superAstroCashier.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para generar numeros aleatorios para el chance
	 */
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

	/**
	 * Funcion para generar numeros aleatorios para el chance
	 */
	public void generateRandomNumberMan() {

		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		Random rand4 = new Random();
		int num1 = rand1.nextInt(99);
		int num2 = rand2.nextInt(99);
		int num3 = rand3.nextInt(99);
		int num4 = rand4.nextInt(99);

		chanceMan.getNum1().addItem(num1);
		chanceMan.getNum2().addItem(num2);
		chanceMan.getNum3().addItem(num3);
		chanceMan.getNum4().addItem(num4);

	}

	/**
	 * Funcion para generar numeros aleatorios para el chance
	 */
	public void generateRandomNumberCashier() {

		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		Random rand4 = new Random();
		int num1 = rand1.nextInt(99);
		int num2 = rand2.nextInt(99);
		int num3 = rand3.nextInt(99);
		int num4 = rand4.nextInt(99);

		chanceCashier.getNum1().addItem(num1);
		chanceCashier.getNum2().addItem(num2);
		chanceCashier.getNum3().addItem(num3);
		chanceCashier.getNum4().addItem(num4);

	}

	/**
	 * Funcion para realizar una apuesta de chance
	 */
	public void makeChanceBetOwn() {
		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = chanceWin.getBetAmount().getText();

		String headQuarterName = selcreatebet.getComboVenue().getSelectedItem().toString();

		String document = selGamCreateBetOwn.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String loteryName = chanceWin.getLoteryType().getSelectedItem().toString();

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
			chanceDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName,
					numbers);
			JOptionPane.showMessageDialog(chanceWin,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betManOwn.setVisible(true);
			receiptWindow.setVisible(true);
			chanceWin.setVisible(false);

		} else {
		}

	}

	/**
	 * Funcion para realizar una apuesta de chance
	 */
	public void makeChanceBetMan() {
		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = chanceMan.getBetAmount().getText();

		String headQuarterName = managerMenuWin.getNameVenue().getText();

		String document = selGambCreateBetMan.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String loteryName = chanceMan.getLoteryType().getSelectedItem().toString();

		String typeBet = "CHANCE";

		String num1 = chanceMan.getNum1().getSelectedItem().toString();
		String num2 = chanceMan.getNum2().getSelectedItem().toString();
		String num3 = chanceMan.getNum3().getSelectedItem().toString();
		String num4 = chanceMan.getNum4().getSelectedItem().toString();

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
			chanceDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName,
					numbers);
			JOptionPane.showMessageDialog(chanceMan,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betManagmentManager.setVisible(true);
			receiptWindow.setVisible(true);
			chanceMan.setVisible(false);

		} else {
		}

	}

	/**
	 * Funcion para realizar una apuesta de chance
	 */
	public void makeChanceBetCashier() {

		String headQuarterName = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (exit.equals(venueDAO.getHeadquarterList().get(i).getId())) {

				headQuarterName = venueDAO.getHeadquarterList().get(i).getVenueName();

			}

		}

		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = chanceCashier.getBetAmount().getText();

		String document = selGambCreateBetCashier.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String loteryName = chanceCashier.getLoteryType().getSelectedItem().toString();

		String typeBet = "CHANCE";

		String num1 = chanceCashier.getNum1().getSelectedItem().toString();
		String num2 = chanceCashier.getNum2().getSelectedItem().toString();
		String num3 = chanceCashier.getNum3().getSelectedItem().toString();
		String num4 = chanceCashier.getNum4().getSelectedItem().toString();

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
			chanceDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName,
					numbers);
			JOptionPane.showMessageDialog(chanceMan,
					"HAS REALIZADO LA APUESTA CON LOS NUMEROS: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betMenuCashier.setVisible(true);
			receiptWindow.setVisible(true);
			chanceCashier.setVisible(false);

		} else {
		}

	}

	/**
	 * Funcion para eliminar una apuesta
	 */
	public void DeleteBet(String s) {

		for (int x = 0; x < loteriaDAO.getLoteryBetList().size(); x++) {
			if (s.equals("Apuesta en loteria de valor " + loteriaDAO.getLoteryBetList().get(x).getBetPlaced())
					&& loteriaDAO.getLoteryBetList().get(x).getHeadQuarterName()
							.equals(selVenDelBetOwn.getComboVenue().getSelectedItem().toString())) {
				loteriaDAO.delete(x);
				JOptionPane.showMessageDialog(loteriaWin, "ELIMINADO CON EXITO");
			}
		}
		for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {
			if (s.equals("Apuesta en baloto de valor " + balotoDAO.getBallotList().get(i).getBetPlaced())
					&& balotoDAO.getBallotList().get(i).getHeadQuarterName()
							.equals(selVenDelBetOwn.getComboVenue().getSelectedItem().toString())) {
				balotoDAO.delete(i);
				JOptionPane.showMessageDialog(balotoWin, "ELIMINADO CON EXITO");
			}
		}
		for (int j = 0; j < superAstroDAO.getSuperAstroList().size(); j++) {
			if (s.equals("Apuesta en super astro de valor " + superAstroDAO.getSuperAstroList().get(j).getBetPlaced())
					&& superAstroDAO.getSuperAstroList().get(j).getHeadQuarterName()
							.equals(selVenDelBetOwn.getComboVenue().getSelectedItem().toString())) {
				superAstroDAO.delete(j);
				JOptionPane.showMessageDialog(superastroWin, "ELIMINADO CON EXITO");
			}
		}
		for (int k = 0; k < chanceDAO.getChanceList().size(); k++) {
			if (s.equals("Apuesta en chance de valor " + chanceDAO.getChanceList().get(k).getBetPlaced())
					&& chanceDAO.getChanceList().get(k).getHeadQuarterName()
							.equals(selVenDelBetOwn.getComboVenue().getSelectedItem().toString())) {
				chanceDAO.delete(k);
				JOptionPane.showMessageDialog(chanceWin, "ELIMINADO CON EXITO");
			}
		}
		for (int l = 0; l < betPlayDAO.getBetPlayList().size(); l++) {
			if (s.equals("Apuesta en bet play de valor " + betPlayDAO.getBetPlayList().get(l).getBetPlaced())
					&& betPlayDAO.getBetPlayList().get(l).getHeadQuarterName()
							.equals(selVenDelBetOwn.getComboVenue().getSelectedItem().toString())) {
				betPlayDAO.delete(l);
				JOptionPane.showMessageDialog(betplayWin, "ELIMINADO CON EXITO");
			}
		}
	}

	/**
	 * Funcion para realizar una apuesta de BetPlay
	 */
	public void makeBetPlayBetOwn() {
		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

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

			betPlayDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, match1,
					match2, match3, match4, match5, match6, match7, match8, match9, match10, match11, match12, match13,
					match14);

			JOptionPane.showMessageDialog(betplayWin, "HAS REALIZADO LA APUESTA CON EXITO");

			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betManOwn.setVisible(true);
			receiptWindow.setVisible(true);
			betplayWin.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de BetPlay
	 */
	public void makeBetPlayBetMan() {
		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = betPlayMan.getBetAmount().getText();

		String headQuarterName = managerMenuWin.getNameVenue().getText();

		String document = selGambCreateBetMan.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "DEPORTIVO";

		String match1 = betPlayMan.getMatch1().getValue().toString();
		String match2 = betPlayMan.getMatch2().getValue().toString();
		String match3 = betPlayMan.getMatch3().getValue().toString();
		String match4 = betPlayMan.getMatch4().getValue().toString();
		String match5 = betPlayMan.getMatch5().getValue().toString();
		String match6 = betPlayMan.getMatch6().getValue().toString();
		String match7 = betPlayMan.getMatch7().getValue().toString();
		String match8 = betPlayMan.getMatch8().getValue().toString();
		String match9 = betPlayMan.getMatch9().getValue().toString();
		String match10 = betPlayMan.getMatch10().getValue().toString();
		String match11 = betPlayMan.getMatch11().getValue().toString();
		String match12 = betPlayMan.getMatch12().getValue().toString();
		String match13 = betPlayMan.getMatch13().getValue().toString();
		String match14 = betPlayMan.getMatch14().getValue().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {

			betPlayDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, match1,
					match2, match3, match4, match5, match6, match7, match8, match9, match10, match11, match12, match13,
					match14);

			JOptionPane.showMessageDialog(betPlayMan, "HAS REALIZADO LA APUESTA CON EXITO");

			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betMenuManager.setVisible(true);
			receiptWindow.setVisible(true);
			betPlayMan.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una apuesta de BetPlay
	 */
	public void makeBetPlayBetCashier() {

		String headQuarterName = "";

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (exit.equals(venueDAO.getHeadquarterList().get(i).getId())) {

				headQuarterName = venueDAO.getHeadquarterList().get(i).getVenueName();

			}

		}
		LocalDateTime actualDate = LocalDateTime.now();

		String day = String.valueOf(actualDate.getDayOfMonth());
		String month = String.valueOf(actualDate.getMonthValue());
		String year = String.valueOf(actualDate.getYear());

		String hour = String.valueOf(actualDate.getHour());
		String minute = String.valueOf(actualDate.getMinute());
		String second = String.valueOf(actualDate.getSecond());

		String dateAndTime = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second;

		String betPlaced = betPlayCashier.getBetAmount().getText();

		String document = selGambCreateBetCashier.getComboGambler().getSelectedItem().toString();

		String name = searchNameByDocument(document);

		String typeBet = "DEPORTIVO";

		String match1 = betPlayCashier.getMatch1().getValue().toString();
		String match2 = betPlayCashier.getMatch2().getValue().toString();
		String match3 = betPlayCashier.getMatch3().getValue().toString();
		String match4 = betPlayCashier.getMatch4().getValue().toString();
		String match5 = betPlayCashier.getMatch5().getValue().toString();
		String match6 = betPlayCashier.getMatch6().getValue().toString();
		String match7 = betPlayCashier.getMatch7().getValue().toString();
		String match8 = betPlayCashier.getMatch8().getValue().toString();
		String match9 = betPlayCashier.getMatch9().getValue().toString();
		String match10 = betPlayCashier.getMatch10().getValue().toString();
		String match11 = betPlayCashier.getMatch11().getValue().toString();
		String match12 = betPlayCashier.getMatch12().getValue().toString();
		String match13 = betPlayCashier.getMatch13().getValue().toString();
		String match14 = betPlayCashier.getMatch14().getValue().toString();

		int response = JOptionPane.showOptionDialog(logWind, "¿ESTA SEGURO DE LOS DATOS?", "CONFIRMATION",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "SI", "NO" }, "SI");

		boolean confirmation = false;

		if (JOptionPane.NO_OPTION == response) {
			confirmation = false;
		} else if (JOptionPane.OK_OPTION == response) {
			confirmation = true;
		}
		if (confirmation) {

			betPlayDAO.create(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, match1,
					match2, match3, match4, match5, match6, match7, match8, match9, match10, match11, match12, match13,
					match14);

			JOptionPane.showMessageDialog(betPlayCashier, "HAS REALIZADO LA APUESTA CON EXITO");

			receiptDAO.create(dateAndTime, name, document, headQuarterName, typeBet);
			receiptWindow.getDate().setText(dateAndTime);
			receiptWindow.getFullName().setText(name);
			receiptWindow.getDocument().setText(document);
			receiptWindow.getVenueBet().setText(headQuarterName);
			receiptWindow.getTypeBet().setText(typeBet);

			betMenuCashier.setVisible(true);
			receiptWindow.setVisible(true);
			betPlayCashier.setVisible(false);

		} else {

		}

	}

	/**
	 * Funcion para realizar una busqueda de nombre a partir del documento
	 */
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

	/**
	 * Funcion para setear los datos de sede
	 */

	public void setDataVenueManager() {
		String nameCheck = managerMenuWin.getNameVenue().getText();

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (nameCheck.equals(venueDAO.getHeadquarterList().get(i).getVenueName())) {

				manageVenueManager.getComboLocation().addItem(venueDAO.getHeadquarterList().get(i).getLocationVenue());
				manageVenueManager.getVenueName().setText(venueDAO.getHeadquarterList().get(i).getVenueName());
				manageVenueManager.getNumEmployes().setValue(venueDAO.getHeadquarterList().get(i).getEmployeesNumber());
			}
		}
	}

	/**
	 * Funcion para actualizar los datos de sede
	 */
	public void saveDataVenueManager() {

		int index = 0;
		String id = "";

		String newName = "";
		String newLocation = "";
		String newNumEmployes = "";

		String nameCheck = managerMenuWin.getNameVenue().getText();

		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			if (nameCheck.equals(venueDAO.getHeadquarterList().get(i).getVenueName())) {

				index = i;
				newLocation = venueDAO.getHeadquarterList().get(i).getLocationVenue();
				id = venueDAO.getHeadquarterList().get(i).getId();

			}

		}

		newName = manageVenueManager.getVenueName().getText();
		newNumEmployes = manageVenueManager.getNumEmployes().getValue().toString();

		managerMenuWin.getNameVenue().setText(newName);

		venueDAO.updateByIndex(index, newName, newLocation, newNumEmployes, id);
		JOptionPane.showMessageDialog(manageVenueManager, "ACTUALIZADO CON EXITO");

	}

	/**
	 * Funcion que muestra la tabla de sedes
	 * 
	 * @author Santiago Rueda
	 * 
	 */
	public void showTableVenue() {
		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {

			String name = venueDAO.getHeadquarterList().get(i).getVenueName();
			String location = venueDAO.getHeadquarterList().get(i).getLocationVenue();
			int num = venueDAO.getHeadquarterList().get(i).getEmployeesNumber();

			Object[] data = { name, location, num };
			showVenueOwn.getTablePanel().getModel().addRow(data);

		}

	}

	/**
	 * Funcion que actualiza la tabla de sedes
	 * 
	 * @author Santiago Rueda
	 *
	 */
	public void updateTableVenue() {
		for (int i = venueDAO.getHeadquarterList().size() - 1; i >= 0; i--) {

			showVenueOwn.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion que muestra la tabla de apostadores
	 * 
	 * @author Santiago Rueda
	 */
	public void showTableGambler() {
		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			String name = gamDAO.getGamblerList().get(i).getFullName();
			long documento = gamDAO.getGamblerList().get(i).getDocumentId();
			String sede = gamDAO.getGamblerList().get(i).getGamingVenue();
			String direccion = gamDAO.getGamblerList().get(i).getAddres();
			long num = gamDAO.getGamblerList().get(i).getPhoneNumber();

			Object[] data = { name, documento, sede, direccion, num };
			showGamOwn.getTablePanel().getModel().addRow(data);

		}

	}

	/**
	 * Funcion que actualiza la tabla de apostadores
	 * 
	 * @author Santiago Rueda
	 */
	public void updateTableGambler() {
		for (int i = gamDAO.getGamblerList().size() - 1; i >= 0; i--) {

			showGamOwn.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion que muestra la tabla de apuestas
	 * 
	 * @author Santiago Rueda
	 */
	public void showTableBet() {
		for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {

			int dia = loteriaDAO.getLoteryBetList().get(i).getDay();
			int mes = loteriaDAO.getLoteryBetList().get(i).getMonth();
			int ano = loteriaDAO.getLoteryBetList().get(i).getYear();
			double valorapostado = loteriaDAO.getLoteryBetList().get(i).getBetPlaced();
			String sede = loteriaDAO.getLoteryBetList().get(i).getHeadQuarterName();
			long documento = loteriaDAO.getLoteryBetList().get(i).getDocument();
			String juego = "Loteria";

			Object[] data = { dia, mes, ano, valorapostado, sede, documento, juego };
			showBetOwn.getTablePanel().getModel().addRow(data);

		}
		for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {

			int dia = loteriaDAO.getLoteryBetList().get(i).getDay();
			int mes = loteriaDAO.getLoteryBetList().get(i).getMonth();
			int ano = loteriaDAO.getLoteryBetList().get(i).getYear();
			double valorapostado = loteriaDAO.getLoteryBetList().get(i).getBetPlaced();
			String sede = loteriaDAO.getLoteryBetList().get(i).getHeadQuarterName();
			long documento = loteriaDAO.getLoteryBetList().get(i).getDocument();
			String juego = "Baloto";

			Object[] data = { dia, mes, ano, valorapostado, sede, documento, juego };
			showBetOwn.getTablePanel().getModel().addRow(data);

		}
		for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {

			int dia = superAstroDAO.getSuperAstroList().get(i).getDay();
			int mes = superAstroDAO.getSuperAstroList().get(i).getMonth();
			int ano = superAstroDAO.getSuperAstroList().get(i).getYear();
			double valorapostado = superAstroDAO.getSuperAstroList().get(i).getBetPlaced();
			String sede = superAstroDAO.getSuperAstroList().get(i).getHeadQuarterName();
			long documento = superAstroDAO.getSuperAstroList().get(i).getDocument();
			String juego = "Super astro";

			Object[] data = { dia, mes, ano, valorapostado, sede, documento, juego };
			showBetOwn.getTablePanel().getModel().addRow(data);

		}
		for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {

			int dia = chanceDAO.getChanceList().get(i).getDay();
			int mes = chanceDAO.getChanceList().get(i).getMonth();
			int ano = chanceDAO.getChanceList().get(i).getYear();
			double valorapostado = chanceDAO.getChanceList().get(i).getBetPlaced();
			String sede = chanceDAO.getChanceList().get(i).getHeadQuarterName();
			long documento = chanceDAO.getChanceList().get(i).getDocument();
			String juego = "Chance";

			Object[] data = { dia, mes, ano, valorapostado, sede, documento, juego };
			showBetOwn.getTablePanel().getModel().addRow(data);

		}
		for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {

			int dia = betPlayDAO.getBetPlayList().get(i).getDay();
			int mes = betPlayDAO.getBetPlayList().get(i).getMonth();
			int ano = betPlayDAO.getBetPlayList().get(i).getYear();
			double valorapostado = betPlayDAO.getBetPlayList().get(i).getBetPlaced();
			String sede = betPlayDAO.getBetPlayList().get(i).getHeadQuarterName();
			long documento = betPlayDAO.getBetPlayList().get(i).getDocument();
			String juego = "Bet play";

			Object[] data = { dia, mes, ano, valorapostado, sede, documento, juego };
			showBetOwn.getTablePanel().getModel().addRow(data);

		}

	}

	/**
	 * Funcion que actualiza la tabla de apuestas
	 * 
	 * @author Santiago Rueda
	 */
	public void updateTableBet() {
		for (int i = loteriaDAO.getLoteryBetList().size() + balotoDAO.getBallotList().size()
				+ superAstroDAO.getSuperAstroList().size() + chanceDAO.getChanceList().size()
				+ betPlayDAO.getBetPlayList().size() - 1; i >= 0; i--) {

			showBetOwn.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion para actualizar ComboBox del modulo 5
	 */
	public void updateBoxModule5() {
		if (!venueDAO.getHeadquarterList().isEmpty()) {
			consultwin.getComboVenue().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				consultwin.getComboVenue().addItem(venueDAO.getHeadquarterList().get(i).getVenueName());
			}
		}
	}

	/**
	 * Funcion para mostrar tabla de consultas
	 */
	public void showTableConsult(String s) {
		for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {
			if (s.equals(loteriaDAO.getLoteryBetList().get(i).getHeadQuarterName())) {

				long documento = loteriaDAO.getLoteryBetList().get(i).getDocument();
				double valor = loteriaDAO.getLoteryBetList().get(i).getBetPlaced();
				String juego = "Loteria";

				Object[] data = { documento, juego, juego, valor };
				showCon.getTablePanel().getModel().addRow(data);
			}
		}
		for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {

			if (s.equals(balotoDAO.getBallotList().get(i).getHeadQuarterName())) {

				long documento = balotoDAO.getBallotList().get(i).getDocument();
				double valor = balotoDAO.getBallotList().get(i).getBetPlaced();
				String juego = "Baloto";

				Object[] data = { documento, juego, "Loteria", valor };
				showCon.getTablePanel().getModel().addRow(data);
			}

		}
		for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {

			if (s.equals(superAstroDAO.getSuperAstroList().get(i).getHeadQuarterName())) {

				long documento = superAstroDAO.getSuperAstroList().get(i).getDocument();
				double valor = superAstroDAO.getSuperAstroList().get(i).getBetPlaced();
				String juego = "Super astro";

				Object[] data = { documento, juego, "Loteria", valor };
				showCon.getTablePanel().getModel().addRow(data);
			}

		}
		for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {

			if (s.equals(chanceDAO.getChanceList().get(i).getHeadQuarterName())) {

				long documento = chanceDAO.getChanceList().get(i).getDocument();
				double valor = chanceDAO.getChanceList().get(i).getBetPlaced();
				String juego = "Chance";

				Object[] data = { documento, juego, "Chance", valor };
				showCon.getTablePanel().getModel().addRow(data);
			}

		}
		for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {

			if (s.equals(betPlayDAO.getBetPlayList().get(i).getHeadQuarterName())) {

				long documento = betPlayDAO.getBetPlayList().get(i).getDocument();
				double valor = betPlayDAO.getBetPlayList().get(i).getBetPlaced();
				String juego = "Bet play";

				Object[] data = { documento, juego, "Deportivo", valor };
				showCon.getTablePanel().getModel().addRow(data);
			}

		}

	}

	/**
	 * Funcion para actualizar ComboBox de la tabla dentro de las consultas
	 */
	public void updateTableConsult() {
		int aux = showCon.getTablePanel().getModel().getRowCount();
		for (int i = aux - 1; i >= 0; i--) {

			showCon.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion para sumar todas las apuestas
	 */
	public String sumAllTheBets(String s) {

		double sum = 0;

		for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {
			if (s.equals(loteriaDAO.getLoteryBetList().get(i).getHeadQuarterName())) {

				double valor = loteriaDAO.getLoteryBetList().get(i).getBetPlaced();

				sum = valor + sum;
			}
		}
		for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {

			if (s.equals(balotoDAO.getBallotList().get(i).getHeadQuarterName())) {

				double valor = balotoDAO.getBallotList().get(i).getBetPlaced();
				sum = valor + sum;
			}

		}
		for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {

			if (s.equals(superAstroDAO.getSuperAstroList().get(i).getHeadQuarterName())) {

				double valor = superAstroDAO.getSuperAstroList().get(i).getBetPlaced();
				sum = valor + sum;
			}

		}
		for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {

			if (s.equals(chanceDAO.getChanceList().get(i).getHeadQuarterName())) {

				double valor = chanceDAO.getChanceList().get(i).getBetPlaced();
				sum = valor + sum;
			}

		}
		for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {

			if (s.equals(betPlayDAO.getBetPlayList().get(i).getHeadQuarterName())) {

				double valor = betPlayDAO.getBetPlayList().get(i).getBetPlaced();

				sum = valor + sum;
			}

		}

		String totalSum = Double.toString(sum);
		return totalSum;

	}

	/**
	 * Funcion para actualizar ComboBox de apostadores en la ventana de consultas
	 */
	public void updateBoxGamblerConsult(String s) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			showCon.getComboGambler().removeAllItems();
			for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {
				if (s.equals(gamDAO.getGamblerList().get(i).getGamingVenue()))
					showCon.getComboGambler().addItem(gamDAO.getGamblerList().get(i).getDocumentId());
			}
		}
	}

	/**
	 * Funcion para sumar todas las apuestas realizadas por un apostador
	 */

	public String sumAllTheBetsGambler(long l) {

		double sum = 0;

		for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {
			if (l == loteriaDAO.getLoteryBetList().get(i).getDocument()) {

				double valor = loteriaDAO.getLoteryBetList().get(i).getBetPlaced();

				sum = valor + sum;
			}
		}
		for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {

			if (l == balotoDAO.getBallotList().get(i).getDocument()) {

				double valor = balotoDAO.getBallotList().get(i).getBetPlaced();
				sum = valor + sum;
			}

		}
		for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {

			if (l == superAstroDAO.getSuperAstroList().get(i).getDocument()) {

				double valor = superAstroDAO.getSuperAstroList().get(i).getBetPlaced();
				sum = valor + sum;
			}

		}
		for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {

			if (l == chanceDAO.getChanceList().get(i).getDocument()) {

				double valor = chanceDAO.getChanceList().get(i).getBetPlaced();
				sum = valor + sum;
			}

		}
		for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {

			if (l == betPlayDAO.getBetPlayList().get(i).getDocument()) {

				double valor = betPlayDAO.getBetPlayList().get(i).getBetPlaced();

				sum = valor + sum;
			}

		}

		String totalSum = Double.toString(sum);
		return totalSum;

	}

	/**
	 * Funcion para actualizar ComboBox seleccion apostador
	 */
	public void updateBoxSelectGamblerManager(String s) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGambUpdateManager.getComboGambler().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
					for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
						if (venueDAO.getHeadquarterList().get(i).getVenueName()
								.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
							selGambUpdateManager.getComboGambler()
									.addItem(gamDAO.getGamblerList().get(j).getDocumentId());
						}
					}
				}
			}
		}
	}

	/**
	 * Funcion para actualizar ComboBox seleccion apostador
	 */
	public void updateBoxSelectGamblerCashier(String s) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGambUpdateCashier.getComboGambler().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
					for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
						if (venueDAO.getHeadquarterList().get(i).getVenueName()
								.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
							selGambUpdateCashier.getComboGambler()
									.addItem(gamDAO.getGamblerList().get(j).getDocumentId());
						}
					}
				}
			}
		}
	}

	/**
	 * Funcion para setear datos de apostador al actualizar
	 */
	public void setDataToUpdateGamblerManager() {

		long docToCheck = Long.parseLong(selGambUpdateManager.getComboGambler().getSelectedItem().toString());

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			if (docToCheck == gamDAO.getGamblerList().get(i).getDocumentId()) {

				updateGambManager.getCompleteName().setText(gamDAO.getGamblerList().get(i).getFullName());
				updateGambManager.getDocument().setText(String.valueOf(gamDAO.getGamblerList().get(i).getDocumentId()));
				updateGambManager.getAdress().setText(gamDAO.getGamblerList().get(i).getAddres());
				updateGambManager.getPhoneNumber()
						.setText(String.valueOf(gamDAO.getGamblerList().get(i).getPhoneNumber()));
				updateGambManager.getComboLocation().addItem(gamDAO.getGamblerList().get(i).getGamingVenue());

			}

		}

	}

	/**
	 * Funcion para setear datos de apostador al actualizar
	 */
	public void setDataToUpdateGamblerCashier() {

		long docToCheck = Long.parseLong(selGambUpdateCashier.getComboGambler().getSelectedItem().toString());

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			if (docToCheck == gamDAO.getGamblerList().get(i).getDocumentId()) {

				updateGamblerCashier.getCompleteName().setText(gamDAO.getGamblerList().get(i).getFullName());
				updateGamblerCashier.getDocument()
						.setText(String.valueOf(gamDAO.getGamblerList().get(i).getDocumentId()));
				updateGamblerCashier.getAdress().setText(gamDAO.getGamblerList().get(i).getAddres());
				updateGamblerCashier.getPhoneNumber()
						.setText(String.valueOf(gamDAO.getGamblerList().get(i).getPhoneNumber()));
				updateGamblerCashier.getComboLocation().addItem(gamDAO.getGamblerList().get(i).getGamingVenue());

			}

		}

	}

	/**
	 * Funcion para actualizar ComboBox de seleccion apostador a eliminar
	 */
	public void updateBoxSelectGamblerManagerToDelete(String s) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGambDeleteManager.getComboGambler().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
					for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
						if (venueDAO.getHeadquarterList().get(i).getVenueName()
								.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
							selGambDeleteManager.getComboGambler()
									.addItem(gamDAO.getGamblerList().get(j).getDocumentId());
						}
					}
				}
			}
		}
	}

	/**
	 * Funcion para actualizar ComboBox de seleccion apostador que hizo una apuesta
	 * a eliminar
	 */
	public void updateBoxSelectGamblerManagerForBet(String s) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGambCreateBetMan.getComboGambler().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
					for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
						if (venueDAO.getHeadquarterList().get(i).getVenueName()
								.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
							selGambCreateBetMan.getComboGambler()
									.addItem(gamDAO.getGamblerList().get(j).getDocumentId());
						}
					}
				}
			}
		}
	}

	/**
	 * Funcion para actualizar ComboBox de seleccion apostador que hizo una apuesta
	 * a eliminar
	 */
	public void updateBoxSelectGamblerCashierForBet(String s) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGambCreateBetCashier.getComboGambler().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
					for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
						if (venueDAO.getHeadquarterList().get(i).getVenueName()
								.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
							selGambCreateBetCashier.getComboGambler()
									.addItem(gamDAO.getGamblerList().get(j).getDocumentId());
						}
					}
				}
			}
		}
	}

	/**
	 * Funcion mostrar tabla de apostadores en la ventana de jefe de sede
	 */
	public void showTableGamblerManager(String s) {
		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
			if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
				for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
					if (venueDAO.getHeadquarterList().get(i).getVenueName()
							.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
						String name = gamDAO.getGamblerList().get(j).getFullName();
						Long id = gamDAO.getGamblerList().get(j).getDocumentId();
						String addres = gamDAO.getGamblerList().get(j).getAddres();
						Long phone = gamDAO.getGamblerList().get(j).getPhoneNumber();
						Object[] data = { name, id, addres, phone };
						showGamMan.getTablePanel().getModel().addRow(data);

					}

				}
			}
		}
	}

	/**
	 * Funcion para actualizar tabla de apostadores
	 */

	public void updateTableGamblerManager() {
		int aux = showGamMan.getTablePanel().getModel().getRowCount();
		for (int i = aux - 1; i >= 0; i--) {

			showGamMan.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion para mostrar tabla de apuestas
	 */
	public void showTableBetManager(String s) {
		for (int j = 0; j < venueDAO.getHeadquarterList().size(); j++) {
			if (s.equals(venueDAO.getHeadquarterList().get(j).getId())) {
				for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {
					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(loteriaDAO.getLoteryBetList().get(i).getHeadQuarterName())) {
						int dia = loteriaDAO.getLoteryBetList().get(i).getDay();
						int mes = loteriaDAO.getLoteryBetList().get(i).getMonth();
						int ano = loteriaDAO.getLoteryBetList().get(i).getYear();
						double valorapostado = loteriaDAO.getLoteryBetList().get(i).getBetPlaced();
						long documento = loteriaDAO.getLoteryBetList().get(i).getDocument();
						String juego = "Loteria";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetManag.getTablePanel().getModel().addRow(data);
					}
				}
				for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {

					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(balotoDAO.getBallotList().get(i).getHeadQuarterName())) {
						int dia = balotoDAO.getBallotList().get(i).getDay();
						int mes = balotoDAO.getBallotList().get(i).getMonth();
						int ano = balotoDAO.getBallotList().get(i).getYear();
						double valorapostado = balotoDAO.getBallotList().get(i).getBetPlaced();
						long documento = balotoDAO.getBallotList().get(i).getDocument();
						String juego = "Baloto";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetManag.getTablePanel().getModel().addRow(data);
					}

				}
				for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {

					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(superAstroDAO.getSuperAstroList().get(i).getHeadQuarterName())) {
						int dia = superAstroDAO.getSuperAstroList().get(i).getDay();
						int mes = superAstroDAO.getSuperAstroList().get(i).getMonth();
						int ano = superAstroDAO.getSuperAstroList().get(i).getYear();
						double valorapostado = superAstroDAO.getSuperAstroList().get(i).getBetPlaced();
						long documento = superAstroDAO.getSuperAstroList().get(i).getDocument();
						String juego = "Super astro";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetManag.getTablePanel().getModel().addRow(data);
					}

				}
				for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {

					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(chanceDAO.getChanceList().get(i).getHeadQuarterName())) {
						int dia = chanceDAO.getChanceList().get(i).getDay();
						int mes = chanceDAO.getChanceList().get(i).getMonth();
						int ano = chanceDAO.getChanceList().get(i).getYear();
						double valorapostado = chanceDAO.getChanceList().get(i).getBetPlaced();
						long documento = chanceDAO.getChanceList().get(i).getDocument();
						String juego = "Chance";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetManag.getTablePanel().getModel().addRow(data);
					}
				}
				for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {

					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(betPlayDAO.getBetPlayList().get(i).getHeadQuarterName())) {
						int dia = betPlayDAO.getBetPlayList().get(i).getDay();
						int mes = betPlayDAO.getBetPlayList().get(i).getMonth();
						int ano = betPlayDAO.getBetPlayList().get(i).getYear();
						double valorapostado = betPlayDAO.getBetPlayList().get(i).getBetPlaced();
						long documento = betPlayDAO.getBetPlayList().get(i).getDocument();
						String juego = "Bet Play";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetManag.getTablePanel().getModel().addRow(data);
					}

				}

			}

		}

	}

	/**
	 * Funcion para actualizar tabla de apuestas
	 */
	public void updateTableBetManager() {
		int aux = showBetManag.getTablePanel().getModel().getRowCount();
		for (int i = aux - 1; i >= 0; i--) {
			showBetManag.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion para eliminar una apuesta
	 */

	public void DeleteBetManager(String s) {

		String s2 = "";
		for (int u = 0; u < venueDAO.getHeadquarterList().size(); u++) {
			if (exit.equals(venueDAO.getHeadquarterList().get(u).getId())) {
				s2 = venueDAO.getHeadquarterList().get(u).getVenueName();
			}
		}

		for (int x = 0; x < loteriaDAO.getLoteryBetList().size(); x++) {
			if (s.equals("Apuesta en loteria de valor " + loteriaDAO.getLoteryBetList().get(x).getBetPlaced())
					&& loteriaDAO.getLoteryBetList().get(x).getHeadQuarterName().equals(s2)) {
				loteriaDAO.delete(x);
				JOptionPane.showMessageDialog(loteriaWin, "ELIMINADO CON EXITO");
			}
		}
		for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {
			if (s.equals("Apuesta en baloto de valor " + balotoDAO.getBallotList().get(i).getBetPlaced())
					&& balotoDAO.getBallotList().get(i).getHeadQuarterName().equals(s2)) {
				balotoDAO.delete(i);
				JOptionPane.showMessageDialog(balotoWin, "ELIMINADO CON EXITO");
			}
		}
		for (int j = 0; j < superAstroDAO.getSuperAstroList().size(); j++) {
			if (s.equals("Apuesta en super astro de valor " + superAstroDAO.getSuperAstroList().get(j).getBetPlaced())
					&& superAstroDAO.getSuperAstroList().get(j).getHeadQuarterName().equals(s2)) {
				superAstroDAO.delete(j);
				JOptionPane.showMessageDialog(superastroWin, "ELIMINADO CON EXITO");
			}
		}
		for (int k = 0; k < chanceDAO.getChanceList().size(); k++) {
			if (s.equals("Apuesta en chance de valor " + chanceDAO.getChanceList().get(k).getBetPlaced())
					&& chanceDAO.getChanceList().get(k).getHeadQuarterName().equals(s2)) {
				chanceDAO.delete(k);
				JOptionPane.showMessageDialog(chanceWin, "ELIMINADO CON EXITO");
			}
		}
		for (int l = 0; l < betPlayDAO.getBetPlayList().size(); l++) {
			if (s.equals("Apuesta en bet play de valor " + betPlayDAO.getBetPlayList().get(l).getBetPlaced())
					&& betPlayDAO.getBetPlayList().get(l).getHeadQuarterName().equals(s2)) {
				betPlayDAO.delete(l);
				JOptionPane.showMessageDialog(betplayWin, "ELIMINADO CON EXITO");
			}
		}

	}

	/**
	 * Funcion para actualizar ComboBox de seleccion apostador que hizo apuesta que
	 * sera eliminada
	 */
	public void updateBoxSelectGamblerManagerForDeleteBet() {
		String s = "";
		for (int x = 0; x < venueDAO.getHeadquarterList().size(); x++) {
			if (exit.equals(venueDAO.getHeadquarterList().get(x).getId())) {
				s = venueDAO.getHeadquarterList().get(x).getId();
			}
		}
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGamDeleteBet.getComboGambler().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
					for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
						if (venueDAO.getHeadquarterList().get(i).getVenueName()
								.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
							selGamDeleteBet.getComboGambler().addItem(gamDAO.getGamblerList().get(j).getDocumentId());
						}
					}
				}
			}
		}
	}

	/**
	 * Funcion para actualizar ComboBox de apuesta a eliminar
	 */
	public void updateSelectBetDeleteBetManager(long data) {
		if (!loteriaDAO.getLoteryBetList().isEmpty() || !balotoDAO.getBallotList().isEmpty()
				|| !superAstroDAO.getSuperAstroList().isEmpty() || !chanceDAO.getChanceList().isEmpty()
				|| !betPlayDAO.getBetPlayList().isEmpty()) {
			selBetDeleteManager.getComboGambler().removeAllItems();
			for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {
				if (data == (loteriaDAO.getLoteryBetList().get(i).getDocument())) {
					selBetDeleteManager.getComboGambler().addItem(
							"Apuesta en loteria de valor " + loteriaDAO.getLoteryBetList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {
				if (data == (balotoDAO.getBallotList().get(i).getDocument())) {
					selBetDeleteManager.getComboGambler()
							.addItem("Apuesta en baloto de valor " + balotoDAO.getBallotList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {
				if (data == (superAstroDAO.getSuperAstroList().get(i).getDocument())) {
					selBetDeleteManager.getComboGambler().addItem("Apuesta en super astro de valor "
							+ superAstroDAO.getSuperAstroList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {
				if (data == (chanceDAO.getChanceList().get(i).getDocument())) {
					selBetDeleteManager.getComboGambler()
							.addItem("Apuesta en chance de valor " + chanceDAO.getChanceList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {
				if (data == (betPlayDAO.getBetPlayList().get(i).getDocument())) {
					selBetDeleteManager.getComboGambler().addItem(
							"Apuesta en bet play de valor " + betPlayDAO.getBetPlayList().get(i).getBetPlaced());
				}
			}

		}
	}

	/**
	 * Funcion para mostrar tabla de apostadores en ventana de cajero
	 */
	public void showTableGamblerCashier(String s) {
		for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
			if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
				for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
					if (venueDAO.getHeadquarterList().get(i).getVenueName()
							.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
						String name = gamDAO.getGamblerList().get(j).getFullName();
						Long id = gamDAO.getGamblerList().get(j).getDocumentId();
						String addres = gamDAO.getGamblerList().get(j).getAddres();
						Long phone = gamDAO.getGamblerList().get(j).getPhoneNumber();
						Object[] data = { name, id, addres, phone };
						showGamCashi.getTablePanel().getModel().addRow(data);

					}

				}
			}
		}
	}

	/**
	 * Funcion para actualizar tabla de apostadores
	 */

	public void updateTableGamblerCashier() {
		int aux = showGamCashi.getTablePanel().getModel().getRowCount();
		for (int i = aux - 1; i >= 0; i--) {

			showGamCashi.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion para actualizar ComboBox de apostadores que hicieron una apuesta que
	 * sera eliminada
	 */
	public void updateBoxSelectGamblerCashierToDelete(String s) {
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGamToDelCashi.getComboGambler().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
					for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
						if (venueDAO.getHeadquarterList().get(i).getVenueName()
								.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
							selGamToDelCashi.getComboGambler().addItem(gamDAO.getGamblerList().get(j).getDocumentId());
						}
					}
				}
			}
		}
	}

	/**
	 * Funcion para elimnar apostador
	 */

	public void deleteGamblerCashier() {

		int index = 0;

		for (int i = 0; i < gamDAO.getGamblerList().size(); i++) {

			long aux = Long.parseLong(selGamToDelCashi.getComboGambler().getSelectedItem().toString());

			if (aux == gamDAO.getGamblerList().get(i).getDocumentId()) {
				index = i;
			}

		}

		gamDAO.delete(index);
		JOptionPane.showMessageDialog(selGamToDelCashi, "ELIMINADO CON EXITO");
		gambManagCashier.setVisible(true);
		selGamToDelCashi.setVisible(false);

	}

	/**
	 * Funcion para mostrar tabla de apuestas en la ventana de cajero
	 */

	public void showTableBetCashier(String s) {
		for (int j = 0; j < venueDAO.getHeadquarterList().size(); j++) {
			if (s.equals(venueDAO.getHeadquarterList().get(j).getId())) {
				for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {
					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(loteriaDAO.getLoteryBetList().get(i).getHeadQuarterName())) {
						int dia = loteriaDAO.getLoteryBetList().get(i).getDay();
						int mes = loteriaDAO.getLoteryBetList().get(i).getMonth();
						int ano = loteriaDAO.getLoteryBetList().get(i).getYear();
						double valorapostado = loteriaDAO.getLoteryBetList().get(i).getBetPlaced();
						long documento = loteriaDAO.getLoteryBetList().get(i).getDocument();
						String juego = "Loteria";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetCashier.getTablePanel().getModel().addRow(data);
					}
				}
				for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {

					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(balotoDAO.getBallotList().get(i).getHeadQuarterName())) {
						int dia = balotoDAO.getBallotList().get(i).getDay();
						int mes = balotoDAO.getBallotList().get(i).getMonth();
						int ano = balotoDAO.getBallotList().get(i).getYear();
						double valorapostado = balotoDAO.getBallotList().get(i).getBetPlaced();
						long documento = balotoDAO.getBallotList().get(i).getDocument();
						String juego = "Baloto";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetCashier.getTablePanel().getModel().addRow(data);
					}

				}
				for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {

					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(superAstroDAO.getSuperAstroList().get(i).getHeadQuarterName())) {
						int dia = superAstroDAO.getSuperAstroList().get(i).getDay();
						int mes = superAstroDAO.getSuperAstroList().get(i).getMonth();
						int ano = superAstroDAO.getSuperAstroList().get(i).getYear();
						double valorapostado = superAstroDAO.getSuperAstroList().get(i).getBetPlaced();
						long documento = superAstroDAO.getSuperAstroList().get(i).getDocument();
						String juego = "Super astro";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetCashier.getTablePanel().getModel().addRow(data);
					}

				}
				for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {

					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(chanceDAO.getChanceList().get(i).getHeadQuarterName())) {
						int dia = chanceDAO.getChanceList().get(i).getDay();
						int mes = chanceDAO.getChanceList().get(i).getMonth();
						int ano = chanceDAO.getChanceList().get(i).getYear();
						double valorapostado = chanceDAO.getChanceList().get(i).getBetPlaced();
						long documento = chanceDAO.getChanceList().get(i).getDocument();
						String juego = "Chance";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetCashier.getTablePanel().getModel().addRow(data);
					}
				}
				for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {

					if (venueDAO.getHeadquarterList().get(j).getVenueName()
							.equals(betPlayDAO.getBetPlayList().get(i).getHeadQuarterName())) {
						int dia = betPlayDAO.getBetPlayList().get(i).getDay();
						int mes = betPlayDAO.getBetPlayList().get(i).getMonth();
						int ano = betPlayDAO.getBetPlayList().get(i).getYear();
						double valorapostado = betPlayDAO.getBetPlayList().get(i).getBetPlaced();
						long documento = betPlayDAO.getBetPlayList().get(i).getDocument();
						String juego = "Bet Play";

						Object[] data = { dia, mes, ano, valorapostado, documento, juego };

						showBetCashier.getTablePanel().getModel().addRow(data);
					}

				}

			}

		}

	}

	/**
	 * Funcion para actualizar tabla de apuestas en cajero
	 */

	public void updateTableBetCashier() {
		int aux = showBetManag.getTablePanel().getModel().getRowCount();
		for (int i = aux - 1; i >= 0; i--) {
			showBetCashier.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion para actualizar ComboBox de seleccion apostadores que hizo apuesta
	 * para eliminar
	 */

	public void updateBoxSelectGamblerCashierForDeleteBet() {
		String s = "";
		for (int x = 0; x < venueDAO.getHeadquarterList().size(); x++) {
			if (exit.equals(venueDAO.getHeadquarterList().get(x).getId())) {
				s = venueDAO.getHeadquarterList().get(x).getId();
			}
		}
		if (!gamDAO.getGamblerList().isEmpty()) {
			selGambBetDeleteCashier.getComboGambler().removeAllItems();
			for (int i = 0; i < venueDAO.getHeadquarterList().size(); i++) {
				if (s.equals(venueDAO.getHeadquarterList().get(i).getId())) {
					for (int j = 0; j < gamDAO.getGamblerList().size(); j++) {
						if (venueDAO.getHeadquarterList().get(i).getVenueName()
								.equals(gamDAO.getGamblerList().get(j).getGamingVenue())) {
							selGambBetDeleteCashier.getComboGambler()
									.addItem(gamDAO.getGamblerList().get(j).getDocumentId());
						}
					}
				}
			}
		}
	}

	/**
	 * Funcion para seleccion actualizar apuesta a eliminar
	 */

	public void updateSelectBetDeleteBetCashier(long data) {
		if (!loteriaDAO.getLoteryBetList().isEmpty() || !balotoDAO.getBallotList().isEmpty()
				|| !superAstroDAO.getSuperAstroList().isEmpty() || !chanceDAO.getChanceList().isEmpty()
				|| !betPlayDAO.getBetPlayList().isEmpty()) {
			selBetDeleteCashi.getComboGambler().removeAllItems();
			for (int i = 0; i < loteriaDAO.getLoteryBetList().size(); i++) {
				if (data == (loteriaDAO.getLoteryBetList().get(i).getDocument())) {
					selBetDeleteCashi.getComboGambler().addItem(
							"Apuesta en loteria de valor " + loteriaDAO.getLoteryBetList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {
				if (data == (balotoDAO.getBallotList().get(i).getDocument())) {
					selBetDeleteCashi.getComboGambler()
							.addItem("Apuesta en baloto de valor " + balotoDAO.getBallotList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < superAstroDAO.getSuperAstroList().size(); i++) {
				if (data == (superAstroDAO.getSuperAstroList().get(i).getDocument())) {
					selBetDeleteCashi.getComboGambler().addItem("Apuesta en super astro de valor "
							+ superAstroDAO.getSuperAstroList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < chanceDAO.getChanceList().size(); i++) {
				if (data == (chanceDAO.getChanceList().get(i).getDocument())) {
					selBetDeleteCashi.getComboGambler()
							.addItem("Apuesta en chance de valor " + chanceDAO.getChanceList().get(i).getBetPlaced());
				}
			}
			for (int i = 0; i < betPlayDAO.getBetPlayList().size(); i++) {
				if (data == (betPlayDAO.getBetPlayList().get(i).getDocument())) {
					selBetDeleteCashi.getComboGambler().addItem(
							"Apuesta en bet play de valor " + betPlayDAO.getBetPlayList().get(i).getBetPlaced());
				}
			}

		}
	}

	/**
	 * Funcion para eliminar apuesta
	 */

	public void DeleteBetCashier(String s) {

		String s2 = "";
		for (int u = 0; u < venueDAO.getHeadquarterList().size(); u++) {
			if (exit.equals(venueDAO.getHeadquarterList().get(u).getId())) {
				s2 = venueDAO.getHeadquarterList().get(u).getVenueName();
			}
		}

		for (int x = 0; x < loteriaDAO.getLoteryBetList().size(); x++) {
			if (s.equals("Apuesta en loteria de valor " + loteriaDAO.getLoteryBetList().get(x).getBetPlaced())
					&& loteriaDAO.getLoteryBetList().get(x).getHeadQuarterName().equals(s2)) {
				loteriaDAO.delete(x);
				JOptionPane.showMessageDialog(loteriaWin, "ELIMINADO CON EXITO");
			}
		}
		for (int i = 0; i < balotoDAO.getBallotList().size(); i++) {
			if (s.equals("Apuesta en baloto de valor " + balotoDAO.getBallotList().get(i).getBetPlaced())
					&& balotoDAO.getBallotList().get(i).getHeadQuarterName().equals(s2)) {
				balotoDAO.delete(i);
				JOptionPane.showMessageDialog(balotoWin, "ELIMINADO CON EXITO");
			}
		}
		for (int j = 0; j < superAstroDAO.getSuperAstroList().size(); j++) {
			if (s.equals("Apuesta en super astro de valor " + superAstroDAO.getSuperAstroList().get(j).getBetPlaced())
					&& superAstroDAO.getSuperAstroList().get(j).getHeadQuarterName().equals(s2)) {
				superAstroDAO.delete(j);
				JOptionPane.showMessageDialog(superastroWin, "ELIMINADO CON EXITO");
			}
		}
		for (int k = 0; k < chanceDAO.getChanceList().size(); k++) {
			if (s.equals("Apuesta en chance de valor " + chanceDAO.getChanceList().get(k).getBetPlaced())
					&& chanceDAO.getChanceList().get(k).getHeadQuarterName().equals(s2)) {
				chanceDAO.delete(k);
				JOptionPane.showMessageDialog(chanceWin, "ELIMINADO CON EXITO");
			}
		}
		for (int l = 0; l < betPlayDAO.getBetPlayList().size(); l++) {
			if (s.equals("Apuesta en bet play de valor " + betPlayDAO.getBetPlayList().get(l).getBetPlaced())
					&& betPlayDAO.getBetPlayList().get(l).getHeadQuarterName().equals(s2)) {
				betPlayDAO.delete(l);
				JOptionPane.showMessageDialog(betplayWin, "ELIMINADO CON EXITO");
			}
		}

	}

	/**
	 * Funcion para revisar usuarios repetidos
	 * 
	 * @throws SameUserException
	 */

	public boolean sameUserException(String user) throws SameUserException {

		boolean check = true;

		String userToCheck = user;
		int cont = 0;

		for (int i = 0; i < ownDAO.getOwnerList().size(); i++) {

			if (userToCheck.equals(ownDAO.getOwnerList().get(i).getUsername())) {

				cont++;

			} else {

				for (int j = 0; j < bossDAO.getHeadquarterManagerList().size(); j++) {

					if (userToCheck.equals(bossDAO.getHeadquarterManagerList().get(j).getUser())) {

						cont++;

					} else {

						for (int j2 = 0; j2 < cashierDAO.getCheckerList().size(); j2++) {
							if (userToCheck.equals(cashierDAO.getCheckerList().get(j2).getUser())) {

								cont++;

							}
						}

					}

				}

			}

		}

		if (cont > 0) {
			JOptionPane.showMessageDialog(logWind, "USUARIO YA EXISTENTE, INTENTELO DE NUEVO", "EXCEPTION", 0);
			check = false;
			throw new SameUserException();
		} else if (cont == 0) {

			check = true;

		}

		return check;

	}

	/**
	 * Funcion para revisar seguridad de contraseña
	 */
	public boolean validPassword(String pass) throws NotValidPasswordException {

		boolean check = true;

		int cont = 0;

		if (pass.length() < 8) {
			cont++;
		}
		if (!pass.matches(".*[A-Z].*")) {

			cont++;
		}
		if (!pass.matches(".*[a-z].*")) {
			cont++;
		}
		if (!pass.matches(".*\\d.*")) {
			cont++;
		}
		if (!pass.matches(".*[!@#$%^&()_+\\-=\\[\\]{};':\",.<>/?].*")) {
			cont++;
		}

		if (cont > 0) {

			JOptionPane.showMessageDialog(logWind,
					"LA CONTRASEÑA NO ES LO SUFICIENTEMENTE SEGURA \n(LA CONTRASEÑA DEBE TENER: MINIMO 8 CARACTERES, UNA MAYUSCULA, UN NUMERO Y UN CARACTER ESPECIAL)",
					"EXCEPTION", 0);
			check = false;
			throw new NotValidPasswordException();
		} else if (cont == 0) {
			check = true;
		}

		return check;
	}

	/**
	 * Funcion para revisar numeros no validos
	 */

	public boolean numNotValid(String num) throws NumberNotValidException {

		boolean check = true;
		String message = "LOS NUMEROS SOLO PUEDEN SER NUMEROS";

		double numToCheck = Double.parseDouble(num);

		int cont = 0;

		if (numToCheck < 0) {
			cont++;

		} else {

			check = true;
		}

		if (cont > 0) {

			JOptionPane.showMessageDialog(logWind, message + " Y LOS NUMEROS DEBEN SER POSITIVOS", "EXCEPTION", 0);
			check = false;
			throw new NumberNotValidException();
		} else if (cont == 0) {
			check = true;
		}

		return check;

	}

	/**
	 * Funcion para revisar nombres de forma incorrecta
	 */
	public boolean checkName(String name) throws NotValidNameException {

		boolean check = true;

		String message = "LOS NOMBRES NO CONTIENEN CARACTERES ESPECIALES";

		int cont = 0;

		for (char c : name.toCharArray()) {

			if (!Character.isAlphabetic(c) && !Character.isWhitespace(c)) {
				cont++;

			} else {
				check = true;
			}

		}

		if (cont > 0) {
			JOptionPane.showMessageDialog(logWind, message, "EXCEPTION", 0);
			check = false;
			throw new NotValidNameException();
		} else if (cont == 0) {
			check = true;
		}

		return check;

	}

	/**
	 * Funcion para revisar datos vacios
	 */
	public boolean emptyData(String data) throws EmptyDataException {

		boolean check = true;
		if (data.isBlank() || data.isEmpty()) {
			JOptionPane.showMessageDialog(logWind, "HAY DATOS VACIOS, VERIFIQUE", "EXCEPTION", 0);
			check = false;
			throw new EmptyDataException();
		} else {
			check = true;
		}
		return check;

	}

}