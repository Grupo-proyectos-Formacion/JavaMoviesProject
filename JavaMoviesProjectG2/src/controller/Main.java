package controller;

import java.io.Writer;
import java.sql.SQLException;
import java.util.Date;

import model.Usuario;
import model.dao.ConexionDB;
import model.dao.DaoUsuarioIMPL;
import utilities.LecturaDato;

public class Main {

	public static void main(String[] args) throws Exception {
		ConexionDB conn = new ConexionDB();

		DaoUsuarioIMPL daoU = new DaoUsuarioIMPL();
		
		
		
			System.out.println(daoU.listarUsuario());
		
	}

}
