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

public class CivilWindowCRUD extends JFrame {
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	private static final long serialVersionUID = 3344129822486279005L;
	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */
	private JLabel mainImage;

	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	private JButton createBtn, updateBtn, deleteBtn, readBtn, backBtn;

	/**
	 * Este es el constructor vacio de la ventana civil crud
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */
	public CivilWindowCRUD() {

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CRUD CIVIL");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		// Botones

		createBtn = new JButton();
		createBtn.setBounds(206, 298, 422, 128);
		createBtn.setToolTipText("Este boton nos lleva a crear una persona civil");
		createBtn.setBackground(new Color(0, 0, 0, 0));
		createBtn.setOpaque(false);
		createBtn.setContentAreaFilled(false);
		createBtn.setBorderPainted(false);
		add(createBtn);

		readBtn = new JButton();
		readBtn.setBounds(651, 298, 422, 128);
		readBtn.setToolTipText("Este boton nos lleva a ver una tabla de las personas civiles");
		readBtn.setBackground(new Color(0, 0, 0, 0));
		readBtn.setOpaque(false);
		readBtn.setContentAreaFilled(false);
		readBtn.setBorderPainted(false);
		add(readBtn);

		// x, y , largo, ancho
		deleteBtn = new JButton();
		deleteBtn.setBounds(206, 492, 422, 128);
		deleteBtn.setToolTipText("Este boton nos lleva a eliminar una persona civil");
		deleteBtn.setBackground(new Color(0, 0, 0, 0));
		deleteBtn.setOpaque(false);
		deleteBtn.setContentAreaFilled(false);
		deleteBtn.setBorderPainted(false);
		add(deleteBtn);

		updateBtn = new JButton();
		updateBtn.setBounds(651, 492, 422, 128);
		updateBtn.setToolTipText("Este boton nos lleva a actualizar por posicion a una persona civil");
		updateBtn.setBackground(new Color(0, 0, 0, 0));
		updateBtn.setOpaque(false);
		updateBtn.setContentAreaFilled(false);
		updateBtn.setBorderPainted(false);
		add(updateBtn);

		backBtn = new JButton();
		backBtn.setBounds(36, 180, 165, 99);
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
		temporal1 = new ImageIcon("src/Images/2.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

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
	 * Este es el getter del boton crear
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public JButton getCreateBtn() {
		return createBtn;
	}

	/**
	 * Este es el setter del boton crear
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public void setCreateBtn(JButton createBtn) {
		this.createBtn = createBtn;
	}

	/**
	 * Este es el getter del boton actualizar
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public JButton getUpdateBtn() {
		return updateBtn;
	}

	/**
	 * Este es el setter del boton actualizar
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public void setUpdateBtn(JButton updateBtn) {
		this.updateBtn = updateBtn;
	}

	/**
	 * Este es el getter del boton eliminar
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public JButton getDeleteBtn() {
		return deleteBtn;
	}

	/**
	 * Este es el setter del boton eliminar
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public void setDeleteBtn(JButton deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	/**
	 * Este es el getter del boton leer
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */
	public JButton getReadBtn() {
		return readBtn;
	}

	/**
	 * Este es el setter del boton leer
	 * 
	 * @author Julian Garcia
	 * @version 1.0
	 * @since 26/09/2023
	 */

	public void setReadBtn(JButton readBtn) {
		this.readBtn = readBtn;
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
