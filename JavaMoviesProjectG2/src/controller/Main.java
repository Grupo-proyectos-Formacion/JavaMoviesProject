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
		/*ConexionDB conn = new ConexionDB();
		Usuario us = new Usuario("julian","Bautista Velez", LecturaDato.LeerFecha() ,LecturaDato.LeerFecha());
		DaoUsuarioIMPL daoU = new DaoUsuarioIMPL();
		
		daoU.insertaUsuario(us);
		daoU.eliminaUsuario(3);*/
		
		
		Menu.menuTareaCompletada();
	}

}
