package ProblemasPropuestos;

import java.util.Scanner;

public class T25MatricesIrregularesEj2Sol2 {

	private Scanner teclado;
	private String[] nombres;
	private int[][] dias;

	public void cargar() {
		teclado = new Scanner(System.in);
		nombres = new String[3];
		dias = new int[3][];
		for (int f = 0; f < nombres.length; f++) {
			System.out.print("Ingrese el nombre del empleado:");
			nombres[f] = teclado.next();
			System.out.print("Cuantas d�as falt� el empleado:");
			int faltas = teclado.nextInt();
			dias[f] = new int[faltas];
			for (int c = 0; c < dias[f].length; c++) {
				System.out.print("Ingrese nro de d�a:");
				dias[f][c] = teclado.nextInt();
			}
		}
	}

	public void inasistencias() {
		for (int f = 0; f < nombres.length; f++) {
			System.out.println(nombres[f] + " falt� " + dias[f].length + " d�as");
		}
	}

	public void empleadoMensosFaltas() {
		int faltas = dias[0].length;
		String nom = nombres[0];
		for (int f = 1; f < dias.length; f++) {
			if (dias[f].length < faltas) {
				faltas = dias[f].length;
				nom = nombres[f];
			}
		}
		System.out.println("El empleado que falt� menos es " + nom + " con " + faltas + " faltas.");
	}

	public static void main(String[] args) {
		T25MatricesIrregularesEj2Sol2 ma = new T25MatricesIrregularesEj2Sol2();
		ma.cargar();
		ma.inasistencias();
		ma.empleadoMensosFaltas();
	}
}
