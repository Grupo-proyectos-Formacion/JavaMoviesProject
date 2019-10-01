package controller;

import model.Pelicula;
import model.dao.DaoPeliculaIMPL;

public class Main {

	public static void main(String[] args) {

			DaoPeliculaIMPL daoPelis1 = new DaoPeliculaIMPL();
			daoPelis1.actualizaPelicula(new Pelicula(10,"Amelie", 2001,"comedia"));
		
		
	}

}
