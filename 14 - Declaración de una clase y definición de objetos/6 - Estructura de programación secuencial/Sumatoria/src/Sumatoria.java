import java.util.Scanner;

public class Sumatoria {

	private int num1;
	private int num2;
	private int num;
	
	public Sumatoria(){
		this.num1 = 10;
		this.num2 = 20;
	}

	public static void main(String[] args) {

		int suma , producto;
		Scanner sc = new Scanner(System.in);
		Sumatoria s = new Sumatoria();

		System.out.println("Introduce 2 numeros");
		s.num = sc.nextInt();
		
		suma = (new Sumatoria().num1 = s.num) + (new Sumatoria().num2 = s.num);
		System.out.println(s.num);
		System.out.println(new Sumatoria().num);
		System.out.println(new Sumatoria().num1);
		System.out.println(new Sumatoria().num2);
		System.out.println("La suma es : " + suma);

		producto = suma + (new Sumatoria().num1 + new Sumatoria().num2);
		System.out.println("El producto es : " + producto);
		
		sc.close();
		
		

	}
}
