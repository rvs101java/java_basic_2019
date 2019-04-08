
/**
 * Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados
 * (4 por la mañana y 4 por la tarde)
 * 
 * Confeccionar un programa que permita almacenar los sueldos de los empleados
 * agrupados por turno.
 * 
 * Imprimir los gastos en sueldos de cada turno.
 * 
 * @author Rad
 */
public class EjercicioVector3TurnosEmpresa2 {

	public static void main(String[] args) {

		GestionarTurnos gt = new GestionarTurnos();
		gt.setTurnos(3);
		gt.setVerDatosEmpleado(gt.getEmpleados(5));

	}
}

class Empleados {

	private String nombre;
	private float sueldo;
	private String turno;

	public Empleados(String nombre, float sueldo, String turno) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.turno = turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public float getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", sueldo=" + sueldo + ", turno=" + turno + "]";
	}
}

class Turnos {

	private String turno;

	public Turnos(String turno) {
		this.turno = turno;
	}

	public Turnos() {
		this.turno = "Sin turno";
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Turnos [" + getTurno() + "]";
	}
}

class GestionarTurnos {

	private Turnos[] arrayTurnos = null; // almacena el array de turnos

	public Turnos[] setTurnos(int cantidad) {
		arrayTurnos = new Turnos[cantidad];
		for (int i = 0; i < arrayTurnos.length; i++) {
			if (i == 0) {
				arrayTurnos[0] = new Turnos("Mañana");
			}
			if (i == 1) {
				arrayTurnos[1] = new Turnos("Tarde");
			}
			if (i == 2) {
				arrayTurnos[2] = new Turnos("Noche");
			}
			if (i > 2) {
				arrayTurnos[i] = new Turnos("Mañana-Tarde");
			}
		}
		return arrayTurnos;
	}

	public String getTurnos(int numero) {
		return arrayTurnos[numero].getTurno();
	}

	public Empleados[] getEmpleados(int indice) {

		Empleados[] empleados = new Empleados[indice];

		for (int i = 0; i < empleados.length; i++) {
			if (i == 0) {
				empleados[i] = new Empleados("Pepe", 1000, getTurnos(i));
			}
			if (i == 1) {
				empleados[i] = new Empleados("Juan", 1200, getTurnos(i));
			}
			if (i == 2) {
				empleados[i] = new Empleados("Ana", 1500, getTurnos(i));
			}
			if (i > 2) {
				empleados[i] = new Empleados("Trabajador no asignado: " + i, (float) 0.0, "Sin turno");
			}
		}
		return empleados;
	}

	public void setVerDatosEmpleado(Empleados[] empleado) {
		float sueldoTotal = 0;
		for (int i = 0; i < empleado.length; i++) {
			System.out.println(empleado[i]);
			sueldoTotal += empleado[i].getSueldo();
		}
		System.out.println("- Sueldo Total: " + sueldoTotal + " - ");
	}

}