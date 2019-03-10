package ejercicios;

public class T21EjPaises {

	public static void main(String[] args) {

		Paises p = new Paises();
		System.out.println("########### PAISES ###############");
		System.out.println("-------- Sin Ordenacion ----------");
		p.seeVectores();
		System.out.println("-------- Con Ordenacion ----------");
		p.setOrdenacionPaises();
		p.seeVectores();
	}
}

class Paises {

	private String[] paises;
	private int[] poblacion;

	public Paises() {
		paises = new String[] { "Luxemburgo", "Finlandia", "Hungría", "Zambia", "Lituania", "Dinamarca", "Francia",
				"Eslovenia", "Alemania" };
		poblacion = new int[] { 590667, 5503000, 9781000, 17090000, 2848400, 5770000, 67120000, 2066000, 82790000 };
	}

	public String[] getPaises() {
		return paises;
	}

	public int[] getPoblacion() {
		return poblacion;
	}

	public void setOrdenacionPaises() {
		String auxPais = "";
		int auxPob = 0;
		for (int i1 = 0; i1 < getPaises().length; i1++) {
			for (int i2 = 0; i2 < (getPaises().length - 1) - i1; i2++) {
				if (getPaises()[i2].compareTo(getPaises()[i2 + 1]) > 0) {
					auxPais = getPaises()[i2];
					getPaises()[i2] = getPaises()[i2 + 1];
					getPaises()[i2 + 1] = auxPais;

					auxPob = getPoblacion()[i2];
					getPoblacion()[i2] = getPoblacion()[i2 + 1];
					getPoblacion()[i2 + 1] = auxPob;
				}
			}
		}
	}

	public void setOrdenacionPoblacionMayorMenor() {
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
	
	public void setOrdenacionPoblacionMenorMayor() {
		String auxPais = "";
		int auxPob = 0;
		for (int i1 = 0; i1 < getPaises().length; i1++) {
			for (int i2 = 0; i2 < (getPaises().length - 1) - i1; i2++) {
				if (getPoblacion()[i2] > getPoblacion()[i2 + 1]) { // Menor a Mayor
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