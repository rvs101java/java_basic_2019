
import java.util.Random;

public class T11MayoresIguales1000 {

	public static void main(String[] args) {

		int nMayor = 0, nMenor = 0;
		int i;
		int total = (int) (Math.random() * (1 + 100));
		for (i = 1; i <= total; i++) {
			int valor = (int) (Math.random() * (1 + 10000) + 1);
			System.out.println("Valor generado : " + valor);
			System.out.println((valor >= 1000) ? (valor + " - Mayor de 1000: " + (++nMayor))
					: (valor + " + Menor de 1000: " + (++nMenor)));
		}
		System.out.println("Numero ejecutados: " + i + " - nMayor: " + nMayor + " + nMenor: " + nMenor);

		System.out.println("-----------------");
		Sol1.getSol1();
	}
}

class Sol1 {

	public static void getSol1() {

		int cantidad, n, f, valor;
		cantidad = 0;
		System.out.println("Cuantos valores ingresara: ");
		n = new Random().nextInt(10);
		for (f = 1; f <= n; f++) {
			System.out.println(f + " - Ingresado el valor: " + (valor = new Random().nextInt(10000)));
			if (valor >= 1000) {
				cantidad++;
			}
		}
		System.out.println("La cantidad de valores ingresados mayores o menores o iguales a 1000 son: " + cantidad);
	}
}