
/**
 * Cliente atributos nombre monto métodos constructor depositar extraer
 * retornarMonto
 * 
 * @author Rad
 *
 */
public class Cliente {

	private String nombre;
	private int monto;
	private static int contador = 0;

	public Cliente() {
		setContador();
		this.nombre = "Usuario " + getContador();
	}

	public Cliente(String nombre) {
		setContador();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMonto() {
		return monto;
	}

	public void setContador() {
		Cliente.contador++;
	}

	public int getContador() {
		return contador;
	}

	public void depositar(int m) {
		monto = monto + m;
	}

	public void extraer(int m) {
		monto = monto - m;
	}

	public int retornarMonto() {
		return monto;
	}

	public void imprimir() {
		System.out.println(getNombre() + " tiene depositado la suma de " + getMonto());
	}

}
