
public class T8NumInicioMaximo {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = (int) (Math.random() * (1 + 30) + 10);

		while (n1 < n2) {
			System.out.println(n1 = n1 + 1);
		}

		// Declaro las variables
		int n, x = 0;
		// Procesamiento
		System.out.println("Se genera el valor final : ");
		n = (int) (Math.random() * (1 + 30) + 1);
		x = 0;
		while (x <= n) {
			if (x % 10 == 0) {
				System.out.println();
			}
			x = x + 1;
			System.out.print(x + " - ");
		}
		System.out.println("\nFin");
	}
}
