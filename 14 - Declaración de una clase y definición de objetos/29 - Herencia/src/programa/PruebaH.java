package programa;

public class PruebaH {

	public static void main(String[] args) {
		SumaH suma1 = new SumaH();
		suma1.getCargar1();
		suma1.getCargar2();
		suma1.operar();
		System.out.println("El resultado de la suma es: ");
		suma1.mostrarResultado();
	
		RestaH resta1 = new RestaH();
		resta1.getCargar1();
		resta1.getCargar2();
		resta1.operar();
		System.out.println("El resultado de la resta es: ");
		resta1.mostrarResultado();
		
	
	
	}
}
