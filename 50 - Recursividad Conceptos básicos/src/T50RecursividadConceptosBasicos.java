/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 17 may. 2019 - 19:47:03
 */
public class T50RecursividadConceptosBasicos {

	/**
	 * 1� ejecuta la funcion 'main'
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Crea un objeto llamamos
		// TipoDato Ref.obj Reserva.Memoria Llamada Constructor(Inicializa objeto)
		Recursividad re = new Recursividad();
		// Objeto invoca/llama funcion repetir
		// !! Cada vez que se llama a una funcion se reservan 4 bytes de la memoria ram
		// que se liberaran cuando finalice su ejecucion
		re.repetir();
//		La primera l�nea de la funci�n llama a la funci�n repetir, 
//		Se reservan 4 bytes nuevamente. 
//		Se ejecuta nuevamente una instancia de la funci�n repetir 
//		y as� sucesivamente hasta que la pila est�tica se colme 
//		y se cuelgue el programa.
	}
}

class Recursividad {

	void repetir() {
		repetir();
	}

}