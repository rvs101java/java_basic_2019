import java.util.Scanner;

public class SueldoOperario {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int horasTrabajadas;
		float costoHora;
		float sueldo;

		System.out.println("Ingrese la cantidad de horas trabajadas por el empleado");
		horasTrabajadas = teclado.nextInt();

		System.out.print("Ingrese el valor de la hora: ");
		costoHora = teclado.nextFloat();

		sueldo = (horasTrabajadas * costoHora);

		System.out.print("El empleado debe cobrar : " + sueldo);

		
	}
}
