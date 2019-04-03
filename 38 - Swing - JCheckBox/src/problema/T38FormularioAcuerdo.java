package problema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class T38FormularioAcuerdo {

	public static void main(String[] args) {
		Formulario f = new Formulario();
		f.setBounds(0, 0, 350, 200);
		f.setVisible(true);
	}
}

class Formulario extends JFrame implements ActionListener, ChangeListener {

	private static final long serialVersionUID = 1L;

	private JLabel label1;
	private JCheckBox check1;
	private JButton boton1;

	public Formulario() {
		setLayout(null);
		label1 = new JLabel("¿Esta de acuerdo con las normas del servicio?");
		label1.setBounds(10, 10, 400, 30);
		add(label1);

		check1 = new JCheckBox("Acepto");
		check1.setBounds(10, 50, 100, 30);
		check1.addChangeListener(this);
		add(check1);

		boton1 = new JButton("Continuar");
		boton1.setBounds(10, 100, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
 
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (check1.isSelected() == true) {
			boton1.setEnabled(true);
		} else {
			boton1.setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			System.exit(0);
		}
	}

}
