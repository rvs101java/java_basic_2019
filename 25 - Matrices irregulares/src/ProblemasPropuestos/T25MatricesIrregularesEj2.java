
/**
 * Confeccionar una clase para administrar los días que han faltado los 3 empleados de una empresa.
 * Definir un vector de 3 elementos de tipo String para cargar los nombres
 *  y una matriz irregular para cargar los días que han faltado 
 *  cada empleado (cargar el número de día que faltó)
 * Cada fila de la matriz representan los días de cada empleado.
 * Mostrar los empleados con la cantidad de inasistencias.
 * Cuál empleado faltó menos días. 
 */
package ProblemasPropuestos;

import java.util.Scanner;

/**
 * 
 * @author Rad
 *
 */
public class T25MatricesIrregularesEj2 {

	public static void main(String[] args) {

		MatrizIrregularEj2 mie = new MatrizIrregularEj2();
		mie.setNombresEmpleado();
		mie.setLongitudFaltasEmpleado();
		mie.setFaltasDeEmpleado();
		mie.verFaltasConEmpleados();
		mie.contarFaltasConEmpleados();
	}
}

class MatrizIrregularEj2 {

	private String empleado;
	private String[] nombreEmpleados;
	private int[][] faltasEmpleado;
	private String[][][] faltasConEmpleados;

	public MatrizIrregularEj2() {
		nombreEmpleados = new String[3];
		faltasEmpleado = new int[4][];
		faltasConEmpleados = new String[3][4][5];
	}

	public int[][] setLongitudFaltasEmpleado() {
		for (int f = 0; f < getFaltas().length; f++) {
			for (int c = 0; c < 6; c++) {
				getFaltas()[f] = new int[c];
			}
		}
		return getFaltas();
	}

	public int[][] getFaltas() {
		return faltasEmpleado;
	}

	public String[][][] getFaltasDeEmpleado() {
		return faltasConEmpleados;
	}

	public void setFaltasDeEmpleado() {
		int semana = 1;
		System.out.println("Lista de Empleados");
		System.out.println("Introduce la marca 'x' para poner falta al trabajador");
		System.out.println("Pulsar 'enter' u otra tecla para no poner falta ");

		for (int i = 0; i < getNombresEmpleados().length; i++) {
			getFaltasDeEmpleado()[i][0][0] = getNombresEmpleados()[i];
			System.out.println(getFaltasDeEmpleado()[i][0][0]);
			for (int f = 0; f < getFaltas().length; f++) {
				System.out.println((semana++) + "º Semana");
				for (int c = 0; c < getFaltas()[f].length; c++) {
					setDiaSemana(c);
					getFaltasDeEmpleado()[i][f][c] = getSimbolo();
				}
				System.out.println();
			}
			semana = 1;
		}
	}

	public void verFaltasConEmpleados() {
		int semana = 1;
		System.out.println("Faltas de los Empleados");
		for (int i = 0; i < getFaltasDeEmpleado().length; i++) {
			System.out.println(getNombresEmpleados()[i]);
			for (int f = 0; f < getFaltas().length; f++) {
				System.out.println((semana++) + "º Semana");
				for (int c = 0; c < getFaltas()[f].length; c++) {
					setDiaSemana(c);
					System.out.print(" " + getFaltasDeEmpleado()[i][f][c] + " ");
				}
				System.out.println();
			}
			System.out.println();
			semana = 1;
		}
	}

	public void contarFaltasConEmpleados() {

		int trabajador1 = 0;
		int trabajador2 = 0;
		int trabajador3 = 0;

		for (int i = 0; i < getFaltasDeEmpleado().length; i++) {
			for (int f = 0; f < getFaltasDeEmpleado()[i].length; f++) {
				for (int c = 0; c < getFaltasDeEmpleado()[i][f].length; c++) {
					if (i == 0) {
						if (getFaltasDeEmpleado()[i][f][c].equals("x")) {
							trabajador1++;
						}
					}
					if (i == 1) {
						if (getFaltasDeEmpleado()[i][f][c].equals("x")) {
							trabajador2++;
						}
					}
					if (i == 2) {
						if (getFaltasDeEmpleado()[i][f][c].equals("x")) {
							trabajador3++;
						}
					}
				}
			}
		}
		if ((trabajador2 < trabajador1) && (trabajador1 > trabajador3)) {
			System.out.println("Trabajador 1 tiene mas faltas de asistencia: " + trabajador1);
		}
		if ((trabajador1 < trabajador2) && (trabajador2 > trabajador3)) {
			System.out.println("Trabajador 2 tiene mas faltas de asistencia: " + trabajador2);
		}
		if ((trabajador2 < trabajador3) && (trabajador3 > trabajador1)) {
			System.out.println("Trabajador 3 tiene mas faltas de asistencia: " + trabajador3);
		}

		System.out.println("Total de faltas para el Trabajador 1: " + trabajador1);
		System.out.println("Total de faltas para el Trabajador 2: " + trabajador2);
		System.out.println("Total de faltas para el Trabajador 3: " + trabajador3);
	}

	// --------------------------------

	public String[] getNombresEmpleados() {
		return nombreEmpleados;
	}

	public String getNombre() {
		return empleado;
	}

	public String[] setNombresEmpleado() {
		for (int f = 0; f < getNombresEmpleados().length; f++) {
			getNombresEmpleados()[f] = getNombreGenerado();
		}
		return getNombresEmpleados();
	}

	public String getNombreGenerado() {
		String palabra = "";
		for (int f = 0; f < 1; f++) {
			for (int c = 0; c < 4; c++) {
				if (c == 0) {
					char letraMayus = ((Math.random() * (1 + 10) + 1) >= 5) ? 'a' : 'e';
					letraMayus = Character.toUpperCase(letraMayus);
					palabra += letraMayus;
				}
				if (c == 2) {
					char letraMayus = 'e';
					palabra += letraMayus;
				}
				if (c == 3) {
					char letraMayus = 'a';
					palabra += letraMayus;
				}
				char letras = (char) (Math.random() * 26 + 'a');
				palabra += String.valueOf(letras);
			}
		}
		return palabra;
	}

	public String getSimbolo() {
		String numero;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextLine();
		return numero;
	}

	public void setDiaSemana(int dia) {
		String[] dias = new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
		System.out.print("\t" + dias[dia] + " ");
	}

}
