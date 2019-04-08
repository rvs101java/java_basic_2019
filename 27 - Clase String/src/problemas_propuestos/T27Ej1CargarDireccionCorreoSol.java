package problemas_propuestos;

import java.util.Scanner;

public class T27Ej1CargarDireccionCorreoSol {

	public static void main(String[] args) {
		CorreoElectronico2 ce = new CorreoElectronico2();
		ce.verificaArroba();
	}
}

class CorreoElectronico2 {

	private Scanner teclado;
	private String mail;

	public CorreoElectronico2() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese un mail");
		mail = teclado.nextLine();
	}

	public void verificaArroba() {
		boolean existe = false;
		for (int f = 0; f < mail.length(); f++) {
			if (mail.charAt(f) == '@') {
				existe = true;
			}
		}
		if (existe == true) {
			System.out.println(mail + " Contiene el caracter @");
		} else {
			System.out.println(mail + " No contiene el caracter @");
		}
	}
}