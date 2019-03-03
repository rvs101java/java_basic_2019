
public class T1IncrementoBasico {

	public static void main(String[] args) {

		int x = 1;
		System.out.println("v : " + x);
		x = x + 1;
		System.out.println("v : " + x);
		x += 1;
		System.out.println("v : " + x);

		int y = 5;
		y += 4;
		System.out.println("v : y => 5 + 4 = " + y);

		int num1, num2 = 0;

		x = 5;
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
		x += 1;
		System.out.println(x);

		x = 1;

		while (x <= 100) {
			System.out.print(x + " ");
			if (x % 10 == 0)
				System.out.print("\n");
			x = x + 1;
		}

		// while (x <= 500 && (1 != 0 ? false : true));

		while (x <= 500) {
			System.out.print(x + " ");
			if (x % 10 == 0)
				System.out.print("\n");
			x++;
		}

		System.out.println("-------------");

		int n = 50;
		while ((n <= 100)) {
			System.out.print(n++ + " ");
			if (n % 10 == 0) {
				System.out.println(" ");
			}
		}

		System.out.println("\n----");
		while (--n >= 0)
			if (n <= 50) {
				System.out.print(n + " ");
				if ((n % 10) == 0)
					System.out.println();
			}

		while (++n <= 50) {
			System.out.print((n * 2) + (n % 10 == 0 ? "\n" : " | "));
		}
		
	}
}
