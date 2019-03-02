
public class T6Operario {

	public static void main(String[] args) {

		Operario op1 = new Operario(450, 11);
		op1.getInforme();
		op1.toString();
		
		Operario op2 = new Operario(450, 9);
		op2.getInforme();
		op2.toString();
		
		Operario op3 = new Operario(500, 10);
		op3.getInforme();
		op3.toString();
		
	}

}

class Operario {

	private double sueldo;
	private int antiguedad;

	/**
	 * 
	 * @param sueldo
	 * @param anios
	 */
	public Operario(double sueldo, int antiguedad) {
		this.sueldo = sueldo;
		this.antiguedad = antiguedad;
	}

	/**
	 * 
	 * @return
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * 
	 * @return
	 */
	public int getAntiguedad() {
		return antiguedad;
	}

	/**
	 * 
	 */
	public void getInforme() {
		double sueldo = getSueldo();
		int antiguedad = getAntiguedad();
		if (sueldo < 500) {
			if (antiguedad >= 10) {
				sueldo += (sueldo / 100) * 20;
			}
		}
		if (sueldo < 500) {
			if (antiguedad < 10) {
				sueldo += (sueldo / 100) * 5;
			}
		}
		System.out.println("Sueldo : " + sueldo);
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Sueldos: " + getSueldo() + " Antiguedad: " + getAntiguedad();
	}
}