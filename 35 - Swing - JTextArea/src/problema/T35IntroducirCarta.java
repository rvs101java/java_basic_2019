package problema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class T35IntroducirCarta {

	public static void main(String[] args) {
		FormularioPalabraEncontrada fc = new FormularioPalabraEncontrada();
		fc.setBounds(0, 0, 400, 500);
		fc.setResizable(false);
		fc.setVisible(true);

	}
}

class FormularioPalabraEncontrada extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	private JButton boton1, boton2;

	public FormularioPalabraEncontrada() {
		setLayout(null);
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 10, 300, 200);
		add(scrollpane1);
		
		boton1 = new JButton("Verificar");
		boton1.setBounds(10, 260, 100, 30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Salir");
		boton2.setBounds(10, 300, 100, 30);
		add(boton2);
		boton2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String palabra = "ada";
		if (e.getSource() == boton1) {
			String texto = textarea1.getText();
			if (texto.indexOf(palabra) != -1) {
				JOptionPane.showMessageDialog(null, "Si tiene la palabra: " + palabra);
			} else {
				JOptionPane.showMessageDialog(null, "No tiene la palabra: " + palabra);
			}
		}
		if (e.getSource() == boton2) {
			System.exit(0);
		}
	}

}