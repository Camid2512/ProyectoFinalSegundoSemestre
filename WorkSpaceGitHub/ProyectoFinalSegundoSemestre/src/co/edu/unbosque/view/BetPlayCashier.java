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

public class BetPlayCashier extends JFrame {

	/**
	 * Ventana para gestionar apuestas BetPlay manager *
	 * 
	 *  @author SOFTPYLSA
	 * @version 1.0
	 * @since 10/11/2023
	 */

	/** Número de versión de serialización. */
	private static final long serialVersionUID = 5239526211513542986L;

	/** Botones de la ventana. */
	private JButton exit, back, next;

	/** Spinners de la ventana. */
	private JSpinner match1, match2, match3, match4, match5, match6, match7, match8, match9, match10, match11, match12,
			match13, match14;

	/** Modelos de spinner para la ventana. */
	private SpinnerNumberModel n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14;

	/** Campo de texto para la cantidad de apuesta. */
	private JTextField betAmount;

	/** Etiqueta principal de la ventana. */
	private JLabel mainImage;

	/**
	 * Constructor de la ventana de gestión de apuestas.
	 */
	public BetPlayCashier() {
		// TODO Auto-generated constructor stub

		/**
		 * Configuración de botones y etiquetas visuales.
		 */
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("BETPLAY");
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
		next.setBounds(1101, 638, 158, 77);
		next.setToolTipText("SIGUIENTE");
		next.setBackground(new Color(0, 0, 0, 0));
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);
		add(next);

		betAmount = new JTextField();
		betAmount.setBounds(275, 650, 621, 58);
		betAmount.setBackground(new Color(0, 0, 0, 0));
		betAmount.setOpaque(false);
		betAmount.setBorder(new EmptyBorder(15, 15, 15, 15));
		betAmount.setFont(new Font("Arial", 1, 25));
		betAmount.setForeground(Color.white);
		add(betAmount);

		n1 = new SpinnerNumberModel();
		n1.setMinimum(-1);
		n1.setMaximum(1);

		n2 = new SpinnerNumberModel();
		n2.setMinimum(-1);
		n2.setMaximum(1);

		n3 = new SpinnerNumberModel();
		n3.setMinimum(-1);
		n3.setMaximum(1);

		n4 = new SpinnerNumberModel();
		n4.setMinimum(-1);
		n4.setMaximum(1);

		n5 = new SpinnerNumberModel();
		n5.setMinimum(-1);
		n5.setMaximum(1);

		n6 = new SpinnerNumberModel();
		n6.setMinimum(-1);
		n6.setMaximum(1);

		n7 = new SpinnerNumberModel();
		n7.setMinimum(-1);
		n7.setMaximum(1);

		n8 = new SpinnerNumberModel();
		n8.setMinimum(-1);
		n8.setMaximum(1);

		n9 = new SpinnerNumberModel();
		n9.setMinimum(-1);
		n9.setMaximum(1);

		n10 = new SpinnerNumberModel();
		n10.setMinimum(-1);
		n10.setMaximum(1);

		n11 = new SpinnerNumberModel();
		n11.setMinimum(-1);
		n11.setMaximum(1);

		n12 = new SpinnerNumberModel();
		n12.setMinimum(-1);
		n12.setMaximum(1);

		n13 = new SpinnerNumberModel();
		n13.setMinimum(-1);
		n13.setMaximum(1);

		n14 = new SpinnerNumberModel();
		n14.setMinimum(-1);
		n14.setMaximum(1);

		match1 = new JSpinner();
		match1.setBounds(108, 40, 115, 90);
		match1.setModel(n1);
		match1.setEditor(new JSpinner.DefaultEditor(match1));
		match1.setBorder(new EmptyBorder(20, 10, 20, 20));
		match1.setFont(new Font("Arial", 1, 25));
		match1.setForeground(new Color(188, 186, 190));
		match1.setBackground(new Color(188, 186, 190));
		match1.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match1);

		match2 = new JSpinner();
		match2.setBounds(421, 40, 115, 90);
		match2.setModel(n2);
		match2.setEditor(new JSpinner.DefaultEditor(match2));
		match2.setBorder(new EmptyBorder(20, 10, 20, 20));
		match2.setFont(new Font("Arial", 1, 25));
		match2.setForeground(new Color(188, 186, 190));
		match2.setBackground(new Color(188, 186, 190));
		match2.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match2);

		match3 = new JSpinner();
		match3.setBounds(734, 40, 115, 90);
		match3.setModel(n3);
		match3.setEditor(new JSpinner.DefaultEditor(match3));
		match3.setBorder(new EmptyBorder(20, 10, 20, 20));
		match3.setFont(new Font("Arial", 1, 25));
		match3.setForeground(new Color(188, 186, 190));
		match3.setBackground(new Color(188, 186, 190));
		match3.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match3);

		match4 = new JSpinner();
		match4.setBounds(108, 195, 115, 90);
		match4.setModel(n4);
		match4.setEditor(new JSpinner.DefaultEditor(match4));
		match4.setBorder(new EmptyBorder(20, 10, 20, 20));
		match4.setFont(new Font("Arial", 1, 25));
		match4.setForeground(new Color(188, 186, 190));
		match4.setBackground(new Color(188, 186, 190));
		match4.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match4);

		match5 = new JSpinner();
		match5.setBounds(421, 195, 115, 90);
		match5.setModel(n5);
		match5.setEditor(new JSpinner.DefaultEditor(match5));
		match5.setBorder(new EmptyBorder(20, 10, 20, 20));
		match5.setFont(new Font("Arial", 1, 25));
		match5.setForeground(new Color(188, 186, 190));
		match5.setBackground(new Color(188, 186, 190));
		match5.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match5);

		match6 = new JSpinner();
		match6.setBounds(734, 195, 115, 90);
		match6.setModel(n6);
		match6.setEditor(new JSpinner.DefaultEditor(match6));
		match6.setBorder(new EmptyBorder(20, 10, 20, 20));
		match6.setFont(new Font("Arial", 1, 25));
		match6.setForeground(new Color(188, 186, 190));
		match6.setBackground(new Color(188, 186, 190));
		match6.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match6);

		match7 = new JSpinner();
		match7.setBounds(108, 350, 115, 90);
		match7.setModel(n7);
		match7.setEditor(new JSpinner.DefaultEditor(match7));
		match7.setBorder(new EmptyBorder(20, 10, 20, 20));
		match7.setFont(new Font("Arial", 1, 25));
		match7.setForeground(new Color(188, 186, 190));
		match7.setBackground(new Color(188, 186, 190));
		match7.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match7);

		match8 = new JSpinner();
		match8.setBounds(421, 350, 115, 90);
		match8.setModel(n8);
		match8.setEditor(new JSpinner.DefaultEditor(match8));
		match8.setBorder(new EmptyBorder(20, 10, 20, 20));
		match8.setFont(new Font("Arial", 1, 25));
		match8.setForeground(new Color(188, 186, 190));
		match8.setBackground(new Color(188, 186, 190));
		match8.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match8);

		match9 = new JSpinner();
		match9.setBounds(734, 350, 115, 90);
		match9.setModel(n9);
		match9.setEditor(new JSpinner.DefaultEditor(match9));
		match9.setBorder(new EmptyBorder(20, 10, 20, 20));
		match9.setFont(new Font("Arial", 1, 25));
		match9.setForeground(new Color(188, 186, 190));
		match9.setBackground(new Color(188, 186, 190));
		match9.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match9);

		match10 = new JSpinner();
		match10.setBounds(108, 507, 115, 90);
		match10.setModel(n10);
		match10.setEditor(new JSpinner.DefaultEditor(match10));
		match10.setBorder(new EmptyBorder(20, 10, 20, 20));
		match10.setFont(new Font("Arial", 1, 25));
		match10.setForeground(new Color(188, 186, 190));
		match10.setBackground(new Color(188, 186, 190));
		match10.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match10);

		match11 = new JSpinner();
		match11.setBounds(421, 507, 115, 90);
		match11.setModel(n11);
		match11.setEditor(new JSpinner.DefaultEditor(match11));
		match11.setBorder(new EmptyBorder(20, 10, 20, 20));
		match11.setFont(new Font("Arial", 1, 25));
		match11.setForeground(new Color(188, 186, 190));
		match11.setBackground(new Color(188, 186, 190));
		match11.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match11);

		match12 = new JSpinner();
		match12.setBounds(734, 507, 115, 90);
		match12.setModel(n12);
		match12.setEditor(new JSpinner.DefaultEditor(match12));
		match12.setBorder(new EmptyBorder(20, 10, 20, 20));
		match12.setFont(new Font("Arial", 1, 25));
		match12.setForeground(new Color(188, 186, 190));
		match12.setBackground(new Color(188, 186, 190));
		match12.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match12);

		match13 = new JSpinner();
		match13.setBounds(1051, 113, 115, 90);
		match13.setModel(n13);
		match13.setEditor(new JSpinner.DefaultEditor(match13));
		match13.setBorder(new EmptyBorder(20, 10, 20, 20));
		match13.setFont(new Font("Arial", 1, 25));
		match13.setForeground(new Color(188, 186, 190));
		match13.setBackground(new Color(188, 186, 190));
		match13.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match13);

		match14 = new JSpinner();
		match14.setBounds(1051, 265, 115, 90);
		match14.setModel(n14);
		match14.setEditor(new JSpinner.DefaultEditor(match14));
		match14.setBorder(new EmptyBorder(20, 10, 20, 20));
		match14.setFont(new Font("Arial", 1, 25));
		match14.setForeground(new Color(188, 186, 190));
		match14.setBackground(new Color(188, 186, 190));
		match14.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(match14);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/betplay.png").getImage();

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
	 * Obtiene el campo de giro 1.
	 */
	public JSpinner getMatch1() {
		return match1;
	}

	/**
	 * Establece el campo de giro 1.
	 */
	public void setMatch1(JSpinner match1) {
		this.match1 = match1;
	}

	/**
	 * Obtiene el campo de giro 2.
	 */
	public JSpinner getMatch2() {
		return match2;
	}

	/**
	 * Establece el campo de giro 2.
	 */
	public void setMatch2(JSpinner match2) {
		this.match2 = match2;
	}

	/**
	 * Obtiene el campo de giro 3.
	 */
	public JSpinner getMatch3() {
		return match3;
	}

	/**
	 * Establece el campo de giro 3.
	 */
	public void setMatch3(JSpinner match3) {
		this.match3 = match3;
	}

	/**
	 * Obtiene el campo de giro 4.
	 */
	public JSpinner getMatch4() {
		return match4;
	}

	/**
	 * Establece el campo de giro 4.
	 */
	public void setMatch4(JSpinner match4) {
		this.match4 = match4;
	}

	/**
	 * Obtiene el campo de giro 5.
	 */
	public JSpinner getMatch5() {
		return match5;
	}

	/**
	 * Establece el campo de giro 5.
	 */
	public void setMatch5(JSpinner match5) {
		this.match5 = match5;
	}

	/**
	 * Obtiene el campo de giro 6.
	 */
	public JSpinner getMatch6() {
		return match6;
	}

	/**
	 * Establece el campo de giro 6.
	 */
	public void setMatch6(JSpinner match6) {
		this.match6 = match6;
	}

	/**
	 * Obtiene el campo de giro 7.
	 */
	public JSpinner getMatch7() {
		return match7;
	}

	/**
	 * Establece el campo de giro 7.
	 */
	public void setMatch7(JSpinner match7) {
		this.match7 = match7;
	}

	/**
	 * Obtiene el campo de giro 8.
	 */
	public JSpinner getMatch8() {
		return match8;
	}

	/**
	 * Establece el campo de giro 8.
	 */
	public void setMatch8(JSpinner match8) {
		this.match8 = match8;
	}

	/**
	 * Obtiene el campo de giro 9.
	 */
	public JSpinner getMatch9() {
		return match9;
	}

	/**
	 * Establece el campo de giro 9.
	 */
	public void setMatch9(JSpinner match9) {
		this.match9 = match9;
	}

	/**
	 * Obtiene el campo de giro 10.
	 */
	public JSpinner getMatch10() {
		return match10;
	}

	/**
	 * Establece el campo de giro 10.
	 */
	public void setMatch10(JSpinner match10) {
		this.match10 = match10;
	}

	/**
	 * Obtiene el campo de giro 11.
	 */
	public JSpinner getMatch11() {
		return match11;
	}

	/**
	 * Establece el campo de giro 11.
	 */
	public void setMatch11(JSpinner match11) {
		this.match11 = match11;
	}

	/**
	 * Obtiene el campo de giro 12.
	 */
	public JSpinner getMatch12() {
		return match12;
	}

	/**
	 * Establece el campo de giro 12.
	 */
	public void setMatch12(JSpinner match12) {
		this.match12 = match12;
	}

	/**
	 * Obtiene el campo de giro 13.
	 */
	public JSpinner getMatch13() {
		return match13;
	}

	/**
	 * Establece el campo de giro 13.
	 */
	public void setMatch13(JSpinner match13) {
		this.match13 = match13;
	}

	/**
	 * Obtiene el campo de giro 14.
	 */
	public JSpinner getMatch14() {
		return match14;
	}

	/**
	 * Establece el campo de giro 14.
	 */
	public void setMatch14(JSpinner match14) {
		this.match14 = match14;
	}

	/**
	 * Obtiene el modelo de número giratorio 1.
	 */
	public SpinnerNumberModel getN1() {
		return n1;
	}

	/**
	 * Establece el modelo de número giratorio 1.
	 */
	public void setN1(SpinnerNumberModel n1) {
		this.n1 = n1;
	}

	/**
	 * Obtiene el modelo de número giratorio 2.
	 */
	public SpinnerNumberModel getN2() {
		return n2;
	}

	/**
	 * Establece el modelo de número giratorio 2.
	 */
	public void setN2(SpinnerNumberModel n2) {
		this.n2 = n2;
	}

	/**
	 * Obtiene el modelo de número giratorio 3.
	 */
	public SpinnerNumberModel getN3() {
		return n3;
	}

	/**
	 * Establece el modelo de número giratorio 3.
	 */
	public void setN3(SpinnerNumberModel n3) {
		this.n3 = n3;
	}

	/**
	 * Obtiene el modelo de número giratorio 4.
	 */
	public SpinnerNumberModel getN4() {
		return n4;
	}

	/**
	 * Establece el modelo de número giratorio 4.
	 */
	public void setN4(SpinnerNumberModel n4) {
		this.n4 = n4;
	}

	/**
	 * Obtiene el modelo de número giratorio 5.
	 */
	public SpinnerNumberModel getN5() {
		return n5;
	}

	/**
	 * Establece el modelo de número giratorio 5.
	 */
	public void setN5(SpinnerNumberModel n5) {
		this.n5 = n5;
	}

	/**
	 * Obtiene el modelo de número giratorio 6.
	 */
	public SpinnerNumberModel getN6() {
		return n6;
	}

	/**
	 * Establece el modelo de número giratorio 6.
	 */
	public void setN6(SpinnerNumberModel n6) {
		this.n6 = n6;
	}

	/**
	 * Obtiene el modelo de número giratorio 7.
	 */
	public SpinnerNumberModel getN7() {
		return n7;
	}

	/**
	 * Establece el modelo de número giratorio 7.
	 */
	public void setN7(SpinnerNumberModel n7) {
		this.n7 = n7;
	}

	/**
	 * Obtiene el modelo de número giratorio 8.
	 */
	public SpinnerNumberModel getN8() {
		return n8;
	}

	/**
	 * Establece el modelo de número giratorio 8.
	 */
	public void setN8(SpinnerNumberModel n8) {
		this.n8 = n8;
	}

	/**
	 * Obtiene el modelo de número giratorio 9.
	 */
	public SpinnerNumberModel getN9() {
		return n9;
	}

	/**
	 * Establece el modelo de número giratorio 9.
	 */
	public void setN9(SpinnerNumberModel n9) {
		this.n9 = n9;
	}

	/**
	 * Obtiene el modelo de número giratorio 10.
	 */
	public SpinnerNumberModel getN10() {
		return n10;
	}

	/**
	 * Establece el modelo de número giratorio 10.
	 */
	public void setN10(SpinnerNumberModel n10) {
		this.n10 = n10;
	}

	/**
	 * Obtiene el modelo de número giratorio 11.
	 */
	public SpinnerNumberModel getN11() {
		return n11;
	}

	/**
	 * Establece el modelo de número giratorio 11.
	 */
	public void setN11(SpinnerNumberModel n11) {
		this.n11 = n11;
	}

	/**
	 * Obtiene el modelo de número giratorio 12.
	 */
	public SpinnerNumberModel getN12() {
		return n12;
	}

	/**
	 * Establece el modelo de número giratorio 12.
	 */
	public void setN12(SpinnerNumberModel n12) {
		this.n12 = n12;
	}

	/**
	 * Obtiene el modelo de número giratorio 13.
	 */
	public SpinnerNumberModel getN13() {
		return n13;
	}

	/**
	 * Establece el modelo de número giratorio 13.
	 */
	public void setN13(SpinnerNumberModel n13) {
		this.n13 = n13;
	}

	/**
	 * Obtiene el modelo de número giratorio 14.
	 */
	public SpinnerNumberModel getN14() {
		return n14;
	}

	/**
	 * Establece el modelo de número giratorio 14.
	 */
	public void setN14(SpinnerNumberModel n14) {
		this.n14 = n14;
	}

	/**
	 * Obtiene el campo de cantidad de apuesta.
	 */
	public JTextField getBetAmount() {
		return betAmount;
	}

	/**
	 * Establece el campo de cantidad de apuesta.
	 */
	public void setBetAmount(JTextField betAmount) {
		this.betAmount = betAmount;
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
	 * Obtiene el número de serie de versión.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
