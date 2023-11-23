package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BetMenuOwnerWindow extends JFrame {

	/**
	 * Clase que representa la ventana de selección de apuestas. * 
	 * 
	 * @author SOFTPYLSA
	 * @version 1.0
	 * @since 10/11/2023
	 */

	/** Número de versión de serialización. */
	private static final long serialVersionUID = -1021661811041945435L;

	/** Etiqueta principal de la ventana. */
	private JLabel mainImage;

	/** Botones de la ventana. */
	private JButton exit, back, loteria, betPlay, superAstro, chance, baloto;

	/**
	 * Constructor de la ventana de selección de apuestas.
	 */
	public BetMenuOwnerWindow() {
		// TODO Auto-generated constructor stub

		/**
		 * Configuración de botones y etiquetas visuales.
		 */
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

	/**
	 * Obtiene la etiqueta principal de la ventana.
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Establece la etiqueta principal de la ventana.
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
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
	 * Obtiene el botón de lotería.
	 */
	public JButton getLoteria() {
		return loteria;
	}

	/**
	 * Establece el botón de lotería.
	 */
	public void setLoteria(JButton loteria) {
		this.loteria = loteria;
	}

	/**
	 * Obtiene el botón de BetPlay.
	 */
	public JButton getBetPlay() {
		return betPlay;
	}

	/**
	 * Establece el botón de BetPlay.
	 */
	public void setBetPlay(JButton betPlay) {
		this.betPlay = betPlay;
	}

	/**
	 * Obtiene el botón de SuperAstro.
	 */
	public JButton getSuperAstro() {
		return superAstro;
	}

	/**
	 * Establece el botón de SuperAstro.
	 */
	public void setSuperAstro(JButton superAstro) {
		this.superAstro = superAstro;
	}

	/**
	 * Obtiene el botón de Chance.
	 */
	public JButton getChance() {
		return chance;
	}

	/**
	 * Establece el botón de Chance.
	 */
	public void setChance(JButton chance) {
		this.chance = chance;
	}

	/**
	 * Obtiene el botón de Baloto.
	 */
	public JButton getBaloto() {
		return baloto;
	}

	/**
	 * Establece el botón de Baloto.
	 */
	public void setBaloto(JButton baloto) {
		this.baloto = baloto;
	}

	/**
	 * Obtiene el número de versión de serialización.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
