package ejemplos;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e
 * informe: El valor acumulado de todos los elementos del vector. El valor
 * acumulado de los elementos del vector que sean mayores a 36. Cantidad de
 * valores mayores a 50.
 * 
 * @author Rad
 *
 */
public class T16Ejercicio3 {

	public static void main(String[] args) {

		Notas notas = new Notas();
		notas.getNotas1();
		notas.getNotas2();
		notas.getPromedio();
	}
}

class Notas {

	private double[] cursoA;
	private double[] cursoB;

	public double[] getCursoA() {
		return cursoA;
	}

	public double[] getCursoB() {
		return cursoB;
	}

	public double getNotas1() {
		System.out.println("1 Curso: ");
		int total = 0;
		cursoA = new double[5];
		for (int i = 0; i < cursoA.length; i++) {
			cursoA[i] += (double) (Math.random() * (1.0 + 9.) + 1.0);
			get2Decimales(cursoA[i]);
			total += cursoA[i];
		}
		System.out.println("Total de la notas: " + total);
		return total;
	}

	public double getNotas2() {
		System.out.println("2 Curso: ");
		int total = 0;
		cursoB = new double[5];
		for (int i = 0; i < cursoB.length; i++) {
			cursoB[i] += (double) (Math.random() * (1.0 + 9.) + 1.0);
			get2Decimales(cursoB[i]);
			total += cursoB[i];
		}
		System.out.println("Total de las notas: " + total);
		return total;
	}

	public void getPromedio() {
		if ((getNotas1() / getCursoA().length) > (getNotas2() / getCursoB().length)) {
			System.out.println("Curso A tiene mayor promedio: " + (getNotas1() / getCursoA().length));
		} else {
			System.out.println("Curso B tiene mayor promedio: " + (getNotas2() / getCursoB().length));
		}
	}

	public void get2Decimales(double valor) {
		BigDecimal bd = new BigDecimal(valor);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		valor = bd.doubleValue();
		System.out.println("Notas: " + valor);
	}

}
