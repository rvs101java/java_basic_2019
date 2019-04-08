
public class T22MultiplicarMatrices {

	public static int[][] multiplicacionMatrices ( int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];
			for (int i= 0; i < c.length; i++) {
				for (int j=0; j < c[0].length; j++) {
					for (int k=0; k < b.length; k++) {
						c[i][j] = c[i][j] + a[i][k] * b[k][j];
					}
				}
			}
		return c;
	}
		
	public static void main(String[] args) {

		int[][] a = { 
				/*f0*/   { 2, 4, 4 }, 
				/*f1*/	 { 6, 6, 9 } 
					};
		int[][] b = { 
				/*f0*/	 { 2, 4, 4 }, 
				/*f1*/	 { 6, 6, 9 } 
					};
		
		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}

		for (int ii = 0; ii < c.length; ii++) {
			for (int iii = 0; iii < c[0].length; iii++) {
				System.out.print(c[ii][iii] + "|");
			}
			System.out.println();
		}
	}
}
