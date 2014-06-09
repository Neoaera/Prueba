public class Socioa {
	private int cantidadmultas;
	public Cuenta Cuenta;

	public void solicitarDocumentos() {
		Recurso recurso = new Recurso();
		recurso.Texto.setPaginas(9);
	}

	public void cancelarCuenta() {
		Cuenta acount = new Cuenta();
	}

	public int getCantidadmultas() {
		return cantidadmultas;
	}

	public void setCantidadmultas(int cantidadmultas) {
		this.cantidadmultas = cantidadmultas;
	}

	public Cuenta getCuenta() {
		return Cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		Cuenta = cuenta;
	}
}