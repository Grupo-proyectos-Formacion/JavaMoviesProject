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
	 * Id pelicula
	 *
	 */
	private int idPelicula;
	

	/**
	 * T�tulo de pel�cula
	 */
	private String tituloPelicula;
	
	/**
	 * A�o de pel�cula
	 */
	private int anyoPelicula;
	
	/**
	 * Categor�a de pel�cula
	 */
	private String categoriaPelicula;
	/**
	 * visitas
	 */
	private int vecesVistas;
	
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
	 * Constructor con 4 par�metros
	 * @param idPelicula
	 * Id de la pelicula
	 * @param titulo
	 * T�tulo pel�cula
	 * @param anyo
	 * A�o pel�cula
	 * @param categoria
	 * Categor�a pel�cula
	 */
	public Pelicula(int idPelicula, String tituloPelicula, int anyoPelicula, String categoriaPelicula) {
		this.idPelicula=idPelicula;
		this.tituloPelicula = tituloPelicula;
		this.anyoPelicula = anyoPelicula;
		this.categoriaPelicula = categoriaPelicula;
	}
	
	

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public Pelicula(int idPelicula, String tituloPelicula, int anyoPelicula, String categoriaPelicula) {
		super();
		this.idPelicula = idPelicula;
		this.tituloPelicula = tituloPelicula;
		this.anyoPelicula = anyoPelicula;
		this.categoriaPelicula = categoriaPelicula;
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

	@Override
	public String toString() {
		return "Pelicula [tituloPelicula=" + tituloPelicula + ", anyoPelicula=" + anyoPelicula + ", categoriaPelicula="
				+ categoriaPelicula + "]";
	}

	

}
