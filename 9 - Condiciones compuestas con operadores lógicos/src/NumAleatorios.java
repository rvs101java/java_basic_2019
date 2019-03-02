
public class NumAleatorios {

	private int num;

	public NumAleatorios() {
		num = 0;
	}

	public int getNum() {
		return num = (int) (Math.random() * (1 + 100) + 1);
	}

}
