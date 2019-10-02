/**
 * @author Luis
 * @author Daniel
 */

package model;

public class Pelicula {
	/**
	 * Id de la pelicula
	 */
	private int idPelicula;	

	/**
	 * Título de película
	 */
	private String tituloPelicula;
	
	/**
	 * Valoracion de película
	 */
	private int valoracionPelicula;
	
	/**
	 * Año de película
	 */
	private int anyoPelicula;
	
	/**
	 * Categoría de película
	 */
	private String categoriaPelicula;
	/**
	 * visitas
	 */
	private int vecesVistas;
	
	/**
	 * Valoracion película
	 */
	private int valoracionPelicula;
	
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
	
	/**
	 * Constructor con 5 parámetros
	 * @param idPelicula
	 * Id de la pelicula
	 * @param titulo
	 * Título película
	 * @param anyo
	 * Año película
	 * @param categoria
	 * Categoría película
	 * @param valoracion
	 * Valoracion de la película
	 */
	public Pelicula(int idPelicula, String tituloPelicula, int anyoPelicula, String categoriaPelicula, int valoracionPelicula) {
		this.idPelicula=idPelicula;
		this.tituloPelicula = tituloPelicula;
		this.anyoPelicula = anyoPelicula;
		this.categoriaPelicula = categoriaPelicula;
		this.valoracionPelicula = valoracionPelicula;
	}
	
	/**
     * Constructor con 5 parámetros
     * @param idPelicula
     * Id de la pelicula
     * @param titulo
     * Título película
     * @param anyo
     * Año película
     * @param categoria
     * Categoría película
     * @param valoracion
     * Valoracion de la película
     */
    public Pelicula(int idPelicula, String tituloPelicula, int anyoPelicula, String categoriaPelicula, int valoracionPelicula) {
        this.idPelicula=idPelicula;
        this.tituloPelicula = tituloPelicula;
        this.anyoPelicula = anyoPelicula;
        this.categoriaPelicula = categoriaPelicula;
        this.valoracionPelicula = valoracionPelicula;
    }

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
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

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public int getValoracionPelicula() {
		return valoracionPelicula;
	}

	public void setValoracionPelicula(int valoracionPelicula) {
		this.valoracionPelicula = valoracionPelicula;
	}

	@Override
	public String toString() {
		return "Pelicula [tituloPelicula=" + tituloPelicula + ", anyoPelicula=" + anyoPelicula + ", categoriaPelicula="
				+ categoriaPelicula + "]";
	}

	

}
