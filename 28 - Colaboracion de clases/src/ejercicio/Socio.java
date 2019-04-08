package ejercicio;

public class Socio {

	private String nombre;
	private int antiguedad;

	public Socio(String nombre, int antiguedad) {
		this.nombre = nombre;
		this.antiguedad = antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
}
