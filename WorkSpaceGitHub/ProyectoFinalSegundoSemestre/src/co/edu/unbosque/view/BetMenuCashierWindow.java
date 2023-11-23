package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BetMenuCashierWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1021661811041945435L;

	private JLabel mainImage;
	private JButton exit, back, loteria, betPlay, superAstro, chance, baloto;

	public BetMenuCashierWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SELECCIONAR APUESTA PARA HACER");
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

		loteria = new JButton();
		loteria.setBounds(227, 201, 329, 101);
		loteria.setToolTipText("LOTERIA");
		loteria.setBackground(new Color(0, 0, 0, 0));
		loteria.setOpaque(false);
		loteria.setContentAreaFilled(false);
		loteria.setBorderPainted(false);
		add(loteria);

		betPlay = new JButton();
		betPlay.setBounds(763, 201, 329, 101);
		betPlay.setToolTipText("BETPLAY");
		betPlay.setBackground(new Color(0, 0, 0, 0));
		betPlay.setOpaque(false);
		betPlay.setContentAreaFilled(false);
		betPlay.setBorderPainted(false);
		add(betPlay);

		superAstro = new JButton();
		superAstro.setBounds(227, 338, 329, 101);
		superAstro.setToolTipText("SUPERASTRO");
		superAstro.setBackground(new Color(0, 0, 0, 0));
		superAstro.setOpaque(false);
		superAstro.setContentAreaFilled(false);
		superAstro.setBorderPainted(false);
		add(superAstro);

		chance = new JButton();
		chance.setBounds(763, 338, 329, 101);
		chance.setToolTipText("CHANCE");
		chance.setBackground(new Color(0, 0, 0, 0));
		chance.setOpaque(false);
		chance.setContentAreaFilled(false);
		chance.setBorderPainted(false);
		add(chance);

		baloto = new JButton();
		baloto.setBounds(494, 474, 329, 101);
		baloto.setToolTipText("BALOTO");
		baloto.setBackground(new Color(0, 0, 0, 0));
		baloto.setOpaque(false);
		baloto.setContentAreaFilled(false);
		baloto.setBorderPainted(false);
		add(baloto);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/selectbettodo.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
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

	public JButton getLoteria() {
		return loteria;
	}

	public void setLoteria(JButton loteria) {
		this.loteria = loteria;
	}

	public JButton getBetPlay() {
		return betPlay;
	}

	public void setBetPlay(JButton betPlay) {
		this.betPlay = betPlay;
	}

	public JButton getSuperAstro() {
		return superAstro;
	}

	public void setSuperAstro(JButton superAstro) {
		this.superAstro = superAstro;
	}

	public JButton getChance() {
		return chance;
	}

	public void setChance(JButton chance) {
		this.chance = chance;
	}

	public JButton getBaloto() {
		return baloto;
	}

	public void setBaloto(JButton baloto) {
		this.baloto = baloto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
