package ejemplo;

public class T18VectoresParalelosNombreEdades {

	public static void main(String[] args) {
		Personas p = new Personas();
		p.setLongitud(5);
		p.setArrayNombreEdad();
	}
}

class Personas {

	private int[] edad;
	private int longitud;
	private String[] nombre;

	public void setLongitud(int longitud) {
		this.longitud = longitud; // longitud
	}

	public int getLongitud() {
		return longitud; // longitud
	}

	public int[] getArrayDeEdad() {
		setArrayDeEdad();
		for (int i = 0; i < getLongitud(); i++) {
			edad[i] = (int) (Math.random() * (1 + 100) + 1);
		}
		return edad;
	}

	public void setArrayDeEdad() { // Establece la edad
		edad = new int[getLongitud()];
	}

	public void setArrayDeNombre() {
		for (int i = 0; i < getArrayDeNombre().length; i++) {
			nombre[i] = getNombrePersona();
		}
	}

	public String[] getArrayDeNombre() {
		nombre = new String[getLongitud()]; // Array de nombres
		return nombre;
	}

	public void setArrayNombreEdad() {
		for (int c = 0; c < getLongitud(); c++) {
			System.out.println(
					"Nombres : " + (getArrayDeNombre()[c] = getNombrePersona()) + " - Edades: " + getArrayDeEdad()[c]);
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

}