import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculos {

	public static void get2Decimales() {
		for (int i = 0; i < 20; i++) {
			double longitudPerfil = (double) (Math.random() * (1 + 2) + 1);
			BigDecimal bd = new BigDecimal(longitudPerfil);
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			System.out.println(bd.doubleValue());
		}
	}

	public static void main(String[] args) {

		get2Decimales();
	}
}
