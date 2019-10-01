package controller;

import java.sql.SQLException;
import java.util.Date;

import model.Pelicula;
import model.Usuario;
import model.dao.ConexionDB;
import model.dao.DaoPeliculaIMPL;
import model.dao.DaoUsuarioIMPL;
import utilities.LecturaDato;

public class Main {

	public static void main(String[] args) {
		ConexionDB conn = new ConexionDB();
		Pelicula peli = new Pelicula("prueba1",1999,"drama");
		DaoPeliculaIMPL daoP = new DaoPeliculaIMPL();
		try {
			daoP.insertaPelicula(peli);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
