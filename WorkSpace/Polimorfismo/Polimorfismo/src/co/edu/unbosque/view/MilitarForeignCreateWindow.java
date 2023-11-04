package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MilitarForeignCreateWindow extends JFrame {

	private static final long serialVersionUID = 4674881751331917422L;

	private JLabel mainImage, personalPhoto, helpImage1, helpImage2, helpImage3, helpImage4, helpImage5, helpImage6;
	private JTextField docTxt, nameTxt, dayBirthTxt, monthBirthTxt, yearBirthTxt, countryOfOriginTxt,
			timeInOurCountryTxt;
	private JButton backBtn, createBtn, fileChooserBtn;

	public MilitarForeignCreateWindow() {
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CREATE MILITAR FOREIGN");
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
		createBtn.setToolTipText("Boton que permite la creacion de un Militar Extranjero");
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

		countryOfOriginTxt = new JTextField();
		countryOfOriginTxt.setBounds(58, 365, 309, 70);
		countryOfOriginTxt.setBackground(new Color(0, 0, 0, 0));
		countryOfOriginTxt.setOpaque(false);
		countryOfOriginTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		countryOfOriginTxt.setFont(new Font("Arial", 1, 25));
		countryOfOriginTxt.setForeground(Color.white);
		add(countryOfOriginTxt);

		timeInOurCountryTxt = new JTextField();
		timeInOurCountryTxt.setBounds(538, 404, 100, 65);
		timeInOurCountryTxt.setBackground(new Color(0, 0, 0, 0));
		timeInOurCountryTxt.setOpaque(false);
		timeInOurCountryTxt.setBorder(new EmptyBorder(15, 15, 15, 15));
		timeInOurCountryTxt.setFont(new Font("Arial", 1, 40));
		timeInOurCountryTxt.setForeground(Color.white);
		add(timeInOurCountryTxt);

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
		helpImage3.setToolTipText("INGRESE EL PAIS DE ORIGEN");

		helpImage4 = new JLabel();
		helpImage4.setBounds(660, 422, 35, 35);
		helpImage4.setToolTipText("INGRESE EL NUMERO DE MESES EN NUESTRO PAIS");

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
		temporal1 = new ImageIcon("src/Images/8.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_DEFAULT));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(personalPhoto);
		add(mainImage);
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JLabel getPersonalPhoto() {
		return personalPhoto;
	}

	public void setPersonalPhoto(JLabel personalPhoto) {
		this.personalPhoto = personalPhoto;
	}

	public JLabel getHelpImage1() {
		return helpImage1;
	}

	public void setHelpImage1(JLabel helpImage1) {
		this.helpImage1 = helpImage1;
	}

	public JLabel getHelpImage2() {
		return helpImage2;
	}

	public void setHelpImage2(JLabel helpImage2) {
		this.helpImage2 = helpImage2;
	}

	public JLabel getHelpImage3() {
		return helpImage3;
	}

	public void setHelpImage3(JLabel helpImage3) {
		this.helpImage3 = helpImage3;
	}

	public JLabel getHelpImage4() {
		return helpImage4;
	}

	public void setHelpImage4(JLabel helpImage4) {
		this.helpImage4 = helpImage4;
	}

	public JLabel getHelpImage5() {
		return helpImage5;
	}

	public void setHelpImage5(JLabel helpImage5) {
		this.helpImage5 = helpImage5;
	}

	public JLabel getHelpImage6() {
		return helpImage6;
	}

	public void setHelpImage6(JLabel helpImage6) {
		this.helpImage6 = helpImage6;
	}

	public JTextField getDocTxt() {
		return docTxt;
	}

	public void setDocTxt(JTextField docTxt) {
		this.docTxt = docTxt;
	}

	public JTextField getNameTxt() {
		return nameTxt;
	}

	public void setNameTxt(JTextField nameTxt) {
		this.nameTxt = nameTxt;
	}

	public JTextField getDayBirthTxt() {
		return dayBirthTxt;
	}

	public void setDayBirthTxt(JTextField dayBirthTxt) {
		this.dayBirthTxt = dayBirthTxt;
	}

	public JTextField getMonthBirthTxt() {
		return monthBirthTxt;
	}

	public void setMonthBirthTxt(JTextField monthBirthTxt) {
		this.monthBirthTxt = monthBirthTxt;
	}

	public JTextField getYearBirthTxt() {
		return yearBirthTxt;
	}

	public void setYearBirthTxt(JTextField yearBirthTxt) {
		this.yearBirthTxt = yearBirthTxt;
	}

	public JTextField getCountryOfOriginTxt() {
		return countryOfOriginTxt;
	}

	public void setCountryOfOriginTxt(JTextField countryOfOriginTxt) {
		this.countryOfOriginTxt = countryOfOriginTxt;
	}

	public JTextField getTimeInOurCountryTxt() {
		return timeInOurCountryTxt;
	}

	public void setTimeInOurCountryTxt(JTextField timeInOurCountryTxt) {
		this.timeInOurCountryTxt = timeInOurCountryTxt;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}

	public JButton getCreateBtn() {
		return createBtn;
	}

	public void setCreateBtn(JButton createBtn) {
		this.createBtn = createBtn;
	}

	public JButton getFileChooserBtn() {
		return fileChooserBtn;
	}

	public void setFileChooserBtn(JButton fileChooserBtn) {
		this.fileChooserBtn = fileChooserBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
