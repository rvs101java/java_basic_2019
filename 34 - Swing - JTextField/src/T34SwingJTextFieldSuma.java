import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class T34SwingJTextFieldSuma {

	public static void main(String[] args) {

		FormularioSuma f = new FormularioSuma();
		f.setBounds(0, 0, 340, 350);
		f.setResizable(false);
		f.setVisible(true);

	}
}

class FormularioSuma extends JFrame implements ActionListener {

	private static final long serialVersionUID = 6833624324503487817L;

	private JTextField textfield1, textfield2;
	private JButton boton1, boton2;

	public FormularioSuma() {
		setLayout(null); // posicionamiento absoluto
		textfield1 = new JTextField();
		textfield1.setBounds(10, 50, 100, 30);
		add(textfield1);

		textfield2 = new JTextField();
		textfield2.setBounds(10, 100, 100, 30);
		add(textfield2);

		boton1 = new JButton("Sumar");
		boton1.setBounds(10, 150, 100, 30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Cerrar");
		boton2.setBounds(10, 200, 100, 30);
		add(boton2);
		boton2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String cad1 = textfield1.getText();
			String cad2 = textfield2.getText();

			int x1 = Integer.parseInt(cad1);
			int x2 = Integer.parseInt(cad2);

			int suma = (x1 + x2);

			String total = String.valueOf(suma);
			setTitle(total);
		}
		
		if (e.getSource() == boton2) {
			System.exit(0);
		}
	}

}