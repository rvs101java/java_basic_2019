package problema;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 17 may. 2019 - 19:47:03
 */
public class T50RecursividadProblema3 {

	public static void main(String[] args) {
		FuncionRecursiva3 fr = new FuncionRecursiva3();
		fr.imprimir(5);
	}

}

class FuncionRecursiva3 {

	/**
	 * Implementar un método recursivo que imprima en forma descendente de 5 a 1 de
	 * uno en uno.
	 * 
	 * @param x
	 */
	void imprimir(int x) {
		if (x > 0) {
			System.out.println(x);
			imprimir(x - 1);
		}else
		System.out.println("Fin de la recursividad");
	}
}
