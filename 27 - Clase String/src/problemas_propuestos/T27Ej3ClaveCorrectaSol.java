package problemas_propuestos;

import java.util.Scanner;

public class T27Ej3ClaveCorrectaSol {

	public static void main(String[] args) {

		ClaveSol cad = new ClaveSol();
		cad.verificarClave();

	}
}

class ClaveSol {

	private String clave;
	private Scanner teclado;

	public ClaveSol() {
		teclado = new Scanner(System.in);
		System.out.println("Introduce contraseña: ");
		clave = teclado.nextLine();
	}

	public void verificarClave() {
		if (clave.equals("123abc") == true) {
			System.out.println("Se ingreso la clave en forma correctas");
		}else {
			System.out.println("No se ingreso la clave en forma correctas");
		}
	}

}