package programa;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class T30HelloFriendInterfaces {

	public static void main(String[] args) {
		Formulario f = new Formulario();
		f.setBounds(10, 10, 400, 300);
		f.setVisible(true);
	}
}

/**
 * La clase JFrame encapsula el concepto de una ventana.
 * 
 * Luego para implementar una aplicación que muestre una ventana debemos
 * plantear una clase que herede de la clase JFrame:
 * 
 * 
 * @author Rad
 *
 */
class Formulario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Para mostrar un texto dentro de una ventana necesitamos requerir la
	 * colaboración de la clase JLabel (que tiene por objetivo mostrar un texto
	 * dentro de un JFrame)
	 */
	private JLabel label1;

	public Formulario() {
		setLayout(null); // posicionamiento absoluto
		label1 = new JLabel("Hello Friend");
		label1.setOpaque(true);
		label1.setBounds(10, 20, 200, 20);
		label1.setBackground(Color.LIGHT_GRAY);
		add(label1);
	}
}
