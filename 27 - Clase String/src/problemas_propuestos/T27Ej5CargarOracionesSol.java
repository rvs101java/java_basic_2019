package problemas_propuestos;

import java.util.Scanner;

/**
 * Codifique un programa que permita cargar una oración por teclado, luego
 * mostrar cada palabra ingresada en una línea distinta.
 * 
 * @author Rad
 *
 */
public class T27Ej5CargarOracionesSol {

	public static void main(String[] args) {
		CargarOracionesSol cos = new CargarOracionesSol();
		cos.imprimir();
	}
}

class CargarOracionesSol {

	private Scanner teclado;
	private String oracion;

	public CargarOracionesSol() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese oracion: ");
		oracion = teclado.nextLine();
	}

	public void imprimir() {
		for (int f = 0; f < oracion.length(); f++) {
			if (oracion.charAt(f) == ' ') {
				System.out.println();
			} else {
				System.out.print(oracion.charAt(f));
			}
		}
	}
	
	
}