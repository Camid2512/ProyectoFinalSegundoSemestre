package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MilitarForeignSearchByAttrbs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3475926803345092111L;

	private JButton backBtn, docBtn, nameBtn, studiesLevelBtn, timeInArmyBtn, ageBtn, posBtn;
	private JLabel mainImage, helpImage;

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

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}

	public JButton getDocBtn() {
		return docBtn;
	}

	public void setDocBtn(JButton docBtn) {
		this.docBtn = docBtn;
	}

	public JButton getNameBtn() {
		return nameBtn;
	}

	public void setNameBtn(JButton nameBtn) {
		this.nameBtn = nameBtn;
	}

	public JButton getStudiesLevelBtn() {
		return studiesLevelBtn;
	}

	public void setStudiesLevelBtn(JButton studiesLevelBtn) {
		this.studiesLevelBtn = studiesLevelBtn;
	}

	public JButton getTimeInArmyBtn() {
		return timeInArmyBtn;
	}

	public void setTimeInArmyBtn(JButton timeInArmyBtn) {
		this.timeInArmyBtn = timeInArmyBtn;
	}

	public JButton getAgeBtn() {
		return ageBtn;
	}

	public void setAgeBtn(JButton ageBtn) {
		this.ageBtn = ageBtn;
	}

	public JButton getPosBtn() {
		return posBtn;
	}

	public void setPosBtn(JButton posBtn) {
		this.posBtn = posBtn;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JLabel getHelpImage() {
		return helpImage;
	}

	public void setHelpImage(JLabel helpImage) {
		this.helpImage = helpImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
