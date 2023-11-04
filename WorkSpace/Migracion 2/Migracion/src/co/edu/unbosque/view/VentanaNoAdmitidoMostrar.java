package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaNoAdmitidoMostrar extends JFrame{
	
	private JLabel text;
	
	public VentanaNoAdmitidoMostrar() {
		
		setTitle("MOSTRAR");
		setBounds(0, 0, 600, 500);
		setLayout(new GridLayout(4, 1));
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		
		text = new JLabel();
		text.setBounds(0, 0, 600, 500);
		
		
		// TODO Auto-generated constructor stub
	}

	public JLabel getText() {
		return text;
	}

	public void setText(JLabel text) {
		this.text = text;
	}
		// TODO Auto-generated constructor stub
	}


