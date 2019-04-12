
/**
 * @author rvs101
 * @author raulvelasalas@gmail.com 7 abr. 2019 - 13:58:58
 */
public class T40EstructurasDinamicas {

	public static void main(String[] args) {
		Pila pila1 = new Pila();
		pila1.insertar(10);
		pila1.insertar(40);
		pila1.insertar(3);
		pila1.imprimir();
		System.out.println("Extraemos de la pila: " + pila1.extraer());
		pila1.imprimir();
	}
}

/**
 * Clase Principal - Heap
 */
class Pila {

	/**
	 * Subclase de la clase Principal
	 * 
	 * @author Rad
	 *
	 */
	class Nodo {
		/**
		 * Variables tipo entero de la Subclase instancia
		 * 
		 * Almacena el valor
		 */
		int info;
		/**
		 * Variables tipo Nodo de la Subclase instancia
		 * 
		 * Objeto que almacena la referencia de tipo Nodo
		 * 
		 * Apunta al siguiente nodo o a null si no existe otro nodo 'puntero interno a
		 * la lista'
		 */
		Nodo sig;
	}

	/**
	 * Variables instancia tipo Nodo de la Clase Principal
	 * 
	 * Objeto nodo 'raiz' tiene puntero direccion del primero nodo
	 * 
	 * 'raiz' apunta a 'null' esta vacia 'sin direccion'
	 */
	private Nodo raiz;

	/**
	 * Construtor principal
	 * 
	 * Inicializa a "null" el objeto 'raiz'
	 * 
	 * Puntero 'raiz' tiene direccion al primer nodo de la lista nos permite acceder
	 * a los demas nodos
	 */
	public Pila() {
		raiz = null; // lista vacia sino direccion del primer nodo de la lista
	}

	/**
	 * Procedimiento de la clase Principal
	 * 
	 * @param x
	 */
	public void insertar(int x) {
		// Creamos un objeto nodo para almacenar posicion y valor
		Nodo nuevo = new Nodo(); // definicion puntero o ref. tipo de dato Nodo
		nuevo.info = x; // almacenamos un valor entero dentro del objeto

		if (raiz == null) { // objeto 'raiz' apunta a null
			nuevo.sig = null; // indicamos que no hay un siguiente nodo
			raiz = nuevo; // objeto 'raiz' apunta al objeto 'nuevo' que tiene 'info' y 'sig'
		} else { // si la lista no esta vacia
			nuevo.sig = raiz; // objeto 'nuevo' almacena la posicion de la 'raiz' que es la 1º posicion
			raiz = nuevo; // objeto 'raiz' almacena la posicion 'nuevo' que contiene
							// la referencia a la nueva posicion
		}
	}

	/**
	 * 
	 * @return
	 */
	public int extraer() {
		if (raiz != null) { // raiz tiene una ref. a la memoria
			int informacion = raiz.info; // obtenemos el valor
			raiz = raiz.sig; // apuntamos al siguiente objeto de la Pila
			return informacion; // devuelve el valor
		} else {
			return Integer.MAX_VALUE; // Valor como codigo de error
		}
	}

	/**
	 * Mostrar los valores de cada Nodo
	 */
	public void imprimir() {
		Nodo recorrer = raiz; // 'recorrer' almacena la posicion del ultimo elemento insertado
		System.out.println("Listado de todos los elementos de la pila");
		while (recorrer != null) { // si tiene elementos
			System.out.println(recorrer.info + "-"); // muestra su valor
			recorrer = recorrer.sig; // objeto 'nodo' apunta al siguiente elemento
		}
		System.out.println();
	}
}
