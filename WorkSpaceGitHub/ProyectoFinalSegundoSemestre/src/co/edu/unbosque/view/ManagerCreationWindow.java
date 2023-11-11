package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de crear cuenta jefe de sede
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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ManagerCreationWindow extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private static final long serialVersionUID = -931051843069676671L;
	
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	private JButton exit, back, createAccount;
	
	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JLabel mainImage;
	
	/**
	 * Estos son los atributos de los campos de texto
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	private JTextField user, password;
	
	/**
	 * Este es el constructor vacio de la clase ventana de crear cuenta jefe de sede
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	public ManagerCreationWindow() {
		// TODO Auto-generated constructor stub
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

		user = new JTextField();
		user.setBounds(250, 263, 778, 70);
		user.setBackground(new Color(0, 0, 0, 0));
		user.setOpaque(false);
		user.setBorder(new EmptyBorder(15, 15, 15, 15));
		user.setFont(new Font("Arial", 1, 25));
		user.setForeground(Color.white);
		add(user);

		password = new JTextField();
		password.setBounds(250, 390, 778, 70);
		password.setBackground(new Color(0, 0, 0, 0));
		password.setOpaque(false);
		password.setBorder(new EmptyBorder(15, 15, 15, 15));
		password.setFont(new Font("Arial", 1, 25));
		password.setForeground(Color.white);
		add(password);

		createAccount = new JButton();
		createAccount.setBounds(455, 495, 375, 74);
		createAccount.setToolTipText("Boton para guardar el usuario y contraseña");
		createAccount.setBackground(new Color(0, 0, 0, 0));
		createAccount.setOpaque(false);
		createAccount.setContentAreaFilled(false);
		createAccount.setBorderPainted(false);
		add(createAccount);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/registerboss.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

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
	 * Este es el getter del boton atras
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getBack() {
		return back;
	}
	
	/**
	 * Este es el setter del boton atras
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setBack(JButton back) {
		this.back = back;
	}
	
	/**
	 * Este es el getter del boton crear cuenta
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getCreateAccount() {
		return createAccount;
	}
	
	/**
	 * Este es el setter del boton crear cuenta
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setCreateAccount(JButton createAccount) {
		this.createAccount = createAccount;
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
	 * Este es el getter del campo usuario
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JTextField getUser() {
		return user;
	}
	
	/**
	 * Este es el setter del campo usuario
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setUser(JTextField user) {
		this.user = user;
	}
	
	/**
	 * Este es el getter del campo contrasena
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JTextField getPassword() {
		return password;
	}
	
	/**
	 * Este es el setter del campo contrasena
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setPassword(JTextField password) {
		this.password = password;
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
