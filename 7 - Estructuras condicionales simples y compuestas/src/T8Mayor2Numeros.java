
public class T8Mayor2Numeros {

	private int x = (int) (Math.random() * (1 + 10) + 1);
	private int y = (int) (Math.random() * (1 + 10) + 1);

	public static void main(String[] args) {

		int suma = 0, diferencia = 0;
		int multiplicacion = 0, division = 0;

		if (new T8Mayor2Numeros().x > new T8Mayor2Numeros().y) {
			suma = new T8Mayor2Numeros().x + new T8Mayor2Numeros().y;
			diferencia = new T8Mayor2Numeros().x + new T8Mayor2Numeros().y;
		}else {
			multiplicacion = new T8Mayor2Numeros().x + new T8Mayor2Numeros().y;
			division = new T8Mayor2Numeros().x + new T8Mayor2Numeros().y;
			
		}
		
		System.out.println("Suma : " + suma);
		System.out.println("Diferencia : " + diferencia);
		System.out.println("Multiplicacion : " + multiplicacion);
 		System.out.println("Division : " + division);
		
	}
}
