
/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 22 abr. 2019 - 20:44:07
 */
public class T46EstructurasDinamicasListasGenéricas {

	public static void main(String[] args) {

		ListaGenerica lg = new ListaGenerica();
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

		System.out.println("La posicion del mayor es : " + lg.posMayor());

		if (lg.ordenada()) {
			System.out.println("La lista esta ordenada de menor a mayor");
		} else {
			System.out.println("La lista no esta ordenada de menor a mayor");
		}

	}
}

/**
 * Clase principal
 */
class ListaGenerica {

	/**
	 * Subclase Nodo
	 */
	class Nodo {
		int info;
		Nodo sig;
	}

	/**
	 * Atributo nodo
	 */
	private Nodo raiz;

	/**
	 * Constructor por defecto
	 */
	public ListaGenerica() {
		raiz = null;
	}

	/**
	 * Inserta un nodo en la posición (pos) y con la información que hay en el
	 * parámetro x.
	 * 
	 * @param pos
	 * @param x
	 */
	void insertar(int pos, int x) {
		if (pos <= cantidad() + 1) { // verificamos q existe esa posicion en la lista
			Nodo nuevo = new Nodo(); // creamos un nodo
			nuevo.info = x; // almacenamos el valor
			if (pos == 1) { // si se inserta al principio de la lista preguntamos si en "pos" llega un 1
				nuevo.sig = raiz; // nodo apunta al siguiente 'nodo'
				raiz = nuevo; // nodo apunta a la siguiente posicion 'nodo'
			} else { // si no se inserta al principio
				if (pos == cantidad() + 1) { // preguntamos si se inserta al final
					Nodo reco = raiz; // Creamos un nuevo 'nodo' que apunta al sig. elemento
					while (reco.sig != null) { // recorremos la lista hasta el ultimo 'nodo' para insertar el nodo
						reco = reco.sig; // almacenamos la posicion del ultimo 'nodo'
					}
					reco.sig = nuevo; // enlazamos el puntero 'sig' del ultimo nodo de la lista con dire del 'nuevo'
										// nodo creado
					nuevo.sig = null; // disponemos 'sig' del nodo creado el valor 'null' ya que no hay otro nodo
										// adelante
				} else { // sino se inserta al principio o al final lo insertamos en medio de la lista
					Nodo reco = raiz;
					for (int f = 1; f <= (pos - 2); f++) { // avazamos puntero aux y detenemos pos. antes de donde
															// tenemos que insertarlo
						reco = reco.sig;
					}
					Nodo siguiente = reco.sig; // disponemos otro puntero 'aux' que apunte al prox. donde este apuntando
												// reco
					reco.sig = nuevo; // enlazamos el puntero 'sig' del nodo apuntando por 'reco' con dir. del nodo
										// creado
					nuevo.sig = siguiente; // puntero 'sig' del nodo creado con dir. del nodo 'siguiente'
				}
			}
		}
	}

	/**
	 * @param pos
	 * @return Extrae la información del nodo de la posición indicada (pos).
	 * 
	 *         Se debe eliminar el nodo.
	 */
	public int extraer(int pos) {
		if (pos <= cantidad()) { // existe en la lista
			int informacion;
			if (pos == 1) { // si existe verificamos si el nodo a extraer es el '1º' de la lista '<
				informacion = raiz.info;
				raiz = raiz.sig;
			} else {
				Nodo reco; // Creamos un nuevo 'nodo'
				reco = raiz; // reco apunta 'nodo' raiz
				for (int f = 1; f <= (pos - 2); f++) { // si no esta al principio de la lista avanzamos hasta el nodo
														// anterior a extraer
					reco = reco.sig;
				}
				Nodo prox = reco.sig; // definimos otro puntero aux y lo disponemos en el sig. 'nodo' a donde apunta
										// 'reco'
				reco.sig = prox.sig; // enlazamos puntero 'sig' del nodo apuntando por 'reco' al nodo sig. del nodo
										// apuntando por 'prox' "nodo apuntando por prox queda fuera de la lista'
				informacion = prox.info;
			}
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * Borrar es similar a metodo extraer pero no retorna valor
	 * 
	 * @param pos
	 */
	public void borrar(int pos) {
		if (pos <= cantidad()) {
			if (pos == 1) {
				raiz = raiz.sig;
			} else {
				Nodo reco = raiz;
				reco = raiz;
				for (int f = 1; f <= (pos - 2); f++) {
					reco = reco.sig;
				}
				Nodo prox = reco.sig;
				reco.sig = prox.sig;
			}
		}
	}

	/**
	 * Intercambia las informaciones de los nodos de las posiciones pos1 y pos2.
	 * 
	 * @param pos1
	 *            'entero' representa la posicion 1
	 * @param pos2
	 *            'entero' representa la posicion 2
	 */
	public void intercambiar(int pos1, int pos2) {
		if (pos1 <= cantidad() && pos2 <= cantidad()) { // comprobamos que ambas pos. existen en la lista
			Nodo reco1 = raiz; // nodo 'aux' reco1 apunta a la dire. del 1º nodo y con 'for' avanza hasta pos.
								// almacena 'pos1'
			for (int f = 1; f < pos1; f++) {
				reco1 = reco1.sig;
			}
			Nodo reco2 = raiz; // 2º puntero 'aux' avanzamos hasta pos indicada 'pos2'
			for (int f = 1; f < pos2; f++) {
				reco2 = reco2.sig;
			}
			int aux = reco1.info; // intercambiamos info. q almacena cada nodo
			reco1.info = reco2.info;
			reco2.info = aux;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int mayor() {
		if (!vacias()) { // si la lista no esta vacia
			int may = raiz.info; // mayor 'es el 1º elemento de la lista'
			Nodo reco = raiz.sig; // inicializamos puntero 'aux' con la dire. 2º nodo de la lista
			while (reco != null) { // estructura repetitiva recorremos la lista
				if (reco.info > may) { // cada vez encontramos 'nodo' con info. mayor q variable 'may' actualizamos con
										// nuevo valor y avanzamos el puntero 'reco' para visitar siguiente nodo
					may = reco.info;
				}
				reco = reco.sig;
			}
			return may; // fuera retorna mayor elemento
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * El método que retorna la posición del mayor es similar al anterior con la
	 * salvedad que debemos almacenar en otro auxiliar la posición donde se almacena
	 * el mayor
	 * 
	 * @return
	 */
	public int posMayor() {
		if (!vacias()) {
			int may = raiz.info;
			int x = 1;
			int pos = x;
			Nodo reco = raiz.sig;
			while (reco != null) {
				if (reco.info > may) {
					may = reco.info;
					pos = x;
				}
				reco = reco.sig;
				x++;
			}
			return pos;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * 
	 * @return Retorna la cantidad de nodos de la lista.
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
	 * El método que debe retornar si está ordenada la lista de menor a mayor es:
	 * 
	 * @return
	 */
	public boolean ordenada() {
		if (cantidad() > 1) {
			Nodo reco1 = raiz; // puntero 'aux' con la dir. del primer nodo
			Nodo reco2 = raiz.sig; // puntero 'aux' con la dir. del segundo nodo
			while (reco2 != null) { // no se finaliza la lista
				if (reco2.info < reco1.info) { // controlamos si la información del segundo nodo es menor al nodo
												// anterior significa que la lista no está ordenada y podemos parar el
												// análisis retornando un false

					return false;
				}
				reco2 = reco2.sig; // avanzamos 1 puntero a su nodo
				reco1 = reco1.sig; // avanzamos 1 puntero a su nodo
			}
		}
		return true; // si estan ordenados
	}

	/**
	 * 
	 * @param x
	 * @return
	 */
	public boolean existe(int x) {
		Nodo reco = raiz;
		while (reco != null) {
			if (reco.info == x) { // En cada nodo que visitamos controlamos si el parámetro x es igual a la
								  // información del nodo, en caso afirmativo salimos del método retornando true
				return true;
			}
			reco = reco.sig;
		}
		return false;
	}

	/**
	 * 
	 * @return
	 */
	private boolean vacias() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}

	public void imprimir() {
		Nodo reco = raiz;
		while (reco != null) {
			System.out.println(reco.info + " - ");
			reco = reco.sig;
		}
		System.out.println();
	}
}