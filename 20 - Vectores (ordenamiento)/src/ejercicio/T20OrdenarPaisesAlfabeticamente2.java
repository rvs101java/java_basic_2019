package ejercicio;

public class T20OrdenarPaisesAlfabeticamente2 {

	public static void main(String[] args) {
		Paises2 p = new Paises2();
		p.verArray();
		p.ordenarPaises();
	}
}

class Paises2 {

	private String[] paises = { "Luxemburgo", "Finlandia", "Hungría", "Zambia", "Lituania", "Dinamarca", "Francia",
			"Eslovenia", "Alemania" };

	public void ordenarPaises() {
		String aux = "";
		for (int i = 0; i < paises.length; i++) {
			for (int j = 1; j < paises.length; j++) {
				if ((paises[j - 1].compareTo(paises[j]) > 0)) {
					aux = paises[j];
					paises[j] = paises[j - 1];
					paises[j - 1] = aux;
				}
			}
		}
		verArray2();
	}

	public void verArray() {
		System.out.println("------ Sin Ordenacion --------");
		for (int i = 0; i < paises.length; i++) {
			System.out.print(paises[i] + " ");
		}
	}

	public void verArray2() {
		System.out.println("\n------ Con Ordenacion --------");
		for (int i = 0; i < paises.length; i++) {
			System.out.print(paises[i] + " ");
		}
	}
}