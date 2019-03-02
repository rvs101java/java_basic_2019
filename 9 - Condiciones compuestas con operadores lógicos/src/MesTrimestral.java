import java.util.Date;

public class MesTrimestral {

	public static void main(String[] args) {

		int dia = (int) (Math.random() * (1 + 30) + 1);
		int mes = (int) (Math.random() * (1 + 11) + 1);
		int anio = (int) (Math.random() * (1 + 20) + 2000);

		if ((mes == 1) || (mes == 2) || (mes == 3)) {
			System.out.println("dia " + dia + " mes " + mes + " anio " + anio);
			System.out.println("Dentro del trimestre : ");
		} else {
			System.out.println("dia " + dia + " mes " + mes + " anio " + anio);
			System.out.println("Fuera del trimestre");
		}
	}
}
