
import java.util.Scanner;

public class LeerTeclado {

	private static int numero;
	private static double decimal;
	private static String cadena;
	private static Scanner sc;

	/**
	 * Devuelve un numero
	 * 
	 * @return
	 */
	public static int getInt() {
		sc = new Scanner(System.in);
		System.out.println("Introduce un valor entero : ");
		return numero = sc.nextInt();
	}

	/**
	 * Devuelve un decimal
	 * 
	 * @return
	 */
	public static double getDouble() {
		sc = new Scanner(System.in);
		System.out.println("Introduce un valor decimal : ");
		return decimal = sc.nextDouble();
	}

	/**
	 * Devuelve un String
	 * 
	 * @return
	 */
	public static String getString() {
		sc = new Scanner(System.in);
		System.out.println("Introduce un valor String : ");
		return cadena = sc.nextLine();
	}
}
