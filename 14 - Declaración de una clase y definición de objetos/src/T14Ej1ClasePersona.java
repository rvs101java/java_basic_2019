
import java.util.Scanner;

public class T14Ej1ClasePersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.inicializar();
		persona1.esMayorEdad();
		persona1.imprimir();
	}
}

/**
 * Clase Persona
 * 
 * @author Rad
 */
class Persona {

	// Atributos - Variables miembro
	private int edad;
	private String nombre;
	private Scanner teclado; // Llamada a un objeto de tipo 'Scanner'

	public Persona() {
		this.edad = 99;
		this.nombre = "Sin Nombre";
	}

	/**
	 * Metodos - Funciones miembro
	 */
	public void inicializar() {
		teclado = new Scanner(System.in);

		System.out.println("Ingrese nombre: ");
		nombre = teclado.next();
		
		System.out.println("Ingrese edad: ");
		edad = teclado.nextInt();
	}

	/**
	 * Metodos - Funciones miembro
	 */
	public void esMayorEdad() {
		if (edad >= 18) {
			System.out.println(nombre + " es mayor de edad");
		} else {
			System.out.println(nombre + " no es mayor de edad");
		}
	}

	/**
	 * Metodos - Funciones miembro
	 */
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
}