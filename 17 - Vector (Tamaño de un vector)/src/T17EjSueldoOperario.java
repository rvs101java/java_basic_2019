import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class T17EjSueldoOperario {

	public static void main(String[] args) {

		SueldoOperario so = new SueldoOperario();
		so.setArraySueldos(10);
		so.getSueldoOperarios();
		so.setRecorrerSueldos();

		System.out.println("---------------");
		CrearSueldos cs = new CrearSueldos();
		cs.cargar();
		cs.imprimir();
	}
}

class SueldoOperario {

	private static double[] arraySueldos;
	private double sueldoTotal;

	public SueldoOperario() {
		sueldoTotal = 0;
		arraySueldos = new double[0];
	}

	// obtener array de sueldos
	public double[] getArraySueldos() {
		return arraySueldos;
	}

	// obtener valores
	public double getSueldo() {
		return sueldoTotal;
	}

	// establecer longitud del array
	public double[] setArraySueldos(int numero) {
		arraySueldos = new double[numero];
		return arraySueldos;
	}

	// devuelve array con sueldos
	public double[] getSueldoOperarios() {
		for (int i = 0; i < getArraySueldos().length; i++) {
			getArraySueldos()[i] = (Math.random() * (1 + 1000) + 1);
			setRecorrerSueldos();
		}
		return arraySueldos;
	}

	// ver sueldos establecidos
	public void setRecorrerSueldos() {
		for (int i = 0; i < getArraySueldos().length; i++) {
			System.out.println("Sueldos creados: " + get2Decimales(getArraySueldos()[i]));
		}
	}

	// establecer 2 decimales
	public double get2Decimales(double valor) {
		BigDecimal bd = new BigDecimal(valor);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

}

class CrearSueldos {
	private Scanner teclado;
	private int[] sueldos;

	public void cargar() {
		// Declaracion
		teclado = new Scanner(System.in);
		System.out.println("Cuantos sueldos cargara: ");
		int cant;
		cant = teclado.nextInt();
		sueldos = new int[cant];

		// Procesamiento
		for (int f = 0; f < sueldos.length; f++) {
			System.out.println("Ingrese sueldo: s");
			sueldos[f] = teclado.nextInt();
		}
	}

	public void imprimir() {
		int c = 0;
		for (int f = 0; f < sueldos.length; f++) {
			System.out.println("Sueldos nº " + (++c) + " : " + sueldos[f]);
		}
	}
}