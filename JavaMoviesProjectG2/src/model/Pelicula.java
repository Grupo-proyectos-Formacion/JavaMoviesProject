/**
 * @author Luis
 */

package model;

public class Pelicula {
	
	private String titulo;
	private int anyo;
	private String categoria;
	
	public Pelicula() {
		
	}
	
	public Pelicula(String titulo, int anyo, String categoria) {
		
		this.titulo = titulo;
		this.anyo = anyo;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", anyo=" + anyo + ", categoria=" + categoria + "]";
	}

}
