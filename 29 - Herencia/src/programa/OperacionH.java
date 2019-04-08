package programa;

import java.util.Scanner;

class OperacionH {

	protected Scanner teclado;
	protected int valor1;
	protected int valor2;
	protected int resultado;

	public OperacionH() {
		teclado = new Scanner(System.in);
		this.valor1 = 0;
		this.valor2 = 0;
		this.resultado = 0;
	}

	public int getCargar1() {
		System.out.println("Intro 1º valor");
		return valor1 = teclado.nextInt();
	}

	public int getCargar2() {
		System.out.println("Intro 2º valor");
		return valor2 = teclado.nextInt();
	}

	public int getResultado() {
		System.out.println("Obtener valor");
		return resultado;
	}

	public void mostrarResultado() {
		System.out.println(getResultado());
	}

}

 