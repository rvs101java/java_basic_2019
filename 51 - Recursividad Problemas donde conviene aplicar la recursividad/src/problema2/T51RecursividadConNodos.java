package problema2;

import java.io.File;

/**
 * Recorrer un árbol de directorios en forma recursiva.
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 23 may. 2019 - 21:52:13
 */
public class T51RecursividadConNodos {

	public static void main(String[] args) {
		RecursividadDirectorios rd = new RecursividadDirectorios();
		rd.leer("c:\\xJavaProyectos\\", "");
	}
}

/**
 * 
 * 23 may. 2019 - 21:53:28
 */
class RecursividadDirectorios {

	/**
	 * Leer jerarquia de archivos y directorios de forma recursiva
	 * 
	 * @param inicio
	 *            - ruta de directorios
	 * @param altura
	 *            -
	 */
	public void leer(String inicio, String altura) {

		// Creamos un objeto de la clase File con el dire. que llega como parametro 
		File ar = new File(inicio);// Leccionamos la ruta

		// Mediante el metodo 'list' obtenemos todos los archivos y dire. del directorio
		String[] dir = ar.list();// list() devuelve String[]

		for (int f = 0; f < dir.length; f++) { // Recorre la lista de archivos y directorios

			File ar2 = new File(inicio + dir[f]); // Creamos un nuevo obj. que tiene por argu. la ruta y la lista de directorios

			if (ar2.isFile()) {
				System.out.println("+ " + altura + dir[f]);
			}

			// Si es directorio llamamos recursivamente al metodo 'leer' con el dire. nuevo a procesar.
			if (ar2.isDirectory()) {
				System.out.println("# " + altura + "Directorio: " + dir[f].toUpperCase());
				leer((inicio + dir[f] + "\\"), (altura + " - "));
			}
		}
	}
}
