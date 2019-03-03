import java.math.BigDecimal;
import java.math.RoundingMode;

public class T4FabricaDeHierro {

	public static void main(String[] args) {

		Programa.getPrograma();
		
	}
}

class Programa {

	private int cantidadPiezas;
	private int cantidadPiezasAptas;
	private int contadorPiezas;
	private double longitudPerfil;

	public int getCantidad() {
		cantidadPiezas = (int) (Math.random() * (1 + 30) + 10);
		return cantidadPiezas;
	}

	public void setCantidadAptas(int aptas) {
		this.cantidadPiezasAptas = aptas;
	}

	public int getCantidadAptas() {
		return cantidadPiezasAptas;
	}

	public double getLongitudPieza() {
		BigDecimal bd = new BigDecimal((double) (Math.random() * (0.1 + 1) + 0.5));
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		contadorPiezas++;
		longitudPerfil = bd.doubleValue();
		System.out.println((contadorPiezas) + " : Pieza - " + "Longitud de la pieza: " + longitudPerfil);
		return longitudPerfil;
	}

	public void getComprobarLongitudes() {
		int numero = 0;
		int apta = 1;

		while (numero < getCantidad()) {
			double longitud = getLongitudPieza();
			if ((longitud >= 1.20) && (longitud <= 1.30)) {
				System.out.println("\t Longitud : " + longitud + " Apta : " + apta);
				setCantidadAptas(apta++);
			}
			numero++;
		}
	}

	@Override
	public String toString() {
		return "Cantidad : " + getCantidad() + " Piezas aptas : " + getCantidadAptas();
	}

	public static void getPrograma() {
		Programa p = new Programa();
		p.getComprobarLongitudes();
		System.out.println(p.toString());
	}

}

 