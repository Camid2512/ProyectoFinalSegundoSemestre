package co.edu.unbosque.view;
/**
 * 
 * Ventana encargada de crear apuesta
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
 * 
 * Ventana encargada de crear apuesta
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */
public class SelectCreateBetWindow extends JFrame {

	

	/**
	 * Número de versión serial para garantizar la compatibilidad de la clase
	 * durante la serialización.
	 */
	private static final long serialVersionUID = 7976763735079298830L;

	/**
	 * Botones para salir, volver, y siguiente de la ventana.
	 */
	private JButton exit, back, next;

	/**
	 * ComboBox para la selección del lugar.
	 */
	private JComboBox<String> comboVenue;

	/**
	 * Etiqueta principal de la imagen.
	 */
	private JLabel mainImage;

	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */
	public SelectCreateBetWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SELECCIONAR SEDE A MOSTRAR PARA APUESTA");
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
		next.setToolTipText("MOSTRAR SELECCIONADO");
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
		temporal1 = new ImageIcon("src/Images/selectvenuegambler.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	/**
	 * Retorna el botón para salir de la ventana.
	 */
	public JButton getExit() {
		return exit;
	}

	/**
	 * Establece el botón para salir de la ventana.
	 */
	public void setExit(JButton exit) {
		this.exit = exit;
	}

	/**
	 * Retorna el botón para retroceder en la ventana.
	 */
	public JButton getBack() {
		return back;
	}

	/**
	 * Establece el botón para retroceder en la ventana.
	 */
	public void setBack(JButton back) {
		this.back = back;
	}

	/**
	 * Retorna el botón para avanzar al siguiente paso en la ventana.
	 */
	public JButton getNext() {
		return next;
	}

	/**
	 * Establece el botón para avanzar al siguiente paso en la ventana.
	 */
	public void setNext(JButton next) {
		this.next = next;
	}

	/**
	 * Retorna el ComboBox para la selección del lugar.
	 */
	public JComboBox<String> getComboVenue() {
		return comboVenue;
	}

	/**
	 * Establece el ComboBox para la selección del lugar.
	 */
	public void setComboVenue(JComboBox<String> comboVenue) {
		this.comboVenue = comboVenue;
	}

	/**
	 * Retorna la etiqueta principal de la imagen.
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
	 * Retorna el identificador de serialización de la clase.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
