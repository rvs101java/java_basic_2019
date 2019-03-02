

public class T1FechaNavidad {

	private int dia;
	private int mes;
	private int anio;

	/**
	 * 
	 */
	public T1FechaNavidad() {
		dia = (int) (Math.random() * (1 + 30) + 1);
		mes = (int) (Math.random() * (1 + 11) + 1);
		anio = (int) (Math.random() * (1 + 20) + 2000);
	}

	/**
	 * 
	 * @return
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * 
	 * @return
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * 
	 * @return
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * 
	 * @return
	 */
	public String getFecha() {
		int dia = getDia();
		int mes = getMes();
		int anio = getAnio();

		if ((dia == 25) && (mes == 12) && ((anio > 2000) && (anio <= 2020)))
			return "Navidad - dia : " + dia + " mes : " + mes + " anio " + anio;

		return "Dia: " + dia + " Mes: " + mes + " Anio: " + anio;
	}

	@Override
	public String toString() {
		return getFecha();
	}

	public static void main(String[] args) {
		T1FechaNavidad t1 = new T1FechaNavidad();
		System.out.println(t1.toString());
	}
}
