package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OwnerWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel mainImage;
	private JButton mod1Btn, mod2Btn, mod3Btn, mod4Btn, mod5Btn, headquarterBtn, exit, back;

	public OwnerWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Iniciar sesión");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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

		mod1Btn = new JButton("MOD 1");
		mod1Btn.setBounds(189, 275, 434, 66);
		mod1Btn.setToolTipText("Boton gestion casa de apuestas");
		mod1Btn.setBackground(new Color(0, 0, 0, 0));
		mod1Btn.setOpaque(false);
		mod1Btn.setContentAreaFilled(false);
		mod1Btn.setBorderPainted(false);
		add(mod1Btn);

		mod2Btn = new JButton("MOD 2");
		mod2Btn.setBounds(656, 275, 434, 66);
		mod2Btn.setToolTipText("Boton gestion sedes");
		mod2Btn.setBackground(new Color(0, 0, 0, 0));
		mod2Btn.setOpaque(false);
		mod2Btn.setContentAreaFilled(false);
		mod2Btn.setBorderPainted(false);
		add(mod2Btn);

		mod3Btn = new JButton("MOD 3");
		mod3Btn.setBounds(189, 379, 434, 66);
		mod3Btn.setToolTipText("Boton gestion apostadores");
		mod3Btn.setBackground(new Color(0, 0, 0, 0));
		mod3Btn.setOpaque(false);
		mod3Btn.setContentAreaFilled(false);
		mod3Btn.setBorderPainted(false);
		add(mod3Btn);

		mod4Btn = new JButton("MOD4");
		mod4Btn.setBounds(656, 379, 434, 66);
		mod4Btn.setToolTipText("Boton gestion apuestas");
		mod4Btn.setBackground(new Color(0, 0, 0, 0));
		mod4Btn.setOpaque(false);
		mod4Btn.setContentAreaFilled(false);
		mod4Btn.setBorderPainted(false);
		add(mod4Btn);

		mod5Btn = new JButton("MOD 5");
		mod5Btn.setBounds(445, 482, 394, 75);
		mod5Btn.setToolTipText("Boton para consultas");
		mod5Btn.setBackground(new Color(0, 0, 0, 0));
		mod5Btn.setOpaque(false);
		mod5Btn.setContentAreaFilled(false);
		mod5Btn.setBorderPainted(false);
		add(mod5Btn);

		headquarterBtn = new JButton("CREAR SEDE");
		headquarterBtn.setBounds(445, 174, 391, 75);
		headquarterBtn.setToolTipText("Boton crear nueva sede");
		headquarterBtn.setBackground(new Color(0, 0, 0, 0));
		headquarterBtn.setOpaque(false);
		headquarterBtn.setContentAreaFilled(false);
		headquarterBtn.setBorderPainted(false);
		add(headquarterBtn);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/owner.png").getImage();

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

	public JButton getMod1Btn() {
		return mod1Btn;
	}

	public void setMod1Btn(JButton mod1Btn) {
		this.mod1Btn = mod1Btn;
	}

	public JButton getMod2Btn() {
		return mod2Btn;
	}

	public void setMod2Btn(JButton mod2Btn) {
		this.mod2Btn = mod2Btn;
	}

	public JButton getMod3Btn() {
		return mod3Btn;
	}

	public void setMod3Btn(JButton mod3Btn) {
		this.mod3Btn = mod3Btn;
	}

	public JButton getMod4Btn() {
		return mod4Btn;
	}

	public void setMod4Btn(JButton mod4Btn) {
		this.mod4Btn = mod4Btn;
	}

	public JButton getMod5Btn() {
		return mod5Btn;
	}

	public void setMod5Btn(JButton mod5Btn) {
		this.mod5Btn = mod5Btn;
	}

	public JButton getHeadquarterBtn() {
		return headquarterBtn;
	}

	public void setHeadquarterBtn(JButton headquarterBtn) {
		this.headquarterBtn = headquarterBtn;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
