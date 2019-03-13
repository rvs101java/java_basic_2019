import java.util.Scanner;

public class T8NotasAlumnos {

	private static Scanner sc = new Scanner(System.in);
	private static int num, num1, num2 = 0;
	private static int veces = 0;

	public static void main(String[] args) {

		System.out.println("Introduce la 1º nota : ");
		num = (int) sc.nextInt();

		while (num <= 0 || num > 10) {
			System.out.println("La nota no es validad - introduce valores entre 1 y 10 ");
			System.out.println("Introduce la nota " + (++veces) + " veces ");
			num = (int) sc.nextInt();
		}

		System.out.println("Introduce la 2º nota : ");
		num1 = (int) sc.nextInt();

		while (num1 <= 0 || num1 > 10) {
			System.out.println("La nota no es validad - introduce valores entre 1 y 10 ");
			System.out.println("Introduce la nota " + (++veces) + " veces ");
			num1 = (int) sc.nextInt();
		}

		System.out.println("Introduce la 3º nota : ");
		num2 = (int) sc.nextInt();

		while (num2 <= 0 || num2 > 10) {
			System.out.println("La nota no es validad - introduce valores entre 1 y 10 ");
			System.out.println("Introduce la nota " + (++veces) + " veces ");
			num2 = (int) sc.nextInt();
		}

		if (((num + num1 + num2) / 3) > 6) {
			System.out.println("Matematicas 1: " + num);
			System.out.println("Ingles 2 : " + num1);
			System.out.println("Quimica 3 : " + num2);
			System.out.println("☻ El alumno Promociona al siguiente curso");
		} else {
			System.out.println("Matematicas 1: " + num);
			System.out.println("Ingles 2 : " + num1);
			System.out.println("Quimica 3 : " + num2);
			System.out.println("♠ El alumno NO Promociona al siguiente curso");
		}
	}
}
