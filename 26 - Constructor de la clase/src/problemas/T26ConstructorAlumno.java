package problemas;

import java.util.Scanner;

/**
 * Se desea guardar los sueldos de 5 operarios en un vector.
 * 
 * Realizar la creación y carga del vector en el constructor.
 * 
 * @author Rad
 */
public class T26ConstructorAlumno {

	public static void main(String[] args) {
		Alumno al = new Alumno();
		al.esMayorEdad();
		al.imprimir();
	}
}

class Alumno {

	private Scanner teclado;
	private String nombre;
	private int edad;

	public Alumno() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese edad: ");
		edad = teclado.nextInt();
	}

	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}

	public void esMayorEdad() {
		if (edad > 18) {
			System.out.print(nombre + " es mayor de edad.");
		} else {
			System.out.print(nombre + " no es mayor de edad.");
		}
	}

}