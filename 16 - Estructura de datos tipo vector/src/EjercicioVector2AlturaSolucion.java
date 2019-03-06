import java.util.Scanner;

public class EjercicioVector2AlturaSolucion {

	public static void main(String[] args) {
		Sol1 s1 = new Sol1();
		s1.cargar();
		s1.calcularPromedio();
		s1.mayoresMenores();
	}
}

class Sol1 {

	private Scanner teclado;
	private float[] alturas;
	private float promedio;

	public void cargar() {
		teclado = new Scanner(System.in);
		alturas = new float[5];
		for (int f = 0; f < alturas.length; f++) {
			System.out.println("Ingrese la altura de la persona: ");
			alturas[f] = teclado.nextFloat();
		}
		teclado.close();
	}

	public void calcularPromedio() {
		float suma;
		suma = 0;
		for (int f = 0; f < alturas.length; f++) {
			suma = suma + alturas[f];
		}
		promedio = (suma / alturas.length);
		System.out.println("Promedio de alturas : " + promedio);
	}

	public void mayoresMenores() {
		int may, men;
		may = 0;
		men = 0;
		for (int f = 0; f < alturas.length; f++) {
			System.out.println("alturas[f]: " + alturas[f]);
			if (alturas[f] > promedio) {
				may++;
			} else {
				if (alturas[f] < promedio) {
					men++;
				}
			}
		}
		System.out.println("Cantidad de personas mayores al promedio:" + may);
		System.out.println("Cantidad de personas menores al promedio:" + men);
	}
}