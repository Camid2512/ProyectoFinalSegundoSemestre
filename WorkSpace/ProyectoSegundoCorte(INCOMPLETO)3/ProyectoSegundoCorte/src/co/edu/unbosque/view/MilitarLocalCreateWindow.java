package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de crear militar extranjero
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
import javax.swing.border.EmptyBorder;

public class MilitarLocalCreateWindow extends JFrame {
	
	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	private static final long serialVersionUID = -3677176083995704289L;

	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JLabel mainImage, personalPhoto, helpImage1, helpImage2, helpImage3, helpImage4, helpImage5, helpImage6;
	/**
	 * Estos son los atributos de los capos de textos
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	
	private JTextField docTxt, nameTxt, dayBirthTxt, monthBirthTxt, yearBirthTxt, rankTxt, serviceTimeTxt;
	
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	private JButton backBtn, createBtn, fileChooserBtn;

	/**
	 * Este es el constructor vacio de la ventana crear militar local
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public MilitarLocalCreateWindow() {

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CREATE MILITAR LOCAL");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		// BOTON ATRAS
		backBtn = new JButton();
		backBtn.setBounds(30, 600, 165, 99);
		backBtn.setToolTipText("Regresar a la ventana anterior");
		backBtn.setBackground(new Color(0, 0, 0, 0));
		backBtn.setOpaque(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		add(backBtn);

		// BOTON CREAR
		createBtn = new JButton();
		createBtn.setBounds(445, 598, 345, 95);
		createBtn.setToolTipText("Boton que permite la creacion de un Militar Local");
		createBtn.setBackground(new Color(0, 0, 0, 0));
		createBtn.setOpaque(false);
		createBtn.setContentAreaFilled(false);
		createBtn.setBorderPainted(false);
		add(createBtn);

		// BOTON FILECHOOSER
		fileChooserBtn = new JButton();
		fileChooserBtn.setBounds(900, 623, 158, 40);
		fileChooserBtn.setToolTipText("PNG/JPG");
		fileChooserBtn.setBackground(new Color(0, 0, 0, 0));
		fileChooserBtn.setOpaque(false);
		fileChooserBtn.setContentAreaFilled(false);
		fileChooserBtn.setBorderPainted(false);
		add(fileChooserBtn);

		// TEXTO PARA DOCUMENTO
		docTxt = new JTextField();
		docTxt.setBounds(58, 235, 309, 70);
		docTxt.setBackground(new Color(0, 0, 0, 0));
		docTxt.setOpaque(false);
		docTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		docTxt.setFont(new Font("Arial", 1, 25));
		docTxt.setForeground(Color.white);
		add(docTxt);

		nameTxt = new JTextField();
		nameTxt.setBounds(420, 235, 309, 70);
		nameTxt.setBackground(new Color(0, 0, 0, 0));
		nameTxt.setOpaque(false);
		nameTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		nameTxt.setFont(new Font("Arial", 1, 25));
		nameTxt.setForeground(Color.white);
		add(nameTxt);

		rankTxt = new JTextField();
		rankTxt.setBounds(58, 365, 309, 70);
		rankTxt.setBackground(new Color(0, 0, 0, 0));
		rankTxt.setOpaque(false);
		rankTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		rankTxt.setFont(new Font("Arial", 1, 25));
		rankTxt.setForeground(Color.white);
		add(rankTxt);

		serviceTimeTxt = new JTextField();
		serviceTimeTxt.setBounds(538, 404, 100, 65);
		serviceTimeTxt.setBackground(new Color(0, 0, 0, 0));
		serviceTimeTxt.setOpaque(false);
		serviceTimeTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		serviceTimeTxt.setFont(new Font("Arial", 1, 40));
		serviceTimeTxt.setForeground(Color.white);
		add(serviceTimeTxt);

		dayBirthTxt = new JTextField();
		dayBirthTxt.setBounds(78, 505, 80, 52);
		dayBirthTxt.setBackground(new Color(0, 0, 0, 0));
		dayBirthTxt.setOpaque(false);
		dayBirthTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		dayBirthTxt.setFont(new Font("Arial", 1, 30));
		dayBirthTxt.setForeground(Color.white);
		add(dayBirthTxt);

		monthBirthTxt = new JTextField();
		monthBirthTxt.setBounds(164, 505, 80, 52);
		monthBirthTxt.setBackground(new Color(0, 0, 0, 0));
		monthBirthTxt.setOpaque(false);
		monthBirthTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		monthBirthTxt.setFont(new Font("Arial", 1, 30));
		monthBirthTxt.setForeground(Color.white);
		add(monthBirthTxt);

		yearBirthTxt = new JTextField();
		yearBirthTxt.setBounds(268, 505, 120, 52);
		yearBirthTxt.setBackground(new Color(0, 0, 0, 0));
		yearBirthTxt.setOpaque(false);
		yearBirthTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		yearBirthTxt.setFont(new Font("Arial", 1, 30));
		yearBirthTxt.setForeground(Color.white);
		add(yearBirthTxt);

		// Creacion JFileChooser

		personalPhoto = new JLabel();
		personalPhoto.setBounds(880, 200, 372, 385);

		// Imagenes de ayuda

		helpImage1 = new JLabel();
		helpImage1.setBounds(370, 248, 35, 35);
		helpImage1.setToolTipText("INGRESE EL NUMERO DE DOCUMENTO\n SIN PUNTOS NI COMAS");

		helpImage2 = new JLabel();
		helpImage2.setBounds(740, 248, 35, 35);
		helpImage2.setToolTipText("INGRESE EL NOMBRE COMPLETO");

		helpImage3 = new JLabel();
		helpImage3.setBounds(370, 380, 35, 35);
		helpImage3.setToolTipText("INGRESE EL RANGO");

		helpImage4 = new JLabel();
		helpImage4.setBounds(660, 422, 35, 35);
		helpImage4.setToolTipText("INGRESE EL NUMERO DE MESES DE SERVICIO EN EL EJERCITO");

		helpImage5 = new JLabel();
		helpImage5.setBounds(405, 510, 35, 35);
		helpImage5.setToolTipText("INGRESE FECHA DE NACIMIENTO (DD/MM/AAAA)");

		helpImage6 = new JLabel();
		helpImage6.setBounds(1065, 625, 35, 35);
		helpImage6.setToolTipText("INSERTE LA FOTO");

		Image temporal2;
		temporal2 = new ImageIcon("src/Images/botonayuda.png").getImage();

		ImageIcon img2;
		img2 = new ImageIcon(
				temporal2.getScaledInstance(helpImage1.getWidth(), helpImage1.getHeight(), Image.SCALE_SMOOTH));

		helpImage1.setIcon(img2);
		helpImage1.setVisible(true);
		add(helpImage1);

		helpImage2.setIcon(img2);
		helpImage2.setVisible(true);
		add(helpImage2);

		helpImage3.setIcon(img2);
		helpImage3.setVisible(true);
		add(helpImage3);

		helpImage4.setIcon(img2);
		helpImage4.setVisible(true);
		add(helpImage4);

		helpImage5.setIcon(img2);
		helpImage5.setVisible(true);
		add(helpImage5);

		helpImage6.setIcon(img2);
		helpImage6.setVisible(true);
		add(helpImage6);

		// Imagen
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/7.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_DEFAULT));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(personalPhoto);
		add(mainImage);
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
	 * Este es el getter de la imagen personal
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getPersonalPhoto() {
		return personalPhoto;
	}

	/**
	 * Este es el setter de la imagen personal
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setPersonalPhoto(JLabel personalPhoto) {
		this.personalPhoto = personalPhoto;
	}

	/**
	 * Este es el getter de la imagen ayuda
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getHelpImage1() {
		return helpImage1;
	}
	/**
	 * Este es el setter de la imagen ayuda
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public void setHelpImage1(JLabel helpImage1) {
		this.helpImage1 = helpImage1;
	}
	/**
	 * Este es el getter de la imagen ayuda 2
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public JLabel getHelpImage2() {
		return helpImage2;
	}
	/**
	 * Este es el setter de la imagen ayuda 2
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public void setHelpImage2(JLabel helpImage2) {
		this.helpImage2 = helpImage2;
	}
	/**
	 * Este es el getter de la imagen ayuda 3
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getHelpImage3() {
		return helpImage3;
	}
	/**
	 * Este es el setter de la imagen ayuda 3
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setHelpImage3(JLabel helpImage3) {
		this.helpImage3 = helpImage3;
	}
	/**
	 * Este es el getter de la imagen ayuda 4
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getHelpImage4() {
		return helpImage4;
	}
	/**
	 * Este es el setter de la imagen ayuda 
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setHelpImage4(JLabel helpImage4) {
		this.helpImage4 = helpImage4;
	}

	/**
	 * Este es el getter de la imagen ayuda 5
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public JLabel getHelpImage5() {
		return helpImage5;
	}
	/**
	 * Este es el setter de la imagen ayuda 5
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setHelpImage5(JLabel helpImage5) {
		this.helpImage5 = helpImage5;
	}
	
	/**
	 * Este es el getter de la imagen ayuda 6
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JLabel getHelpImage6() {
		return helpImage6;
	}

	/**
	 * Este es el setter de la imagen ayuda 6
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public void setHelpImage6(JLabel helpImage6) {
		this.helpImage6 = helpImage6;
	}
	/**
	 * Este es el setter de el campo de documento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public JTextField getDocTxt() {
		return docTxt;
	}
	/**
	 * Este es el getter de el campo de documento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public void setDocTxt(JTextField docTxt) {
		this.docTxt = docTxt;
	}
	/**
	 * Este es el getter de el campo de nombre
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public JTextField getNameTxt() {
		return nameTxt;
	}
	/**
	 * Este es el setter de el campo de nombre
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */


	public void setNameTxt(JTextField nameTxt) {
		this.nameTxt = nameTxt;
	}
	
	/**
	 * Este es el getter de el campo de dia nacimiento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JTextField getDayBirthTxt() {
		return dayBirthTxt;
		
		/**
		 * Este es el setter de el campo de dia nacimiento
		 * 
		 * @author Cristhian Diaz
		 * @version 1.0
		 * @since 28/09/2023
		 */
	}

	
	public void setDayBirthTxt(JTextField dayBirthTxt) {
		this.dayBirthTxt = dayBirthTxt;
	}
	
	/**
	 * Este es el getter de el campo de mes nacimiento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JTextField getMonthBirthTxt() {
		return monthBirthTxt;
	}
	
	/**
	 * Este es el setter de el campo de mes nacimiento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setMonthBirthTxt(JTextField monthBirthTxt) {
		this.monthBirthTxt = monthBirthTxt;
	}
	/**
	 * Este es el getter de el campo de año nacimiento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JTextField getYearBirthTxt() {
		return yearBirthTxt;
	}

	/**
	 * Este es el setter de el campo de año nacimiento
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public void setYearBirthTxt(JTextField yearBirthTxt) {
		this.yearBirthTxt = yearBirthTxt;
	}
	
	/**
	 * Este es el getter de el campo rango
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JTextField getRankTxt() {
		return rankTxt;
	}
	
	/**
	 * Este es el setter de el campo rango
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setRankTxt(JTextField rankTxt) {
		this.rankTxt = rankTxt;
	}
	/**
	 * Este es el getter de el campo tiempo de servicio
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JTextField getServiceTimeTxt() {
		return serviceTimeTxt;
	}
	/**
	 * Este es el setter de el campo tiempo de servicio
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setServiceTimeTxt(JTextField serviceTimeTxt) {
		this.serviceTimeTxt = serviceTimeTxt;
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
	 * Este es el getter de el boton de crear
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public JButton getCreateBtn() {
		return createBtn;
	}
	/**
	 * Este es el getter de el boton de crear
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setCreateBtn(JButton createBtn) {
		this.createBtn = createBtn;
	}

	/**
	 * Este es el getter de el boton de jfilechooser
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */
	public JButton getFileChooserBtn() {
		return fileChooserBtn;
	}
	/**
	 * Este es el setter de el boton de jfilechooser
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 28/09/2023
	 */

	public void setFileChooserBtn(JButton fileChooserBtn) {
		this.fileChooserBtn = fileChooserBtn;
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
