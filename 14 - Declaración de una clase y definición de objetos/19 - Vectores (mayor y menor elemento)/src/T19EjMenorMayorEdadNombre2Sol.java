import java.util.Scanner;

public class T19EjMenorMayorEdadNombre2Sol {

	public static void main(String[] args) {

		Sol2 so = new Sol2();
		so.cargar();
		so.menorElemento();
		so.repiteMenor();
	}
}

/**
 * Confeccionar un programa que permita cargar los nombres de 5 operarios y sus
 * sueldos respectivos.
 * 
 * Mostrar el sueldo mayor y el nombre del operario.
 * 
 * @author Rad
 *
 */

class Sol2 {

	private Scanner teclado;
	private int[] vec;
	private int menor;

	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos tiene el vector");
		int n = teclado.nextInt();
		vec = new int[n];
		for (int f = 0; f < vec.length; f++) {
			System.out.println("Ingrese componente: ");
			vec[f] = teclado.nextInt();
		}
	}

	public void menorElemento() {
		menor = vec[0];
		for (int f = 1; f < vec.length; f++) {
			if (vec[f] < menor) {
				menor = vec[f];
			}
		}
		System.out.println("La suma de los elementos es : " + menor);
	}

	public void repiteMenor() {
		int cant = 0;
		for (int f = 0; f < vec.length; f++) {
			if (vec[f] == menor) {
				cant++;
			}
		}
		if(cant > 1) {
			System.out.println("Se repite el menor en el vector.");
		}else {
			System.out.println("Se repite el mayor en el vector.");
		}
	}
}