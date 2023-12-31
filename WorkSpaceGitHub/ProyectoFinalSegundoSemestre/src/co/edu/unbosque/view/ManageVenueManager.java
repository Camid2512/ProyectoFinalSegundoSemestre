package co.edu.unbosque.view;

/** 
 * Administrar sedes, jefe
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


/** 
 * Administrar sedes, jefe
 * @author Cristhian Diaz 
 * @author Santiago Rueda
 * @version 1.0
 * @since 10/11/2023*/
public class ManageVenueManager extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 */
	private static final long serialVersionUID = 3986654240221857404L;

	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	private JButton exit, back, createVenue, createCashier;

	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	private JLabel mainImage;

	/**
	 * Estos son los atributos de los campos de texto
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	private JTextField venueName;

	/**
	 * Estos son los atributos de los ComboBox
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	private JComboBox<String> comboLocation;

	/**
	 * Estos son los atributos de los spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	private JSpinner numEmployes;

	/**
	 * Estos son los atributos del numero de modelo del spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	private SpinnerNumberModel n;

	/**
	 * Este es el constructor vacio de la clase ventana de crear sede
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	public ManageVenueManager() {
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
		comboLocation.setEnabled(false);
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
		createVenue.setBounds(186, 527, 401, 75);
		createVenue.setToolTipText("Actualizar sede");
		createVenue.setBackground(new Color(0, 0, 0, 0));
		createVenue.setOpaque(false);
		createVenue.setContentAreaFilled(false);
		createVenue.setBorderPainted(false);
		add(createVenue);

		createCashier = new JButton();
		createCashier.setBounds(680, 527, 401, 75);
		createCashier.setToolTipText("Crear Cajero");
		createCashier.setBackground(new Color(0, 0, 0, 0));
		createCashier.setOpaque(false);
		createCashier.setContentAreaFilled(false);
		createCashier.setBorderPainted(false);
		add(createCashier);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/ajustesedemanager.png").getImage();

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
	 * Obtiene el botón para crear sedes.
	 */
	public JButton getCreateVenue() {
		return createVenue;
	}

	/**
	 * Establece el botón para crear sedes.
	 */
	public void setCreateVenue(JButton createVenue) {
		this.createVenue = createVenue;
	}

	/**
	 * Obtiene el botón para crear cajeros.
	 */
	public JButton getCreateCashier() {
		return createCashier;
	}

	/**
	 * Establece el botón para crear cajeros.
	 */
	public void setCreateCashier(JButton createCashier) {
		this.createCashier = createCashier;
	}

	/**
	 * Obtiene la imagen principal.
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Establece la imagen principal.
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Obtiene el nombre de la sede.
	 */
	public JTextField getVenueName() {
		return venueName;
	}

	/**
	 * Establece el nombre de la sede.
	 */
	public void setVenueName(JTextField venueName) {
		this.venueName = venueName;
	}

	/**
	 * Obtiene la lista desplegable de ubicaciones.
	 */
	public JComboBox<String> getComboLocation() {
		return comboLocation;
	}

	/**
	 * Establece la lista desplegable de ubicaciones.
	 */
	public void setComboLocation(JComboBox<String> comboLocation) {
		this.comboLocation = comboLocation;
	}

	/**
	 * Obtiene el spinner para el número de empleados.
	 */
	public JSpinner getNumEmployes() {
		return numEmployes;
	}

	/**
	 * Establece el spinner para el número de empleados.
	 */
	public void setNumEmployes(JSpinner numEmployes) {
		this.numEmployes = numEmployes;
	}

	/**
	 * Obtiene el modelo de spinner.
	 */
	public SpinnerNumberModel getN() {
		return n;
	}

	/**
	 * Establece el modelo de spinner.
	 */
	public void setN(SpinnerNumberModel n) {
		this.n = n;
	}

	/**
	 * Obtiene el número de versión de serialización.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
