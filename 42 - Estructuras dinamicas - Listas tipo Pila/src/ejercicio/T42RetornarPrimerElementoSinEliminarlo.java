package ejercicio;

public class T42RetornarPrimerElementoSinEliminarlo {

	public static void main(String[] args) {
		Pila2 pila2 = new Pila2();
		pila2.insertar(10);
		pila2.insertar(40);
		pila2.insertar(3);
		pila2.imprimir();
		System.out.println("Extraemos de la pila: " + pila2.extraer());
		pila2.imprimir();
		System.out.println("Retornamos primero de la pila: " +pila2.retornar());
		pila2.imprimir();
	}
}

class Pila2 {

	class Nodo2 {
		int info;
		Nodo2 sig;
	}

	private Nodo2 raiz;

	Pila2() {
		raiz = null;
	}

	public void insertar(int x) {
		Nodo2 nuevo2;
		nuevo2 = new Nodo2();
		nuevo2.info = x;
		if (raiz == null) {
			nuevo2.sig = null;
			raiz = nuevo2;
		} else {
			nuevo2.sig = raiz;
			raiz = nuevo2;
		}
	}

	public int extraer() {
		if (raiz != null) {
			int informacion = raiz.info;
			raiz = raiz.sig;
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	public int retornar() {
		if (raiz != null) {
			int informacion = raiz.info;
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	public void imprimir() {
		Nodo2 recorrer2 = raiz;
		System.out.println("Listado de todos los elementos de la Pila");
		while (recorrer2 != null) {
			System.out.print(recorrer2.info + " - ");
			recorrer2 = recorrer2.sig;
		}
		System.out.println();
	}

}