package ejercicios;

public class T22MatricesEjercicios3x4 {

	public static void main(String[] args) {

		Matriz3x4 m = new Matriz3x4();
		m.verArray();

		Matriz3x4Sol ms = new Matriz3x4Sol();
		ms.cargar();
		ms.primerFila();
		ms.ultimaFila();
		ms.primeraColumna();
		ms.verFilasColumnas();
	}
}

/**
 * Crear y cargar una matriz de 3 filas por 4 columnas.
 * 
 * Imprimir la primer fila.
 * 
 * Imprimir la última fila e imprimir la primer columna.
 * 
 * 
 * @author Rad
 *
 */
class Matriz3x4 {

	private static int[][] mat = { { 1, 2, 3, 4 }, { 4, 5, 6, 5 }, { 7, 8, 9, 11 } };

	public void verArray() {
		int f = 0;
		int c = 0;
		for (f = 0; f < getArray().length; f++) {
			for (c = 0; c < getArray()[0].length; c++) {
				if (f == 0) {
					System.out.print(getArray()[0][c] + "-");
				}
				if (f == 2) {
					System.out.print(getArray()[2][c] + "+");
				}
				if ((f == 0) && (c >= 0)) {
					System.out.print(getArray()[0][c] + "%");
				}
			}
			System.out.println();
		}
	}

	/**
	 * Metodo de instancia puede referenciar a una variable de clase - Tiene sentido
	 * que el metodo devuelva una referencia a un objeto que solo es una unica copia
	 * del objeto
	 * 
	 * Esta devolviendo un unico objeto aunque sea desde un metodo de instancia
	 * 
	 * @return - una matriz que es una variable de Clase
	 */
	public int[][] getArray() {
		return mat;
	}
}

class Matriz3x4Sol {

	private static int[][] mat = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 8, 9, 01, 02 } };

	public void cargar() {
		System.out.println("_________________");
		for (int f = 0; f < getArray().length; f++) {
			System.out.print("|");
			for (int c = 0; c < getArray()[0].length; c++) {
				System.out.print("_" + getArray()[f][c] + "_" + "|");
			}
			System.out.println("\n");
		}
	}

	public void primerFila() {
		System.out.println("Primer fila de la matriz: ");
		for (int c = 0; c < getArray().length; c++) {
			System.out.println(getArray()[0][c]);
		}
	}

	public void ultimaFila() {
		System.out.println("Primer fila de la matriz: ");
		for (int c = 0; c < getArray().length; c++) {
			System.out.println(getArray()[2][c]);
		}
	}

	public void primeraColumna() {
		System.out.println("Primer columna: ");
		for (int f = 0; f < getArray().length; f++) {
			System.out.println(getArray()[f][0]);
		}
	}

	public int[][] getArray() {
		return mat;
	}

	public void verFilasColumnas() {
		System.out.println("filas: " + getArray().length + " columnas: " + getArray()[0].length);
	}

}
