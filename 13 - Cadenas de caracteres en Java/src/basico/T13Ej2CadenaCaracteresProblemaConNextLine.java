package basico;

import java.util.Scanner;

public class T13Ej2CadenaCaracteresProblemaConNextLine {

	public static void getNombre() {
		Scanner teclado = new Scanner(System.in);
		String apenom1, apenom2;
		int edad1, edad2;

		System.out.print("Ingrese el apellido y el nombre:");
		apenom1 = teclado.nextLine();

		System.out.print("Ingrese edad:");
		edad1 = teclado.nextInt();

		System.out.print("Ingrese el apellido y el nombre:");
		teclado.nextLine();
		apenom2 = teclado.nextLine();

		System.out.print("Ingrese edad:");
		edad2 = teclado.nextInt();

		System.out.print("La persona de mayor edad es:");
		if (edad1 > edad2) {
			System.out.print(apenom1);
		} else {
			System.out.print(apenom2);
		}
		teclado.close();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre1;
		String nombre2;
		int edad1, edad2 = 0;

		System.out.println("Ingrese el nombre y apellidos 1º");
		nombre1 = sc.nextLine();
		System.out.println("Ingrese edad 1º");
		edad1 = sc.nextInt();

		/**
		 * Cuando se ingresa una cadena con caracteres en blanco debemos tener en cuenta
		 * en llamar al método nextLine() Una dificultad se presenta si llamamos al
		 * método nextLine() y previamente hemos llamado al método nextInt(), esto
		 * debido a que luego de ejecutar el método nextInt() queda almacenado en el
		 * objeto de la clase Scanner el caracter "Enter" y si llamamos inmediatamente
		 * al método nextLine() este almacena dicho valor de tecla y continúa con el
		 * flujo del programa. Para solucionar este problema debemos generar un código
		 * similar a:
		 * 
		 * System.out.print("Ingrese edad:"); edad1=teclado.nextInt();
		 * System.out.print("Ingrese el apellido y el nombre:"); teclado.nextLine();
		 * apenom2=teclado.nextLine();
		 */
		System.out.println("Ingrese el nombre y apellidos 2º");
		sc.nextLine();
		nombre2 = sc.nextLine();
		System.out.println("Ingrese edad 2º");
		edad2 = sc.nextInt();

		System.out.println("La persona de mayor edad es : ");
		System.out.println(((edad1 > edad2) ? "Nombre Completo: " + nombre1 : "Nombre Completo: " + nombre2));

		// getNombre();
		sc.close();
	}
}
