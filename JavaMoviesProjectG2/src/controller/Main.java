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
		DaoUsuarioIMPL daoUsuario = new DaoUsuarioIMPL();
		System.out.println(daoUsuario.listarUsuario().toString());
		
		

	}

}
