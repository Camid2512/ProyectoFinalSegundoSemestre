package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MilitarLocalShowWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6330696529217322879L;
	private JLabel mainImage;
	private JButton backBtn, imgBtn, searchBtn;
	private MilitarLocalTable tablePanel = new MilitarLocalTable();

	public MilitarLocalShowWindow() {
		// TODO Auto-generated constructor stub
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

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}

	public JButton getImgBtn() {
		return imgBtn;
	}

	public void setImgBtn(JButton imgBtn) {
		this.imgBtn = imgBtn;
	}

	public JButton getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(JButton searchBtn) {
		this.searchBtn = searchBtn;
	}

	public MilitarLocalTable getTablePanel() {
		return tablePanel;
	}

	public void setTablePanel(MilitarLocalTable tablePanel) {
		this.tablePanel = tablePanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
