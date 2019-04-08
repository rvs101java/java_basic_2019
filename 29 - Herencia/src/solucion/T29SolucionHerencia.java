package solucion;

import java.util.Scanner;

public class T29SolucionHerencia {

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		persona1.cargarDatosPersonales();
		
		Empleado empleado1 = new Empleado();
		empleado1.cargarDatosPersonales();
		empleado1.cargarSueldos();
		
		persona1.imprimirDatosPersonales();
		empleado1.imprimirDatosPersonales();
		empleado1.imprimirSueldo();

	}
}

class Persona {

	private Scanner teclado;
	private String nombre;
	private int edad;

	public Persona() {
		teclado = new Scanner(System.in);
	}

	public void cargarDatosPersonales() {
		System.out.println("Ingrese el nombre");
		nombre = teclado.next();
		System.out.println("Ingrese edad:");
		edad = teclado.nextInt();
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public Scanner getScanner() {
		return teclado;
	}

	public void imprimirDatosPersonales() {
		System.out.println("Nombre: " + getNombre() + " Edad: " + getEdad());
	}

}

class Empleado extends Persona {

	protected int sueldo;

	public Empleado() {
		setSueldo();
	}

	public void setSueldo() {
		System.out.println("Ingrese su sueldo 2:");
		this.sueldo = getScanner().nextInt();
	}

	public int cargarSueldos() {
		return sueldo;
	}

	public void imprimirSueldo() {
		System.out.println("El sueldo es : " + cargarSueldos());
	}

}
