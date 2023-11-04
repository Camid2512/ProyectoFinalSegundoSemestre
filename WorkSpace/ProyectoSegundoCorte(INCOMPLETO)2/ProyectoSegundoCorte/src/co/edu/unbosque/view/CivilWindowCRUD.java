package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CivilWindowCRUD extends JFrame {

	private static final long serialVersionUID = 3344129822486279005L;
	private JLabel mainImage;

	public CivilWindowCRUD() {

		setBounds(40, 2, 1280, 720);
		setResizable(false);
		setTitle("Nomina de personal Ejercito Nacional");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLayout(null);

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
}