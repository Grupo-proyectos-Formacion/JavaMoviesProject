/**
 * @author Luis
 */

package model;

public class Pelicula {
	
	/**
	 * Título de película
	 */
	private String tituloPelicula;
	
	/**
	 * Año de película
	 */
	private int anyoPelicula;
	
	/**
	 * Categoría de película
	 */
	private String categoriaPelicula;
	
	public Pelicula() {
		
	}
	
	/**
	 * Constructor con 3 parámetros
	 * @param titulo
	 * Título película
	 * @param anyo
	 * Año película
	 * @param categoria
	 * Categoría película
	 */
	public Pelicula(String tituloPelicula, int anyoPelicula, String categoriaPelicula) {
		
		this.tituloPelicula = tituloPelicula;
		this.anyoPelicula = anyoPelicula;
		this.categoriaPelicula = categoriaPelicula;
	}

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public int getAnyoPelicula() {
		return anyoPelicula;
	}

	public void setAnyoPelicula(int anyoPelicula) {
		this.anyoPelicula = anyoPelicula;
	}

	public String getCategoriaPelicula() {
		return categoriaPelicula;
	}

	public void setCategoriaPelicula(String categoriaPelicula) {
		this.categoriaPelicula = categoriaPelicula;
	}

	@Override
	public String toString() {
		return "Pelicula [tituloPelicula=" + tituloPelicula + ", anyoPelicula=" + anyoPelicula + ", categoriaPelicula="
				+ categoriaPelicula + "]";
	}

	

}
