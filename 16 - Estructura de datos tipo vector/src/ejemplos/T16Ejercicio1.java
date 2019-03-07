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
public class T16Ejercicio1 {

	public static void main(String[] args) {

		Vectores v = new Vectores();
		v.getElementos((int) (Math.random() * (1 + 10) + 10));
		v.getAcumulado();
		v.getAcumuladoMayor36();
		v.getAcumuladoMayor50();
	}
}

class Vectores {

	private double[] vector;
	private double[] acumulado;

	public void getElementos(int vectorPara) {
		int i = 0;
		System.out.println("- Indice : " + vectorPara);
		if ((vectorPara < 7) || (vectorPara > 9)) {
			vectorPara = (int) (Math.random() * (1 + 10) + 1);
			System.out.println("Numero generado: " + vectorPara);
			while (vectorPara != 8) {
				System.out.println((++i) + " Repite numero: " + (vectorPara = (int) (Math.random() * (1 + 10) + 1)));
			}
		}
		vector = new double[vectorPara];
	}

	public void getAcumulado() {
		acumulado = new double[vector.length];
		for (int i = 0; i < vector.length; i++) {
			acumulado[i] += (Math.random() * (1 + 100) + 1);
		}
	}

	public void getAcumuladoMayor36() {
		double total = 0;
		System.out.println("-----------------");
		for (int i = 0; i < acumulado.length; i++) {
			if (acumulado[i] <= 36) {
				System.out.println("Mayor de 36: " + acumulado[i]);
			}
			total += acumulado[i];
		}
		get2Decimales(total);
	}

	public void getAcumuladoMayor50() {
		double total = 0;
		System.out.println("-----------------");
		for (int i = 0; i < acumulado.length; i++) {
			if (acumulado[i] > 50) {
				System.out.println("Mayor de 50: " + acumulado[i]);
			}
			total += acumulado[i];
		}
		get2Decimales(total);

	}

	public void get2Decimales(double valor) {
		BigDecimal bd = new BigDecimal(valor);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		valor = bd.doubleValue();
		System.out.println("Total: " + valor);
	}

}
