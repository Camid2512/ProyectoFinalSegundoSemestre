package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de buscar por atributo militar extranjero
 * @author Cristhian Diaz
 * @version 1.0
 * @since 28/09/2023*/

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MilitarForeignSearchByAttrbs extends JFrame {
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private static final long serialVersionUID = 3475926803345092111L;

	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JButton backBtn, docBtn, nameBtn, studiesLevelBtn, timeInArmyBtn, ageBtn, posBtn;
	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JLabel mainImage, helpImage;
	
	/**
	 * Este es el constructor vacio de la ventana buscar por atributo militar extranjero
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public MilitarForeignSearchByAttrbs() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("VENTANA BUSQUEDA POR ATRIBUTOS");
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

		docBtn = new JButton();
		docBtn.setBounds(235, 226, 266, 71);
		docBtn.setToolTipText("BUSQUEDA POR DOCUMENTO");
		docBtn.setBackground(new Color(0, 0, 0, 0));
		docBtn.setOpaque(false);
		docBtn.setContentAreaFilled(false);
		docBtn.setBorderPainted(false);
		add(docBtn);

		nameBtn = new JButton();
		nameBtn.setBounds(687, 226, 195, 71);
		nameBtn.setToolTipText("BUSQUEDA POR NOMBRE");
		nameBtn.setBackground(new Color(0, 0, 0, 0));
		nameBtn.setOpaque(false);
		nameBtn.setContentAreaFilled(false);
		nameBtn.setBorderPainted(false);
		add(nameBtn);

		studiesLevelBtn = new JButton();
		studiesLevelBtn.setBounds(235, 333, 385, 71);
		studiesLevelBtn.setToolTipText("BUSQUEDA POR NIVEL DE ESTUDIOS");
		studiesLevelBtn.setBackground(new Color(0, 0, 0, 0));
		studiesLevelBtn.setOpaque(false);
		studiesLevelBtn.setContentAreaFilled(false);
		studiesLevelBtn.setBorderPainted(false);
		add(studiesLevelBtn);

		timeInArmyBtn = new JButton();
		timeInArmyBtn.setBounds(687, 333, 463, 77);
		timeInArmyBtn.setToolTipText("BUSQUEDA POR TIEMPO EN EL EJERCITO");
		timeInArmyBtn.setBackground(new Color(0, 0, 0, 0));
		timeInArmyBtn.setOpaque(false);
		timeInArmyBtn.setContentAreaFilled(false);
		timeInArmyBtn.setBorderPainted(false);
		add(timeInArmyBtn);

		ageBtn = new JButton();
		ageBtn.setBounds(235, 440, 156, 75);
		ageBtn.setToolTipText("BUSQUEDA POR EDAD");
		ageBtn.setBackground(new Color(0, 0, 0, 0));
		ageBtn.setOpaque(false);
		ageBtn.setContentAreaFilled(false);
		ageBtn.setBorderPainted(false);
		add(ageBtn);

		posBtn = new JButton();
		posBtn.setBounds(687, 440, 219, 73);
		posBtn.setToolTipText("BUSQUEDA POR POSICION");
		posBtn.setBackground(new Color(0, 0, 0, 0));
		posBtn.setOpaque(false);
		posBtn.setContentAreaFilled(false);
		posBtn.setBorderPainted(false);
		add(posBtn);

		helpImage = new JLabel();
		helpImage.setBounds(590, 600, 104, 104);
		helpImage.setToolTipText("VENTANA PARA BUSQUEDA POR ATRIBUTOS DE MILITAR EXTRANJERO");
		helpImage.setIcon(null);
		add(helpImage);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/15.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_DEFAULT));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);
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
	 * Este es el getter de el boton de documento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public JButton getDocBtn() {
		return docBtn;
	}
	
	/**
	 * Este es el setter de el boton de documento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public void setDocBtn(JButton docBtn) {
		this.docBtn = docBtn;
	}
	

	/**
	 * Este es el getter de el boton de nombre
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getNameBtn() {
		return nameBtn;
	}
	

	/**
	 * Este es el setter de el boton de nombre
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setNameBtn(JButton nameBtn) {
		this.nameBtn = nameBtn;
	}
	/**
	 * Este es el getter de el boton de niveles de estudio
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getStudiesLevelBtn() {
		return studiesLevelBtn;
	}

	/**
	 * Este es el setter de el boton de niveles de estudio
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setStudiesLevelBtn(JButton studiesLevelBtn) {
		this.studiesLevelBtn = studiesLevelBtn;
	}
	
	/**
	 * Este es el getter de el boton de tiempo en el ejercito
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getTimeInArmyBtn() {
		return timeInArmyBtn;
	}
	/**
	 * Este es el setter de el boton de tiempo en el ejercito
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setTimeInArmyBtn(JButton timeInArmyBtn) {
		this.timeInArmyBtn = timeInArmyBtn;
	}

	/**
	 * Este es el getter de el boton de edad
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public JButton getAgeBtn() {
		return ageBtn;
	}
	
	/**
	 * Este es el setter de el boton de edad
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setAgeBtn(JButton ageBtn) {
		this.ageBtn = ageBtn;
	}
	/**
	 * Este es el getter de el boton de posicion
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getPosBtn() {
		return posBtn;
	}
	/**
	 * Este es el setter de el boton de posicion
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setPosBtn(JButton posBtn) {
		this.posBtn = posBtn;
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
	 * Este es el getter de la imagen ayuda
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public JLabel getHelpImage() {
		return helpImage;
	}
	
	/**
	 * Este es el setter de la imagen ayuda
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public void setHelpImage(JLabel helpImage) {
		this.helpImage = helpImage;
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
