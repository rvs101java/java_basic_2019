package problemas;

import java.util.Scanner;

/**
 * Se desea guardar los sueldos de 5 operarios en un vector.
 * 
 * Realizar la creación y carga del vector en el constructor.
 * 
 * @author Rad
 */
public class T26ConstructorGuardarSueldos5OperariosVector {

	public static void main(String[] args) {
		Operarios op = new Operarios();
		op.imprimir();

	}

}

class Operarios {

	private Scanner teclado;
	private int[] sueldos;

	public Operarios() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingrese valor de la componente: ");
			getSueldos()[i] = teclado.nextInt();
		}
	}

	public void imprimir() {
		int contador = 1;
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Trabajador: " + (contador++) + " Sueldo : " + sueldos[i]);
		}
		System.out.println();
	}

	public int[] getSueldos() {
		return sueldos;
	}

}