package co.edu.unbosque.view;
/**
 * Seleccionar el apostador para poder realizar una apuesta en el menu para el
 * dueño de sede
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
 * Seleccionar el apostador para poder realizar una apuesta en el menu para el
 * dueño de sede
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */
public class SelGamblerCreateBetOwnWindow extends JFrame {

	

	/**
	 * Identificador de serialización de la clase.
	 */
	private static final long serialVersionUID = -2902607414608498023L;

	/** ComboBox para la selección de apostadores. */
	private JComboBox<Long> comboGambler;

	/** Botones para salir, retroceder y avanzar. */
	private JButton exit, back, nextStep;
	/** Etiqueta principal de la imagen. */
	private JLabel mainImage;

	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */

	public SelGamblerCreateBetOwnWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SELECCIONAR APOSTADOR QUE HARA APUESTA");
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

		nextStep = new JButton();
		nextStep.setBounds(858, 498, 298, 99);
		nextStep.setToolTipText("SELECCIONAR");
		nextStep.setBackground(new Color(0, 0, 0, 0));
		nextStep.setOpaque(false);
		nextStep.setContentAreaFilled(false);
		nextStep.setBorderPainted(false);
		add(nextStep);

		comboGambler = new JComboBox<>();
		comboGambler.setBounds(313, 270, 657, 133);
		comboGambler.setBackground(new Color(225, 223, 228));
		comboGambler.setForeground(Color.black);
		comboGambler.setFont(new Font("Arial", 1, 25));
		add(comboGambler);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/selectapostador.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	/**
	 * Obtiene el JComboBox para la selección de apostadores.
	 * 
	 */
	public JComboBox<Long> getComboGambler() {
		return comboGambler;
	}

	/**
	 * Establece el JComboBox para la selección de apostadores.
	 * 
	 */
	public void setComboGambler(JComboBox<Long> comboGambler) {
		this.comboGambler = comboGambler;
	}

	/**
	 * Obtiene el botón de salida.
	 * 
	 */
	public JButton getExit() {
		return exit;
	}

	/**
	 * Establece el botón de salida.
	 * 
	 */
	public void setExit(JButton exit) {
		this.exit = exit;
	}

	/**
	 * Obtiene el botón de retroceso.
	 * 
	 */
	public JButton getBack() {
		return back;
	}

	/**
	 * Establece el botón de retroceso.
	 * 
	 */
	public void setBack(JButton back) {
		this.back = back;
	}

	/**
	 * Obtiene el botón para avanzar al siguiente paso.
	 * 
	 */
	public JButton getNextStep() {
		return nextStep;
	}

	/**
	 * Establece el botón para avanzar al siguiente paso.
	 * 
	 */
	public void setNextStep(JButton nextStep) {
		this.nextStep = nextStep;
	}

	/**
	 * Obtiene la etiqueta principal de la imagen.
	 * 
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Establece la etiqueta principal de la imagen.
	 * 
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Obtiene el valor del serialVersionUID para la serialización.
	 * 
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
