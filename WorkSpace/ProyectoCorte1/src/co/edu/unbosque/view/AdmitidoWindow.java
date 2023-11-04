package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdmitidoWindow extends JFrame {

	private JLabel admitidoTxt;
	private JButton crear, actualizar, eliminar, mostrar;
	private JPanel panelBotones;

	public AdmitidoWindow() {

		setBounds(300, 100, 800, 600);

		setTitle("Admitidos");
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);

		admitidoTxt = new JLabel("Personas admitidas");
		admitidoTxt.setBounds(80, 0, 1000, 200);
		admitidoTxt.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 80));
		panelBotones = new JPanel();
		panelBotones.setBounds(0, 200, 800, 362);
		panelBotones.setLayout(new GridLayout(2, 2));

		crear = new JButton("Crear");
		actualizar = new JButton("Actualizar");
		eliminar = new JButton("Eliminar");
		mostrar = new JButton("Mostrar");

		add(admitidoTxt);
		add(panelBotones);
		panelBotones.add(crear);
		panelBotones.add(actualizar);
		panelBotones.add(eliminar);
		panelBotones.add(mostrar);

	}

	public JLabel getAdmitidoTxt() {
		return admitidoTxt;
	}

	public void setAdmitidoTxt(JLabel admitidoTxt) {
		this.admitidoTxt = admitidoTxt;
	}

	public JButton getCrear() {
		return crear;
	}

	public void setCrear(JButton crear) {
		this.crear = crear;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getMostrar() {
		return mostrar;
	}

	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

}
