package xOtrosConceptos;

public class EjBoxingUnboxing {

	public static void main(String[] args) {
		int i = 1;
		Object object = i; // Boxing - primitivo a referencia 'objeto'
		System.out.println(i);
		int j = (int) object; // Unboxing - referencia 'objeto' a primitivo
		System.out.println(j);
	}
}
