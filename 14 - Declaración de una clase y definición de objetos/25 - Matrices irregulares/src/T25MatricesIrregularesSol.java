import java.util.Scanner;

/**
 * Confeccionaremos un programa que permita crear una matriz irregular y luego
 * imprimir la matriz en forma completa.
 * 
 * @author Rad
 *
 */
public class T25MatricesIrregularesSol {

	public static void main(String[] args) {

		MatrizIrregular2 mi = new MatrizIrregular2();
		mi.getLongitudMatriz();
		mi.setMatriz();

		// MatrizIrregularSol mis = new MatrizIrregularSol();
		// mis.cargar();
		// mis.imprimir();

	}

}

class MatrizIrregular2 {

	private int[][] matrizIrregular = null;

	public MatrizIrregular2() {
		matrizIrregular = new int[9][];
	}

	public void setMatriz(int[][] matriz) {
		this.matrizIrregular = matriz;
	}

	public int[][] getMatriz() {
		return matrizIrregular;
	}

	public int[][] getLongitudMatriz() {
		for (int i = 0; i < 10; i++) {
 			getMatriz()[0] = new int[(int) (Math.random() * (1 + 5) + 1)];
			getMatriz()[1] = new int[(int) (Math.random() * (1 + 10) + 1)];
			getMatriz()[2] = new int[(int) (Math.random() * (1 + 5) + 1)];
			getMatriz()[3] = new int[(int) (Math.random() * (1 + 10) + 1)];
			getMatriz()[4] = new int[(int) (Math.random() * (1 + 5) + 1)];
			getMatriz()[5] = new int[(int) (Math.random() * (1 + 10) + 1)];
			getMatriz()[6] = new int[(int) (Math.random() * (1 + 5) + 1)];
			getMatriz()[7] = new int[(int) (Math.random() * (1 + 10) + 1)];
			getMatriz()[8] = new int[(int) (Math.random() * (1 + 5) + 1)];
		}
		return getMatriz();
	}

	public void setMatriz() {
		int contador = 0;
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[f].length; c++) {
				getMatriz()[f][c] += contador++;
				System.out.print(getMatriz()[f][c] + " ");
			}
			System.out.println();
		}
	}
}

class MatrizIrregularSol {

	private Scanner teclado;
	private int[][] mat;

	public void cargar() {
		System.out.println("----------------");
		teclado = new Scanner(System.in);
		System.out.println("Cuantas filas tiene la matriz: ");
		int filas = teclado.nextInt();
		mat = new int[filas][];
		for (int f = 0; f < mat.length; f++) {
			System.out.print("Cuantos elementos tiene la fila " + f + ":");
			int elementos = teclado.nextInt();
			mat[f] = new int[elementos];
			for (int c = 0; c < mat[f].length; c++) {
				System.out.print("Ingrese las columnas:");
				mat[f][c] = teclado.nextInt();
			}
		}
	}

	public void imprimir() {
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				System.out.println(mat[f][c] + " ");
			}
			System.out.println();
		}
	}
}