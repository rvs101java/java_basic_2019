import java.util.Scanner;

/**
 * 
 * 
 * Problema 1: Confeccionar un programa que permita cargar los nombres de 5
 * operarios y sus sueldos respectivos.
 * 
 * Mostrar el sueldo mayor y el nombre del operario.
 * 
 * @author Rad
 *
 */
public class T19EjMenorMayorEdadNombre1Sol {

	public static void main(String[] args) {

		Sol1 so = new Sol1();
		so.cargar();
		so.mayorSueldo();

	}
}

class Sol1 {

	private Scanner teclado;

	private String[] nombres;
	private float[] sueldos;

	public void cargar() {
		teclado = new Scanner(System.in);
		nombres = new String[5];
		sueldos = new float[5];
		String nombre = "";
		float sueldo = 0;

		System.out.println("Ingrese el nombre de los empleados: ");
		// 1º ejecuta los metodos getNombres() y getSueldos() para realizar las
		// asignaciones
		for (int f = 0; f < getNombres().length; f++) {
			System.out.println("Ingresa Nombre: ");
			getNombres()[f] = nombre = teclado.next();
			System.out.println("Ingresa Sueldo: ");
			getSueldos()[f] = sueldo = teclado.nextFloat();
			System.out.println("Empleado " + f + ": ".concat(nombre) + " - ".concat("Sueldos: " + sueldo));
		}
	}

	public void mayorSueldo() {
		int pos;
		// Inicializamos una variable pos con el valor 0, ya que decimos primeramente
		// que el mayor es la primer componente del vector:
		pos = 0;
		float mayor;
		// Para obtener el mayor sueldo y el nombre del operario realizar los siguientes
		// pasos:
		// Inicializamos una variable mayor con la primer componente del vector sueldos:
		mayor = getSueldos()[0];
		for (int f = 1; f < getNombres().length; f++) {
			if (getSueldos()[f] > mayor) {
				mayor = getSueldos()[f]; // Almaceno el valor
				pos = f; // Almacena la posicion en el array
			}
		}
		System.out.println("El empleado con sueldo mayor es : " + getNombres()[pos]);
		System.out.println("Tiene un sueldo : " + mayor);
	}

	public String[] getNombres() {
		return nombres;
	}

	public float[] getSueldos() {
		return sueldos;
	}

}