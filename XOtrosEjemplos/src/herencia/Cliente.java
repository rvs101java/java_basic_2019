package herencia;

/**
 * Subclase Cliente hereda todos los atributos , metodos de Persona
 */
public class Cliente extends Persona {

	// Propiedades
	private String categoria;
	private String codigo;

	/**
	 * Constructor por defecto
	 */
	public Cliente() {
		this.categoria = null;
		this.codigo = null;
	}

	// Metodos
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo que crea un codigo
	 */
	public void generarCodigo() {
		this.setCodigo("C".concat(this.getNombres().substring(0, 3).concat(this.getDocumento().substring(0, 2))));
	}

}
