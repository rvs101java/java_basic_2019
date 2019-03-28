package ejercicio.solucion;

import java.util.Scanner;

/**
 * Plantear una clase Club y otra clase Socio.
 * 
 * La clase Socio debe tener los siguientes atributos privados:
 * 
 * nombre y la antig�edad en el club (en a�os).
 * 
 * En el constructor pedir la carga del nombre y su antig�edad.
 * 
 * La clase Club debe tener como atributos 3 objetos de la clase Socio.
 * 
 * Definir una responsabilidad para imprimir el nombre del socio con mayor
 * antig�edad en el club.
 * 
 * @author Rad
 *
 */
public class Club {

	private Socio socio1, socio2, socio3;
	private Scanner teclado;

	public Club() {
		teclado = new Scanner(System.in);
		socio1 = new Socio(teclado);
		socio2 = new Socio(teclado);
		socio3 = new Socio(teclado);
	}

	public void mayorAntiguedad() {
		System.out.println("Socio de mayor antiguedad: ");
		if (socio1.retornarAntiguedad() > socio2.retornarAntiguedad()
				&& socio1.retornarAntiguedad() > socio2.retornarAntiguedad()) {
			socio1.imprimir();
		} else {
			if (socio2.retornarAntiguedad() > socio3.retornarAntiguedad()) {
				socio2.imprimir();
			} else {
				socio3.imprimir();
			}
		}
	}
}
