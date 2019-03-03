package ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.ToLongBiFunction;

public class T8Ej3SueldosEmpresa {

	public static void main(String[] args) {

		int c = 0;
		int numEmpleados = (int) (Math.random() * (1 + 50) + 11);
		int sueldoMenor300 = 0;
		int sueldoMayor300 = 0;
		double sueldoEmpleado = 0;
		double totalSueldos = 0;

		while (++c < numEmpleados) {
			sueldoEmpleado = (Math.random() * (1 + 400) + 100);
			
			System.out.println("Nº empleado " + c);
			if (sueldoEmpleado <= 300) {
				System.out.println(" - Sueldo : " + sueldoEmpleado);
				sueldoMenor300++;
			} else {
				System.out.println(" - Sueldo : " + sueldoEmpleado);
				sueldoMayor300++;
			}
			totalSueldos += sueldoEmpleado;
		}

		BigDecimal bd = new BigDecimal(totalSueldos);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Sueldo menores a 300€ " + sueldoMenor300);
		System.out.println("Sueldo mayores a 300€ " + sueldoMayor300);
		System.out.println("Sueldos totales : " + bd);

	}
}
