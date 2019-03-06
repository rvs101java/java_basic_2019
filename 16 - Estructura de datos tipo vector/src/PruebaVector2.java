
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PruebaVector2 {

	public static void main(String[] args) {
		VectorFloat vf = new VectorFloat();
		vf.getAltura();
		vf.getPersonaAlta();
		vf.getPersonaBaja();
		vf.getPromedio();
	}
}

class VectorFloat {

	private static float altas;
	private static float bajas;
	private float promedio;
	private float[] personas = new float[4];

	public void getAltura() {
		int ii = 0;
		for (int i = 0; i < personas.length; i++) {
			personas[i] = (float) (Math.random() * (0.1 + 1.0) + 1.00);
			System.out.println(++ii + " - Alturas creadas: " + get2Digitos(personas[i]));
		}
		System.out.println("-----------------");
	}

	public void getPersonaAlta() {
		float[] alta = new float[personas.length];
		for (int i = 0; i < alta.length; i++) {
			alta[i] = personas[i];
		}
		for (int i = 1; i < alta.length; i++) {
			if (alta[0] < alta[i]) {
				altas = alta[0] = alta[i];
			} else {
				altas = alta[i] = alta[0];
			}
		}
		System.out.println("Mas alto: " + get2Digitos(altas));
	}

	public void getPersonaBaja() {
		float[] baja = new float[personas.length];
		for (int i = 0; i < baja.length; i++) {
			baja[i] = personas[i];
		}
		for (int i = 1; i < baja.length; i++) {
			if (baja[0] < baja[i]) {
				bajas = baja[0];
			} else {
				bajas = baja[0] = baja[i];
			}
		}
		System.out.println("Mas bajo: " + get2Digitos(bajas));
	}

	public double getPromedio() {
		for (int i = 0; i < personas.length; i++) {
			promedio += personas[i];
		}
		System.out.println("Promedio de altura: " + get2Digitos(promedio / personas.length));
		return (promedio / personas.length);
	}

	public float get2Digitos(float numero) {
		BigDecimal bd = new BigDecimal(numero);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return (float) bd.doubleValue();
	}

}

class Sol1 {

	private Scanner teclado;
	private float [] alturas;
	private float promedio;
}
