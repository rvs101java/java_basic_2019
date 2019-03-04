package ejercicios;

/**
 * Desarrollar un programa que permita cargar n números enteros y luego nos
 * informe cuántos valores fueron pares y cuántos impares. Emplear el operador
 * ?%? en la condición de la estructura condicional:
 * 
 * @author Rad
 *
 */
public class T8Ej7ParesImpares {

	public static void main(String[] args) {

		int numeros = (int) (Math.random() * (1 + 100) + 1);

		int num = 0;
		while (num++ < numeros) {
			System.out.print((((num % 2) == 0) ? "- ImPar" : "+ Par"));
			System.out.println(" - Numero: " + num);
		}
		System.out.println("Numero Generado es : " + numeros);
	}
}
