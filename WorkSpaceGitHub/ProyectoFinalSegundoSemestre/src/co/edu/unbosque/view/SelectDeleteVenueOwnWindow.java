package co.edu.unbosque.view;
/**
 * Esta clase representa una ventana para seleccionar y eliminar un lugar
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Esta clase representa una ventana para seleccionar y eliminar un lugar
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */
public class SelectDeleteVenueOwnWindow extends JFrame {

	

	/**
	 * Identificador de serialización de la clase.
	 */
	private static final long serialVersionUID = 7263313075031390888L;
	/** Botones para salir, retroceder y avanzar. */
	private JButton exit, back, next;
	/** ComboBox para la selección del lugar. */
	private JComboBox<String> comboVenue;
	/** Etiqueta principal de la imagen. */
	private JLabel mainImage;

	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */
	public SelectDeleteVenueOwnWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SELECCIONAR SEDE A ELIMINAR");
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

		next = new JButton();
		next.setBounds(858, 498, 298, 99);
		next.setToolTipText("ELIMINAR SELECCIONADO");
		next.setBackground(new Color(0, 0, 0, 0));
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);
		add(next);

		comboVenue = new JComboBox<>();
		comboVenue.setBounds(313, 270, 657, 133);
		comboVenue.setBackground(new Color(225, 223, 228));
		comboVenue.setForeground(Color.black);
		comboVenue.setFont(new Font("Arial", 1, 25));
		add(comboVenue);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/selectdeletevenue.png").getImage();

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
	 * Obtiene el botón de siguiente.
	 */
	public JButton getNext() {
		return next;
	}

	/**
	 * Establece el botón de siguiente.
	 */
	public void setNext(JButton next) {
		this.next = next;
	}

	/**
	 * Obtiene el ComboBox del lugar.
	 */
	public JComboBox<String> getComboVenue() {
		return comboVenue;
	}

	/**
	 * Establece el ComboBox del lugar.
	 */
	public void setComboVenue(JComboBox<String> comboVenue) {
		this.comboVenue = comboVenue;
	}

	/**
	 * Obtiene la etiqueta principal de la imagen.
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Establece la etiqueta principal de la imagen.
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Obtiene el identificador de serialización de la clase.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
