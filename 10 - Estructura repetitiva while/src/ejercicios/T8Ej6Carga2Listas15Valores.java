package ejercicios;

/**
 * Realizar un programa que permita cargar dos listas de 15 valores cada una.
 * 
 * Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor
 * (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
 * 
 * Tener en cuenta que puede haber dos o más estructuras repetitivas en un
 * algoritmo.
 * 
 * @author Rad
 *
 */
public class T8Ej6Carga2Listas15Valores {

	public static void main(String[] args) {
		int n = 0;
		int l1 = 0, l2 = 0;

		while (n++ < 16) {
			l1 += n * (int) (Math.random() * (1 + 10));
			l2 += n * (int) (Math.random() * (1 + 10));
			System.out.println("Lista 1 : " + l1 + " Lista 2 : " + l2);
		}

		if (l1 > l2) {
			System.out.println("Lista 1 es mayor : " + l1);
		} else if (l1 == l2) {
			System.out.println("Lista 1 y Lista 2 son iguales: " + l1 + " - " + l2);
		} else {
			System.out.println("Lista 2 es mayor : " + l2);
		}

		System.out.println("----------------");
		Sol6.getSol6();

	}
}

class Sol6 {

	public static void getSol6() {

		int valor, x, suma1, suma2;
		x = 1;
		suma1 = 0;
		suma2 = 0;

		System.out.println("Primer Lista");
		while (x <= 15) {
			valor = (int) (Math.random() * (1 + 100));
			System.out.println("Ingresar valor : " + valor);
			suma1 = suma1 + valor;
			x = x + 1;
		}
		System.out.println("Segunda Lista");
		x = 1;
		while (x <= 15) {
			valor = (int) (Math.random() * (1 + 100));
			System.out.println("Ingrese valor : " + valor);
			suma2 = suma2 + valor;
			x = x + 1;
		}

		if (suma1 > suma2) {
			System.out.println(" + Lista 1 mayor.");
		} else {
			if (suma2 > suma1) {
				System.out.println(" * Lista2 mayor.");
			} else {
				System.out.println(" - Listas iguales.");
			}
		}
	}
}
