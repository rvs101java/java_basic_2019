package ejemplos;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 25 abr. 2019 - 21:11:09
 */
public class ListaGenericaDoblementeEnlazadas {

	public static void main(String[] args) {

		ListaGenericas lg = new ListaGenericas();
		lg.insertar(1, 10);
		lg.insertar(2, 20);
		lg.insertar(3, 30);
		lg.insertar(2, 15);
		lg.insertar(1, 115);
		lg.imprimir();
		System.out.println("Luego de Borrar el primero");
		lg.borrar(1);
		lg.imprimir();
		System.out.println("Luego de Extraer el segundo");
		lg.extraer(2);
		lg.imprimir();
		System.out.println("Luego de Intercambiar el primero con el tercero");
		lg.intercambiar(1, 3);
		lg.imprimir();
		if (lg.existe(20)) {
			System.out.println("Se encuentra el 20 en la lista");
		} else {
			System.out.println("No se encuentra el 20 en la lista");
		}
		if (lg.ordenada()) {
			System.out.println("La lista esta ordenada de menor a mayor");
		} else {
			System.out.println("La lista NO esta ordenada de menor a mayor");
		}
	}
}

/**
 * Clase Principal
 */
class ListaGenericas {

	/**
	 * Subclase para crear nodos
	 */
	class Nodo {
		int info; // almacenar info
		Nodo ant, sig; // nodos 'PUNTEROS' para crear el anterior y el siguiente
	}

	/**
	 * Miembro de instancia - Crea un puntero
	 */
	private Nodo raiz;

	/**
	 * Constructor por defecto
	 */
	public ListaGenericas() {
		raiz = null;
	}

	/**
	 * 
	 * @param pos
	 * @param x
	 */
	void insertar(int pos, int x) {
		if (pos <= (cantidad() + 1)) { // Recorremos todos los nodos
			Nodo nuevo = new Nodo(); // Creamos un nuevo 'nodo' para almacenar el dato
			nuevo.info = x; // Almacenamos el valor pasado por parametro
			if (pos == 1) { // Comprobar que es el primer nodo para ingresarlo en la lista
				nuevo.sig = raiz; // nodo 'nuevo.sig' apunta/almacena a la 'raiz'
				if (raiz != null) { // Si la 'raiz' tiene un 'nodo'
					raiz.ant = nuevo; // nodo 'raiz.ant' almacena la pos. del nuevo 'nodo'
				}
				raiz = nuevo; // nodo 'nuevo' apunta al nodo 'raiz' porque es el 1º elemento
			} else {
				if (pos == cantidad() + 1) { // Apuntamos al ultimo elemento
					Nodo reco = raiz; // Creamos un puntero 'reco' apunta al nodo 'raiz'
					while (reco.sig != null) { // Recorremos todos los nodos 'reco.sig' ya que 'sig' es el nodo que enlaza con el sig.
						reco = reco.sig; // nodo 'reco' apunta al sig. nodo mediante el puntero 'reco.sig' el cual enlaza al sig.
					}
					reco.sig = nuevo; // nodo 'reco.sig' apunta nodo 'nuevo'
					nuevo.ant = reco; // nodo 'nuevo.ant' apunta nodo 'reco'
					nuevo.sig = null; // nodo 'nuevo.sig' no tiene puntero al sig nodo porque es el 1º nodo nuevo
				} else {
					Nodo reco = raiz; // nodo 'reco' es el nodo 'raiz' para recorrer los elementos
					for (int f = 1; f <= (pos - 2); f++) {
						reco = reco.sig; // nodo 'reco' apunta a la sig. pos
					}
					Nodo siguiente = reco.sig; // nodo 'siguiente' apunta la pos. del sig nodo
					reco.sig = nuevo; // nodo 'reco.sig' apunta pos. del nodo 'nuevo'
					nuevo.ant = reco; // nodo 'nuevo.ant' apunta pos. del nodo 'reco'
					nuevo.sig = siguiente; // nodo 'nuevo.sig' apunta pos. del nodo 'siguiente'
					siguiente.ant = nuevo; // nodo 'siguiente.ant' apunta pos. nodo 'nuevo'
				}
			}
		}
	}

	/**
	 * Extraemos el valor de la pos. pasada por parametro
	 * 
	 * @param pos
	 * @return
	 */
	public int extraer(int pos) {
		if (pos <= cantidad()) { // cantidad elementos es mayor que el valor pasado por parametro.
			int informacion; // variable local para almacenar el valor
			if (pos == 1) { // seleccionamos la 1º pos.
				informacion = raiz.info; // almacenamos el valor del nodo 'raiz'
				raiz = raiz.sig; // nodo 'raiz' apunta al siguiente nodo 'raiz.sig'
				if (raiz != null) { // nodo 'raiz' apunta a otro nodo
					raiz.ant = null; // nodo 'raiz.ant' no apunta a nadie porque no tiene nodo
				}
			} else {
				Nodo reco = raiz; // nodo 'reco' apunta/almacena el primer nodo
				for (int f = 1; f <= (pos - 2); f++) {
					reco = reco.sig; // nodo 'reco' apunta al sig. nodo 'reco.sig'
				}
				Nodo prox = reco.sig; // nodo 'prox' almacena/apunta al nodo 'reco.sig'
				reco.sig = prox.sig; // nodo 'reco.sig' almacena/apunta al nodo 'prox.sig'

				Nodo siguiente = prox.sig; // nodo 'siguiente' apunta al nodo 'prox.sig'
				if (siguiente != null) { // nodo 'siguiente' esta apuntando a otros nodos
					siguiente.ant = reco; // nodo 'siguiente.ant' apunta/almacena al sig nodo
				}
				informacion = prox.info; // informacion almacena el valor del nodo 'prox.info'
			}
			return informacion; // devuelve el valor que contiene el 'prox.info'
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * 
	 * @param pos
	 */
	public void borrar(int pos) {
		if (pos <= cantidad()) { // Existe la pos.
			if (pos == 1) { // si es la 1º pos.
				raiz = raiz.sig; // nodo 'raiz' apunta al nodo 'raiz.sig'
				if (raiz != null) { // nodo 'raiz' apunta a otro nodo
					raiz.ant = null; // nodo 'raiz.ant' no apunta a ningun sitio
				}
			}
		} else {
			Nodo reco; // Creamos un nuevo nodo 'reco'
			reco = raiz; // nodo 'reco' apunta/almacena pos. nodo 'raiz'
			for (int f = 1; f <= (pos - 2); f++) { // Recorremos todos los nodos
				reco = reco.sig; // nodo 'reco' apunta/almacena la pos. del siguiente 'reco.sig'
			}
			Nodo prox = reco.sig; // Creamos un nuevo nodo 'prox' apunta al sig. nodo 'reco.sig'
			prox = prox.sig; // nodo 'prox' apunta/almacena al sig. nodo 'prox.sig'
			reco.sig = prox; // nodo 'reco.sig' apunta/almacena nodo 'prox'
			if (prox != null) { // si nodo 'prox' apunta a otro nodo
				prox.ant = reco; // nodo 'prox.ant' apunta/almacena al nodo 'reco'
			}
		}
	}

	/**
	 * 
	 * @param pos1
	 * @param pos2
	 */
	public void intercambiar(int pos1, int pos2) {
		if ((pos1 <= cantidad()) && (pos2 <= cantidad())) {
			Nodo reco1 = raiz; // Creamos nodo 'reco1' apunta/almacena pos. nodo 'raiz'
			for (int f = 1; f < pos1; f++) { // Recorremos los nodos para encontrar el valor de esa pos.
				reco1 = reco1.sig; // nodo 'reco1' apunta al nodo 'reco1.sig'
			}
			Nodo reco2 = raiz; // Creamos nodo 'reco2' apunta/almacena pos. nodo 'raiz'
			for (int f = 1; f < pos2; f++) { // Recorremos los nodos para encontrar el valor de esa pos.
				reco2 = reco2.sig; // nodo 'reco2' apunta al nodo 'reco2.sig'
			}
			int aux = reco1.info; // Creamos una variable 'aux'
			reco1.info = reco2.info; // Intercambiamos el valor de 'reco1.info' por 'reco2.info'
			reco2.info = aux; // Ahora 'reco2.info' almacena el valor de 'reco1.info'
		}
	}

	/**
	 * 
	 * @return
	 */
	public int mayor() {
		if (!vacia()) {
			int may = raiz.info;
			Nodo reco = raiz.sig;
			while (reco != null) {
				if (reco.info > may) {
					may = reco.info;
				}
				reco = reco.sig;
			}
			return may;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int posMayor() {
		if (!vacia()) { // Hay nodos
			int may = raiz.info; // mayor elemento
			int x = 1; // 1º pos.
			int pos = x; // 1º pos.
			Nodo reco = raiz.sig; // Creamos nodo 'reco' apunta al nodo 'raiz.sig'
			while (reco != null) { // Apuntamos al sig nodo
				if (reco.info > may) { // Valor almacenado en el nodo 'reco.info'
					may = reco.info; // Valor almacenado dentro 'reco.info' se almacena en 'may'
					pos = x; // Valor de 'pos' es 1
				}
				reco = reco.sig; // nodo 'reco' apunta al sig. nodo 'reco.sig'
				x++; // incrementamos el valor de la pos.
			}
			return pos; // devuelve el valor del nodo
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * 
	 * @return devuelve si esta vacia o no
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
	 * @return cantidad de nodos recorridos
	 */
	public int cantidad() {
		int cant = 0;
		Nodo reco = raiz;
		while (reco != null) {
			reco = reco.sig;
			cant++;
		}
		return cant;
	}

	/**
	 * 
	 * @return
	 */
	public boolean ordenada() {
		if (cantidad() > 1) { // Lista tiene nodos
			Nodo reco1 = raiz; // Creamos un nodo 'raiz'
			Nodo reco2 = raiz.sig; // Creamos otro nodo 'raiz.sig' que apunta al sig. nodo
			while (reco2 != null) { // nodo 'reco2' apunta al sig. nodo
				if (reco2.info < reco1.info) { // Valor del nodo 'reco2' es menor que el nodo 'anterior'
					return false; // devuelve false
				}
				reco1 = reco1.sig; // nodo 'reco1' apunta al sig. nodo
				reco2 = reco2.sig; // nodo 'reco2' apunta al sig. nodo
			}
		}
		return true;
	}

	/**
	 * 
	 * @param x
	 * @return
	 */
	public boolean existe(int x) {
		Nodo reco = raiz; // Creamos un nodo 'reco' apunta 1º pos.
		while (reco != null) { // nodo 'reco' apunta a otro 'nodo'
			if (reco.info == x) { // Existe el valor pasado por par.
				return true;
			}
			reco = reco.sig; // nodo 'reco' apunta al nodo 'reco.sig' para recorrer los elementos
		}
		return false;
	}

	/**
	 * Recorremos todos los elementos y los mostramos7
	 */
	public void imprimir() {
		Nodo reco = raiz; // Creamos un nodo 'reco' para almacenar el nodo 'raiz' de la 1º pos.
		while (reco != null) { // nodo 'reco' apunta mas elementos
			System.out.println(reco.info + "-");
			reco = reco.sig; // nodo 'reco' apunta al sig. elemento
		}
		System.out.println();
	}

}
