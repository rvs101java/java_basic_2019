
import java.util.Scanner;

/**
 * Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados
 * (4 por la mañana y 4 por la tarde)
 * 
 * Confeccionar un programa que permita almacenar los sueldos de los empleados
 * agrupados por turno.
 * 
 * Imprimir los gastos en sueldos de cada turno.
 * 
 * @author Rad
 */
public class EjercicioVector3TurnosEmpresaSolucion {

	public static void main(String[] args) {

		TurnosEmpleados te = new TurnosEmpleados();
		te.cargar();
		te.calcularGastos();
	}
}

class TurnosEmpleados {

	private Scanner teclado;
	private float[] turnoMan;
	private float[] turnoTar;

	public void cargar() {
		teclado = new Scanner(System.in);
		turnoMan = new float[4];
		turnoTar = new float[4];

		System.out.println("Sueldos de empleados del turno de la mañana.");
		for (int f = 0; f < 4; f++) {
			// System.out.println("Ingrese sueldo: ");
			// turnoMan[f] = teclado.nextFloat();
			System.out.print("Sueldo ingresado: ");
			turnoMan[f] = (float) (Math.random() * (100 + 500) + 1000);
			System.out.println(turnoMan[f]);
		}

		System.out.println("Sueldos de empleados del turno de la tarde.");
		for (int f = 0; f < 4; f++) {
			// System.out.println("Ingrese sueldo: ");
			// turnoTar[f] = teclado.nextFloat();
			System.out.print("Sueldo ingresado: ");
			turnoTar[f] = (float) (Math.random() * (100 + 500) + 1000);
			System.out.println(turnoTar[f]);
		}
	}

	public void calcularGastos() {
		float man = 0;
		float tar = 0;
		for (int f = 0; f < 4; f++) {
			man = man + turnoMan[f];
			tar = tar + turnoTar[f];
		}
		System.out.println("Total de gastos del turno de la mañana: " + man);
		System.out.println("Total de gastos del turno de la tarde: " + tar);
	}
}
