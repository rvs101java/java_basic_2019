package ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
 * realizar un programa que lea los sueldos que cobra cada empleado e informe
 * cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
 * Además el programa deberá informar el importe que gasta la empresa en sueldos
 * al personal.
 * 
 * @author Rad
 *
 */
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

		Sol3.getSol3();

	}
}

class Sol3 {

	public static void getSol3() {
		// Declaro las variables
		int n, x = 1, conta1, conta2;
		float sueldo, gastos;
		n = (int) (Math.random() * (1 + 10) + 1);
		System.out.println("----------------------------------------");
		System.out.println("Cuantos empleados tiene la empresa : " + n);
		conta1 = 0;
		conta2 = 0;
		gastos = 0;

		// Procesamiento
		while (x <= n) {
			// System.out.println("Ingrese el sueldo del empleado");
			sueldo = (int) (Math.random() * (100 + 300) + 100);
			if (sueldo <= 300) {
				conta1 += 1;
			} else {
				conta2 += 1;
			}
			gastos += sueldo;
			x = x + 1;
		}

		System.out.println("Cantidad de empleados con sueldos entre 100 y 300: " + conta1);
		System.out.println("Cantidad de empleados con sueldos mayor a 300: " + conta2);
		System.out.println("Gastos total de la empresa en sueldos: " + gastos);
	}
}
