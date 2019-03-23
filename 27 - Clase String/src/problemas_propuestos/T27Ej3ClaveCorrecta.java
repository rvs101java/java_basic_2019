package problemas_propuestos;

import java.util.Scanner;

public class T27Ej3ClaveCorrecta {

	public static void main(String[] args) {

		Clave c = new Clave();
		boolean valor = c.getValidarPass();
		c.setValidarPass(valor);

	}
}

class Clave {

	private final String password = "123abc";
	private String cadena;
	private Scanner sc;

	public Clave() {
		System.out.println("Introduce contraseña: ");
		sc = new Scanner(System.in);
		cadena = sc.nextLine();
	}

	public String getCadena() {
		return cadena;
	}

	public String getPassword() {
		return password;
	}

	public boolean getValidarPass() {
		boolean validar = false;
		if (getPassword().compareTo(getCadena()) == 0) {
			validar = true;
		}
		return validar;
	}

	public void setValidarPass(boolean pass) {
		System.out.println((pass == true) ? "Acceso" : "Sin acceso");
	}

}