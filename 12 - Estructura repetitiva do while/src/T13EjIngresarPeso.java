
public class T13EjIngresarPeso {

	public static void main(String[] args) {

		int suma = 0, promedio = 0, cant = 0;
		int valor = (int) (Math.random() * (1 + 100) + 1);

		do {
			if (valor != 0) {
				suma += valor;
				cant += 1;
			}
			valor++;
		} while (valor <= 100);

		if (cant != 0) {
			System.out.println("No se ingresaron valores");
		} else {
			promedio = (suma / cant);
			System.out.println("Promedio : " + promedio);
		}

		
		int suma1 = 0, con1 = 0, cant1 = 0, valor1 = 0, promedio1 = 0;
		cant1 = 0;

		do {
			valor1 = (int) (Math.random() * (1 + 100));
			System.out.println("Valores ingresados: " + valor1);

			if (con1 <= 100) {
				suma1 = suma1 + valor;
				cant++;
			}
		} while (con1++ < 100);

		if (cant1 != 0) {
			promedio1 = (suma1 / cant1);
			System.out.println("El promedio de los valores : " + promedio1);
		} else {
			System.out.println("No se ingresaron valores");
		}
	}
}
