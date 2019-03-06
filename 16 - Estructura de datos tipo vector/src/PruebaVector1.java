
import java.util.Scanner;

public class PruebaVector1 {

	private Scanner teclado;
	private int[] sueldo;

	public void cargar() {
		teclado = new Scanner(System.in);
		sueldo = new int[6];
		System.out.println("Longitud total: " + sueldo.length);

		for (int f = 1; f < sueldo.length; f++) {
			System.out.println("Ingrese valor de la componente");
			sueldo[f] = teclado.nextInt();
		}
	}

	public void imprimir() {
		for (int f = 1; f < sueldo.length; f++) {
			System.out.println(f + " - " + sueldo[f]);
		}
	}

	public static void main(String[] args) {
		PruebaVector1 pv1 = new PruebaVector1();
		pv1.cargar();
		pv1.imprimir();

	}
}
