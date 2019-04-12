package ejercicios;

public class T40RetornarPrimerElementoSinEliminarlo {

	public static void main(String[] args) {

	}
}

class Pila2 {

	class Nodo {
		int info;
		Nodo sig;
	}

	private Nodo raiz;

	Pila2() {
		raiz = null;
	}

	public void insertar(int x) {
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			nuevo.sig = null;
			raiz = nuevo;
		}
	}
}