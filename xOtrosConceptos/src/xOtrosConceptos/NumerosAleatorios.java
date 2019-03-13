package xOtrosConceptos;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {

		Random rm = new Random();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int x = rm.nextInt(((20 - 1) + 1) + 1);
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
