package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	private JButton admitidobt, noAdmitidobt;
	private JLabel migracionImagen;
	private JPanel panelBotones;

	public MainWindow() {

		setBounds(0, 0, 800, 600);
		setResizable(false);
		setTitle("Migración Colombia");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.GRAY);

		setLayout(null);

		// Panel botones
		panelBotones = new JPanel();
		panelBotones.setBounds(0, 200, 800, 362);
		panelBotones.setLayout(new GridLayout(1, 1));

		// Botones
		admitidobt = new JButton("Personas Admitidas");
		panelBotones.add(admitidobt);
		noAdmitidobt = new JButton("Personas no Admitidas");
		panelBotones.add(noAdmitidobt);

		// iMAGEN
		migracionImagen = new JLabel();
		migracionImagen.setBounds(0, 0, 800, 200);

		Image temporal1;
		temporal1 = new ImageIcon("src/Imagenes/channels4_profile (2).jpg").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(temporal1.getScaledInstance(migracionImagen.getWidth(), migracionImagen.getHeight(),
				Image.SCALE_SMOOTH));

		migracionImagen.setIcon(img1);
		migracionImagen.setVisible(true);
		add(migracionImagen);
		add(panelBotones);

	}

	public JButton getAdmitidobt() {
		return admitidobt;
	}

	public void setAdmitidobt(JButton admitidobt) {
		this.admitidobt = admitidobt;
	}

	public JButton getNoAdmitidobt() {
		return noAdmitidobt;
	}

	public void setNoAdmitidobt(JButton noAdmitidobt) {
		this.noAdmitidobt = noAdmitidobt;
	}

	public JLabel getMigracionImagen() {
		return migracionImagen;
	}

	public void setMigracionImagen(JLabel migracionImagen) {
		this.migracionImagen = migracionImagen;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

}
