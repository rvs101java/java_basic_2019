package problemaspropuestos;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
public class T24ProblemasPropuestos {

	public static void main(String[] args) {

		TemperaturaPaises tp = new TemperaturaPaises();
		tp.setTemperaturaMedia();
		tp.verTemperaturaMedia();

	}
}

class TemperaturaPaises {

	/**
	 * Se desea saber la temperatura media trimestral de cuatro paises.
	 */
	private String[] paises;
	private double[][] temperatura;
	private double[] temperaturaMedia;

	public TemperaturaPaises() {
		paises = new String[] { "Irak", "Noruega", "Australia", "Vietnam" };
		temperatura = new double[][] { { 26.2, 25.2, 24.4 }, { 11.2, 15.2, 17.2 }, { 20.2, 21.8, 21.9 },
				{ 26.6, 28.4, 29.4 } };
		temperaturaMedia = new double[getPaises().length];
	}

	public String[] getPaises() {
		return paises;
	}

	public double[][] getTemperatura() {
		return temperatura;
	}

	public double[] getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public double get2Decimales(double decimal) {
		double resultado;
		BigDecimal bd = new BigDecimal(decimal);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		resultado = bd.doubleValue();
		return resultado;
	}

	public double[] setTemperaturaMedia() {
		for (int f = 0; f < getTemperatura().length; f++) {
			for (int c = 0; c < getTemperatura()[f].length; c++) {
				getTemperaturaMedia()[f] += (getTemperatura()[f][c] / getTemperatura().length);
			}
		}
		return getTemperaturaMedia();
	}

	public double[] verTemperaturaMedia() {
		int contador = 1;
		for (int f = 0; f < getPaises().length; f++) {
			System.out.println((contador) + "- Pais: " + getPaises()[f] + " - Temperatura Media: "
					+ get2Decimales(getTemperaturaMedia()[f]));
			for (int c = 0; c < getTemperatura()[f].length; c++) {
				System.out.println((contador) + " - " + getTemperatura()[f][c]);
			}
			contador++;
		}
		return temperaturaMedia;
	}

	public double[] getTemperaturaMayor() {
		int contador = 1;
		for (int f = 0; f < getPaises().length; f++) {

		}
		return temperaturaMedia;
	}

}