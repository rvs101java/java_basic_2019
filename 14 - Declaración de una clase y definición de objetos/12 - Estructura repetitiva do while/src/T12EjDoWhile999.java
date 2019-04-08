
public class T12EjDoWhile999 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * (1 + 100) + 1);
		System.out.println("Numero :" + x);
		do {
			if (x >= 100) {
				System.out.println("3 digitos : " + x);
			}
			if (x >= 10) {
				System.out.println("2 digitos : " + x);
			} else {
				System.out.println("1 digito : " + x);
			}
		} while (false);

		System.out.println("-----------------------");

		int valor = (int) (Math.random() * (1 + 100) + 1);
		System.out.println("Numero : " + valor);
		do {
			if (valor >= 100) {
				System.out.println("Tiene 3 dígitos.");
			} else {
				if (valor >= 10) {
					System.out.println("Tiene 2 dígitos.");
				} else {
					System.out.println("Tiene 1 dígito.");
				}
			}
		} while (valor == 0);
	}
}
