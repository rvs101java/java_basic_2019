package ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que lea los lados de n triángulos, e informar: a) De
 * cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
 * isósceles (dos lados iguales), o escaleno (ningún lado igual) b) Cantidad de
 * triángulos de cada tipo. c) Tipo de triángulo que posee menor cantidad.
 * 
 * @author Rad
 *
 */
public class T11Ej3LadosTriangulo {

	public static void main(String[] args) {

		int eq = 0;
		int iso = 0;
		int esc = 0;

		for (int i = 0; i <= 10; i++) {
			int l1 = (int) (Math.random() * (1 + 10) + 1);
			int l2 = (int) (Math.random() * (1 + 10) + 1);
			int l3 = (int) (Math.random() * (1 + 10) + 1);

			System.out.println("Lado 1: " + l1 + "\nLado 2: " + l2 + "\nLado 3: " + l3);

			if ((l1 == l2) && (l2 == l3)) {
				System.out.println(" + Equilatero : " + ++eq);
			}

			if ((l1 != l2) && (l1 == l3)) {
				System.out.println(" + Isosceles : " + ++iso);
			}
			if ((l2 == l1) && (l2 != l3)) {
				System.out.println(" + Isosceles : " + ++iso);
			}
			if ((l3 == l2) && (l3 != l1)) {
				System.out.println(" + Isosceles : " + ++iso);
			}

			if (l1 != l2 && l2 != l3 && l1 != l3) {
				System.out.println(" - Escaleno : " + ++esc);
			}
		}
		System.out.println("Equilatero : " + eq + " - Isosceles : " + iso + " - Escaleno : " + esc);

		System.out.println("------------");
		Sol5.getSol5();
	}
}

class Sol5 {

	public static void getSol5() {
		// Declaracion e Inicializacion
		Scanner teclado = new Scanner(System.in);
		int f, lado1, lado2, lado3, cant1, cant2, cant3, n;
		cant1 = 0;
		cant2 = 0;
		cant3 = 0;

		// Procesamiento
		System.out.print("Ingrese la cantidad de triangulos");
		n = teclado.nextInt();

		for (f = 1; f <= n; f++) {
			System.out.println("Ingrese lado 1:");
			lado1 = teclado.nextInt();
			System.out.println("Ingrese lado 2:");
			lado2 = teclado.nextInt();
			System.out.println("Ingrese lado 3:");
			lado3 = teclado.nextInt();

			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Es un triangulo equilatero");
				cant1++;
			} else {
				if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
					System.out.println("Es un triangulo isosceles.");
					cant2++;
				} else {
					cant3++;
					System.out.println("Es un triangulo escaleno");
				}
			}
		}

		System.out.print("Cantidad de triángulos equilateros:");
		System.out.println(cant1);
		System.out.print("Cantidad de triángulos isósceles:");
		System.out.println(cant2);
		System.out.print("Cantidad de triángulos escalenos:");
		System.out.println(cant3);

		if ((cant1 < cant2) && (cant1 < cant3)) {
			System.out.println("Hay menor cantidad de triangulos equilateros");
		} else {
			if (cant2 < cant3) {
				System.out.println("Hay menor cantidad de triangulos isosceles");
			} else {
				System.out.println("Hay menor cantidad de triangulos escaleno");
			}
		}
	}
}
