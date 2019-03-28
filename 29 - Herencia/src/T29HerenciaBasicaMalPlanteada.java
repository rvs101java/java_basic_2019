
/***
 * Problema 1: Ahora plantearemos el primer problema utilizando herencia.
 * Supongamos que necesitamos implementar dos clases que llamaremos Suma y
 * Resta. Cada clase tiene como atributo valor1, valor2 y resultado. Los métodos
 * a definir son cargar1 (que inicializa el atributo valor1), carga2 (que
 * inicializa el atributo valor2), operar (que en el caso de la clase "Suma"
 * suma los dos atributos y en el caso de la clase "Resta" hace la diferencia
 * entre valor1 y valor2, y otro método mostrarResultado.
 * 
 * Si analizamos ambas clases encontramos que muchos atributos y métodos son
 * idénticos. En estos casos es bueno definir una clase padre que agrupe dichos
 * atributos y responsabilidades comunes.
 * 
 * La relación de herencia que podemos disponer para este problema es:
 * 
 * Operacion
 * 
 * Suma Resta Solamente el método operar es distinto para las clases Suma y
 * Resta (esto hace que no lo podamos disponer en la clase Operacion), luego los
 * métodos cargar1, cargar2 y mostrarResultado son idénticos a las dos clases,
 * esto hace que podamos disponerlos en la clase Operacion. Lo mismo los
 * atributos valor1, valor2 y resultado se definirán en la clase padre
 * Operacion. Crear un proyecto y luego crear cuatro clases llamadas: Operacion,
 * Suma, Resta y Prueba
 * 
 * @author Rad
 *
 */
public class T29HerenciaBasicaMalPlanteada {

}

class Operacion {

}

class Suma {

	private int valor1;
	private int valor2;
	private int resultado;

	public Suma() {
		valor1 = 0;
		valor2 = 0;
		resultado = 0;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getResultado() {
		return resultado;
	}

	public int getSuma() {
		resultado = (getValor1() + getValor2());
		return resultado;
	}

}

class Resta {

	private int valor1;
	private int valor2;
	private int resultado;

	public Resta() {
		valor1 = 0;
		valor2 = 0;
		resultado = 0;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getResultado() {
		return resultado;
	}

	public int getResta() {
		resultado = (getValor1() + getValor2());
		return resultado;
	}

}