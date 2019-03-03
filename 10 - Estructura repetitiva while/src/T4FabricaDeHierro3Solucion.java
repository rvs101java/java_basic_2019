
import java.util.Scanner;

public class T4FabricaDeHierro3Solucion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x = 1, cantidad = 0, n;
		float largo;
		cantidad = 0;

		System.out.println("Cantidad piezas procesar");
		n = teclado.nextInt();

		while (x <= n) {
			System.out.println("Ingrese la medida de la pieza : ");
			largo = teclado.nextFloat();
			if (largo >= 1.20 && largo <= 1.30) {
				cantidad = cantidad + 1;
			}
			x = x + 1;
		}
		System.out.println("La cantidad de piezas aptas son : " + cantidad);

		teclado.close();
	}
}
