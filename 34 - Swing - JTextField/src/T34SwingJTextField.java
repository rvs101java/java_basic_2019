import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class T34SwingJTextField {

	public static void main(String[] args) {
		FormularioText ft = new FormularioText();
		ft.setBounds(10, 10, 500, 550);
		ft.setVisible(true);
		ft.setResizable(false);
		
		
	}
}

class FormularioText extends JFrame implements ActionListener {

 	private static final long serialVersionUID = 1L;

	private JTextField textField1;
	private JLabel label1;
	private JButton boton1 , boton2;

	public FormularioText() {
		setLayout(null);
		label1 = new JLabel("Usuario: ");
		label1.setOpaque(true);
		label1.setBounds(10, 10, 100, 30);
		label1.setBackground(Color.RED);
		add(label1);

		textField1 = new JTextField();
		textField1.setOpaque(true);
		textField1.setBounds(120, 10, 150, 20);
		textField1.setBackground(Color.LIGHT_GRAY);
		add(textField1);

		boton1 = new JButton("Aceptar");
		boton1.setBounds(10, 80, 100, 30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Cerrar");
		boton2.setBounds(10, 120, 100, 30);
		add(boton2);
		boton2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String cad = textField1.getText();
			setTitle(cad);
		}
		if (e.getSource() == boton2) {
			 System.exit(0);
		}
		
	}

}
