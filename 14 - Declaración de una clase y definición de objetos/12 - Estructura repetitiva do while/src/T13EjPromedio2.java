import java.util.Scanner;

/**
 * Realizar un programa que permita ingresar el peso (en kilogramos) de piezas.
 * 
 * El proceso termina cuando ingresamos el valor 0. Se debe informar:
 * 
 * a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más
 * de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?
 * 
 * b) La cantidad total de piezas procesadas.
 * 
 * @author Rad
 *
 */
public class T13EjPromedio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int piezaEstandar = 0;
		int piezaMayores = 0;
		int piezaMenores = 0;
		int totalPiezas = 0;

		double tallaPequeña = 9.2;
		double tallaGrande = 10.2;

		double medida = 0;

		do {
			System.out.println("Introduce una medida entre 9.8 y 10.2 kg");
			medida = sc.nextDouble();
			if ((medida >= tallaPequeña) && (medida <= tallaGrande)) {
				System.out.println("Pieza agregada : " + medida);
				piezaEstandar++;
				totalPiezas++;
			}
			if (medida >= tallaGrande) {
				System.out.println("Pieza agregada superior a : " + medida);
				piezaMayores++;
				totalPiezas++;
			}
			if ((medida <= tallaPequeña) && (medida > 0)) {
				System.out.println("Pieza agregada inferior a  : " + medida);
				piezaMenores++;
				totalPiezas++;
			}
		} while (medida != 0);

		System.out.println("Pieza agregada entre : " + tallaPequeña + " y " + tallaGrande + " : " + piezaEstandar);
		System.out.println("Pieza inferior a " + tallaPequeña + " agregada: " + piezaMenores);
		System.out.println("Pieza superior a " + tallaGrande + " agregada: " + piezaMayores);
		System.out.println("Total de piezas : " + totalPiezas);
		// sc.close(); // Si dejo esta sentencia el programa deja de ejecutarse

		System.out.println("-------------------");
		Sol4.getSol4();

	}
}

class Sol4 {

	public static void getSol4() {
		Scanner teclado = new Scanner(System.in);
		int cant1, cant2, cant3, suma;
		float peso = 0;
		cant1 = 0;
		cant2 = 0;
		cant3 = 0;

		do {
			System.out.println("Ingrese el peso de la pieza (0 para finalizar) ");
			peso = teclado.nextFloat();

			if (peso > 10.2) {
				cant1++;
			} else {
				if (peso >= 9.8) {
					cant2++;
				} else {
					if (peso > 0) {
						cant3++;
					}
				}
			}
		} while (peso != 0);
		suma = (cant1 + cant2 + cant3);

		System.out.println("Piezas aptas: " + suma);
		System.out.println("Piezas con un peso superior a 10.2: " + cant1);
		System.out.println("Piezas con un peso superior a 9.8: " + cant2);
		System.out.println("Piezas con un peso inferior a 0 y menor a 9.8: " + cant3);
		teclado.close();
	}
}
