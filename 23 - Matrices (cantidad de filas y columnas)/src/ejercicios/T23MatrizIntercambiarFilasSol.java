package ejercicios;

import java.util.Scanner;

/**
 * Crear una matriz de n * m filas (cargar n y m por teclado)
 * 
 * Intercambiar la primer fila con la segundo. Imprimir luego la matriz.
 * 
 * @author Rad
 *
 */
public class T23MatrizIntercambiarFilasSol {

	public static void main(String[] args) {
		MatrizVertices3 mv2 = new MatrizVertices3();
		mv2.intercambiar();
		mv2.imprimir();
	}
}

class MatrizVertices3 {

	private Scanner teclado;
	private int[][] mat;

	public MatrizVertices3() {
		teclado = new Scanner(System.in);
		System.out.print("Cuantas filas tiene la matriz: ");
		int filas = teclado.nextInt();
		System.out.print("Cuantas columnas tiene la matriz: ");
		int columnas = teclado.nextInt();
		mat = new int[filas][columnas];
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat.length; c++) {
				System.out.print("Ingrese componente: ");
				mat[f][c] = teclado.nextInt();
			}
		}
	}

	public void intercambiar() {
		for (int c = 0; c < mat[0].length; c++) {
			int aux = mat[0][c];
			mat[0][c] = mat[1][c];
			mat[1][c] = aux;
		}
	}

	public void imprimir() {
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				System.out.print(mat[f][c] + " ");
			}
			System.out.println();
		}
	}

}