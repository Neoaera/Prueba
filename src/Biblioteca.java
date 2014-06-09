public class Biblioteca {
	private String nombre;
	private String direccion;
	private String precio;
	private boolean abierta;
	public Funcioario funcionarios;
	public Recurso Recurso;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public boolean isAbierta() {
		return abierta;
	}
	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	public Funcioario getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcioario funcionarios) {
		this.funcionarios = funcionarios;
	}
	public Recurso getRecurso() {
		return Recurso;
	}
	public void setRecurso(Recurso recurso) {
		Recurso = recurso;
	}
}