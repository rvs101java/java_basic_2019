import javax.swing.JFrame;
import javax.swing.JLabel;

public class T32SwingJLabel extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Formulario f = new Formulario();
		f.setBounds(0, 0, 300, 200);
		f.setResizable(false);
		f.setVisible(true);
	}
}

class Formulario extends JFrame {

	private static final long serialVersionUID = -8207265115364735558L;

	private JLabel label1, label2;

	public Formulario() {
		setLayout(null); // Posicionamiento absoluto
		label1 = new JLabel("Sistema de facturacion");
		label1.setBounds(10, 20, 300, 30);
		add(label1);
		label2 = new JLabel("Version 1.0");
		label2.setBounds(10, 100, 100, 30);
		add(label2);
	}

}
