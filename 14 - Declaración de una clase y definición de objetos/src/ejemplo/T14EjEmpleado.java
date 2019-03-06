package ejemplo;

import java.util.Scanner;

public class T14EjEmpleado {

	public static void main(String[] args) {
		Empleado e = new Empleado();
		e.cargarDatos();
		e.imprimirDatos();
		e.imprimirMensaje();
		
		System.out.println("----------");
		
		Empleado1 e1 = new Empleado1();
		e1.inicializar();
		e1.pagaImpuestos();
	}
}

/**
 * @author Rad
 *
 */
class Empleado {

	private String nombre;
	private double sueldo;
	private Scanner sc;

	public void cargarDatos() {
		sc = new Scanner(System.in);
		System.out.println("Nombre Completo: ");
		nombre = sc.nextLine();
		System.out.println("Sueldo: ");
		sueldo = (int) (Math.random() * (1 + 1000) + 500);
	}

	public void imprimirDatos() {
		System.out.println("Nombre Completo del Usuario : " + nombre);
		System.out.println("Sueldo Usuario: " + sueldo);
	}

	public void imprimirMensaje() {
		String respuesta = (sueldo >= 3000) ? "+Plus en Impuestos" : "-Sin Plus por Impuestos";
		System.out.println(nombre + " - " + respuesta);
	}

}

class Empleado1 {

	private Scanner teclado;
	private String nombre;
	private float sueldo;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado");
		nombre = teclado.nextLine();

		System.out.println("Ingrese el sueldo del empleado");
		sueldo = teclado.nextFloat();
	}
	
	public void pagaImpuestos() {
		if(sueldo > 3000) {
			System.out.println("Debe abonar impuestos");
		}else {
			System.out.println("No debe abonar impuestos");
		}
	}
	
}