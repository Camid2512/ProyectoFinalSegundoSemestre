package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

	private JPanel panelBotones;
	private JButton btn1, btn2;
	private JLabel titulo, imagen;

	public VentanaPrincipal() {

		setTitle("MENU PRINCIPAL");
		setBounds(0, 0, 600, 500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btn1 = new JButton("ADMITIDO");
		btn1.setForeground(Color.black);
		btn1.setFont(new Font("Times New Roman", 1, 15));
		btn1.setBounds(130, 130, 150, 70);
		add(btn1);

		btn2 = new JButton("NO ADMITIDO");
		btn2.setForeground(Color.black);
		btn2.setFont(new Font("Times New Roman", 1, 15));
		btn2.setBounds(320, 130, 150, 70);
		add(btn2);


		titulo = new JLabel();
		titulo.setText("Seleccione si la persona fue admitida o no");
		titulo.setFont(new Font("Times New Roman", 1, 30));
		titulo.setForeground(Color.BLACK);
		titulo.setBounds(20, 50, 800, 70);
		add(titulo);

		imagen = new JLabel();
		imagen.setBounds(0, 250, 600, 250);
		Image temp;
		temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/mi.png").getImage();
		ImageIcon img;
		img = new ImageIcon(temp.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH));
		imagen.setIcon(img);
		add(imagen);

		setVisible(true);

		// TODO Auto-generated constructor stub
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

}
