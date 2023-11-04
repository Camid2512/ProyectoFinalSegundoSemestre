package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaAdmitido extends JFrame {

	private JButton crear, eliminar, actualizar, mostrar, atras;
	private JPanel panelBotones;
	private JLabel texto1;

	public VentanaAdmitido() {

		setTitle("ADMITIDO");
		setBounds(0, 0, 600, 500);
		setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);

		crear = new JButton("CREAR");
		crear.setForeground(Color.black);

		eliminar = new JButton("ELIMINAR");
		eliminar.setForeground(Color.black);

		actualizar = new JButton("ACTUALIZAR");
		actualizar.setForeground(Color.black);

		mostrar = new JButton("MOSTRAR");
		mostrar.setForeground(Color.black);

		atras = new JButton("ATRAS");
		atras.setBounds(240, 300, 100, 70);
		atras.setForeground(Color.black);
		add(atras);

		panelBotones = new JPanel();
		panelBotones.setBounds(85, 80, 400, 150);
		panelBotones.setLayout(new GridLayout(2, 2));
		panelBotones.add(crear);
		panelBotones.add(eliminar);
		panelBotones.add(actualizar);
		panelBotones.add(mostrar);
		add(panelBotones);

		texto1 = new JLabel();
		texto1.setText("Eliga la opcion que desea hacer: ");
		texto1.setFont(new Font("Times New Roman", 1, 28));
		texto1.setBounds(90, 15, 600, 40);

		add(texto1);

		// TODO Auto-generated constructor stub
	}

	public JButton getCrear() {
		return crear;
	}

	public void setCrear(JButton crear) {
		this.crear = crear;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public JButton getMostrar() {
		return mostrar;
	}

	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public JLabel getTexto1() {
		return texto1;
	}

	public void setTexto1(JLabel texto1) {
		this.texto1 = texto1;
	}

}
