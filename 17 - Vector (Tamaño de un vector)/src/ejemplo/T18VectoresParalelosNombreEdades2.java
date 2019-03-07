package ejemplo;

public class T18VectoresParalelosNombreEdades2 {

	public static void main(String[] args) {

		NombresEdades ne = new NombresEdades();
		ne.setNombresEdades();
	}
}

class NombresEdades {

	private int[] edad;
	private String[] nombre;
	private int longitud;

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setArrays(int longitud) {
		edad = new int[longitud];
		nombre = new String[longitud];
	}

	public int[] getEdad() {
		return edad;
	}

	public String[] getNombre() {
		return nombre;
	}

	public void setNombresEdades() {
		setLongitud(10);
		setArrays(getLongitud());
		for (int i = 0; i < getLongitud(); i++) {
			getEdad()[i] = (int) (Math.random() * (1 + 50) + 1);
			getNombre()[i] = "Pepito : " + i;
			if (getEdad()[i] > 18) {
				System.out.println("- Mayor de Edad: " + getEdad()[i] + " Nombre " + getNombre()[i]);
			} else {
				System.out.println("+ Menor de Edad: " + getEdad()[i] + " Nombre " + getNombre()[i]);
			}
		}
	}
}