package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShowGamblerManager extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private static final long serialVersionUID = 8176187398995221112L;
	/**
	 * Estos son los atributos de la imagen principal
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JLabel mainImage;
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JButton exit, back;
	/**
	 * Este es el atributo de el panel tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private GamblerTableManager tablePanel = new GamblerTableManager();

	/**
	 * Este es el constructor vacio de la ventana mostrar militar extranjero
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public ShowGamblerManager() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("VENTANA TABLA APOSTADORES");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/show.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);

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

		add(back);
		add(exit);
		getContentPane().add(tablePanel);
		add(mainImage);
	}

	/**
	 * Este es el getter de imagen principal
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getMainImage() {
		return mainImage;
	}

	/**
	 * Este es el setter de imagen principal
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Este es el getter del boton panel tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public GamblerTableManager getTablePanel() {
		return tablePanel;
	}

	/**
	 * Este es el setter del boton panel tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setTablePanel(GamblerTableManager tablePanel) {
		this.tablePanel = tablePanel;
	}

	/**
	 * Este es el getter de el serial
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Este es el getter del boton salir
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getExit() {
		return exit;
	}

	/**
	 * Este es el setter del boton salir
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setExit(JButton exit) {
		this.exit = exit;
	}

	/**
	 * Este es el getter del boton volver
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getBack() {
		return back;
	}

	/**
	 * Este es el setter del boton volver
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setBack(JButton back) {
		this.back = back;
	}

}