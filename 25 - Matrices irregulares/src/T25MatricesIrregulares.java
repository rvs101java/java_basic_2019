
public class T25MatricesIrregulares {

	public static void main(String[] args) {

		MatrizIrregular mi = new MatrizIrregular();

	}

}

class MatrizIrregular {

	private int[][] mat = null;

	public MatrizIrregular() {
		mat = new int[3][];
		mat[0] = new int[2];
		mat[1] = new int[4];
		mat[2] = new int[3];

		mat[0][0] = 120;
		mat[0][1] = 230;

		System.out.println("Filas: " + mat.length);
		System.out.println("Filas: " + mat[0].length);
		System.out.println("Filas: " + mat[1].length);
		System.out.println("Filas: " + mat[2].length);

	}

}