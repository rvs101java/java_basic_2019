import java.util.Random;

public class TipoPosNegNull {

	private static int num1;
	private static int num2s;
	private int num2;
	private final static TipoPosNegNull TPN = new TipoPosNegNull();

	static {
		num1 = (int) (Math.random() * (1 + 9) + 1);
		num2s = TPN.num2 = new Random().nextInt();
	}

	public TipoPosNegNull() {
		num1 = num2 = num2s = 0;
	}

	public static void main(String[] args) {

		System.out.println(num1);
		System.out.println(TPN.num2);
		System.out.println(num2s);

		if (TPN.num2 == 0) {
			System.out.println("Numero Nuetro : " + TPN.num2);
		} else if (TPN.num2 > 0) {
			System.out.println("Numero Positivo : " + TPN.num2);
		}else if(TPN.num2 < 0) {
			System.out.println("Numero Negativo : " + TPN.num2);
		}

	}
}
