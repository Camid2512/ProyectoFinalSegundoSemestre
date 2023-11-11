package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de crear apostador
 * @author Cristhian Diaz 
 * @author Santiago Rueda
 * @version 1.0
 * @since 10/11/2023*/

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

public class CreateGamblerWindow extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private static final long serialVersionUID = -2874008353487983310L;
	
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	private JButton exit, back, createGambler;
	
	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JLabel mainImage;
	
	/**
	 * Estos son los atributos de los campos de texto
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JTextField venueName;
	
	/**
	 * Estos son los atributos de los ComboBox
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JComboBox<String> comboLocation;
	
	/**
	 * Estos son los atributos de los spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JSpinner numEmployes;
	
	/**
	 * Estos son los atributos del numero de modelo del spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private SpinnerNumberModel n;
	
	/** 
	 * Este es el constructor vacio de la clase ventana de crear apostador
	 * @author Cristhian Diaz 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	public CreateGamblerWindow() {
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

		createGambler = new JButton();
		createGambler.setBounds(444, 527, 401, 75);
		createGambler.setToolTipText("Crear sede nueva");
		createGambler.setBackground(new Color(0, 0, 0, 0));
		createGambler.setOpaque(false);
		createGambler.setContentAreaFilled(false);
		createGambler.setBorderPainted(false);
		add(createGambler);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/creategambler.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}
	
	/**
	 * Este es el getter del boton salir
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getExit() {
		return exit;
	}
	
	/**
	 * Este es el setter del boton salir
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setExit(JButton exit) {
		this.exit = exit;
	}
	
	/**
	 * Este es el getter del boton atras
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getBack() {
		return back;
	}
	
	/**
	 * Este es el setter del boton atras
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setBack(JButton back) {
		this.back = back;
	}
	
	/**
	 * Este es el getter del boton crear apostador
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getCreateGambler() {
		return createGambler;
	}
	
	/**
	 * Este es el setter del boton crear apostador
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setCreateGambler(JButton createVenue) {
		this.createGambler = createVenue;
	}
	
	/**
	 * Este es el getter de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JLabel getMainImage() {
		return mainImage;
	}
	
	/**
	 * Este es el setter de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}
	
	/**
	 * Este es el getter del campo del nombre de la sede
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JTextField getVenueName() {
		return venueName;
	}
	
	/**
	 * Este es el setter del campo del nombre de la sede
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setVenueName(JTextField venueName) {
		this.venueName = venueName;
	}
	
	/**
	 * Este es el getter del ComboBox de localidad
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JComboBox<String> getComboLocation() {
		return comboLocation;
	}
	
	/**
	 * Este es el setter del ComboBox de localidad
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setComboLocation(JComboBox<String> comboLocation) {
		this.comboLocation = comboLocation;
	}
	
	/**
	 * Este es el getter del Spinner del numero de empleados
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JSpinner getNumEmployes() {
		return numEmployes;
	}
	
	/**
	 * Este es el setter del Spinner del numero de empleados
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setNumEmployes(JSpinner numEmployes) {
		this.numEmployes = numEmployes;
	}
	
	/**
	 * Este es el getter del numero de modelo del spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public SpinnerNumberModel getN() {
		return n;
	}
	
	/**
	 * Este es el setter del numero de modelo del spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setN(SpinnerNumberModel n) {
		this.n = n;
	}
	
	/**
	 * Este es el getter del serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
