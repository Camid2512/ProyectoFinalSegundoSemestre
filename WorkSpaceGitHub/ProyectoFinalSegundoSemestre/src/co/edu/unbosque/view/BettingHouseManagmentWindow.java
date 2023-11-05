package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class BettingHouseManagmentWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton createBtn, exit, back;

	private JTextField nameHouse, numberVenue, totalBudget;

	public BettingHouseManagmentWindow() {
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Informacion casa de apuestas");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		createBtn = new JButton();
		createBtn.setBounds(400, 600, 165, 99);
		createBtn.setToolTipText("Crear datos de la casa de apuestas");
//		createBtn.setBackground(new Color(0, 0, 0, 0));
//		createBtn.setOpaque(false);
//		createBtn.setContentAreaFilled(false);
//		createBtn.setBorderPainted(false);
		add(createBtn);

		exit = new JButton();
		exit.setBounds(1000, 100, 165, 99);
		exit.setToolTipText("cierra el programa");
//		exit.setBackground(new Color(0, 0, 0, 0));
//		exit.setOpaque(false);
//		exit.setContentAreaFilled(false);
//		exit.setBorderPainted(false);
		add(exit);

		back = new JButton();
		back.setBounds(100, 700, 165, 99);
		back.setToolTipText("ventana anterior");
//		back.setBackground(new Color(0, 0, 0, 0));
//		back.setOpaque(false);
//		back.setContentAreaFilled(false);
//		back.setBorderPainted(false);
		add(back);

		nameHouse = new JTextField();
		nameHouse.setBounds(300, 235, 309, 70);
//		nameHouse.setBackground(new Color(0, 0, 0, 0));
//		nameHouse.setOpaque(false);
//		nameHouse.setBorder(new EmptyBorder(15, 15, 15, 15));
//		nameHouse.setFont(new Font("Arial", 1, 25));
//		nameHouse.setForeground(Color.white);
		add(nameHouse);

		numberVenue = new JTextField();
		numberVenue.setBounds(300, 400, 309, 70);
//		numberVenue.setBackground(new Color(0, 0, 0, 0));
//		numberVenue.setOpaque(false);
//		numberVenue.setBorder(new EmptyBorder(15, 15, 15, 15));
//		numberVenue.setFont(new Font("Arial", 1, 25));
//		numberVenue.setForeground(Color.white);
		add(numberVenue);

		totalBudget = new JTextField();
		totalBudget.setBounds(300, 600, 309, 70);
//		totalBudget.setBackground(new Color(0, 0, 0, 0));
//		totalBudget.setOpaque(false);
//		totalBudget.setBorder(new EmptyBorder(15, 15, 15, 15));
//		totalBudget.setFont(new Font("Arial", 1, 25));
//		totalBudget.setForeground(Color.white);
		add(totalBudget);

	}

}