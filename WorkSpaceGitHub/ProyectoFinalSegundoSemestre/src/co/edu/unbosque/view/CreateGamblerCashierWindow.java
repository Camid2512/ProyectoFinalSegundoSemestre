package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreateGamblerCashierWindow extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */
	private static final long serialVersionUID = 1006226609223776165L;

	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	private JButton exit, back, createGambler;

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

	private JTextField completeName, document, adress, phoneNumber;

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
	 * Este es el constructor vacio de la clase ventana de crear apostador
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */

	public CreateGamblerCashierWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CREAR APOSTADOR");
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

		completeName = new JTextField();
		completeName.setBounds(329, 118, 622, 68);
		completeName.setBackground(new Color(0, 0, 0, 0));
		completeName.setOpaque(false);
		completeName.setBorder(new EmptyBorder(15, 15, 15, 15));
		completeName.setFont(new Font("Arial", 1, 25));
		completeName.setForeground(Color.white);
		add(completeName);

		document = new JTextField();
		document.setBounds(329, 215, 622, 68);
		document.setBackground(new Color(0, 0, 0, 0));
		document.setOpaque(false);
		document.setBorder(new EmptyBorder(15, 15, 15, 15));
		document.setFont(new Font("Arial", 1, 25));
		document.setForeground(Color.white);
		add(document);

		adress = new JTextField();
		adress.setBounds(329, 313, 622, 68);
		adress.setBackground(new Color(0, 0, 0, 0));
		adress.setOpaque(false);
		adress.setBorder(new EmptyBorder(15, 15, 15, 15));
		adress.setFont(new Font("Arial", 1, 25));
		adress.setForeground(Color.white);
		add(adress);

		phoneNumber = new JTextField();
		phoneNumber.setBounds(329, 414, 622, 68);
		phoneNumber.setBackground(new Color(0, 0, 0, 0));
		phoneNumber.setOpaque(false);
		phoneNumber.setBorder(new EmptyBorder(15, 15, 15, 15));
		phoneNumber.setFont(new Font("Arial", 1, 25));
		phoneNumber.setForeground(Color.white);
		add(phoneNumber);

		comboLocation = new JComboBox<>();
		comboLocation.setBounds(438, 520, 405, 70);
		comboLocation.setBackground(new Color(225, 223, 228));
		comboLocation.setForeground(Color.black);
		comboLocation.setFont(new Font("Arial", 1, 25));
		comboLocation.setEnabled(false);
		add(comboLocation);

		createGambler = new JButton();
		createGambler.setBounds(978, 520, 220, 88);
		createGambler.setToolTipText("Crear nuevo apostador");
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

	public JButton getCreateGambler() {
		return createGambler;
	}

	public void setCreateGambler(JButton createGambler) {
		this.createGambler = createGambler;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JTextField getCompleteName() {
		return completeName;
	}

	public void setCompleteName(JTextField completeName) {
		this.completeName = completeName;
	}

	public JTextField getDocument() {
		return document;
	}

	public void setDocument(JTextField document) {
		this.document = document;
	}

	public JTextField getAdress() {
		return adress;
	}

	public void setAdress(JTextField adress) {
		this.adress = adress;
	}

	public JTextField getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(JTextField phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public JComboBox<String> getComboLocation() {
		return comboLocation;
	}

	public void setComboLocation(JComboBox<String> comboLocation) {
		this.comboLocation = comboLocation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
