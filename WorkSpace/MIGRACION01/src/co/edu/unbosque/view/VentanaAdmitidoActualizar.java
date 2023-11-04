package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAdmitidoActualizar extends JFrame{
	
	private JTextField numDocumento,nombreCompleto,ciudadOrigen,diaNacimiento,mesNacimiento,anoNacimiento, pais, diaEntrada, mesEntrada, anoEntrada, horaEntrada, minutoEntrada ,diasEstadia;
	private JButton guardar;
	private JLabel texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10, texto11, texto12, texto13 ;
	
	
	public VentanaAdmitidoActualizar() {
		
		setBounds(0, 0, 600, 600);
		setLayout(null);
		setTitle("CREAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);

		texto1 = new JLabel();
		texto1.setText("Ingrese el Nuevo Numero de documento");
		texto1.setBounds(200, 15, 250, 15);
		add(texto1);

		numDocumento = new JTextField();
		numDocumento.setBounds(250, 30, 80, 20);
		add(numDocumento);

		texto2 = new JLabel();
		texto2.setText("Ingrese el Nuevo Nombre completo (RECUERDE MAX 3 NOMBRES Y APELLLIDOS)");
		texto2.setBounds(100, 60, 500, 15);
		add(texto2);

		nombreCompleto = new JTextField();
		nombreCompleto.setBounds(250, 75, 80, 20);
		add(nombreCompleto);

		texto3 = new JLabel();
		texto3.setText("Ingrese la Nueva Ciudad de origen");
		texto3.setBounds(200, 105, 250, 15);
		add(texto3);

		ciudadOrigen = new JTextField();
		ciudadOrigen.setBounds(250, 120, 80, 20);
		add(ciudadOrigen);

		texto4 = new JLabel();
		texto4.setText("Ingrese Nuevamente su Fecha de nacimiento");
		texto4.setBounds(200, 150, 250, 15);
		add(texto4);

		texto5 = new JLabel();
		texto5.setText("DIA/MES/AÑO");
		texto5.setBounds(250, 175, 80, 20);
		add(texto5);

		diaNacimiento = new JTextField();
		diaNacimiento.setBounds(250, 195, 20, 20);
		add(diaNacimiento);

		mesNacimiento = new JTextField();
		mesNacimiento.setBounds(275, 195, 20, 20);
		add(mesNacimiento);

		anoNacimiento = new JTextField();
		anoNacimiento.setBounds(300, 195, 20, 20);
		add(anoNacimiento);

		texto7 = new JLabel();
		texto7.setText("Ingrese el Nuevo Pais");
		texto7.setBounds(200, 225, 250, 15);
		add(texto7);

		pais = new JTextField();
		pais.setBounds(250, 240, 80, 20);
		add(pais);

		texto8 = new JLabel();
		texto8.setText("Ingrese la Nueva Fecha de entrada");
		texto8.setBounds(200, 270, 250, 15);
		add(texto8);

		texto6 = new JLabel();
		texto6.setText("DIA/MES/AÑO");
		texto6.setBounds(250, 290, 80, 20);
		add(texto6);

		diaEntrada = new JTextField();
		diaEntrada.setBounds(250, 310, 20, 20);
		add(diaEntrada);

		mesEntrada = new JTextField();
		mesEntrada.setBounds(275, 310, 20, 20);
		add(mesEntrada);

		anoEntrada = new JTextField();
		anoEntrada.setBounds(300, 310, 20, 20);
		add(anoEntrada);

		texto11 = new JLabel();
		texto11.setText("Ingrese la Nueva Hora de entrada");
		texto11.setBounds(200, 340, 250, 15);
		add(texto11);

		texto9 = new JLabel();
		texto9.setText("HH:MM");
		texto9.setBounds(260, 360, 250, 20);
		add(texto9);
		
		horaEntrada = new JTextField();
		horaEntrada.setBounds(260, 380, 20, 20);
		add(horaEntrada);

		minutoEntrada = new JTextField();
		minutoEntrada.setBounds(280, 380, 20, 20);
		add(minutoEntrada);

		texto13 = new JLabel();
		texto13.setText("Ingrese los Nuevos Dias de estadia");
		texto13.setBounds(200, 410, 250, 15);
		add(texto13);

		diasEstadia = new JTextField();
		diasEstadia.setBounds(250, 425, 80, 20);
		add(diasEstadia);

		guardar = new JButton("ACTUALIZAR");
		guardar.setForeground(Color.black);
		guardar.setBounds(225, 455, 120, 50);
		add(guardar);
		
		// TODO Auto-generated constructor stub
	}

}
