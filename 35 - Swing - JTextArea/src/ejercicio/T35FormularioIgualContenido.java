package ejercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class T35FormularioIgualContenido {

	public static void main(String[] args) {
		FormularioIgualContenido fic = new FormularioIgualContenido();
		fic.setBounds(0, 0, 450, 300);
		fic.setVisible(true);
		fic.setResizable(false);
	}
}

class FormularioIgualContenido extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea textArea1, textArea2;
	private JScrollPane scrollpanel1, scrollpanel2;
	private JButton boton1, boton2;

	public FormularioIgualContenido() {
		setLayout(null);

		textArea1 = new JTextArea();
		scrollpanel1 = new JScrollPane(textArea1);
		scrollpanel1.setBounds(10, 10, 200, 100);
		add(scrollpanel1);

		textArea2 = new JTextArea();
		scrollpanel2 = new JScrollPane(textArea2);
		scrollpanel2.setBounds(220, 10, 200, 100);
		add(scrollpanel2);

		boton1 = new JButton("Verificar contenidos");
		boton1.setBounds(10, 130, 150, 30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Salir");
		boton2.setBounds(10, 170, 150, 30);
		add(boton2);
		boton2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String texto1 = textArea1.getText(); // obtener los datos
			String texto2 = textArea2.getText(); // obtener los datos
			if (texto1.equals(texto2) == true) { // Son iguales
				JOptionPane.showMessageDialog(null, "Texto Iguales");
			} else {
				JOptionPane.showMessageDialog(null, "Texto No Iguales");
			}
		}
		if (e.getSource() == boton2) {
			System.exit(0);
		}
	}

}
