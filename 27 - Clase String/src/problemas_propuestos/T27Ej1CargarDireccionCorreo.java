package problemas_propuestos;

import java.util.Scanner;

public class T27Ej1CargarDireccionCorreo {

	public static void main(String[] args) {
		CorreoElectronico ce = new CorreoElectronico();
		ce.getValidarCorreo();
	}
}

class CorreoElectronico {

	private String cadena;
	private Scanner sc;

	public CorreoElectronico() {
		sc = new Scanner(System.in);
		System.out.println("Introduce correo electronico");
		cadena = sc.nextLine();
	}

	public String getCadena() {
		return cadena;
	}

	public void getValidarCorreo() {
		if (getCadena().indexOf("@") >= 0) {
			if (getCadena().indexOf(".") >= 0) {
				System.out.println(getCadena().concat(" : Es un correo valido"));
			}
		} else {
			System.out.println(getCadena().concat(" : No es un correo valido"));
		}
	}

}