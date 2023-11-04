package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaNoAdmitido extends JFrame {
	
	private JTextField numDocumento,nombreCompleto,ciudadOrigen,diaNacimiento, mesNacimiento,anoNacimiento, pais, ciudadDevolucion, diaExpulsion, mesExpulsion, anoExpulsion, motivoExpulsion;
	private JLabel texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10, texto11, texto12;
	private JButton guardar;
	
	public VentanaNoAdmitido() {
		
		setBounds(0, 0, 600, 900);
		setLayout(null);
		setTitle("NO ADMITIDO");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		texto1 = new JLabel();
		texto1.setText("ingrese el numero de documento");
		texto1.setBounds(200, 15, 250, 15);
		add(texto1);
		
		numDocumento = new JTextField();
		numDocumento.setBounds(250, 30, 80, 20);
		add(numDocumento);
		
		texto2 = new JLabel();
		texto2.setText("ingrese el nombre completo");
		texto2.setBounds(200, 60, 250, 15);
		add(texto2);
		
		nombreCompleto = new JTextField();
		nombreCompleto.setBounds(250, 75, 80, 20);
		add(nombreCompleto);
		
		texto3 = new JLabel();
		texto3.setText("ingrese la ciudad de origen");
		texto3.setBounds(200, 105, 250, 15);
		add(texto3);
		
		ciudadOrigen = new JTextField();
		ciudadOrigen.setBounds(250, 120, 80, 20);
		add(ciudadOrigen);
		
		texto4 = new JLabel();
		texto4.setText("ingrese el dia de nacimiento");
		texto4.setBounds(200,150, 250, 15);
		add(texto4);
		
		diaNacimiento = new JTextField();
		diaNacimiento.setBounds(250, 165, 80, 20);
		add(diaNacimiento);
		
		texto5 = new JLabel();
		texto5.setText("ingrese el mes de nacimiento");
		texto5.setBounds(200, 195, 250, 15);
		add(texto5);
		
		mesNacimiento = new JTextField();
		mesNacimiento.setBounds(250, 210, 80, 20);
		add(mesNacimiento);
		
		texto6 = new JLabel();
		texto6.setText("ingrese el año de nacimiento");
		texto6.setBounds(200, 240, 250, 15);
		add(texto6);
		
		anoNacimiento = new JTextField();
		anoNacimiento.setBounds(250, 255, 80, 20);
		add(anoNacimiento);
		
		texto7 = new JLabel();
		texto7.setText("ingrese el pais");
		texto7.setBounds(200, 285, 250, 15);
		add(texto7);
		
		pais = new JTextField();
		pais.setBounds(250, 300, 80, 20);
		add(pais);
		
		texto8 = new JLabel();
		texto8.setText("ingrese la ciudad de devolucion");
		texto8.setBounds(200, 330, 250, 15);
		add(texto8);
		
		ciudadDevolucion = new JTextField();
		ciudadDevolucion.setBounds(250, 345, 80, 20);
		add(ciudadDevolucion);
		
		texto9 = new JLabel();
		texto9.setText("ingrese el dia de expulsion");
		texto9.setBounds(200, 375, 250, 15);
		add(texto9);
		
		diaExpulsion = new JTextField();
		diaExpulsion.setBounds(250, 390, 80, 20);
		add(diaExpulsion);
		
		texto10 = new JLabel();
		texto10.setText("ingrese el mes de expulsion");
		texto10.setBounds(200, 420, 250, 15);
		add(texto10);
		
		mesExpulsion = new JTextField();
		mesExpulsion.setBounds(250, 435, 80, 20);
		add(mesExpulsion);
		
		texto11 = new JLabel();
		texto11.setText("ingrese el año de expulsion");
		texto11.setBounds(200, 465, 250, 15);
		add(texto11);
		
		anoExpulsion = new JTextField();
		anoExpulsion.setBounds(250, 480, 80, 20);
		add(anoExpulsion);
		
		texto12 = new JLabel();
		texto12.setText("ingrese el motivo de expulsion");
		texto12.setBounds(200, 510, 200, 15);
		add(texto12);
		
		motivoExpulsion = new JTextField();
		motivoExpulsion.setBounds(250, 525, 80, 20);
		add(motivoExpulsion);
		
		guardar = new JButton("GUARDAR");
		guardar.setForeground(Color.black);
		guardar.setBounds(250, 555, 80, 50);
		add(guardar);
		
		
		// TODO Auto-generated constructor stub
	}
	
	

}
