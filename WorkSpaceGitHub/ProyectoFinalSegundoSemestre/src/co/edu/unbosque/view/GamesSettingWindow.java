package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GamesSettingWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2408455044162041577L;

	private JButton exit, back, confirmData;
	private JLabel mainImage;
	private JTextField budget1, budget2, budget3, budget4, budget5;

	public GamesSettingWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("DATOS DE JUEGOS");
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

		confirmData = new JButton();
		confirmData.setBounds(507, 624, 266, 71);
		confirmData.setToolTipText("CONFIRMAR");
		confirmData.setBackground(new Color(0, 0, 0, 0));
		confirmData.setOpaque(false);
		confirmData.setContentAreaFilled(false);
		confirmData.setBorderPainted(false);
		add(confirmData);

		budget1 = new JTextField();
		budget1.setBounds(666, 185, 450, 67);
		budget1.setBackground(new Color(0, 0, 0, 0));
		budget1.setOpaque(false);
		budget1.setBorder(new EmptyBorder(15, 15, 15, 15));
		budget1.setFont(new Font("Arial", 1, 25));
		budget1.setForeground(Color.white);
		add(budget1);

		budget2 = new JTextField();
		budget2.setBounds(666, 271, 450, 67);
		budget2.setBackground(new Color(0, 0, 0, 0));
		budget2.setOpaque(false);
		budget2.setBorder(new EmptyBorder(15, 15, 15, 15));
		budget2.setFont(new Font("Arial", 1, 25));
		budget2.setForeground(Color.white);		
		add(budget2);

		budget3 = new JTextField();
		budget3.setBounds(666, 358, 450, 67);
		budget3.setBackground(new Color(0, 0, 0, 0));
		budget3.setOpaque(false);
		budget3.setBorder(new EmptyBorder(15, 15, 15, 15));
		budget3.setFont(new Font("Arial", 1, 25));
		budget3.setForeground(Color.white);
		add(budget3);

		budget4 = new JTextField();
		budget4.setBounds(666, 444, 450, 67);
		budget4.setBackground(new Color(0, 0, 0, 0));
		budget4.setOpaque(false);
		budget4.setBorder(new EmptyBorder(15, 15, 15, 15));
		budget4.setFont(new Font("Arial", 1, 25));
		budget4.setForeground(Color.white);		
		add(budget4);

		budget5 = new JTextField();
		budget5.setBounds(666, 531, 450, 67);
		budget5.setBackground(new Color(0, 0, 0, 0));
		budget5.setOpaque(false);
		budget5.setBorder(new EmptyBorder(15, 15, 15, 15));
		budget5.setFont(new Font("Arial", 1, 25));
		budget5.setForeground(Color.white);
		add(budget5);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/gamesseting.png").getImage();

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

	public JButton getConfirmData() {
		return confirmData;
	}

	public void setConfirmData(JButton confirmData) {
		this.confirmData = confirmData;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JTextField getBudget1() {
		return budget1;
	}

	public void setBudget1(JTextField budget1) {
		this.budget1 = budget1;
	}

	public JTextField getBudget2() {
		return budget2;
	}

	public void setBudget2(JTextField budget2) {
		this.budget2 = budget2;
	}

	public JTextField getBudget3() {
		return budget3;
	}

	public void setBudget3(JTextField budget3) {
		this.budget3 = budget3;
	}

	public JTextField getBudget4() {
		return budget4;
	}

	public void setBudget4(JTextField budget4) {
		this.budget4 = budget4;
	}

	public JTextField getBudget5() {
		return budget5;
	}

	public void setBudget5(JTextField budget5) {
		this.budget5 = budget5;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
