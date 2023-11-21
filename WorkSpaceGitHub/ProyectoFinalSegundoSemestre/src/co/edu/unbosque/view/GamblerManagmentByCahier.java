package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GamblerManagmentByCahier extends JFrame {

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

	public GamblerManagmentByCahier() {
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

	public JButton getCreate() {
		return create;
	}

	public void setCreate(JButton create) {
		this.create = create;
	}

	public JButton getRead() {
		return read;
	}

	public void setRead(JButton read) {
		this.read = read;
	}

	public JButton getUpdate() {
		return update;
	}

	public void setUpdate(JButton update) {
		this.update = update;
	}

	public JButton getDelete() {
		return delete;
	}

	public void setDelete(JButton delete) {
		this.delete = delete;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
