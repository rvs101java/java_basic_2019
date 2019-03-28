package problemas_propuestos;

import java.util.Scanner;

public class T27Ej4NombresEmailsSol {

	public static void main(String[] args) {

		PersonasSol p = new PersonasSol();
		p.listar();
		p.consultaMail();
		p.sinArroba();
	}
}

class PersonasSol {

	private Scanner teclado;
	private String[] nombres;
	private String[] mail;

	public PersonasSol() {
		teclado = new Scanner(System.in);
		nombres = new String[5];
		mail = new String[5];

		for (int f = 0; f < nombres.length; f++) {
			System.out.print("Ingrese nombre: ");
			nombres[f] = teclado.nextLine();
			System.out.println("Ingrese mail");
			mail[f] = teclado.nextLine();
		}
	}

	public void listar() {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " - " + mail[i]);
		}
	}

	public void consultaMail() {
		String aux = "";
		boolean existe = false;

		System.out.print("Ingrese el nombre de la persona:");
		aux = teclado.nextLine();

		for (int f = 0; f < nombres.length; f++) {
			if (aux.equals(nombres[f])) {
				System.out.println("Mail de la persona: " + mail[f]);
				existe = true;
			}
		}
		if (existe == false) {
			System.out.println("No existe una persona con ese nombre.");
		}
	}

	public void sinArroba() {
		for (int f = 0; f < mail.length; f++) {
			boolean tiene = false;
			for (int k = 0; k < mail[f].length(); k++) {
				if (mail[f].charAt(k) == '@') {
					tiene = true;
				}
			}
			if (tiene == false) {
				System.out.println(mail[f] + " nombre tiene @");
			}
		}
	}

}
