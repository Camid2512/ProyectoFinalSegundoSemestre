package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 1865397045744303071L;

	private JLabel mainImage;
	private JButton civilBtn, militarBtn, videoBtn, salir;

	public MainWindow() {

		setBounds(40, 2, 1280, 720);
		setResizable(false);
		setTitle("Nomina de personal Ejercito Nacional");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		// Boton CIVIL
		civilBtn = new JButton();
		civilBtn.setBounds(71, 300, 556, 143);
		civilBtn.setToolTipText("Boton para CRUD de Civil");
		civilBtn.setBackground(new Color(0, 0, 0, 0));
		civilBtn.setOpaque(false);
		civilBtn.setContentAreaFilled(false);
		civilBtn.setBorderPainted(false);
		add(civilBtn);

		// Boton Militar
		militarBtn = new JButton();
		militarBtn.setBounds(652, 300, 556, 143);
		militarBtn.setToolTipText("Boton para menu militar");
		militarBtn.setBackground(new Color(0, 0, 0, 0));
		militarBtn.setOpaque(false);
		militarBtn.setContentAreaFilled(false);
		militarBtn.setBorderPainted(false);
		add(militarBtn);

		// Boton Video
		videoBtn = new JButton();
		videoBtn.setBounds(362, 480, 556, 143);
		videoBtn.setToolTipText("Boton para observar video explicativo");
		videoBtn.setBackground(new Color(0, 0, 0, 0));
		videoBtn.setOpaque(false);
		videoBtn.setContentAreaFilled(false);
		videoBtn.setBorderPainted(false);
		add(videoBtn);

		// Boton Salir
		salir = new JButton();
		salir.setBounds(42, 615, 185, 60);
		salir.setToolTipText("Boton cierre de programa");
		salir.setBackground(new Color(0, 0, 0, 0));
		salir.setOpaque(false);
		salir.setContentAreaFilled(false);
		salir.setBorderPainted(false);
		add(salir);

		// Imagen
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/1.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_DEFAULT));

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

	public JButton getCivilBtn() {
		return civilBtn;
	}

	public void setCivilBtn(JButton civilBtn) {
		this.civilBtn = civilBtn;
	}

	public JButton getMilitarBtn() {
		return militarBtn;
	}

	public void setMilitarBtn(JButton militarBtn) {
		this.militarBtn = militarBtn;
	}

	public JButton getVideoBtn() {
		return videoBtn;
	}

	public void setVideoBtn(JButton videoBtn) {
		this.videoBtn = videoBtn;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
