package problema;

/**
 * Plantear un programa que permita jugar a los dados.
 * 
 * Las reglas de juego son:
 * 
 * Se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje
 * que "gano", sino "perdió".
 * 
 * Lo primero que hacemos es identificar las clases:
 * 
 * Podemos identificar la clase Dado y la clase JuegoDeDados.
 * 
 * Luego los atributos y los métodos de cada clase:
 * 
 * Dado atributos valor métodos tirar imprimir retornarValor
 * 
 * JuegoDeDados atributos 3 Dado (3 objetos de la clase Dado) métodos
 * constructor jugar
 * 
 * @author Rad
 *
 */
public class Dado {

	private int valor;

	public Dado() {
		valor = 0;
	}

	public int getValor() {
		return valor;
	}

	public void tirar() {
		valor = (int) (Math.random() * (1 + 5) + 1);
	}

	public void imprimir() {
		System.out.println("Valor del dado: " + getValor());
	}

	public int retornarValor() {
		return getValor();
	}

}
