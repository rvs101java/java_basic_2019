package ejercicios;

public class T23MatrizIntercambiarFilas2 {

	public static void main(String[] args) {
		MatrizFilaColums2 mfc2 = new MatrizFilaColums2();
		mfc2.getFilasColumnas();
		mfc2.getIntercambiarFilas();
	}
}

class MatrizFilaColums2 {

	private int f;
	private int c;
	private int[][] matriz;

	public MatrizFilaColums2() {
		setFilas(3);
		setCol(3);
	}

	public int getFilas() {
		return f;
	}

	public void setFilas(int filas) {
		this.f = filas;
	}

	public int getCol() {
		return c;
	}

	public void setCol(int col) {
		this.c = col;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public int[][] getFilasColumnas() {
		System.out.println("----- Valores ----- ");
		matriz = new int[getFilas()][getCol()];
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[0].length; c++) {
				getMatriz()[f][c] = (int) (Math.random() * (1 + 100));
				System.out.print(getMatriz()[f][c] + " ");
			}
			System.out.println();
		}
		return matriz;
	}

	public int[][] getIntercambiarFilas() {
		System.out.println("----- Intercambio ----- ");
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
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[0].length; c++) {
				System.out.print(array[f][c] + " ");
			}
			System.out.println();
		}
	}

}