
public class T19EjMenorMayorEdadNombre {

	public static void main(String[] args) {
		Operarios op = new Operarios(5);
		op.setNombreEdades();
		op.getMayoresDeEdad();
	}
}

/**
 * Problema 1: Confeccionar un programa que permita cargar los nombres de 5
 * operarios y sus sueldos respectivos.
 * 
 * Mostrar el sueldo mayor y el nombre del operario.
 * 
 * @author Rad
 *
 */
class Operarios {

	private int[] edad;
	private String[] nombre;
	private int longitud;

	public Operarios(int longitud) {
		setLongitud(longitud);
		edad = new int[getLongitud()];
		nombre = new String[getLongitud()];
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public String[] getNombre() {
		return nombre;
	}

	public int[] getEdad() {
		return edad;
	}

	public void setNombreEdades() {
		getNombre();
		getEdad();

		for (int i = 0; i < getLongitud(); i++) {
			getEdad()[i] = (int) (Math.random() * (1 + 80) + 1);
			getNombre()[i] = getNombrePersona();
			System.out.println("Edad: " + getEdad()[i] + " - Nombre: " + getNombre()[i]);
		}
	}

	public String getNombrePersona() {
		String palabra = "";
		char[] ch = new char[5];
		for (int c = 1; c < ch.length; c++) {
			if (ch[0] != 'a') {
				ch[0] = 'a';
				String mayu = Character.toString(ch[0]);
				palabra += mayu.toUpperCase();
			}
			palabra += ch[c] = (char) (Math.random() * 26 + 'a');
		}
		return palabra;
	}

	public void setMayoresDeEdad() {
		int num1 = 0;
		int num2 = 0;
		System.out.println("Maxima longitud: " + getLongitud());
		for (int i = 0; i < getLongitud(); i++) {
			if (getEdad()[0] >= getEdad()[i]) { // Ordenacion de menor a mayor
				num1 = getEdad()[i];
				getEdad()[i] = getEdad()[0];
				getEdad()[0] = num1;
			}
			for (int ii = 1; ii < getLongitud(); ii++) {
				if (getEdad()[ii - 1] >= getEdad()[ii]) { // Ordenacion de menor a mayor
					num2 = getEdad()[ii - 1];
					getEdad()[ii - 1] = getEdad()[ii];
					getEdad()[ii] = num2;
				}
			}

		}
	}

	public void getMayoresDeEdad() {
		setMayoresDeEdad();
		System.out.println("Mayores de 18 años - ");
		for (int i = 0; i < getLongitud(); i++) {
			if (getEdad()[i] > 18) {
				System.out.println(" + Mayor de Edad: " + getEdad()[i] + " + Nombre: " + getNombre()[i]);
			} else {
				System.out.println(" - Menor de Edad: " + getEdad()[i] + " - Nombre: " + getNombre()[i]);
			}
		}

		System.out.println("Ordenados de menos a mayor");
		for (int i = 0; i < getLongitud(); i++) {
			if (getEdad()[i] <= getEdad()[i]) {
				System.out
						.println(" + Menor a Mayor - Nombre: " + getNombre()[i] + " - Menor de Edad: " + getEdad()[i]);
			}
		}
	}
}