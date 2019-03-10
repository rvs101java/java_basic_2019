package ejemplo;

public class T19CargaNElementos2 {

	public static void main(String[] args) {
		System.out.println("------------");
		Sol2 sol2 = new Sol2();
		sol2.cargar();
		sol2.menorElemento();
		sol2.repetirMenor();

	}
}

class Sol2 {

	private int[] vec;
	private int menorValor;
	private int n = 10;

	//Inicializa
	public void cargar() {
		System.out.println("===============================");
		System.out.println("Cuantos elementos desea cargar:");
		vec = new int[n];
		for (int f = 0; f < vec.length; f++) {
			System.out.println("Numero agregado: " + (vec[f] = (int) (Math.random() * (1 + 20))));
		}
	}

	//Busca y declara
	public void menorElemento() {
		menorValor = vec[0];
		for (int f = 1; f < vec.length; f++) {
			if (vec[f] < menorValor) { // Comprueba que elemento de la posicion '0' no es mayor que la posicion '1'
				menorValor = vec[f];
			}
		}
		System.out.println("El elementos menor es : " + menorValor);
	}

	//Busca y declara
	public void repetirMenor() {
		int cant = 0;
		for (int f = 0; f < vec.length; f++) {
			if (vec[f] == menorValor) {
				cant++;
			}
		}
		if (cant > 1) {
			System.out.println("+Se repite el numero : " + menorValor + " como menor en el vector");
		} else {
			System.out.println("-No se repite el numero " + menorValor + " como menor en el vector");
		}
	}
}
