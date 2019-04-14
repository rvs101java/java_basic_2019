package problema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * ------------------------- REPASAR ----------------------------
 * 
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
		formulario.setBounds(0, 0, 500, 500);
		formulario.setVisible(true);
	}
}

/**
 * Clase Principal
 */
class Formula extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JLabel label;
	private JTextField campoTexto;
	private JButton boton1, boton2;
	private String cad1 = "Está correctamente balanceada.";
	private String cad2 = "No está correctamente balanceada.";

	public Formula() {
		setLayout(null);
		label = new JLabel("Introduce: ");
		label.setBounds(30, 30, 100, 30);
		add(label);

		campoTexto = new JTextField();
		campoTexto.setBounds(30, 70, 200, 30);
		add(campoTexto);

		boton1 = new JButton("Aceptar");
		boton1.setBounds(30, 110, 100, 30);
		boton1.addActionListener(this);
		add(boton1);

		boton2 = new JButton("Salir");
		boton2.setBounds(140, 110, 100, 30);
		boton2.addActionListener(this);
		add(boton2);
	}

	public String getCadena1() {
		return cad1;
	}

	public String getCadena2() {
		return cad2;
	}

	/**
	 * Gestionar evento
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			if (campoTexto.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Introduce la formula");
			} else {
				if (balanceada()) {
					JOptionPane.showMessageDialog(null, getCadena1());
				} else {
					JOptionPane.showMessageDialog(null, getCadena2());
				}
			}
		}
		if (e.getSource() == boton2) {
			System.exit(0);
		}
	}

	/**
	 * 
	 * @return true si esta balanceada false no esta balanceada
	 */
	public boolean balanceada() {
		Pila pila1 = new Pila();
		String cadena = campoTexto.getText();
		for (int f = 0; f < cadena.length(); f++) {
			if (cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{') {
				pila1.insertar(cadena.charAt(f));
			} else {
				if (cadena.charAt(f) == ')') {
					if (pila1.extraer() != '(') {
						return false;
					}
				} else {
					if (cadena.charAt(f) == ']') {
						if (pila1.extraer() != '[') {
							return false;
						}
					} else {
						if (cadena.charAt(f) == '}') {
							if (pila1.extraer() != '{') {
								return false;
							}
						}
					}
				}
			}
		}
		if (pila1.vacia()) {
			return true;
		} else {
			return false;
		}
	}
}

/**
 * Clase Principal
 */
class Pila {

	/**
	 * Clase Secundaria
	 * 
	 */
	class Nodo {
		char simbolo;
		Nodo sig;
	}

	/**
	 * Variable de Instancia : Objeto Nodo
	 */
	private Nodo raiz;

	/**
	 * Constructor por defecto
	 */
	public Pila() {
		raiz = null;
	}

	/**
	 * 
	 * @param x
	 */
	public void insertar(char x) {
		Nodo nuevo = new Nodo();
		nuevo.simbolo = x;
		if (raiz == null) {
			nuevo.sig = null;
			raiz = nuevo;
		} else {
			nuevo.sig = raiz;
			raiz = nuevo;
		}
	} // fin

	/**
	 * 
	 * @return
	 */
	public char extraer() {
		if (raiz != null) {
			char informacion = raiz.simbolo;
			raiz = raiz.sig;
			return informacion;
		} else {
			return Character.MAX_VALUE;
		}
	} // fin

	/**
	 * 
	 * @return
	 */
	public boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	} // fin

}
