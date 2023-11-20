package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultTable extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4126275918683973272L;

	
	private JTable table;
	private DefaultTableModel model;
	
	public ConsultTable() {
		tablePropierties();
	}
	
	private void tablePropierties() {
		setLayout(new FlowLayout());
		String[] titulos = { "Clientes", "Juego", "Tipo de juego", "Valor de la apuesta" };
		model = new DefaultTableModel(titulos, 0);

		table = new JTable(model) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4657096563857860449L;

			public Class<?> getColumnClass(int column) {
				return (column == 4) ? Image.class : Object.class;
			}
		};
		table.setDefaultEditor(Object.class, null);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(800, 560));
		add(scroll);
		setVisible(true);
		setBounds(85, 112, 809, 500);
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

}
