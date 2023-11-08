package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginWindow extends JFrame {

	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -1518185821545289498L;

	private JLabel titulo, mainImage;
	private JTextField usuario;
	private JPasswordField password;
	private JButton register, login, exit;

	public LoginWindow() {
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

		register = new JButton();
		register.setBounds(675, 490, 166, 41);
		register.setToolTipText("Crea una cuenta si no tienes una");
		register.setBackground(new Color(0, 0, 0, 0));
		register.setOpaque(false);
		register.setContentAreaFilled(false);
		register.setBorderPainted(false);
		add(register);

		login = new JButton();
		login.setBounds(443, 402, 396, 74);
		login.setToolTipText("Inicia sesión");
		login.setBackground(new Color(0, 0, 0, 0));
		login.setOpaque(false);
		login.setContentAreaFilled(false);
		login.setBorderPainted(false);
		add(login);

		usuario = new JTextField();
		usuario.setBounds(312, 179, 656, 68);
		usuario.setBackground(new Color(0, 0, 0, 0));
		usuario.setOpaque(false);
		usuario.setBorder(new EmptyBorder(15, 15, 15, 15));
		usuario.setFont(new Font("Arial", 1, 25));
		usuario.setForeground(Color.white);
		add(usuario);

		password = new JPasswordField();
		password.setBounds(312, 290, 656, 68);
		password.setBackground(new Color(0, 0, 0, 0));
		password.setOpaque(false);
		password.setBorder(new EmptyBorder(15, 15, 15, 15));
		password.setFont(new Font("Arial", 1, 25));
		password.setForeground(Color.white);
		add(password);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/login-register.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JTextField getUsuario() {
		return usuario;
	}

	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public void setPassword(JPasswordField password) {
		this.password = password;
	}

	public JButton getRegister() {
		return register;
	}

	public void setRegister(JButton register) {
		this.register = register;
	}

	public JButton getLogin() {
		return login;
	}

	public void setLogin(JButton login) {
		this.login = login;
	}

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}