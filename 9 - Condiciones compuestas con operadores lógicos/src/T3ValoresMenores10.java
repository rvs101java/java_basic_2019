
public class T3ValoresMenores10 {

	public static void main(String[] args) {

		int n1 = (int) (Math.random() * (1 + 9) + 1);
		int n2 = (int) (Math.random() * (1 + 9) + 1);
		int n3 = (int) (Math.random() * (1 + 9) + 1);

		System.out.println("1º Numero  : " + n1);
		System.out.println("2º Numero  : " + n2);
		System.out.println("3º Numero  : " + n3);

		int suma = 0;

		suma = (n1 + n2 + n3);
		System.out.println("Suma total : " + suma);

		if ((n1 > 3) && (n2 > 3) && (n3 > 3)) {
			System.out.println("• Num 1º: " + n1 + " Num 2º: " + n2 + " Num 3º: " + n3 + " - No se pueden sumar");
		} else if (suma > 10) {
			System.out.println("• Num 1º: " + n1 + " Num 2º: " + n2 + " Num 3º: " + n3 + " - No se pueden sumar");
		} else {
			System.out.println("- Num 1º: " + n1 + " Num 2º: " + n2 + " Num 3º: " + n3 + " - Se pueden sumar");
		}
	}
}
