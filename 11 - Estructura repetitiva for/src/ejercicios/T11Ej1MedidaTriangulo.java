package ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Confeccionar un programa que lea n pares de datos, cada par de datos
 * corresponde a la medida de la base y la altura de un triángulo. El programa
 * deberá informar:
 * 
 * a) De cada triángulo la medida de su base, su altura y su superficie.
 * 
 * b) La cantidad de triángulos cuya superficie es mayor a 12.
 * 
 * @author Rad
 *
 */
public class T11Ej1MedidaTriangulo {

	public static double get2decimales(double decimales) {
		BigDecimal bd = new BigDecimal(decimales);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	public static void main(String[] args) {

		double altura, base, superficie, total = 0.0;

		for (int i = 0; i < 100; i++) {
			altura = get2decimales((Math.random() + (1 + 2.5) + 1));
			base = get2decimales((Math.random() + (1 + 2.5) + 1));

			superficie = get2decimales(altura * (base / 2));
			System.out.println("+ Altura: " + altura + " - Base: " + base + " - Superficie: " + superficie);

			if (superficie >= 12) {
				total++;
			}
		}
		System.out.println("- Total triangulos superficie mayor : " + total);

	}
}

class Sol1 {

	public static void getSol1() {
		Scanner teclado = new Scanner(System.in);
		int base, altura, superficie, cantidad, f, n;
		cantidad = 0;
		
		System.out.println("Cuantos triangulos procesara: ");
		n = teclado.nextInt();
		for (f = 1; f <= n; f++) {
			System.out.println("Ingrese el valor de la base: ");
			base = teclado.nextInt();

			System.out.println("Ingrese el valor de la altura: ");
			altura = teclado.nextInt();

			superficie = (base * altura) / 2;

			System.out.println("La superficie es: " + superficie);
			if (superficie > 12) {
				cantidad = cantidad + 1;
			}
		}

		teclado.close();

	}
}
