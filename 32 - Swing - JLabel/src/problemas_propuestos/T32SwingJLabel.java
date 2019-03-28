package problemas_propuestos;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class T32SwingJLabel {

	public static void main(String[] args) {
		Formulario f = new Formulario();
		f.setBounds(10, 20, 300, 400);
		f.setResizable(false);
		f.setVisible(true);
	}
}

class Formulario extends JFrame {

	private static final long serialVersionUID = 5415695732938199081L;

	private JLabel label1, label2, label3;
	private static int contador = 0;
	private static int posicionX = 10;
	private static int posicionY = 0;

	public Formulario() {
		setLayout(null);
		label1 = new JLabel("Rojo");
		label1.setOpaque(true);
		label1.setBounds(getPosX(), getPosY(), 100, 30);
		label1.setBackground(Color.RED);
		add(label1);

		label2 = new JLabel("Verde");
		label2.setOpaque(true);
		label2.setBounds(getPosX(), getPosY(), 100, 30);
		label2.setBackground(Color.GREEN);
		add(label2);

		label3 = new JLabel("Azul");
		label3.setOpaque(true);
		label3.setBounds(getPosX(), getPosY(), 100, 30);
		label3.setBackground(Color.blue);
		add(label3);
	}

	public int getPosX() {
		return posicionX;
	}

	public int getPosY() {
		if (contador == 0) {
			posicionY += 0;
		} else {
			contador++;
			posicionY += 30;
		}
		contador++;
		return posicionY;
	}

}
