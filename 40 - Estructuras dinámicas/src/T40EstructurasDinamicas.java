
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
 * Clase Principal
 * 
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
		 * Variables de la Subclase instancia
		 */
		int info;
		
		/**
		 * Variables de la Subclase instancia
		 */
		Nodo sig;
	}

	/**
	 * Variables instancia de la Clase Principal
	 */
	private Nodo raiz;

	/**
	 * Construtor principal
	 */
	public Pila() {
		raiz = null;
	}

	/**
	 * 
	 * @param x
	 */
	public void insertar(int x) {
		Nodo nuevo = new Nodo(); // Instanciamos un objeto 
		nuevo.info = x; // dentro del objeto almacenamos un valor entero
		
		if (raiz == null) { // objeto apunta a null
			nuevo.sig = null; // 
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
		System.out.println("Listado de todos los elementos de la pila");
		while (reco != null) {
			System.out.println(reco.info + "-");
			reco = reco.sig;
		}
		System.out.println();
	}
}
