package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class T37Ingresar2Numeros {

	public static void main(String[] args) {
		VentanaOpNum vop = new VentanaOpNum();
		vop.setVisible(true);
		vop.setBounds(0, 0, 500, 400);
		vop.setResizable(false);

	}
}

class VentanaOpNum extends JFrame implements ActionListener {

	private static final long serialVersionUID = 4207248278273540461L;

	private JMenuBar mb;
	private JMenu menu;
	private JMenuItem jmi1, jmi2;
	private JTextField jtf1, jtf2;
	private JButton jb1;
	private JLabel jlb1 , jlb2;

	public VentanaOpNum() {
		setLayout(null);

		mb = new JMenuBar(); // crea la barra menu ventana
		setJMenuBar(mb); // establece la barra menu
		menu = new JMenu("Opciones"); // desplegable barra menu
		mb.add(menu); // añadir barra menu

		jmi1 = new JMenuItem("Redimensionar ventana"); 
		menu.add(jmi1); // añadir elemento a la barra menu
		jmi1.addActionListener(this); // dentro del JFrame

		jmi2 = new JMenuItem("Salir");
		menu.add(jmi2); // añadir otro elemento a la barra menu
		jmi2.addActionListener(this); // dentro del JFrame
		
		jlb1 = new JLabel("Altura");
		jlb1.setBounds(10,20,100,30); // dimensiones de la etiqueta
		add(jlb1); // agrega la etiqueta

		jlb2 = new JLabel("Anchura");
		jlb2.setBounds(10,73,100,30); // dimensiones de la etiqueta
		add(jlb2); // agrega la etiqueta
		
		jtf1 = new JTextField(); // define un campo de texto
		jtf1.setBounds(10, 50, 100, 30); // dimensiones 
		add(jtf1);

		jtf2 = new JTextField(); // define un campo de texto
		jtf2.setBounds(10, 100, 100, 30); // dimensiones 
		add(jtf2);

		jb1 = new JButton("Salir"); // define boton
		jb1.setBounds(10, 290, 100, 30); // dimensiones
		jb1.addActionListener(this); // añadir boton
		add(jb1);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jmi1) {
			String cad1 = jtf1.getText();
			String cad2 = jtf2.getText();
			int ancho = Integer.parseInt(cad1);
			int alto = Integer.parseInt(cad2);
			setSize(ancho, alto);
		}
		
		if (ae.getSource() == jmi2) {
			System.exit(0);
		}
		
		if (ae.getSource() == jb1) {
			System.exit(0);
		}
	}

}