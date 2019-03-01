
public class SueldoUsuario {

	public static void main(String[] args) {

		int sueldo = (int) (Math.random() * (1 + 5000) + 1);
		System.out.println(sueldo);
		if (sueldo > 3000) {
			System.out.println("♠ Paga impuestos: " + sueldo);
		} else {
			System.out.println("☺ No paga impuestos ");
		}
	}
}
