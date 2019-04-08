package problemas_propuestos;

import java.util.Scanner;

import javax.swing.plaf.FontUIResource;

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
		ms.getPalidromo();
		ms.getPalidromo2();

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
		System.out.println("Invertir Array ");
		char[] cadena = new char[getCadena().length()];

		for (int i = 0; i < getCadena().length(); i++) {
			cadena[i] = getCadena().charAt(i);
			System.out.print(cadena[i]);
		}

		System.out.println("\n--------");
		System.out.println("Array Invertido");

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

	/**
	 * f) Implementar un método que verifique si la cadena se lee igual de izquierda
	 * a derecha tanto como de derecha a izquierda (ej. neuquen se lee igual en las
	 * dos direcciones)
	 * 
	 */
	public void getPalidromo() {
		System.out.println("# Obtener Palidromo 1º");
		String cadena = "neuquen";
		System.out.println("Longitud total: " + cadena.length());
		int cN = (cadena.length() - 1);
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == cadena.charAt(cN)) {
				System.out.println(cadena.charAt(i) + " - " + cadena.charAt(cN));
			}
			cN--;
		}
	}

	public void getPalidromo2() {
		System.out.println("# Obtener Palidromo 2º");
		String cadena1 = "perro";
		String cadena2 = "";
		System.out.println("# Longitud total: " + cadena1.length());

		char[] caracteres = new char[cadena1.length()];
		char[] caracteres2 = new char[cadena1.length()];

		for (int i = 0; i < cadena1.length(); i++) {
			caracteres[i] = cadena1.charAt(i);
		}

		System.out.println("-----------------");
		System.out.println("# Invertir valores");
		System.out.println("-----------------");
		int cInvertido = 0;

		for (int i = caracteres.length - 1; i >= 0; i--) {
			caracteres2[i] = caracteres[cInvertido];
			System.out.println(caracteres2[i] + " indice: " + i + " Invertido: " + caracteres[cInvertido] + " indice: "
					+ cInvertido);
			cInvertido++;
		}
 
		System.out.println("-----------------");
		cadena2 = String.valueOf(caracteres2);
		System.out.println(((cadena1.compareTo(cadena2) == 0) ? "Iguales" : "No Iguales"));

	}
}