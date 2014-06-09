import java.util.Vector;

public class Funcioario extends Bibliotecarioa {
	private boolean permisodeacceso;
	private String nombre;
	private String iD;
	public Vector<Biblioteca> funcionarios = new Vector<Biblioteca>();
	public boolean isPermisodeacceso() {
		return permisodeacceso;
	}
	public void setPermisodeacceso(boolean permisodeacceso) {
		this.permisodeacceso = permisodeacceso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public Vector<Biblioteca> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Vector<Biblioteca> funcionarios) {
		this.funcionarios = funcionarios;
	}
}