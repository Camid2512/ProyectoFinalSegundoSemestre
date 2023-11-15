package co.edu.unbosque.view;

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

public class SuperAstroWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5898606968191455247L;

	private JButton exit, back, next;

	private JTextField betAmount;

	private JSpinner num1, num2, num3, num4;
	private SpinnerNumberModel n1, n2, n3, n4;
	private JComboBox<String> zodiacSign;

	private JLabel mainImage;

	public SuperAstroWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SUPERASTRO");
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

		n1 = new SpinnerNumberModel();
		n1.setMinimum(0);
		n1.setMaximum(9);

		n2 = new SpinnerNumberModel();
		n2.setMinimum(0);
		n2.setMaximum(9);

		n3 = new SpinnerNumberModel();
		n3.setMinimum(0);
		n3.setMaximum(9);

		n4 = new SpinnerNumberModel();
		n4.setMinimum(0);
		n4.setMaximum(9);

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

		zodiacSign = new JComboBox<String>();
		zodiacSign.setBounds(111, 250, 685, 77);
		zodiacSign.setBackground(new Color(225, 223, 228));
		zodiacSign.setForeground(Color.black);
		zodiacSign.setFont(new Font("Arial", 1, 25));
		zodiacSign.addItem("ARIES");
		zodiacSign.addItem("TAURO");
		zodiacSign.addItem("GEMINIS");
		zodiacSign.addItem("CANCER");
		zodiacSign.addItem("LEO");
		zodiacSign.addItem("VIRGO");
		zodiacSign.addItem("LIBRA");
		zodiacSign.addItem("ESCORPIO");
		zodiacSign.addItem("SAGITARIO");
		zodiacSign.addItem("CAPRICORNIO");
		zodiacSign.addItem("ACUARIO");
		zodiacSign.addItem("PISCIS");
		add(zodiacSign);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/superastro.png").getImage();

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

	public JButton getNext() {
		return next;
	}

	public void setNext(JButton next) {
		this.next = next;
	}

	public JTextField getBetAmount() {
		return betAmount;
	}

	public void setBetAmount(JTextField betAmount) {
		this.betAmount = betAmount;
	}

	public JSpinner getNum1() {
		return num1;
	}

	public void setNum1(JSpinner num1) {
		this.num1 = num1;
	}

	public JSpinner getNum2() {
		return num2;
	}

	public void setNum2(JSpinner num2) {
		this.num2 = num2;
	}

	public JSpinner getNum3() {
		return num3;
	}

	public void setNum3(JSpinner num3) {
		this.num3 = num3;
	}

	public JSpinner getNum4() {
		return num4;
	}

	public void setNum4(JSpinner num4) {
		this.num4 = num4;
	}

	public SpinnerNumberModel getN1() {
		return n1;
	}

	public void setN1(SpinnerNumberModel n1) {
		this.n1 = n1;
	}

	public SpinnerNumberModel getN2() {
		return n2;
	}

	public void setN2(SpinnerNumberModel n2) {
		this.n2 = n2;
	}

	public SpinnerNumberModel getN3() {
		return n3;
	}

	public void setN3(SpinnerNumberModel n3) {
		this.n3 = n3;
	}

	public SpinnerNumberModel getN4() {
		return n4;
	}

	public void setN4(SpinnerNumberModel n4) {
		this.n4 = n4;
	}

	public JComboBox<String> getZodiacSign() {
		return zodiacSign;
	}

	public void setZodiacSign(JComboBox<String> zodiacSign) {
		this.zodiacSign = zodiacSign;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}