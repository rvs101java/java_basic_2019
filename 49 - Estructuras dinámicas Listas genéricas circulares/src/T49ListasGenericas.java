/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 8 may. 2019 - 20:24:14 - 10 may. 2019 -
 *         19:22:30
 */
public class T49ListasGenericas {

	public static void main(String[] args) {

		ListaCircular lc = new ListaCircular();
		lc.insertarPrimero(100);
		lc.insertarPrimero(45);
		lc.insertarPrimero(12);
		lc.insertarPrimero(4);
		System.out.println("Luego de insertar 4 nodos al principio");
		lc.imprimir();

	}
}

/**
 * Clase principal
 */
class ListaCircular {

	/**
	 * Subclase Nodo : para generar todos los nodos
	 */
	class Nodo {
		int info; // variable para guardar info.
		Nodo ant, sig; // PUNTEROS para enlazar con otros nodos
	}

	/**
	 * Puntero 'raiz' para enlazar con el 1º nodo
	 */
	private Nodo raiz;

	/**
	 * Constructor : Inicializa el puntero a ningun nodo
	 */
	public ListaCircular() {
		raiz = null;
	}

	/**
	 * 
	 * @param x
	 */
	public void insertarPrimero(int x) {
		Nodo nuevo = new Nodo(); // Creamos un nodo
		nuevo.info = x; // agregamos al nodo 1 valor a almacenar
		if (raiz == null) { // Si Nodo 'raiz' no apunta a ningun nodo
			nuevo.sig = nuevo; //
			nuevo.ant = nuevo;
			raiz = nuevo;
		} else {
			Nodo ultimo = raiz.ant;
			nuevo.sig = raiz;
			nuevo.ant = ultimo;
			raiz.ant = nuevo;
			ultimo.sig = nuevo;
			raiz = nuevo;
		}
	}

	public void insertarUltimo(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			nuevo.sig = nuevo;
			nuevo.ant = nuevo;
			raiz = nuevo;
		} else {
			Nodo ultimo = raiz.ant;
			nuevo.sig = raiz;
			nuevo.ant = ultimo;
			raiz.ant = nuevo;
			ultimo.sig = nuevo;
		}
	}

	public boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}

	public void imprimir() {
		if (!vacia()) {
			Nodo reco = raiz;
			do {
				System.out.print(reco.info + "-");
				reco = reco.sig;
			} while (reco != raiz);
			System.out.println();
		}
	}

	public int cantidad() {
		int cant = 0;
		if (!vacia()) {
			Nodo reco = raiz;
			do {
				cant++;
				reco = reco.sig;
			} while (reco != raiz);
		}
		return cant;
	}

	public void borrar(int pos) {
		if (pos <= cantidad()) {
			if (pos == 1) {
				if (cantidad() == 1) {
					raiz = null;
				} else {
					Nodo ultimo = raiz.ant;
					raiz = raiz.sig;
					ultimo.sig = raiz;
					raiz.ant = ultimo;
				}
			} else {
				Nodo reco = raiz;
				for (int f = 1; f <= (pos - 1); f++) {
					reco = reco.sig;
				}
				Nodo anterior = reco.ant;
				reco = reco.sig;
				anterior.sig = reco;
				reco.ant = anterior;
			}
		}
	}
}
