
import java.util.Scanner;

public class SuperficieCuadrado {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int lado;
		int superficie;
		int superficie2;
		System.out.println("Ingrese el valor del lado del cuadrado: ");
		lado = teclado.nextInt();
		
		superficie = (int)Math.pow(lado, 2);
		superficie2 = (lado * lado);
		
		System.out.println("La superficie del cuadrado es : ");
		System.out.println("Con Math.pow() : "+superficie + " - Sin Math : " + superficie2);
		
		
	}
}
