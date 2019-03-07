package ejemplos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e
 * informe: El valor acumulado de todos los elementos del vector. El valor
 * acumulado de los elementos del vector que sean mayores a 36. Cantidad de
 * valores mayores a 50.
 * 
 * @author Rad
 *
 */
public class T16Ejercicio3Sol {

	public static void main(String[] args) {
		VectorSol3 pv = new VectorSol3();
		pv.cargar();
		pv.calcularPromedios();
		
	}
}

class VectorSol3 {

	private Scanner teclado;
	private int[] cursoa;
	private int[] cursob;

	public void cargar() {
		// Declaracion
		teclado = new Scanner(System.in);
		cursoa = new int[5];
		cursob = new int[5];

		//Procesamiento
		System.out.println("Carga de notas del curso A");
		for (int f = 0; f < 5; f++) {
			System.out.println("Ingrese nota: ");
			cursoa[f] = teclado.nextInt();
		}
		
		System.out.println("Carga de notas del curso B");
		for (int f = 0; f < 5; f++) {
			System.out.print("Ingrese nota: ");
			cursob[f] = teclado.nextInt();
		}
	}
	

	public void calcularPromedios() {
		int suma1 = 0;
		int suma2 = 0;

		for (int f = 0; f < 5; f++) {
			suma1 = suma1 + cursoa[f];
			suma2 = suma2 + cursob[f];
		}
		int promedioa = (suma1 / 5);
		int promediob = (suma2 / 5);
		if(promedioa > promediob) {
			System.out.println("El curso A tiene un promedio mayor.");
		}else {
			System.out.println("El curso B tiene un promedio mayor.");
		}
	}
}
