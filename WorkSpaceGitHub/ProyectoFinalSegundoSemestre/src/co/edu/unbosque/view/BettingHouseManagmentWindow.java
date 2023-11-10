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

public class BettingHouseManagmentWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton createBtn, exit, back;
	private JLabel mainImage;
	private JTextField nameHouse, totalBudget;
	private JSpinner numberVenue;
	private SpinnerNumberModel n;

	public BettingHouseManagmentWindow() {
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Informacion casa de apuestas");
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

		createBtn = new JButton();
		createBtn.setBounds(453, 508, 377, 75);
		createBtn.setToolTipText("Crear datos de la casa de apuestas");
		createBtn.setBackground(new Color(0, 0, 0, 0));
		createBtn.setOpaque(false);
		createBtn.setContentAreaFilled(false);
		createBtn.setBorderPainted(false);
		add(createBtn);

		nameHouse = new JTextField();
		nameHouse.setBounds(251, 178, 776, 67);
		nameHouse.setBackground(new Color(0, 0, 0, 0));
		nameHouse.setOpaque(false);
		nameHouse.setBorder(new EmptyBorder(15, 15, 15, 15));
		nameHouse.setFont(new Font("Arial", 1, 25));
		nameHouse.setForeground(Color.white);
		add(nameHouse);

		numberVenue = new JSpinner();
		numberVenue.setBounds(432, 409, 414, 69);
		n = new SpinnerNumberModel();
		n.setMinimum(0);
		numberVenue.setModel(n);
		numberVenue.setBorder(new EmptyBorder(20, 20, 20, 20));
		numberVenue.setFont(new Font("Arial", 1, 25));
		numberVenue.setForeground(Color.white);
		numberVenue.setBackground(new Color(188, 186, 190));
		numberVenue.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(numberVenue);

		totalBudget = new JTextField();
		totalBudget.setBounds(251, 309, 776, 67);
		totalBudget.setBackground(new Color(0, 0, 0, 0));
		totalBudget.setOpaque(false);
		totalBudget.setBorder(new EmptyBorder(15, 15, 15, 15));
		totalBudget.setFont(new Font("Arial", 1, 25));
		totalBudget.setForeground(Color.white);
		add(totalBudget);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/modulo1.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	public JButton getCreateBtn() {
		return createBtn;
	}

	public void setCreateBtn(JButton createBtn) {
		this.createBtn = createBtn;
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

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JTextField getNameHouse() {
		return nameHouse;
	}

	public void setNameHouse(JTextField nameHouse) {
		this.nameHouse = nameHouse;
	}

	public JTextField getTotalBudget() {
		return totalBudget;
	}

	public void setTotalBudget(JTextField totalBudget) {
		this.totalBudget = totalBudget;
	}

	public JSpinner getNumberVenue() {
		return numberVenue;
	}

	public void setNumberVenue(JSpinner numberVenue) {
		this.numberVenue = numberVenue;
	}

	public SpinnerNumberModel getN() {
		return n;
	}

	public void setN(SpinnerNumberModel n) {
		this.n = n;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}