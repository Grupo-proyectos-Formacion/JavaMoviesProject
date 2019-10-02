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
	 * T�tulo de pel�cula
	 */
	private String tituloPelicula;
	
	/**
	 * Valoracion de pel�cula
	 */
	private int valoracionPelicula;
	
	/**
	 * A�o de pel�cula
	 */
	private int anyoPelicula;
	
	/**
	 * Categor�a de pel�cula
	 */
	private String categoriaPelicula;

	/**
	 * Valoracion pel�cula
	 */
	private int valoracionPelicula;
	
	/**
	 * Visualizaciones de la pel�cula
	 */
	private int visualizacionPelicula;
	
	/**
	 * Constructor con 3 par�metros
	 * @param titulo
	 * T�tulo pel�cula
	 * @param anyo
	 * A�o pel�cula
	 * @param categoria
	 * Categor�a pel�cula
	 */
	public Pelicula(String tituloPelicula, int anyoPelicula, String categoriaPelicula) {
		
		this.tituloPelicula = tituloPelicula;
		this.anyoPelicula = anyoPelicula;
		this.categoriaPelicula = categoriaPelicula;
	}
	
	/**
	 * Constructor con 5 par�metros
	 * @param idPelicula
	 * Id de la pelicula
	 * @param titulo
	 * T�tulo pel�cula
	 * @param anyo
	 * A�o pel�cula
	 * @param categoria
	 * Categor�a pel�cula
	 * @param valoracion
	 * Valoracion de la pel�cula
	 */
	public Pelicula(int idPelicula, String tituloPelicula, int anyoPelicula, String categoriaPelicula, int valoracionPelicula) {
		this.idPelicula=idPelicula;
		this.tituloPelicula = tituloPelicula;
		this.anyoPelicula = anyoPelicula;
		this.categoriaPelicula = categoriaPelicula;
		this.valoracionPelicula = valoracionPelicula;
	}
	
	/**
     * Constructor con 5 par�metros
     * @param idPelicula
     * Id de la pelicula
     * @param titulo
     * T�tulo pel�cula
     * @param anyo
     * A�o pel�cula
     * @param categoria
     * Categor�a pel�cula
     * @param valoracion
     * Valoracion de la pel�cula
     */
    public Pelicula(int idPelicula, String tituloPelicula, int anyoPelicula, String categoriaPelicula, int valoracionPelicula) {
        this.idPelicula=idPelicula;
        this.tituloPelicula = tituloPelicula;
        this.anyoPelicula = anyoPelicula;
        this.categoriaPelicula = categoriaPelicula;
        this.valoracionPelicula = valoracionPelicula;
    }
    
    /**
     * Constructor con 5 par�metros
     * @param idPelicula
     * Id de la pelicula
     * @param titulo
     * T�tulo pel�cula
     * @param anyo
     * A�o pel�cula
     * @param categoria
     * Categor�a pel�cula
     * @param valoracion
     * Valoracion de la pel�cula
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
		return "Id pel�cula=" + idPelicula + ", T�tulo pelicula=" + tituloPelicula + ", A�o  pel�cula="
				+ anyoPelicula + ", Categor�a pel�cula=" + categoriaPelicula + ", Valoraci�n pel�cula="
				+ valoracionPelicula + ", Visualizaci�n pel�cula=" + visualizacionPelicula + "]\n";
	}

	

	

}
