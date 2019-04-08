package problemas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class T33TresComponentesJButton {

	public static void main(String[] args) {
		Formulario f = new Formulario();
		f.setResizable(false);
		f.setBounds(0, 0, 500, 500);
		f.setVisible(true);
	}
}

class Formulario extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton boton1, boton2, boton3;

	public Formulario() {
		setLayout(null);
		boton1 = new JButton("1");
		boton1.setOpaque(true);
		boton1.setBounds(10, 100, 90, 30);
		boton1.setBackground(Color.LIGHT_GRAY);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("2");
		boton1.setOpaque(true);
		boton2.setBounds(110, 100, 90, 30);
		boton2.setBackground(Color.LIGHT_GRAY);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("Cerrar");
		boton3.setOpaque(true);
		boton3.setBounds(210, 100, 90, 30);
		boton3.setBackground(Color.RED);
		add(boton3);
		boton3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			setTitle("button 1");
		}
		if (e.getSource() == boton2) {
			setTitle("button 2");
		}
		if (e.getSource() == boton3) {
			System.exit(0);
		}
	}

}