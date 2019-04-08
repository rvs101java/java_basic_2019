package ejemplo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class T36JComboBoxListaColores {

	public static void main(String[] args) {
		ListaColores lc = new ListaColores();
		lc.setBounds(0, 0, 250, 250);
		lc.setResizable(false);
		lc.setVisible(true);

	}
}

class ListaColores extends JFrame implements ItemListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JComboBox<String> combo1;
	private JLabel jlabel1, jlabel2, jlabel3, jlabel4;
	private JButton boton1;

	public ListaColores() {
		setLayout(null);

		jlabel1 = new JLabel("Lista de colores");
		jlabel1.setOpaque(true);
		jlabel1.setBounds(10, 0, 100, 100);
		add(jlabel1);

		combo1 = new JComboBox<String>();
		combo1.setBounds(10, 70, 80, 20);
		add(combo1);
		combo1.addItem("rojo");
		combo1.addItem("verde");
		combo1.addItem("azul");
		combo1.addItem("amarillo");
		combo1.addItem("negro");
		combo1.addItem("");
		combo1.addItemListener(this);

		jlabel2 = new JLabel("Color");
		jlabel2.setOpaque(true);
		jlabel2.setBounds(10, 100, 100, 100);
		add(jlabel2);

		jlabel3 = new JLabel("Respuesta");
		jlabel3.setOpaque(true);
		jlabel3.setBounds(130, 100, 100, 30);
		add(jlabel3);

		jlabel4 = new JLabel("");
		jlabel4.setOpaque(true);
		jlabel4.setBounds(130, 120, 100, 30);
		add(jlabel4);

		boton1 = new JButton("Salir");
		boton1.setBounds(10, 240, 100, 30);
		boton1.addActionListener(this);
		add(boton1);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo1) {
			String seleccionando = (String) combo1.getSelectedItem();
			JOptionPane.showMessageDialog(null, " Seleccionar: " + seleccionando);
			switch (seleccionando) {
			case "rojo":
				jlabel2.setBackground(Color.RED);
				break;
			case "verde":
				jlabel2.setBackground(Color.GREEN);
				break;
			case "azul":
				jlabel2.setBackground(Color.BLUE);
				break;
			case "amarillo":
				jlabel2.setBackground(Color.YELLOW);
				break;
			case "negro":
				jlabel2.setBackground(Color.BLACK);
				break;
			default:
				jlabel2.setBackground(Color.LIGHT_GRAY);
				break;
			}
			jlabel3.setText("Color Elegido:");
			jlabel4.setText(seleccionando);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			System.exit(0);
		}
	}

}
