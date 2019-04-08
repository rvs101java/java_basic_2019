package ejercicios;

public class T22MatricesEjercicios2x5 {

	public static void main(String[] args) {
		Matrices2x5 m = new Matrices2x5();
		m.verMatriz();
		m.setEstablecerColumnas();
		MatrizSol ms = new MatrizSol();
		ms.cargar();
		ms.imprimir();
	}
}

class Matrices2x5 {

	private int[][] matriz;

	public Matrices2x5() {
		matriz = new int[2][5];
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int fila, int col) {
		matriz = new int[fila][col];
	}

	public void setMatrizFila(int fila, int col, int valor) {
		matriz = new int[fila][0];
		matriz[fila][0] = valor;
	}

	public void setMatrizColumna(int fila, int col, int valor) {
		matriz = new int[0][col];
		matriz[0][col] = valor;
	}

	public void setEstablecerColumnas() {
		int au = 1;
		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[0].length; c++) {
				if (f == 0) {
					matriz[f][c] = au++;
					System.out.print(matriz[f][c] + " ");
				}
				if (f == 1) {
					matriz[f][c] = (au++);
					System.out.print(matriz[f][c] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("--- fila maxima --- ");
	}

	public void verMatriz() {
		System.out.println("filas: " + matriz.length + " columnas: " + matriz[0].length);
	}
}

class MatrizSol {

	private int[][] mat;

	public void cargar() {
		int au = 0;
		mat = new int[2][5];
		System.out.println("Carga de la matriz por columnas");
		for (int c = 0; c < 5; c++) {
			for (int f = 0; f < 2; f++) {
				System.out.print("Ingrese componente: de la fila: " + f + " y la columna: " + c);
				mat[f][c] = (++au);
				System.out.println();
			}
		}
		System.out.println();
	}

	public void imprimir() {
		for (int f = 0; f < 2; f++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(mat[f][c] + " ");
			}
			System.out.println();
		}
	}
}