package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUpWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1518185821545289498L;

	private JLabel titulo;
	private JTextField usuario, contraseña;

	public SignUpWindow() {

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Registro Sesion");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

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

}