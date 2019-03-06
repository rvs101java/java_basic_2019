
import java.util.Scanner;

public class T15EjRetornarValores {

	public static void main(String[] args) {

		MayorMenor mm = new MayorMenor();
		mm.cargarValores();

	}
}

class MayorMenor {

	public void cargarValores() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 1º valor: ");
		int valor1 = sc.nextInt();

		System.out.println("Ingrese 2º valor: ");
		int valor2 = sc.nextInt();

		System.out.println("Ingrese 3º valor: ");
		int valor3 = sc.nextInt();

		int mayor = 0;
		System.out.println("Mayor : " + (mayor = calcularMayor(valor1, valor2, valor3)));
		
		int menor = 0;
		System.out.println("Menor : " + (menor = calcularMenor(valor1, valor2, valor3)));
		sc.close();
	}

	public int calcularMenor(int v1, int v2, int v3) {
		int m;
		if (v1 < v2 && v1 < v3) {
			m = v1;
		} else {
			if (v2 < v3) {
				m = v2;
			} else {
				m = v3;
			}
		}
		return m;
	}

	public int calcularMayor(int v1, int v2, int v3) {
		int m;
		if (v1 > v2 && v1 > v3) {
			m = v1;
		} else {
			if (v2 > v3) {
				m = v2;
			} else {
				m = v3;
			}
		}
		return m;
	}
}
