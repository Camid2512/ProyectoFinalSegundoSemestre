package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ReceiptWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5453165584751636416L;

	private JButton exit;

	private JLabel mainImage;

	private JTextArea date, fullName, document, venueBet, typeBet;

	public ReceiptWindow() {
		// TODO Auto-generated constructor stub

		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("RECIBO");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setUndecorated(true);
		setLayout(null);

		exit = new JButton();
		exit.setBounds(1199, 7, 74, 72);
		exit.setToolTipText("SALIR DEL RECIBO");
		exit.setBackground(new Color(0, 0, 0, 0));
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		add(exit);

		date = new JTextArea();
		date.setBounds(809, 110, 357, 87);
		date.setBackground(new Color(0, 0, 0, 0));
		date.setOpaque(false);
		date.setBorder(new EmptyBorder(15, 15, 15, 15));
		date.setFont(new Font("Arial", 1, 40));
		date.setForeground(Color.black);
		date.setEditable(false);
		date.setHighlighter(null);
		add(date);

		fullName = new JTextArea();
		fullName.setBounds(261, 274, 920, 46);
		fullName.setBackground(new Color(0, 0, 0, 0));
		fullName.setOpaque(false);
		fullName.setFont(new Font("Arial", 1, 30));
		fullName.setForeground(Color.black);
		fullName.setEditable(false);
		fullName.setHighlighter(null);
		add(fullName);

		document = new JTextArea();
		document.setBounds(327, 330, 846, 48);
		document.setBackground(new Color(0, 0, 0, 0));
		document.setOpaque(false);
		document.setFont(new Font("Arial", 1, 30));
		document.setForeground(Color.black);
		document.setEditable(false);
		document.setHighlighter(null);
		add(document);

		venueBet = new JTextArea();
		venueBet.setBounds(476, 440, 697, 46);
		venueBet.setBackground(new Color(0, 0, 0, 0));
		venueBet.setOpaque(false);
		venueBet.setFont(new Font("Arial", 1, 30));
		venueBet.setForeground(Color.black);
		venueBet.setEditable(false);
		venueBet.setHighlighter(null);
		add(venueBet);

		typeBet = new JTextArea();
		typeBet.setBounds(413, 513, 756, 46);
		typeBet.setBackground(new Color(0, 0, 0, 0));
		typeBet.setOpaque(false);
		typeBet.setFont(new Font("Arial", 1, 30));
		typeBet.setForeground(Color.black);
		typeBet.setEditable(false);
		typeBet.setHighlighter(null);
		add(typeBet);

		mainImage = new JLabel();
		mainImage.setBounds(0, 0, 1280, 720);

		Image temporal1;
		temporal1 = new ImageIcon("src/Images/recibo.png").getImage();

		ImageIcon img1;
		img1 = new ImageIcon(
				temporal1.getScaledInstance(mainImage.getWidth(), mainImage.getHeight(), Image.SCALE_SMOOTH));

		mainImage.setIcon(img1);
		mainImage.setVisible(true);
		add(mainImage);

	}

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}

	public JLabel getMainImage() {
		return mainImage;
	}

	public void setMainImage(JLabel mainImage) {
		this.mainImage = mainImage;
	}

	public JTextArea getDate() {
		return date;
	}

	public void setDate(JTextArea date) {
		this.date = date;
	}

	public JTextArea getFullName() {
		return fullName;
	}

	public void setFullName(JTextArea fullName) {
		this.fullName = fullName;
	}

	public JTextArea getDocument() {
		return document;
	}

	public void setDocument(JTextArea document) {
		this.document = document;
	}

	public JTextArea getVenueBet() {
		return venueBet;
	}

	public void setVenueBet(JTextArea venueBet) {
		this.venueBet = venueBet;
	}

	public JTextArea getTypeBet() {
		return typeBet;
	}

	public void setTypeBet(JTextArea typeBet) {
		this.typeBet = typeBet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
