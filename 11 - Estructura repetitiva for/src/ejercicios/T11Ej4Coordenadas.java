package ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class T11Ej4Coordenadas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = 0;
		double y = 0;
		double nPuntos = 0;
		double numeroAle = 0;

		System.out.println("¿ Cuantos puntos a ingresar ?");
		nPuntos = sc.nextDouble();

		BigDecimal bd = new BigDecimal(Math.random() * (1 + 100));
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		numeroAle = bd.doubleValue();

		for (int i = 1; i <= 4; i++) {
			System.out.println("Cuadrante: " + i);
			for (int ii = 1; ii <= nPuntos; ii++) {
				int ix = 1;
				if (i == 1) {
					System.out.println("Introduce la coordenada 'x" + (ix++) + "' del cuadrante: " + i);
					x = sc.nextDouble();
					System.out.println("Introduce la coordenada 'y" + (ix++) + "' del cuadrante: " + i);
					y = sc.nextDouble();
				}
				if (i == 2) {
					System.out.println("Introduce la coordenada 'x" + (ix++) + "' del cuadrante: " + i);
					x = sc.nextDouble();
					System.out.println("Introduce la coordenada 'y" + (ix++) + "' del cuadrante: " + i);
					y = sc.nextDouble();
				}
				if (i == 3) {
					System.out.println("Introduce la coordenada 'x" + (ix++) + "' del cuadrante: " + i);
					x = sc.nextDouble();
					System.out.println("Introduce la coordenada 'y" + (ix++) + "' del cuadrante: " + i);
					y = sc.nextDouble();
				}
				if (i == 4) {
					System.out.println("Introduce la coordenada 'x" + (ix++) + "' del cuadrante: " + i);
					x = sc.nextDouble();
					System.out.println("Introduce la coordenada 'y" + (ix++) + "' del cuadrante: " + i);
					y = sc.nextDouble();
				}
				ix = 0;
			}
		}
		sc.close();
	}

}
