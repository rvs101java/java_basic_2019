
public class T11Multiplos3y5 {

	public static void main(String[] args) {

		int mul3 = 0, mul5 = 0;

		int i;
		for (i = 0; i <= 10; i++) {
			int valor1 = (int) (Math.random() * (1 + 50) + 1);
			// System.out.println("Numero generado : " + valor1);
			int valor2 = (int) (Math.random() * (1 + 50) + 1);
			// System.out.println("Numero generado : " + valor2);
			if (valor1 % 3 == 0) {
				System.out.println("- Multiplo de 3: " + valor1);
				mul3++;
			}
			if (valor2 % 5 == 0) {
				System.out.println("+ Multiplo de 5: " + valor2);
				mul5++;
			}
		}
		System.out.println("Total multiplos 3: " + mul3 + " - multiplos 5: " + mul5);
	}
}
