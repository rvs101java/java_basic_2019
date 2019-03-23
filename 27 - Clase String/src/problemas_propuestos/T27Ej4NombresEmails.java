package problemas_propuestos;

import java.net.CookieHandler;
import java.util.Scanner;

public class T27Ej4NombresEmails {

	public static void main(String[] args) {

		Personas p = new Personas();
		// p.getNombreEmail();
		p.verNombreEmail();
		// p.getEmailPorNombre();
		p.getEmailNoValido();
	}
}

class Personas {

	private Scanner sc;
	private String[][] datos1 = new String[4][2];
	private String[][] datos = new String[][] { { "ana1", "ap1@gmail.com" }, { "ana2", "bbp2@gmail.com" },
			{ "ana3", "cccp3gmail.com" }, { "ana4", "ddddp4gmail.com" }, { "ana5", "xxxxxxp5@gmail.com" }, };

	public Personas() {
		System.out.println("Fila: " + datos.length + " Columna: " + datos[0].length);
	}

	public String getNombre() {
		String valor = "";
		sc = new Scanner(System.in);
		valor = sc.nextLine();
		return valor;
	}

	public String getEmail() {
		String valor = "";
		sc = new Scanner(System.in);
		valor = sc.nextLine();
		return valor;
	}

	public String[][] getDatos() {
		return datos;
	}

	public String[][] getNombreEmail() {
		for (int i = 0; i < getDatos().length; i++) {
			for (int j = 0; j < getDatos()[i].length; j++) {
				if (j == 0) {
					System.out.println("Introduce Nombre: ");
					getDatos()[i][j] = getEmail();
				}
				if (j == 1) {
					System.out.println("Introduce Email: ");
					getDatos()[i][j] = getNombre();
				}
			}
		}
		return getDatos();
	}

	public void verNombreEmail() {
		for (int f = 0; f < getDatos().length; f++) {
			for (int c = 0; c < getDatos()[c].length; c++) {
				System.out.print(getDatos()[f][c] + " ");
			}
			System.out.println();
		}
	}

	public void getEmailPorNombre() {
		String nombre = getNombre();
		for (int f = 0; f < getDatos().length; f++) {
			for (int c = 0; c < getDatos()[c].length; c++) {
				if (nombre.compareTo(getDatos()[f][c]) == 0) {
					System.out.print("Nombre: " + nombre + " Email: " + getDatos()[f][1] + " ");
				}
			}
			System.out.println();
		}
	}

	public void getEmailNoValido() {
		String[][] correoValido = new String[getDatos().length][getDatos()[0].length];
		String[][] correoInValido = new String[getDatos().length][getDatos()[0].length];
		System.out.println("ver Elementos:");
		for (int f = 0; f < getDatos().length; f++) { // 5 filas
			for (int e = 0; e < getDatos()[f][1].length(); e++) {
				if (getDatos()[f][1].charAt(e) == '@') {
					correoValido[f][1] = getDatos()[f][1];
					System.out.println(correoValido[f][1]);
				}
			}
			System.out.println();
		}

		for (int f = 0; f < getDatos().length; f++) {
			for (int c = 0; c < getDatos()[f][1].length(); c++) {
//				if() {
//					
//				}
			}
		}

	}

}