
public class T17PruebasDeCodigo {

	public static void main(String[] args) {
		String palabra = "";
		char[] ch = new char[5];
		for (int c = 1; c < ch.length; c++) {
			if (ch[0] != 'a') {
				ch[0] = 'a';
				String mayu = Character.toString(ch[0]);
				palabra += mayu.toUpperCase();
			}
			
			if (ch[3] != 'e') {
				palabra += ch[3] = 'e';
			}
			
			palabra += ch[c] = (char) (Math.random() * 26 + 'a');
		}
		System.out.println(palabra);
	
		for (int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * (18 + 60) + 20));
		}
		;
	}
	
	
}
