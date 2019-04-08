import java.util.Scanner;

/**
 * Problema 1: Se tiene la siguiente información:
 * 
 * · Nombres de 4 empleados.
 * 
 * · Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3
 * meses.
 * 
 * Confeccionar el programa para:
 * 
 * a) Realizar la carga de la información mencionada.
 * 
 * b) Generar un vector que contenga el ingreso acumulado en sueldos en los
 * últimos 3 meses para cada empleado.
 * 
 * c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en
 * los últimos 3 meses
 * 
 * d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado
 * 
 * @author Rad
 *
 */

public class T24Problema1Sol {

	public static void main(String[] args) {
		Empleados1 emp = new Empleados1();
		emp.cargar();
		emp.calcularSumaSueldos();
		emp.imprimirTotalPagado();
		emp.empleadoMayorSueldo();
		
	}

}

/**
 * Clase Empleado
 * 
 * @author Rad
 *
 */
class Empleados1 {

	// Declaramos los atributos
	private Scanner teclado;
	private String[] empleados;
	private int[][] sueldos;
	private int[] sueldostot;

	/**
	 * Inicializamos los elementos
	 */
	public void cargar() {
		teclado = new Scanner(System.in);
		empleados = new String[4];
		sueldos = new int[4][3];
		for (int f = 0; f < empleados.length; f++) {
			System.out.print("Ingrese el nombre del emplead@: ");
			empleados[f] = teclado.next();
			for (int c = 0; c < sueldos[f].length; c++) {
				System.out.print("Ingrese el sueldo: ");
				sueldos[f][c] = teclado.nextInt();
			}
		}
	}

	/**
	 * Calculamos la suma total de todos los sueldos
	 */
	public void calcularSumaSueldos() {
		sueldostot = new int[4];
		for (int f = 0; f < sueldos.length; f++) {
			int suma = 0;
			for (int c = 0; c < sueldos[f].length; c++) {
				suma = suma + sueldos[f][c];
			}
			sueldostot[f] = suma;
		}
	}

	/**
	 * Sueldo total a cada empleado
	 */
	public void imprimirTotalPagado() {
		System.out.println("Total de sueldos pagados por empleado");
		for (int f = 0; f < sueldostot.length; f++) {
			System.out.println(empleados[f] + " - " + sueldostot[f]);
		}
	}

	/**
	 * Mayor sueldo a quien pertenece
	 */
	public void empleadoMayorSueldo() {
		int may = sueldostot[0];
		String nom = empleados[0];
		for (int fila = 0; fila < sueldostot.length; fila++) {
			if (sueldostot[fila] > may) {
				may = sueldostot[fila];
				nom = empleados[fila];
			}
		}
		System.out.println("El empleado con mayor sueldo es : " + nom + " que tiene un sueldo de " + may);
	}
}
