package problemas_propuestos;

import java.util.Scanner;

/**
 * Codifique un programa que permita cargar una oración por teclado, luego
 * mostrar cada palabra ingresada en una línea distinta.
 * 
 * @author Rad
 *
 */
public class T27Ej5CargarOraciones {

	public static void main(String[] args) {

		CargarOraciones co = new CargarOraciones();
		System.out.println("Frase: " + co.getFrase());
		co.setFrase();
	}
}

class CargarOraciones {

	private Scanner sc;

	public CargarOraciones() {
		sc = new Scanner(System.in);
	}

	public String getFrase() {
		// return sc.nextLine();
		return "La mañana está fría.";
	}

	public void setFrase() {
		char c = ' ';
		String cadena = "La mañana está fría.";
		char[] caracteres = new char[getFrase().length()];
		for (int i = 0; i < cadena.length(); i++) {
			caracteres[i] = cadena.charAt(i);
			System.out.print(caracteres[i]);
			if(caracteres[i] == ' ') {
				System.out.println();
			}
		}
		System.out.println();
	}

}