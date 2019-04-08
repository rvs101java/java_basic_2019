import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class T33SwingJButton {

	public static void main(String[] args) {

		FormularioBoton fb = new FormularioBoton();
		fb.setBounds(0, 0, 450, 350);
		fb.setVisible(true);
	}

}

class FormularioBoton extends JFrame implements ActionListener {

	private JButton boton1;

	private static final long serialVersionUID = -1303695726628878850L;

	public FormularioBoton() {
		JLabel jl = new JLabel("Manejador de Eventos");
		jl.setOpaque(true);
		jl.setBounds(0, 10, 200, 30);
		jl.setBackground(Color.LIGHT_GRAY);
		setLayout(null); // posicionamiento absoluto
		boton1 = new JButton("Finalizar");
		boton1.setBounds(300, 250, 100, 30);
		add(boton1);
		add(jl);
		// En el constructor creamos el objeto de la clase JButton y mediante la llamada
		// del método addActionListener le pasamos la referencia del objeto de la clase
		// JButton utilizando la palabra clave this
		// (this almacena la dirección de memoria donde se almacena el objeto
		// de la clase JFrame, luego mediante dicha dirección podemos llamar al método
		// actionPerformed):
		boton1.addActionListener(this);
	}

	/**
	 * Manejador de Evento de la interface ActionListener
	 * 
	 * La mecánica para atrapar el clic del objeto de la clase JButton se hace
	 * mediante la implementación de una interface.
	 * 
	 * Una interface es un protocolo que permite la comunicación entre dos clases.
	 * Una interface contiene uno o más cabecera de métodos, pero no su
	 * implementación.
	 * 
	 * Las clases que implementen la interface ActionListener deberán especificar el
	 * algorítmo del método actionPerformed.
	 * 
	 * Se ejecutará cada vez que hagamos clic sobre el objeto de la clase JButton
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == boton1) {
			System.exit(0);
		}
	}
}
