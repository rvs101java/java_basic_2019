package ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la
 * altura promedio de las personas.
 * 
 * @author Rad
 *
 */
public class T8Ej2MediaAlturas {

	public static double getAltura(double numero) {
		BigDecimal bd = new BigDecimal(numero);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	public static void main(String[] args) {

		double altura = 0;
		int numPersonas = (int) (Math.random() * (1 + 20));
		int contador = 0;

		while (contador++ < numPersonas) {
			double x = getAltura((Math.random() * (0.10 + 0.30) + 1.60));
			altura += x;
			System.out.println(contador + " - " + "altura : " + x);
		}
		System.out.println("Altura final : " + getAltura(altura / contador));
	}
}
 
class Sol2 {

	public static void getSol2() {
		int n, x;
		float altura, suma, promedio;
		System.out.println("Cuantas personas hay : ");
		n = (int) (Math.random() * (1 + 30) + 1);
		x = 1;
		suma = 0;
		while (x <= n) {
			System.out.print("Ingrese la altura :");
			altura = (float) (Math.random() * (.30 + .40) + 1.50);
			suma += altura;
			x = x + 1;
		}
		promedio = suma / n;
		System.out.println("Altura promedio: " + promedio);
	}
}
