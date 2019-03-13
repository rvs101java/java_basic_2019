
import java.util.Scanner;

public class T8TresNotasAlumno {

	private static int nota1;
	private static int nota2;
	private static int nota3;
	private static int promedio;
	private static Scanner sc = new Scanner(System.in);

	public T8TresNotasAlumno() {
		T8TresNotasAlumno.nota1 = 0;
		nota2 = 0;
		T8TresNotasAlumno.nota3 = (T8TresNotasAlumno.nota1 + nota2);
	}

	public int getNumero() {
		int num = sc.nextInt();
		while ((num <= 0) || (num > 10)) {
			System.out.println("Numero no valido \n" + "Introduce otro numero entre 1 o 10");
			num = sc.nextInt();
		}
		return num;
	}

	public static void main(String[] args) {
		
		System.out.println("Introduce 1º nota");
		nota1 = new T8TresNotasAlumno().getNumero();
		System.out.println("Introduce 2º nota");
		nota2 = new T8TresNotasAlumno().getNumero();
		System.out.println("Introduce 3º nota");
		nota3 = new T8TresNotasAlumno().getNumero();

		promedio = (nota1 + nota2 + nota3);

		if (promedio >= 7) {
			System.out.println("Promocionando");
		} else if (promedio >= 4 || promedio < 7) {
			System.out.println("Regular");
		} else {
			System.out.println("Suspenso");
		}

		sc.close(); 

	}
}
