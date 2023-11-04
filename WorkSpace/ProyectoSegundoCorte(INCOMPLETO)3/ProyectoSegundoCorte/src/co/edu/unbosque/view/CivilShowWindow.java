package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de mostrar civil
 * @author Cristhian Diaz
 * @version 1.0
 * @since 28/09/2023*/

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CivilShowWindow extends JFrame {
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	private static final long serialVersionUID = 9047764898915981000L;

	/**
	 * Estos son los atributos de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JLabel mainImage;
	
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JButton backBtn, imgBtn, searchBtn;
	
	/**
	 * Este es el atributo de el panel tabla
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private CivilTable tablePanel = new CivilTable();
	
	/**
	 * Este es el constructor vacio de la ventana mostrar civil
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public CivilShowWindow() {
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("VENTANA TABLA CIVIL");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/21.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);

		backBtn = new JButton();
		backBtn.setBounds(30, 600, 165, 99);
		backBtn.setToolTipText("Regresar a la ventana anterior");
		backBtn.setBackground(new Color(0, 0, 0, 0));
		backBtn.setOpaque(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);

		searchBtn = new JButton();
		searchBtn.setBounds(125, 278, 260, 108);
		searchBtn.setToolTipText("Regresar a la ventana anterior");
		searchBtn.setBackground(new Color(0, 0, 0, 0));
		searchBtn.setOpaque(false);
		searchBtn.setContentAreaFilled(false);
		searchBtn.setBorderPainted(false);

		imgBtn = new JButton();
		imgBtn.setBounds(125, 432, 260, 108);
		imgBtn.setToolTipText("Llevar a la pestaña presentadora de fotos");
		imgBtn.setBackground(new Color(0, 0, 0, 0));
		imgBtn.setOpaque(false);
		imgBtn.setContentAreaFilled(false);
		imgBtn.setBorderPainted(false);

		add(backBtn);
		add(searchBtn);
		getContentPane().add(tablePanel);
		add(imgBtn);
		add(mainImage);
	}
	
	/**
	 * Este es el getter de la tabla de arrays
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public CivilTable getTablePanel() {
		return tablePanel;
	}
	
	/**
	 * Este es el setter de la tabla de arrays
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setTablePanel(CivilTable tablePanel) {
		this.tablePanel = tablePanel;
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
	 * Este es el getter del boton imagen
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getImgBtn() {
		return imgBtn;
	}
	/**
	 * Este es el setter del boton imagen
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setImgBtn(JButton imgBtn) {
		this.imgBtn = imgBtn;
	}
	
	/**
	 * Este es el getter de imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getMainImage() {
		return mainImage;
	}
	
	/**
	 * Este es el setter del boton imagen
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}
	
	/**
	 * Este es el getter del boton buscar
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getSearchBtn() {
		return searchBtn;
	}
	/**
	 * Este es el setter del boton buscar
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setSearchBtn(JButton searchBtn) {
		this.searchBtn = searchBtn;
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
