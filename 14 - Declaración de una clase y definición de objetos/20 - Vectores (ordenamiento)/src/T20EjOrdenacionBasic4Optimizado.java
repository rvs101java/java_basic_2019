
public class T20EjOrdenacionBasic4Optimizado {

	public static void main(String[] args) {

		OrdenacionEficiente oe = new OrdenacionEficiente();
		oe.cargar();
		oe.ordenar();
		oe.imprimir();
	}
}

class OrdenacionEficiente {

	private int[] sueldos;
	private int longitud;

	public void cargar() {
		setLongitud(5);
		sueldos = new int[getLongitud()];
		for (int i = 0; i < getArray().length; i++) {
			getArray()[i] = (int) (Math.random() * (1 + 1000) + 1);
			System.out.print(getArray()[i] + " - ");
		}
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int[] getArray() {
		return sueldos;
	}

	public void ordenar() {
		int aux;
		for (int k = 0; k < 4; k++) { // k = 0
			for (int f = 0; f < (4 - k); f++) { // f = 0 , f = 1 , f = 2 , f = 3
				if (sueldos[f] > sueldos[f + 1]) {
					aux = sueldos[f];
					sueldos[f] = sueldos[f + 1];
					sueldos[f + 1] = aux;
				}
			}
		}
	}

	public void imprimir() {
		System.out.println("\nSueldos ordenados de menor a mayor.");
		for (int f = 0; f < sueldos.length; f++) {
			System.out.print(sueldos[f] + " ");
		}
	}

}
