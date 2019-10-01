package service;

import model.Usuario;
import model.dao.DaoUsuarioIMPL;

public class SuperService {
	
	static DaoUsuarioIMPL daoUsu = new DaoUsuarioIMPL();
	static DaoPeliculaIMPL daoPeli = new DaoPeliculaIMPL();
	
	public static void insertarUsuario(Usuario usu) {
		daoUsu.insertaUsuario(usu);
	}
	
	public static void actualizarUsuario(Usuario usu) {
		daoUsu.actualizaUsuario(usu);
	}
	
	public static void borrarUsuaio(Usuario usu) {
		daoUsu.actualizaUsuario(usu);
	}
	
	public static void listarUsuario(Usuario usu) throws Exception {
		daoUsu.listarUsuario();
	}
	public static void crearPelicula(Pelicula peli) {
		daoPeli.crearPelicula();
	}
}


