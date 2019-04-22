package herencia;

/**
 * Clase principal - Modelo que heredarán las demas clases
 */
public class Persona {

	// Propiedades
	private String apellidos;
	private String nombres;
	private String documento;
	private String tipo;

	/**
	 * Constructor por defecto
	 */
	public Persona() {
		apellidos = nombres = documento = tipo = null;
	}

	/**
	 * Constructor para implementar un objeto
	 * 
	 * @param nombres
	 * @param apellidos
	 * @param documento
	 * @param tipo
	 */
	public Persona(String nombres, String apellidos, String documento, String tipo) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.documento = documento;
		this.tipo = tipo;
	}
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
