package xOtrosConceptos;

public class Principal {

	class Secundaria {
		int info = 10;
		Secundaria sig = null;
	}

	private Secundaria raiz;

	public Principal() {
		raiz = null;
	}

	public void verValor() {
		Secundaria s = new Secundaria();
		System.out.println("Valor: " + s.info);
		System.out.println("Secundaria: " + s.sig);
	}

	public static void main(String[] args) {
		Principal p = new Principal();
		p.verValor();
	}
}
