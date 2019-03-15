package ejemplos;

public class T7PruebaIfAnidados {

	public static void main(String[] args) {

		int x = (int) (Math.random() * (1 + 100) + 1);
		int y = (int) (Math.random() * (1 + 100) + 1);

		if (4 > 9) {
		} else {
			System.out.println("falso");
		}

		if (4 < 9) {
			System.out.println("verdadero");
		} else {
		}

		System.out.println("Valor de x : " + x);
		System.out.println("Valor de y : " + y);

		if (x < y) {
			System.out.println("+ x: " + x + " es menor " + y + " y: " + y);
		} else {
			System.out.println("- x: " + x + " es mayor " + y + " y: " + y);
		}

	}
}
