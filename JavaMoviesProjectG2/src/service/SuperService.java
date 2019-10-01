package service;

import model.Usuario;
import model.dao.DaoUsuarioIMPL;

public class SuperService {
	
	static DaoUsuarioIMPL daoUsu = new DaoUsuarioIMPL();
	
	public static void actualizarUsuario(Usuario usu) {
		daoUsu.actualizaUsuario(usu);
	}
	
	public static void borrarUsuaio(Usuario usu) {
		daoUsu.actualizaUsuario(usu);
	}

}
