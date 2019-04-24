package ejemplo;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 24 abr. 2019 - 21:47:16
 */
public class T41RetornarCantidadNodosVacia {

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

/**
 * Clase Principal
 */
class Pila {

	/**
	 * Subclase Nodo
	 */
	class Nodo {
		int info;
		Nodo sig;
	}

	/**
	 * Miembro de instancia : Crea un nodo 'raiz' que sera el nodo de inicio
	 */
	private Nodo raiz;

	/**
	 * Constructor inicializa nodo raiz
	 */
	Pila() {
		raiz = null;
	}

	/**
	 * Insertamos nodos a la Pila de 'nodos'
	 * 
	 * @param x
	 */
	public void insertar(int x) {
		Nodo nuevo = new Nodo(); // Creamos un nodo 'nuevo'
		nuevo.info = x; // nodo 'nuevo' almacena valor dentro de 'info' atributo de instancia
		if (raiz == null) { // Utilizamos el atributo 'raiz' para comprobar si es el principio 'si es null
							// es principio
			nuevo.sig = null; // nodo 'nuevo' apunta al siguiente nodo
			raiz = nuevo; // nodo 'raiz' apunta a 'nuevo'
		} else { // sino nodo 'raiz' ya apunta a un nodo
			// Mecanismo para agregar nodos a la Pila
			nuevo.sig = raiz; // nodo 'nuevo.sig' apunta al nodo 'raiz'
			raiz = nuevo; // nodo 'raiz' apunta a 'nuevo'
		}
	}

	/**
	 * Extraer elementos de la Pila de 'nodos'
	 * 
	 * @return
	 */
	public int extraer() {
		if (raiz != null) { // nodo 'raiz' apunta a otro nodo
			int informacion = raiz.info; // Almacenamos el valor del 'nodo'
			raiz = raiz.sig; // nodo 'raiz' apunta al sig. nodo para que el nodo 'raiz' desaparezca
			return informacion; // devuelve el nodo
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * Mostrar info
	 */
	public void imprimir() {
		Nodo reco = raiz; // nodo 'reco' almacena la pos. de memoria de nodo 'raiz' 
		System.out.println("Listado de  todos los elementos de la pila");
		while (reco != null) { // nodo 'reco' apunta a otros nodos
			System.out.println(reco.info + " - ");
			reco = reco.sig; // nodo 'reco' apunta al sig. nodo
		}
		System.out.println();
	}

	/**
	 * Si 'raiz' apunta a 'null' esta vacia
	 * 
	 * @return
	 */
	public boolean vacia() {
		if (raiz == null) { // nodo 'raiz' apunta a null porque no hay nodo que continue
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Si 'raiz' = 'recorrer' tiene una referencia
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