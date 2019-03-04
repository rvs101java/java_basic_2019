package ejercicios;

/**
 * Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 -
 * 16 - 24, etc.
 * 
 * @author Rad
 *
 */
public class T8Ej5Multiplos8hasta500 {

	public static void main(String[] args) {

		int n = 0;
		while (n++ <= 500) {
			System.out.println(8 * n);
		}

	}
}

class Sol5 {

	public static void getSol4() {
		System.out.println(" ------------------");
		int mult8;
		mult8 = 8;
		while (mult8 <= 500) {
			System.out.println(mult8);
			System.out.println(" - ");
			mult8 = mult8 + 8;
		}
		System.out.println("Obtener multiplos : " + mult8);
	}
}