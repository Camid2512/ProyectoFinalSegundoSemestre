package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OwnerWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

		mod1Btn = new JButton("MOD 1");
		mod1Btn.setBounds(0, 0, 50, 50);
		mod1Btn.setToolTipText("Boton gestion casa de apuestas");
//		mod1Btn.setBackground(new Color(0, 0, 0, 0));
//		mod1Btn.setOpaque(false);
//		mod1Btn.setContentAreaFilled(false);
//		mod1Btn.setBorderPainted(false);
		add(mod1Btn);

		mod2Btn = new JButton("MOD 2");
		mod2Btn.setBounds(0, 60, 50, 50);
		mod2Btn.setToolTipText("Boton gestion sedes");
//		mod2Btn.setBackground(new Color(0, 0, 0, 0));
//		mod2Btn.setOpaque(false);
//		mod2Btn.setContentAreaFilled(false);
//		mod2Btn.setBorderPainted(false);
		add(mod2Btn);

		mod3Btn = new JButton("MOD 3");
		mod3Btn.setBounds(0, 120, 50, 50);
		mod3Btn.setToolTipText("Boton gestion apostadores");
//		mod3Btn.setBackground(new Color(0, 0, 0, 0));
//		mod3Btn.setOpaque(false);
//		mod3Btn.setContentAreaFilled(false);
//		mod3Btn.setBorderPainted(false);
		add(mod3Btn);

		mod4Btn = new JButton("MOD4");
		mod4Btn.setBounds(60, 60, 50, 50);
		mod4Btn.setToolTipText("Boton gestion apuestas");
//		mod4Btn.setBackground(new Color(0, 0, 0, 0));
//		mod4Btn.setOpaque(false);
//		mod4Btn.setContentAreaFilled(false);
//		mod4Btn.setBorderPainted(false);
		add(mod4Btn);

		mod5Btn = new JButton("MOD 5");
		mod5Btn.setBounds(60, 120, 50, 50);
		mod5Btn.setToolTipText("Boton para consultas");
//		mod5Btn.setBackground(new Color(0, 0, 0, 0));
//		mod5Btn.setOpaque(false);
//		mod5Btn.setContentAreaFilled(false);
//		mod5Btn.setBorderPainted(false);
		add(mod5Btn);

		headquarterBtn = new JButton("CREAR SEDE");
		headquarterBtn.setBounds(60, 180, 50, 50);
		headquarterBtn.setToolTipText("Boton crear nueva sede");
//		headquarterBtn.setBackground(new Color(0, 0, 0, 0));
//		headquarterBtn.setOpaque(false);
//		headquarterBtn.setContentAreaFilled(false);
//		headquarterBtn.setBorderPainted(false);
		add(headquarterBtn);

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
