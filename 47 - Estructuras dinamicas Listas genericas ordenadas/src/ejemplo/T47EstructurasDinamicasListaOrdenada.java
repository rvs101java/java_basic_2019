package ejemplo;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 24 abr. 2019 - 22:37:37
 */
public class T47EstructurasDinamicasListaOrdenada {

	public static void main(String[] args) {

		ListaOrdenada lo = new ListaOrdenada();
		lo.insertar(10);
		lo.insertar(5);
		lo.insertar(7);
		lo.insertar(50);
		lo.imprimir();
	}
}

/**
 * Clase Principal
 */
class ListaOrdenada {

	/**
	 * Subclase
	 */
	class Nodo {
		int info;
		Nodo sig;
	}

	/**
	 * Miembro de instancia : muchas copias del mismo nodo
	 */
	private Nodo raiz;

	/**
	 * Constructor principal inicializa nodo 'raiz'
	 */
	public ListaOrdenada() {
		raiz = null;
	}

	/**
	 * Creamos 'nodo' ya que se insertara la info en la lista
	 * 
	 * Si esta vacia , lo insertamos
	 * 
	 * Si no esta vacia la lista , verificamos si lo debemos insertar en la primera
	 * pos. de la lista(analizamos si la info a insertar es menor a lo apuntado por
	 * raiz en el campo info)
	 * 
	 * @param x
	 */
	void insertar(int x) {
		Nodo nuevo = new Nodo(); // Creamos el nodo "nuevo"
		nuevo.info = x; // Almacenamos valor pasado por parametro
		if (raiz == null) { // nodo 'raiz' no apunta a ningun 'nodo' sig.
			raiz = nuevo; // nodo 'raiz' apunta al sig nodo 'nuevo'
		} else {
			if (x < raiz.info) { // Comprueba el valor por parametro es menor que valor almacenado nodo 'raiz'
				nuevo.sig = raiz; // nodo 'nuevo.sig' almacena pos. nodo 'raiz'
				raiz = nuevo; // nodo 'raiz' apunta al sig. nodo
			} else { // parametro pasado es mayor que el que tiene nodo 'raiz' almacenado
				Nodo reco = raiz; // Creamos nuevo nodo 'reco' que almacena pos 'raiz'
				Nodo atras = raiz; // Creamos nuevo nodo 'atras' que almacena pos 'raiz'
				while ((x >= reco.info) && (reco.sig != null)) { // valor 'x' mayor que info nodo 'reco' y nodo
																	// 'reco.sig' tiene más elementos
					atras = reco; // nodo 'atras' apunta al nodo sig.
					reco = reco.sig; // nodo reco apunta al nodo sig
				}
				if (x >= reco.info) { // valor 'x' es mayor nodo 'reco.info'
					reco.sig = nuevo; // nodo 'reco.sig' apunta a 'nuevo'
				} else { // sino
					nuevo.sig = reco; // nodo 'nuevo.sig' apunta a nodo 'reco'
					atras.sig = nuevo; // nodo 'atras.sig' apunta a nodo 'nuevo'
				}
			}
		}
	}

	/**
	 * Mostrar valores de los nodos
	 */
	public void imprimir() {
		Nodo reco = raiz; // nodo 'reco' almacena pos 'raiz' para poder recorrer la Pila
		while (reco != null) { // nodo 'reco' apunta a otros nodos
			System.out.println(reco.info + "-"); // mostrar valores
			reco = reco.sig; // nodo 'reco.sig' apunta al sig. nodo y se almacena en nodo 'reco'
		}
		System.out.println();
	}

}
