package problema;

import java.util.Scanner;

/**
 * Confeccionar una clase que solicite el ingreso de dos String y luego emplee
 * los métodos más comunes de la clase String.
 * 
 * @author Rad
 *
 */
public class T27Problema1 {

	public static void main(String[] args) {

	}
}

class Cadenas {

	private String cadena1;
	private String cadena2;
	private Scanner sc;

	public Cadenas() {
		sc = new Scanner(System.in);
		System.out.println("Cadena1 ");
		cadena1 = sc.nextLine();
		System.out.println("Cadena2 ");
		cadena2 = sc.nextLine();
	}

}