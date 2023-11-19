package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class VenueManagerMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4682807708706332707L;

	private JButton exit, back, manageVenue, gamblers, bets;
	private JLabel mainImage;

	private JTextArea nameVenue;

	public VenueManagerMenu() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("JEFE DE SEDE");
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

		manageVenue = new JButton();
		manageVenue.setBounds(385, 160, 512, 89);
		manageVenue.setToolTipText("GESTION SEDE");
		manageVenue.setBackground(new Color(0, 0, 0, 0));
		manageVenue.setOpaque(false);
		manageVenue.setContentAreaFilled(false);
		manageVenue.setBorderPainted(false);
		add(manageVenue);

		gamblers = new JButton();
		gamblers.setBounds(385, 317, 512, 89);
		gamblers.setToolTipText("GESTION APOSTADORES");
		gamblers.setBackground(new Color(0, 0, 0, 0));
		gamblers.setOpaque(false);
		gamblers.setContentAreaFilled(false);
		gamblers.setBorderPainted(false);
		add(gamblers);

		bets = new JButton();
		bets.setBounds(385, 474, 512, 89);
		bets.setBounds(385, 317, 512, 89);
		bets.setToolTipText("GESTION APUESTAS");
		bets.setBackground(new Color(0, 0, 0, 0));
		bets.setOpaque(false);
		bets.setContentAreaFilled(false);
		bets.setBorderPainted(false);
		add(bets);

		nameVenue = new JTextArea();
		nameVenue.setBounds(379, 10, 805, 95);
		nameVenue.setBackground(new Color(0, 0, 0, 0));
		nameVenue.setOpaque(false);
		nameVenue.setBorder(new EmptyBorder(15, 15, 15, 15));
		nameVenue.setFont(new Font("Arial", 1, 50));
		nameVenue.setForeground(Color.white);
		nameVenue.setEditable(false);
		nameVenue.setHighlighter(null);
		add(nameVenue);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/jefedesede.png").getImage();

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

	public JButton getManageVenue() {
		return manageVenue;
	}

	public void setManageVenue(JButton manageVenue) {
		this.manageVenue = manageVenue;
	}

	public JButton getGamblers() {
		return gamblers;
	}

	public void setGamblers(JButton gamblers) {
		this.gamblers = gamblers;
	}

	public JButton getBets() {
		return bets;
	}

	public void setBets(JButton bets) {
		this.bets = bets;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JTextArea getNameVenue() {
		return nameVenue;
	}

	public void setNameVenue(JTextArea nameVenue) {
		this.nameVenue = nameVenue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
