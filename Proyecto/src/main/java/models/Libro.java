package models;

public class Libro {
	public String idlibro;
	public String titulo;
	public String autor;
	public String editorial;
	public int stock;
	public String estado;
	public Libro() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Libro(String idlibro, String titulo, String autor, String editorial, int stock, String estado) {
		//super();
		this.idlibro = idlibro;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.stock = stock;
		this.estado = estado;
	}
	public Libro(String titulo, String autor, String editorial, int stock, String estado) {
		//super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.stock = stock;
		this.estado = estado;
	}
	
	public String toString() {
		return "Libro [idlibro " + idlibro + ", titulo " + titulo + ", autor " + autor + ", editorial " + editorial + ", stock " + stock + ", estado " + estado + "]";
	}
	public String getIdlibro() {
		return idlibro;
	}
	public void setIdlibro(String idlibro) {
		this.idlibro = idlibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
