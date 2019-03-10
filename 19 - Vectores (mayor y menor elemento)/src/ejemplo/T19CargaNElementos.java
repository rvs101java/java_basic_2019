package ejemplo;

/**
 * Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite
 * dentro del vector.
 * 
 * @author Rad
 *
 */
public class T19CargaNElementos {

	public static void main(String[] args) {

		System.out.println("------------");
		Sol1 sol1 = new Sol1(10);
		sol1.getMenorElementos();

	}
}

class Sol1 {

	private int[] vector;
	private int menor;
	private int pos;

	public Sol1(int posicion) {
		vector = new int[posicion];
		menor = 0;
		pos = 0;
	}

	public int[] getVector() {
		return vector;
	}

	public int getMenor() {
		return menor;
	}

	public int getPos() {
		return pos;
	}

	public void setDatos() {
		System.out.println("Lista de elementos");
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * (1 + 100));
			System.out.print(vector[i] + " - ");
		}
		System.out.println("\n--------------");
	}

	public void getMenorElementos() {
		setDatos();
		int menor = 0;
		int pos = 0;
		for (int i = 1; i < getVector().length; i++) {
			if (getVector()[0] <= getVector()[i]) {
				menor = getVector()[0];
			} else {
				menor = getVector()[i];
				getVector()[0] = getVector()[i];
				pos = i;
			}
		}

		System.out.println("+- Elemento menor: " + menor + " posicion: " + pos + " -+");

		for (int ii = 1; ii < getVector().length; ii++) {
			if (getVector()[0] == getVector()[ii]) {
				if (ii != pos) {
					System.out.println("- Menor se repite: " + getVector()[ii] + " posicion: " + pos + " y " + ii);
				}
			}
			System.out.print(getVector()[ii] + " - ");
		}
	}
}
