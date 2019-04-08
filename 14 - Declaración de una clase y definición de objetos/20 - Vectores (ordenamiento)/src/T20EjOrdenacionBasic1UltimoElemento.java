
public class T20EjOrdenacionBasic1UltimoElemento {

	public static void main(String[] args) {
		Sueldos s1 = new Sueldos();
		s1.setLongitud(5);
		s1.getSueldos();
		s1.getOrdenacion();
		s1.verOrdenacion();
	}
}

class Sueldos {

	private int longitud;
	private int[] sueldos;

	public void setLongitud(int lon) {
		longitud = lon;
	}

	public int getLongitud() {
		return longitud;
	}

	public int[] getSueldos() {
		sueldos = new int[getLongitud()];
		return sueldos;
	}

	public int[] getValoresVector() {
		for (int i = 0; i < getLongitud(); i++) {
			sueldos[i] = (int) (Math.random() * (1 + 20) + 1);
			System.out.print(sueldos[i] + " ");
		}
		System.out.println();
		return sueldos;
	}

	public int[] getOrdenacion() {
		int sueldos[] = getValoresVector();
		int aux = 0;
		for (int f = 0; f < 4; f++) {
			if (sueldos[f] > sueldos[f + 1]) {
				aux = sueldos[f];
				sueldos[f] = sueldos[f + 1];
				sueldos[f + 1] = aux;
			}
		}
		return sueldos;
	}

	public void verOrdenacion() {
		System.out.println("---- Ordenacion -----");
		for (int f = 0; f < sueldos.length; f++) {
			System.out.print(sueldos[f] + " ");
		}
	}

}