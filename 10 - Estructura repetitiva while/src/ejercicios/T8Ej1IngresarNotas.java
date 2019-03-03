package ejercicios;

import java.util.Scanner;

public class T8Ej1IngresarNotas {

	private static int contador = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nota = 0;
		int notaAlta = 0;
		int notaBaja = 0;

		while (contador++ < 10) {
			System.out.println("Ingresar nota: ");
			nota = sc.nextDouble();
			if ((nota > 10) || (nota < 1)) {
				while ((nota > 10) || (nota < 1)) {
					System.out.println("Ingresar una nota valida: ");
					nota = sc.nextDouble();
				}
				if (nota >= 7) {
					System.out.println("~Alumno: " + contador + " tiene: " + nota);
					notaAlta++;
				} else if (nota < 7) {
					System.out.println("~Alumno: " + contador + " tiene: " + nota);
					notaBaja++;
				}
			} else {
				if (nota >= 7) {
					System.out.println("ºAlumno: " + contador + " tiene: " + nota);
					notaAlta++;
				} else if (nota < 7) {
					System.out.println("ºAlumno: " + contador + " tiene: " + nota);
					notaBaja++;
				}
			}
		}
		System.out.println("Nota Alta : " + notaAlta + " Nota Baja : " + notaBaja);
		sc.close();
	}
}
