package problemaspropuestos;

import java.util.Scanner;

/**
 * Se desea saber la temperatura media trimestral de cuatro paises.
 * 
 * Para ello se tiene como dato las temperaturas medias mensuales de dichos
 * paises.
 * 
 * Se debe ingresar el nombre del país y seguidamente las tres temperaturas
 * medias mensuales.
 * 
 * Seleccionar las estructuras de datos adecuadas para el almacenamiento de los
 * datos en memoria.
 * 
 * a - Cargar por teclado los nombres de los paises y las temperaturas medias
 * mensuales.
 * 
 * b - Imprimir los nombres de las paises y las temperaturas medias mensuales de
 * las mismas.
 * 
 * c - Calcular la temperatura media trimestral de cada país.
 * 
 * c - Imprimr los nombres de las provincias y las temperaturas medias
 * trimestrales.
 * 
 * b - Imprimir el nombre de la provincia con la temperatura media trimestral
 * mayor.
 * 
 * @author Rad
 *
 */
public class T24ProblemasPropuestosSol {

	public static void main(String[] args) {

		TemperaturaPaisesSol tp = new TemperaturaPaisesSol();
		tp.cargar();
		tp.imprimirTempMensuales();
		tp.calcularTemperaturaTri();
		tp.imprimirTempTrimestrales();
		tp.paisMayorTemperaturaTri();

	}
}

class TemperaturaPaisesSol {

	/**
	 * Se desea saber la temperatura media trimestral de cuatro paises.
	 */
	private Scanner teclado;
	private String[] paises;
	private int[] temptri;
	private int[][] tempmen;

	public void cargar() {
		teclado = new Scanner(System.in);
		paises = new String[4];
		tempmen = new int[4][3];
		
		for (int f = 0; f < paises.length; f++) {
			System.out.println("Ingrese el nombre del pais: ");
			paises[f] = teclado.next();
			for (int c = 0; c < tempmen[f].length; c++) {
				System.out.print("Ingrese temperatura mensual:");
				tempmen[f][c] = teclado.nextInt();
			}
		}
	}
	
	public void imprimirTempMensuales() {
		for (int f = 0; f < paises.length; f++) {
			System.out.print("Pais: " + paises[f] + ":");
			for (int c = 0; c < tempmen[f].length; c++) {
				System.out.print(tempmen[f][c] + " ");
			}
			System.out.println();
		}
	}
	
	public void calcularTemperaturaTri() {
		temptri = new int[4];
		for (int f = 0; f < tempmen.length; f++) {
			int suma = 0;
			for (int c = 0; c < tempmen[f].length; c++) {
				suma = suma + tempmen[f][c];
			}
			temptri[f] = suma / 3;
		}
	}

	public void imprimirTempTrimestrales() {
		System.out.println("Temperaturas trimestrales");
		for (int f = 0; f < paises.length; f++) {
			System.out.println(paises[f] + " " + temptri[f]);
		}
	}

	public void paisMayorTemperaturaTri() {
		int may = temptri[0];
		String nom = paises[0];
		for (int f = 0; f < paises.length; f++) {
			if (temptri[f] > may) {
				may = temptri[f];
				nom = paises[f];
			}
		}
		System.out.println("Pais con temperatura trimestral mayor es: " + nom + " que tiene una temperatura de : " + may);
	}
}
