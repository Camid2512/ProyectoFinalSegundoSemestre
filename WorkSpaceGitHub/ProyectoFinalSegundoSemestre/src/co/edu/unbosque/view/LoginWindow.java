package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de iniciar sesion
 * @author Cristhian Diaz 
 * @author Santiago Rueda
 * @version 1.0
 * @since 10/11/2023*/

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


/** 
 * Esta es la clase ventana de iniciar sesion
 * @author Cristhian Diaz 
 * @author Santiago Rueda
 * @version 1.0
 * @since 10/11/2023*/
public class LoginWindow extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private static final long serialVersionUID = -1518185821545289498L;
	
	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	private JLabel titulo, mainImage;
	
	/**
	 * Estos son los atributos de los campos de texto
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JTextField usuario;
	
	/**
	 * Estos son los atributos de los campos de contrasena
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JPasswordField password;
	
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JButton register, login, exit;
	
	/**
	 * Este es el constructor vacio de la ventana de iniciar sesion
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

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
		password.setBounds(315, 315, 656, 68);
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
	
	/**
	 * Este es el getter de la imagen titulo
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JLabel getTitulo() {
		return titulo;
	}
	
	/**
	 * Este es el setter de la imagen titulo
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Este es el getter de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JLabel getMainImage() {
		return mainImage;
	}
	
	/**
	 * Este es el setter de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}
	
	/**
	 * Este es el getter del campo nombre de usuario
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JTextField getUsuario() {
		return usuario;
	}
	
	/**
	 * Este es el setter del campo nombre de usuario
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Este es el getter del campo de contrasena de la contrasena
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JPasswordField getPassword() {
		return password;
	}
	
	/**
	 * Este es el setter del campo de contrasena de la contrasena
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setPassword(JPasswordField password) {
		this.password = password;
	}
	
	/**
	 * Este es el getter del boton registrar
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getRegister() {
		return register;
	}
	
	/**
	 * Este es el setter del boton registrar
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setRegister(JButton register) {
		this.register = register;
	}
	
	/**
	 * Este es el getter del boton iniciar sesion
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getLogin() {
		return login;
	}
	
	/**
	 * Este es el setter del boton iniciar sesion
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setLogin(JButton login) {
		this.login = login;
	}
	
	/**
	 * Este es el getter del boton salir
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getExit() {
		return exit;
	}
	
	/**
	 * Este es el setter del boton salir
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setExit(JButton exit) {
		this.exit = exit;
	}
	
	/**
	 * Este es el getter del serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}