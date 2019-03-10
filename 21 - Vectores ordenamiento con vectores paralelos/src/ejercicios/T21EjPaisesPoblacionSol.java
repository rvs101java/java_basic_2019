package ejercicios;

public class T21EjPaisesPoblacionSol {

	public static void main(String[] args) {

		PaisesSol p = new PaisesSol();
		System.out.println("########### PAISES ###############");
		System.out.println("-------- Sin Ordenacion ----------");
		p.seeVectores();
		System.out.println("-------- Con Ordenacion ----------");
		p.ordenarPorNombres();
		p.seeVectores();
	}
}

class PaisesSol {

	private String[] paises;
	private int[] habitantes;

	public PaisesSol() {
		paises = new String[] { "Luxemburgo", "Finlandia", "Hungría", "Zambia", "Lituania", "Dinamarca", "Francia",
				"Eslovenia", "Alemania" };
		habitantes = new int[] { 590667, 5503000, 9781000, 17090000, 2848400, 5770000, 67120000, 2066000, 82790000 };
	}

	public String[] getPaises() {
		return paises;
	}

	public int[] getPoblacion() {
		return habitantes;
	}

	public void ordenarPorNombres() {
		String auxPais = "";
		int auxhabitante = 0;
		for (int k = 0; k < paises.length; k++) {
			for (int f = 0; f < (paises.length - 1) - k; f++) {
				if (paises[f].compareTo(paises[f + 1]) > 0) {
					auxPais = paises[f];
					paises[f] = paises[f + 1];
					paises[f + 1] = auxPais;

					auxhabitante = habitantes[f];
					habitantes[f] = habitantes[f + 1];
					habitantes[f + 1] = auxhabitante;
				}
			}
		}
	}

	public void setOrdenacionPoblacion() {
		String auxPais = "";
		int auxPob = 0;
		for (int i1 = 0; i1 < getPaises().length; i1++) {
			for (int i2 = 0; i2 < (getPaises().length - 1) - i1; i2++) {
				if (getPoblacion()[i2] < getPoblacion()[i2 + 1]) { // Mayor a menor
					auxPob = getPoblacion()[i2];
					getPoblacion()[i2] = getPoblacion()[i2 + 1];
					getPoblacion()[i2 + 1] = auxPob;

					auxPais = getPaises()[i2];
					getPaises()[i2] = getPaises()[i2 + 1];
					getPaises()[i2 + 1] = auxPais;
				}
			}
		}
	}
	
	

	public void seeVectores() {
		for (int i = 0; i < getPaises().length; i++) {
			System.out.println("Paises: " + getPaises()[i] + " - Poblacion: " + getPoblacion()[i]);
		}
	}
}