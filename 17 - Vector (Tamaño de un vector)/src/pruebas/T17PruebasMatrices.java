package pruebas;

public class T17PruebasMatrices {

	public static void main(String[] args) {

//		Sin asignacion
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				suma = (i + j);
			}
		}
		System.out.println(suma);

//		Con asignacion
		int suma1 = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				suma1 += (i + j);
			}
		}
		System.out.println(suma1);
	}
}
