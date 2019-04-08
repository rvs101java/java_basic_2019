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

		Cadenas c = new Cadenas();
		String cadena1 = c.getCadena1();
		System.out.println(cadena1);
		String cadena2 = c.getCadena2();
		System.out.println(cadena2);
		c.getTodosMetodos();
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

	public String getCadena1() {
		return cadena1;
	}

	public String getCadena2() {
		return cadena2;
	}

	public void getTodosMetodos() {
		if (getCadena1().equals(getCadena2()) == true) {
			System.out.println(getCadena1() + " es exactamente igual a " + getCadena2());
		} else {
			System.out.println(getCadena1() + " no es exactamente igual a " + getCadena2());
		}

		if (getCadena1().equalsIgnoreCase(getCadena2()) == true) {
			System.out.println(getCadena1() + " es igual a " + getCadena2() + " sin tener en cuenta mayus/minus");
		} else {
			System.out.println(getCadena1().concat("no es igual a " + getCadena2() + "sin tener cuenta mayus/minus"));
		}
		if (getCadena1().compareTo(getCadena2()) == 0) {
			System.out.println(getCadena1() + " es exactamente igual a : " + getCadena2());
		} else {
			if (getCadena1().compareTo(getCadena2()) > 0) {
				System.out.println(getCadena1() + " es mayor alfabeticamente que " + getCadena2());
			} else {
				System.out.println(getCadena2() + " es mayor alfabeticamente que " + getCadena1());
			}
		}

		char carac1 = getCadena1().charAt(0);
		System.out.println("El primer caracter de " + getCadena1() + " es " + carac1);
		int longitud = getCadena1().length();
		System.out.println("La longitud de caracteres es de : " + getCadena1() + " es " + longitud);
		String cad3 = getCadena1().substring(0, 3);
		System.out.println("Los primeros tres caracteres de " + getCadena1() + " son " + cad3);
		int posi = getCadena1().indexOf(getCadena2());
		if (posi == 1) {
			System.out.println(getCadena2() + " no esta contenido en " + getCadena1());
		} else {
			System.out.println(getCadena2() + " no esta contenido en " + getCadena2());
		}
		System.out.println(getCadena1() + " convertido a mayus en " + getCadena1().toUpperCase());
		System.out.println(getCadena2() + " convertido a mayus en " + getCadena2().toUpperCase());
	}

}