
/**
 * Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus
 * notas respectivas.
 * 
 * Luego ordenar las notas de mayor a menor.
 * 
 * Imprimir las notas y los nombres de los alumnos
 * 
 * @author Rad
 *
 */
public class T21OrdenacionAlumnos {

	public static void main(String[] args) {

		OrdenacionAlumnos oa = new OrdenacionAlumnos();
		oa.setVerAlumnosNotas();
		oa.setOrdenarAlumnosNotas();
		oa.setVerAlumnosNotas();
		
		System.out.println("------------------");
		Sol1 sol = new Sol1();
		sol.cargar();
		sol.imprimirPorNota();
		sol.ordenar();
		sol.imprimirPorNota();
		
	}
}

class OrdenacionAlumnos {

	private String[] alumnos;
	private double[] notas;
	private static int c = 0;

	public OrdenacionAlumnos() {
		alumnos = new String[] { "Zara", "Juan", "Miguel", "Pepe", "Ana" };
		notas = new double[] { 7.2, 4.3, 8.1, 5.3, 6.2 };
	}

	public String[] getAlumnos() {
		return alumnos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setVerAlumnosNotas() {
		System.out.println((c == 0) ? "-- Ordenacion -- " : "-- Sin Ordenacion --");
		c++;
		for (int i = 0; i < getAlumnos().length; i++) {
			System.out.println(getAlumnos()[i] + " - " + getNotas()[i]);
		}
	}

	public void setOrdenarAlumnosNotas() {
		double aux = 0;
		String auxString;
		for (int f1 = 0; f1 < getNotas().length; f1++) {
			for (int f2 = 0; f2 < (getNotas().length - 1) - f1; f2++) {
				if (getNotas()[f2] < getNotas()[f2 + 1]) {
					aux = getNotas()[f2];
					getNotas()[f2] = getNotas()[f2 + 1];
					getNotas()[f2 + 1] = aux;
					auxString = getAlumnos()[f2];
					getAlumnos()[f2] = getAlumnos()[f2 + 1];
					getAlumnos()[f2 + 1] = auxString;
				}
			}
		}
	}
}

class Sol1 {

	private String[] nombres;
	private double[] notas;

	public void cargar() {
		nombres = new String[] { "Zara", "Babel", "Miguel", "Pepe", "Ana" };
		notas = new double[] { 7.2, 4.3, 8.1, 5.3, 6.2 };
	}

	public void ordenar() {
		double auxnota;
		String auxnombre;
		for (int k = 0; k < notas.length; k++) {
			for (int f = 0; f < (notas.length - 1) - k; f++) {
				if (notas[f] < notas[f + 1]) {
					auxnota = notas[f];
					notas[f] = notas[f + 1];
					notas[f + 1] = auxnota;
					auxnombre = nombres[f];
					nombres[f] = nombres[f + 1];
					nombres[f + 1] = auxnombre;
				}
			}
		}
	}
	
	public void imprimirPorNota() {
		System.out.println("Nombre de alumnos y notas ordenadas de Mayor a Menor");
		for(int f = 0 ; f < notas.length; f++) {
			System.out.println(nombres[f] + " - " + notas[f]);
		}
	}
}