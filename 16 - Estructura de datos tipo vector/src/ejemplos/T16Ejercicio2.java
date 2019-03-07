package ejemplos;

import java.util.Random;

/**
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e
 * informe: El valor acumulado de todos los elementos del vector. El valor
 * acumulado de los elementos del vector que sean mayores a 36. Cantidad de
 * valores mayores a 50.
 * 
 * @author Rad
 *
 */
public class T16Ejercicio2 {

	public static void main(String[] args) {
		Vectores2 v2 = new Vectores2();
		v2.setSumar();

	}
}

class Vectores2 {

	private int[] vector1 = new int[4];
	private int[] vector2 = new int[vector1.length];
	private int[] suma = new int[vector1.length];

	public void setSumar() {

		for (int i = 0; i < vector1.length; i++) {
			vector1[i] = new Random().nextInt(100);
			System.out.println("num1: " + vector1[i]);
			vector2[i] = new Random().nextInt(100);
			System.out.println("num2: " + vector2[i]);
		}

		int c = 0;
		for (int i = 0; i < vector1.length; i++) {
			System.out.println((++c) + " Suma: " + (suma[i] = (vector1[i] + vector2[i])));
		}

	}

}
