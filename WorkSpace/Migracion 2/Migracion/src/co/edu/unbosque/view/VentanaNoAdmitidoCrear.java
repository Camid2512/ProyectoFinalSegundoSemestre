package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaNoAdmitidoCrear extends JFrame {

	private JTextField numDocumento, nombreCompleto, ciudadOrigen, diaNacimiento, mesNacimiento, anoNacimiento, pais,
			ciudadDevolucion, diaExpulsion, mesExpulsion, anoExpulsion, motivoExpulsion;
	private JLabel texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10, texto11, texto12;
	private JButton guardar;

	public VentanaNoAdmitidoCrear() {

		setBounds(0, 0, 600, 900);
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
		texto8.setText("Ingrese la ciudad de devolucion");
		texto8.setBounds(200, 270, 250, 15);
		add(texto8);

		ciudadDevolucion = new JTextField();
		ciudadDevolucion.setBounds(250, 285, 80, 20);
		add(ciudadDevolucion);

		texto8 = new JLabel();
		texto8.setText("Ingrese la Fecha de devolucion");
		texto8.setBounds(200, 315, 250, 15);
		add(texto8);

		texto6 = new JLabel();
		texto6.setText("DIA/MES/AÑO");
		texto6.setBounds(250, 335, 80, 20);
		add(texto6);

		diaExpulsion = new JTextField();
		diaExpulsion.setBounds(250, 360, 20, 20);
		add(diaExpulsion);

		mesExpulsion = new JTextField();
		mesExpulsion.setBounds(275, 360, 20, 20);
		add(mesExpulsion);

		anoExpulsion = new JTextField();
		anoExpulsion.setBounds(300, 360, 20, 20);
		add(anoExpulsion);

		texto12 = new JLabel();
		texto12.setText("Ingrese el motivo de expulsion");
		texto12.setBounds(200, 390, 200, 15);
		add(texto12);

		motivoExpulsion = new JTextField();
		motivoExpulsion.setBounds(250, 405, 80, 20);
		add(motivoExpulsion);

		guardar = new JButton("GUARDAR");
		guardar.setForeground(Color.black);
		guardar.setBounds(235, 455, 100, 50);
		add(guardar);

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

	public JTextField getCiudadDevolucion() {
		return ciudadDevolucion;
	}

	public void setCiudadDevolucion(JTextField ciudadDevolucion) {
		this.ciudadDevolucion = ciudadDevolucion;
	}

	public JTextField getDiaExpulsion() {
		return diaExpulsion;
	}

	public void setDiaExpulsion(JTextField diaExpulsion) {
		this.diaExpulsion = diaExpulsion;
	}

	public JTextField getMesExpulsion() {
		return mesExpulsion;
	}

	public void setMesExpulsion(JTextField mesExpulsion) {
		this.mesExpulsion = mesExpulsion;
	}

	public JTextField getAnoExpulsion() {
		return anoExpulsion;
	}

	public void setAnoExpulsion(JTextField anoExpulsion) {
		this.anoExpulsion = anoExpulsion;
	}

	public JTextField getMotivoExpulsion() {
		return motivoExpulsion;
	}

	public void setMotivoExpulsion(JTextField motivoExpulsion) {
		this.motivoExpulsion = motivoExpulsion;
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

	public JButton getGuardar() {
		return guardar;
	}

	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}

}
