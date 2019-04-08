/**
 * Problema 1: Se tiene la siguiente información:
 * 
 * · Nombres de 4 empleados.
 * 
 * · Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3
 * meses.
 * 
 * Confeccionar el programa para:
 * 
 * a) Realizar la carga de la información mencionada.
 * 
 * b) Generar un vector que contenga el ingreso acumulado en sueldos en los
 * últimos 3 meses para cada empleado.
 * 
 * c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en
 * los últimos 3 meses
 * 
 * d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado
 * 
 * @author Rad
 *
 */

public class T24Problema1 {

	public static void main(String[] args) {
		Empleados em = new Empleados();
		em.setSueldos();
		em.getDatos();
		em.getSueldos3Meses();
		em.getEmpleadoMayorIngreso();
	}

}

class Empleados {

	private int[] sueldostot;
	private String[] empleados;
	private int[][] sueldos;

	public Empleados() {
		sueldos = new int[4][3];
		empleados = new String[] { "Marcos", "Ana", "Luis", "Maria" };
		sueldostot = new int[sueldos.length];
	}

	public String[] getEmpleados() {
		return empleados;
	}

	public int[][] getSueldos() {
		return sueldos;
	}

	public int[] getSueldosStot() {
		return sueldostot;
	}

	public void setSueldos() {
		for (int f = 0; f < getSueldos().length; f++) {
			for (int c = 0; c < getSueldos()[f].length; c++) {
				getSueldos()[f][c] = (int) (Math.random() * (500 + 1000) + 500);
			}
		}
	}

	// a) Realizar la carga de la información mencionada.
	public void getDatos() {
		System.out.println("+Empleados\t   -Sueldos");
		for (int f = 0; f < getSueldos().length; f++) {
			if (f < getSueldos().length) {
				System.out.print(getEmpleados()[f] + "\t\t|");
			}
			for (int c = 0; c < getSueldos()[f].length; c++) {
				System.out.print("|" + getSueldos()[f][c] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * b) Generar un vector que contenga el ingreso acumulado en sueldos en los
	 * últimos 3 meses para cada empleado.
	 */
	public void getTotalSueldos() {
		int total = 0;
		System.out.println("-----------");
		for (int f = 0; f < getSueldos().length; f++) {
			for (int c = 0; c < getSueldos()[f].length; c++) {
				total += getSueldos()[f][c];
			}
		}
		System.out.print("Total : " + total);
	}

	/**
	 * c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en
	 * los últimos 3 meses
	 */
	public void getSueldos3Meses() {
		System.out.println("+- Sueldos de 3 meses por cada trabajador ------");
		for (int f = 0; f < getSueldos().length; f++) {
			for (int c = 0; c < getSueldos()[f].length; c++) {
				getSueldosStot()[f] += getSueldos()[f][c];
			}
		}
		for (int i = 0; i < getSueldosStot().length; i++) {
			System.out.println(getEmpleados()[i] + " \t " + getSueldosStot()[i]);
		}
	}

	/**
	 * d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado
	 */
	public void getEmpleadoMayorIngreso() {
		int p = 0;
		for (int f = 0; f < getSueldosStot().length; f++) {
			for (int c = 1; c < getSueldosStot().length; c++) {
				if (getSueldosStot()[0] < getSueldosStot()[c]) {
					getSueldosStot()[0] = getSueldosStot()[c];
					p = c;
				}
			}
		}
		System.out.println("+- Empleado : " + getEmpleados()[p] + " - Sueldo : " + getSueldosStot()[p]);
	}
}
