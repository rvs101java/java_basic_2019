
public class T20EjOrdenacionBasic4Optimizado2String {

	public static void main(String[] args) {

		OrdenacionEficienteString oe = new OrdenacionEficienteString();
		oe.cargar();

	}
}

class OrdenacionEficienteString {

	private String cad1;
	private String cad2;

	public void setCadena1(String cad1) {
		this.cad1 = cad1;
	}

	public String getCadena1() {
		return cad1;
	}

	public void setCadena2(String cad2) {
		this.cad2 = cad2;
	}

	public String getCadena2() {
		return cad2;
	}

	public void cargar() {
		setCadena1("juan");
		setCadena2("analia");
		if (getCadena1().compareTo(getCadena2()) > 0) {
			System.out.println(getCadena1() + " es mayor alfabeticamente que " + getCadena2());
		} else {
			System.out.println(getCadena1() + " es menor alfabeticamente que " + getCadena2());
		}
		System.out.println("Resultado (\"b\".compareTo(\"a\") - b es mayor a alfabéticamente : " + ("b".compareTo("a")));
		System.out.println("Resultado (\"a\".compareTo(\"b\") - a es menor b alfabéticamente: " + ("a".compareTo("b")));
		System.out.println("Resultado : " + ("juan".compareTo("analia") > 0));
	}
}
