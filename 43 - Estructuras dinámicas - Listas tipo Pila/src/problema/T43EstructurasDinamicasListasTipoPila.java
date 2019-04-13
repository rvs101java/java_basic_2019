package problema;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Se debe desarrollar una clase que tenga las siguientes responsabilidades
 * (clase Formula):
 * 
 * - Ingresar una fórmula que contenga paréntesis, corchetes y llaves.
 * 
 * - Validar que los ( ) [] y {} estén correctamente balanceados
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 13 abr. 2019 - 18:11:20
 */
public class T43EstructurasDinamicasListasTipoPila {

	public static void main(String[] args) {
		Formula formulario = new Formula();
		formulario.setBounds(0,0,200,200);
		formulario.setVisible(true);
	}
}

/**
 * 
 */
class Formula extends JTextField {
	
 	private static final long serialVersionUID = 1L;

	private JTextField campoTexto;
	private JLabel label;
	
	public Formula() {
		setLayout(null);
		campoTexto = new JTextField();
		campoTexto.setBounds(10,10,200,30);
		add(campoTexto);

	}
}












