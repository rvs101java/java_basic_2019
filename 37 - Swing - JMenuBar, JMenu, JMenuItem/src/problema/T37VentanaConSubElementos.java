package problema;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class T37VentanaConSubElementos {

	public static void main(String[] args) {
		FormularioSubIndices f = new FormularioSubIndices();
		f.setVisible(true);
		f.setBounds(0, 0, 400, 500);
		f.setResizable(true);
	}
}

class FormularioSubIndices extends JFrame implements ActionListener {

	private static final long serialVersionUID = 3495076014670521539L;

	private JMenuBar mb;
	private JMenu menu1, menu2, menu3;
	private JMenuItem mi1, mi2, mi3, mi4;
	private JButton bt1;

	public FormularioSubIndices() {
		setLayout(null); // posicionamiento absoluto
		
		mb = new JMenuBar(); // Barra de navegacion
		setJMenuBar(mb);

		// 3 Menus
		menu1 = new JMenu("Opciones");
		mb.add(menu1); // Añadimos un Menu Principal

		menu2 = new JMenu("Tamaño de la ventana");
		menu1.add(menu2); // 1º Menu le añadimos el 2º menu

		menu3 = new JMenu("Color de fondo");
		menu1.add(menu3); // 1º Menu le añadimos el 3º menu

		// 2 SubMenus
		mi1 = new JMenuItem("640 * 480");
		menu2.add(mi1);
		mi1.addActionListener(this);

		mi2 = new JMenuItem("1024 * 768");
		menu2.add(mi2);
		mi2.addActionListener(this);

		mi3 = new JMenuItem("Rojo");
		menu3.add(mi3);
		mi3.addActionListener(this);

		mi4 = new JMenuItem("Verde");
		menu3.add(mi4);
		mi4.addActionListener(this);

		bt1 = new JButton("Salir");
		bt1.setBounds(10, 380, 150, 30);
		bt1.setBackground(Color.LIGHT_GRAY);
		add(bt1);
		bt1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == mi1) {
			setSize(640, 480);
		}
		if (ae.getSource() == mi2) {
			setSize(1024, 768);
		}
		if (ae.getSource() == mi3) {
			getContentPane().setBackground(new Color(255, 0, 0));
		}
		if (ae.getSource() == mi4) {
			getContentPane().setBackground(new Color(0, 255, 0));
		}
		if (ae.getSource() == bt1) {
			System.exit(0);
		}
	}
}