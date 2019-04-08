package ejercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class T38ElegirNavegador {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setVisible(true);
		v.setBounds(0, 0, 350, 230);
		v.setResizable(false);
	}
}

class Ventana extends JFrame implements ActionListener {

	private JCheckBox check1, check2, check3;
	private JButton boton1;

	private static final long serialVersionUID = 4394432566339709422L;

	public Ventana() {
		setLayout(null);
		check1 = new JCheckBox("Chrome");
		check1.setBounds(10, 10, 150, 30);
		add(check1);

		check2 = new JCheckBox("Firefox");
		check2.setBounds(10, 50, 150, 30);
		add(check2);

		check3 = new JCheckBox("Opera");
		check3.setBounds(10, 90, 150, 30);
		add(check3);

		boton1 = new JButton("Confirmar");
		boton1.setBounds(10, 140, 100, 30);
		boton1.addActionListener(this);
		add(boton1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String cad = "";
			if (check1.isSelected() == true) {
				cad = cad + "Chrome - ";
			}
			if (check2.isSelected() == true) {
				cad = cad + "FireFox - ";
			}
			if (check3.isSelected() == true) {
				cad = cad + "Opera - ";
			}
			JOptionPane.showMessageDialog(null, cad);
		}
	}

}
