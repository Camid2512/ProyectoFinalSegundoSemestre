package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de eliminar civil
 * @author Cristhian Diaz
 * @version 1.0
 * @since 28/09/2023*/
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CivilDeleteWindow extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private static final long serialVersionUID = 1520430449546115103L;

	/**
	 * Estos son los atributos de los textos
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JTextField posicionTxt;
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JButton delteBtn, backBtn;

	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JLabel mainImage, helpImage;
	
	/**
	 * Este es el constructor vacio de la ventana eliminar civil
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public CivilDeleteWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("DELETE CIVIL");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);
		backBtn = new JButton();
		backBtn.setBounds(30, 600, 165, 99);
		backBtn.setToolTipText("Regresar a la ventana anterior");
		backBtn.setBackground(new Color(0, 0, 0, 0));
		backBtn.setOpaque(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		add(backBtn);

		delteBtn = new JButton();
		delteBtn.setBounds(464, 482, 355, 95);
		delteBtn.setToolTipText("Boton que permite la eliminacion de un CIVIL");
		delteBtn.setBackground(new Color(0, 0, 0, 0));
		delteBtn.setOpaque(false);
		delteBtn.setContentAreaFilled(false);
		delteBtn.setBorderPainted(false);
		add(delteBtn);

		posicionTxt = new JTextField();
		posicionTxt.setBounds(450, 288, 380, 70);
		posicionTxt.setBackground(new Color(0, 0, 0, 0));
		posicionTxt.setOpaque(false);
		posicionTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		posicionTxt.setFont(new Font("Arial", 1, 40));
		posicionTxt.setHorizontalAlignment(SwingConstants.CENTER);
		posicionTxt.setForeground(Color.white);
		add(posicionTxt);

		helpImage = new JLabel();
		helpImage.setBounds(1105, 600, 104, 104);
		helpImage.setToolTipText("VENTANA PARA ELIMINACION DE CIVIL");
		helpImage.setIcon(null);
		add(helpImage);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/12.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_DEFAULT));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	/**
	 * Este es el getter de el campo de posicion
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public JTextField getPosicionTxt() {
		return posicionTxt;
	}
	/**
	 * Este es el setter de el campo de posicion
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setPosicionTxt(JTextField posicionTxt) {
		this.posicionTxt = posicionTxt;
	}

	/**
	 * Este es el getter de el boton de borrar
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public JButton getDelteBtn() {
		return delteBtn;
	}
	
	/**
	 * Este es el setter de el boton de borrar
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setDelteBtn(JButton delteBtn) {
		this.delteBtn = delteBtn;
	}
	
	/**
	 * Este es el getter de el boton de volver
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getBackBtn() {
		return backBtn;
	}
	
	/**
	 * Este es el setter de el boton de volver
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}
	
	/**
	 * Este es el getter de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getMainImage() {
		return mainImage;
	}
	
	/**
	 * Este es el setter de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}
	
	/**
	 * Este es el getter de el serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
