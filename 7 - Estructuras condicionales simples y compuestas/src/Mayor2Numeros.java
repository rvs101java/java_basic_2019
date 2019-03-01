
public class Mayor2Numeros {

	private int x = (int) (Math.random() * (1 + 10) + 1);
	private int y = (int) (Math.random() * (1 + 10) + 1);

	public static void main(String[] args) {

		int suma = 0, diferencia = 0;
		int multiplicacion = 0, division = 0;

		if (new Mayor2Numeros().x > new Mayor2Numeros().y) {
			suma = new Mayor2Numeros().x + new Mayor2Numeros().y;
			diferencia = new Mayor2Numeros().x + new Mayor2Numeros().y;
		}else {
			multiplicacion = new Mayor2Numeros().x + new Mayor2Numeros().y;
			division = new Mayor2Numeros().x + new Mayor2Numeros().y;
			
		}
		
		System.out.println("Suma : " + suma);
		System.out.println("Diferencia : " + diferencia);
		System.out.println("Multiplicacion : " + multiplicacion);
 		System.out.println("Division : " + division);
		
	}
}
