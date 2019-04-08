package ejemplo;

import java.util.Scanner;

public class T18VectoresParalelosNombreEdades3 {

	public static void main(String[] args) {

		VectorNombreEdad vne = new VectorNombreEdad();
		vne.cargar();
		vne.mayoresEdad();

	}
}

class VectorNombreEdad {

	private Scanner teclado;
	private String[] nombres;
	private int[] edades;

	public void cargar() {
		teclado = new Scanner(System.in);
		nombres = new String[5];
		edades = new int[5];

		for (int f = 0; f < nombres.length; f++) {
			System.out.print("Ingrese nombre: ");
			nombres[f] = teclado.next();
			System.out.println("Ingrese edad: ");
			edades[f] = teclado.nextInt();
		}
	}

	public void mayoresEdad() {
		System.out.println("Personas mayores de edad.");
		for (int f = 0; f < nombres.length; f++) {
			if (edades[f] >= 18) {
				System.out.println("Nombre: " + nombres[f] + " Edades: " + edades[f]);
			}
		}
	}
}
