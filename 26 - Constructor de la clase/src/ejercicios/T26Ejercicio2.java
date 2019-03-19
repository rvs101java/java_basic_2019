package ejercicios;

import java.util.Scanner;

/**
 * Implementar la clase operaciones.
 * 
 * Se deben cargar dos valores enteros en el constructor, calcular su suma,
 * resta, multiplicación y división, cada una en un método, imprimir dichos
 * resultados.
 * 
 * @author Rad
 *
 */
public class T26Ejercicio2 {

	public static void main(String[] args) {

		Operaciones op = new Operaciones();
		op.getOperaciones();
	}
}

class Operaciones {

	private int valor1;
	private int valor2;
	private Scanner sc;

	public Operaciones() {
		sc = new Scanner(System.in);
		System.out.println("Introduce 1º entero: ");
		valor1 = sc.nextInt();
		System.out.println("Introduce 2º entero: ");
		valor2 = sc.nextInt();
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getSuma() {
		return (valor1 + valor2);
	}

	public int getResta() {
		return (valor1 - valor2);
	}

	public int getMutiplicacion() {
		return (valor1 * valor2);
	}

	public int getDivision() {
		return (valor1 / valor2);
	}

	public void getOperaciones() {
		System.out.println("Suma: " + getSuma());
		System.out.println("Restar: " + getResta());
		System.out.println("Multiplicacion: " + getMutiplicacion());
		System.out.println("Division: " + getDivision());
	}

}