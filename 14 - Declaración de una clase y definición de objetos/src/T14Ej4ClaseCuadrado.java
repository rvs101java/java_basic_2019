import java.util.Scanner;

public class T14Ej4ClaseCuadrado {

	public static void main(String[] args) {
		Cuadrado c = new Cuadrado();
		c.inicializar();
		c.perimetro();
		c.superficie();

		System.out.println("-----------");
		Cuadrado2 c2 = new Cuadrado2();
		c2.inicializar();
		c2.imprimirPerimetro();
		c2.imprimirSuperficie();
	}
}

class Cuadrado {

	private double lado1, lado2, lado3, lado4;
	private double perimetro;
	private double superficie;
	private Scanner sc;

	public void inicializar() {
		sc = new Scanner(System.in);
		int l;
		for (l = 1; l <= 4; l++) {
			System.out.println("Introduce un lado: ");
			if (l == 1) {
				lado1 = sc.nextDouble();
			}
			if (l == 2) {
				lado2 = sc.nextDouble();
			}
			if (l == 3) {
				lado3 = sc.nextDouble();
			}
			if (l == 4) {
				lado4 = sc.nextDouble();
			}
		}
	}

	public void perimetro() {
		perimetro = (lado1 + lado2 + lado3 + lado4);
		System.out.println("Superficie : " + perimetro);
	}

	public void superficie() {
		superficie = (Math.pow(lado1, 2));
		System.out.println("Superficie : " + superficie);
	}
}

class Cuadrado2 {

	private Scanner teclado;
	int lado;

	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese valor del lado: ");
		lado = teclado.nextInt();
	}

	public void imprimirPerimetro() {
		int perimetro;
		perimetro = lado * 4;
		System.out.println("El perimetro es : " + perimetro);
	}

	public void imprimirSuperficie() {
		int superficie;
		superficie = lado * lado;
		System.out.println("La superficie es : " + superficie);
	}

}