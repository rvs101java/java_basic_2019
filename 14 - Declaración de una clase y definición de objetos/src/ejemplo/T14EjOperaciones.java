package ejemplo;

import java.util.Scanner;

public class T14EjOperaciones {

	public static void main(String[] args) {
		
		Operaciones p = new Operaciones();
		p.inicializar();
		p.suma();
		p.resta();
		p.multi();
		p.div();
		p.imprimir();

	}
}

class Operaciones {

	private int valorX;
	private int valorY;
	private int suma;
	private int resta;
	private int multi;
	private int div;

	private Scanner sc;

	public void inicializar() {
		sc = new Scanner(System.in);
		System.out.println("1º Numero entero");
		valorX = sc.nextInt();
		System.out.println("2º Numero entero");
		valorY = sc.nextInt();
	}

	public void suma() {
		suma = (valorX + valorY);
		System.out.println("Suma : " + suma);
	}

	public void resta() {
		resta = (valorX - valorY);
		System.out.println("Resta : " + resta);
	}

	public void multi() {
		multi = (valorX * valorY);
		System.out.println("Multiplizacion : " + multi);
	}

	public void div() {
		div = (valorX / valorY);
		System.out.println("Division : " + div);
	}

	public void imprimir() {
		System.out.println("Valores : " + valorX + " " + valorY);
		suma();
		resta();
		multi();
		div();
	}

}