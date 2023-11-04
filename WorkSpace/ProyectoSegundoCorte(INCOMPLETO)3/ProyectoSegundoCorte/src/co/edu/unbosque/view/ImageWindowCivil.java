package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de imagen civil
 * @author Cristhian Diaz
 * @version 1.0
 * @since 28/09/2023*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageWindowCivil extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private static final long serialVersionUID = 648218609962890211L;

	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JButton btnAct, backBtn;
	
	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	private JLabel photo;
	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	
	
	private JLabel mainImage;
	
	/**
	 * Estos son los atributos de el jcombo box
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	private JComboBox<String> comboCivil;
	
	/**
	 * Este es el constructor vacio de la ventana imagem civil
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public ImageWindowCivil() {
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CRUD CIVIL");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		comboCivil = new JComboBox<>();
		comboCivil.setBounds(202, 246, 338, 78);
		comboCivil.setFont(new Font("Arial", 1, 25));

		btnAct = new JButton();
		btnAct.setBounds(202, 420, 338, 143);
		btnAct.setToolTipText("Actualiza la foto segun el nombre seleccionado");
		btnAct.setBackground(new Color(0, 0, 0, 0));
		btnAct.setOpaque(false);
		btnAct.setContentAreaFilled(false);
		btnAct.setBorderPainted(false);

		backBtn = new JButton();
		backBtn.setBounds(30, 600, 165, 99);
		backBtn.setToolTipText("Regresar a la ventana anterior");
		backBtn.setBackground(new Color(0, 0, 0, 0));
		backBtn.setOpaque(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);

		photo = new JLabel();
		photo.setBounds(736, 176, 476, 453);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/22.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);

		add(photo);
		add(btnAct);
		add(backBtn);
		add(comboCivil);
		add(mainImage);

	}

	/**
	 * Este es el getter del boton actualizar imagen
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public JButton getBtnAct() {
		return btnAct;
	}
	
	/**
	 * Este es el setter del boton actualizar imagen
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setBtnAct(JButton btnAct) {
		this.btnAct = btnAct;
	}
	/**
	 * Este es el getter de imagen
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getPhoto() {
		return photo;
	}
	/**
	 * Este es el setter de imagen
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setPhoto(JLabel photo) {
		this.photo = photo;
	}
	/**
	 * Este es el getter del boton volver
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getBackBtn() {
		return backBtn;
	}
	/**
	 * Este es el setter del boton volver
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}
	/**
	 * Este es el getter del jcombobox
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JComboBox<String> getComboCivil() {
		return comboCivil;
	}
	/**
	 * Este es el setter del jcombobox
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setComboCivil(JComboBox<String> comboCivil) {
		this.comboCivil = comboCivil;
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
	 * Este es el getter del serializado
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
