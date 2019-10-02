package model;
/**
 * Enum Categoria
 * 
 * Contiene diferentes categoria de pelicula
 * 
 * @Daniel 
 */
public enum Categoria {
	
		TERROR("terror"),
		COMEDIA("comedia"),
		ROMANTICA("romantica"),
		THRILLER("thriller"),
		AVENTURA("aventura"),
		POLICIACA("policiaca"),
		ANIMACION("animacion");
	//
	// Atributo
	//
	/**
	 * Categoria
	 */
	private final String categoria;

	public String getCategoria() {
		return categoria;
	}
	
	private Categoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
