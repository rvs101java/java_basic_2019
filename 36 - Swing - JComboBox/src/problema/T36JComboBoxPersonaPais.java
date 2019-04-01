package problema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class T36JComboBoxPersonaPais {

	public static void main(String[] args) {
		FormularioPais fp = new FormularioPais();
		fp.setBounds(0, 0, 400, 500);
		fp.setVisible(true);
	}
}

class FormularioPais extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JLabel label1, label2;
	private JTextField textfield1;
	private JComboBox<String> combo1;
	private JButton boton1, boton2;

	public FormularioPais() {
		setLayout(null); // posicionamiento absoluto

		label1 = new JLabel("Usuario");
		label1.setBounds(10, 10, 100, 30);
		add(label1);

		textfield1 = new JTextField();
		textfield1.setBounds(70, 10, 120, 30);
		add(textfield1);

		label2 = new JLabel("Pais");
		label2.setBounds(10, 50, 100, 30);
		add(label2);

		combo1 = new JComboBox<String>();
		combo1.setBounds(70, 50, 100, 30);
		combo1.addItem("China");
		combo1.addItem("Rusia");
		combo1.addItem("España");
		combo1.addItem("Korea del Norte");
		add(combo1);

		boton1 = new JButton("Confirmar");
		boton1.setBounds(0, 200, 100, 30);
		boton1.addActionListener(this);
		add(boton1);

		boton2 = new JButton("Salir");
		boton2.setBounds(120, 200, 100, 30);
		boton2.addActionListener(this);
		add(boton2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String nombre = textfield1.getText(); // Obtener texto del JTextBox
			String pais = (String) combo1.getSelectedItem(); // Obtener texto del SelectedItem
			JOptionPane.showMessageDialog(null, "Nombre: ".concat(nombre.concat(" Pais: " + pais)));
		}

		if (e.getSource() == boton2) {
			System.exit(0);
		}

	}

}
