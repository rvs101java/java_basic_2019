import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class T34SwingJTextFieldLoginBasico {

	public static void main(String[] args) {

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
		label1.setBounds(10, 10, 100, 30);
		add(label1);
		label2 = new JLabel("Clave:  ");
		label2.setOpaque(true);
		
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
