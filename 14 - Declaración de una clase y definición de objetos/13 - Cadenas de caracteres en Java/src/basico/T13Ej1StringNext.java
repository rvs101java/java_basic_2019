package basico;

import java.util.Scanner;

public class T13Ej1StringNext {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre1, nombre2;
		int edad1, edad2;

		System.out.println("Ingrese el nombre 1�");
		nombre1 = sc.next();

		System.out.println("Ingrese edad 1�");
		edad1 = sc.nextInt();

		System.out.println("Ingrese el nombre 2�");
		nombre2 = sc.next();

		System.out.println("Ingrese edad 2�");
		edad2 = sc.nextInt();

		System.out.println("La persona de mayor edad es : ");

		System.out.println(((edad1 > edad2) ? "Nombre: " + nombre1 : "Nombre: " + nombre2));

		sc.close();

	}
}
