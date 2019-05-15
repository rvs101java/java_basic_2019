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
		lc.insertarUltimo(250);
		lc.insertarUltimo(7);
		System.out.println("Luego de insertar 2 nodos al final");
		lc.imprimir();
		System.out.println("Cantidad de nodos:" + lc.cantidad());
		System.out.println("Luego de borrar el de la primer posición:");
		lc.borrar(1);
		lc.imprimir();
		System.out.println("Luego de borrar el de la cuarta posición:");
		lc.borrar(4);
		lc.imprimir();
	}
}

/**
 * Clase principal
 */
class ListaCircular {

	/**
	 * Puntero 'raiz' para enlazar con el 1º nodo
	 * 
	 * 'raiz' apunta a 'null'
	 */
	private Nodo raiz;

	/**
	 * Subclase Nodo : para generar todos los nodos
	 * 
	 * 'ant' 'sig' apunta a 'null'
	 */
	class Nodo {
		int info; // variable para guardar info.
		Nodo ant, sig; // PUNTEROS 'ant' y 'sig' para enlazar con otros nodos
	}

	/**
	 * Constructor : Inicializa el puntero a ningun nodo
	 */
	public ListaCircular() {
		raiz = null; // No apunta a ningun sitio
	}

	/**
	 * @param valor
	 *            - Indicamos el valor
	 */
	public void insertarPrimero(int valor) {
		Nodo nuevo = new Nodo(); // Creamos un nuevo nodo para la lista
		nuevo.info = valor; // Dentro de la lista añadimos el nodo 'nuevo' con un valor almacenado 'info'
		/*
		 * Lista vacia - puntero sig y ant apunta asi mismo - debe circular - raiz
		 * apunta nodo creado
		 */
		if (raiz == null) { // Puntero 'raiz' no apunta a ningun sitio
			nuevo.sig = nuevo;
			nuevo.ant = nuevo;
			raiz = nuevo;
		} else {
			Nodo ultimo = raiz.ant; // Lista no vacia disponemos puntero al final de la lista
									// (puntero 'ant' del primer 'nodo' tiene dicha direccion)
			nuevo.sig = raiz; // El nodo a insertar lo enlazamos previo al nodo apuntado por raiz
			nuevo.ant = ultimo;
			raiz.ant = nuevo;
			ultimo.sig = nuevo;
			// 'raiz' apunte al nodo creado despues de crear todos los enlaces
			raiz = nuevo;
		}
	}

	/**
	 * Creamos un nodo en la ultima posicion de la lista con un valor
	 * 
	 * @param x
	 */
	public void insertarUltimo(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			nuevo.sig = nuevo; // null
			nuevo.ant = nuevo; // null
			raiz = nuevo; // apunta al nodo 'nuevo'
		} else {
			Nodo ultimo = raiz.ant; // null
			nuevo.sig = raiz;
			nuevo.ant = ultimo;
			raiz.ant = nuevo;
			ultimo.sig = nuevo;
		}
	}

	/**
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
	 * 
	 */
	public void imprimir() {
		int pos = 0;
		System.out.println("-- Mostrar los numeros -- ");
		if (!vacia()) { // Si la lista no esta vacia - puntero al primer nodo
			Nodo reco = raiz; // Puntero apunta al 1º nodo
			do {
				System.out.println(++pos + " - " + reco.info + "-");
				reco = reco.sig;
			} while (reco != raiz); // puntero reco sea distinto a raiz (es decir que no haya dado toda la vuelta a
									// la lista)
			System.out.println();
		}
	}

	/**
	 * 
	 * @return devuelve la cantidad de 'nodos'
	 */
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

	/**
	 * Pasamos por parametro la posición del 'nodo' para eliminarlo
	 * 
	 * @param pos
	 */
	public void borrar(int pos) {
		if (pos <= cantidad()) {
			if (pos == 1) {
				if (cantidad() == 1) { // Si es el primero y el único de la lista hacemos que raiz apunte a null
					raiz = null;
				} else {
					// Si no disponemos un puntero al final de la lista,
					// avanzamos raiz y enlazamos
					// el último nodo con el segundo de la lista:
					Nodo ultimo = raiz.ant;
					raiz = raiz.sig; // avanzar raiz
					ultimo.sig = raiz;
					raiz.ant = ultimo;
				}
			} else {
				// borrar un nodo que se encuentra en medio de la lista o final
				// recorrer for hasta el nodo que queremos borrar y disponemos un puntero en el
				// nodo anterior y otro puntero en el nodo siguiente
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
