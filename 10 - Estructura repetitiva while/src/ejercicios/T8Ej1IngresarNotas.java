package ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
 * cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 * 
 * @author Rad
 *
 */
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

class Sol1 {

	public static void getSol1() {

		int x, nota, conta1, conta2;
		x = 1;
		conta1 = 0;
		conta2 = 0;
		
		while (x <= 10) {
			System.out.println("Ingrese nota: ");
			nota = (int) (Math.random() * (1 + 9) + 1);
			if (nota >= 7) {
				conta1 = conta1 + 1;
			} else {
				conta2 = conta2 + 1;
			}
			x = x + 1;
		}
		 
		
		System.out.println("Cantidad de alumnos con notas mayores o iguales a 7:");
		System.out.println(conta1);
		System.out.println("Cantidad de alumnos con notas mayores o iguales a 7:");
		System.out.println(conta2);
	}
}
