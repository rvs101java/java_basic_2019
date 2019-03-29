import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class T34SwingJTextFieldLoginBasico {

	public static void main(String[] args) {
		FormularioLogin fl = new FormularioLogin();
		fl.setBounds(0, 0, 340, 300);
		fl.setResizable(false);
		fl.setVisible(true);
	}
}

class FormularioLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = -4943396268496431794L;

	private JButton boton1, boton2;
	private JTextField jtextfield1, jtextfield2;
	private JLabel label1, label2;

	public FormularioLogin() {
		setLayout(null);
		label1 = new JLabel("Nombre de usuario");
		label1.setOpaque(true);
		label1.setBounds(10, 10, 100, 30);
		label1.setBackground(Color.cyan);
		add(label1);

		label2 = new JLabel("Clave: ");
		label2.setOpaque(true);
		label2.setBounds(10, 50, 100, 30);
		label2.setBackground(Color.LIGHT_GRAY);
		add(label2);

		jtextfield1 = new JTextField();
		jtextfield1.setBounds(130, 10, 100, 30);
		add(jtextfield1);

		jtextfield2 = new JTextField();
		jtextfield2.setBounds(130, 50, 100, 30);
		add(jtextfield2);

		boton1 = new JButton("Confirmar");
		boton1.setBounds(10, 100, 100, 30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Cerrar");
		boton2.setBounds(10, 150, 100, 30);
		add(boton2);
		boton2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Usuario();
		if (e.getSource() == boton1) {
			String cad1 = jtextfield1.getText();
			String cad2 = jtextfield2.getText();
			if (cad1.equals(Usuario.getNombre())) {
				if (cad2.equals(Usuario.getPassword())) {
					JOptionPane.showMessageDialog(null, "Acceso Permitido");
				} else {
					JOptionPane.showMessageDialog(null, "Error en la contraseña");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Error en el nombre");
			}
		}
		if (e.getSource() == boton2) {
			System.exit(0);
		}
	}

}

class Usuario {

	private static String nombre;
	private static String password;

	public Usuario() {
		nombre = "juan";
		password = "asd1";
	}

	public static String getNombre() {
		return nombre;
	}

	public static String getPassword() {
		return password;
	}

}
