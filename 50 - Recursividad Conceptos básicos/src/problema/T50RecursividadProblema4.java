package problema;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 17 may. 2019 - 19:47:03
 */
public class T50RecursividadProblema4 {

	public static void main(String[] args) {
		FuncionRecursiva4 fr = new FuncionRecursiva4();
		int f = fr.factorial(4);
		System.out.println("El factorial de 4 es : " + f);
	}

}

class FuncionRecursiva4 {

	/**
	 * Implementar un método recursivo que imprima en forma descendente de 5 a 1 de
	 * uno en uno.
	 * 
	 * @param fact
	 */
	int factorial(int fact) {
		if (fact > 0) {
			int valor = fact * (factorial(fact - 1));
			return valor;
		} else {
			return 1;
		}
	}
}
