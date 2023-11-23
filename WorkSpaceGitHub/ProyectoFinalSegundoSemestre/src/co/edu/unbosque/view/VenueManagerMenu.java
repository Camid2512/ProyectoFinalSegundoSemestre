package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class VenueManagerMenu extends JFrame {

	/**
	 * Clase VenueManagerMenu que representa la interfaz gráfica para la gestión de
	 * lugares.
	 * Autor: SOFTPYLSA
	 * Versión: 1.0
	 * Fecha: 10/11/2023
	 * 
	 */

	/** SerialVersionUID para la serialización */
	private static final long serialVersionUID = 4682807708706332707L;

	/** Botones de la interfaz */
	private JButton exit, back, manageVenue, gamblers, bets;

	/** Botones de la interfaz */
	private JLabel mainImage;

	/** Área de texto para el nombre del lugar */
	private JTextArea nameVenue;

	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */
	public VenueManagerMenu() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("JEFE DE SEDE");
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

		manageVenue = new JButton();
		manageVenue.setBounds(385, 160, 512, 89);
		manageVenue.setToolTipText("GESTION SEDE");
		manageVenue.setBackground(new Color(0, 0, 0, 0));
		manageVenue.setOpaque(false);
		manageVenue.setContentAreaFilled(false);
		manageVenue.setBorderPainted(false);
		add(manageVenue);

		gamblers = new JButton();
		gamblers.setBounds(385, 317, 512, 89);
		gamblers.setToolTipText("GESTION APOSTADORES");
		gamblers.setBackground(new Color(0, 0, 0, 0));
		gamblers.setOpaque(false);
		gamblers.setContentAreaFilled(false);
		gamblers.setBorderPainted(false);
		add(gamblers);

		bets = new JButton();
		bets.setBounds(385, 474, 512, 89);
		bets.setToolTipText("GESTION APUESTAS");
		bets.setBackground(new Color(0, 0, 0, 0));
		bets.setOpaque(false);
		bets.setContentAreaFilled(false);
		bets.setBorderPainted(false);
		add(bets);

		nameVenue = new JTextArea();
		nameVenue.setBounds(379, 10, 805, 95);
		nameVenue.setBackground(new Color(0, 0, 0, 0));
		nameVenue.setOpaque(false);
		nameVenue.setBorder(new EmptyBorder(15, 15, 15, 15));
		nameVenue.setFont(new Font("Arial", 1, 50));
		nameVenue.setForeground(Color.white);
		nameVenue.setEditable(false);
		nameVenue.setHighlighter(null);
		add(nameVenue);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/jefedesede.png").getImage();

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
	 * Obtiene el botón para gestionar lugares.
	 */
	public JButton getManageVenue() {
		return manageVenue;
	}

	/**
	 * Establece el botón para gestionar lugares.
	 */
	public void setManageVenue(JButton manageVenue) {
		this.manageVenue = manageVenue;
	}

	/**
	 * Obtiene el botón para apostadores.
	 */
	public JButton getGamblers() {
		return gamblers;
	}

	/**
	 * Establece el botón para apostadores.
	 */
	public void setGamblers(JButton gamblers) {
		this.gamblers = gamblers;
	}

	/**
	 * Obtiene el botón para apuestas.
	 */
	public JButton getBets() {
		return bets;
	}

	/**
	 * Establece el botón para apuestas.
	 */
	public void setBets(JButton bets) {
		this.bets = bets;
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
	 * Obtiene el área de texto para el nombre del lugar.
	 */
	public JTextArea getNameVenue() {
		return nameVenue;
	}

	/**
	 * Establece el área de texto para el nombre del lugar.
	 */
	public void setNameVenue(JTextArea nameVenue) {
		this.nameVenue = nameVenue;
	}

	/**
	 * Obtiene el identificador serial de la versión de la clase.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
