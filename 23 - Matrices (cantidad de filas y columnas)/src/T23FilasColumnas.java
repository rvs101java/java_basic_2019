
public class T23FilasColumnas {

	private static int[][] matriz = new int[4][4];

	public static int[][] getArray() {
		return matriz;
	}

	public int[][] getTotal() {
		for (int f = 0; f < getArray().length; f++) {
			for (int c = 0; c < getArray()[f].length; c++) {
				System.out.print(getArray()[f][c] + " ");
			}
			System.out.println();
		}
		return getArray();
	}

	public static void main(String[] args) {

		T23FilasColumnas tfc = new T23FilasColumnas();
		tfc.getTotal();
	}
}
