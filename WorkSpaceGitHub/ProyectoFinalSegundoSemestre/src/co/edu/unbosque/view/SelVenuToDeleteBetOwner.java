package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelVenuToDeleteBetOwner extends JFrame {

	/**
	 * Seleccionar sede a eliminar
	 * 
	 * @author SOFTPYLSA
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	/**
	 * Identificador de serialización de la clase.
	 */
	private static final long serialVersionUID = -9206446675511622182L;

	private JButton exit, back, next;
	private JComboBox<String> comboVenue;
	private JLabel mainImage;

	
	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */
	public SelVenuToDeleteBetOwner() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SELECCIONAR SEDE PARA APUESTA A ELIMINAR");
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
	 * Método getter para obtener el botón de salida.
	 */
	public JButton getExit() {
	    return exit;
	}

	/**
	 * Método setter para configurar el botón de salida.
	 */
	public void setExit(JButton exit) {
	    this.exit = exit;
	}

	/**
	 * Método getter para obtener el botón de retroceso.
	 */
	public JButton getBack() {
	    return back;
	}

	/**
	 * Método setter para configurar el botón de retroceso.
	 */
	public void setBack(JButton back) {
	    this.back = back;
	}

	/**
	 * Método getter para obtener el botón de siguiente.
	 */
	public JButton getNext() {
	    return next;
	}

	/**
	 * Método setter para configurar el botón de siguiente.
	 */
	public void setNext(JButton next) {
	    this.next = next;
	}

	/**
	 * Método getter para obtener el ComboBox de lugares.
	 */
	public JComboBox<String> getComboVenue() {
	    return comboVenue;
	}

	/**
	 * Método setter para configurar el ComboBox de lugares.
	 */
	public void setComboVenue(JComboBox<String> comboVenue) {
	    this.comboVenue = comboVenue;
	}

	/**
	 * Método getter para obtener la imagen principal.
	 */
	public JLabel getMainImage() {
	    return mainImage;
	}

	/**
	 * Método setter para configurar la imagen principal.
	 */
	public void setMainImage(JLabel mainImage) {
	    this.mainImage = mainImage;
	}

	/**
	 * Método getter para obtener el número de versión de serialización.
	 */
	public static long getSerialversionuid() {
	    return serialVersionUID;
	}

}
