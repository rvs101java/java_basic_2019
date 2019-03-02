
public class T5IngCoor {

	private int x;
	private int y;

	public T5IngCoor() {
		x = 0;
		y = 0;
	}

	public T5IngCoor(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return " ( x = " + x + " > 0 ) : ( y = " + y + " > 0 )";
	}

	public static void main(String[] args) {

		T5IngCoor t1 = new T5IngCoor(LeerTeclado.getInt(), LeerTeclado.getInt());
		t1.getX();
		t1.getY();
		System.out.println(t1.toString());
		T5IngCoor t2 = new T5IngCoor(LeerTeclado.getInt(), LeerTeclado.getInt());
		t2.getX();
		t2.getY();
		System.out.println(t2.toString());

	}
}
