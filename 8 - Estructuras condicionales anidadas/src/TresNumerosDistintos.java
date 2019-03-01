
public class TresNumerosDistintos {

//	private final static int NUM1 = (int) (Math.random() * (1 + 9) + 1);
//	private final static int NUM2 = (int) (Math.random() * (1 + 9) + 1);
//	private final static int NUM3 = (int) (Math.random() * (1 + 9) + 1);

	private final static int NUM1 = 1;
	private final static int NUM2 = 1;
	private final static int NUM3 = 1;

	public static void main(String[] args) {

		System.out.println("Numero 1 " + NUM1);
		System.out.println("Numero 2 " + NUM2);
		System.out.println("Numero 3 " + NUM3);

		if ((NUM1 == NUM2) && (NUM2 == NUM3)) {
			System.out.println("Los numeros de 1 , 2 , 3 son iguales : " + NUM1 + " - " + NUM2 + " - " + NUM3);
		} else {

			if ((NUM1 >= NUM2) && (NUM1 >= NUM3)) {
				System.out.println("Numero 1 es Mayor : " + NUM1);
				if (NUM1 == NUM2) {
					System.out.println("Numero 1 con valor : " + NUM1 + " es igual que numero 2 con valor : " + NUM2);
				}
				if (NUM1 == NUM3) {
					System.out.println("Numero 1 con valor : " + NUM1 + " es igual que numero 3 con valor : " + NUM3);
				}
			}

			if ((NUM2 >= NUM1) && (NUM2 >= NUM3)) {
				System.out.println("Numero 2 es Mayor : " + NUM2);
				if (NUM2 == NUM1) {
					System.out.println("Numero 2 con valor : " + NUM2 + " es igual que numero 1 con valor : " + NUM1);
				}
				if (NUM2 == NUM3) {
					System.out.println("Numero 2 con valor : " + NUM2 + " es igual que numero 3 con valor : " + NUM3);
				}
			}

			if ((NUM3 >= NUM1) && (NUM3 >= NUM2)) {
				System.out.println("Numero 3 es Mayor : " + NUM3);
				if (NUM3 == NUM1) {
					System.out.println("Numero 3 con valor : " + NUM3 + " es igual que numero 1 con valor : " + NUM1);
				}
				if (NUM3 == NUM2) {
					System.out.println("Numero 3 con valor : " + NUM1 + " es igual que numero 3 con valor : " + NUM3);
				}
			}
		}
	}
}
