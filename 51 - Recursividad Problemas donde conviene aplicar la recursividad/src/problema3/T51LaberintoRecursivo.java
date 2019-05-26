package problema3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Desarrollar un programa que permita recorrer un laberinto e indique si tiene
 * salida o no.
 * 
 * Para resolver este problema al laberinto lo representaremos con una matriz de
 * 10 x 10 JLabel.
 * 
 * El valor:
 * 
 * "0" Representa pasillo
 * 
 * "1" Representa pared
 * 
 * "9" Persona
 * 
 * "s" Salida
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 24 may. 2019 - 23:39:24
 */
public class T51LaberintoRecursivo {

	public static void main(String[] args) {

		Laberinto l = new Laberinto();
		l.setBounds(0, 0, 300, 450);
		l.setVisible(true);
	}
}

/**
 * Clase Principal
 */
class Laberinto extends JFrame implements ActionListener {

	private static final long serialVersionUID = -7665712924038909707L;

	JLabel[][] label; // Creamos una matriz de JLabel
	JButton b1; // Creamos un boton1
	JButton b2; // Creamos un boton1
	JButton b3; // Creamos un boton1
	boolean salida;

	/**
	 * Constructor por defecto
	 */
	public Laberinto() {
		setLayout(null); // Establecer un panel
		label = new JLabel[10][10]; // Declaramos la cuadricula
		for (int f = 0; f < 10; f++) { // Creamos Filas
			for (int c = 0; c < 10; c++) { // Creamos Columnas
				label[f][c] = new JLabel(); // En cada posicion instanciamos un nuevo obj. JLabel
				// Establecemos la posicion de los elementos dentro del panel
				label[f][c].setBounds((20 + c * 20), (50 + f * 20), 20, 20); // Establecemos las dimensiones
				add(label[f][c]); // Agregamos al componente cada obj. JLabel
			}
		}
		// Creamos un 1º boton
		b1 = new JButton("Recorrer");
		b1.setBounds(10, 300, 100, 25);
		add(b1);
		b1.addActionListener(this); // this hace referencia JButton

		// Creamos un 2º boton
		b2 = new JButton("Crear");
		b2.setBounds(120, 300, 100, 25);
		add(b2);
		b2.addActionListener(this);

		// Creamos un 1º boton
		b3 = new JButton("Cerrar");
		b3.setBounds(70, 350, 100, 25);
		add(b3);
		b3.addActionListener(this); // this hace referencia JButton

		crear();
	}

	/**
	 * Creamos el laberinto donde aparecen pasillo y puertas
	 */
	public void crear() {
		for (int f = 0; f < 10; f++) { // filas
			for (int c = 0; c < 10; c++) { // columnas
				label[f][c].setForeground(Color.BLUE); // Establecer el color de los elementos del laberinto
				int a = (int) (Math.random() * 4); // Generamos numero aleatorio para indicar cuando incluir un pasillo
													// o puerta
				if (a == 0)
					label[f][c].setText("1"); // puerta
				else
					label[f][c].setText("0"); // pasillo
			}
		}
		label[9][9].setText("s"); // Creamos la salida
		label[0][0].setText("0"); // Creamos la entrada
	}

	/**
	 * Recorremos el laberinto de filas a columnas
	 * 
	 * - 1º Recorre todas las col. del 0 al 9
	 * 
	 * - 2º Cuando encuentra un '1' pasa a la siguiente fila
	 * 
	 * @param fil
	 *            - depende del valor de entrada por defecto : '0'
	 * @param col
	 *            - depende del valor de entrada por defecto : '0'
	 */
	public void recorrer(int fil, int col) {
		// Primero verificamos si la coordenada a procesar del laberinto
		// se encuentra dentro de los límites correctos y además no hayamos encontrado
		// la salida hasta el momento:
		if ((fil >= 0) && (fil < 10) && (col >= 0) && (col < 10) && (salida == false)) {
			// Si entra al if anterior verificamos si estamos en la salida:
			if (label[fil][col].getText().equals("s")) // Si recorrer el laberinto entre pasillo y puertas da con la
														// posicion
														// de la matriz que da 's' entonces hay salida
				salida = true;
			// Si 'fila y col' equivale a '0' esta recorriendo pasillo
			else if (label[fil][col].getText().equals("0")) {
				label[fil][col].setText("9"); // cambiamos el valor de '0' a '9' pa
				label[fil][col].setForeground(Color.red); // pintamos el valor
				// Va recorriendo cada posicion de la col y manteniendo esa posicion
				// para cuando encuentra '1' pasa al sig. metodo y comprueba la col de su ult.
				// posicion
				// Si no encuentra '0' pasa al sig. metod para volver anterior 'fil' y seguir comprobando
				recorrer(fil, col + 1); // fil:0 - col:0,1,2 "Como col hay puerta 1' pasa al sig
				recorrer(fil + 1, col); // fil:1 - col:0,1,2,3,4
				recorrer(fil - 1, col);
				recorrer(fil, col - 1);
				// Cuando llega a la salida vuelve a hacer el camino de vuelta
			}
		}
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			salida = false;
			recorrer(0, 0);
			if (salida)
				setTitle("Tiene salida");
			else
				setTitle("No tiene salida");
		}
		if (e.getSource() == b2) {
			crear();
		}
		if (e.getSource() == b3) {
			System.exit(0);
		}
	}
}