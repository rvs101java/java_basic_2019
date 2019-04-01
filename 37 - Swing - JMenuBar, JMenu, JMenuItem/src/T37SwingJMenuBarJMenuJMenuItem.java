import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class T37SwingJMenuBarJMenuJMenuItem {

	public static void main(String[] args) {
		VentanaConOpciones vcc = new VentanaConOpciones();
		vcc.setVisible(true);
		vcc.setBounds(0, 0, 400, 500);
		vcc.setResizable(true);
	}
}

class VentanaConOpciones extends JFrame implements ActionListener {

	/**
	 * 3 objetos 1 - Barra de menu 1 - Menu 1 - MenuItem
	 * 
	 */
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1, mi2, mi3;
	private static final long serialVersionUID = -7764214969041622211L;

	public VentanaConOpciones() {
		setLayout(null); // posicionamiento absoluto
		mb = new JMenuBar(); // instanciamos objeto JMenuBar
		setJMenuBar(mb); // establecemos el objeto MenuBar

		// Creamos la opcion en la barra
		menu1 = new JMenu("Opciones");
		mb.add(menu1);

		// Instanciamos las distintas opciones
		mi1 = new JMenuItem("Rojo");
		mi1.addActionListener(this);
		menu1.add(mi1);

		mi2 = new JMenuItem("Verde");
		mi2.addActionListener(this);
		menu1.add(mi2);

		mi3 = new JMenuItem("Azul");
		mi3.addActionListener(this);
		menu1.add(mi3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// En el método actionPerformed primero obtenemos la referencia al panel
		// asociado con el JFrame:
		Container f = this.getContentPane();
		if (e.getSource() == mi1) {
			f.setBackground(new Color(255, 0, 0));
		}
		if (e.getSource() == mi2) {
			f.setBackground(new Color(0, 255, 0));
		}
		if (e.getSource() == mi3) {
			f.setBackground(new Color(0, 0, 255));
		}
	}

}