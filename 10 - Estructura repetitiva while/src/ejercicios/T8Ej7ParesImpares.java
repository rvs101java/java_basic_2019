package ejercicios;

import java.util.Random;

/**
 * Desarrollar un programa que permita cargar n números enteros y luego nos
 * informe cuántos valores fueron pares y cuántos impares. Emplear el operador
 * ?%? en la condición de la estructura condicional:
 * 
 * @author Rad
 *
 */
public class T8Ej7ParesImpares {

	public static void main(String[] args) {

		int numeros = (int) (Math.random() * (1 + 100) + 1);

		int num = 0;
		while (num++ < numeros) {
			System.out.print((((num % 2) == 0) ? "- ImPar" : "+ Par"));
			System.out.println(" - Numero: " + num);
		}
		System.out.println("Numero Generado es : " + numeros);
	}
}

class Sol7 {

	public static void getSol7() {
		// Declaracion
		int n, x, valor, pares, impares = 0;
		x = 1;
		pares = 0;
		impares = 0;

		// Procesamiento
		System.out.println("Cuantos numeros ingresara: ");
		n = (int) (Math.random() * (1 + 10) + 1);
		while (x <= n) {
			System.out.println("Ingrese el valor: ");
			valor = new Random().nextInt(99);
			if (valor % 2 == 0) {
				pares = pares + 1;
			} else {
				impares = impares + 1;
			}
			x = x + 1;
		}

		// Salida
		System.out.println("Cantidad de pares : ");
		System.out.println(pares);
		System.out.println("Cantidad de impares : ");
		System.out.println(impares);

	}
}
