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
	 * Año de película
	 */
	private int anyoPelicula;
	
	/**
	 * Categoría de película
	 */
	private String categoriaPelicula;

	/**
	 * Valoracion película
	 */
	private int valoracionPelicula;
	
	/**
	 * Visualizaciones de la película
	 */
	private int visualizacionPelicula;
	
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
	 * Constructor con 4 parámetros
	 * @param idPelicula
	 * Id de la pelicula
	 * @param titulo
	 * Título película
	 * @param anyo
	 * Año película
	 * @param categoria
	 * Categoría película
	 */
	public Pelicula(int idPelicula, String tituloPelicula, int anyoPelicula, String categoriaPelicula) {
		this.idPelicula=idPelicula;
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
     * @param visualizacion
     * Visualizaciones de la pelicula
     */
    public Pelicula(int idPelicula, String tituloPelicula, int anyoPelicula, String categoriaPelicula, int valoracionPelicula, int visualizacionPelicula) {
        this.idPelicula=idPelicula;
        this.tituloPelicula = tituloPelicula;
        this.anyoPelicula = anyoPelicula;
        this.categoriaPelicula = categoriaPelicula;
        this.valoracionPelicula = valoracionPelicula;
        this.visualizacionPelicula = visualizacionPelicula;
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

	public int getValoracionPelicula() {
		return valoracionPelicula;
	}

	public void setValoracionPelicula(int valoracionPelicula) {
		this.valoracionPelicula = valoracionPelicula;
	}

	public int getVisualizacionPelicula() {
		return visualizacionPelicula;
	}

	public void setVisualizacionPelicula(int visualizacionPelicula) {
		this.visualizacionPelicula = visualizacionPelicula;
	}

	@Override
	public String toString() {
		return "Id película=" + idPelicula + ", Título pelicula=" + tituloPelicula + ", Año  película="
				+ anyoPelicula + ", Categoría película=" + categoriaPelicula + ", Valoración película="
				+ valoracionPelicula + ", Visualización película=" + visualizacionPelicula + "]\n";
	}

	

	

}
