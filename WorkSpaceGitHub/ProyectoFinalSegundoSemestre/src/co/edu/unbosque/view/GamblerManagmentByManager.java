package co.edu.unbosque.view;

/** 
 * Menu de gestion de apostadores en el cajero jefe de sede
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
 * Menu de gestion de apostadores en el cajero jefe de sede
 * @author Cristhian Diaz 
 * @author Santiago Rueda
 * @version 1.0
 * @since 10/11/2023*/
public class GamblerManagmentByManager extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 19/11/2023
	 */
	private static final long serialVersionUID = -6008736904091158887L;
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	private JButton exit, back, create, read, update, delete;

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
	 * Este es el constructor vacio de la clase ventana de gestion de apostador
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	public GamblerManagmentByManager() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("MODULO 3");
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
		create.setToolTipText("Crear apostador");
		create.setBackground(new Color(0, 0, 0, 0));
		create.setOpaque(false);
		create.setContentAreaFilled(false);
		create.setBorderPainted(false);
		add(create);

		read = new JButton();
		read.setBounds(699, 194, 424, 157);
		read.setToolTipText("Mostrar apostador");
		read.setBackground(new Color(0, 0, 0, 0));
		read.setOpaque(false);
		read.setContentAreaFilled(false);
		read.setBorderPainted(false);
		add(read);

		update = new JButton();
		update.setBounds(161, 385, 424, 157);
		update.setToolTipText("Actualizar apostador");
		update.setBackground(new Color(0, 0, 0, 0));
		update.setOpaque(false);
		update.setContentAreaFilled(false);
		update.setBorderPainted(false);
		add(update);

		delete = new JButton();
		delete.setBounds(699, 385, 424, 157);
		delete.setToolTipText("Eliminar apostador");
		delete.setBackground(new Color(0, 0, 0, 0));
		delete.setOpaque(false);
		delete.setContentAreaFilled(false);
		delete.setBorderPainted(false);
		add(delete);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/modulo3own.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);
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
	 * Obtiene el botón de retroceso.
	 */
	public JButton getBack() {
		return back;
	}

	/**
	 * Establece el botón de retroceso.
	 */
	public void setBack(JButton back) {
		this.back = back;
	}

	/**
	 * Obtiene el botón de creación.
	 */
	public JButton getCreate() {
		return create;
	}

	/**
	 * Establece el botón de creación.
	 */
	public void setCreate(JButton create) {
		this.create = create;
	}

	/**
	 * Obtiene el botón de lectura.
	 */
	public JButton getRead() {
		return read;
	}

	/**
	 * Establece el botón de lectura.
	 */
	public void setRead(JButton read) {
		this.read = read;
	}

	/**
	 * Obtiene el botón de actualización.
	 */
	public JButton getUpdate() {
		return update;
	}

	/**
	 * Establece el botón de actualización.
	 */
	public void setUpdate(JButton update) {
		this.update = update;
	}

	/**
	 * Obtiene el botón de eliminación.
	 */
	public JButton getDelete() {
		return delete;
	}

	/**
	 * Establece el botón de eliminación.
	 */
	public void setDelete(JButton delete) {
		this.delete = delete;
	}

	/**
	 * Obtiene la etiqueta principal de la imagen.
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Establece la etiqueta principal de la imagen.
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Obtiene el identificador de versión serial.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
