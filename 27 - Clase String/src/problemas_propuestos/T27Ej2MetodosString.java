package problemas_propuestos;

import java.util.Scanner;

/**
 * Cargar un String por teclado e implementar los siguientes métodos:
 * 
 * a)Imprimir la primera mitad de los caracteres de la cadena.
 * 
 * b) Imprimir el último caracter.
 * 
 * c) Imprimirlo en forma inversa.
 * 
 * d) Imprimir cada caracter del String separado con un guión.
 * 
 * e) Imprimir la cantidad de vocales almacenadas.
 * 
 * f) Implementar un método que verifique si la cadena se lee igual de izquierda
 * a derecha tanto como de derecha a izquierda (ej. neuquen se lee igual en las
 * dos direcciones)
 * 
 * @author Rad
 *
 */
public class T27Ej2MetodosString {

	public static void main(String[] args) {
		MetodosString ms = new MetodosString();
		ms.getMitadCadena();
		ms.getUltimoCaracter();
		ms.getCadenaInvertida();
		ms.setAgregarGuion();
		ms.setAgregarGuion2();
		ms.getVocales();
	}
}

class MetodosString {

	private String cadena;
	private Scanner sc;

	public MetodosString() {
		sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		cadena = "asd1";
	}

	public String getCadena() {
		return cadena;
	}

	/**
	 * a)Imprimir la primera mitad de los caracteres de la cadena.
	 */
	public void getMitadCadena() {
		String cadena;
		cadena = getCadena().substring(0, (getCadena().length() / 2));
		System.out.println(cadena);
	}

	/**
	 * b) Imprimir el último caracter.
	 */
	public void getUltimoCaracter() {
		System.out.println("Ultimo elemento: " + getCadena().charAt(getCadena().length() - 1));
	}

	/**
	 * c) Imprimirlo en forma inversa.
	 */
	public void getCadenaInvertida() {
		char[] cadena = new char[getCadena().length()];

		for (int i = 0; i < getCadena().length(); i++) {
			cadena[i] = getCadena().charAt(i);
			System.out.print(cadena[i]);
		}

		System.out.println("\n--------");

		for (int c = cadena.length - 1; c >= 0; c--) {
			System.out.print(cadena[c]);
		}
		System.out.println();
	}

	public void setAgregarGuion() {
		char letra = 0;
		String palabra = "";
		for (int i = 0; i < getCadena().length(); i++) {
			letra = getCadena().charAt(i);
			palabra += ("-".concat(String.valueOf(letra)));
		}
		System.out.println(palabra);
	}

	public void setAgregarGuion2() {
		String cadena = "";
		for (int i = 0; i < getCadena().length(); i++) {
			cadena += (getCadena().substring(i, i + 1).concat("-"));
		}
		System.out.println(cadena);
	}

	public void getVocales() {
		int contador = 0;
		String cadena = "";
		for (int i = 0; i < getCadena().length(); i++) {
			if (getCadena().charAt(i) == 'a') {
				cadena += ("".concat(cadena.concat(String.valueOf('a'))));
				contador++;
			}
			if (getCadena().charAt(i) == 'e') {
				cadena += ("".concat(cadena.concat(String.valueOf('e'))));
				contador++;
			}
			if (getCadena().charAt(i) == 'i') {
				cadena += ("".concat(cadena.concat(String.valueOf('i'))));
				contador++;
			}
			if (getCadena().charAt(i) == 'o') {
				cadena += ("".concat(cadena.concat(String.valueOf('o'))));
				contador++;
			}
			if (getCadena().charAt(i) == 'u') {
				cadena += ("".concat(cadena.concat(String.valueOf('u'))));
				contador++;
			}
		}
		System.out.println("cadena: " + cadena + " contador: " + contador);
	}
}