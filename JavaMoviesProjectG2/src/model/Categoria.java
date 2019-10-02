package model;

public enum Categoria {
	
		TERROR("terror"),
		COMEDIA("comedia"),
		ROMANTICA("romantica"),
		THRILLER("thriller"),
		AVENTURA("aventura"),
		POLICIACA("policiaca"),
		ANIMACION("animacion"),
		TODAS("%");
	
	
	
	private final String categoria;

	public String getCategoria() {
		return categoria;
	}

	
	private Categoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
