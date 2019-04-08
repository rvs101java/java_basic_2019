
public class T2SumaMultiplica {

	public static void main(String[] args) {

		int total;
		int num1 = (int) (Math.random() * (1 + 9) + 1);
		int num2 = (int) (Math.random() * (1 + 9) + 1);
		int num3 = (int) (Math.random() * (1 + 9) + 1);

		// int num1 = 3;
		// int num2 = 3;
		// int num3 = 3;

		System.out.println("Numero 1: " + num1);
		System.out.println("Numero 2: " + num2);
		System.out.println("Numero 3: " + num3);

		if (num1 == num2) {
			if (num2 == num3) {
				total = (num1 + num2);
				total *= num3;
				System.out.println("Total : " + total);
			}
		}

	}
}
