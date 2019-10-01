package controller;

import model.Pelicula;
import model.dao.DaoPeliculaIMPL;

public class Main {

	public static void main(String[] args) throws Exception {
		ConexionDB conn = new ConexionDB();


		DaoUsuarioIMPL daoU = new DaoUsuarioIMPL();
	

		Pelicula peli = new Pelicula("prueba1",1999,"drama");
		DaoPeliculaIMPL daoP = new DaoPeliculaIMPL();
		

		System.out.println(daoP.listarPeliculaCategoria(LecturaDato.LeerhTexto("Introduce una categoria para listar")));
			
	}
	
	

}
