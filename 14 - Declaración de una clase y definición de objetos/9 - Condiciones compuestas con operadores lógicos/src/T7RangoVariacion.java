
public class T7RangoVariacion {

	public static void main(String[] args) {

		RangoVariacion rv = new RangoVariacion(120, 80);
		rv.getCalcularVarianza();
		System.out.println(rv.toString());

		NumAleatorios na = new NumAleatorios();
		na.getNum();

		SolucionVariacion.getRangoVariacion(na.getNum(), na.getNum(), na.getNum());

	}
}

class RangoVariacion {

	private double num1;
	private double num2;
	private double resultado = 0;

	public RangoVariacion(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}

	public double getCalcularVarianza() {
		return resultado = ((getNum1() - getNum2()) / getNum2()) * 100;
	}

	public double getResultado() {
		return resultado;
	}

	@Override
	public String toString() {
		return "Rango de variacion : " + getResultado();
	}
}

class SolucionVariacion {

	public static void getRangoVariacion(int num1, int num2, int num3) {

		if (num1 < num2 && num1 < num3) {
			System.out.println("num1 " + num1);
		} else {
			if (num2 < num3) {
				System.out.println("num2 " + num2);
			} else {
				System.out.println("num3 " + num3);
			}
		}

		System.out.println("-");
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 " + num1);
		} else {
			if (num2 > num3) {
				System.out.println("num2 " + num2);
			} else {
				System.out.println("num3 " + num3);
			}
		}
	}
}
