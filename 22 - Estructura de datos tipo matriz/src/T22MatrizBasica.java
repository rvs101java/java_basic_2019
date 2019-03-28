
import java.util.Random;

public class T22MatrizBasica {

	// Modulo principal
	public static void main(String[] args) {

		Matriz m = new Matriz();
		m.getArray();
		m.imprimir();
	}
}

class Matriz {

	// Variable de instancia(puntero) ahora no apunta a nada en la pila 'HEAD'
	private Random aleatorio = null;
	// Variable de instancia(puntero) ahora no apunta a nada en la pila 'HEAD'
	private byte[][] mat = null;

	public Matriz() {
		// Ahora la variable(puntero) apunta a un objeto en la memoria ram de la pila 'HEAD' 
		aleatorio = new Random();
		mat = new byte[3][5];
		for (byte f = 0; f < 3; f++) {
			for (byte c = 0; c < 5; c++) {
				getArray()[f][c] = (byte) aleatorio.nextInt(100);
			}
		}
	}

	/**
	 * @return devuelve array
	 */
	public byte[][] getArray() {
		return mat;
	}

	/**
	 * SubModulo : Ver elementos del array
	 */
	public void imprimir() {
		for (byte f = 0; f < getArray().length; f++) {
			for (byte c = 0; c < getArray()[0].length; c++) {
				System.out.print(mat[f][c]+ " - ");
			}
			System.out.println();
		}
	}
}