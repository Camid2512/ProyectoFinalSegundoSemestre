package co.edu.unbosque.view;
/**
 * 
 * Ventana que permite seleccionar el apostador a eliminar
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
 * Ventana que permite seleccionar el apostador a eliminar
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */
public class SelectGamblerAfterVenueWindowToDelete extends JFrame {

	

	/**
	 * Identificador de serialización de la clase.
	 */
	private static final long serialVersionUID = 5261141351305780143L;

	/**
	 * ComboBox para la selección de apostadores.
	 */
	private JComboBox<Long> comboGambler;
	/** Botones para salir, retroceder y avanzar. */
	private JButton exit, back, nextStep;
	/** Etiqueta principal de la imagen. */
	private JLabel mainImage;

	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */
	public SelectGamblerAfterVenueWindowToDelete() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("ELIMINAR APOSTADOR OWNER");
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
		nextStep.setToolTipText("ELIMINAR SELECCIONADO");
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
	 * Método para obtener el ComboBox de apostadores.
	 */
	public JComboBox<Long> getComboGambler() {
		return comboGambler;
	}

	/**
	 * Método para establecer el ComboBox de apostadores.
	 */
	public void setComboGambler(JComboBox<Long> comboGambler) {
		this.comboGambler = comboGambler;
	}

	/**
	 * Método para obtener el botón de salida.
	 */
	public JButton getExit() {
		return exit;
	}

	/**
	 * Método para establecer el botón de salida.
	 */
	public void setExit(JButton exit) {
		this.exit = exit;
	}

	/**
	 * Método para obtener el botón de retroceso.
	 */
	public JButton getBack() {
		return back;
	}

	/**
	 * Método para establecer el botón de retroceso.
	 */
	public void setBack(JButton back) {
		this.back = back;
	}

	/**
	 * Método para obtener el botón de siguiente paso.
	 */
	public JButton getNextStep() {
		return nextStep;
	}

	/**
	 * Método para establecer el botón de siguiente paso.
	 */
	public void setNextStep(JButton nextStep) {
		this.nextStep = nextStep;
	}

	/**
	 * Método para obtener la imagen principal.
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Método para establecer la imagen principal.
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Método estático para obtener el identificador de serialización.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
