
import java.util.Scanner;

public class T8NumeroPositivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entre 1 y 99");
		int num = sc.nextInt();
		do {
			if (num > 100 || num < 0) {
				System.out.println("Numero No valido : " + num);
			} else {
				System.out.println("Numero Valido : " + num);
			}
			System.out.println("Valor no valido - Introduce uno nuevo ");
			num = sc.nextInt();
		} while (num > 100 || num < 0);
		System.out.println("Valor valido : " + num);
		sc.close();
	}
}
