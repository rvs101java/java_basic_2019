import java.util.Scanner;

public class T8CorregirTest {

	private static double preguntas;
	private static double respuestas;

	private Scanner sc = new Scanner(System.in);

	public T8CorregirTest() {
		T8CorregirTest.preguntas = 0;
		respuestas = 0;
	}

	public static void main(String[] args) {

		double porcentaje = 0;
		double total = 0;

		T8CorregirTest ct = new T8CorregirTest();

		System.out.println("Introduce numero de preguntas");
		preguntas = ct.sc.nextInt();
		System.out.println("Numero de preguntas son : " + preguntas);

		System.out.println("Introduce numero de respuestas");
		respuestas = ct.sc.nextInt();
		System.out.println("Numero de respuestas son : " + respuestas);

		porcentaje = (respuestas / preguntas);

		System.out.println("Porcentaje : " + porcentaje + "% de respuestas");

		total = (double) (porcentaje * 100);

		System.out.println("total : " + total + "% de respuestas");

		if (total >= 90) {
			System.out.println("Nivel Maximo : " + (int) total);
		}
		if (total < 90 && total >= 75) {
			System.out.println("Nivel medio : " + (int) total);
		}
		if (total < 75 && total >= 50) {
			System.out.println("Nivel regular : " + (int) total);
		}
		if (total < 50) {
			System.out.println("Fuera del Nivel  : " + (int) total);
		}

		SolucionTest.getTestResuelto();

	}
}

class SolucionTest {

	public static void getTestResuelto() {
		Scanner sc = new Scanner(System.in);
		int totalPreguntas, totalCorrectas;
		System.out.println("Ingrese la cantidad total de preguntas del examen");
		totalPreguntas = sc.nextInt();
		System.out.println("Ingrese la cantidad total de preguntas contestadas correctamente");
		totalCorrectas = sc.nextInt();
		int porcentaje = (totalCorrectas * 100) / totalPreguntas;
		if (porcentaje >= 90) {
			System.out.println("Nivel maximo : " + porcentaje);
		} else {
			if (porcentaje >= 75) {
				System.out.println("Nivel medio : " + porcentaje);
			} else {
				if (porcentaje >= 50) {
					System.out.println("Nivel regular : " + porcentaje);
				} else {
					System.out.println("Fuera de nivel : " + porcentaje);
				}
			}
		}

		sc.close();
	}
}
