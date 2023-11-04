package co.edu.unbosque.view;

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

public class MilitarForeignDeleteWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6708435762120624222L;

	private JTextField posicionTxt;
	private JButton delteBtn, backBtn;
	private JLabel mainImage, helpImage;

	public MilitarForeignDeleteWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("DELETE MILITAR EXTRANJERO");
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
		delteBtn.setToolTipText("Boton que permite la eliminacion de un MILITAR EXTRANJERO");
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
		helpImage.setToolTipText("VENTANA PARA ELIMINACION DE MILITAR EXTRANJERO");
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

	public JTextField getPosicionTxt() {
		return posicionTxt;
	}

	public void setPosicionTxt(JTextField posicionTxt) {
		this.posicionTxt = posicionTxt;
	}

	public JButton getDelteBtn() {
		return delteBtn;
	}

	public void setDelteBtn(JButton delteBtn) {
		this.delteBtn = delteBtn;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
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
