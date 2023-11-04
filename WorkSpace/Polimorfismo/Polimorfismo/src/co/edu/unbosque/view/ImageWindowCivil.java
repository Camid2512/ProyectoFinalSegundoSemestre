package co.edu.unbosque.view;

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
	 * 
	 */
	private static final long serialVersionUID = 648218609962890211L;

	private JButton btnAct, backBtn;
	private JLabel photo;
	private JLabel mainImage;
	private JComboBox<String> comboCivil;

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

	public JButton getBtnAct() {
		return btnAct;
	}

	public void setBtnAct(JButton btnAct) {
		this.btnAct = btnAct;
	}

	public JLabel getPhoto() {
		return photo;
	}

	public void setPhoto(JLabel photo) {
		this.photo = photo;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}

	public JComboBox<String> getComboCivil() {
		return comboCivil;
	}

	public void setComboCivil(JComboBox<String> comboCivil) {
		this.comboCivil = comboCivil;
	}

}
