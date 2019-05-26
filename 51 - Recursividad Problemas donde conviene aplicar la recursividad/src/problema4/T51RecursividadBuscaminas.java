package problema4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 25 may. 2019 - 20:34:19 s
 */
public class T51RecursividadBuscaminas {

	public static void main(String[] args) {
		Buscaminas m = new Buscaminas();
		m.setBounds(0, 0, 470, 600); // Establecemos las medidas del Panel
		m.setVisible(true); // Panel visible
	}
}

/**
 * Desarrollar el juego del Buscaminas.
 * 
 * Definir una matriz de 10*10 de JButton.
 * 
 * - Disponer una 'b' para las bombas (10 diez)
 * 
 * - Un 0 en los botones que no tienen bombas en su perímetro,
 * 
 * - un 1 si tiene una bomba en su perímetro y así sucesivamente.
 * 
 * Cuando se presiona un botón si hay un "cero" proceder en forma recursiva a
 * destapar los botones que se encuentran a sus lados.
 * 
 * Disponer el mismo color de frente y fondo de los botones para que el jugador
 * no pueda ver si hay bombas o no.
 */
class Buscaminas extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Matriz de botones para simular las bombas
	 */
	JButton[][] bot;

	/**
	 * 
	 */
	JButton b1 , b2 , b3;
		
	/**
	 * 
	 */
	Buscaminas() {
		setLayout(null); // Establecemos Panel
		bot = new JButton[10][10]; // Creamos un array de "botones"
		for (int f = 0; f < 10; f++) { // Creamos una matriz de botones
			for (int c = 0; c < 10; c++) {
				bot[f][c] = new JButton("0"); // a cada posicion del array añadimos '0'
				bot[f][c].setBounds(20 + c * 41, 50 + f * 41, 41, 41); // Establecer las medidas
				bot[f][c].setBackground(Color.lightGray);
				bot[f][c].setBackground(Color.lightGray);
				bot[f][c].addActionListener(this); // Añadir el evento a este objeto 'boton'
				add(bot[f][c]);
			}
		}
		b1 = new JButton("Reiniciar");
		b1.setBounds(20, 470, 100, 30);
		add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Salir");
		b2.setBounds(150, 470, 100, 30);
		add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Ver Solucion");
		b3.setBounds(280, 470, 130, 30);
		add(b3);
		b3.addActionListener(this);

		reiniciar();
		disponerBombas();
		contarBombasPerimetro();
	}

	/**
	 * Procedimiento.
	 * 
	 * Seleccionamos distintas posiciones de la matriz y colocamos un String con la
	 * palabra 'b'
	 */
	void disponerBombas() {
		 
		int cantidad = 10;
		do {
			int fila = (int) (Math.random() * 10); // Generamos un elemento 'f'
			int columna = (int) (Math.random() * 10); // Generamos un elemento 'c'
			if (bot[fila][columna].getText().equals("b") == false) { // Si en esa posicion no hay 'b'
				bot[fila][columna].setText("b"); // Asignamos a esa posicion la 'b'
				cantidad--; // Restamos '-1' a la cantidad total de bombas
			}
		} while (cantidad != 0);
	}

	/**
	 * Procedimiento - Establece la cantidad de bombas
	 */
	void contarBombasPerimetro() {
		// Recorremos la matriz
		for (int f = 0; f < 10; f++) {
			for (int c = 0; c < 10; c++) {
				// Si encontramos '0' asignamos los valores de la posicion 'f' y 'c' al metodo
				// 'contarCoordenadas' que devuelve la cantidad total de '0 - no hay bombas' en
				// el perimetro
				if (bot[f][c].getText().equals("0") == true) {
					int cant = contarCoordenada(f, c); // Devuelve el total '0' bombas encontradas en el perimetro
					bot[f][c].setText(String.valueOf(cant)); // Asigna la cantidad de '0' en el perimetro
				}
			}
		}
	}

	/**
	 * 
	 * @param fila
	 * @param columna
	 * @return
	 */
	int contarCoordenada(int fila, int columna) {

		int total = 0;
		if (fila - 1 >= 0 && columna - 1 >= 0) {
			if (bot[fila - 1][columna - 1].getText().equals("b") == true) {
				total++;
			}
		}
		if (fila - 1 >= 0) {
			if (bot[fila - 1][columna].getText().equals("b") == true) {
				total++;
			}
		}
		if (fila - 1 >= 0 && columna + 1 < 10) {
			if (bot[fila - 1][columna + 1].getText().equals("b") == true) {
				total++;
			}
		}
		if (columna + 1 < 10) {
			if (bot[fila][columna + 1].getText().equals("b") == true) {
				total++;
			}
		}
		if (fila + 1 < 10 && columna + 1 < 10) {
			if (bot[fila + 1][columna + 1].getText().equals("b") == true) {
				total++;
			}
		}
		if (fila + 1 < 10) {
			if (bot[fila + 1][columna].getText().equals("b") == true) {
				total++;
			}
		}
		if (fila + 1 < 10 && columna - 1 >= 0) {
			if (bot[fila + 1][columna - 1].getText().equals("b") == true) {
				total++;
			}
		}
		if (columna - 1 >= 0) {
			if (bot[fila][columna - 1].getText().equals("b") == true) {
				total++;
			}
		}
		return total;
	}

	/**
	 * Procedimiento
	 * 
	 * Recorre la lista de elementos y desactiva todos los botones
	 */
	void desactivarJuego() {
		for (int f = 0; f < 10; f++) {
			for (int c = 0; c < 10; c++) {
				bot[f][c].setEnabled(false); // desactiva los botones
			}
		}
	}

	/**
	 * Procedimiento
	 */
	void reiniciar() {
		setTitle(" Comienza el juego ");
		for (int f = 0; f < 10; f++) { // Recorre la matriz
			for (int c = 0; c < 10; c++) {
				bot[f][c].setText("0"); // Establece en la matriz de botones el texto '0 - sin bombas en el perimetro'
				bot[f][c].setEnabled(true); // Activar los botones
				bot[f][c].setBackground(Color.lightGray); // Establecer los colores de los botones
				bot[f][c].setForeground(Color.lightGray); // Establecer los colores de los botones
			}
		}
		disponerBombas();
		contarBombasPerimetro();
	}
	
	/**
	 * Procedimiento para recorrer todos los elementos
	 * 
	 * @param fil
	 * @param col
	 */
	void recorrer(int fil, int col) {
		if (fil >= 0 && fil < 10 && col >= 0 && col < 10) {
			if (bot[fil][col].getText().equals("0")) { // Si hay 0 bombas en el perimetro
				bot[fil][col].setText(" "); // No asignamos valor
				bot[fil][col].setBackground(Color.yellow); // Cambiar el color
				// Recorremos enteramente cada posicion de la matriz 
				// De forma recursiva
				recorrer(fil, col + 1); 
				recorrer(fil, col - 1);
				recorrer(fil + 1, col);
				recorrer(fil - 1, col);
				recorrer(fil - 1, col - 1);
				recorrer(fil - 1, col + 1);
				recorrer(fil + 1, col + 1);
				recorrer(fil + 1, col - 1);
				
				} else if (bot[fil][col].getText().equals("1") == true 
					|| bot[fil][col].getText().equals("2") == true
					|| bot[fil][col].getText().equals("3") == true 
					|| bot[fil][col].getText().equals("4") == true
					|| bot[fil][col].getText().equals("5") == true 
					|| bot[fil][col].getText().equals("6") == true
					|| bot[fil][col].getText().equals("7") == true 
					|| bot[fil][col].getText().equals("8") == true) 
			{
				bot[fil][col].setBackground(Color.YELLOW);
				bot[fil][col].setBackground(Color.BLACK);
			}
		}
	}

	/**
	 * Activar eventos
	 * 
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) { // pulsar 'boton' b1
			reiniciar(); // reinica el juego
			System.exit(0);
		}
		if (e.getSource() == b3) { // pulsar 'boton' b1
			for (int filas = 0; filas < bot.length; filas++) {
				for (int col = 0; col < bot.length; col++) {
					bot[filas][col].setBackground(Color.RED); 
				}
			}
		}
		
		for (int f = 0; f < 10; f++) {
			for (int c = 0; c < 10; c++) { // Recorremos la matriz
				if (e.getSource() == bot[f][c]) { // Comprobamos cada boton con su evento
					if (bot[f][c].getText().equals("b") == true) { // Si 'boton' pulsado equivale al String 'b'
						setTitle("Boooooooooooooomm"); // establecer titulo
						desactivarJuego(); // lanza el metodo fin del juego
					} else if (bot[f][c].getText().equals("0") == true) { // Si 'boton' es igual a '0'
						recorrer(f, c); // Recorre todo los elementos
					} else if (bot[f][c].getText().equals("1") == true // Comprueba posicion del boton con el texto
							|| bot[f][c].getText().equals("2") == true 
							|| bot[f][c].getText().equals("3") == true
							|| bot[f][c].getText().equals("4") == true 
							|| bot[f][c].getText().equals("5") == true
							|| bot[f][c].getText().equals("6") == true 
							|| bot[f][c].getText().equals("7") == true
							|| bot[f][c].getText().equals("8") == true) {
						bot[f][c].setBackground(Color.YELLOW); // marca el color de ese boton
						bot[f][c].setForeground(Color.black); // marca el color de ese boton
					}
				}
			}
		}
		verificarTriunfo();
	}

	/**
	 * Procedimiento.
	 * 
	 * Comprueba si hay ganador
	 */
	void verificarTriunfo() {
		int cant = 0;
		for (int f = 0; f < 10; f++) {
			for (int c = 0; c < 10; c++) { // Recorre la matriz
				Color col = bot[f][c].getBackground(); // Obtenemos el fondo
				if (col == Color.YELLOW) { // Si es amarillo
					cant++; // incrementa el contador de amarillos
				}
			}
		}
		if (cant == 90) { // Si la cantidad es amarillos es 90
			setTitle("Ganooooooooo"); // Panel establece como ganador
			desactivarJuego(); // Desactivar juego
		}
	}


}
