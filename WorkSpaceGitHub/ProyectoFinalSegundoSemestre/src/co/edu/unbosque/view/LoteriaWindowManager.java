package co.edu.unbosque.view;
/**
 * Representa la ventana de gestion de loteria para el manager
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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;


/**
 * Representa la ventana de gestion de loteria para el manager
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */
public class LoteriaWindowManager extends JFrame {

	

	/** Identificador de serialización de la clase. */
	private static final long serialVersionUID = -3176888367658121195L;

	/** Botones para salir, volver, y siguiente . */
	private JButton exit, back, next;

	/** Etiqueta principal de la imagen. */
	private JLabel mainImage;

	/** Campo de texto para la cantidad de apuesta. */
	private JTextField betAmount;
	/** Lista desplegable para el tipo de lotería. */
	private JComboBox<String> loteryType;
	/** Lista desplegable para el número de serie. */
	private JComboBox<Integer> serialNumber;
	/** Selector de números 1,2,3,4. */
	private JSpinner num1, num2, num3, num4;
	/** Modelo de números para el selector 1,2,3,4. */
	private SpinnerNumberModel n1, n2, n3, n4;

	public LoteriaWindowManager() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("LOTERIA MANAGER");
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
		betAmount.setBounds(111, 140, 685, 77);
		betAmount.setBackground(new Color(0, 0, 0, 0));
		betAmount.setOpaque(false);
		betAmount.setBorder(new EmptyBorder(15, 15, 15, 15));
		betAmount.setFont(new Font("Arial", 1, 25));
		betAmount.setForeground(Color.white);
		add(betAmount);

		loteryType = new JComboBox<String>();
		loteryType.setBounds(111, 250, 685, 77);
		loteryType.setBackground(new Color(225, 223, 228));
		loteryType.setForeground(Color.black);
		loteryType.setFont(new Font("Arial", 1, 25));
		loteryType.addItem("LOTERIA DE BOGOTA");
		loteryType.addItem("LOTERIA DE BOYACA");
		loteryType.addItem("LOTERIA DEL CAUCA");
		loteryType.addItem("LOTERIA CRUZ ROJA");
		loteryType.addItem("LOTERIA DE CUNDINAMARCA");
		loteryType.addItem("LOTERIA DEL HUILA");
		loteryType.addItem("LOTERIA DE MANIZALES");
		loteryType.addItem("LOTERIA DE MEDELLIN");
		loteryType.addItem("LOTERIA DEL META");
		loteryType.addItem("LOTERIA DEL QUINDIO");
		loteryType.addItem("LOTERIA DE RISARALDA");
		loteryType.addItem("LOTERIA DE SANTANDER");
		loteryType.addItem("LOTERIA DEL TOLIMA");
		loteryType.addItem("LOTERIA DEL VALLE");
		add(loteryType);

		serialNumber = new JComboBox<Integer>();
		serialNumber.setBounds(253, 485, 402, 76);
		serialNumber.setBackground(new Color(225, 223, 228));
		serialNumber.setForeground(Color.black);
		serialNumber.setFont(new Font("Arial", 1, 25));
		serialNumber.addItem(101);
		serialNumber.addItem(111);
		serialNumber.addItem(121);
		serialNumber.addItem(131);
		serialNumber.addItem(141);
		serialNumber.addItem(151);
		serialNumber.addItem(161);
		serialNumber.addItem(171);
		serialNumber.addItem(181);
		serialNumber.addItem(191);
		add(serialNumber);

		n1 = new SpinnerNumberModel();
		n1.setMinimum(0);
		n1.setMaximum(99);

		n2 = new SpinnerNumberModel();
		n2.setMinimum(0);
		n2.setMaximum(99);

		n3 = new SpinnerNumberModel();
		n3.setMinimum(0);
		n3.setMaximum(99);

		n4 = new SpinnerNumberModel();
		n4.setMinimum(0);
		n4.setMaximum(99);

		num1 = new JSpinner();
		num1.setBounds(166, 360, 89, 90);
		num1.setModel(n1);
		num1.setEditor(new JSpinner.DefaultEditor(num1));
		num1.setBorder(new EmptyBorder(20, 10, 20, 20));
		num1.setFont(new Font("Arial", 1, 25));
		num1.setForeground(new Color(188, 186, 190));
		num1.setBackground(new Color(188, 186, 190));
		num1.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num1);

		num2 = new JSpinner();
		num2.setBounds(329, 360, 89, 90);
		num2.setModel(n2);
		num2.setEditor(new JSpinner.DefaultEditor(num2));
		num2.setBorder(new EmptyBorder(20, 10, 20, 20));
		num2.setFont(new Font("Arial", 1, 25));
		num2.setForeground(new Color(188, 186, 190));
		num2.setBackground(new Color(188, 186, 190));
		num2.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num2);

		num3 = new JSpinner();
		num3.setBounds(492, 360, 89, 90);
		num3.setModel(n3);
		num3.setEditor(new JSpinner.DefaultEditor(num3));
		num3.setBorder(new EmptyBorder(20, 10, 20, 20));
		num3.setFont(new Font("Arial", 1, 25));
		num3.setForeground(new Color(188, 186, 190));
		num3.setBackground(new Color(188, 186, 190));
		num3.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num3);

		num4 = new JSpinner();
		num4.setBounds(653, 360, 89, 90);
		num4.setModel(n4);
		num4.setEditor(new JSpinner.DefaultEditor(num4));
		num4.setBorder(new EmptyBorder(20, 10, 20, 20));
		num4.setFont(new Font("Arial", 1, 25));
		num4.setForeground(new Color(188, 186, 190));
		num4.setBackground(new Color(188, 186, 190));
		num4.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(num4);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/loteria.png").getImage();

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
	 * Obtiene la imagen principal.
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Establece la imagen principal.
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Obtiene la cantidad de apuesta.
	 */
	public JTextField getBetAmount() {
		return betAmount;
	}

	/**
	 * Establece la cantidad de apuesta.
	 */
	public void setBetAmount(JTextField betAmount) {
		this.betAmount = betAmount;
	}

	/**
	 * Obtiene el tipo de lotería.
	 */
	public JComboBox<String> getLoteryType() {
		return loteryType;
	}

	/**
	 * Establece el tipo de lotería.
	 */
	public void setLoteryType(JComboBox<String> loteryType) {
		this.loteryType = loteryType;
	}

	/**
	 * Obtiene el número serial.
	 */
	public JComboBox<Integer> getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Establece el número serial.
	 */
	public void setSerialNumber(JComboBox<Integer> serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Obtiene el primer número.
	 */
	public JSpinner getNum1() {
		return num1;
	}

	/**
	 * Establece el primer número.
	 */
	public void setNum1(JSpinner num1) {
		this.num1 = num1;
	}

	/**
	 * Obtiene el segundo número.
	 */
	public JSpinner getNum2() {
		return num2;
	}

	/**
	 * Establece el segundo número.
	 */
	public void setNum2(JSpinner num2) {
		this.num2 = num2;
	}

	/**
	 * Obtiene el tercer número.
	 */
	public JSpinner getNum3() {
		return num3;
	}

	/**
	 * Establece el tercer número.
	 */
	public void setNum3(JSpinner num3) {
		this.num3 = num3;
	}

	/**
	 * Obtiene el cuarto número.
	 */
	public JSpinner getNum4() {
		return num4;
	}

	/**
	 * Establece el cuarto número.
	 */
	public void setNum4(JSpinner num4) {
		this.num4 = num4;
	}

	/**
	 * Obtiene el modelo para el primer número.
	 */
	public SpinnerNumberModel getN1() {
		return n1;
	}

	/**
	 * Establece el modelo para el primer número.
	 */
	public void setN1(SpinnerNumberModel n1) {
		this.n1 = n1;
	}

	/**
	 * Obtiene el modelo para el segundo número.
	 */
	public SpinnerNumberModel getN2() {
		return n2;
	}

	/**
	 * Establece el modelo para el segundo número.
	 */
	public void setN2(SpinnerNumberModel n2) {
		this.n2 = n2;
	}

	/**
	 * Obtiene el modelo para el tercer número.
	 */
	public SpinnerNumberModel getN3() {
		return n3;
	}

	/**
	 * Establece el modelo para el tercer número.
	 */
	public void setN3(SpinnerNumberModel n3) {
		this.n3 = n3;
	}

	/**
	 * Obtiene el modelo para el cuarto número.
	 */
	public SpinnerNumberModel getN4() {
		return n4;
	}

	/**
	 * Establece el modelo para el cuarto número.
	 */
	public void setN4(SpinnerNumberModel n4) {
		this.n4 = n4;
	}

	/**
	 * Obtiene el valor de serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
