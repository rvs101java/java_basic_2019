package ejercicios;

import java.util.Random;

/**
 * Crear una matriz de n * m filas (cargar n y m por teclado)
 * 
 * Imprimir el mayor elemento y la fila y columna donde se almacena.
 * 
 * 
 * @author Rad
 *
 */
public class T23MatricesMayorNumeroFilaColumna {

	public static void main(String[] args) {
		MatrizNumFilaCol mnfc = new MatrizNumFilaCol(4, 4);
		mnfc.getMayorElementoDelVector();
		System.out.println("----------------");
		MatrizOrdenacion mo = new MatrizOrdenacion();
		mo.cargar();
		mo.imprimirMayor();
	}
}

class MatrizNumFilaCol {

	private int[][] vector;
	private Random rm;

	public MatrizNumFilaCol(int filas, int columnas) {
		vector = new int[filas][columnas];
	}

	public int[][] getVector() {
		return vector;
	}

	public int[][] setValorVector() {
		rm = new Random();
		int x = 0;
		for (int f = 0; f < vector.length; f++) {
			for (int c = 0; c < vector[0].length; c++) {
				x = rm.nextInt(((20 - 1) + 1) + 1);
				getVector()[f][c] = x;
			}
		}
		return getVector();
	}

	public void getMayorElementoDelVector() {
		setValorVector();
		int mayor = 0;
		int fila = 0;
		int columna = 0;
		mayor = getVector()[0][0];
		System.out.println("----------");
		for (int f = 0; f < getVector().length; f++) {
			for (int c = 0; c < getVector()[0].length; c++) {
				System.out.print("|" + getVector()[f][c]);
				if (getVector()[f][c] >= mayor) {
					fila = f;
					columna = c;
					mayor = getVector()[f][c];
				}
			}
			System.out.println();
		}
		System.out.println("------------");
		System.out.println("Soy el mayor = " + mayor + " ·· fila: " + (++fila) + " : columna: " + (++columna));
	}

}

class MatrizOrdenacion {

	private Random rm;
	private int[][] mat;

	public void cargar() {
		int f = 4, c = 4, x = 0;
		rm = new Random();
		mat = new int[f][c];
		for (int fila = 0; fila < mat.length; fila++) {
			for (int col = 0; col < mat[fila].length; col++) {
				x = rm.nextInt(((20 - 1) + 1) + 1);
				mat[fila][col] = x;
				System.out.print(mat[fila][col] + " ");
			}
			System.out.println();
		}
	}

	public void imprimirMayor() {
		int mayor = mat[0][0];
		int filamay = 0;
		int columnamay = 0;

		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat.length; c++) {
				if (mat[f][c] > mayor) {
					mayor = mat[f][c];
					filamay = f;
					columnamay = c;
				}
			}
		}
		System.out.println("El elemento mayor es: " + mayor);
		System.out.println("Se encuentra en la fila: " + filamay + " y en la columuna " + columnamay);
	}

}