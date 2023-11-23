package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VenueManagmentByOwnerWindow extends JFrame {

	/**
	 * 
	 * Representa la interfaz gráfica para la gestión de lugares por parte del
	 * propietario. Autor: SOFTPYLSA Versión: 1.0 Fecha: 10/11/2023
	 */

	/** SerialVersionUID para la serialización */
	private static final long serialVersionUID = 415700271536832498L;

	/** Botones de la interfaz */
	private JButton exit, back, create, read, update, delete;

	/** Etiqueta principal de imagen */
	private JLabel mainImage;

	/**
	 * Este es el constructor, se encarga tambien de crear la ventana
	 */
	public VenueManagmentByOwnerWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("MODULO 2");
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
		create.setToolTipText("Crear sede");
		create.setBackground(new Color(0, 0, 0, 0));
		create.setOpaque(false);
		create.setContentAreaFilled(false);
		create.setBorderPainted(false);
		add(create);

		read = new JButton();
		read.setBounds(699, 194, 424, 157);
		read.setToolTipText("Mostrar sede");
		read.setBackground(new Color(0, 0, 0, 0));
		read.setOpaque(false);
		read.setContentAreaFilled(false);
		read.setBorderPainted(false);
		add(read);

		update = new JButton();
		update.setBounds(161, 385, 424, 157);
		update.setToolTipText("Actualizar sede");
		update.setBackground(new Color(0, 0, 0, 0));
		update.setOpaque(false);
		update.setContentAreaFilled(false);
		update.setBorderPainted(false);
		add(update);

		delete = new JButton();
		delete.setBounds(699, 385, 424, 157);
		delete.setToolTipText("Eliminar sede");
		delete.setBackground(new Color(0, 0, 0, 0));
		delete.setOpaque(false);
		delete.setContentAreaFilled(false);
		delete.setBorderPainted(false);
		add(delete);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/modulo2own.png").getImage();

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
	 * Obtiene el botón para crear.
	 */
	public JButton getCreate() {
		return create;
	}

	/**
	 * Establece el botón para crear.
	 */
	public void setCreate(JButton create) {
		this.create = create;
	}

	/**
	 * Obtiene el botón para leer.
	 */
	public JButton getRead() {
		return read;
	}

	/**
	 * Establece el botón para leer.
	 */
	public void setRead(JButton read) {
		this.read = read;
	}

	/**
	 * Obtiene el botón para actualizar.
	 */
	public JButton getUpdate() {
		return update;
	}

	/**
	 * Establece el botón para actualizar.
	 */
	public void setUpdate(JButton update) {
		this.update = update;
	}

	/**
	 * Obtiene el botón para eliminar.
	 */
	public JButton getDelete() {
		return delete;
	}

	/**
	 * Establece el botón para eliminar.
	 */
	public void setDelete(JButton delete) {
		this.delete = delete;
	}

	/**
	 * Obtiene la etiqueta de imagen principal.
	 */
	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Establece la etiqueta de imagen principal.
	 */
	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Obtiene el identificador serial de la versión de la clase.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
