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
public class T27Ej2MetodosStringSol {

	public static void main(String[] args) {
		MetodosString2 ms = new MetodosString2();
		ms.primerMitad();
		ms.ultimoCaracter();
		ms.formaInversa();
		ms.conGuion();
		ms.cantidadVocales();
		ms.esCapicua();
		
		
	}
}

class MetodosString2 {

	private String cad;
	private Scanner teclado;

	public MetodosString2() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese una cadena");
		cad = teclado.nextLine();
	}

	public void primerMitad() {
		String parte = "";
		parte = cad.substring(cad.length() / 2);
		System.out.println("Primer mitad de caracteres: " + parte);
	}

	public void ultimoCaracter() {
		char ultimo = cad.charAt(cad.length() - 1);
		System.out.println("Ultimo caracter: " + ultimo);
	}

	public void formaInversa() {
		System.out.println("Impresion en forma inversa: ");
		for (int i = (cad.length() - 1); i >= 0; i--) {
			System.out.print(cad.charAt(i));
		}
		System.out.println();
	}

	public void conGuion() {
		System.out.println("Separado por guiones");
		for (int f = 0; f < cad.length(); f++) {
			System.out.print(cad.charAt(f) + "-");
		}
		System.out.println();
	}

	public void cantidadVocales() {
		int cant = 0;
		int canta = 0;
		int cante = 0;
		int canti = 0;
		int canto = 0;
		int cantu = 0;
		char[] vocales = new char[] { 'a', 'A', 'e', 'E', 'o', 'O', 'u', 'U', 'i', 'I', };
		char[] vocalesEncontradas = new char[cad.length()];
		System.out.println("Separado por guiones");
		for (int f = 0; f < vocales.length; f++) {
			for (int c = 0; c < cad.length(); c++) {
				if (vocales[f] == cad.charAt(c)) {
					System.out.print(vocales[f] + " ");
					vocalesEncontradas[f] = vocales[f];
					cant++;
					if ('a' == cad.toLowerCase().charAt(c)) {
						canta++;
					}
					if ('e' == cad.toLowerCase().charAt(c)) {
						cante++;
					}
					if ('i' == cad.toLowerCase().charAt(c)) {
						canti++;
					}
					if ('o' == cad.toLowerCase().charAt(c)) {
						canto++;
					}
					if ('u' == cad.toLowerCase().charAt(c)) {
						cantu++;
					}
				}
			}
		}
		System.out.println("\nTotal vocales: " + cant);
		System.out.println("Total vocales a: " + canta);
		System.out.println("Total vocales e : " + cante);
		System.out.println("Total vocales i : " + canti);
		System.out.println("Total vocales o : " + canto);
		System.out.println("Total vocales u : " + cantu);
	}

	public void esCapicua() {
		int cant = 0;
		for (int f = 0; f < (cad.length() / 2); f++) {
			if (cad.charAt(f) == (cad.charAt(cad.length() - 1 - f))) {
				cant++;
			}
		}
		if (cant == cad.length() / 2) {
			System.out.println("Es capicua la cadena " + cad);
		} else {
			System.out.println("No es capicua la cadena " + cad);
		}
	}

}
