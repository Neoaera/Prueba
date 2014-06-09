public class Recurso {
	private String titulo;
	private String iD;
	private String calsificacion;
	private String genero;
	private String fecha;
	public Biblioteca Biblioteca;
	public Texto Texto;
	public Audiovisual Audiovisual;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getCalsificacion() {
		return calsificacion;
	}
	public void setCalsificacion(String calsificacion) {
		this.calsificacion = calsificacion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Biblioteca getBiblioteca() {
		return Biblioteca;
	}
	public void setBiblioteca(Biblioteca biblioteca) {
		Biblioteca = biblioteca;
	}
	public Texto getTexto() {
		return Texto;
	}
	public void setTexto(Texto texto) {
		Texto = texto;
	}
	public Audiovisual getAudiovisual() {
		return Audiovisual;
	}
	public void setAudiovisual(Audiovisual audiovisual) {
		Audiovisual = audiovisual;
	}
}