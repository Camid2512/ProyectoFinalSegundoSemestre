package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de CRUD civil
 * @author Julian Garcia
 * @version 1.0
 * @since 26/09/2023*/
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMilitarWindow extends JFrame {
	
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */
	private static final long serialVersionUID = -1528077391259129130L;

	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */
	private JButton militarLocal, militarForeign, backBtn;
	
	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */
	private JLabel mainImage;
	/**
	 * Este es el constructor vacio de la ventana main militar window
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public MainMilitarWindow() {

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("VENTANA MILITAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		// Boton Local

		militarLocal = new JButton();
		militarLocal.setBounds(71, 396, 556, 143);
		militarLocal.setToolTipText("Este boton nos lleva a ver el CRUD completo de militar local");
		militarLocal.setBackground(new Color(0, 0, 0, 0));
		militarLocal.setOpaque(false);
		militarLocal.setContentAreaFilled(false);
		militarLocal.setBorderPainted(false);
		add(militarLocal);

		// Boton Extranjero

		militarForeign = new JButton();
		militarForeign.setBounds(652, 396, 556, 143);
		militarForeign.setToolTipText("Este boton nos lleva a ver el CRUD completo de militar extranjero");
		militarForeign.setBackground(new Color(0, 0, 0, 0));
		militarForeign.setOpaque(false);
		militarForeign.setContentAreaFilled(false);
		militarForeign.setBorderPainted(false);
		add(militarForeign);

		// Back Boton

		backBtn = new JButton();
		backBtn.setBounds(26, 168, 165, 99);
		backBtn.setToolTipText("Regresar a la ventana anterior");
		backBtn.setBackground(new Color(0, 0, 0, 0));
		backBtn.setOpaque(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		add(backBtn);

		// Imagen
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/3.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}
	
	/**
	 * Este es el getter de boton de militar local
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public JButton getMilitarLocal() {
		return militarLocal;
	}
	
	/**
	 * Este es el setter de boton de militar local
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */


	public void setMilitarLocal(JButton militarLocal) {
		this.militarLocal = militarLocal;
	}
	
	/**
	 * Este es el getter de boton de militar extranjero
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */


	public JButton getMilitarForeign() {
		return militarForeign;
	}
	/**
	 * Este es el setter de boton de militar extranjero
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public void setMilitarForeign(JButton militarForeign) {
		this.militarForeign = militarForeign;
	}
	
	/**
	 * Este es el getter del boton volver
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public JButton getBackBtn() {
		return backBtn;
	}
	
	/**
	 * Este es el setter del boton volver
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}
	
	/**
	 * Este es el getter de la imagen principal
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public JLabel getMainImage() {
		return mainImage;
	}
	
	/**
	 * Este es el setter de la imagen principal
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	/**
	 * Este es el getter de el serial
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
