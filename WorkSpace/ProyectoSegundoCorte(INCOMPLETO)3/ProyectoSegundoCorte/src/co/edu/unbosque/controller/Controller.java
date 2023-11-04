package co.edu.unbosque.controller;

/**
 * Clase Controlador con toda la logica
 * @author Cristhian Diaz
 */
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import co.edu.unbosque.model.persistence.CivilDAO;
import co.edu.unbosque.model.persistence.ForeignMilitaryDAO;
import co.edu.unbosque.model.persistence.LocalMilitaryDAO;
import co.edu.unbosque.model.persistence.PersonDAO;
import co.edu.unbosque.util.EmptyDataException;
import co.edu.unbosque.util.NameNotValidException;
import co.edu.unbosque.util.NegativeNumberException;
import co.edu.unbosque.util.NumberNotValidException;
import co.edu.unbosque.view.CivilCreateWindow;
import co.edu.unbosque.view.CivilDeleteWindow;
import co.edu.unbosque.view.CivilSearchByAttrbs;
import co.edu.unbosque.view.CivilShowWindow;
import co.edu.unbosque.view.CivilUpdateWindow;
import co.edu.unbosque.view.CivilWindowCRUD;
import co.edu.unbosque.view.ImageWindowCivil;
import co.edu.unbosque.view.ImageWindowMilitarForeign;
import co.edu.unbosque.view.ImageWindowMilitarLocal;
import co.edu.unbosque.view.MainMilitarWindow;
import co.edu.unbosque.view.MainWindow;
import co.edu.unbosque.view.MilitarForeignCreateWindow;
import co.edu.unbosque.view.MilitarForeignDeleteWindow;
import co.edu.unbosque.view.MilitarForeignSearchByAttrbs;
import co.edu.unbosque.view.MilitarForeignShowWindow;
import co.edu.unbosque.view.MilitarForeignUpdateWindow;
import co.edu.unbosque.view.MilitarForeignWindowCRUD;
import co.edu.unbosque.view.MilitarLocalCreateWindow;
import co.edu.unbosque.view.MilitarLocalDeleteWindow;
import co.edu.unbosque.view.MilitarLocalSearchByAttrbs;
import co.edu.unbosque.view.MilitarLocalShowWindow;
import co.edu.unbosque.view.MilitarLocalUpdateWindow;
import co.edu.unbosque.view.MilitarLocalWindowCRUD;
import co.edu.unbosque.view.PlayVideo;
import javafx.util.Duration;

/**
 * Constructor de Controller implementando el ActionListener
 * 
 * @author Cristhian Diaz
 */
public class Controller implements ActionListener {
	/**
	 * Atributo JFrame ventana principal
	 * 
	 * @author Cristhian Diaz
	 */
	private MainWindow mw;

	private PlayVideo playVideo;

	/**
	 * Atributo JFrame ventana con CRUD de CIVIL
	 * 
	 * @author Cristhian Diaz
	 */
	private CivilWindowCRUD civilWindow;
	/**
	 * Atributo JFrame ventana con Crear de civil
	 * 
	 * @author Cristhian Diaz
	 */
	private CivilCreateWindow civilCreateWindow;
	/**
	 * Atributo JFrame ventana con Actualizar de CIVIL
	 * 
	 * @author Cristhian Diaz
	 */
	private CivilUpdateWindow civilUpdateWindow;
	/**
	 * Atributo JFrame ventana con Imagenes de CIVIL
	 * 
	 * @author Cristhian Diaz
	 */
	private ImageWindowCivil imgWindowCivil;
	/**
	 * Atributo JFrame ventana con Objetos de CIVIL
	 * 
	 * @author Cristhian Diaz
	 */
	private CivilShowWindow civilShowWindow;
	/**
	 * Atributo JFrame ventana con Busqueda de CIVIL
	 * 
	 * @author Cristhian Diaz
	 */
	private CivilSearchByAttrbs civilSearch;
	/**
	 * Atributo JFrame ventana con Borrar de CIVIL
	 * 
	 * @author Cristhian Diaz
	 */
	private CivilDeleteWindow civilDeleteWindow;

	/**
	 * Atributo JFrame ventana con Militar Local y Militar Extranjero
	 * 
	 * @author Cristhian Diaz
	 */
	private MainMilitarWindow mainMilitarWindow;
	/**
	 * Atributo JFrame ventana con CRUD de MILITAR LOCAL
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarLocalWindowCRUD militarLocalWindow;
	/**
	 * Atributo JFrame ventana con Crear de MILITAR LOCAL
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarLocalCreateWindow militarLocalCreateWindow;
	/**
	 * Atributo JFrame ventana con Actualizar de MILITAR LOCAL
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarLocalUpdateWindow militarLocalUpdateWindow;
	/**
	 * Atributo JFrame ventana con Imagenes de MILITAR LOCAL
	 * 
	 * @author Cristhian Diaz
	 */
	private ImageWindowMilitarLocal imgWindowMilitarLocal;
	/**
	 * Atributo JFrame ventana con Objetos de MILITAR LOCAL
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarLocalShowWindow militarLocalShowWindow;
	/**
	 * Atributo JFrame ventana con Busqueda de MILITAR LOCAL
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarLocalSearchByAttrbs militarLocalSearch;
	/**
	 * Atributo JFrame ventana con Borrar de MILITAR LOCAL
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarLocalDeleteWindow militarLocalDeleteWindow;

	/**
	 * Atributo JFrame ventana con CRUD de MILITAR EXTRANJERO
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarForeignWindowCRUD militarForeignWindow;
	/**
	 * Atributo JFrame ventana con Crear de MILITAR EXTRANJERO
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarForeignCreateWindow militarForeignCreateWindow;
	/**
	 * Atributo JFrame ventana con Actualizar de MILITAR EXTRANJERO
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarForeignUpdateWindow militarForeignUpdateWindow;
	/**
	 * Atributo JFrame ventana con Imagenes de MILITAR EXTRANJERO
	 * 
	 * @author Cristhian Diaz
	 */
	private ImageWindowMilitarForeign imgWindowMilitarForeign;
	/**
	 * Atributo JFrame ventana con Objetos de MILITAR EXTRANJERO
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarForeignShowWindow militarForeignShowWindow;
	/**
	 * Atributo JFrame ventana con Busqueda de MILITAR EXTRANJERO
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarForeignSearchByAttrbs militarForeignSearch;
	/**
	 * Atributo JFrame ventana con Eliminar de MILITAR EXTRANJERO
	 * 
	 * @author Cristhian Diaz
	 */
	private MilitarForeignDeleteWindow militarForeignDeleteWindow;

	/**
	 * Atributo JFileChooser para escoger imagenes
	 * 
	 * @author Cristhian Diaz
	 */
	private JFileChooser fileChooser;

	/**
	 * Atributo CivilDAO para acceder a su CRUD
	 * 
	 * @author Cristhian Diaz
	 */
	private CivilDAO civilDAO;
	/**
	 * Atributo LocalMilitaryDAO para acceder a su CRUD
	 * 
	 * @author Cristhian Diaz
	 */
	private LocalMilitaryDAO militarLocalDAO;
	/**
	 * Atributo ForeignMilitaryDAO para acceder a su CRUD
	 * 
	 * @author Cristhian Diaz
	 */
	private ForeignMilitaryDAO militarForeignDAO;
	/**
	 * Atributo PersonDAO para calcular edades
	 * 
	 * @author Cristhian Diaz
	 */
	private PersonDAO personDAO;

	/**
	 * Atributo String para guardar la ubicacion de las imagenes temporalmente
	 * 
	 * @author Cristhian Diaz
	 */
	private String photoLocation1;
	/**
	 * Atributo int para guardar la ubicacion de las imagenes temporalmente
	 * 
	 * @author Cristhian Diaz
	 */
	private int numPhoto;

	/**
	 * Constructor del controller con todos los atributos inicializados
	 * 
	 * @author Cristhian Diaz
	 */
	public Controller() {

		civilDAO = new CivilDAO();
		militarLocalDAO = new LocalMilitaryDAO();
		militarForeignDAO = new ForeignMilitaryDAO();
		personDAO = new PersonDAO();

		photoLocation1 = "";
		numPhoto = 0;

		mw = new MainWindow();

		civilWindow = new CivilWindowCRUD();
		civilCreateWindow = new CivilCreateWindow();
		civilUpdateWindow = new CivilUpdateWindow();
		imgWindowCivil = new ImageWindowCivil();
		civilShowWindow = new CivilShowWindow();
		civilSearch = new CivilSearchByAttrbs();
		civilDeleteWindow = new CivilDeleteWindow();

		mainMilitarWindow = new MainMilitarWindow();

		militarLocalWindow = new MilitarLocalWindowCRUD();
		militarLocalCreateWindow = new MilitarLocalCreateWindow();
		militarLocalUpdateWindow = new MilitarLocalUpdateWindow();
		imgWindowMilitarLocal = new ImageWindowMilitarLocal();
		militarLocalShowWindow = new MilitarLocalShowWindow();
		militarLocalSearch = new MilitarLocalSearchByAttrbs();
		militarLocalDeleteWindow = new MilitarLocalDeleteWindow();

		militarForeignWindow = new MilitarForeignWindowCRUD();
		militarForeignCreateWindow = new MilitarForeignCreateWindow();
		militarForeignUpdateWindow = new MilitarForeignUpdateWindow();
		imgWindowMilitarForeign = new ImageWindowMilitarForeign();
		militarForeignShowWindow = new MilitarForeignShowWindow();
		militarForeignSearch = new MilitarForeignSearchByAttrbs();
		militarForeignDeleteWindow = new MilitarForeignDeleteWindow();

		fileChooser = new JFileChooser();
		agregarLectores();
	}

	/**
	 * Funcion para que el programa acceda al AplMain y se ejecute
	 * 
	 * @author Cristhian Diaz
	 */
	public void run() {

		mw.setVisible(true);

	}

	/**
	 * Funcion que agrega nombres a cada boton
	 * 
	 * @author Cristhian Diaz
	 */
	public void agregarLectores() {

		// BOTONES VENTANA PRINCIPAL
		mw.getCivilBtn().addActionListener(this);
		mw.getCivilBtn().setActionCommand("botonCivilPaginaPrincipal");
		mw.getMilitarBtn().addActionListener(this);
		mw.getMilitarBtn().setActionCommand("botonMilitarPaginaPrincipal");
		mw.getVideoBtn().addActionListener(this);
		mw.getVideoBtn().setActionCommand("botonVideoTutorialPaginaPrincipal");
		mw.getSalir().addActionListener(this);
		mw.getSalir().setActionCommand("botonSalirVentanaPrincipal");

		// BOTONES VENTANA CIVIL
		civilWindow.getBackBtn().addActionListener(this);
		civilWindow.getBackBtn().setActionCommand("botonVolverCivil");
		civilWindow.getCreateBtn().addActionListener(this);
		civilWindow.getCreateBtn().setActionCommand("botonCrearCivil");
		civilWindow.getReadBtn().addActionListener(this);
		civilWindow.getReadBtn().setActionCommand("botonPaginaMostrarCivil");
		civilWindow.getUpdateBtn().addActionListener(this);
		civilWindow.getUpdateBtn().setActionCommand("botonActualizarCivil");
		civilWindow.getDeleteBtn().addActionListener(this);
		civilWindow.getDeleteBtn().setActionCommand("botonEliminarCivil");

		// BOTONES VENTANA CIVIL CREAR
		civilCreateWindow.getBackBtn().addActionListener(this);
		civilCreateWindow.getBackBtn().setActionCommand("botonVolverCivilCrear");
		civilCreateWindow.getCreateBtn().addActionListener(this);
		civilCreateWindow.getCreateBtn().setActionCommand("botonCivilCrear");
		civilCreateWindow.getFileChooserBtn().addActionListener(this);
		civilCreateWindow.getFileChooserBtn().setActionCommand("escogerArchivoBotonCivil");

		// BOTONES VENTANA MOSTRAR (TABLA) CIVIL
		civilShowWindow.getBackBtn().addActionListener(this);
		civilShowWindow.getBackBtn().setActionCommand("botonVolverCivilMostrar");
		civilShowWindow.getImgBtn().addActionListener(this);
		civilShowWindow.getImgBtn().setActionCommand("botonImagenCivilMostrar");
		civilShowWindow.getSearchBtn().addActionListener(this);
		civilShowWindow.getSearchBtn().setActionCommand("botonCivilBuscar");

		// BOTONES VENTANA MOSTRAR (IMAGEN) CIVIL
		imgWindowCivil.getBtnAct().addActionListener(this);
		imgWindowCivil.getBtnAct().setActionCommand("botonActualizarCivilMostrarImagen");
		imgWindowCivil.getBackBtn().addActionListener(this);
		imgWindowCivil.getBackBtn().setActionCommand("botonVolverCivilMostrarImagen");

		// BOTONES VENTANA CIVIL ACTUALIZAR
		civilUpdateWindow.getBackBtn().addActionListener(this);
		civilUpdateWindow.getBackBtn().setActionCommand("botonVolverCivilActualizar");
		civilUpdateWindow.getUpdateBtn().addActionListener(this);
		civilUpdateWindow.getUpdateBtn().setActionCommand("botonCivilActualizar");
		civilUpdateWindow.getFileChooserBtn().addActionListener(this);
		civilUpdateWindow.getFileChooserBtn().setActionCommand("escogerArchivoBotonActualizar");

		// BOTONES VENTANA CIVIL ELIMINAR

		civilDeleteWindow.getBackBtn().addActionListener(this);
		civilDeleteWindow.getBackBtn().setActionCommand("botonVolverCivilEliminar");
		civilDeleteWindow.getDelteBtn().addActionListener(this);
		civilDeleteWindow.getDelteBtn().setActionCommand("botonEliminarCivilEliminar");

		// BOTONES VENTANA MILITAR
		mainMilitarWindow.getBackBtn().addActionListener(this);
		mainMilitarWindow.getBackBtn().setActionCommand("botonVolverMilitarMain");
		mainMilitarWindow.getMilitarLocal().addActionListener(this);
		mainMilitarWindow.getMilitarLocal().setActionCommand("botonMilitarLocal");
		mainMilitarWindow.getMilitarForeign().addActionListener(this);
		mainMilitarWindow.getMilitarForeign().setActionCommand("botonMilitarExtranjero");

		// BOTONES VENTANA MILITAR LOCAL
		militarLocalWindow.getBackBtn().addActionListener(this);
		militarLocalWindow.getBackBtn().setActionCommand("botonVolverMilitarLocal");
		militarLocalWindow.getCreateBtn().addActionListener(this);
		militarLocalWindow.getCreateBtn().setActionCommand("botonCrearMilitarLocal");
		militarLocalWindow.getReadBtn().addActionListener(this);
		militarLocalWindow.getReadBtn().setActionCommand("botonPaginaMostrarMilitarLocal");
		militarLocalWindow.getUpdateBtn().addActionListener(this);
		militarLocalWindow.getUpdateBtn().setActionCommand("botonActualizarMilitarLocal");
		militarLocalWindow.getDeleteBtn().addActionListener(this);
		militarLocalWindow.getDeleteBtn().setActionCommand("botonEliminarMilitarLocal");

		// BOTONES VENTANA MILITAR LOCAL CREAR
		militarLocalCreateWindow.getBackBtn().addActionListener(this);
		militarLocalCreateWindow.getBackBtn().setActionCommand("botonVolverMilitarLocalCrear");
		militarLocalCreateWindow.getCreateBtn().addActionListener(this);
		militarLocalCreateWindow.getCreateBtn().setActionCommand("botonCrearMilitarLocalCrear");
		militarLocalCreateWindow.getFileChooserBtn().addActionListener(this);
		militarLocalCreateWindow.getFileChooserBtn().setActionCommand("escogerArchivoBotonMilitarLocal");

		// BOTONES VENTANA MOSTRAR (TABLA) MILITAR LOCAL
		militarLocalShowWindow.getBackBtn().addActionListener(this);
		militarLocalShowWindow.getBackBtn().setActionCommand("botonVolverMilitarLocalMostrar");
		militarLocalShowWindow.getImgBtn().addActionListener(this);
		militarLocalShowWindow.getImgBtn().setActionCommand("botonImagenMilitarLocalMostrar");
		militarLocalShowWindow.getSearchBtn().addActionListener(this);
		militarLocalShowWindow.getSearchBtn().setActionCommand("botonMilitarLocalBuscar");

		// BOTONES VENTANA MOSTRAR (IMAGEN) MILITAR LOCAL

		imgWindowMilitarLocal.getBtnAct().addActionListener(this);
		imgWindowMilitarLocal.getBtnAct().setActionCommand("botonActualizarMilitarLocalMostrarImagen");
		imgWindowMilitarLocal.getBackBtn().addActionListener(this);
		imgWindowMilitarLocal.getBackBtn().setActionCommand("botonVolverMilitarLocalMostrarImagen");

		// BOTONES VENTANA MILITAR LOCAL ACTUALIZAR
		militarLocalUpdateWindow.getBackBtn().addActionListener(this);
		militarLocalUpdateWindow.getBackBtn().setActionCommand("botonVolverMilitarLocalActualizar");
		militarLocalUpdateWindow.getUpdateBtn().addActionListener(this);
		militarLocalUpdateWindow.getUpdateBtn().setActionCommand("botonActualizarMilitarLocalActualizar");
		militarLocalUpdateWindow.getFileChooserBtn().addActionListener(this);
		militarLocalUpdateWindow.getFileChooserBtn().setActionCommand("escogerArchivoBotonMilitarLocalActualizar");

		// BOTONES VENTANA MILITAR LOCAL ELIMINAR

		militarLocalDeleteWindow.getBackBtn().addActionListener(this);
		militarLocalDeleteWindow.getBackBtn().setActionCommand("botonVolverMilitarLocalEliminar");
		militarLocalDeleteWindow.getDelteBtn().addActionListener(this);
		militarLocalDeleteWindow.getDelteBtn().setActionCommand("botonEliminarMilitarLocalEliminar");

		// BOTONES VENTANA MILITAR EXTRANJERO
		militarForeignWindow.getBackBtn().addActionListener(this);
		militarForeignWindow.getBackBtn().setActionCommand("botonVolverMilitarExtranjero");
		militarForeignWindow.getCreateBtn().addActionListener(this);
		militarForeignWindow.getCreateBtn().setActionCommand("botonCrearMilitarExtranjero");
		militarForeignWindow.getReadBtn().addActionListener(this);
		militarForeignWindow.getReadBtn().setActionCommand("botonPaginaMostrarMilitarForeign");
		militarForeignWindow.getUpdateBtn().addActionListener(this);
		militarForeignWindow.getUpdateBtn().setActionCommand("botonActualizarMilitarExtranjero");
		militarForeignWindow.getDeleteBtn().addActionListener(this);
		militarForeignWindow.getDeleteBtn().setActionCommand("botonEliminarMilitarExtranjero");

		// BOTONES VENTANA MILITAR EXTRANJERO CREAR
		militarForeignCreateWindow.getBackBtn().addActionListener(this);
		militarForeignCreateWindow.getBackBtn().setActionCommand("botonVolverMilitarExtranjeroCrear");
		militarForeignCreateWindow.getCreateBtn().addActionListener(this);
		militarForeignCreateWindow.getCreateBtn().setActionCommand("botonCrearMilitarExtranjeroCrear");
		militarForeignCreateWindow.getFileChooserBtn().addActionListener(this);
		militarForeignCreateWindow.getFileChooserBtn().setActionCommand("escogerArchivoBotonMilitarExtranjero");

		// BOTONES VENTANA MOSTRAR (TABLA) MILITAR FOREIGN
		militarForeignShowWindow.getBackBtn().addActionListener(this);
		militarForeignShowWindow.getBackBtn().setActionCommand("botonVolverMilitarForeignMostrar");
		militarForeignShowWindow.getImgBtn().addActionListener(this);
		militarForeignShowWindow.getImgBtn().setActionCommand("botonImagenMilitarForeignMostrar");
		militarForeignShowWindow.getSearchBtn().addActionListener(this);
		militarForeignShowWindow.getSearchBtn().setActionCommand("botonMilitarForeignBuscar");
		// BOTONES VENTANA MOSTRAR (IMAGEN) MILITAR FOREIGN

		imgWindowMilitarForeign.getBtnAct().addActionListener(this);
		imgWindowMilitarForeign.getBtnAct().setActionCommand("botonActualizarMilitarForeignMostrarImagen");
		imgWindowMilitarForeign.getBackBtn().addActionListener(this);
		imgWindowMilitarForeign.getBackBtn().setActionCommand("botonVolverMilitarForeignMostrarImagen");

		// BOTONES VENTANA MILITAR EXTRANJERO ACTUALIZAR
		militarForeignUpdateWindow.getBackBtn().addActionListener(this);
		militarForeignUpdateWindow.getBackBtn().setActionCommand("botonVolverMilitarExtranjeroActualizar");
		militarForeignUpdateWindow.getUpdateBtn().addActionListener(this);
		militarForeignUpdateWindow.getUpdateBtn().setActionCommand("botonActualizarMilitarExtranjeroActualizar");
		militarForeignUpdateWindow.getFileChooserBtn().addActionListener(this);
		militarForeignUpdateWindow.getFileChooserBtn()
				.setActionCommand("escogerArchivoBotonMilitarExtranjeroActualizar");

		// BOTONES VENTANA MILITAR EXTRANJERO ELIMINAR

		militarForeignDeleteWindow.getBackBtn().addActionListener(this);
		militarForeignDeleteWindow.getBackBtn().setActionCommand("botonVolverMilitarForeignEliminar");
		militarForeignDeleteWindow.getDelteBtn().addActionListener(this);
		militarForeignDeleteWindow.getDelteBtn().setActionCommand("botonEliminarMilitarForeignEliminar");

		// BOTONES BUSQUEDA POR ATRIBUTOS CIVIL

		civilSearch.getBackBtn().addActionListener(this);
		civilSearch.getBackBtn().setActionCommand("botonVolverBusquedaPorAtributosCivil");
		civilSearch.getDocBtn().addActionListener(this);
		civilSearch.getDocBtn().setActionCommand("botonBuscarDocumentoCivil");
		civilSearch.getNameBtn().addActionListener(this);
		civilSearch.getNameBtn().setActionCommand("botonBuscarNombreCivil");
		civilSearch.getStudiesLevelBtn().addActionListener(this);
		civilSearch.getStudiesLevelBtn().setActionCommand("botonBuscarNivelEstudiosCivil");
		civilSearch.getTimeInArmyBtn().addActionListener(this);
		civilSearch.getTimeInArmyBtn().setActionCommand("botonBuscarTiempoEjercitoCivil");
		civilSearch.getAgeBtn().addActionListener(this);
		civilSearch.getAgeBtn().setActionCommand("botonBuscarEdadCivil");
		civilSearch.getPosBtn().addActionListener(this);
		civilSearch.getPosBtn().setActionCommand("botonBuscarPosicionCivil");

		// BOTONES BUSQUEDA POR ATRIBUTOS MILITAR LOCAL

		militarLocalSearch.getBackBtn().addActionListener(this);
		militarLocalSearch.getBackBtn().setActionCommand("botonVolverBusquedaPorAtributosMilitarLocal");
		militarLocalSearch.getDocBtn().addActionListener(this);
		militarLocalSearch.getDocBtn().setActionCommand("botonBuscarDocumentoMilitarLocal");
		militarLocalSearch.getNameBtn().addActionListener(this);
		militarLocalSearch.getNameBtn().setActionCommand("botonBuscarNombreMilitarLocal");
		militarLocalSearch.getStudiesLevelBtn().addActionListener(this);
		militarLocalSearch.getStudiesLevelBtn().setActionCommand("botonBuscarNivelEstudiosMilitarLocal");
		militarLocalSearch.getTimeInArmyBtn().addActionListener(this);
		militarLocalSearch.getTimeInArmyBtn().setActionCommand("botonBuscarTiempoEjercitoMilitarLocal");
		militarLocalSearch.getAgeBtn().addActionListener(this);
		militarLocalSearch.getAgeBtn().setActionCommand("botonBuscarEdadMilitarLocal");
		militarLocalSearch.getPosBtn().addActionListener(this);
		militarLocalSearch.getPosBtn().setActionCommand("botonBuscarPosicionMilitarLocal");

		// BOTONES BUSQUEDA POR ATRIBUTOS MILITAR LOCAL

		militarForeignSearch.getBackBtn().addActionListener(this);
		militarForeignSearch.getBackBtn().setActionCommand("botonVolverBusquedaPorAtributosMilitarForeign");
		militarForeignSearch.getDocBtn().addActionListener(this);
		militarForeignSearch.getDocBtn().setActionCommand("botonBuscarDocumentoMilitarForeign");
		militarForeignSearch.getNameBtn().addActionListener(this);
		militarForeignSearch.getNameBtn().setActionCommand("botonBuscarNombreMilitarForeign");
		militarForeignSearch.getStudiesLevelBtn().addActionListener(this);
		militarForeignSearch.getStudiesLevelBtn().setActionCommand("botonBuscarNivelEstudiosMilitarForeign");
		militarForeignSearch.getTimeInArmyBtn().addActionListener(this);
		militarForeignSearch.getTimeInArmyBtn().setActionCommand("botonBuscarTiempoEjercitoMilitarForeign");
		militarForeignSearch.getAgeBtn().addActionListener(this);
		militarForeignSearch.getAgeBtn().setActionCommand("botonBuscarEdadMilitarForeign");
		militarForeignSearch.getPosBtn().addActionListener(this);
		militarForeignSearch.getPosBtn().setActionCommand("botonBuscarPosicionMilitarForeign");
	}

	/**
	 * Funcion que entiende el click del mouse dentro de los JFrame
	 * 
	 * @author Cristhian Diaz
	 */
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		// CASOS BUSQUEDA POR ATRIBUTOS MILITAR EXTRANJERO
		case "botonVolverBusquedaPorAtributosMilitarForeign": {
			militarForeignSearch.setVisible(false);
			militarForeignShowWindow.setVisible(true);
			break;
		}
		case "botonBuscarDocumentoMilitarForeign": {
			String search = JOptionPane.showInputDialog("Ingrese el documento a buscar");

			long document = Long.parseLong(search);

			JOptionPane.showMessageDialog(mw, militarForeignDAO.searchAndShowByDocument(document));

			break;
		}
		case "botonBuscarNombreMilitarForeign": {
			String search = JOptionPane.showInputDialog("Ingrese el nombre a buscar");

			String name = search;

			JOptionPane.showMessageDialog(mw, militarForeignDAO.searchAndShowByName(name));

			break;
		}
		case "botonBuscarNivelEstudiosMilitarForeign": {
			String search = JOptionPane.showInputDialog("Ingrese el pais de origen a buscar");

			String studiesLevel = search;

			JOptionPane.showMessageDialog(mw, militarForeignDAO.searchAndShowByCountryOfOrigin(studiesLevel));

			break;
		}
		case "botonBuscarTiempoEjercitoMilitarForeign": {
			String search = JOptionPane.showInputDialog("Ingrese el tiempo en el pais a buscar");

			int timeService = Integer.parseInt(search);

			JOptionPane.showMessageDialog(mw, militarForeignDAO.searchAndShowBytimeInOurCountry(timeService));

			break;
		}

		case "botonBuscarEdadMilitarForeign": {
			String search = JOptionPane.showInputDialog("Ingrese la edad a buscar");

			int age = Integer.parseInt(search);

			JOptionPane.showMessageDialog(mw, militarForeignDAO.searchAndShowByAge(age));

			break;
		}
		case "botonBuscarPosicionMilitarForeign": {
			JOptionPane.showMessageDialog(mw, militarForeignDAO.readAll());
			break;
		}

		// CASOS BUSQUEDA POR ATRIBUTOS MILITAR LOCAL
		case "botonVolverBusquedaPorAtributosMilitarLocal": {
			militarLocalSearch.setVisible(false);
			militarLocalShowWindow.setVisible(true);
			break;
		}
		case "botonBuscarDocumentoMilitarLocal": {
			String search = JOptionPane.showInputDialog("Ingrese el documento a buscar");

			long document = Long.parseLong(search);

			JOptionPane.showMessageDialog(mw, militarLocalDAO.searchAndShowByDocument(document));

			break;
		}
		case "botonBuscarNombreMilitarLocal": {
			String search = JOptionPane.showInputDialog("Ingrese el nombre a buscar");

			String name = search;

			JOptionPane.showMessageDialog(mw, militarLocalDAO.searchAndShowByName(name));

			break;
		}
		case "botonBuscarNivelEstudiosMilitarLocal": {
			String search = JOptionPane.showInputDialog("Ingrese el rango a buscar");

			String studiesLevel = search;

			JOptionPane.showMessageDialog(mw, militarLocalDAO.searchAndShowByRank(studiesLevel));

			break;
		}
		case "botonBuscarTiempoEjercitoMilitarLocal": {
			String search = JOptionPane.showInputDialog("Ingrese el tiempo de servicio a buscar");

			int timeService = Integer.parseInt(search);

			JOptionPane.showMessageDialog(mw, militarLocalDAO.searchAndShowByServiceTime(timeService));

			break;
		}

		case "botonBuscarEdadMilitarLocal": {
			String search = JOptionPane.showInputDialog("Ingrese la edad a buscar");

			int age = Integer.parseInt(search);

			JOptionPane.showMessageDialog(mw, militarLocalDAO.searchAndShowByAge(age));

			break;
		}
		case "botonBuscarPosicionMilitarLocal": {
			JOptionPane.showMessageDialog(mw, militarLocalDAO.readAll());
			break;
		}

		// CASOS BUSQUEDA POR ATRIBUTOS CIVIL
		case "botonVolverBusquedaPorAtributosCivil": {
			civilSearch.setVisible(false);
			civilShowWindow.setVisible(true);
			break;
		}
		case "botonBuscarDocumentoCivil": {
			String search = JOptionPane.showInputDialog("Ingrese el documento a buscar");

			long document = Long.parseLong(search);

			JOptionPane.showMessageDialog(mw, civilDAO.searchAndShowByDocument(document));

			break;
		}
		case "botonBuscarNombreCivil": {
			String search = JOptionPane.showInputDialog("Ingrese el nombre a buscar");

			String name = search;

			JOptionPane.showMessageDialog(mw, civilDAO.searchAndShowByName(name));

			break;
		}
		case "botonBuscarNivelEstudiosCivil": {
			String search = JOptionPane.showInputDialog("Ingrese el nivel de estudios a buscar");

			String studiesLevel = search;

			JOptionPane.showMessageDialog(mw, civilDAO.searchAndShowByStudiesLevelToSearch(studiesLevel));

			break;
		}
		case "botonBuscarTiempoEjercitoCivil": {
			String search = JOptionPane.showInputDialog("Ingrese el tiempo en meses en el ejercito a buscar");

			int timeService = Integer.parseInt(search);

			JOptionPane.showMessageDialog(mw, civilDAO.searchAndShowBytimeWithArmy(timeService));

			break;
		}

		case "botonBuscarEdadCivil": {
			String search = JOptionPane.showInputDialog("Ingrese la edad a buscar");

			int age = Integer.parseInt(search);

			JOptionPane.showMessageDialog(mw, civilDAO.searchAndShowByAge(age));

			break;
		}
		case "botonBuscarPosicionCivil": {
			JOptionPane.showMessageDialog(mw, civilDAO.readAll());
			break;
		}

		// CASOS BOTONES VENTANA PRINCIPAL
		case "botonCivilPaginaPrincipal": {
			mw.setVisible(false);
			civilWindow.setVisible(true);

			break;
		}

		case "botonMilitarPaginaPrincipal": {
			mw.setVisible(false);
			mainMilitarWindow.setVisible(true);

			break;
		}

		case "botonVideoTutorialPaginaPrincipal": {
			playVideo = new PlayVideo();
			playVideo.setVisible(true);
			playVideo.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {

					playVideo.setVisible(false);
					playVideo.getOracleVid().pause();
					playVideo.getOracleVid().seek(Duration.ZERO);

				}
			});
			break;
		}

		case "botonSalirVentanaPrincipal": {
			System.exit(1);
			break;
		}

		// CASOS BOTONES CIVIL
		case "botonVolverCivil": {
			mw.setVisible(true);
			civilWindow.setVisible(false);

			break;
		}
		case "botonCivilBuscar": {

			civilShowWindow.setVisible(false);
			civilSearch.setVisible(true);
			break;

		}
		case "botonMilitarLocalBuscar": {
			militarLocalShowWindow.setVisible(false);
			militarLocalSearch.setVisible(true);
			break;
		}
		case "botonMilitarForeignBuscar": {
			militarForeignShowWindow.setVisible(false);
			militarForeignSearch.setVisible(true);
			break;
		}
		case "botonCrearCivil": {

			mw.setVisible(false);
			civilWindow.setVisible(false);
			civilCreateWindow.setVisible(true);
			break;
		}
		case "botonPaginaMostrarCivil": {
			mw.setVisible(false);
			civilWindow.setVisible(false);
			civilShowWindow.setVisible(true);
			showTableCivil();
			break;
		}
		case "botonActualizarCivil": {
			mw.setVisible(false);
			civilWindow.setVisible(false);
			civilUpdateWindow.setVisible(true);
			break;
		}
		case "botonEliminarCivil": {

			mw.setVisible(false);
			civilWindow.setVisible(false);
			civilDeleteWindow.setVisible(true);
			break;

		}
		case "escogerArchivoBotonCivil": {

			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpeg", "JPEG", "jpg", "JPG",
					"png", "PNG");
			fileChooser.setFileFilter(filter);

			int response = fileChooser.showOpenDialog(null);
			if (response == JFileChooser.APPROVE_OPTION) {

				String photoLocation = fileChooser.getSelectedFile().getPath();
				createCopyOfImage(photoLocation);
				photoLocation1 = createCopyOfImage(photoLocation);

				Image myImage = new ImageIcon(photoLocation).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(372, 385, Image.SCALE_DEFAULT));

				civilCreateWindow.getPersonalPhoto().setIcon(myIcon);
				;

			}

			break;
		}
		// CASOS BOTONES ELIMINAR CIVIL

		case "botonVolverCivilEliminar": {

			civilDeleteWindow.setVisible(false);
			civilDeleteWindow.getPosicionTxt().setText("");
			civilWindow.setVisible(true);

			break;

		}

		case "botonEliminarCivilEliminar": {
			while (true) {
				try {
					deleteCivil();
					JOptionPane.showMessageDialog(civilDeleteWindow, "Se ha eliminado con exito la persona civil");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(mw, "DATOS INCORRECTOS", "ERROR", 0);
				}
				civilDeleteWindow.getPosicionTxt().setText("");
				break;
			}
			break;

		}

		// CASOS BOTONES CREAR CIVIL

		case "botonVolverCivilCrear": {

			civilCreateWindow.setVisible(false);
			civilCreateWindow.getDocTxt().setText("");
			civilCreateWindow.getNameTxt().setText("");
			civilCreateWindow.getDayBirthTxt().setText("");
			civilCreateWindow.getMonthBirthTxt().setText("");
			civilCreateWindow.getYearBirthTxt().setText("");
			civilCreateWindow.getStudiesTxt().setText("");
			civilCreateWindow.getTimeArmyTxt().setText("");
			civilCreateWindow.getPersonalPhoto().setIcon(null);
			civilWindow.setVisible(true);

			break;
		}
		case "botonCivilCrear": {
			while (true) {

				try {
					createCivil();
					JOptionPane.showMessageDialog(civilCreateWindow, "Se ha creado con exito la persona civil");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(mw, "DATOS INCORRECTOS", "ERROR", 0);
				}
				civilCreateWindow.getDocTxt().setText("");
				civilCreateWindow.getNameTxt().setText("");
				civilCreateWindow.getDayBirthTxt().setText("");
				civilCreateWindow.getMonthBirthTxt().setText("");
				civilCreateWindow.getYearBirthTxt().setText("");
				civilCreateWindow.getStudiesTxt().setText("");
				civilCreateWindow.getTimeArmyTxt().setText("");
				civilCreateWindow.getPersonalPhoto().setIcon(null);
				break;
			}
			break;
		}

		case "escogerArchivoBotonActualizar": {

			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpeg", "JPEG", "jpg", "JPG",
					"png", "PNG");
			fileChooser.setFileFilter(filter);

			int response = fileChooser.showOpenDialog(null);
			if (response == JFileChooser.APPROVE_OPTION) {

				String photoLocation = fileChooser.getSelectedFile().getPath();
				createCopyOfImage(photoLocation);
				photoLocation1 = createCopyOfImage(photoLocation);

				Image myImage = new ImageIcon(photoLocation).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(372, 385, Image.SCALE_DEFAULT));

				civilUpdateWindow.getPersonalPhoto().setIcon(myIcon);
				;

			}

			break;
		}

		// CASOS VENTANA MOSTRAR CIVIL

		case "botonVolverCivilMostrar": {
			updateTableCivil();
			civilWindow.setVisible(true);
			civilShowWindow.setVisible(false);
			break;
		}

		case "botonImagenCivilMostrar": {
			imgWindowCivil.setVisible(true);
			civilShowWindow.setVisible(false);
			updateBoxCivil();
			break;
		}

		// CASOS VENTANA MOSTRAR IMAGEN CIVIL

		case "botonActualizarCivilMostrarImagen": {

			int photoLocation = boxImageCivil(numPhoto);
			updateBoxCivil();
			try {
				Image myImage = new ImageIcon(civilDAO.getCivilList().get(photoLocation).getPhotoLocation()).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(476, 453, Image.SCALE_DEFAULT));

				imgWindowCivil.getPhoto().setIcon(myIcon);

			} catch (IndexOutOfBoundsException e2) {
				Image myImage = new ImageIcon(civilDAO.getCivilList().get(photoLocation + 1).getPhotoLocation())
						.getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(476, 453, Image.SCALE_DEFAULT));

				imgWindowCivil.getPhoto().setIcon(myIcon);

			}

			break;
		}

		case "botonVolverCivilMostrarImagen": {
			imgWindowCivil.setVisible(false);
			civilShowWindow.setVisible(true);
			imgWindowCivil.getPhoto().setIcon(null);
			updateBoxCivil();
			break;
		}

		// CASOS BOTONES ACTUALIZAR CIVIL
		case "botonVolverCivilActualizar": {

			civilUpdateWindow.setVisible(false);
			civilUpdateWindow.getDocTxt().setText("");
			civilUpdateWindow.getNameTxt().setText("");
			civilUpdateWindow.getDayBirthTxt().setText("");
			civilUpdateWindow.getMonthBirthTxt().setText("");
			civilUpdateWindow.getYearBirthTxt().setText("");
			civilUpdateWindow.getStudiesTxt().setText("");
			civilUpdateWindow.getTimeArmyTxt().setText("");
			civilUpdateWindow.getIndexTxt().setText("");
			civilUpdateWindow.getPersonalPhoto().setIcon(null);
			civilWindow.setVisible(true);

			break;
		}
		case "botonCivilActualizar": {

			while (true) {

				try {
					updateCivil();
					JOptionPane.showMessageDialog(civilUpdateWindow, "Se ha actualizado con exito la persona civil");
				} catch (NumberFormatException ex) {
				}
				civilUpdateWindow.getDocTxt().setText("");
				civilUpdateWindow.getNameTxt().setText("");
				civilUpdateWindow.getDayBirthTxt().setText("");
				civilUpdateWindow.getMonthBirthTxt().setText("");
				civilUpdateWindow.getYearBirthTxt().setText("");
				civilUpdateWindow.getStudiesTxt().setText("");
				civilUpdateWindow.getTimeArmyTxt().setText("");
				civilUpdateWindow.getIndexTxt().setText("");
				civilUpdateWindow.getPersonalPhoto().setIcon(null);
				break;
			}
			break;
		}
		// CASOS BOTONES MILITAR
		case "botonVolverMilitarMain": {
			mw.setVisible(true);
			mainMilitarWindow.setVisible(false);

			break;
		}
		case "botonMilitarExtranjero": {
			mw.setVisible(false);
			mainMilitarWindow.setVisible(false);
			militarForeignWindow.setVisible(true);

			break;
		}
		case "botonMilitarLocal": {
			mw.setVisible(false);
			mainMilitarWindow.setVisible(false);
			militarLocalWindow.setVisible(true);

			break;
		}

		// CASOS BOTONES MILITAR LOCAL
		case "botonVolverMilitarLocal": {
			militarLocalWindow.setVisible(false);
			mainMilitarWindow.setVisible(true);

			break;
		}
		case "botonCrearMilitarLocal": {

			mw.setVisible(false);
			militarLocalCreateWindow.setVisible(true);
			militarLocalWindow.setVisible(false);
			break;
		}
		case "botonPaginaMostrarMilitarLocal": {
			mw.setVisible(false);
			militarLocalWindow.setVisible(false);
			militarLocalShowWindow.setVisible(true);
			showTableMilitarLocal();
			break;
		}
		case "botonActualizarMilitarLocal": {

			mw.setVisible(false);
			militarLocalUpdateWindow.setVisible(true);
			militarLocalWindow.setVisible(false);
			break;
		}
		case "botonEliminarMilitarLocal": {

			mw.setVisible(false);
			militarLocalDeleteWindow.setVisible(true);
			militarLocalWindow.setVisible(false);
			break;
		}
		case "escogerArchivoBotonMilitarLocal": {

			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpeg", "JPEG", "jpg", "JPG",
					"png", "PNG");
			fileChooser.setFileFilter(filter);

			int response = fileChooser.showOpenDialog(null);
			if (response == JFileChooser.APPROVE_OPTION) {

				String photoLocation = fileChooser.getSelectedFile().getPath();
				createCopyOfImage(photoLocation);
				photoLocation1 = createCopyOfImage(photoLocation);

				Image myImage = new ImageIcon(photoLocation).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(372, 385, Image.SCALE_DEFAULT));

				militarLocalCreateWindow.getPersonalPhoto().setIcon(myIcon);
				;

			}

			break;
		}
		// CASOS BOTONES ELIMINAR MILITAR LOCAL

		case "botonVolverMilitarLocalEliminar": {

			militarLocalDeleteWindow.setVisible(false);
			militarLocalDeleteWindow.getPosicionTxt().setText("");
			militarLocalWindow.setVisible(true);

			break;

		}

		case "botonEliminarMilitarLocalEliminar": {
			while (true) {
				try {
					deleteMilitarLocal();
					JOptionPane.showMessageDialog(militarLocalDeleteWindow,
							"Se ha eliminado con exito el Militar Local");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(mw, "DATOS INCORRECTOS", "ERROR", 0);
				}
				militarLocalDeleteWindow.getPosicionTxt().setText("");
				break;
			}
			break;

		}
		// CASOS BOTONES CREAR MILITAR LOCAL;

		case "botonVolverMilitarLocalCrear": {

			militarLocalCreateWindow.setVisible(false);
			militarLocalCreateWindow.getDocTxt().setText("");
			militarLocalCreateWindow.getNameTxt().setText("");
			militarLocalCreateWindow.getDayBirthTxt().setText("");
			militarLocalCreateWindow.getMonthBirthTxt().setText("");
			militarLocalCreateWindow.getYearBirthTxt().setText("");
			militarLocalCreateWindow.getRankTxt().setText("");
			militarLocalCreateWindow.getServiceTimeTxt().setText("");
			militarLocalCreateWindow.getPersonalPhoto().setIcon(null);
			militarLocalWindow.setVisible(true);

			break;
		}
		case "botonCrearMilitarLocalCrear": {
			while (true) {

				try {
					createMilitarLocal();
					JOptionPane.showMessageDialog(militarLocalCreateWindow, "Se ha creado con exito el Militar Local");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(mw, "DATOS INCORRECTOS", "ERROR", 0);
				}
				militarLocalCreateWindow.getDocTxt().setText("");
				militarLocalCreateWindow.getNameTxt().setText("");
				militarLocalCreateWindow.getDayBirthTxt().setText("");
				militarLocalCreateWindow.getMonthBirthTxt().setText("");
				militarLocalCreateWindow.getYearBirthTxt().setText("");
				militarLocalCreateWindow.getRankTxt().setText("");
				militarLocalCreateWindow.getServiceTimeTxt().setText("");
				militarLocalCreateWindow.getPersonalPhoto().setIcon(null);
				break;
			}
			break;
		}
		case "escogerArchivoBotonMilitarLocalActualizar": {

			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpeg", "JPEG", "jpg", "JPG",
					"png", "PNG");
			fileChooser.setFileFilter(filter);

			int response = fileChooser.showOpenDialog(null);
			if (response == JFileChooser.APPROVE_OPTION) {

				String photoLocation = fileChooser.getSelectedFile().getPath();
				createCopyOfImage(photoLocation);
				photoLocation1 = createCopyOfImage(photoLocation);

				Image myImage = new ImageIcon(photoLocation).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(372, 385, Image.SCALE_DEFAULT));

				militarLocalUpdateWindow.getPersonalPhoto().setIcon(myIcon);
				;

			}

			break;
		}

		// CASOS VENTANA MOSTRAR MILITAR LOCAL

		case "botonVolverMilitarLocalMostrar": {
			updateTableMilitarLocal();
			militarLocalWindow.setVisible(true);
			militarLocalShowWindow.setVisible(false);
			break;
		}
		case "botonImagenMilitarLocalMostrar": {
			imgWindowMilitarLocal.setVisible(true);
			militarLocalShowWindow.setVisible(false);
			updateBoxMilitarLocal();
			break;
		}

		// CASOS VENTANA MOSTRAR IMAGEN MILITAR LOCAL

		case "botonActualizarMilitarLocalMostrarImagen": {
			int photoLocation = boxImageMilitarLocal(numPhoto);
			updateBoxMilitarLocal();
			try {
				Image myImage = new ImageIcon(militarLocalDAO.getLocalMiList().get(photoLocation).getPhotoLocation())
						.getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(476, 453, Image.SCALE_DEFAULT));

				imgWindowMilitarLocal.getPhoto().setIcon(myIcon);

			} catch (IndexOutOfBoundsException e2) {
				Image myImage = new ImageIcon(
						militarLocalDAO.getLocalMiList().get(photoLocation + 1).getPhotoLocation()).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(476, 453, Image.SCALE_DEFAULT));

				imgWindowMilitarLocal.getPhoto().setIcon(myIcon);

			}

			break;
		}
		case "botonVolverMilitarLocalMostrarImagen": {
			imgWindowMilitarLocal.setVisible(false);
			militarLocalShowWindow.setVisible(true);
			imgWindowMilitarLocal.getPhoto().setIcon(null);
			updateBoxMilitarLocal();
			break;
		}

		// CASOS BOTONES ACTUALIZAR MILITAR LOCAL

		case "botonVolverMilitarLocalActualizar": {

			militarLocalUpdateWindow.setVisible(false);
			militarLocalUpdateWindow.getDocTxt().setText("");
			militarLocalUpdateWindow.getNameTxt().setText("");
			militarLocalUpdateWindow.getDayBirthTxt().setText("");
			militarLocalUpdateWindow.getMonthBirthTxt().setText("");
			militarLocalUpdateWindow.getYearBirthTxt().setText("");
			militarLocalUpdateWindow.getRankTxt().setText("");
			militarLocalUpdateWindow.getServiceTimeTxt().setText("");
			militarLocalUpdateWindow.getPersonalPhoto().setIcon(null);
			militarLocalWindow.setVisible(true);

			break;
		}
		case "botonActualizarMilitarLocalActualizar": {
			while (true) {

				try {
					updateMilitarLocal();
					JOptionPane.showMessageDialog(militarLocalUpdateWindow,
							"Se ha actualizado con exito el militar local");
				} catch (NumberFormatException ex) {
				}
				militarLocalUpdateWindow.getDocTxt().setText("");
				militarLocalUpdateWindow.getNameTxt().setText("");
				militarLocalUpdateWindow.getDayBirthTxt().setText("");
				militarLocalUpdateWindow.getMonthBirthTxt().setText("");
				militarLocalUpdateWindow.getYearBirthTxt().setText("");
				militarLocalUpdateWindow.getRankTxt().setText("");
				militarLocalUpdateWindow.getServiceTimeTxt().setText("");
				militarLocalUpdateWindow.getIndexTxt().setText("");
				militarLocalUpdateWindow.getPersonalPhoto().setIcon(null);
				break;
			}
			break;

		}
		// CASOS BOTONES MILITAR EXTRANJERO
		case "botonVolverMilitarExtranjero": {
			militarForeignWindow.setVisible(false);
			mainMilitarWindow.setVisible(true);

			break;
		}
		case "botonCrearMilitarExtranjero": {
			mw.setVisible(false);
			militarForeignCreateWindow.setVisible(true);
			militarForeignWindow.setVisible(false);
			break;
		}
		case "botonPaginaMostrarMilitarForeign": {
			mw.setVisible(false);
			militarForeignWindow.setVisible(false);
			militarForeignShowWindow.setVisible(true);
			showTableMilitarForeign();
			break;
		}
		case "botonActualizarMilitarExtranjero": {

			mw.setVisible(false);
			militarForeignUpdateWindow.setVisible(true);
			militarForeignWindow.setVisible(false);
			break;

		}
		case "botonEliminarMilitarExtranjero": {

			mw.setVisible(false);
			militarForeignDeleteWindow.setVisible(true);
			militarForeignWindow.setVisible(false);
			break;
		}
		case "escogerArchivoBotonMilitarExtranjero": {

			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpeg", "JPEG", "jpg", "JPG",
					"png", "PNG");
			fileChooser.setFileFilter(filter);

			int response = fileChooser.showOpenDialog(null);
			if (response == JFileChooser.APPROVE_OPTION) {

				String photoLocation = fileChooser.getSelectedFile().getPath();
				createCopyOfImage(photoLocation);
				photoLocation1 = createCopyOfImage(photoLocation);

				Image myImage = new ImageIcon(photoLocation).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(372, 385, Image.SCALE_DEFAULT));

				militarForeignCreateWindow.getPersonalPhoto().setIcon(myIcon);

			}

			break;
		}

		// CASOS BOTONES ELIMINAR MILITAR LOCAL

		case "botonVolverMilitarForeignEliminar": {

			militarForeignDeleteWindow.setVisible(false);
			militarForeignDeleteWindow.getPosicionTxt().setText("");
			militarForeignWindow.setVisible(true);

			break;

		}

		case "botonEliminarMilitarForeignEliminar": {
			while (true) {
				try {
					deleteMilitarForeign();
					JOptionPane.showMessageDialog(militarForeignDeleteWindow,
							"Se ha eliminado con exito el Militar Extranjero");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(mw, "DATOS INCORRECTOS", "ERROR", 0);
				}
				militarForeignDeleteWindow.getPosicionTxt().setText("");
				break;
			}
			break;

		}

		// CASOS BOTONES CREAR MILITAR EXTRANJERO

		case "botonVolverMilitarExtranjeroCrear": {

			militarForeignCreateWindow.setVisible(false);
			militarForeignCreateWindow.getDocTxt().setText("");
			militarForeignCreateWindow.getNameTxt().setText("");
			militarForeignCreateWindow.getDayBirthTxt().setText("");
			militarForeignCreateWindow.getMonthBirthTxt().setText("");
			militarForeignCreateWindow.getYearBirthTxt().setText("");
			militarForeignCreateWindow.getCountryOfOriginTxt().setText("");
			militarForeignCreateWindow.getTimeInOurCountryTxt().setText("");
			militarForeignCreateWindow.getPersonalPhoto().setIcon(null);
			militarForeignWindow.setVisible(true);

			break;
		}
		case "botonCrearMilitarExtranjeroCrear": {
			while (true) {

				try {
					createMilitarForeign();
					JOptionPane.showMessageDialog(militarForeignCreateWindow,
							"Se ha creado con exito el Militar Extranjero");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(mw, "DATOS INCORRECTOS", "ERROR", 0);
				}
				militarForeignCreateWindow.getDocTxt().setText("");
				militarForeignCreateWindow.getNameTxt().setText("");
				militarForeignCreateWindow.getDayBirthTxt().setText("");
				militarForeignCreateWindow.getMonthBirthTxt().setText("");
				militarForeignCreateWindow.getYearBirthTxt().setText("");
				militarForeignCreateWindow.getCountryOfOriginTxt().setText("");
				militarForeignCreateWindow.getTimeInOurCountryTxt().setText("");
				militarForeignCreateWindow.getPersonalPhoto().setIcon(null);
				break;
			}
			break;
		}
		case "escogerArchivoBotonMilitarExtranjeroActualizar": {

			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpeg", "JPEG", "jpg", "JPG",
					"png", "PNG");
			fileChooser.setFileFilter(filter);

			int response = fileChooser.showOpenDialog(null);
			if (response == JFileChooser.APPROVE_OPTION) {

				String photoLocation = fileChooser.getSelectedFile().getPath();
				createCopyOfImage(photoLocation);
				photoLocation1 = createCopyOfImage(photoLocation);

				Image myImage = new ImageIcon(photoLocation).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(372, 385, Image.SCALE_DEFAULT));

				militarForeignUpdateWindow.getPersonalPhoto().setIcon(myIcon);
				;

			}

			break;
		}
		// CASOS VENTANA MOSTRAR MILITAR EXTRANJERO

		case "botonVolverMilitarForeignMostrar": {
			updateTableMilitarForeign();
			militarForeignWindow.setVisible(true);
			militarForeignShowWindow.setVisible(false);
			break;
		}
		case "botonImagenMilitarForeignMostrar": {
			imgWindowMilitarForeign.setVisible(true);
			militarForeignShowWindow.setVisible(false);
			updateBoxMilitarForeign();
			break;
		}

		// CASOS VENTANA MOSTRAR IMAGEN MILITAR EXTRANJERO

		case "botonActualizarMilitarForeignMostrarImagen": {
			int photoLocation = boxImageMilitarForeign(numPhoto);
			updateBoxMilitarForeign();
			try {
				Image myImage = new ImageIcon(
						militarForeignDAO.getForeignMiList().get(photoLocation).getPhotoLocation()).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(476, 453, Image.SCALE_DEFAULT));

				imgWindowMilitarForeign.getPhoto().setIcon(myIcon);

			} catch (IndexOutOfBoundsException e2) {
				Image myImage = new ImageIcon(
						militarForeignDAO.getForeignMiList().get(photoLocation + 1).getPhotoLocation()).getImage();
				ImageIcon myIcon = new ImageIcon(myImage.getScaledInstance(476, 453, Image.SCALE_DEFAULT));

				imgWindowMilitarForeign.getPhoto().setIcon(myIcon);

			}

			break;
		}
		case "botonVolverMilitarForeignMostrarImagen": {
			imgWindowMilitarForeign.setVisible(false);
			militarForeignShowWindow.setVisible(true);
			imgWindowMilitarForeign.getPhoto().setIcon(null);
			updateBoxMilitarForeign();
			break;
		}

		// CASOS BOTONES ACTUALIZAR MILITAR EXTRANJERO

		case "botonVolverMilitarExtranjeroActualizar": {

			militarForeignUpdateWindow.setVisible(false);
			militarForeignUpdateWindow.getDocTxt().setText("");
			militarForeignUpdateWindow.getNameTxt().setText("");
			militarForeignUpdateWindow.getDayBirthTxt().setText("");
			militarForeignUpdateWindow.getMonthBirthTxt().setText("");
			militarForeignUpdateWindow.getYearBirthTxt().setText("");
			militarForeignUpdateWindow.getCountryOriginTxt().setText("");
			militarForeignUpdateWindow.getTimeCountryTxt().setText("");
			militarForeignUpdateWindow.getPersonalPhoto().setIcon(null);
			militarForeignWindow.setVisible(true);

			break;
		}
		case "botonActualizarMilitarExtranjeroActualizar": {
			while (true) {

				try {
					updateMilitarForeign();
					JOptionPane.showMessageDialog(militarForeignUpdateWindow,
							"Se ha actualizado con exito el militar extranjero");
				} catch (NumberFormatException ex) {
				}
				militarForeignUpdateWindow.getDocTxt().setText("");
				militarForeignUpdateWindow.getNameTxt().setText("");
				militarForeignUpdateWindow.getDayBirthTxt().setText("");
				militarForeignUpdateWindow.getMonthBirthTxt().setText("");
				militarForeignUpdateWindow.getYearBirthTxt().setText("");
				militarForeignUpdateWindow.getCountryOriginTxt().setText("");
				militarForeignUpdateWindow.getTimeCountryTxt().setText("");
				militarForeignUpdateWindow.getPersonalPhoto().setIcon(null);
				break;
			}
			break;

		}

		default: {

			break;

		}
		}

	}

	/**
	 * Funcion que permite eliminar un Civil de la lista
	 * 
	 * @author Cristhian Diaz
	 */
	public void deleteCivil() {

		String pos = "";
		int index = 0;
		while (true) {
			try {
				checkIsNotANumber(pos);
				pos = civilDeleteWindow.getPosicionTxt().getText();
				checkIsNotANumber(pos);
				checkNegativeIntegerNumber(pos);
			} catch (NumberNotValidException e) {
				civilDeleteWindow.getPosicionTxt().setText("");

			} catch (NegativeNumberException e) {
				civilDeleteWindow.getPosicionTxt().setText("");
			}
			index = Integer.parseInt(pos);
			break;
		}
		civilDAO.delete(index);

	}

	/**
	 * Funcion que permite eliminar un Militar Local de la lista
	 * 
	 * @author Cristhian Diaz
	 */
	public void deleteMilitarLocal() {

		String pos = "";
		int index = 0;
		while (true) {
			try {
				checkIsNotANumber(pos);
				pos = militarLocalDeleteWindow.getPosicionTxt().getText();
				checkIsNotANumber(pos);
				checkNegativeIntegerNumber(pos);
			} catch (NumberNotValidException e) {
				militarLocalDeleteWindow.getPosicionTxt().setText("");

			} catch (NegativeNumberException e) {
				militarLocalDeleteWindow.getPosicionTxt().setText("");
			}
			index = Integer.parseInt(pos);
			break;
		}
		militarLocalDAO.delete(index);

	}

	/**
	 * Funcion que permite eliminar un MilitarExtranjero de la lista
	 * 
	 * @author Cristhian Diaz
	 */
	public void deleteMilitarForeign() {

		String pos = "";
		int index = 0;
		while (true) {
			try {
				checkIsNotANumber(pos);
				pos = militarForeignDeleteWindow.getPosicionTxt().getText();
				checkIsNotANumber(pos);
				checkNegativeIntegerNumber(pos);
			} catch (NumberNotValidException e) {
				militarForeignDeleteWindow.getPosicionTxt().setText("");

			} catch (NegativeNumberException e) {
				militarForeignDeleteWindow.getPosicionTxt().setText("");
			}
			index = Integer.parseInt(pos);
			break;
		}
		militarForeignDAO.delete(index);

	}

	/**
	 * Funcion que permite crear un Civil en la lista
	 * 
	 * @author Cristhian Diaz
	 */

	public void createCivil() {
		String document = "";
		String name = "";
		String dayOfBirth = "";
		String monthOfBirth = "";
		String yearOfBirth = "";
		String photoLocation = "";
		String age = "";
		String studiesLevel = "";
		String timeWorkingInArmy = "";

		int day = 0;
		int month = 0;
		int year = 0;
		while (true) {
			try {
				checkIsNotANumber(document);
				document = civilCreateWindow.getDocTxt().getText();
				checkIsNotANumber(document);
				checkNegativeLongNumber(document);

				name = civilCreateWindow.getNameTxt().getText();
				checkName(name);

				checkIsNotANumber(dayOfBirth);
				dayOfBirth = civilCreateWindow.getDayBirthTxt().getText();
				checkIsNotANumber(dayOfBirth);
				checkDay(dayOfBirth);
				checkNegativeIntegerNumber(dayOfBirth);

				checkIsNotANumber(monthOfBirth);
				monthOfBirth = civilCreateWindow.getMonthBirthTxt().getText();
				checkIsNotANumber(monthOfBirth);
				checkMonth(monthOfBirth);
				checkNegativeIntegerNumber(monthOfBirth);

				checkIsNotANumber(yearOfBirth);
				yearOfBirth = civilCreateWindow.getYearBirthTxt().getText();
				checkIsNotANumber(yearOfBirth);
				checkYear(yearOfBirth);
				checkNegativeIntegerNumber(yearOfBirth);

				studiesLevel = civilCreateWindow.getStudiesTxt().getText();
				checkName(studiesLevel);

				photoLocation = photoLocation1;

				checkIsNotANumber(timeWorkingInArmy);
				timeWorkingInArmy = civilCreateWindow.getTimeArmyTxt().getText();
				checkIsNotANumber(timeWorkingInArmy);
				checkNegativeIntegerNumber(timeWorkingInArmy);
			} catch (NumberNotValidException e) {

			} catch (NegativeNumberException e) {
				// TODO Auto-generated catch block
			} catch (NameNotValidException e) {
				// TODO Auto-generated catch block
			}

			day = Integer.parseInt(dayOfBirth);
			month = Integer.parseInt(monthOfBirth);
			year = Integer.parseInt(yearOfBirth);
			age = String.valueOf(personDAO.ageCalculation(day, month, year));
			break;
		}

		civilDAO.create(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation, studiesLevel,
				timeWorkingInArmy);
		try {
			checkIsEmpty(document, name, dayOfBirth, monthOfBirth, yearOfBirth, studiesLevel, photoLocation,
					timeWorkingInArmy);
		} catch (EmptyDataException e) {
			// TODO Auto-generated catch block
		}

	}

	/**
	 * Funcion que permite actualizar un Civil de la lista
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateCivil() {
		int index = 0;
		String document = "";
		String name = "";
		String dayOfBirth = "";
		String monthOfBirth = "";
		String yearOfBirth = "";
		String photoLocation = "";
		String age = "";
		String studiesLevel = "";
		String timeWorkingInArmy = "";

		int day = 0;
		int month = 0;
		int year = 0;
		index = Integer.parseInt(civilUpdateWindow.getIndexTxt().getText());

		document = civilUpdateWindow.getDocTxt().getText();

		name = civilUpdateWindow.getNameTxt().getText();

		dayOfBirth = civilUpdateWindow.getDayBirthTxt().getText();

		monthOfBirth = civilUpdateWindow.getMonthBirthTxt().getText();

		yearOfBirth = civilUpdateWindow.getYearBirthTxt().getText();

		photoLocation = photoLocation1;

		studiesLevel = civilUpdateWindow.getStudiesTxt().getText();

		timeWorkingInArmy = civilUpdateWindow.getTimeArmyTxt().getText();

		day = Integer.parseInt(dayOfBirth);
		month = Integer.parseInt(monthOfBirth);
		year = Integer.parseInt(yearOfBirth);
		age = String.valueOf(personDAO.ageCalculation(day, month, year));
		civilDAO.updateByIndex(index, document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation,
				studiesLevel, timeWorkingInArmy);

	}

	/**
	 * Funcion que permite crear un Militar Local en la lista
	 * 
	 * @author Cristhian Diaz
	 */
	public void createMilitarLocal() {
		String document = "";
		String name = "";
		String dayOfBirth = "";
		String monthOfBirth = "";
		String yearOfBirth = "";
		String photoLocation = "";
		String age = "";
		String rank = "";
		String serviceTime = "";

		int day = 0;
		int month = 0;
		int year = 0;
		while (true) {
			try {
				checkIsNotANumber(document);
				document = militarLocalCreateWindow.getDocTxt().getText();
				checkIsNotANumber(document);
				checkNegativeLongNumber(document);

				name = militarLocalCreateWindow.getNameTxt().getText();
				checkName(name);

				checkIsNotANumber(dayOfBirth);
				dayOfBirth = militarLocalCreateWindow.getDayBirthTxt().getText();
				checkIsNotANumber(dayOfBirth);
				checkDay(dayOfBirth);
				checkNegativeIntegerNumber(dayOfBirth);

				checkIsNotANumber(monthOfBirth);
				monthOfBirth = militarLocalCreateWindow.getMonthBirthTxt().getText();
				checkIsNotANumber(monthOfBirth);
				checkMonth(monthOfBirth);
				checkNegativeIntegerNumber(monthOfBirth);

				checkIsNotANumber(yearOfBirth);
				yearOfBirth = militarLocalCreateWindow.getYearBirthTxt().getText();
				checkIsNotANumber(yearOfBirth);
				checkYear(yearOfBirth);
				checkNegativeIntegerNumber(yearOfBirth);

				rank = militarLocalCreateWindow.getRankTxt().getText();
				checkName(rank);

				photoLocation = photoLocation1;

				checkIsNotANumber(serviceTime);
				serviceTime = militarLocalCreateWindow.getServiceTimeTxt().getText();
				checkIsNotANumber(serviceTime);
				checkNegativeIntegerNumber(serviceTime);
			} catch (NumberNotValidException e) {
				militarLocalCreateWindow.getDocTxt().setText("");
				militarLocalCreateWindow.getNameTxt().setText("");
				militarLocalCreateWindow.getDayBirthTxt().setText("");
				militarLocalCreateWindow.getMonthBirthTxt().setText("");
				militarLocalCreateWindow.getYearBirthTxt().setText("");
				militarLocalCreateWindow.getRankTxt().setText("");
				militarLocalCreateWindow.getServiceTimeTxt().setText("");
				militarLocalCreateWindow.getPersonalPhoto().setIcon(null);
			} catch (NegativeNumberException e) {
				militarLocalCreateWindow.getDocTxt().setText("");
				militarLocalCreateWindow.getNameTxt().setText("");
				militarLocalCreateWindow.getDayBirthTxt().setText("");
				militarLocalCreateWindow.getMonthBirthTxt().setText("");
				militarLocalCreateWindow.getYearBirthTxt().setText("");
				militarLocalCreateWindow.getRankTxt().setText("");
				militarLocalCreateWindow.getServiceTimeTxt().setText("");
				militarLocalCreateWindow.getPersonalPhoto().setIcon(null);
			} catch (NameNotValidException e) {
				militarLocalCreateWindow.getDocTxt().setText("");
				militarLocalCreateWindow.getNameTxt().setText("");
				militarLocalCreateWindow.getDayBirthTxt().setText("");
				militarLocalCreateWindow.getMonthBirthTxt().setText("");
				militarLocalCreateWindow.getYearBirthTxt().setText("");
				militarLocalCreateWindow.getRankTxt().setText("");
				militarLocalCreateWindow.getServiceTimeTxt().setText("");
				militarLocalCreateWindow.getPersonalPhoto().setIcon(null);
			}

			day = Integer.parseInt(dayOfBirth);
			month = Integer.parseInt(monthOfBirth);
			year = Integer.parseInt(yearOfBirth);
			age = String.valueOf(personDAO.ageCalculation(day, month, year));
			break;
		}

		militarLocalDAO.create(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation, rank,
				serviceTime);
		try {
			checkIsEmpty(document, name, dayOfBirth, monthOfBirth, yearOfBirth, rank, photoLocation, serviceTime);
		} catch (EmptyDataException e) {
			// TODO Auto-generated catch block
		}
	}

	/**
	 * Funcion que permite actualizar un Militar Local de la lista
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateMilitarLocal() {
		int index = 0;
		String document = "";
		String name = "";
		String dayOfBirth = "";
		String monthOfBirth = "";
		String yearOfBirth = "";
		String photoLocation = "";
		String age = "";
		String rank = "";
		String serviceTime = "";

		int day = 0;
		int month = 0;
		int year = 0;

		index = Integer.parseInt(militarLocalUpdateWindow.getIndexTxt().getText());

		document = militarLocalUpdateWindow.getDocTxt().getText();

		name = militarLocalUpdateWindow.getNameTxt().getText();

		dayOfBirth = militarLocalUpdateWindow.getDayBirthTxt().getText();

		monthOfBirth = militarLocalUpdateWindow.getMonthBirthTxt().getText();

		yearOfBirth = militarLocalUpdateWindow.getYearBirthTxt().getText();

		photoLocation = photoLocation1;

		rank = militarLocalUpdateWindow.getRankTxt().getText();

		serviceTime = militarLocalUpdateWindow.getServiceTimeTxt().getText();

		day = Integer.parseInt(dayOfBirth);
		month = Integer.parseInt(monthOfBirth);
		year = Integer.parseInt(yearOfBirth);
		age = String.valueOf(personDAO.ageCalculation(day, month, year));
		militarLocalDAO.updateByIndex(index, document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation,
				rank, serviceTime);

	}

	/**
	 * Funcion que permite crear un Militar extranjero en la lista
	 * 
	 * @author Cristhian Diaz
	 */
	public void createMilitarForeign() {
		String document = "";
		String name = "";
		String dayOfBirth = "";
		String monthOfBirth = "";
		String yearOfBirth = "";
		String photoLocation = "";
		String age = "";
		String countryOfOrigin = "";
		String timeInOurCountry = "";

		int day = 0;
		int month = 0;
		int year = 0;
		while (true) {
			try {
				checkIsNotANumber(document);
				document = militarForeignCreateWindow.getDocTxt().getText();
				checkIsNotANumber(document);
				checkNegativeLongNumber(document);

				name = militarForeignCreateWindow.getNameTxt().getText();
				checkName(name);

				checkIsNotANumber(dayOfBirth);
				dayOfBirth = militarForeignCreateWindow.getDayBirthTxt().getText();
				checkIsNotANumber(dayOfBirth);
				checkDay(dayOfBirth);
				checkNegativeIntegerNumber(dayOfBirth);

				checkIsNotANumber(monthOfBirth);
				monthOfBirth = militarForeignCreateWindow.getMonthBirthTxt().getText();
				checkIsNotANumber(monthOfBirth);
				checkMonth(monthOfBirth);
				checkNegativeIntegerNumber(monthOfBirth);

				checkIsNotANumber(yearOfBirth);
				yearOfBirth = militarForeignCreateWindow.getYearBirthTxt().getText();
				checkIsNotANumber(yearOfBirth);
				checkYear(yearOfBirth);
				checkNegativeIntegerNumber(yearOfBirth);

				countryOfOrigin = militarForeignCreateWindow.getCountryOfOriginTxt().getText();
				checkName(countryOfOrigin);

				photoLocation = photoLocation1;

				checkIsNotANumber(timeInOurCountry);
				timeInOurCountry = militarForeignCreateWindow.getTimeInOurCountryTxt().getText();
				checkIsNotANumber(timeInOurCountry);
				checkNegativeIntegerNumber(timeInOurCountry);
			} catch (NumberNotValidException e) {
				militarForeignCreateWindow.getDocTxt().setText("");
				militarForeignCreateWindow.getNameTxt().setText("");
				militarForeignCreateWindow.getDayBirthTxt().setText("");
				militarForeignCreateWindow.getMonthBirthTxt().setText("");
				militarForeignCreateWindow.getYearBirthTxt().setText("");
				militarForeignCreateWindow.getCountryOfOriginTxt().setText("");
				militarForeignCreateWindow.getTimeInOurCountryTxt().setText("");
				militarForeignCreateWindow.getPersonalPhoto().setIcon(null);
			} catch (NegativeNumberException e) {
				militarForeignCreateWindow.getDocTxt().setText("");
				militarForeignCreateWindow.getNameTxt().setText("");
				militarForeignCreateWindow.getDayBirthTxt().setText("");
				militarForeignCreateWindow.getMonthBirthTxt().setText("");
				militarForeignCreateWindow.getYearBirthTxt().setText("");
				militarForeignCreateWindow.getCountryOfOriginTxt().setText("");
				militarForeignCreateWindow.getTimeInOurCountryTxt().setText("");
				militarForeignCreateWindow.getPersonalPhoto().setIcon(null);
			} catch (NameNotValidException e) {
				militarForeignCreateWindow.getDocTxt().setText("");
				militarForeignCreateWindow.getNameTxt().setText("");
				militarForeignCreateWindow.getDayBirthTxt().setText("");
				militarForeignCreateWindow.getMonthBirthTxt().setText("");
				militarForeignCreateWindow.getYearBirthTxt().setText("");
				militarForeignCreateWindow.getCountryOfOriginTxt().setText("");
				militarForeignCreateWindow.getTimeInOurCountryTxt().setText("");
				militarForeignCreateWindow.getPersonalPhoto().setIcon(null);
			}

			day = Integer.parseInt(dayOfBirth);
			month = Integer.parseInt(monthOfBirth);
			year = Integer.parseInt(yearOfBirth);
			age = String.valueOf(personDAO.ageCalculation(day, month, year));
			break;
		}

		militarForeignDAO.create(document, name, dayOfBirth, monthOfBirth, yearOfBirth, age, photoLocation,
				countryOfOrigin, timeInOurCountry);
		try {
			checkIsEmpty(document, name, dayOfBirth, monthOfBirth, yearOfBirth, countryOfOrigin, photoLocation,
					timeInOurCountry);
		} catch (EmptyDataException e) {
			// TODO Auto-generated catch block
		}
	}

	/**
	 * Funcion que permite actualizar un Militar Extranjero de la lista
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateMilitarForeign() {
		int index = 0;
		String document = "";
		String name = "";
		String dayOfBirth = "";
		String monthOfBirth = "";
		String yearOfBirth = "";
		String photoLocation = "";
		String age = "";
		String countryOfOrigin = "";
		String timeCountry = "";

		int day = 0;
		int month = 0;
		int year = 0;

		index = Integer.parseInt(militarForeignUpdateWindow.getIndexTxt().getText());

		document = militarForeignUpdateWindow.getDocTxt().getText();

		name = militarForeignUpdateWindow.getNameTxt().getText();

		dayOfBirth = militarForeignUpdateWindow.getDayBirthTxt().getText();

		monthOfBirth = militarForeignUpdateWindow.getMonthBirthTxt().getText();

		yearOfBirth = militarForeignUpdateWindow.getYearBirthTxt().getText();

		photoLocation = photoLocation1;

		countryOfOrigin = militarForeignUpdateWindow.getCountryOriginTxt().getText();

		timeCountry = militarForeignUpdateWindow.getTimeCountryTxt().getText();

		day = Integer.parseInt(dayOfBirth);
		month = Integer.parseInt(monthOfBirth);
		year = Integer.parseInt(yearOfBirth);
		age = String.valueOf(personDAO.ageCalculation(day, month, year));
		militarForeignDAO.updateByIndex(index, document, name, dayOfBirth, monthOfBirth, yearOfBirth, age,
				photoLocation, countryOfOrigin, timeCountry);

	}

	/**
	 * Funcion que revisa excepciones de numeros no validos
	 * 
	 * @author Cristhian Diaz
	 */
	public void checkIsNotANumber(String num) throws NumberNotValidException {

		String message = "LOS NUMEROS SOLO PUEDEN SER NUMEROS";

		for (char c : num.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				JOptionPane.showMessageDialog(mw, message, "ERROR", 0);
				civilCreateWindow.getDocTxt().setText(null);
				civilCreateWindow.getDayBirthTxt().setText(null);
				civilCreateWindow.getMonthBirthTxt().setText(null);
				civilCreateWindow.getYearBirthTxt().setText(null);
				civilCreateWindow.getTimeArmyTxt().setText(null);
				civilCreateWindow.getNameTxt().setText(null);
				civilCreateWindow.getStudiesTxt().setText(null);
				civilCreateWindow.getPersonalPhoto().setIcon(null);
				throw new NumberNotValidException(message);
			}
		}

	}

	/**
	 * Funcion que revisa excepciones de numeros negativos enteros
	 * 
	 * @author Cristhian Diaz
	 */
	public void checkNegativeIntegerNumber(String num) throws NegativeNumberException {

		String message = "NINGUNO DE LOS NUMEROS PUEDE SER NEGATIVO";
		if (Integer.parseInt(num) < 0) {

			JOptionPane.showMessageDialog(mw, message, "ERROR", 0);
			civilCreateWindow.getDocTxt().setText(null);
			civilCreateWindow.getDayBirthTxt().setText(null);
			civilCreateWindow.getMonthBirthTxt().setText(null);
			civilCreateWindow.getYearBirthTxt().setText(null);
			civilCreateWindow.getTimeArmyTxt().setText(null);
			civilCreateWindow.getNameTxt().setText(null);
			civilCreateWindow.getStudiesTxt().setText(null);
			civilCreateWindow.getPersonalPhoto().setIcon(null);
			throw new NegativeNumberException(message);
		}

	}

	/**
	 * Funcion que revisa excepciones de numeros largos negativos
	 * 
	 * @author Cristhian Diaz
	 */
	public void checkNegativeLongNumber(String num) throws NegativeNumberException {

		String message = "NINGUNO DE LOS NUMEROS PUEDE SER NEGATIVO";
		if (Long.parseLong(num) < 0) {

			JOptionPane.showMessageDialog(mw, "NINGUNO DE LOS NUMEROS PUEDE SER NEGATIVO", "ERROR", 0);
			civilCreateWindow.getDocTxt().setText(null);
			civilCreateWindow.getDayBirthTxt().setText(null);
			civilCreateWindow.getMonthBirthTxt().setText(null);
			civilCreateWindow.getYearBirthTxt().setText(null);
			civilCreateWindow.getTimeArmyTxt().setText(null);
			civilCreateWindow.getNameTxt().setText(null);
			civilCreateWindow.getStudiesTxt().setText(null);
			civilCreateWindow.getPersonalPhoto().setIcon(null);
			throw new NegativeNumberException(message);
		}

	}

	/**
	 * Funcion que revisa excepciones de nombres
	 * 
	 * @author Cristhian Diaz
	 */
	public void checkName(String name) throws NameNotValidException {

		String message = "LOS NOMBRES NO CONTIENEN CARACTERES ESPECIALES";
		for (char c : name.toCharArray()) {
			if (!Character.isAlphabetic(c) && !Character.isWhitespace(c)) {
				JOptionPane.showMessageDialog(civilCreateWindow, message, "ERROR", 0);
				civilCreateWindow.getDocTxt().setText(null);
				civilCreateWindow.getDayBirthTxt().setText(null);
				civilCreateWindow.getMonthBirthTxt().setText(null);
				civilCreateWindow.getYearBirthTxt().setText(null);
				civilCreateWindow.getTimeArmyTxt().setText(null);
				civilCreateWindow.getNameTxt().setText(null);
				civilCreateWindow.getStudiesTxt().setText(null);
				civilCreateWindow.getPersonalPhoto().setIcon(null);
				throw new NameNotValidException(message);
			}
		}
	}

	/**
	 * Funcion que revisa si el dia insertado es valido
	 * 
	 * @author Cristhian Diaz
	 */
	public void checkDay(String day) {

		int dayCheck = Integer.parseInt(day);

		if (dayCheck > 30) {
			JOptionPane.showMessageDialog(mw, "LOS DIAS DEL MES NO PUEDEN SER MAYORES A 30", "ERROR", 0);
			civilCreateWindow.getDocTxt().setText(null);
			civilCreateWindow.getDayBirthTxt().setText(null);
			civilCreateWindow.getMonthBirthTxt().setText(null);
			civilCreateWindow.getYearBirthTxt().setText(null);
			civilCreateWindow.getTimeArmyTxt().setText(null);
			civilCreateWindow.getNameTxt().setText(null);
			civilCreateWindow.getStudiesTxt().setText(null);
			civilCreateWindow.getPersonalPhoto().setIcon(null);
			militarLocalCreateWindow.getDocTxt().setText(null);
			militarLocalCreateWindow.getDayBirthTxt().setText(null);
			militarLocalCreateWindow.getMonthBirthTxt().setText(null);
			militarLocalCreateWindow.getYearBirthTxt().setText(null);
			militarLocalCreateWindow.getRankTxt().setText(null);
			militarLocalCreateWindow.getNameTxt().setText(null);
			militarLocalCreateWindow.getServiceTimeTxt().setText(null);
			militarLocalCreateWindow.getPersonalPhoto().setIcon(null);
			militarForeignCreateWindow.getDocTxt().setText(null);
			militarForeignCreateWindow.getDayBirthTxt().setText(null);
			militarForeignCreateWindow.getMonthBirthTxt().setText(null);
			militarForeignCreateWindow.getYearBirthTxt().setText(null);
			militarForeignCreateWindow.getCountryOfOriginTxt().setText(null);
			militarForeignCreateWindow.getNameTxt().setText(null);
			militarForeignCreateWindow.getTimeInOurCountryTxt().setText(null);
			militarForeignCreateWindow.getPersonalPhoto().setIcon(null);
		}

	}

	/**
	 * Funcion que revisa si el mes insertado es valido
	 * 
	 * @author Cristhian Diaz
	 */
	public void checkMonth(String month) {

		int monthCheck = Integer.parseInt(month);

		if (monthCheck > 12) {
			JOptionPane.showMessageDialog(mw, "NO HAY MAS DE 12 MESES EN EL AÑO", "ERROR", 0);
			civilCreateWindow.getDocTxt().setText(null);
			civilCreateWindow.getDayBirthTxt().setText(null);
			civilCreateWindow.getMonthBirthTxt().setText(null);
			civilCreateWindow.getYearBirthTxt().setText(null);
			civilCreateWindow.getTimeArmyTxt().setText(null);
			civilCreateWindow.getNameTxt().setText(null);
			civilCreateWindow.getStudiesTxt().setText(null);
			civilCreateWindow.getPersonalPhoto().setIcon(null);
			militarLocalCreateWindow.getDocTxt().setText(null);
			militarLocalCreateWindow.getDayBirthTxt().setText(null);
			militarLocalCreateWindow.getMonthBirthTxt().setText(null);
			militarLocalCreateWindow.getYearBirthTxt().setText(null);
			militarLocalCreateWindow.getRankTxt().setText(null);
			militarLocalCreateWindow.getNameTxt().setText(null);
			militarLocalCreateWindow.getServiceTimeTxt().setText(null);
			militarLocalCreateWindow.getPersonalPhoto().setIcon(null);
			militarForeignCreateWindow.getDocTxt().setText(null);
			militarForeignCreateWindow.getDayBirthTxt().setText(null);
			militarForeignCreateWindow.getMonthBirthTxt().setText(null);
			militarForeignCreateWindow.getYearBirthTxt().setText(null);
			militarForeignCreateWindow.getCountryOfOriginTxt().setText(null);
			militarForeignCreateWindow.getNameTxt().setText(null);
			militarForeignCreateWindow.getTimeInOurCountryTxt().setText(null);
			militarForeignCreateWindow.getPersonalPhoto().setIcon(null);
		}

	}

	/**
	 * Funcion que revisa si el ano insertado es valido
	 * 
	 * @author Cristhian Diaz
	 */
	public void checkYear(String year) {

		int yearCheck = Integer.parseInt(year);

		LocalDate todayDate = LocalDate.now();
		int actualYear = todayDate.getYear();
		if (yearCheck > actualYear) {

			JOptionPane.showMessageDialog(mw, "TU FECHA DE NACIMIENTO NO PUEDE SER MAYOR AL AÑO ACTUAL", "ERROR", 0);
			civilCreateWindow.getDocTxt().setText(null);
			civilCreateWindow.getDayBirthTxt().setText(null);
			civilCreateWindow.getMonthBirthTxt().setText(null);
			civilCreateWindow.getYearBirthTxt().setText(null);
			civilCreateWindow.getTimeArmyTxt().setText(null);
			civilCreateWindow.getNameTxt().setText(null);
			civilCreateWindow.getStudiesTxt().setText(null);
			civilCreateWindow.getPersonalPhoto().setIcon(null);
			militarLocalCreateWindow.getDocTxt().setText(null);
			militarLocalCreateWindow.getDayBirthTxt().setText(null);
			militarLocalCreateWindow.getMonthBirthTxt().setText(null);
			militarLocalCreateWindow.getYearBirthTxt().setText(null);
			militarLocalCreateWindow.getRankTxt().setText(null);
			militarLocalCreateWindow.getNameTxt().setText(null);
			militarLocalCreateWindow.getServiceTimeTxt().setText(null);
			militarLocalCreateWindow.getPersonalPhoto().setIcon(null);
			militarForeignCreateWindow.getDocTxt().setText(null);
			militarForeignCreateWindow.getDayBirthTxt().setText(null);
			militarForeignCreateWindow.getMonthBirthTxt().setText(null);
			militarForeignCreateWindow.getYearBirthTxt().setText(null);
			militarForeignCreateWindow.getCountryOfOriginTxt().setText(null);
			militarForeignCreateWindow.getNameTxt().setText(null);
			militarForeignCreateWindow.getTimeInOurCountryTxt().setText(null);
			militarForeignCreateWindow.getPersonalPhoto().setIcon(null);
		}

	}

	/**
	 * Funcion que revisa excepcion de datos vacios
	 * 
	 * @author Cristhian Diaz
	 */
	public void checkIsEmpty(String document, String name, String dayOfBirth, String monthOfBirth, String yearOfBirth,
			String studiesLevel, String photoLocation, String timeWorkingInArmy) throws EmptyDataException {

		String message = "TODOS LOS ESPACIOS DEBEN ESTAR COMPELTOS";
		if (document.equals("") || name.equals("") || dayOfBirth.equals("") || dayOfBirth.equals("")
				|| monthOfBirth.equals("") || yearOfBirth.equals("") || studiesLevel.equals("")
				|| timeWorkingInArmy.equals("") || photoLocation.equals("")) {

			JOptionPane.showMessageDialog(mw, "TODOS LOS ESPACIOS DEBEN ESTAR COMPELTOS", "ERROR", 0);
			throw new EmptyDataException(message);
		} else {
		}
	}

	/**
	 * Funcion que genera una copia de la imagen
	 * 
	 * @author Cristhian Diaz
	 */
	public String createCopyOfImage(String photoLocation) {
		File newFile = new File(photoLocation);
		String dest = "";
		if (newFile != null) {

			try {

				dest = "src/Images/" + newFile.getName();
				Path destiny = Paths.get(dest);
				String orig = newFile.getPath();
				Path origin = Paths.get(orig);
				Files.copy(origin, destiny);

			} catch (Exception e) {

			}
		}
		String photoLocation1 = "";
		photoLocation1 = dest;
		return photoLocation1;
	}

	/**
	 * Funcion que muestra la tabla de datos del Civil
	 * 
	 * @author Cristhian Diaz
	 */
	public void showTableCivil() {
		for (int i = 0; i < civilDAO.getCivilList().size(); i++) {
			String document = Long.toString(civilDAO.getCivilList().get(i).getDocument());
			String name = civilDAO.getCivilList().get(i).getName();
			String day = Integer.toString(civilDAO.getCivilList().get(i).getDayOfBirth());
			int dayNum = civilDAO.getCivilList().get(i).getDayOfBirth();
			String month = Integer.toString(civilDAO.getCivilList().get(i).getMonthOfBirth());
			int monthNum = civilDAO.getCivilList().get(i).getMonthOfBirth();
			String year = Integer.toString(civilDAO.getCivilList().get(i).getYearOfBirth());
			int yearNum = civilDAO.getCivilList().get(i).getYearOfBirth();
			String age = String.valueOf(personDAO.ageCalculation(dayNum, monthNum, yearNum));
			String studiesLvl = civilDAO.getCivilList().get(i).getStudiesLevel();
			String timeWorking = Integer.toString(civilDAO.getCivilList().get(i).getTimeWorkingInArmy());

			Object[] data = { document, name, day, month, year, age, studiesLvl, timeWorking };
			civilShowWindow.getTablePanel().getModel().addRow(data);

		}

	}

	/**
	 * Funcion que actualiza la tabla de datos del Civil
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateTableCivil() {

		for (int i = civilDAO.getCivilList().size() - 1; i >= 0; i--) {

			civilShowWindow.getTablePanel().getModel().removeRow(i);

		}

	}

	/**
	 * Funcion que agrega al menu despegable los nombres de los objetos de Civil
	 * 
	 * @author Cristhian Diaz
	 */
	public Integer boxImageCivil(int photoNum) {

		for (int i = 0; i < civilDAO.getCivilList().size(); i++) {
			imgWindowCivil.getComboCivil().addItem((civilDAO.getCivilList().get(i).getName()));
		}
		Object photolocationaux = imgWindowCivil.getComboCivil().getSelectedIndex();
		numPhoto = Integer.parseInt(photolocationaux.toString());
		return numPhoto;
	}

	/**
	 * Funcion que actualiza el menu despegable de los objetos de Civil
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateBoxCivil() {
		if (!civilDAO.getCivilList().isEmpty()) {
			imgWindowCivil.getComboCivil().removeAllItems();
			for (int i = 0; i < civilDAO.getCivilList().size(); i++) {
				imgWindowCivil.getComboCivil().addItem(civilDAO.getCivilList().get(i).getName());
			}
		}

	}

	/**
	 * Funcion que muestra la tabla de datos del Militar Local
	 * 
	 * @author Cristhian Diaz
	 */
	public void showTableMilitarLocal() {
		for (int i = 0; i < militarLocalDAO.getLocalMiList().size(); i++) {
			String document = Long.toString(militarLocalDAO.getLocalMiList().get(i).getDocument());
			String name = militarLocalDAO.getLocalMiList().get(i).getName();
			String day = Integer.toString(militarLocalDAO.getLocalMiList().get(i).getDayOfBirth());
			int dayNum = militarLocalDAO.getLocalMiList().get(i).getDayOfBirth();
			String month = Integer.toString(militarLocalDAO.getLocalMiList().get(i).getMonthOfBirth());
			int monthNum = militarLocalDAO.getLocalMiList().get(i).getMonthOfBirth();
			String year = Integer.toString(militarLocalDAO.getLocalMiList().get(i).getYearOfBirth());
			int yearNum = militarLocalDAO.getLocalMiList().get(i).getYearOfBirth();
			String age = String.valueOf(personDAO.ageCalculation(dayNum, monthNum, yearNum));
			String rank = militarLocalDAO.getLocalMiList().get(i).getRank();
			String serviceTime = Integer.toString(militarLocalDAO.getLocalMiList().get(i).getServiceTime());

			Object[] data = { document, name, day, month, year, age, rank, serviceTime };
			militarLocalShowWindow.getTablePanel().getModel().addRow(data);

		}

	}

	/**
	 * Funcion que actualiza la tabla de datos del Militar Local
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateTableMilitarLocal() {
		for (int i = militarLocalDAO.getLocalMiList().size() - 1; i >= 0; i--) {

			militarLocalShowWindow.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion que agrega al menu despegable los nombres de los objetos de Militar
	 * Local
	 * 
	 * @author Cristhian Diaz
	 */
	public Integer boxImageMilitarLocal(int photoNum) {

		for (int i = 0; i < militarLocalDAO.getLocalMiList().size(); i++) {
			imgWindowMilitarLocal.getComboMilitarLocal().addItem((militarLocalDAO.getLocalMiList().get(i).getName()));
		}
		Object photolocationaux = imgWindowMilitarLocal.getComboMilitarLocal().getSelectedIndex();

		numPhoto = Integer.parseInt(photolocationaux.toString());
		return numPhoto;
	}

	/**
	 * Funcion que actualiza el menu despegable de los objetos de Militar Local
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateBoxMilitarLocal() {
		if (!militarLocalDAO.getLocalMiList().isEmpty()) {
			imgWindowMilitarLocal.getComboMilitarLocal().removeAllItems();
			for (int i = 0; i < militarLocalDAO.getLocalMiList().size(); i++) {
				imgWindowMilitarLocal.getComboMilitarLocal().addItem(militarLocalDAO.getLocalMiList().get(i).getName());
			}
		}

	}

	/**
	 * Funcion que muestra la tabla de datos del Militar Extranjero
	 * 
	 * @author Cristhian Diaz
	 */
	public void showTableMilitarForeign() {
		for (int i = 0; i < militarForeignDAO.getForeignMiList().size(); i++) {
			String document = Long.toString(militarForeignDAO.getForeignMiList().get(i).getDocument());
			String name = militarForeignDAO.getForeignMiList().get(i).getName();
			String day = Integer.toString(militarLocalDAO.getLocalMiList().get(i).getDayOfBirth());
			int dayNum = militarForeignDAO.getForeignMiList().get(i).getDayOfBirth();
			String month = Integer.toString(militarForeignDAO.getForeignMiList().get(i).getMonthOfBirth());
			int monthNum = militarForeignDAO.getForeignMiList().get(i).getMonthOfBirth();
			String year = Integer.toString(militarForeignDAO.getForeignMiList().get(i).getYearOfBirth());
			int yearNum = militarForeignDAO.getForeignMiList().get(i).getYearOfBirth();
			String age = String.valueOf(personDAO.ageCalculation(dayNum, monthNum, yearNum));
			String countryOfOrigin = militarForeignDAO.getForeignMiList().get(i).getCountryOfOrigin();
			String timeInOurCountry = Integer
					.toString(militarForeignDAO.getForeignMiList().get(i).getTimeInOurCountry());

			Object[] data = { document, name, day, month, year, age, countryOfOrigin, timeInOurCountry };
			militarForeignShowWindow.getTablePanel().getModel().addRow(data);

		}

	}

	/**
	 * Funcion que actualiza la tabla de datos del Militar Extranjero
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateTableMilitarForeign() {
		for (int i = militarForeignDAO.getForeignMiList().size() - 1; i >= 0; i--) {

			militarForeignShowWindow.getTablePanel().getModel().removeRow(i);

		}
	}

	/**
	 * Funcion que agrega al menu desplegable los nombres de Militar Extranjero
	 * 
	 * @author Cristhian Diaz
	 */
	public Integer boxImageMilitarForeign(int photoNum) {

		for (int i = 0; i < militarForeignDAO.getForeignMiList().size(); i++) {
			imgWindowMilitarForeign.getComboMilitarForeign()
					.addItem((militarForeignDAO.getForeignMiList().get(i).getName()));
		}
		Object photolocationaux = imgWindowMilitarForeign.getComboMilitarForeign().getSelectedIndex();

		numPhoto = Integer.parseInt(photolocationaux.toString());
		return numPhoto;
	}

	/**
	 * Funcion que actualiza el menu desplegable los nombres de Militar Extranjero
	 * 
	 * @author Cristhian Diaz
	 */
	public void updateBoxMilitarForeign() {
		if (!militarForeignDAO.getForeignMiList().isEmpty()) {
			imgWindowMilitarForeign.getComboMilitarForeign().removeAllItems();
			for (int i = 0; i < militarForeignDAO.getForeignMiList().size(); i++) {
				imgWindowMilitarForeign.getComboMilitarForeign()
						.addItem(militarForeignDAO.getForeignMiList().get(i).getName());
			}
		}

	}
}