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
	 * Ventana de registro de usuario. Permite a los usuarios registrarse
	 * proporcionando información como usuario y contraseña.
	 * 
	 * @author SOFTPYLSA
	 * @version 1.0
	 * @since 10/11/2023
	 */

	/** Identificador de serialización de la clase. */
	private static final long serialVersionUID = -1518185821545289498L;

	/** Etiqueta para la imagen principal. */
	private JLabel mainImage;

	/** Campo de texto para ingresar el usuario, contraseña */
	private JTextField usuario, password;

	/** Botón para el registro del usuario, volver y salir */
	private JButton botonRegistro, exit, back;

	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */
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
		password.setBounds(314, 351, 658, 70);
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

	/**
	 * Obtiene la etiqueta para la imagen principal.
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Obtiene el campo de texto para el usuario.
	 */
	public JTextField getUsuario() {
		return usuario;
	}

	/**
	 * Establece el campo de texto para el usuario.
	 */
	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}

	/**
	 * Obtiene el campo de texto para la contraseña.
	 */
	public JTextField getPassword() {
		return password;
	}

	/**
	 * Establece el campo de texto para la contraseña.
	 */
	public void setPassword(JTextField password) {
		this.password = password;
	}

	/**
	 * Obtiene el botón para el registro del usuario.
	 */
	public JButton getBotonRegistro() {
		return botonRegistro;
	}

	/**
	 * Establece el botón para el registro del usuario.
	 */
	public void setBotonRegistro(JButton botonRegistro) {
		this.botonRegistro = botonRegistro;
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
	 * Obtiene el botón para retroceder.
	 */
	public JButton getBack() {
		return back;
	}

	/**
	 * Establece el botón para retroceder.
	 */
	public void setBack(JButton back) {
		this.back = back;
	}

	/**
	 * Obtiene el identificador de serialización de la clase.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Establece la etiqueta para la imagen principal.
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

}