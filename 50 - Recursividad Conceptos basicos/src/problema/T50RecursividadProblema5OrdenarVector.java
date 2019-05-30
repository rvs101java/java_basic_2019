package problema;

public class T50RecursividadProblema5OrdenarVector {

	public static void main(String[] args) {

		new Recursividad().imprimir();
		new Recursividad().ordenar(Recursividad.vec, Recursividad.vec.length);
		new Recursividad().imprimir();

	}

}

class Recursividad {

	static int[] vec = { 312, 614, 88, 22, 54 };

	/**
	 * 1� Comprueba si la cantidad es mayor de 1
	 * 
	 * 2� Recorre todos los elementos
	 * 
	 * 3� Comprueba si el 1� valor del vector es mayor al 2� valor 
	 * 
	 * - Si es cierto intercambio el valor
	 * 
	 * 4� invocamos de nuevo al metodo restando 1 posicion al vector
	 * 
	 * @param v
	 * @param cant
	 */
	void ordenar(int[] v, int cant) {
		if (cant > 1) {
			for (int f = 0; f < (cant - 1); f++) {
				if (v[f] > v[f + 1]) {
					int aux = v[f];
					v[f] = v[f + 1];
					v[f + 1] = aux;
				}
			}
			ordenar(v, cant - 1);
		} // fin if
	}

	void imprimir() {
		int i = 0;
		int xi = 0;
		System.out.println("Ver elementos: ");
		while (vec.length > i) {
			System.out.println(++xi + " - " + vec[i] + " ");
			i++;
		}
	}

}