
public class T3Carga10ValoresPorTeclado {

	public static void main(String[] args) {

		double suma = 0;
		double v = 0;
		double c = 0;

		while (c++ < 10) {
			v = (int) (Math.random() * (1 + 10) + 1);
			System.out.println(c + " Numero generado : " + v);
			suma += v;
		}

		System.out.println("Suma total : " + suma);
		System.out.println("Promedio : " + (suma / 10));

		System.out.println("----------");
		Sol1.getSolucion();

	}
}

class Sol1 {

	public static void getSolucion() {
		int x, suma, valor, promedio;
		x = 1;
		suma = 0;
		while (x <= 10) {
			valor = (int) (Math.random() * (1 + 100) + 1);
			System.out.print(valor + " ");
			suma = suma + valor;
			x = x + 1;
		}

		promedio = suma / 10;
		System.out.println("\nLa suma de los 10 numeros es : " + suma);
		System.out.println("El promedio de los 10 numeros es : " + promedio);

	}
}