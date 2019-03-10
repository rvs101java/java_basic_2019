
public class T20EjOrdenacionBasic2UltimoElemento {

	public static void main(String[] args) {

		int sueldos[] = { 1200, 750, 820, 550, 490 };
		int aux;

		for (int f = 0; f < 4; f++) {
			if (sueldos[f] > sueldos[f + 1]) {
				aux = sueldos[f];
				sueldos[f] = sueldos[f + 1];
				sueldos[f + 1] = aux;
			}
		}

		for (int f = 0; f < sueldos.length; f++) {
			System.out.print(" "+sueldos[f]);
		}

	}
}
