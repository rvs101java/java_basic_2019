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
			System.out.println("+ Vector A: " + vectorA[i]);
		}
	}

	public void ordenarVectores() {
		int num1 = 0;
		int num2 = 0;
		for (int i = 1; i < vectorA.length; i++) {
			if (vectorA[0] >= vectorA[i]) {
				num1 = vectorA[i];
				vectorA[i] = vectorA[0];
				vectorA[0] = num1;
			}
			for (int ii = 1; ii < vectorA.length; ii++) {
				if (vectorA[ii - 1] >= vectorA[ii]) {
					num2 = vectorA[ii - 1];
					vectorA[ii - 1] = vectorA[ii];
					vectorA[ii] = num2;
				}
			}
		}
		verVectores(vectorA);
	}

	public void verVectores(int[] vector) {
		System.out.println("---------------------");
		for (int i = 0; i < vectorA.length; i++) {
			System.out.println("- Posicion: " + vectorA[i]);
		}
	}
}
