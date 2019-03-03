
import java.util.Scanner;

public class T4FabricaDeHierro2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int apta = 0;
		int cantidad = 0;
		double longitud = 0;

		System.out.println("Introduce la cantidad de piezas");
		cantidad = sc.nextInt();

		while (contador < cantidad) {
			System.out.println("Introduce la cantidad la longitud de piezas");
			longitud = sc.nextDouble();
			if (longitud >= 1.20 && longitud <= 1.30) {
				apta++;
				System.out.println("Longitud Aceptada : " + longitud);
			} else {
				System.out.println("Longitud No Aceptada : " + longitud);
			}
			contador++;
		}
		System.out.println("Cantidad de piezas: " + cantidad + " - Cantidad de Piezas Aptas: " + apta);
		sc.close();
	}
}
