package ejercicios;

/**
 * Crear una matriz de (n * m) filas (cargar n y m por teclado)
 * 
 * Imprimir los cuatro valores que se encuentran en los vértices de la misma
 * (mat[0][0] etc.)
 * 
 * @author Rad
 *
 */
public class T23MatrizMostrarVertices {

	public static void main(String[] args) {
		MatrizVertices mv = new MatrizVertices();
		mv.setDimension1(10);
		mv.setDimension2(12);
		mv.setValoresMatriz();
		mv.verMatriz();
		mv.setVertices();
	}
}

class MatrizVertices {

	private int dimension1;
	private int dimension2;
	private int primeraFila = 0;
	private int primeraColum = 0;
	private int[][] matriz;

	public MatrizVertices() {
		matriz = new int[getDimension1()][getDimension2()];
	}

	public void setDimension1(int dimension) {
		this.dimension1 = dimension;
	}
	
	public void setDimension2(int dimension) {
		this.dimension2 = dimension;
	}

	public int getDimension1() {
		return dimension1;
	}
	
	public int getDimension2() {
		return dimension2;
	}

	public int getPrimeraFila() {
		return primeraFila;
	}

	public void setIncrementaFila(int incremento) {
		this.primeraFila = incremento;
	}

	public int getUltimaFila() {
		return (getMatriz().length - 1);
	}

	public int getPrimeraColm() {
		return primeraColum;
	}

	public int getUltimaCol() {
		return (getMatriz()[0].length - 1);
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void verMatriz() {
		for (int f = getPrimeraFila(); f < getMatriz().length; f++) {
			for (int c = getPrimeraColm(); c < getMatriz()[0].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void setValoresMatriz() {
		matriz = new int[getDimension1()][getDimension2()];
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[f].length; c++) {
				getMatriz()[f][c] = (int) (Math.random() * (1 + 100) + 1);
			}
		}
	}

	public void setVertices() {
		int contador = 1;
		do {
			System.out.println(getMatriz()[getPrimeraFila()][getPrimeraColm()] + "\t" + getMatriz()[getPrimeraFila()][getUltimaCol()]);
			setIncrementaFila(contador);
		} while (contador++ <= getUltimaFila());
	}
}