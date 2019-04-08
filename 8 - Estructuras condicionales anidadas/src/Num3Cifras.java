
import java.util.Scanner;

public class Num3Cifras {

	private int num;
	private Scanner sc = new Scanner(System.in);

	public Num3Cifras() {
		num = (int) sc.nextInt();
	}

	public static void main(String[] args) {

		System.out.println("Introduce un numero de 1 a 3 cifras");
		Num3Cifras n = new Num3Cifras();
		System.out.println("Numero introducido : " + n.num);

		if (n.num >= 1000) {
			System.out.println("Numero mayor de 4 cifras");
		} else {
			if ((n.num < 1000) && (n.num >= 100)) {
				System.out.println("Numero de 3 cifras");
			} else if ((n.num < 99) && (n.num >= 10)) {
				System.out.println("Numero de 2 cifras");
			} else if ((n.num < 9) && (n.num >= 1)) {
				System.out.println("Numero de 1 cifras");
			}
		}

		EstructurasCondiconalAnidadas4.getSolucion();

	}
}

class EstructurasCondiconalAnidadas4 {

	public static void getSolucion() {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un valor de hasta tres d�gitos positivo:");
		num = teclado.nextInt();
		if (num < 10) {
			System.out.print("Tiene un d�gito");
		} else {
			if (num < 100) {
				System.out.print("Tiene dos d�gitos");
			} else {
				if (num < 1000) {
					System.out.print("Tiene tres d�gitos");
				} else {
					System.out.print("Error en la entrada de datos.");
				}
			}
			teclado.close();
		}
	}
}