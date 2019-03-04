package ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class T11Ej4Coordenadas {

	private static double get2Decimales(double decimal) {
		double numeroAle = 0;
		BigDecimal bd = new BigDecimal(decimal);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		numeroAle = bd.doubleValue();
		return numeroAle;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = 0;
		double y = 0;
		double nPuntos = 0;

		int cant1 = 0;
		int cant2 = 0;
		int cant3 = 0;
		int cant4 = 0;

		System.out.println("¿ Cuantos puntos a ingresar ?");
		nPuntos = sc.nextDouble();

		for (int i = 1; i <= 4; i++) {
			System.out.println("Cuadrante: " + i);
			for (int ii = 1; ii <= nPuntos; ii++) {
				int ix = 1;
				if (i == 1) {
					System.out.println("Introduce la coordenada 'x" + (ix++) + "' del cuadrante: " + i);
					get2Decimales(x = sc.nextDouble());
					System.out.println("Introduce la coordenada 'y" + (ix++) + "' del cuadrante: " + i);
					get2Decimales(y = sc.nextDouble());
					if (x > 0 && y > 0) {
						cant1++;
					}
				}
				if (i == 2) {
					System.out.println("Introduce la coordenada 'x" + (ix++) + "' del cuadrante: " + i);
					x = sc.nextDouble();
					System.out.println("Introduce la coordenada 'y" + (ix++) + "' del cuadrante: " + i);
					y = sc.nextDouble();
					if (x < 0 && y > 0) {
						cant2++;
					}
				}
				if (i == 3) {
					System.out.println("Introduce la coordenada 'x" + (ix++) + "' del cuadrante: " + i);
					x = sc.nextDouble();
					System.out.println("Introduce la coordenada 'y" + (ix++) + "' del cuadrante: " + i);
					y = sc.nextDouble();
					if (x < 0 && y < 0) {
						cant3++;
					}
				}
				if (i == 4) {
					System.out.println("Introduce la coordenada 'x" + (ix++) + "' del cuadrante: " + i);
					x = sc.nextDouble();
					System.out.println("Introduce la coordenada 'y" + (ix++) + "' del cuadrante: " + i);
					y = sc.nextDouble();
					if (x > 0 && y < 0) {
						cant4++;
					}
				}
				ix = 0;
			}
		}

		System.out.print("Cantidad de puntos en el primer cuadrante:");
		System.out.println(cant1);
		System.out.print("Cantidad de puntos en el segundo cuadrante:");
		System.out.println(cant2);
		System.out.print("Cantidad de puntos en el tercer cuadrante:");
		System.out.println(cant3);
		System.out.print("Cantidad de puntos en el cuarto cuadrante:");
		System.out.println(cant4);
		sc.close();
		System.out.println("--------------");
		// Sol6.getSol6();
	}
}

class Sol6 {

	public static void getSol6() {
		// Declaracion
		Scanner sc = new Scanner(System.in);
		int n, f, x, y, cant1, cant2, cant3, cant4;
		cant1 = 0;
		cant2 = 0;
		cant3 = 0;
		cant4 = 0;
		System.out.println("Cantidad de puntos: ");
		n = sc.nextInt();

		// Procesamiento
		for (f = 1; f <= n; f++) {

			System.out.print("ingrese coordenadas x: ");
			x = sc.nextInt();

			System.out.print("ingrese coordenadas y: ");
			y = sc.nextInt();

			if (x > 0 && y > 0) {
				cant1++;
			} else {
				if (x < 0 && y > 0) {
					cant2++;
				} else {
					if (x < 0 && y < 0) {
						cant3++;
					} else {
						if (x > 0 && y < 0) {
							cant4++;
						}
					}
				}
			}
		}

		// Salida
		System.out.print("Cantidad de puntos en el primer cuadrante:");
		System.out.println(cant1);
		System.out.print("Cantidad de puntos en el segundo cuadrante:");
		System.out.println(cant2);
		System.out.print("Cantidad de puntos en el tercer cuadrante:");
		System.out.println(cant3);
		System.out.print("Cantidad de puntos en el cuarto cuadrante:");
		System.out.println(cant4);
		sc.close();
	}
}