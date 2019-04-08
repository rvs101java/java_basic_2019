
public class T27ClaseString {

	public static void main(String[] args) {

		MetodosString ms = new MetodosString();
		ms.setCadena("SoyString");
		ms.compareToCadena(ms.getCadena());
		ms.charAtCadena(0);
		ms.charAtCadena(1);
		ms.lengthCadena("1" + ms.getCadena());
		ms.substringCadena("cadena");
		ms.indexOfCadena("cadena");
		ms.getToUpperCase();

	}

}

class MetodosString {

	private String cadena;

	public MetodosString() {
		this.cadena = "";
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	/**
	 * Este método retorna un 0 si el contenido de s1 es exactamente igual al String
	 * contenido por el objeto que llama al método compareTo. Retorna un valor >0 si
	 * el contenido del String que llama al método compareTo es mayor
	 * alfabéticamente al parámetro s1.
	 * 
	 * @param s1
	 */
	public void compareToCadena(String s1) {
		System.out.println(("Cadena es :"));
		System.out.println((s1.compareTo("si") == 0) ? "Iguales" : "Distintos");
	}

	/**
	 * 
	 * @param pos
	 */
	public void charAtCadena(int pos) {
		System.out.println("La palabra es: cadena");
		System.out.println("cadena".charAt(pos));
	}

	/**
	 * 
	 * @param cadena
	 */
	public void lengthCadena(String cadena) {
		System.out.println("Longitud: " + cadena.length());
	}

	/**
	 * 
	 * @param cadena1
	 */
	public void substringCadena(String cadena1) {
		System.out.println(cadena1.substring(0, cadena1.length() / 2));
	}

	/**
	 * 
	 * Retorna -1 si el String que le pasamos como parámetro no está contenida en la
	 * cadena del objeto que llama al método. En caso que se encuentre contenido el
	 * String s1 retorna la posición donde comienza a repetirse.
	 * 
	 * @param cadena
	 */
	public void indexOfCadena(String cadena) {
		System.out.println("CADENA".indexOf(cadena));
	}

	/**
	 * 
	 */
	public void getToUpperCase() {
		System.out.println("CADENA".toUpperCase());
	}

}