package problema;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 17 may. 2019 - 19:47:03
 */
public class T50RecursividadProblema2 {

	public static void main(String[] args) {
		FuncionRecursiva2 fr = new FuncionRecursiva2();
		fr.imprimir(5);
	}

}

class FuncionRecursiva2 {

	/**
	 * Implementar un método recursivo que imprima en forma descendente de 5 a 1 de
	 * uno en uno.
	 * 
	 * @param x
	 */
	void imprimir(int x) {
		if (x >= 0 && x <= 6) {
			System.out.println(x);
			imprimir(x = x - 1);
		}
	}
}


