public class Texto extends Libro {
	private int paginas;
	private String editorial;
	private String clasificacion;
	private int iSDN;
	private String idioma;
	public Recurso Recurso;
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public int getiSDN() {
		return iSDN;
	}
	public void setiSDN(int iSDN) {
		this.iSDN = iSDN;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Recurso getRecurso() {
		return Recurso;
	}
	public void setRecurso(Recurso recurso) {
		Recurso = recurso;
	}
}