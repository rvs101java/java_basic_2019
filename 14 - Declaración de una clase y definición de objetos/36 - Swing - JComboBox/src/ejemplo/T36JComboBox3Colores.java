package ejemplo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class T36JComboBox3Colores {

	public static void main(String[] args) {

		Formulario3Colores f3c = new Formulario3Colores();
		f3c.setVisible(true);
		f3c.setResizable(false);
		f3c.setBounds(50, 50, 400, 300);
	}
}

class Formulario3Colores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 6928756246802120316L;

	private JLabel jlabel1, jlabel2, jlabel3, jlabel4;
	private JButton boton1, boton2;
	private JComboBox<String> combo1, combo2, combo3;

	public Formulario3Colores() {
		setLayout(null);

		jlabel1 = new JLabel("Rojo:");
		jlabel1.setOpaque(true);
		jlabel1.setBounds(getX(), 10, 100, 30);
		jlabel1.setBorder(BorderFactory.createLineBorder(Color.RED));
		jlabel1.setBackground(Color.RED);
		add(jlabel1);

		combo1 = new JComboBox<String>();
		combo1.setOpaque(true);
		combo1.setBounds(120, 10, getAncho(), getAlto());
		for (int f = 0; f < 256; f++) {
			combo1.addItem(String.valueOf(f));
		}
		add(combo1);

		jlabel2 = new JLabel("Verde:");
		jlabel2.setOpaque(true);
		jlabel2.setBounds(getX(), 50, 100, 30);
		jlabel2.setBackground(Color.GREEN);
		jlabel2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		add(jlabel2);

		combo2 = new JComboBox<String>();
		combo2.setOpaque(true);
		combo2.setBounds(120, 50, getAncho(), getAlto());
		for (int f = 0; f < 256; f++) {
			combo2.addItem(String.valueOf(f));
		}
		add(combo2);

		jlabel3 = new JLabel("Azul:");
		jlabel3.setOpaque(true);
		jlabel3.setBounds(getX(), 90, 100, 30);
		jlabel3.setBackground(Color.BLUE);
		jlabel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		add(jlabel3);
		
		jlabel4 = new JLabel("Color");
		jlabel4.setOpaque(true);
		jlabel4.setBounds(250, 90, 100, 30);
		jlabel4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(jlabel4);

		combo3 = new JComboBox<String>();
		combo3.setOpaque(true);
		combo3.setBounds(120, 90, getAncho(), getAlto());
		for (int f = 0; f < 256; f++) {
			combo3.addItem(String.valueOf(f));
		}
		add(combo3);

		boton1 = new JButton("Fijar Color");
		boton1.setBounds(getX(), 130, 100, 30);
		boton1.addActionListener(this);
		add(boton1);

		boton2 = new JButton("Salir");
		boton2.setBounds(getX(), 170, 100, 30);
		boton2.addActionListener(this);
		add(boton2);
	}

	public int getX() {
		return 10;
	}

	public int getAncho() {
		return 120;
	}

	public int getAlto() {
		return 30;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == boton1) {
			String cad1 = (String) combo1.getSelectedItem();
			int rojo = Integer.parseInt(cad1);
			String cad2 = (String) combo2.getSelectedItem();
			int verde = Integer.parseInt(cad2);
			String cad3 = (String) combo3.getSelectedItem();
			int azul = Integer.parseInt(cad3);

			Color colores = new Color(rojo, verde, azul);
			jlabel4.setBackground(colores);
		}

		if (arg0.getSource() == boton2) {
			System.exit(0);
		}
	}

}