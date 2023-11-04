import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldConEntradaVacia extends JFrame {

	public JTextFieldConEntradaVacia() {
		setTitle("JTextField con entrada vacía");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setLocationRelativeTo(null);

		JTextField textField = new JTextField();
		textField.setDocument(new PlainDocument() {
			@Override
			public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
				// Permitir la inserción de texto, incluso si es una cadena vacía
				if (str != null) {
					super.insertString(offs, str, a);
				}
			}
		});

		getContentPane().add(textField);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JTextFieldConEntradaVacia frame = new JTextFieldConEntradaVacia();
			frame.setVisible(true);
		});
	}
}
