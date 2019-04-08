package basico;

import java.util.Scanner;

public class T13Ej3Ingreso2Apellidos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 1º nombre completo");
		String nombreCompleto1 = sc.nextLine();
		System.out.println("Introduce 2º nombre completo");
		String nombreCompleto2 = sc.nextLine();

		System.out.println(nombreCompleto1.equals(nombreCompleto2) ? "Son iguales" : "No son iguales");

		System.out.println(nombreCompleto1.equalsIgnoreCase(nombreCompleto2) ? "Son iguales" : "No son iguales");
		
		System.out.println("-------------------");
		Sol1.getNombre();
	}
}

class Sol1 {

	public static void getNombre() {
		Scanner sc = new Scanner(System.in);
		String apellido1, apellido2;
		
		System.out.println("Ingrese primer apellido");
		apellido1 = sc.next();
	
		System.out.println("Ingrese segundo apellido");
		apellido2 = sc.next();
		
		if (apellido1.equals(apellido2)) {
			System.out.println("Los apellidos son iguales");
		} else {
			System.out.println("Los apellidos NO son iguales");
		}
		sc.close();
	}
}