package ejercicios;

/**
 * Realizar un programa que acumule (sume) valores ingresados por teclado hasta
 * ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
 * Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o
 * menor a cero.
 * 
 * @author Rad
 *
 */
public class T12Ej1ContadorHasta9999 {

	public static void main(String[] args) {
		int con = 0, suma = 0;
		do {
			int num = (int) (Math.random() * (1 + 100) + 10);
			System.out.println((con++) + "º " + "Numero generado: " + num);
			suma += ((num >= 9999) ? 0 : num);
		} while (suma <= 9999);
		System.out.println("Sumatoria: " + suma);

		System.out.println("---------------");
		Sol1.getSol1();
	}
}

class Sol1 {

	public static void getSol1() {

		int suma, valor = 0;
		suma = 0;
		do {
			int x = (int) (Math.random() * (1 + (-100)) + (200));
			System.out.println("Ingresa un valor: " + x);
			if (x <= 9999) {
				valor = suma += x;
			}
		} while (valor <= 9999);

		System.out.println("El valor acumulado es: " + suma);

		if (suma == 0) {
			System.out.println("El valor acumulado es cero");
		} else {
			if (suma > 0) {
				System.out.println("El valor acumulado es positivo");
			} else {
				System.out.println("El valor acmululado es negativo");
			}
		}
	}
}