package ejemplos;

/**
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e
 * informe: El valor acumulado de todos los elementos del vector. El valor
 * acumulado de los elementos del vector que sean mayores a 36. Cantidad de
 * valores mayores a 50.
 * 
 * @author Rad
 *
 */
public class T16Ejercicio4 {

	public static void main(String[] args) {
		OrdenarElementos oe = new OrdenarElementos();
		oe.setVectores(6);
		oe.ordenarVectores();
	}
}

class OrdenarElementos {

	private static int vectorA[];

	public void setVectores(int longitud) {
		vectorA = new int[longitud];
		for (int i = 0; i < vectorA.length; i++) {
			vectorA[i] = (int) (Math.random() * (1 + 100) + 1);
			System.out.println("Vector A: " + vectorA[i]);
		}
	}

	public void ordenarVectores() {
		int intermedio;
		for (int i = 1; i < vectorA.length; i++) {
			if (vectorA[i - 1] > vectorA[i]) {
				intermedio = vectorA[i - 1];
				vectorA[i - 1] = vectorA[i];
				vectorA[i] = intermedio;
			}
		}
		verVectores(vectorA);
	}

	public void verVectores(int[] vector) {
		System.out.println("---------------------");
		for (int i = 0; i < vectorA.length; i++) {
			System.out.println("Posicion: " + vectorA[i]);
		}
	}
}
