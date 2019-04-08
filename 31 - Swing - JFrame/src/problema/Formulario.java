package problema;

import javax.swing.*;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 5166492137824564019L;

	public Formulario() {
		setLayout(null);
	}

	public static void main(String[] args) {
		Formulario formulario = new Formulario();
		formulario.setBounds(0, 0, 1024, 800);
		formulario.setResizable(false);
		formulario.setVisible(true);

		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0, 0, 300, 400);
		formulario1.setResizable(true);
		formulario1.setVisible(true);

	
	}
}
