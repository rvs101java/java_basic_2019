package ejercicios;

/**
 * Confeccionar una clase que represente un empleado.
 * 
 * Definir como atributos su nombre y su sueldo.
 * 
 * En el constructor cargar los atributos y luego en otro método imprimir sus
 * datos y por último uno que imprima un mensaje si debe pagar impuestos (si el
 * sueldo supera a 3000)
 * 
 * @author Rad
 *
 */
public class T26Ejercicio1 {

	public static void main(String[] args) {
		double sueldo = (Math.random() * (1000 + 2000) + 1000);
		Empleado em = new Empleado("pepe", sueldo);
		System.out.println(em.toString());
	}
}

class Empleado {

	private double sueldo;
	private String nombre;

	public Empleado(String nombre, double sueldo) {
		setNombre(nombre);
		setSueldo(sueldo);
	}

	public double getSueldo() {
		System.out.println(sueldo > 3000 ? "Pagar impuestos" : "No pagar impuestos");
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Sueldo: " + getSueldo() + " Nombre: " + getNombre();
	}
}