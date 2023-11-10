package co.edu.unbosque.view;

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

public class CreateVenueWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2874008353487983310L;

	private JButton exit, back, createVenue;
	private JLabel mainImage;
	private JTextField venueName;
	private JComboBox<String> location;
	private JSpinner numEmployes;
	private SpinnerNumberModel n;

	public CreateVenueWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Registro Sesion");
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

		location = new JComboBox<String>();
		location.setBounds(330, 279, 622, 68);
		location.setBackground(new Color(225, 223, 228));
		location.setForeground(Color.black);
		location.setFont(new Font("Arial", 1, 25));
		location.addItem("");
		location.addItem("ANTONIO NARIÑO");
		location.addItem("BARRIOS UNIDOS");
		location.addItem("BOSA");
		location.addItem("CHAPINERO");
		location.addItem("CIUDAD BOLIVAR");
		location.addItem("ENGATIVA");
		location.addItem("FONTIBON");
		location.addItem("KENNEDY");
		location.addItem("LA CANDELARIA");
		location.addItem("LOS MARTIRES");
		location.addItem("PUENTE ARANDA");
		location.addItem("RAFAEL URIBE URIBE");
		location.addItem("SAN CRISTOBAL");
		location.addItem("SANTA FE");
		location.addItem("SUBA");
		location.addItem("SUMAPAZ");
		location.addItem("TEUSAQUILLO");
		location.addItem("TUNJUELITO");
		location.addItem("USAQUEN");
		location.addItem("USME");
		add(location);

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

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	public JButton getCreateVenue() {
		return createVenue;
	}

	public void setCreateVenue(JButton createVenue) {
		this.createVenue = createVenue;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JTextField getVenueName() {
		return venueName;
	}

	public void setVenueName(JTextField venueName) {
		this.venueName = venueName;
	}

//	public JComboBox<String> getLocation() {
//		return location;
//	}

	public void setLocation(JComboBox<String> location) {
		this.location = location;
	}

	public JSpinner getNumEmployes() {
		return numEmployes;
	}

	public void setNumEmployes(JSpinner numEmployes) {
		this.numEmployes = numEmployes;
	}

	public SpinnerNumberModel getN() {
		return n;
	}

	public void setN(SpinnerNumberModel n) {
		this.n = n;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
