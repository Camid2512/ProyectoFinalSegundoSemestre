package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaNoAdmitidoEliminar extends JFrame {

	private JLabel texto1;
	private JTextField posicion;
	private JButton eliminar1;

	public VentanaNoAdmitidoEliminar() {

		setBounds(0, 0, 500, 300);
		setTitle("ELIMINAR");
		setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);

		texto1 = new JLabel();
		texto1.setText("Ingrese la posicion de la persona que quiere eliminar");
		texto1.setBounds(100, 50, 350, 80);
		add(texto1);

		posicion = new JTextField();
		posicion.setBounds(230, 130, 50, 50);
		posicion.setFont(new Font("Times New Roman", 1, 25));
		add(posicion);

		eliminar1 = new JButton("ELIMINAR");
		eliminar1.setForeground(getForeground());
		eliminar1.setBounds(205, 200, 100, 50);
		add(eliminar1);
		// TODO Auto-generated constructor stub
	}

	public JLabel getTexto1() {
		return texto1;
	}

	public void setTexto1(JLabel texto1) {
		this.texto1 = texto1;
	}

	public JTextField getPosicion() {
		return posicion;
	}

	public void setPosicion(JTextField posicion) {
		this.posicion = posicion;
	}

	public JButton getEliminar1() {
		return eliminar1;
	}

	public void setEliminar1(JButton eliminar1) {
		this.eliminar1 = eliminar1;
	}

}
