
/**
 * Banco atributos 3 Cliente (3 objetos de la clase Cliente) 1 Scanner (Para
 * poder hacer la entrada de datos por teclado) métodos constructor operar
 * depositosTotales
 * 
 * @author Rad
 *
 */
public class Banco {

	private Cliente cliente1, cliente2, cliente3;

	public Banco() {
		cliente1 = new Cliente("Juan");
		cliente2 = new Cliente("Pepe");
		cliente3 = new Cliente();
	}

	public void operar() {
		cliente1.depositar(100);
		cliente2.depositar(150);
		cliente3.depositar(200);
		cliente3.extraer(150);
	}

	public void depositosTotales() {
		int total = cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
		System.out.println("El total de dinero en el banco es: " + total);
		cliente1.imprimir();
		cliente2.imprimir();
		cliente3.imprimir();
	}

}
