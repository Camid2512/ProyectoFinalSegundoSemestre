package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MilitarLocalWindowCRUD extends JFrame {

	private static final long serialVersionUID = -563151822461943994L;
	private JLabel mainImage;
	private JButton createBtn, updateBtn, deleteBtn, readBtn, backBtn;

	public MilitarLocalWindowCRUD() {
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CRUD MILITAR LOCAL");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		// Botones

		createBtn = new JButton();
		createBtn.setBounds(206, 298, 422, 128);
		createBtn.setToolTipText("Este boton nos lleva a crear una Militar Local");
		createBtn.setBackground(new Color(0, 0, 0, 0));
		createBtn.setOpaque(false);
		createBtn.setContentAreaFilled(false);
		createBtn.setBorderPainted(false);
		add(createBtn);

		readBtn = new JButton();
		readBtn.setBounds(651, 298, 422, 128);
		readBtn.setToolTipText("Este boton nos lleva a ver una tabla de los Militares Locales");
		readBtn.setBackground(new Color(0, 0, 0, 0));
		readBtn.setOpaque(false);
		readBtn.setContentAreaFilled(false);
		readBtn.setBorderPainted(false);
		add(readBtn);

		// x, y , largo, ancho
		deleteBtn = new JButton();
		deleteBtn.setBounds(206, 492, 422, 128);
		deleteBtn.setToolTipText("Este boton nos lleva a eliminar un Militar Local");
		deleteBtn.setBackground(new Color(0, 0, 0, 0));
		deleteBtn.setOpaque(false);
		deleteBtn.setContentAreaFilled(false);
		deleteBtn.setBorderPainted(false);
		add(deleteBtn);

		updateBtn = new JButton();
		updateBtn.setBounds(651, 492, 422, 128);
		updateBtn.setToolTipText("Este boton nos lleva a actualizar por posicion a un Militar Local");
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
		temporal1 = new ImageIcon("src/Images/4.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JButton getCreateBtn() {
		return createBtn;
	}

	public void setCreateBtn(JButton createBtn) {
		this.createBtn = createBtn;
	}

	public JButton getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(JButton updateBtn) {
		this.updateBtn = updateBtn;
	}

	public JButton getDeleteBtn() {
		return deleteBtn;
	}

	public void setDeleteBtn(JButton deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public JButton getReadBtn() {
		return readBtn;
	}

	public void setReadBtn(JButton readBtn) {
		this.readBtn = readBtn;
	}

	public JButton getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(JButton backBtn) {
		this.backBtn = backBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
