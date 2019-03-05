package ejercicios;

import java.util.Scanner;

/**
 * En un banco se procesan datos de las cuentas corrientes de sus clientes.
 * 
 * De cada cuenta corriente se conoce: número de cuenta y saldo actual.
 * 
 * El ingreso de datos debe finalizar al ingresar un valor negativo en el número
 * de cuenta.
 * 
 * Se pide confeccionar un programa que lea los datos de las cuentas corrientes
 * e informe:
 * 
 * a)De cada cuenta: número de cuenta y estado de la cuenta según su
 * saldo,sabiendo que:
 * 
 * Estado de la cuenta 'Acreedor' si el saldo es >0.
 * 
 * 'Deudor' si el saldo es <0.
 * 
 * 'Nulo' si el saldo es =0.
 * 
 * b) La suma total de los saldos acreedores.
 * 
 * @author Rad
 *
 */
public class T12Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int acreedor = 0, deudor = 0, nulo = 0;
		int totalAcreedor = 0;
		int totalDeudor = 0;

		do {
			int numeroCuentaAuto = (int) (Math.random() * (1 + 1000) + 1);
			double saldoAuto = (Math.random() * (1 + 1000) + (-500.0));

			if (saldoAuto > 0) {
				System.out.println("Numero cuenta: " + numeroCuentaAuto);
				System.out.println("Saldo : " + saldoAuto);
				System.out.println("Acreedor: " + (++acreedor));
				totalAcreedor += saldoAuto;
			}

			if (saldoAuto <= 0) {
				System.out.println("Numero cuenta: " + numeroCuentaAuto);
				System.out.println("Saldo : " + saldoAuto);
				System.out.println("Deudor: " + (++deudor));
				totalDeudor += saldoAuto;
			}

			if (saldoAuto == 0) {
				System.out.println("Numero cuenta: " + numeroCuentaAuto);
				System.out.println("Saldo : " + saldoAuto);
				System.out.println("Nulo: " + (++nulo));
			}

			System.out.println("Salir del programa: pulsando : '0' ");
			x = sc.nextInt();
		} while (x != 0);

		System.out.println("Acreedores: " + acreedor + " total de beneficio: " + totalAcreedor);
		System.out.println("Deudor: " + deudor + " total de deuda: " + totalDeudor);
		System.out.println("Nulo: " + nulo);

		Sol2.getSol2();

	}
}

class Sol2 {

	public static void getSol2() {
		Scanner sc = new Scanner(System.in);
		int cuenta = 0;
		float saldo, suma = 0;
		
		do {
			System.out.println("Ingrese numero de cuenta: ");
			cuenta = sc.nextInt();

			if (cuenta >= 0) {
				System.out.println("Ingrese saldo: ");
				saldo = sc.nextFloat();
				
				if (saldo > 0) {
					System.out.println("Saldo Acreedor");
					suma += saldo;
					
				} else {
					if (saldo < 0) {
						System.out.println("Saldo Deudor");
						
					} else if (saldo == 0) {
						System.out.println("Saldo Nulo");
					}
				}
			}
		} while (cuenta != 0);
		System.out.println("Total de saldos Acreedores: ");
		System.out.println(suma);
		sc.close();
	}
}
