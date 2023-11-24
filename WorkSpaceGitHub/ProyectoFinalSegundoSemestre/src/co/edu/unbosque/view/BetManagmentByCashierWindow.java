package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de gestion de apuesta del dueno
 * @author Cristhian Diaz 
 * @author Santiago Rueda
 * @version 1.0
 * @since 10/11/2023*/

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/** 
 * Esta es la clase ventana de gestion de apuesta del dueno
 * @author Cristhian Diaz 
 * @author Santiago Rueda
 * @version 1.0
 * @since 10/11/2023*/
public class BetManagmentByCashierWindow extends JFrame {

	

	private static final long serialVersionUID = 415700271536832498L;

	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	private JButton exit, back, create, read, delete;

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
	 * Este es el constructor vacio de la ventana de gestion de apuesta del dueno
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	public BetManagmentByCashierWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("MODULO 4");
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

		create = new JButton();
		create.setBounds(161, 194, 424, 157);
		create.setToolTipText("CREAR APUESTA");
		create.setBackground(new Color(0, 0, 0, 0));
		create.setOpaque(false);
		create.setContentAreaFilled(false);
		create.setBorderPainted(false);
		add(create);

		read = new JButton();
		read.setBounds(699, 194, 424, 157);
		read.setToolTipText("MOSTRAR APUESTA");
		read.setBackground(new Color(0, 0, 0, 0));
		read.setOpaque(false);
		read.setContentAreaFilled(false);
		read.setBorderPainted(false);
		add(read);

		delete = new JButton();
		delete.setBounds(429, 397, 424, 157);
		delete.setToolTipText("ELIMINAR APUESTA");
		delete.setBackground(new Color(0, 0, 0, 0));
		delete.setOpaque(false);
		delete.setContentAreaFilled(false);
		delete.setBorderPainted(false);
		add(delete);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/modulo4own.png").getImage();

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
	 * Este es el getter del boton crear
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getCreate() {
		return create;
	}

	/**
	 * Este es el setter del boton crear
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setCreate(JButton create) {
		this.create = create;
	}

	/**
	 * Este es el getter del boton mostrar
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getRead() {
		return read;
	}

	/**
	 * Este es el setter del boton mostrar
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setRead(JButton read) {
		this.read = read;
	}

	/**
	 * Este es el getter del boton eliminar
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getDelete() {
		return delete;
	}

	/**
	 * Este es el setter del boton eliminar
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setDelete(JButton delete) {
		this.delete = delete;
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
