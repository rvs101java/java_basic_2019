package xOtrosConceptos;

public class Principal2  {

	
	public Principal2() {
		raiz = null;
	}

	class Secundariax {
		
		public Secundariax() {
			int info = 10;
			Secundariax sig = null;
		}
		
	}

	private Secundariax raiz;


	public void verValor() {
		Secundariax s = new Secundariax();
		System.out.println("Valor: " + s.info);
		System.out.println("Secundaria: " + s.sig);
	}

	public static void main(String[] args) {
		Principal2 p = new Principal2();
		p.verValor();
	}
}
