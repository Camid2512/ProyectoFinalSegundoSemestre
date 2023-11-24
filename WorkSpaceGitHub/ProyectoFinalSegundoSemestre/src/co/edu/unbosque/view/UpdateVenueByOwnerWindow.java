package co.edu.unbosque.view;
/**
 * UpdateVenueByOwnerWindow representa una ventana para actualizar información relacionada
 * con un lugar de eventos o un lugar para realizar apuestas. Permite al propietario modificar
 * datos específicos del lugar.
 * 
 * Autor: SOFTPYLSA
 * Versión: 1.0
 * Fecha: 10/11/2023
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;


/**
 * UpdateVenueByOwnerWindow representa una ventana para actualizar información relacionada
 * con un lugar de eventos o un lugar para realizar apuestas. Permite al propietario modificar
 * datos específicos del lugar.
 * 
 * Autor: SOFTPYLSA
 * Versión: 1.0
 * Fecha: 10/11/2023
 */
public class UpdateVenueByOwnerWindow extends JFrame {


	
	/**
     * Número de versión para el control de serialización.
     */
	private static final long serialVersionUID = -4408642502855127544L;

	/** Botones para salir, retroceder y crear el lugar. */
	private JButton exit, back, createVenue;
	

    /** Etiqueta principal de la imagen. */
	private JLabel mainImage;
	
	   /** Campo de texto para el nombre del lugar. */
	private JTextField venueName;
	
	/** ComboBox para seleccionar la ubicación del lugar. */
	private JComboBox<String> comboLocation;
	
	 /** Spinner para la cantidad de empleados. */
	private JSpinner numEmployes;
	private SpinnerNumberModel n;

	
	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */
	public UpdateVenueByOwnerWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CREAR SEDE");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		exit = new JButton();
		exit.setBounds(1199, 7, 74, 72);
		exit.setToolTipText("SALIR DEL PROGRAMA");
		exit.setBackground(new Color(0, 0, 0, 0));
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		add(exit);

		back = new JButton();
		back.setBounds(19, 637, 73, 73);
		back.setToolTipText("VOLVER");
		back.setBackground(new Color(0, 0, 0, 0));
		back.setOpaque(false);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		add(back);

		venueName = new JTextField();
		venueName.setBounds(330, 154, 622, 68);
		venueName.setBackground(new Color(0, 0, 0, 0));
		venueName.setOpaque(false);
		venueName.setBorder(new EmptyBorder(15, 15, 15, 15));
		venueName.setFont(new Font("Arial", 1, 25));
		venueName.setForeground(Color.white);
		add(venueName);

		comboLocation = new JComboBox<>();
		comboLocation.setBounds(330, 279, 622, 68);
		comboLocation.setBackground(new Color(225, 223, 228));
		comboLocation.setForeground(Color.black);
		comboLocation.setFont(new Font("Arial", 1, 25));
		comboLocation.addItem("");
		comboLocation.addItem("ANTONIO NARIÑO");
		comboLocation.addItem("BARRIOS UNIDOS");
		comboLocation.addItem("BOSA");
		comboLocation.addItem("CHAPINERO");
		comboLocation.addItem("CIUDAD BOLIVAR");
		comboLocation.addItem("ENGATIVA");
		comboLocation.addItem("FONTIBON");
		comboLocation.addItem("KENNEDY");
		comboLocation.addItem("LA CANDELARIA");
		comboLocation.addItem("LOS MARTIRES");
		comboLocation.addItem("PUENTE ARANDA");
		comboLocation.addItem("RAFAEL URIBE URIBE");
		comboLocation.addItem("SAN CRISTOBAL");
		comboLocation.addItem("SANTA FE");
		comboLocation.addItem("SUBA");
		comboLocation.addItem("SUMAPAZ");
		comboLocation.addItem("TEUSAQUILLO");
		comboLocation.addItem("TUNJUELITO");
		comboLocation.addItem("USAQUEN");
		comboLocation.addItem("USME");
		add(comboLocation);

		numEmployes = new JSpinner();
		numEmployes.setBounds(330, 402, 622, 68);
		n = new SpinnerNumberModel();
		n.setMinimum(0);
		numEmployes.setModel(n);
		numEmployes.setBorder(new EmptyBorder(20, 200, 20, 20));
		numEmployes.setFont(new Font("Arial", 1, 25));
		numEmployes.setForeground(new Color(188, 186, 190));
		numEmployes.setBackground(new Color(188, 186, 190));
		numEmployes.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(numEmployes);

		createVenue = new JButton();
		createVenue.setBounds(444, 527, 401, 75);
		createVenue.setToolTipText("Crear sede nueva");
		createVenue.setBackground(new Color(0, 0, 0, 0));
		createVenue.setOpaque(false);
		createVenue.setContentAreaFilled(false);
		createVenue.setBorderPainted(false);
		add(createVenue);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/createvenue.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	/**
	 * Obtiene el botón de salida.
	 */
	public JButton getExit() {
	    return exit;
	}

	/**
	 * Establece el botón de salida.
	 */
	public void setExit(JButton exit) {
	    this.exit = exit;
	}

	/**
	 * Obtiene el botón de retroceso.
	 */
	public JButton getBack() {
	    return back;
	}

	/**
	 * Establece el botón de retroceso.
	 */
	public void setBack(JButton back) {
	    this.back = back;
	}

	/**
	 * Obtiene el botón para crear un lugar.
	 */
	public JButton getCreateVenue() {
	    return createVenue;
	}

	/**
	 * Establece el botón para crear un lugar.
	 */
	public void setCreateVenue(JButton createVenue) {
	    this.createVenue = createVenue;
	}

	/**
	 * Obtiene la etiqueta de imagen principal.
	 */
	public JLabel getMainImage() {
	    return mainImage;
	}

	/**
	 * Establece la etiqueta de imagen principal.
	 */
	public void setMainImage(JLabel mainImage) {
	    this.mainImage = mainImage;
	}

	/**
	 * Obtiene el campo de texto para el nombre del lugar.
	 */
	public JTextField getVenueName() {
	    return venueName;
	}

	/**
	 * Establece el campo de texto para el nombre del lugar.
	 */
	public void setVenueName(JTextField venueName) {
	    this.venueName = venueName;
	}

	/**
	 * Obtiene el componente de selección de ubicación.
	 */
	public JComboBox<String> getComboLocation() {
	    return comboLocation;
	}

	/**
	 * Establece el componente de selección de ubicación.
	 */
	public void setComboLocation(JComboBox<String> comboLocation) {
	    this.comboLocation = comboLocation;
	}

	/**
	 * Obtiene el componente de selección numérica para el número de empleados.
	 */
	public JSpinner getNumEmployes() {
	    return numEmployes;
	}

	/**
	 * Establece el componente de selección numérica para el número de empleados.
	 */
	public void setNumEmployes(JSpinner numEmployes) {
	    this.numEmployes = numEmployes;
	}

	/**
	 * Obtiene el modelo de números asociado al JSpinner.
	 */
	public SpinnerNumberModel getN() {
	    return n;
	}

	/**
	 * Establece el modelo de números para el JSpinner.
	 */
	public void setN(SpinnerNumberModel n) {
	    this.n = n;
	}

	/**
	 * Obtiene el identificador serial de la versión de la clase.
	 */
	public static long getSerialversionuid() {
	    return serialVersionUID;
	}

}
