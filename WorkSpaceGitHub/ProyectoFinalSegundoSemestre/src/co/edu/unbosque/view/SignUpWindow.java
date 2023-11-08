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

public class SignUpWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1518185821545289498L;

	private JLabel mainImage;
	private JTextField usuario, password;
	private JButton botonRegistro, exit, back;

	public SignUpWindow() {

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Registro Sesion");
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

		usuario = new JTextField();
		usuario.setBounds(314, 214, 658, 70);
		usuario.setBackground(new Color(0, 0, 0, 0));
		usuario.setOpaque(false);
		usuario.setBorder(new EmptyBorder(15, 15, 15, 15));
		usuario.setFont(new Font("Arial", 1, 25));
		usuario.setForeground(Color.white);
		add(usuario);

		password = new JTextField();
		password.setBounds(314, 327, 658, 70);
		password.setBackground(new Color(0, 0, 0, 0));
		password.setOpaque(false);
		password.setBorder(new EmptyBorder(15, 15, 15, 15));
		password.setFont(new Font("Arial", 1, 25));
		password.setForeground(Color.white);
		add(password);

		botonRegistro = new JButton();
		botonRegistro.setBounds(446, 458, 420, 74);
		botonRegistro.setToolTipText("Boton para guardar el usuario y contraseña");
		botonRegistro.setBackground(new Color(0, 0, 0, 0));
		botonRegistro.setOpaque(false);
		botonRegistro.setContentAreaFilled(false);
		botonRegistro.setBorderPainted(false);
		add(botonRegistro);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/register.png").getImage();

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

	public JTextField getUsuario() {
		return usuario;
	}

	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}

	public JTextField getPassword() {
		return password;
	}

	public void setPassword(JTextField password) {
		this.password = password;
	}

	public JButton getBotonRegistro() {
		return botonRegistro;
	}

	public void setBotonRegistro(JButton botonRegistro) {
		this.botonRegistro = botonRegistro;
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

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

}