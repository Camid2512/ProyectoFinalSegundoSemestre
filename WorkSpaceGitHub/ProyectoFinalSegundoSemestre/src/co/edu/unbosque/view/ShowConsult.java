package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ShowConsult extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3076482943278818043L;

	private JLabel mainImage;
	private JTextArea totalBetAmount, totalBetAmountGambler;
	private JButton exit, back, consultGam;
	private JComboBox<Long> ComboGambler;
	private ConsultTable tablePanel = new ConsultTable();

	public ShowConsult() {
		// TODO Auto-generated constructor stub
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("VENTANA TABLA CONSULTAS");
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

		consultGam = new JButton();
		consultGam.setBounds(965, 475, 175, 37);
		consultGam.setToolTipText("CONSULTAR GASTADO APOSTADOR");
		consultGam.setBackground(new Color(0, 0, 0, 0));
		consultGam.setOpaque(false);
		consultGam.setContentAreaFilled(false);
		consultGam.setBorderPainted(false);
		add(consultGam);

		totalBetAmount = new JTextArea();
		totalBetAmount.setBounds(911, 184, 280, 68);
		totalBetAmount.setBackground(new Color(0, 0, 0, 0));
		totalBetAmount.setOpaque(false);
		totalBetAmount.setBorder(new EmptyBorder(15, 15, 15, 15));
		totalBetAmount.setFont(new Font("Arial", 1, 20));
		totalBetAmount.setForeground(Color.white);
		totalBetAmount.setEditable(false);
		totalBetAmount.setHighlighter(null);
		add(totalBetAmount);

		totalBetAmountGambler = new JTextArea();
		totalBetAmountGambler.setBounds(911, 552, 280, 68);
		totalBetAmountGambler.setBackground(new Color(0, 0, 0, 0));
		totalBetAmountGambler.setOpaque(false);
		totalBetAmountGambler.setBorder(new EmptyBorder(15, 15, 15, 15));
		totalBetAmountGambler.setFont(new Font("Arial", 1, 20));
		totalBetAmountGambler.setForeground(Color.white);
		totalBetAmountGambler.setEditable(false);
		totalBetAmountGambler.setHighlighter(null);
		add(totalBetAmountGambler);

		ComboGambler = new JComboBox<>();
		ComboGambler.setBounds(910, 400, 280, 68);
		ComboGambler.setBackground(new Color(225, 223, 228));
		ComboGambler.setForeground(Color.black);
		ComboGambler.setFont(new Font("Arial", 1, 25));
		add(ComboGambler);

		getContentPane().add(tablePanel);
		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/tablaconsultas.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	public ConsultTable getTablePanel() {
		return tablePanel;
	}

	public void setTablePanel(ConsultTable tablePanel) {
		this.tablePanel = tablePanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getConsultGam() {
		return consultGam;
	}

	public void setConsultGam(JButton consultGam) {
		this.consultGam = consultGam;
	}

	public JTextArea getTotalBetAmount() {
		return totalBetAmount;
	}

	public void setTotalBetAmount(JTextArea totalBetAmount) {
		this.totalBetAmount = totalBetAmount;
	}

	public JTextArea getTotalBetAmountGambler() {
		return totalBetAmountGambler;
	}

	public void setTotalBetAmountGambler(JTextArea totalBetAmountGambler) {
		this.totalBetAmountGambler = totalBetAmountGambler;
	}

	public JComboBox<Long> getComboGambler() {
		return ComboGambler;
	}

	public void setComboGambler(JComboBox<Long> comboGambler) {
		ComboGambler = comboGambler;
	}

}
