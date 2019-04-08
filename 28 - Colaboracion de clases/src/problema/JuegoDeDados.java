package problema;

public class JuegoDeDados {

	private Dado dado1, dado2, dado3;

	public JuegoDeDados() {
		dado1 = new Dado();
		dado2 = new Dado();
		dado3 = new Dado();
	}

	public Dado getDado1() {
		return dado1;
	}

	public Dado getDado2() {
		return dado2;
	}

	public Dado getDado3() {
		return dado3;
	}

	public void jugar() {
		for (int i = 0; i < 10; i++) {
			getDado1().tirar();
			getDado1().imprimir();
			getDado2().tirar();
			getDado2().imprimir();
			getDado3().tirar();
			getDado3().imprimir();
			if ((getDado1().retornarValor() == getDado2().retornarValor()) && (getDado2().retornarValor() == getDado3().retornarValor())) {
				System.out.println("Gano");
			} else {
				System.out.println("Ha perdido");
			}
		}
	}

}
