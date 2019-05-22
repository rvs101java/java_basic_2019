package problema1;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 22 may. 2019 - 20:23:32
 */
public class T51RecursividadConNodos {

	public static void main(String[] args) {
		RecursividadConNodos r = new RecursividadConNodos();
		r.insertarPrimero(10);
		r.insertarPrimero(4);
		r.insertarPrimero(2);
		r.insertarPrimero(3);
		r.insertarPrimero(4);
		r.insertarPrimero(6);
		r.insertarPrimero(9);
		r.insertarPrimero(8);
		r.imprimirInversa();
	}
}

/**
 * 
 * 23 may. 2019 - 0:23:46
 */
class RecursividadConNodos {

	/**
	 * Nodo de la Lista
	 */
	class Nodo {
		int info;
		Nodo sig; // Nodo 'puntero' que apunta al sig. nodo de la lista
	}

	/**
	 * Nodo para inicializar la lista
	 */
	private Nodo raiz;

	/**
	 * 
	 * @param x
	 */
	void insertarPrimero(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = raiz;
		raiz = nuevo;
	}

	/**
	 * 
	 * @param reco
	 */
	void imprimirInversa(Nodo reco) {
		if (reco != null) {
			imprimirInversa(reco.sig);
			System.out.println(" " + reco.info);
		}
	}

	/**
	 * 
	 */
	public void imprimirInversa() {
		imprimirInversa(raiz);
	}

}
