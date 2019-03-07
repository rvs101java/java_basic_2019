package ejemplos;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
public class T16Ejercicio1Sol {

	public static void main(String[] args) {

		VectoresSol1 vs = new VectoresSol1();
		vs.cargar();
		vs.acumularElementos();
		vs.acumularMayores36();
		vs.cantidadMayores50();
		
	}
}

class VectoresSol1 {

	private Scanner teclado;
	private int[] vec;

	public void cargar() {
		teclado = new Scanner(System.in);
		vec = new int[8];
		for (int f = 0; f < 8; f++) {
			System.out.println("Ingrese elemento: ");
			vec[f] = teclado.nextInt();
		}
	}

	public void acumularElementos() {
		int suma = 0;
		for (int f = 0; f < 8; f++) {
			suma = suma + vec[f];
		}
		System.out.println("La suma de los 8 elementos es : " + suma);
	}

	public void acumularMayores36() {
		int suma = 0;
		for (int f = 0; f < 8; f++) {
			if (vec[f] <= 36) {
				suma = suma + vec[f];
			}
		}
		System.out.println("La suma de los elementos menores a 36 es : " + suma);
	}

	public void cantidadMayores50() {
		int suma = 0;
		for (int f = 0; f < 8; f++) {
			if (vec[f] > 50) {
				suma = suma + vec[f];
			}
		}
		System.out.println("La suma de los elementos mayores a 50 es : " + suma);
	}
}
