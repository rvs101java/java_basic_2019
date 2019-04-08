
public class T11ContadorAprobados {

	public static void main(String[] args) {

		int aprobados = 0, reprobados = 0, f = 0;

		for (f = 1; f <= 10; f++) {
			int nota = (int) (Math.random() * (1 + 10) + 1);
			System.out.println("Nota : " + nota);
			if (nota >= 7) {
				aprobados = aprobados + 1;
			}
			if (nota < 5) {
				reprobados = reprobados + 1;
			}
		}
		System.out.println("Aprobados : " + aprobados + " media " + (aprobados / f));
		System.out.println("Reaprobados : " + reprobados + " media " + (reprobados / f));
	}
}
