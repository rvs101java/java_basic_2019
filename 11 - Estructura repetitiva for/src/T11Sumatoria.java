
public class T11Sumatoria {

	public static void main(String[] args) {

		int suma, f, valor, promedio;
		suma = 0;
		for (f = 1; f <= 10; f++) {
			valor = (int) (Math.random() * (1 + 10) + 1);
			System.out.println(f + " Numero generado : " + valor);
			suma = suma + valor;
		}
		System.out.println("La suma es: " + suma);
		promedio = suma / 10;
		System.out.println("El promedio es: " + promedio);
	}
}
