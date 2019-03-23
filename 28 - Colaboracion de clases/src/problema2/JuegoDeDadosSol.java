package problema2;

public class JuegoDeDadosSol {

	private DadoSol dado1, dado2, dado3;

	public JuegoDeDadosSol() {
		dado1 = new DadoSol();
		dado2 = new DadoSol();
		dado3 = new DadoSol();
	}

	public void jugar() {
		for (int i = 0; i < 10; i++) {
			dado1.tirar();
			dado1.imprimir();
			dado2.tirar();
			dado2.imprimir();
			dado3.tirar();
			dado3.imprimir();
			if (dado1.retornarValor() == dado2.retornarValor() && dado1.retornarValor() == dado3.retornarValor()) {
				System.out.println("Gano");
			} else {
				System.out.println("Has Perdido");
			}
		}
	}
}
