package ejemplos;

import java.util.Scanner;

/**
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e
 * informe: El valor acumulado de todos los elementos del vector. El valor
 * acumulado de los elementos del vector que sean mayores a 36. Cantidad de
 * valores mayores a 50.
 * 
 * @author Rad
 *
 */
public class T16Ejercicio4Sol {

	public static void main(String[] args) {
		VectorSol4 v4 = new VectorSol4();
		v4.cargar();
		v4.verificarOrdenado();
	}
}

class VectorSol4 {

	private Scanner teclado;
	private int[] vec = new int[10];

	public void cargar() {
		// Declaracion
		teclado = new Scanner(System.in);
		// Procesamiento
		for (int f = 0; f < vec.length; f++) {
			System.out.print("Ingrese elemento:");
			vec[f] = teclado.nextInt();
		}
	}

	public void verificarOrdenado() {
		// Declaracion
		int orden = 1;
		// Procesamiento
		for (int f = 0; f < (vec.length - 1); f++) {
			if (vec[f + 1] < vec[f]) {
				orden = 0;
			}
		}
		if (orden == 1) {
			System.out.println("Esta ordenado de menor a mayor");
		} else {
			System.out.println("No esta ordenado de menor a mayor");
		}
	}

}
