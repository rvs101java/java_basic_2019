import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class T35TextAreaCorreo {

	public static void main(String[] args) {
		ListaCorreo lc = new ListaCorreo();
		lc.setVisible(true);
		lc.setBounds(0, 0, 540, 500);
		lc.setResizable(false);
 
	}
}

class ListaCorreo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 2047105707007753471L;

	private JLabel jlabel1;
	private JButton boton;
	private JTextArea textArea1;
	private JTextField textField1;
	private JScrollPane scrollpanel1;

	public ListaCorreo() {
		setLayout(null);
		jlabel1 = new JLabel("Lista de Correo");
		jlabel1.setBounds(10, 0, 100, 20);
		add(jlabel1);

		textField1 = new JTextField();
		textField1.setBounds(10, 20, 200, 30);
		textField1.setBackground(Color.decode("#edecd0"));
		add(textField1);

		textArea1 = new JTextArea();
		Border lackline = BorderFactory.createLineBorder(Color.black);
		textArea1.setBorder(lackline);
		textArea1.setBackground(Color.decode(("#f4c8d8")));
		scrollpanel1 = new JScrollPane(textArea1);
		scrollpanel1.setBounds(10, 50, 400, 250);
		add(scrollpanel1);

		boton = new JButton("Salir");
		boton.setBounds(10, 300, 100, 40);
		boton.setBackground(Color.decode("#d6d0ed"));
		add(boton);
		boton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			System.exit(0);
		}

	}

}

