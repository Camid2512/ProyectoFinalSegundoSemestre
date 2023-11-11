package co.edu.unbosque.view;

/** 
 * Esta es la clase ventana de gestion de la casa de apuestas
 * @author Cristhian Diaz 
 * @author Santiago Rueda
 * @version 1.0
 * @since 10/11/2023*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

public class BettingHouseManagmentWindow extends JFrame {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private static final long serialVersionUID = 8196911760891375266L;
	
	/**
	 * Estos son los atributos de los botones
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	private JButton createBtn, exit, back;
	

	/**
	 * Estos son los atributos de las imagenes
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JLabel mainImage;
	

	/**
	 * Estos son los atributos de los campos de texto
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JTextField nameHouse, totalBudget;
	
	/**
	 * Estos son los atributos de los spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private JSpinner numberVenue;
	
	/**
	 * Estos son los atributos del numero de modelo del spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */
	
	private SpinnerNumberModel n;
	
	/**
	 * Este es el constructor vacio de la ventana de gestion de la casa de apuestas
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 10/11/2023
	 */

	public BettingHouseManagmentWindow() {
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Informacion casa de apuestas");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		exit = new JButton();
		exit.setBounds(1199, 7, 74, 72);
		exit.setToolTipText("SALIR DEL PROGRAMA");
		exit.setBackground(new Color(0, 0, 0, 0));
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		add(exit);

		back = new JButton();
		back.setBounds(19, 637, 73, 73);
		back.setToolTipText("VOLVER");
		back.setBackground(new Color(0, 0, 0, 0));
		back.setOpaque(false);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		add(back);

		createBtn = new JButton();
		createBtn.setBounds(453, 508, 377, 75);
		createBtn.setToolTipText("Crear datos de la casa de apuestas");
		createBtn.setBackground(new Color(0, 0, 0, 0));
		createBtn.setOpaque(false);
		createBtn.setContentAreaFilled(false);
		createBtn.setBorderPainted(false);
		add(createBtn);

		nameHouse = new JTextField();
		nameHouse.setBounds(251, 178, 776, 67);
		nameHouse.setBackground(new Color(0, 0, 0, 0));
		nameHouse.setOpaque(false);
		nameHouse.setBorder(new EmptyBorder(15, 15, 15, 15));
		nameHouse.setFont(new Font("Arial", 1, 25));
		nameHouse.setForeground(Color.white);
		add(nameHouse);

		numberVenue = new JSpinner();
		numberVenue.setBounds(432, 409, 414, 69);
		n = new SpinnerNumberModel();
		n.setMinimum(0);
		numberVenue.setModel(n);
		numberVenue.setBorder(new EmptyBorder(20, 20, 20, 20));
		numberVenue.setFont(new Font("Arial", 1, 25));
		numberVenue.setForeground(Color.white);
		numberVenue.setBackground(new Color(188, 186, 190));
		numberVenue.getEditor().getComponent(0).setBackground(new Color(188, 186, 190));
		add(numberVenue);

		totalBudget = new JTextField();
		totalBudget.setBounds(251, 309, 776, 67);
		totalBudget.setBackground(new Color(0, 0, 0, 0));
		totalBudget.setOpaque(false);
		totalBudget.setBorder(new EmptyBorder(15, 15, 15, 15));
		totalBudget.setFont(new Font("Arial", 1, 25));
		totalBudget.setForeground(Color.white);
		add(totalBudget);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/modulo1.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}
	
	/**
	 * Este es el getter del boton crear
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getCreateBtn() {
		return createBtn;
	}
	
	/**
	 * Este es el setter del boton crear
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setCreateBtn(JButton createBtn) {
		this.createBtn = createBtn;
	}
	
	/**
	 * Este es el getter del boton salir
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getExit() {
		return exit;
	}
	
	/**
	 * Este es el setter del boton salir
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setExit(JButton exit) {
		this.exit = exit;
	}
	
	/**
	 * Este es el getter del boton atras
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JButton getBack() {
		return back;
	}
	
	/**
	 * Este es el setter del boton atras
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setBack(JButton back) {
		this.back = back;
	}
	
	/**
	 * Este es el getter de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JLabel getMainImage() {
		return mainImage;
	}
	
	/**
	 * Este es el setter de la imagen principal
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}
	
	/**
	 * Este es el getter del campo del nombre de la casa de apuestas
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JTextField getNameHouse() {
		return nameHouse;
	}
	
	/**
	 * Este es el setter del campo del nombre de la casa de apuestas
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */
	

	public void setNameHouse(JTextField nameHouse) {
		this.nameHouse = nameHouse;
	}
	
	/**
	 * Este es el getter del campo del presupuesto de la casa de apuestas
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JTextField getTotalBudget() {
		return totalBudget;
	}
	
	/**
	 * Este es el setter del campo del presupuesto de la casa de apuestas
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setTotalBudget(JTextField totalBudget) {
		this.totalBudget = totalBudget;
	}
	
	/**
	 * Este es el getter del campo del numero de sedes de la casa de apuestas
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public JSpinner getNumberVenue() {
		return numberVenue;
	}
	
	/**
	 * Este es el setter del campo del numero de sedes de la casa de apuestas
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setNumberVenue(JSpinner numberVenue) {
		this.numberVenue = numberVenue;
	}
	
	/**
	 * Este es el getter del numero de modelo del spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public SpinnerNumberModel getN() {
		return n;
	}
	
	/**
	 * Este es el setter del numero de modelo del spinner
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public void setN(SpinnerNumberModel n) {
		this.n = n;
	}
	
	/**
	 * Este es el getter del serial
	 * 
	 * @author Cristhian Diaz
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 11/10/2023
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}