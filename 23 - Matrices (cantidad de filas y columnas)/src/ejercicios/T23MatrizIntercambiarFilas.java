package ejercicios;

public class T23MatrizIntercambiarFilas {

	public static void main(String[] args) {
		MatrizFilaColums mfc = new MatrizFilaColums();
		mfc.setImprimirArray(mfc.getMatriz());
		mfc.getIntercambiarFilas();
	}
}

class MatrizFilaColums {

	private int[][] matriz = { { 2, 4, 4 }, { 6, 6, 9 }, { 8, 10, 12 } };
	private static int x;
	private int d;

	public MatrizFilaColums() {
		setDimension(4);
	}

	public int getDimension() {
		return d;
	}

	public void setDimension(int dimen) {
		this.d = dimen;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public int[][] getFilasColumnas() {
		System.out.println("----- Valores ----- ");
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[0].length; c++) {
				System.out.print(getMatriz()[f][c] + " ");
			}
			System.out.println();
		}
		return matriz;
	}
 
	public int[][] getIntercambiarFilas() {
		int[][] aux1 = new int[getMatriz().length][getMatriz().length];
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[f].length; c++) {
				if (f == 0) {
					aux1[f][c] = getMatriz()[f + 1][c];
					getMatriz()[f + 1][c] = getMatriz()[f][c];
					getMatriz()[f][c] = aux1[f][c];
				}
			}
		}
		setImprimirArray(getMatriz());
		return matriz;
	}

	public void setImprimirArray(int[][] array) {
		System.out.println("------- Ver Matriz ---------");
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[0].length; c++) {
				System.out.print(array[f][c] + " ");
			}
			System.out.println();
		}
	}

}