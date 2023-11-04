package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

	private JLabel titulo;
	private JTextField usuario, contraseña;
	private JButton register, login;

	public LoginWindow() {
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Iniciar sesión");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		register = new JButton();
		register.setBounds(400, 500, 165, 99);
		register.setToolTipText("Crea una cuenta si no tienes una");
//		register.setBackground(new Color(0, 0, 0, 0));
//		register.setOpaque(false);
//		register.setContentAreaFilled(false);
//		register.setBorderPainted(false);
		add(register);

		login = new JButton();
		login.setBounds(300, 600, 165, 99);
		login.setToolTipText("Inicia sesión");
//		login.setBackground(new Color(0, 0, 0, 0));
//		login.setOpaque(false);
//		login.setContentAreaFilled(false);
//		login.setBorderPainted(false);
		add(login);

		usuario = new JTextField();
		usuario.setBounds(300, 235, 309, 70);
//		usuario.setBackground(new Color(0, 0, 0, 0));
//		usuario.setOpaque(false);
//		usuario.setBorder(new EmptyBorder(15, 15, 15, 15));
//		usuario.setFont(new Font("Arial", 1, 25));
//		usuario.setForeground(Color.white);
		add(usuario);

		contraseña = new JTextField();
		contraseña.setBounds(300, 350, 309, 70);
//		contraseña.setBackground(new Color(0, 0, 0, 0));
//		contraseña.setOpaque(false);
//		contraseña.setBorder(new EmptyBorder(15, 15, 15, 15));
//		contraseña.setFont(new Font("Arial", 1, 25));
//		contraseña.setForeground(Color.white);
		add(contraseña);
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JTextField getUsuario() {
		return usuario;
	}

	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}

	public JTextField getContraseña() {
		return contraseña;
	}

	public void setContraseña(JTextField contraseña) {
		this.contraseña = contraseña;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}