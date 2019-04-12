package ejercicios;

public class T40RetornarCantidadNodosVacia {

	public static void main(String[] args) {
		Pila pila1 = new Pila();
		pila1.insertar(10);
		pila1.insertar(40);
		pila1.insertar(3);
		pila1.imprimir();
		System.out.println("La cantidad de nodos de la lista es: " + pila1.cantidad());
		pila1.vacia();
		System.out.println();

	}
}

class Pila {

	class Nodo {
		int info;
		Nodo sig;
	}

	private Nodo raiz;

	Pila() {
		raiz = null;
	}

	/**
	 * 
	 * @param x
	 */
	public void insertar(int x) {
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			nuevo.sig = null;
			raiz = nuevo;
		} else {
			nuevo.sig = raiz;
			raiz = nuevo;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int extraer() {
		if (raiz != null) {
			int informacion = raiz.info;
			raiz = raiz.sig;
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * 
	 */
	public void imprimir() {
		Nodo reco = raiz;
		System.out.println("Listado de  todos los elementos de la pila");
		while (reco != null) {
			System.out.println(reco.info + " - ");
			reco = reco.sig;
		}
		System.out.println();
	}

	/**
	 * Si 'raiz' apunta a 'null' esta vacia
	 * 
	 * @return
	 */
	public boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *  Si 'raiz' = 'recorrer' tiene una referencia
	 *  
	 * @return
	 */
	public int cantidad() {
		int cant = 0;
		Nodo recorrer = raiz;
		while (recorrer != null) {
			cant++;
			recorrer = recorrer.sig;
		}
		return cant;
	}

}