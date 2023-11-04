package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MilitarForeignTable extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8739266242665721292L;

	private JTable table;
	private DefaultTableModel model;

	public MilitarForeignTable() {

		tablePropierties();
	}

	private void tablePropierties() {
		setLayout(new FlowLayout());
		String[] titulos = { "Documento", "Nombre", "Dia de nacimiento", "Mes de nacimiento", "Año de nacimiento",
				"Edad", "Pais Origen", "Tiempo en el Pais" };
		model = new DefaultTableModel(titulos, 0);

		table = new JTable(model) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4657096563857860449L;

			public Class<?> getColumnClass(int column) {
				return (column == 10) ? Image.class : Object.class;
			}
		};
		table.setDefaultEditor(Object.class, null);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(790, 560));
		add(scroll);
		setVisible(true);
		setBounds(480, 150, 790, 560);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
