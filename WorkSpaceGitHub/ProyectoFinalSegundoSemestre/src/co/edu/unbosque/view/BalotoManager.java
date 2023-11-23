package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

public class BalotoManager extends JFrame {

	/**
	 * Esta clase representa la ventana de gestión de apuestas en el juego Baloto.
	 * Permite a los usuarios realizar operaciones relacionadas con las apuestas.
	 * 
	 * @author SOFTPYLSA
	 * @version 1.0
	 * @since 10/11/2023
	 */

	/** Identificador de serialización de la clase.*/
	
	private static final long serialVersionUID = -769680791092189359L;

	/** Campo para ingresar el monto de la apuesta. */
	private JTextField betAmount;

	/** Spinners para seleccionar los números de la apuesta. */
	private JSpinner num1, num2, num3, num4, num5, num6;

	/** Modelos para los spinners de los números de la apuesta. */
	private SpinnerNumberModel n1, n2, n3, n4, n5, n6;

	/** Imagen principal de la ventana. */
	private JLabel mainImage;

	/** Botones para salir, retroceder y avanzar. */
	private JButton exit, back, next;

	/**
	 * Constructor de la ventana de gestión de apuestas del juego Baloto. Inicializa
	 * la ventana y sus componentes gráficos.
	 */
	public BalotoManager() {

		/**
	     * Configuración de botones y etiquetas visuales.
	     */
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("BALOTO");
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
		next.setBounds(1050, 569, 158, 77);
		next.setToolTipText("SIGUIENTE");
		next.setBackground(new Color(0, 0, 0, 0));
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);
		add(next);

		betAmount = new JTextField();
		betAmount.setBounds(148, 193, 643, 73);
		betAmount.setBackground(new Color(0, 0, 0, 0));
		betAmount.setOpaque(false);
		betAmount.setBorder(new EmptyBorder(15, 15, 15, 15));
		betAmount.setFont(new Font("Arial", 1, 25));
		betAmount.setForeground(Color.white);
		add(betAmount);

		n1 = new SpinnerNumberModel();
		n1.setMinimum(1);
		n1.setMaximum(45);

		n2 = new SpinnerNumberModel();
		n2.setMinimum(1);
		n2.setMaximum(45);

		n3 = new SpinnerNumberModel();
		n3.setMinimum(1);
		n3.setMaximum(45);

		n4 = new SpinnerNumberModel();
		n4.setMinimum(1);
		n4.setMaximum(45);

		n5 = new SpinnerNumberModel();
		n5.setMinimum(1);
		n5.setMaximum(45);

		n6 = new SpinnerNumberModel();
		n6.setMinimum(1);
		n6.setMaximum(45);

		num1 = new JSpinner();
		num1.setBounds(167, 405, 90, 90);
		num1.setModel(n1);
		num1.setValue(1);
		num1.setEditor(new JSpinner.DefaultEditor(num1));
		num1.setBorder(new EmptyBorder(20, 10, 20, 20));
		num1.setFont(new Font("Arial", 1, 25));
		num1.setForeground(new Color(188, 186, 190));
		num1.setBackground(new Color(188, 186, 190));
		num1.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num1);

		num2 = new JSpinner();
		num2.setBounds(330, 405, 90, 90);
		num2.setModel(n2);
		num2.setValue(1);
		num2.setBorder(new EmptyBorder(20, 10, 20, 20));
		num2.setFont(new Font("Arial", 1, 25));
		num2.setForeground(new Color(188, 186, 190));
		num2.setBackground(new Color(188, 186, 190));
		num2.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num2);

		num3 = new JSpinner();
		num3.setBounds(492, 405, 90, 90);
		num3.setModel(n3);
		num3.setValue(1);
		num3.setBorder(new EmptyBorder(20, 10, 20, 20));
		num3.setFont(new Font("Arial", 1, 25));
		num3.setForeground(new Color(188, 186, 190));
		num3.setBackground(new Color(188, 186, 190));
		num3.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num3);

		num4 = new JSpinner();
		num4.setBounds(657, 405, 90, 90);
		num4.setModel(n4);
		num4.setValue(1);
		num4.setBorder(new EmptyBorder(20, 10, 20, 20));
		num4.setFont(new Font("Arial", 1, 25));
		num4.setForeground(new Color(188, 186, 190));
		num4.setBackground(new Color(188, 186, 190));
		num4.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num4);

		num5 = new JSpinner();
		num5.setBounds(817, 405, 90, 90);
		num5.setModel(n5);
		num5.setValue(1);
		num5.setBorder(new EmptyBorder(20, 10, 20, 20));
		num5.setFont(new Font("Arial", 1, 25));
		num5.setForeground(new Color(188, 186, 190));
		num5.setBackground(new Color(188, 186, 190));
		num5.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num5);

		num6 = new JSpinner();
		num6.setBounds(975, 405, 90, 90);
		num6.setModel(n6);
		num6.setValue(1);
		num6.setBorder(new EmptyBorder(20, 10, 20, 20));
		num6.setFont(new Font("Arial", 1, 25));
		num6.setForeground(new Color(188, 186, 190));
		num6.setBackground(new Color(188, 186, 190));
		num6.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num6);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/baloto.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	/**
	 * Obtiene el JTextField asociado al monto de apuesta.
	 * 
	 */
	public JTextField getBetAmount() {
		return betAmount;
	}

	/**
	 * Establece el JTextField del monto de apuesta.
	 * 
	 */
	public void setBetAmount(JTextField betAmount) {
		this.betAmount = betAmount;
	}

	/**
	 * Obtiene el JSpinner del número 1.
	 * 
	 */
	public JSpinner getNum1() {
		return num1;
	}

	/**
	 * Establece el JSpinner del número 1.
	 * 
	 */
	public void setNum1(JSpinner num1) {
		this.num1 = num1;
	}

	/**
	 * Obtiene el JSpinner del número 2.
	 * 
	 */
	public JSpinner getNum2() {
		return num2;
	}

	/**
	 * Establece el JSpinner del número 2.
	 * 
	 */
	public void setNum2(JSpinner num2) {
		this.num2 = num2;
	}

	/**
	 * Obtiene el JSpinner del número 3.
	 * 
	 */
	public JSpinner getNum3() {
		return num3;
	}

	/**
	 * Establece el JSpinner del número 3.
	 * 
	 */
	public void setNum3(JSpinner num3) {
		this.num3 = num3;
	}

	/**
	 * Obtiene el JSpinner del número 4.
	 * 
	 */
	public JSpinner getNum4() {
		return num4;
	}

	/**
	 * Establece el JSpinner del número 4.
	 * 
	 */
	public void setNum4(JSpinner num4) {
		this.num4 = num4;
	}

	/**
	 * Obtiene el JSpinner del número 5.
	 * 
	 */
	public JSpinner getNum5() {
		return num5;
	}

	/**
	 * Establece el JSpinner del número 5.
	 * 
	 */
	public void setNum5(JSpinner num5) {
		this.num5 = num5;
	}

	/**
	 * Obtiene el JSpinner del número 6.
	 * 
	 */
	public JSpinner getNum6() {
		return num6;
	}

	/**
	 * Establece el JSpinner del número 6.
	 * 
	 */
	public void setNum6(JSpinner num6) {
		this.num6 = num6;
	}

	/**
	 * Obtiene el SpinnerNumberModel del número 1.
	 * 
	 */
	public SpinnerNumberModel getN1() {
		return n1;
	}

	/**
	 * Establece el SpinnerNumberModel del número 1.
	 * 
	 */
	public void setN1(SpinnerNumberModel n1) {
		this.n1 = n1;
	}

	/**
	 * Obtiene el SpinnerNumberModel del número 2.
	 * 
	 */
	public SpinnerNumberModel getN2() {
		return n2;
	}

	/**
	 * Establece el SpinnerNumberModel del número 2.
	 * 
	 */
	public void setN2(SpinnerNumberModel n2) {
		this.n2 = n2;
	}

	/**
	 * Obtiene el SpinnerNumberModel del número 3.
	 * 
	 */
	public SpinnerNumberModel getN3() {
		return n3;
	}

	/**
	 * Establece el SpinnerNumberModel del número 3.
	 * 
	 */
	public void setN3(SpinnerNumberModel n3) {
		this.n3 = n3;
	}

	/**
	 * Obtiene el SpinnerNumberModel del número 4.
	 * 
	 */
	public SpinnerNumberModel getN4() {
		return n4;
	}

	/**
	 * Establece el SpinnerNumberModel del número 4.
	 * 
	 */
	public void setN4(SpinnerNumberModel n4) {
		this.n4 = n4;
	}

	/**
	 * Obtiene el SpinnerNumberModel del número 5.
	 * 
	 */
	public SpinnerNumberModel getN5() {
		return n5;
	}

	/**
	 * Establece el SpinnerNumberModel del número 5.
	 * 
	 */
	public void setN5(SpinnerNumberModel n5) {
		this.n5 = n5;
	}

	/**
	 * Obtiene el SpinnerNumberModel del número 6.
	 * 
	 */
	public SpinnerNumberModel getN6() {
		return n6;
	}

	/**
	 * Establece el SpinnerNumberModel del número 6.
	 * 
	 */
	public void setN6(SpinnerNumberModel n6) {
		this.n6 = n6;
	}

	/**
	 * Obtiene la imagen principal.
	 * 
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Establece la imagen principal.
	 * 
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Obtiene el serialVersionUID.
	 * 
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * Obtiene el botón de avance.
	 * 
	 */
	public JButton getNext() {
		return next;
	}

}