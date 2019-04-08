
/**
 * Confeccionar una clase para administrar 
 * una matriz irregular de 5 filas y 1 columna la primer fila, 
 * 2 columnas la segunda fila y así sucesivamente hasta 
 * 5 columnas la última fila (crearla sin la intervención del operador)
 * 
 * Realizar la carga por teclado e imprimir posteriormente.
 */
package ProblemasPropuestos;

public class T25MatricesIrregularesEj1 {

	public static void main(String[] args) {

		MatrizIrregularEj1 mi1 = new MatrizIrregularEj1();
		mi1.setDimensionDatosMatriz();
		mi1.getDimensionDatosMatriz();
		mi1.getDatosMatriz();
		mi1.getImprimir();
	}
}

class MatrizIrregularEj1 {

	private int[][] matriz;

	public MatrizIrregularEj1() {
		matriz = new int[4][];
	}

	public int[][] getDatosMatriz() {
		return matriz;
	}

	public void setDimensionDatosMatriz() {
		for (int f = 0; f < getDatosMatriz().length; f++) {
			int x = (int) (Math.random() * (1 + 20) + 1);
			for (int c = 0; c < x; c++) {
				matriz[f] = new int[c];
			}
		}
	}

	public void getDimensionDatosMatriz() {
		for (int f = 0; f < getDatosMatriz().length; f++) {
			for (int c = 0; c < getDatosMatriz()[f].length; c++) {
				int x = (int) (Math.random() * (1 + 100) + 1);
				getDatosMatriz()[f][c] = x;
			}
		}
	}

	public void getImprimir() {
		for (int f = 0; f < getDatosMatriz().length; f++) {
			for (int c = 0; c < getDatosMatriz()[f].length; c++) {
				System.out.print(getDatosMatriz()[f][c] + " ");
			}
			System.out.println();
		}
	}
}