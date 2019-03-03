package ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
