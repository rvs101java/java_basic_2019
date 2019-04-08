package ejercicio;

public class T20OrdenarEnteros {

	public static void main(String[] args) {

		EnterosMenorMayor e1 = new EnterosMenorMayor();
		e1.imprimir();
		e1.getOrdenar();
		e1.imprimir();
		System.out.println("-----##-----");
		EnterosMayorMenor e2 = new EnterosMayorMenor();
		e2.getImprimir();
		e2.getOrdenInverso();
		e2.getImprimir();
	}
}

class EnterosMenorMayor {

	private String[] numeros = { "g5", "h1", "b4", "d8", "a4", "c7" };

	public int getTotalNumeros() {
		return numeros.length;
	}

	public String[] getNumeros() {
		return numeros;
	}

	public void getOrdenar() {
		String aux;
		System.out.println("- Total numeros : " + (getTotalNumeros()));
		// Quitamos un elemento al maximo para que pueda avanzar en la ordenación de los
		// elementos
		for (int k = 0; k < (getTotalNumeros() - 1); k++) {
			for (int f = 0; f < ((getTotalNumeros() - 1) - k); f++) {
				if ((getNumeros()[f].compareTo(getNumeros()[f + 1]) > 0)) {
					aux = getNumeros()[f];
					getNumeros()[f] = getNumeros()[f + 1];
					getNumeros()[f + 1] = aux;
				}
			}
		}
	}

	public void imprimir() {
		System.out.println("- Numeros ordenados alfabéticamente");
		int c = 0;
		for (int f = 0; f < getNumeros().length; f++) {
			System.out.println(++c + " - " + getNumeros()[f]);
		}
	}
}

class EnterosMayorMenor {

	private String[] numeros = { "g5", "h1", "b4", "d8", "a4", "c7" };

	private String[] getNumeros() {
		return numeros;
	}

	public void getImprimir() {
		System.out.println("- Numeros Alfanumericos - ");
		int c = 0;
		for (int f1 = 0; f1 < getNumeros().length; f1++) {
			System.out.println(++c + " - " + getNumeros()[f1]);
		}
	}

	public void getOrdenInverso() {
		System.out.println("- Numeros ordenados de forma inversa - ");
		System.out.println("- Longitud : " + numeros.length);
		String aux;
		for (int f1 = (numeros.length - 1); f1 >= 0; f1--) {
			for (int f2 = (f1 - 1); f2 >= 0; f2--) {
				// Da igual el orden lo importante es el algoritmo de ordenacion
				if (numeros[f2 + 1].compareTo(numeros[f2]) > 0) {
					aux = numeros[f2];
					numeros[f2] = numeros[f2 + 1];
					numeros[f2 + 1] = aux;
				}
			}
		}
	}
}
