package ejercicios;

public class T11Ej2Imprimir10Numeros {

	public static void main(String[] args) {

		System.out.println("Valores");
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.print((i >= 5) ? "Valor: " + i + "\n" : "");

		}

		System.out.println(
				"Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.\r\n");
		int v = 0;
		for (int j = 0; j <= 10; j++) {
			v += (j >= 5) ? j : 0;
			System.out.print("Valores: " + v + " \n");
		}

		System.out.println("Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)\r\n" + "");

		for (int j = 1; j <= 50; j++) {
			System.out.print(j + " - Valores : " + (j * 5) + " \n");
		}

		System.out.println("Confeccionar un programa que permita ingresar un valor del 1 al 10 \n"
				+ "y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)\r\n"
				+ "Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.");
		int x = (int) (Math.random() * (1 + 10) + 1);
		for (int j = 0; j < 12; j++) {
			System.out.println("Tabla del " + x + " x " + j + " = " + j * x);
		}
		
		
	}
}
