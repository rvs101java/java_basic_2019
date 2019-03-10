package ejercicio;

public class T20OrdenarPaisesAlfabeticamente3 {

	public static void main(String[] args) {

		Paises3 p = new Paises3();
		p.cargar();
		p.ordenar();
		p.imprimir();

	}
}

class Paises3 {

	private String[] paises = { "Luxemburgo", "Finlandia", "Hungría", "Zambia", "Lituania", "Dinamarca", "Francia",
			"Eslovenia", "Alemania" };

	public void cargar() {
		int c = 0;
		for (int i = 0; i < paises.length; i++) {
			System.out.println(++c + "-" + paises[i]);
		}
	}

	public int getTotalPaises() {
		return paises.length;
	}

	public String[] getPaises() {
		return paises;
	}

	public void ordenar() {
		String aux;
		System.out.println("- Total paises : " + (getTotalPaises()));
		for (int k = 0; k < (getTotalPaises() - 1); k++) {
			for (int f = 0; f < ((getTotalPaises() - 1) - k); f++) {
				if ((getPaises()[f].compareTo(getPaises()[f + 1]) > 0)) {
					aux = paises[f];
					paises[f] = paises[f + 1];
					paises[f + 1] = aux;
				}
			}
		}
	}

	public void imprimir() {
		System.out.println("- Paises ordenados alfabéticamente");
		int c = 0;
		for (int f = 0; f < getPaises().length; f++) {
			System.out.println(++c + " - " + getPaises()[f]);
		}
	}
}