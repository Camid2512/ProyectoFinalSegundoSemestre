package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChanceWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5898606968191455247L;

	private JButton exit, back, next;

	private JTextField betAmount;

	private JComboBox<Integer> num1, num2, num3, num4;

	private JLabel mainImage;

	public ChanceWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CHANCE");
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
		betAmount.setBounds(115, 208, 685, 77);
		betAmount.setBackground(new Color(0, 0, 0, 0));
		betAmount.setOpaque(false);
		betAmount.setBorder(new EmptyBorder(15, 15, 15, 15));
		betAmount.setFont(new Font("Arial", 1, 25));
		betAmount.setForeground(Color.white);
		add(betAmount);

		num1 = new JComboBox<Integer>();
		num1.setBounds(164, 362, 119, 119);
		num1.setBackground(new Color(225, 223, 228));
		num1.setForeground(Color.black);
		num1.setFont(new Font("Arial", 1, 25));
		add(num1);

		num2 = new JComboBox<Integer>();
		num2.setBounds(321, 362, 119, 119);
		num2.setBackground(new Color(225, 223, 228));
		num2.setForeground(Color.black);
		num2.setFont(new Font("Arial", 1, 25));
		add(num2);

		num3 = new JComboBox<Integer>();
		num3.setBounds(477, 362, 119, 119);
		num3.setBackground(new Color(225, 223, 228));
		num3.setForeground(Color.black);
		num3.setFont(new Font("Arial", 1, 25));
		add(num3);

		num4 = new JComboBox<Integer>();
		num4.setBounds(634, 362, 119, 119);
		num4.setBackground(new Color(225, 223, 228));
		num4.setForeground(Color.black);
		num4.setFont(new Font("Arial", 1, 25));
		add(num4);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/chance.png").getImage();

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

	public JComboBox<Integer> getNum1() {
		return num1;
	}

	public void setNum1(JComboBox<Integer> num1) {
		this.num1 = num1;
	}

	public JComboBox<Integer> getNum2() {
		return num2;
	}

	public void setNum2(JComboBox<Integer> num2) {
		this.num2 = num2;
	}

	public JComboBox<Integer> getNum3() {
		return num3;
	}

	public void setNum3(JComboBox<Integer> num3) {
		this.num3 = num3;
	}

	public JComboBox<Integer> getNum4() {
		return num4;
	}

	public void setNum4(JComboBox<Integer> num4) {
		this.num4 = num4;
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
