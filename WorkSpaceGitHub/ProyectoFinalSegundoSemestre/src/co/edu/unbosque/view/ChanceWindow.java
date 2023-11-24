package co.edu.unbosque.view;
/**
 * Representa la ventana de gestión de apuestas de Chance.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Representa la ventana de gestión de apuestas de Chance.
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 10/11/2023
 */
public class ChanceWindow extends JFrame {

	

	/** Identificador de serialización de la clase. */
	private static final long serialVersionUID = 5898606968191455247L;

	/** Botones para salir, volver, y siguiente . */
	private JButton exit, back, next;

	/** Campo de texto para la cantidad de apuesta. */
	private JTextField betAmount;

	/** Listas despegables para numeros 1, 2, 3, 4. */
	private JComboBox<Integer> num1, num2, num3, num4;

	/** Lista desplegable para el tipo de lotería. */
	private JComboBox<String> loteryType;

	/** Etiqueta principal de la imagen. */
	private JLabel mainImage;;

	/**
	 * Constructor de la clase ChanceWindow Configura la ventana y sus
	 * componentes.
	 */
	public ChanceWindow() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("CHANCE");
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

		next = new JButton();
		next.setBounds(1050, 569, 158, 77);
		next.setToolTipText("SIGUIENTE");
		next.setBackground(new Color(0, 0, 0, 0));
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);
		add(next);

		betAmount = new JTextField();
		betAmount.setBounds(115, 208, 685, 77);
		betAmount.setBackground(new Color(0, 0, 0, 0));
		betAmount.setOpaque(false);
		betAmount.setBorder(new EmptyBorder(15, 15, 15, 15));
		betAmount.setFont(new Font("Arial", 1, 25));
		betAmount.setForeground(Color.white);
		add(betAmount);

		num1 = new JComboBox<Integer>();
		num1.setBounds(164, 362, 119, 119);
		num1.setBackground(new Color(225, 223, 228));
		num1.setForeground(Color.black);
		num1.setFont(new Font("Arial", 1, 25));
		add(num1);

		num2 = new JComboBox<Integer>();
		num2.setBounds(321, 362, 119, 119);
		num2.setBackground(new Color(225, 223, 228));
		num2.setForeground(Color.black);
		num2.setFont(new Font("Arial", 1, 25));
		add(num2);

		num3 = new JComboBox<Integer>();
		num3.setBounds(477, 362, 119, 119);
		num3.setBackground(new Color(225, 223, 228));
		num3.setForeground(Color.black);
		num3.setFont(new Font("Arial", 1, 25));
		add(num3);

		num4 = new JComboBox<Integer>();
		num4.setBounds(634, 362, 119, 119);
		num4.setBackground(new Color(225, 223, 228));
		num4.setForeground(Color.black);
		num4.setFont(new Font("Arial", 1, 25));
		add(num4);

		loteryType = new JComboBox<String>();
		loteryType.setBounds(115, 510, 685, 77);
		loteryType.setBackground(new Color(225, 223, 228));
		loteryType.setForeground(Color.black);
		loteryType.setFont(new Font("Arial", 1, 25));
		loteryType.addItem("LOTERIA DE BOGOTA");
		loteryType.addItem("LOTERIA DE BOYACA");
		loteryType.addItem("LOTERIA DEL CAUCA");
		loteryType.addItem("LOTERIA CRUZ ROJA");
		loteryType.addItem("LOTERIA DE CUNDINAMARCA");
		loteryType.addItem("LOTERIA DEL HUILA");
		loteryType.addItem("LOTERIA DE MANIZALES");
		loteryType.addItem("LOTERIA DE MEDELLIN");
		loteryType.addItem("LOTERIA DEL META");
		loteryType.addItem("LOTERIA DEL QUINDIO");
		loteryType.addItem("LOTERIA DE RISARALDA");
		loteryType.addItem("LOTERIA DE SANTANDER");
		loteryType.addItem("LOTERIA DEL TOLIMA");
		loteryType.addItem("LOTERIA DEL VALLE");
		add(loteryType);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/chance.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	/**
	 * Obtiene el botón para salir.
	 * 
	 */
	public JButton getExit() {
		return exit;
	}

	/**
	 * Establece el botón para salir.
	 * 
	 */
	public void setExit(JButton exit) {
		this.exit = exit;
	}

	/**
	 * Obtiene el botón para retroceder.
	 * 
	 */
	public JButton getBack() {
		return back;
	}

	/**
	 * Establece el botón para retroceder.
	 * 
	 */
	public void setBack(JButton back) {
		this.back = back;
	}

	/**
	 * Obtiene el botón para avanzar.
	 * 
	 */
	public JButton getNext() {
		return next;
	}

	/**
	 * Establece el botón para avanzar.
	 * 
	 */
	public void setNext(JButton next) {
		this.next = next;
	}

	/**
	 * Obtiene el campo de texto para la cantidad de apuesta.
	 * 
	 */
	public JTextField getBetAmount() {
		return betAmount;
	}

	/**
	 * Establece el campo de texto para la cantidad de apuesta.
	 * 
	 */
	public void setBetAmount(JTextField betAmount) {
		this.betAmount = betAmount;
	}

	/**
	 * Obtiene la lista desplegable para el primer número.
	 * 
	 */
	public JComboBox<Integer> getNum1() {
		return num1;
	}

	/**
	 * Establece la lista desplegable para el primer número.
	 * 
	 */
	public void setNum1(JComboBox<Integer> num1) {
		this.num1 = num1;
	}

	/**
	 * Obtiene la lista desplegable para el segundo número.
	 * 
	 */
	public JComboBox<Integer> getNum2() {
		return num2;
	}

	/**
	 * Establece la lista desplegable para el segundo número.
	 * 
	 */
	public void setNum2(JComboBox<Integer> num2) {
		this.num2 = num2;
	}

	/**
	 * Obtiene la lista desplegable para el tercer número.
	 * 
	 */
	public JComboBox<Integer> getNum3() {
		return num3;
	}

	/**
	 * Establece la lista desplegable para el tercer número.
	 * 
	 */
	public void setNum3(JComboBox<Integer> num3) {
		this.num3 = num3;
	}

	/**
	 * Obtiene la lista desplegable para el cuarto número.
	 * 
	 */
	public JComboBox<Integer> getNum4() {
		return num4;
	}

	/**
	 * Establece la lista desplegable para el cuarto número.
	 * 
	 */
	public void setNum4(JComboBox<Integer> num4) {
		this.num4 = num4;
	}

	/**
	 * Obtiene el tipo de lotería en la lista desplegable.
	 * 
	 */
	public JComboBox<String> getLoteryType() {
		return loteryType;
	}

	/**
	 * Establece el tipo de lotería en la lista desplegable.
	 * 
	 */
	public void setLoteryType(JComboBox<String> loteryType) {
		this.loteryType = loteryType;
	}

	/**
	 * Obtiene el identificador de serialización de la clase.
	 * 
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
