package ejemplos;

import java.util.Scanner;

/**
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e
 * informe:
 * 
 * El valor acumulado de todos los elementos del vector.
 * 
 * El valor acumulado de los elementos del vector que sean mayores a 36.
 * Cantidad de valores mayores a 50.
 * 
 * @author Rad
 *
 */
public class T16Ejercicio2Sol {

	public static void main(String[] args) {

		Vectores2Sol vs = new Vectores2Sol();
		vs.cargar();
		vs.sumarizarVectores();
	}
}

class Vectores2Sol {

	private Scanner teclado;
	private int[] vec1;
	private int[] vec2;
	private int[] vecSuma;

	public void cargar() {
		teclado = new Scanner(System.in);
		vec1 = new int[4];
		vec2 = new int[4];
		System.out.println("Carga del primer vector.");
		for (int f = 0; f < 4; f++) {
			System.out.println("Ingrese elemento: ");
			vec1[f] = teclado.nextInt();
		}
		System.out.println("Carga del segundo vector.");
		for (int f = 0; f < 4; f++) {
			System.out.println("Ingrese elemento: ");
			vec2[f] = teclado.nextInt();
		}
	}

	public void sumarizarVectores() {
		vecSuma = new int[4];
		
		for (int f = 0; f < 4; f++) {
			vecSuma[f] = vec1[f] + vec2[f];
		}
	
		System.out.println("Vector resultante");
		for(int f = 0 ; f < 4 ; f++) {
			System.out.println(vecSuma[f]);
		}
	}

}
