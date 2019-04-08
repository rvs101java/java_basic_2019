package problemas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class T33VaronMujer {

	public static void main(String[] args) {
		FormularioSexo fs = new FormularioSexo();
		fs.setBounds(10, 10, 300, 300);
		fs.setVisible(true);
	}
}

class FormularioSexo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton boton1, boton2, boton3;

	public FormularioSexo() {
		setLayout(null);
		setButton1();
		setButton2();
		setButton3();
	}

	public void setButton1() {
		boton1 = new JButton("Varon");
		boton1.setBounds(10, 10, 100, 30);
		boton1.addActionListener(this);
		add(boton1);
	}

	public void setButton2() {
		boton2 = new JButton("Mujer");
		boton2.setBounds(10, 50, 100, 30);
		boton2.addActionListener(this);
		add(boton2);
	}

	public void setButton3() {
		boton3 = new JButton("Cerrar");
		boton3.setBounds(10, 90, 100, 30);
		boton3.addActionListener(this);
		add(boton3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			setTitle("Varon");
		}
		if (e.getSource() == boton2) {
			setTitle("Mujer");
		}
		if (e.getSource() == boton3) {
			System.exit(0);
		}
	}

}
