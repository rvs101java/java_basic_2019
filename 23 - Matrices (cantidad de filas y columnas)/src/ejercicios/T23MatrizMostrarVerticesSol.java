package ejercicios;

import java.util.Scanner;

/**
 * Crear una matriz de (n * m) filas (cargar n y m por teclado)
 * 
 * Imprimir los cuatro valores que se encuentran en los vértices de la misma
 * (mat[0][0] etc.)
 * 
 * @author Rad
 *
 */
public class T23MatrizMostrarVerticesSol {

	public static void main(String[] args) {
		MatrizVertices2 mv2 = new MatrizVertices2();
		mv2.imprimirVertices();
		mv2.imprimir();
	}
}

class MatrizVertices2 {

	private Scanner teclado;
	private int[][] mat;

	public MatrizVertices2() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantas filas tiene la matriz: ");
		int filas = teclado.nextInt();
		System.out.println("Cuantas columnas tiene la matriz: ");
		int columnas = teclado.nextInt();
		mat = new int[filas][columnas];
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat.length; c++) {
				System.out.print("Ingrese componente: ");
				mat[f][c] = teclado.nextInt();
			}
		}
	}

	public void imprimirVertices() {
		System.out.println("Vertice superior izquierdo:");
		System.out.println(mat[0][0]);
		System.out.println("Vertice superior derecho:");
		System.out.println(mat[0][mat[0].length - 1]);
		System.out.println("Vertice inferior izquierdo:");
		System.out.println(mat[mat.length - 1][0]);
		System.out.println("Vertice inferior derecho:");
		System.out.println(mat[mat.length - 1][mat[mat.length - 1].length - 1]);
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