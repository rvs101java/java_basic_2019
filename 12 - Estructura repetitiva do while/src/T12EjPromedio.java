
public class T12EjPromedio {

	public static void main(String[] args) {

		// Declaracion
		double x = (Math.random() * (1 + 100) + 1);
		int promedio = 0;
		int c = 0;

		// Procesamiento
		do {
			System.out.println((c++) + " " + (promedio += x));
		} while (c <= 1000);
	}
}
