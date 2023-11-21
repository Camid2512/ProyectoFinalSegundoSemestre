package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GamblerTableManager extends JPanel {

	/**
	 * Este es el atributo de la version serial
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */
	private static final long serialVersionUID = -2774902160217326772L;

	/**
	 * Este es el atributo de la tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */
	private JTable table;

	/**
	 * Este es el atributo del modelo de tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */
	private DefaultTableModel model;

	/**
	 * Este constructor vacio de la tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */

	public GamblerTableManager() {
		tablePropierties();
	}

	/**
	 * Esta es la funcion de las propiedades de la tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */

	private void tablePropierties() {
		setLayout(new FlowLayout());
		String[] titulos = { "Nombre", "Cédula", "Dirección", "Número Telefónico" };
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
		scroll.setPreferredSize(new Dimension(1000, 560));
		add(scroll);
		setVisible(true);
		setBounds(85, 112, 1111, 500);
	}

	/**
	 * Este es el getter de la tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */

	public JTable getTable() {
		return table;
	}

	/**
	 * Este es el setter de la tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */

	public void setTable(JTable table) {
		this.table = table;
	}

	/**
	 * Este es el getter del modelo de la tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */

	public DefaultTableModel getModel() {
		return model;
	}

	/**
	 * Este es el setter del modelo de la tabla
	 * 
	 * @author Santiago Rueda
	 * @version 1.0
	 * @since 18/11/2023
	 */

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

}