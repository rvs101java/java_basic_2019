package ejercicios;

public class T23MatrizMostrarVerticesBasico {

	public static void main(String[] args) {
		T23MatrizMostrarVerticesBasico tp = new T23MatrizMostrarVerticesBasico();
		tp.getVertices();
	}

	private int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	private int primeraFila = 0;
	private int primeraColum = 0;

	public T23MatrizMostrarVerticesBasico() {
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[f].length; c++) {
				System.out.print(getMatriz()[f][c] + " ");
			}
			System.out.println();
		}
	}

	public int getPrimeraFila() {
		return primeraFila;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public int getUltimaCol() {
		return (getMatriz()[0].length - 1);
	}

	public int getPrimeraColm() {
		return primeraColum;
	}

	public void getVertices() {
		System.out.println("----------");
		for (int f = getPrimeraFila(); f < getMatriz().length; f++) {
			for (int c = getPrimeraColm(); c < getMatriz()[f].length; c++) {
				if ((f == (getPrimeraFila())) && ((c == (getPrimeraColm())))) {
					System.out.print(getMatriz()[f][c] + " ");
				}
				if ((f == (getPrimeraFila())) && ((c == (getUltimaCol() - 1)))) {
					System.out.print("\t" + getMatriz()[f][c]);
				}
				if ((f == (getPrimeraFila() + 1)) && ((c == getPrimeraColm()))) {
					System.out.print(getMatriz()[f][c]);
				}
				if ((f == (getPrimeraFila() + 1)) && ((c == getUltimaCol() - 1))) {
					System.out.print("\t" + getMatriz()[f][c]);
				}

				if ((f == (getPrimeraFila() + 2)) && ((c == getPrimeraColm()))) {
					System.out.print(getMatriz()[f][c]);
				}
				if ((f == (getPrimeraFila() + 2)) && (c == (getUltimaCol() - 1))) {
					System.out.print("\t" + getMatriz()[f][c]);
				}
			}
			System.out.println();
		}
	}

}
