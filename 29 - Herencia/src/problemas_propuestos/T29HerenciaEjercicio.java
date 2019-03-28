package problemas_propuestos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class T29HerenciaEjercicio {

	public static void main(String[] args) {

		Persona p = new Persona("Pepe", 20);
		p.imprimirSueldo();

		Empleado e = new Empleado("Juan", 25, (Math.random() * (1 + 1000) + 500));

		System.out.println(e.toString());

	}
}

class Persona {

	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void imprimirSueldo() {
		System.out.println("Nombre: ".concat(getNombre()).concat(" Edad: " + getEdad()));
	}

	@Override
	public String toString() {
		return "Nombre: ".concat(getNombre()).concat(" Edad: " + getEdad());
	}

}

class Empleado extends Persona {

	private double sueldo;

	public Empleado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		BigDecimal bd = new BigDecimal(sueldo);
		bd  = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Nombre: ".concat(getNombre()).concat(" Edad: " + getEdad()).concat(" Sueldo: " + getSueldo());
	}

}