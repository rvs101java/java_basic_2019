package ejercicios;

import java.util.Scanner;

public class T11Ej5Cargar10Valores {

	public static void main(String[] args) {

		int cPositivos = 0;
		int cNegativos = 0;
		int cMultiplos15 = 0;
		int cPares = 0;

		for (int i = 1; i <= 30; i++) {
			int x = (int) (Math.random() * (-1 + 200) + (-100));
			System.out.println(i + " - Numero : " + x);
			if (x > 0) {
				cPositivos++;
			}
			if (x < 0) {
				cNegativos++;
			}
			if (x % 15 == 0) {
				cMultiplos15++;
			}
			if (x % 15 == 0) {
				cPares++;
			}
		}

		System.out.println("-------------------------");
		System.out.println("Positivos : " + cPositivos);
		System.out.println("Negativos : " + cNegativos);
		System.out.println("Multiplos : " + cMultiplos15);
		System.out.println("Pares : " + cPares);
		System.out.println("-------------------------");

		System.out.println("---------");
		Sol7.getSol7();
		
	}
}

class Sol7 {

	public static void getSol7() {
//		Declara
		Scanner teclado = new Scanner(System.in);
		int f, valor, negativo, positivo, mult15, sumapares;
		negativo = 0;
		positivo = 0;
		mult15 = 0;
		sumapares = 0;

//		Procesa
		for (int i = 0; i <= 10; i++) {
			System.out.println("Ingrese valor: ");
			valor = teclado.nextInt();
			if (valor < 0) {
				negativo++;
			} else {
				if (valor > 0) {
					positivo++;
				}
			}

			if (valor % 15 == 0) {
				mult15++;
			}

			if (valor % 2 == 0) {
				sumapares += valor;
			}
		}
		
//		Salida
		System.out.print("Cantidad de valores negativos:");
		System.out.println(negativo);
		System.out.print("Cantidad de valores positivos:");
		System.out.println(positivo);
		System.out.print("Cantidad de valores múltiplos de 15:");
		System.out.println(mult15);
		System.out.print("Suma de los valores pares:");
		System.out.println(sumapares);
	}
}