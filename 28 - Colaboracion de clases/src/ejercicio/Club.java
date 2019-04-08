package ejercicio;

/**
 * Plantear una clase Club y otra clase Socio.
 * 
 * La clase Socio debe tener los siguientes atributos privados:
 * 
 * nombre y la antigüedad en el club (en años).
 * 
 * En el constructor pedir la carga del nombre y su antigüedad.
 * 
 * La clase Club debe tener como atributos 3 objetos de la clase Socio.
 * 
 * Definir una responsabilidad para imprimir el nombre del socio con mayor
 * antigüedad en el club.
 * 
 * @author Rad
 *
 */
public class Club {

	private Socio socio1, socio2, socio3;

	public Club() {
		socio1 = new Socio("Tyler Durden", getAnios());
		socio2 = new Socio("Jack Smith", getAnios());
		socio3 = new Socio("Bob Paulson", getAnios());
	}

	public int getAnios() {
		return (int) (Math.random() * (1 + 10) + 1);
	}

	public Socio getSocio1() {
		return socio1;
	}

	public Socio getSocio2() {
		return socio2;
	}

	public Socio getSocio3() {
		return socio3;
	}

	public int getSocioMasVeterano() {
		int mayor = 0;
		if ((getSocio1().getAntiguedad() > getSocio2().getAntiguedad())
				&& (getSocio2().getAntiguedad() > getSocio3().getAntiguedad())) {
			mayor = getSocio1().getAntiguedad();
		}
		if ((getSocio2().getAntiguedad() > getSocio1().getAntiguedad())
				&& (getSocio1().getAntiguedad() > getSocio3().getAntiguedad())) {
			mayor = getSocio2().getAntiguedad();
		}
		if ((getSocio3().getAntiguedad() > getSocio1().getAntiguedad())
				&& (getSocio1().getAntiguedad() > getSocio2().getAntiguedad())) {
			mayor = getSocio3().getAntiguedad();
		}
		return mayor;
	}

	public void getNombreSocioMasVeterano() {
		System.out.println("Socio mas veterano: " + getSocioMasVeterano());
		if (getSocio1().getAntiguedad() == getSocioMasVeterano()) {
			System.out.println("Nombre: " + getSocio1().getNombre());
		}
		if (getSocio2().getAntiguedad() == getSocioMasVeterano()) {
			System.out.println("Nombre: " + getSocio2().getNombre());
		}
		if (getSocio3().getAntiguedad() == getSocioMasVeterano()) {
			System.out.println("Nombre: " + getSocio3().getNombre());
		}
	}

}
