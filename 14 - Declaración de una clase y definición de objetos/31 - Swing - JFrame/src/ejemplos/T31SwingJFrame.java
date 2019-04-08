package ejemplos;

import javax.swing.JFrame;

public class T31SwingJFrame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
//----------		col,fila,ancho,alto
		f.setBounds(10, 20, 400, 300);
		f.setVisible(true);
	}
}

class FormularioBasico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormularioBasico() {
		setLayout(null); // desactivar el layout heredado
	}
}