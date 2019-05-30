package problema;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 17 may. 2019 - 19:47:03
 */
public class T50RecursividadProblema {

	public static void main(String[] args) {
		FuncionRecursiva fr = new FuncionRecursiva();
		fr.imprimir(5);
	}

}

class FuncionRecursiva {

	/**
	 * Implementaci�n de un m�todo recursivo que reciba un par�metro de tipo entero
	 * y luego llame en forma recursiva con el valor del par�metro menos 1.
	 * 
	 * @param x
	 */
	void imprimir(int x) {
		System.out.println(x);
		imprimir(x - 1);
	}
}