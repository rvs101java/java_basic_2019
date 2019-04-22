package herencia;

/**
 * Subclase Empleado hereda de Persona
 */
public class Empleado extends Persona {

	// Propiedades
	private String tipoContratro;
	private Double sueldo;

	// Metodos de la clase
	public String getTipoContrato() {
		return tipoContratro;
	}

	public void setTipoContrato(String contrato) {
		this.tipoContratro = contrato;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * Metodo para calcular el salario
	 * 
	 * @param sueldoBase
	 */
	public void calcularSueldo(Double sueldoBase) {
		if (this.getTipoContrato() == "C") {
			this.setSueldo(sueldoBase + 350);
		} else {
			this.setSueldo(sueldoBase + 750);
		}
	}

}
