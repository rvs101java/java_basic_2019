
/**
 * Una empresa tiene dos turnos (ma�ana y tarde) en los que trabajan 8 empleados
 * (4 por la ma�ana y 4 por la tarde)
 * 
 * Confeccionar un programa que permita almacenar los sueldos de los empleados
 * agrupados por turno.
 * 
 * Imprimir los gastos en sueldos de cada turno.
 * 
 * @author Rad
 */
public class EjercicioVector3TurnosEmpresa1 {

	public static void main(String[] args) {

		float[] turnoManiana = new float[4];
		float[] turnoTarde = new float[4];
		float gastoTotalMa�ana = 0;
		float gastoTotalTarde = 0;

		for (int i = 0; i < turnoManiana.length; i++) {
			turnoManiana[i] = (float) (Math.random() * (100 + 500) + 1000);
			System.out.println("- Turno de ma�ana: " + turnoManiana[i]);
			gastoTotalMa�ana += turnoManiana[i];
		}

		System.out.println("----------------------");

		for (int i = 0; i < turnoTarde.length; i++) {
			turnoTarde[i] = (float) (Math.random() * (100 + 500) + 1000);
			System.out.println("+ Turno de tarde: " + turnoTarde[i]);
			gastoTotalTarde += turnoTarde[i];
		}

		System.out.println("----------------------");
		System.out.println("- Gasto Promedio Ma�ana: " + gastoTotalMa�ana / turnoManiana.length);
		System.out.println("- Gasto Promedio Tarde: " + gastoTotalTarde / turnoManiana.length);
		System.out.println("----------------------");

	}
}

