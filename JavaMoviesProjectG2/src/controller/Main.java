package controller;

import java.sql.SQLException;
import java.util.Date;

import model.Usuario;
import model.dao.ConexionDB;
import model.dao.DaoUsuarioIMPL;
import utilities.LecturaDato;

public class Main {

	public static void main(String[] args) {
		ConexionDB conn = new ConexionDB();
		Usuario us = new Usuario("julian","Bautista Velez", LecturaDato.LeerFecha() ,LecturaDato.LeerFecha());
		DaoUsuarioIMPL daoU = new DaoUsuarioIMPL();
		
		daoU.insertaUsuario(us);
		daoU.eliminaUsuario(3);
		try {
			daoU.listarUsuario();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
