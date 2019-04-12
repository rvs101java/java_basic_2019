
import java.util.Scanner;

public class T8Num3Cifras {

	private int num;
	private Scanner sc = new Scanner(System.in);

	public T8Num3Cifras() {
		num = (int) sc.nextInt();
	}

	public static void main(String[] args) {

		System.out.println("Introduce un numero de 1 a 3 cifras");
		T8Num3Cifras n = new T8Num3Cifras();
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

		EstructurasCondiconalAnidadas4x.getSolucion();

	}
}

class EstructurasCondiconalAnidadas4x {

	public static void getSolucion() {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un valor de hasta tres dígitos positivo:");
		num = teclado.nextInt();
		if (num < 10) {
			System.out.print("Tiene un dígito");
		} else {
			if (num < 100) {
				System.out.print("Tiene dos dígitos");
			} else {
				if (num < 1000) {
					System.out.print("Tiene tres dígitos");
				} else {
					System.out.print("Error en la entrada de datos.");
				}
			}
			teclado.close();
		}
	}
}