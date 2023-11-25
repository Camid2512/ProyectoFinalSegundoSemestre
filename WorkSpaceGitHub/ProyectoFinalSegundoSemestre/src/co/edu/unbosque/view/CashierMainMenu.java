package co.edu.unbosque.view;
/**
 * Menu principal cajero menu*
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Menu principal cajero menu*
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */
public class CashierMainMenu extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	private static final long serialVersionUID = -3731359359489767597L;
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	private JButton exit, back, gamblerManagment, betManagment;

	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	private JLabel mainImage;

	
	/** Contructor de la clase e incializador de la ventana */
	public CashierMainMenu() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CAJERO");
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

		gamblerManagment = new JButton();
		gamblerManagment.setBounds(185, 250, 400, 215);
		gamblerManagment.setToolTipText("MANEJO APOSTADORES");
		gamblerManagment.setBackground(new Color(0, 0, 0, 0));
		gamblerManagment.setOpaque(false);
		gamblerManagment.setContentAreaFilled(false);
		gamblerManagment.setBorderPainted(false);
		add(gamblerManagment);

		betManagment = new JButton();
		betManagment.setBounds(697, 250, 400, 215);
		betManagment.setToolTipText("MANEJO APUESTAS");
		betManagment.setBackground(new Color(0, 0, 0, 0));
		betManagment.setOpaque(false);
		betManagment.setContentAreaFilled(false);
		betManagment.setBorderPainted(false);
		add(betManagment);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/cajero.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	/**
	 * Obtiene el botón para salir de la interfaz.
	 */
	public JButton getExit() {
	    return exit;
	}

	/**
	 * Establece el botón para salir de la interfaz.
	 */
	public void setExit(JButton exit) {
	    this.exit = exit;
	}

	/**
	 * Obtiene el botón para retroceder en la interfaz.
	 */
	public JButton getBack() {
	    return back;
	}

	/**
	 * Establece el botón para retroceder en la interfaz.
	 */
	public void setBack(JButton back) {
	    this.back = back;
	}

	/**
	 * Obtiene la etiqueta que muestra la imagen principal de la interfaz.
	 */
	public JLabel getMainImage() {
	    return mainImage;
	}

	/**
	 * Establece la etiqueta que muestra la imagen principal de la interfaz.
	 */
	public void setMainImage(JLabel mainImage) {
	    this.mainImage = mainImage;
	}

	/**
	 * Obtiene el botón para gestionar apostadores.
	 */
	public JButton getGamblerManagment() {
	    return gamblerManagment;
	}

	/**
	 * Establece el botón para gestionar apostadores.
	 */
	public void setGamblerManagment(JButton gamblerManagment) {
	    this.gamblerManagment = gamblerManagment;
	}

	/**
	 * Obtiene el botón para gestionar apuestas.
	 */
	public JButton getBetManagment() {
	    return betManagment;
	}

	/**
	 * Establece el botón para gestionar apuestas.
	 */
	public void setBetManagment(JButton betManagment) {
	    this.betManagment = betManagment;
	}

	/**
	 * Obtiene el identificador de versión serial para control de versiones.
	 */
	public static long getSerialversionuid() {
	    return serialVersionUID;
	}

}
