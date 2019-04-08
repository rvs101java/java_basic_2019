/**
* @author Rad
*
*/
package ejemplo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class T17Ej1VectorNElementos {

	public static void main(String[] args) {

		CrearVector cv = new CrearVector();
		cv.setVector(5);
		cv.setElementosVector();
		cv.getRecorrerVector();

		System.out.println("-----------");
		CrearArrays ca = new CrearArrays();
		ca.cargar();
		ca.acumularElementos();
	}

}

class CrearVector {

	// Defino
	private double[] vector;

	// Dimensiono
	public void setVector(int longitud) {
		this.vector = new double[longitud];
	}

	// Devuelvo
	public double[] getVector() {
		return vector;
	}

	// Asigno valores
	public void setElementosVector() {
		for (int i = 0; i < getVector().length; i++) {
			getVector()[i] = (double) (Math.random() * (1 + 1000) + 1);
		}
	}

	// Muestra sus valores
	public void getRecorrerVector() {
		for (int i = 0; i < getVector().length; i++) {
			System.out.println("Valores: " + get2Decimales(getVector()[i]));
		}
	}

	// Solo muestra 2 ceros
	public double get2Decimales(double valores) {
		BigDecimal bd = new BigDecimal(valores);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}

class CrearArrays {

	private Scanner teclado;
	private int[] vec;

	public void cargar() {
		// Declaracion
		teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos tiene el vector");
		int n = 0;
		n = teclado.nextInt();
		vec = new int[n];

		// Procesamiento
		for (int f = 0; f < vec.length; f++) {
			System.out.println("Ingrese elemento: ");
			vec[f] = teclado.nextInt();
		}
	}

	// Procesamiento
	public void acumularElementos() {
		int suma = 0;
		for (int f = 0; f < vec.length; f++) {
			suma += vec[f];
		}
		System.out.println("La suma de los elementos es: " + suma);
	}
}
