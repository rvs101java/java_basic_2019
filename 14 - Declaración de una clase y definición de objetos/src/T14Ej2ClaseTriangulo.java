
import java.util.Scanner;

public class T14Ej2ClaseTriangulo {

	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo();
		triangulo1.inicializar();
		triangulo1.ladoMayor();
		triangulo1.esEquilatero();
	}
}

class Triangulo {

	private int lado1, lado2, lado3;
	private Scanner teclado;

	/**
	 * 
	 */
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.print("Medida lado 1: ");
		lado1 = teclado.nextInt();

		System.out.print("Medida lado 2: ");
		lado2 = teclado.nextInt();

		System.out.print("Medida lado 3: ");
		lado3 = teclado.nextInt();
	}

	/**
	 * 
	 */
	public void ladoMayor() {
		System.out.println("Lado Mayor");
		if ((lado1 > lado2) && (lado1 > lado3)) {
			System.out.println(lado1);
		} else {
			if (lado2 > lado3) {
				System.out.println(lado2);
			} else {
				System.out.println(lado3);
			}
		}
	}

	/**
	 * 
	 */
	public void esEquilatero() {
		if ((lado1 == lado2) && (lado1 == lado3)) {
			System.out.println("Es un triangulo equilatero");
		} else {
			System.out.println("No es un triangulo equilatero");
		}
	}
}