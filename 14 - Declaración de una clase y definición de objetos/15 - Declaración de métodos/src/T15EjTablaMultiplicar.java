
import java.util.Scanner;

public class T15EjTablaMultiplicar {

	public static void main(String[] args) {
		TablaMultiplicar t = new TablaMultiplicar();
		t.cargarValor();
	}
}

class TablaMultiplicar {

	public void cargarValor() {
		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.println("Ingrese valor:");
			valor = teclado.nextInt();
			if (valor != -1) {
				calcular(valor);
			}
		} while (valor != 1);
		teclado.close();
	}

	public void calcular(int v) {
		for (int f = v; f <= (v * 10); f = f + v) {
			System.out.println(f + " - ");
		}
	}
}
