/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 14 abr. 2019 - 20:40:16
 */
public class T44EjemploCola {

	public static void main(String[] args) {

		Cola cola1 = new Cola();
		cola1.insertar(5);
		cola1.insertar(10);
		cola1.insertar(50);
		cola1.imprimir();
		System.out.println("Extraemos uno de los elementos de la cola: " + cola1.extraer());
		cola1.imprimir();
	}
}

/**
 * Clase principal
 */
class Cola {

	/**
	 * SubClase
	 */
	class Nodo {
		int info; // almacena el valor
		Nodo sig; // Cada vez que se declara un objeto se crea otro objeto que almacena
					// ref/puntero al objeto
	}

	/**
	 * Variables de instancia almacenan los punteros del principio y final de la
	 * Queue
	 */
	private Nodo raiz, fondo;

	/**
	 * Constructor de la clase Principal
	 */
	public Cola() {
		raiz = null;
		fondo = null;
	}

	/**
	 * 
	 * @return primer objeto/nodo apunto a null devuelve true sino devuelve false
	 *         porque tiene una referencia
	 */
	boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param info
	 */
	void insertar(int info) {
		Nodo nuevo = new Nodo(); // creamos nuevo nodo 'puntero/ref'
		nuevo.info = info; // almacenamos en el nodo 'puntero' el valor
		nuevo.sig = null; // almacenamos la posicion del nodo 'null'
		if (vacia()) { // si cola esta vacia 'nuevo' es tanto principio como cola
			raiz = nuevo; // Nodo 'raiz'
			fondo = nuevo; // Nodo 'fondo'
		} else { // sino nodo 'fondo' tiene una ref a 'nuevo'
			fondo.sig = nuevo;
			fondo = nuevo; // fondo apunta
		}
	}

	int extraer() {
		if (!vacia()) { // si 'raiz' esta vacia cambia su condicion y da 'error' falso
			int informacion = raiz.info; // obtengo el valor de la 'raiz'
			if (raiz == fondo) { // 'raiz' y 'fondo' tiene una misma 'ref'
				raiz = null;
				fondo = null;
			} else {
				raiz = raiz.sig;
			}
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	public void imprimir() {
		Nodo reco = raiz;
		System.out.println("Listado de todos los elementos de la cola");
		while (reco != null) {
			System.out.println(reco.info + " - ");
			reco = reco.sig;
		}
		System.out.println();
	}

}
