package ejercicio;

public class T20OrdenarPaisesAlfabeticamente {

	public static void main(String[] args) {
		Paises p = new Paises();
		p.setArray(5);
		p.setArrayPaises();
		p.ordenarPaises();

	}
}

class Paises {

	private String[] paises;
	private int longitud;

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public String[] getArray() {
		return paises;
	}

	public void setArray(int longitud) {
		setLongitud(longitud);
		paises = new String[getLongitud()];
	}

	public void setArrayPaises() {
		for (int i = 0; i < getArray().length; i++) {
			getArray()[i] = "Pais".concat(""+(int) (Math.random() * (1 + 100) + 1));
		}
		verArray(); 
	}

	public void ordenarPaises() {
		String aux = "";
		for (int i = 0; i < getArray().length; i++) {
			for (int j = 1; j < getArray().length; j++) {
				if ((getArray()[j - 1].compareTo(getArray()[j]) > 0)) {
					aux = getArray()[j];
					getArray()[j] = getArray()[j - 1];
					getArray()[j - 1] = aux;
				}
			}
		}
		verArray2();
	}

	public void verArray() {
		System.out.println("------ Sin Ordenacion --------");
		for (int i = 0; i < getArray().length; i++) {
			System.out.print(getArray()[i] + " ");
		}
	}
	
	public void verArray2() {
		System.out.println("\n------ Con Ordenacion --------");
		for (int i = 0; i < getArray().length; i++) {
			System.out.print(getArray()[i] + " ");
		}
	}
}