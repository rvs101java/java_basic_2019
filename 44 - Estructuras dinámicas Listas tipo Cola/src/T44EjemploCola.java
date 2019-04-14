
public class T44EjemploCola {

}

class Cola {

	class Nodo {
		int info;
		Nodo sig;
	}

	private Nodo raiz, fondo;

	public Cola() {
		raiz = null;
		fondo = null;
	}

	boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}

	void insertar(int info) {
		Nodo nuevo = new Nodo();
		nuevo.info = info;
		nuevo.sig = null;
		if (vacia()) {
			raiz = nuevo;
			fondo = nuevo;
		} else {
			fondo.sig = nuevo;
			fondo = nuevo;
		}
	}
}
