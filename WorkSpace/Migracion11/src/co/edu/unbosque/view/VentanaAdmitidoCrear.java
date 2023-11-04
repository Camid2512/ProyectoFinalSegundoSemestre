package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAdmitidoCrear extends JFrame {

	private JTextField numDocumento, nombreCompleto, ciudadOrigen, diaNacimiento, mesNacimiento, anoNacimiento, pais,
			diaEntrada, mesEntrada, anoEntrada, horaEntrada, minutoEntrada, diasEstadia;
	private JButton guardar;
	private JLabel texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10, texto11, texto12,
			texto13, imagen;

	public VentanaAdmitidoCrear() {
		setBounds(0, 0, 600, 600);
		setLayout(null);
		setTitle("CREAR");
		setDefaultCloseOperation(HIDE_ON_CLOSE);

		texto1 = new JLabel();
		texto1.setText("Ingrese el Numero de documento");
		texto1.setBounds(200, 15, 250, 15);
		add(texto1);

		numDocumento = new JTextField();
		numDocumento.setBounds(250, 30, 80, 20);
		add(numDocumento);

		texto2 = new JLabel();
		texto2.setText("Ingrese el Nombre completo (RECUERDE MAX 3 NOMBRES Y APELLLIDOS)");
		texto2.setBounds(100, 60, 500, 15);
		add(texto2);

		nombreCompleto = new JTextField();
		nombreCompleto.setBounds(250, 75, 80, 20);
		add(nombreCompleto);

		texto3 = new JLabel();
		texto3.setText("Ingrese la Ciudad de origen");
		texto3.setBounds(200, 105, 250, 15);
		add(texto3);

		ciudadOrigen = new JTextField();
		ciudadOrigen.setBounds(250, 120, 80, 20);
		add(ciudadOrigen);

		texto4 = new JLabel();
		texto4.setText("Ingrese su Fecha de nacimiento");
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
		texto7.setText("Ingrese el Pais");
		texto7.setBounds(200, 225, 250, 15);
		add(texto7);

		pais = new JTextField();
		pais.setBounds(250, 240, 80, 20);
		add(pais);

		texto8 = new JLabel();
		texto8.setText("Ingrese la Fecha de entrada");
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
		texto11.setText("Ingrese la Hora de entrada");
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
		texto13.setText("Ingrese los Dias de estadia");
		texto13.setBounds(200, 410, 250, 15);
		add(texto13);

		diasEstadia = new JTextField();
		diasEstadia.setBounds(250, 425, 80, 20);
		add(diasEstadia);

		guardar = new JButton("GUARDAR");
		guardar.setForeground(Color.black);
		guardar.setBounds(235, 455, 100, 50);
		add(guardar);

//		imagen = new JLabel();
//		imagen.setBounds(0, 0, 600, 900);
//		Image temp;
//		temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/migra.png").getImage();
//		ImageIcon img;
//		img = new ImageIcon(temp.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH));
//		imagen.setIcon(img);
//		add(imagen);

		// TODO Auto-generated constructor stub
	}

	public JTextField getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(JTextField numDocumento) {
		this.numDocumento = numDocumento;
	}

	public JTextField getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(JTextField nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public JTextField getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(JTextField ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public JTextField getDiaNacimiento() {
		return diaNacimiento;
	}

	public void setDiaNacimiento(JTextField diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}

	public JTextField getMesNacimiento() {
		return mesNacimiento;
	}

	public void setMesNacimiento(JTextField mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}

	public JTextField getAnoNacimiento() {
		return anoNacimiento;
	}

	public void setAnoNacimiento(JTextField anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}

	public JTextField getPais() {
		return pais;
	}

	public void setPais(JTextField pais) {
		this.pais = pais;
	}

	public JTextField getDiaEntrada() {
		return diaEntrada;
	}

	public void setDiaEntrada(JTextField diaEntrada) {
		this.diaEntrada = diaEntrada;
	}

	public JTextField getMesEntrada() {
		return mesEntrada;
	}

	public void setMesEntrada(JTextField mesEntrada) {
		this.mesEntrada = mesEntrada;
	}

	public JTextField getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(JTextField anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public JTextField getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(JTextField horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public JTextField getMinutoEntrada() {
		return minutoEntrada;
	}

	public void setMinutoEntrada(JTextField minutoEntrada) {
		this.minutoEntrada = minutoEntrada;
	}

	public JTextField getDiasEstadia() {
		return diasEstadia;
	}

	public void setDiasEstadia(JTextField diasEstadia) {
		this.diasEstadia = diasEstadia;
	}

	public JButton getGuardar() {
		return guardar;
	}

	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}

	public JLabel getTexto1() {
		return texto1;
	}

	public void setTexto1(JLabel texto1) {
		this.texto1 = texto1;
	}

	public JLabel getTexto2() {
		return texto2;
	}

	public void setTexto2(JLabel texto2) {
		this.texto2 = texto2;
	}

	public JLabel getTexto3() {
		return texto3;
	}

	public void setTexto3(JLabel texto3) {
		this.texto3 = texto3;
	}

	public JLabel getTexto4() {
		return texto4;
	}

	public void setTexto4(JLabel texto4) {
		this.texto4 = texto4;
	}

	public JLabel getTexto5() {
		return texto5;
	}

	public void setTexto5(JLabel texto5) {
		this.texto5 = texto5;
	}

	public JLabel getTexto6() {
		return texto6;
	}

	public void setTexto6(JLabel texto6) {
		this.texto6 = texto6;
	}

	public JLabel getTexto7() {
		return texto7;
	}

	public void setTexto7(JLabel texto7) {
		this.texto7 = texto7;
	}

	public JLabel getTexto8() {
		return texto8;
	}

	public void setTexto8(JLabel texto8) {
		this.texto8 = texto8;
	}

	public JLabel getTexto9() {
		return texto9;
	}

	public void setTexto9(JLabel texto9) {
		this.texto9 = texto9;
	}

	public JLabel getTexto10() {
		return texto10;
	}

	public void setTexto10(JLabel texto10) {
		this.texto10 = texto10;
	}

	public JLabel getTexto11() {
		return texto11;
	}

	public void setTexto11(JLabel texto11) {
		this.texto11 = texto11;
	}

	public JLabel getTexto12() {
		return texto12;
	}

	public void setTexto12(JLabel texto12) {
		this.texto12 = texto12;
	}

	public JLabel getTexto13() {
		return texto13;
	}

	public void setTexto13(JLabel texto13) {
		this.texto13 = texto13;
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

}
