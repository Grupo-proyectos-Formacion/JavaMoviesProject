package controller;

import java.io.Writer;
import java.sql.SQLException;
import java.util.Date;

import model.Pelicula;
import model.Usuario;
import model.dao.ConexionDB;
import model.dao.DaoPeliculaIMPL;
import model.dao.DaoUsuarioIMPL;
import utilities.LecturaDato;

public class Main {

	public static void main(String[] args) throws Exception {
		ConexionDB conn = new ConexionDB();


		DaoUsuarioIMPL daoU = new DaoUsuarioIMPL();
	

		Pelicula peli = new Pelicula("prueba1",1999,"drama");
		DaoPeliculaIMPL daoP = new DaoPeliculaIMPL();
		

		daoP.eliminaPelicula(LecturaDato.LeerInt("Selecciona una id de pelicula para eliminar"));
			
	}
	
	

}
