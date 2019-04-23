package problemas;

/**
 * Plantear una clase para administrar una lista genérica implementando los
 * siguientes métodos:
 * 
 * a) Insertar un nodo al principio de la lista.
 * 
 * b) Insertar un nodo al final de la lista.
 * 
 * c) Insertar un nodo en la segunda posición.
 * 
 * Si la lista está vacía no se inserta el nodo.
 * 
 * d) Insertar un nodo en la ante última posición.
 * 
 * e) Borrar el primer nodo.
 * 
 * f) Borrar el segundo nodo.
 * 
 * g) Borrar el último nodo.
 * 
 * h) Borrar el nodo con información mayor.
 * 
 */
public class T46ProblemaListaGenerica {

	public static void main(String[] args) {

		ListaGenerica lg = new ListaGenerica();
		lg.insertarPrimero(10);
		lg.insertarPrimero(45);
		lg.insertarPrimero(23);
		lg.insertarPrimero(89);
		lg.imprimir();
		System.out.println("Insertamos un nodo al final:");
		lg.insertarUltimo(160);
		lg.imprimir();
		System.out.println("Insertamos un nodo en la segunda posición:");
		lg.insertarSegundo(13);
		lg.imprimir();
		System.out.println("Insertamos un nodo en la anteultima posición:");
		lg.insertarAnteUltimo(600);
		lg.imprimir();
		System.out.println("Borramos el primer nodo de la lista:");
		lg.borrarPrimero();
		lg.imprimir();
		System.out.println("Borramos el segundo nodo de la lista:");
		lg.borrarSegundo();
		lg.imprimir();
		System.out.println("Borramos el ultimo nodo de la lista:");
		lg.borrarUltimo();
		lg.imprimir();
		System.out.println("Borramos el mayor de la lista:");
		lg.borrarMayor();
		lg.imprimir();

	}
}

/**
 * Clase Principal
 */
class ListaGenerica {

	/**
	 * Subclase para crear 'nodos'
	 */
	class Nodo {
		int info; // almacena el valor
		/**
		 * Dentro de la Subclase 'Nodo' creamos un nuevo 'nodo' sin dirección de memoria
		 */
		Nodo sig;
	}

	/**
	 * Creamos el 'nodo' raiz
	 */
	private Nodo raiz;

	/**
	 * Crear constructor
	 */
	public ListaGenerica() {
		raiz = null; // objeto nodo 'raiz' no apunta a ningun sitio
	}

	/**
	 * Insertar un valor al primer 'nodo' raiz
	 * 
	 * @param x
	 */
	void insertarPrimero(int x) {
		Nodo nuevo = new Nodo(); // Creamos un 'nodo'
		nuevo.info = x; // nodo 'nuevo' almacena el valor
		nuevo.sig = raiz; // nodo 'nuevo' apunta a raiz
		raiz = nuevo; // nodo 'raiz' apunta a 'nuevo'
	}

	/**
	 * 
	 * @param x
	 */
	public void insertarUltimo(int x) {
		Nodo nuevo = new Nodo(); // Creamos un nuevo nodo
		nuevo.info = x; // Agregamos la 'info'
		if (raiz == null) { // nodo 'raiz' no tienen ningun nodo apuntando
			raiz = nuevo; // nodo 'raiz' apunta a 'nuevo'
		} else { // sino
			Nodo reco = raiz; // Creamos un nuevo nodo 'reco' que apunte a 'raiz'
			while (reco.sig != null) { // Recorrer todos los 'nodos' hasta 'null' mediante 'sig'
				reco = reco.sig; // Agregamos a 'reco' la siguiente posición con 'reco.sig'
			}
			reco.sig = nuevo; // Almacenamos en el nodo interior 'reco.sig' el nuevo
		}
	}

	/**
	 * 
	 * @param x
	 */
	public void insertarSegundo(int x) {
		if (raiz != null) {
			Nodo nuevo = new Nodo(); // Creamos un nuevo 'nodo'
			nuevo.info = x; // Almacenamos el valor
			if (raiz.sig == null) { // Si nodo 'raiz.sig' no tiene direccion memoria
				// Hay un solo nodo
				raiz.sig = nuevo;
			} else {
				// Creamos un nodo 'nuevo' que almacena en 'sig' el nodo 'sig' de 'raiz'
				nuevo.sig = raiz.sig;
				raiz.sig = nuevo; // nodo 'sig' de nodo 'raiz' almacena nodo 'nuevo'
			}
		}
	}

	/**
	 * 
	 * @param x
	 */
	public void insertarAnteUltimo(int x) {
		if (raiz != null) { // nodo 'raiz' apunta a una posicion de memoria
			Nodo nuevo = new Nodo(); // Creamos un nuevo 'nodo'
			nuevo.info = x; // Almacenamos la nueva info
			if (raiz.sig == null) { // nodo 'sig' del nodo 'raiz' no apunta a ningun sitio
				// Hay un solo nodo : !!!Con esto agregamos un 'nuevo' nodo a la 'raiz'!!!
				nuevo.sig = raiz; // nodo 'nuevo' apunta a 'raiz' para agregarlo a la lista de nodo
				raiz = nuevo; // nodo 'raiz' apunta a 'nuevo' para agregarlo a la lista
			} else {
				Nodo atras = raiz; // Creamos nuevo nodo 'atras' que apunta al nodo 'raiz'
				Nodo reco = raiz.sig; // Creamos nuevo nodo 'reco' apunta/convierte al siguiente nodo 'raiz'
				while (reco.sig != null) { // nodo 'reco' no apunta a ningun nodo siguiente
					atras = reco; // nodo 'atras' siempre almacenará la ultima posicion de memoria del 'reco'
				}
				nuevo.sig = atras.sig; // El nodo 'nuevo' almacenará la pos. memoria del ult. 'nodo'
				atras.sig = nuevo; // El nodo 'atras' almacenara la pos. memoria del ult. 'nodo'
			}
		}
	}

	/**
	 * 
	 */
	public void borrarPrimero() {
		if (raiz != null) {
			raiz = raiz.sig;
		}
	}

	/**
	 * Nodo raiz ya tiene otro nodo 'lo cual no es el 1º elemento de la lista'
	 */
	public void borrarSegundo() {
		if (raiz != null) { // Hay un nodo 'raiz'
			if (raiz.sig != null) { // Apunta a otro nodo
				// Como agregar nuevos nodos a la lista
				// ------------posicion del nodo
				Nodo tercero = raiz.sig; // Creamos un nuevo nodo 'tercero' que apunta al segundo 'nodo'
				// -------almacenamos la pos. que ocupa el nodo en la lista
				tercero = tercero.sig; // Almacenamos la posicion del nuevo 'nodo'
				// agregamos al nodo 'raiz' el siguiente nodo
				raiz.sig = tercero; // Asignamos la pos. del nodo 'tercero' al nodo 'raiz'
				// para agregarlo a la lista de nodos
			}
		}
	}

	/**
	 * 
	 */
	public void borrarUltimo() {
		if (raiz != null) { // Hay elementos en la lista
			if (raiz.sig == null) { // nodo 'raiz' no apunta a ningun otro nodo
				raiz = null; // nodo 'raiz' no apunta a ningun otro nodo de la lista
			} else {
				Nodo reco = raiz.sig; // Creamos un nodo 'reco' apunta al sig. elemento de la lista de nodos
				Nodo atras = reco; // Creamos nodo 'atras' y agregamos nuevo 'nodo' al nodo 'atras'
				while (reco.sig != null) { // Recorremos todos los nodos
					atras = reco; // nodo 'atras' almacena la pos. del nodo 'reco' que sera el ultimo nodo
					reco = reco.sig; // Sigue avanzando elementos del nuevo 'nodo'
				}
				atras.sig = null; // Ultimo nodo 'atras' no apunta a ningun sitio.
			}
		}
	}

	/**
	 * Recorremos todos los nodos
	 */
	public void imprimir() {
		Nodo reco = raiz; // nodo 'reco' apunta a 1º nodo 'raiz'
		while (reco != null) { // Hay elementos del nodo que recorrer
			System.out.println(reco.info + "-");
			reco = reco.sig; // Asignamos al nodo 'reco' la posicion del sig. elemento
		}
		System.out.println();
	}

	/**
	 * 
	 */
	public void borrarMayor() {
		if (raiz != null) { // Hay nodos despues de 'raiz'
			Nodo reco = raiz; // Creamos otro nodo 'reco' que apunta nodo 'raiz'
			int may = raiz.info;
			while (reco != null) { // Hay nodos que recorrer
				if (reco.info > may) { // nodo 'reco' es mayor que elemento 'raiz'
					may = reco.info; // Almacenamos el nuevo numero mayor
				}
				reco = reco.sig; // Seguimos recorriendo 'nodos'
			}
			reco = raiz; // Siguiente nodo 'reco' apunta 'raiz'
			Nodo atras = raiz; // Creamos nodo 'atras' apunta a 'raiz'
			while (reco != null) { // Hay nodos que recorrer
				if (reco.info == may) { // Si los valores de ambos nodos son iguales
					if (reco == raiz) {
						raiz = raiz.sig; // Apuntamos al siguiente nodo despues de 'raiz'
						atras = raiz; // Almacenamos la pos. del nodo 'raiz'
						reco = raiz; // Recorremos todos los nodos
					} else {
						atras.sig = reco.sig; // Seguimos recorriendo 'nodos'
						reco = reco.sig; // Recorremos todos los 'nodos'
					}
				} else {
					atras = reco; // Ultimo nodo 'atras' almacena la pos. del nodo
					reco = reco.sig; // Seguimos recorriendo nodos
				}
			}
		}
	}
}
