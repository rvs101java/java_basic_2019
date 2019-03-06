package ejercicios;

/**
 * Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44,
 * etc. (No se ingresan valores por teclado)
 * 
 * @author Rad
 *
 */
public class T8Ej4Imprimir25Terminos {

	public static void main(String[] args) {

		int n = 0;
		int nObj = 0;

		while (n++ <= 25) {
			nObj += 11;
			System.out.println(n + " - " + nObj);
		}

		Sol4.getSol4();

	}
}

class Sol4 {

	public static void getSol4() {
		int x, termino;
		x = 1;
		termino = 11;
		while (x <= 25) {
			System.out.println(termino);
			System.out.println(" - ");
			x = x + 1;
			termino = termino + 11;
		}
	}
}
