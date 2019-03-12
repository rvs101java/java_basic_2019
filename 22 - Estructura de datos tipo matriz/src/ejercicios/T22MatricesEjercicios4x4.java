package ejercicios;

import java.util.Scanner;

public class T22MatricesEjercicios4x4 {

	public static void main(String[] args) {
		new Matriz4x4((byte) 4);
		System.out.println("---------------");
		Matriz4x42 m = new Matriz4x42();
		m.cargar();
		m.imprimirDiagonalPrincipal();

	}
}

class Matriz4x4 {

	// declarando un tipo de dato dentro de stack
	private byte[][] matriz;

	public Matriz4x4(byte paraLongitud) {
		matriz = new byte[paraLongitud][paraLongitud];
		for (byte f1 = 0; f1 < getMatriz().length; f1++) {
			for (byte f2 = 0; f2 < getMatriz()[0].length; f2++) {
				if (f1 == f2) {
					System.out.print(" X ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}

	public byte[][] getMatriz() {
		return matriz;
	}
}

class Matriz4x42 {

	private Scanner teclado;
	private int[][] mat;

	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[4][4];
		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 4; c++) {
				System.out.print("Ingrese componente: ");
				mat[f][c] = teclado.nextInt();
			}
		}

	}

	public void imprimirDiagonalPrincipal() {
		for (int k1 = 0; k1 < 4; k1++) {
			for (int k2 = 0; k2 < 4; k2++) {
				if (k1 == k2)
					System.out.print(mat[k1][k2] + " ");
			}
		}
		System.out.println();
	}
}