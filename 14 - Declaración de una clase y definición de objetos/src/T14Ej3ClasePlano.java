import java.util.Scanner;

public class T14Ej3ClasePlano {

	public static void main(String[] args) {

		Punto p = new Punto();
		p.inicializa();
		p.crearPuntos();
		p.imprimir();
		
		Punto2 p2 = new Punto2();
		p2.inicializar();
		p2.imprimirCuadrante();
	}
}

class Punto {

	private double x;
	private double y;
	private int cuadrante;
	private Scanner teclado;

	public void inicializa() {
		teclado = new Scanner(System.in);
		System.out.println("Introduce la coordenada x: ");
		x = teclado.nextDouble();
		System.out.println("Introduce la coordenada y: ");
		y = teclado.nextDouble();
	}

	public void crearPuntos() {
		if (x > 0 && y > 0) {
			System.out.println("Cuadrante: " + (cuadrante = 1) + " = x: " + x + " y: " + y);
		}
		if (x < 0 && y > 0) {
			System.out.println("Cuadrante: " + (cuadrante = 2) + " = x: " + x + " y: " + y);
		}
		if (x < 0 && y < 0) {
			System.out.println("Cuadrante: " + (cuadrante = 3) + " = x: " + x + " y: " + y);
		}
		if (x > 0 && y < 0) {
			System.out.println("Cuadrante: " + (cuadrante = 4) + " = x: " + x + " y: " + y);
		}
	}

	public void imprimir() {
		System.out.println("Cuadrante: " + cuadrante + " = x: " + x + " y: " + y);
	}
}

class Punto2 {

	private Scanner teclado;
	private int y, x;

	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese coordenadas x: ");
		x = teclado.nextInt();

		System.out.println("Ingrese coordenadas y: ");
		y = teclado.nextInt();

	}

	public void imprimirCuadrante() {
		if (x > 0 && y > 0) {
			System.out.print("Se encuentra en el primer cuadrante.");
		} else {
			if (x < 0 && y > 0) {
				System.out.print("Se encuentra en el segundo cuadrante.");
			} else {
				if (x < 0 && y < 0) {
					System.out.print("Se encuentra en el tercer cuadrante.");
				} else {
					if (x > 0 && y < 0) {
						System.out.println("Se encuentra en el cuarto cuadrante");
					} else {
						System.out.println("El punto no esta en un cuadrante.");
					}
				}
			}
		}
	}
}