import java.util.Random;

public class T23OtraMatriz {

	public static void main(String[] args) {

		MatricesMultiplica matrices = new MatricesMultiplica();
		matrices.setMatriz();
		matrices.getMatriz();
		System.out.println("------------");
		MatrizSol1 ms1 = new MatrizSol1();
		ms1.cargar();
		ms1.imprimir();
		ms1.imprimirUltimaFila();
	}
}

class MatricesMultiplica {

	private int[][] matriz = null;
	private int f;
	private int c;
	private int patron = ((9 - 1) + 1) + 1;
	private Random ale2;
	private int contador = 0;

	public MatricesMultiplica() {
		f = new Random().nextInt(patron);
		System.out.println("fila: " + f);
		ale2 = new Random();
		c = ale2.nextInt(patron);
		System.out.println("columna: " + c);
		matriz = new int[f][c];
	}

	public int getContador() {
		return contador;
	}

	public int getUltimaFila() {
		return (matriz.length - 1);
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz() {
		for (int j = 0; j < getMatriz().length; j++) {
			for (int k = 0; k < getMatriz()[0].length; k++) {
				getMatriz()[j][k] = (new Random().nextInt(patron));
				if (j < getUltimaFila()) {
					System.out.print(getMatriz()[j][k] + "-");
				}
				if (j == getUltimaFila()) {
					System.out.print(contador++ == 0 ? "\nUltima fila\n" : "");
					if (k >= 0) {
						System.out.print("" + getMatriz()[j][k] + "|");
					}
				}
			}
			System.out.println();
		}
	}
}

class MatrizSol1 {

	private int[][] matriz;

	public void cargar() {
		int fila = (int) (Math.random() * (1 + 10) + 1);
		System.out.print("Filas tiene la matriz: " + fila);
		System.out.println("\n-------------");

		int columna = (int) (Math.random() * (1 + 10) + 1);
		System.out.print("Columna tiene la matriz: " + columna);
		System.out.println("\n-------------");

		matriz = new int[fila][columna];

		for (int f = 0; f < getMatriz().length; f++) {
			for (int c = 0; c < getMatriz()[0].length; c++) {
				System.out.print(f + " - " + c);
				getMatriz()[f][c] = (int) (Math.random() * (1 + 9) + 1);
			}
			System.out.println();
		}
		System.out.println("-------------");
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void imprimir() {
		for (int fila = 0; fila < getMatriz().length; fila++) {
			for (int columna = 0; columna < getMatriz()[0].length; columna++) {
				System.out.print(getMatriz()[fila][columna] + " ");
			}
			System.out.println();
		}
	}

	public void imprimirUltimaFila() {
		System.out.println("-------------");
		System.out.println("Ultima fila");
		int[][] matriz = getMatriz();
		for (int c = 0; c < getMatriz()[matriz.length - 1].length; c++) {
			System.out.print(getMatriz()[matriz.length - 1][c]+ " ");
		}
		System.out.println();
	}
}