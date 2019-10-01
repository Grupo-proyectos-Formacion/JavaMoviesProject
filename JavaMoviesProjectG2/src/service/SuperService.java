/**
 * @author Daniel
 * @author Sisa Romero
 */
package service;

import model.Pelicula;
import model.Usuario;
import model.dao.DaoUsuarioIMPL;
import model.dao.DaoPeliculaIMPL;

public class SuperService {
	
	static DaoUsuarioIMPL daoUsu = new DaoUsuarioIMPL();
	static DaoPeliculaIMPL daoPeli = new DaoPeliculaIMPL();
	
	public static void insertarUsuario(Usuario usu) {
		daoUsu.insertaUsuario(usu);
	}
	
	public static void actualizarUsuario(Usuario usu) {
		daoUsu.actualizaUsuario(usu);
	}
	
	public static void borrarUsuario(Usuario usu) {
		daoUsu.eliminaUsuario(usu.getIdUsuario());
	}
	
	public static void listarUsuario(Usuario usu) throws Exception {
		daoUsu.listarUsuario();
	}
	public static void insertarPelicula(Pelicula peli) {
		daoPeli.crearPelicula();
	}
	
	public static void listarPeliculaPorValoracion(int numero) {
		daoPeli.listarPeliculaPorValoracion();
	}
	
	public static void listarPeliculaNoVistas() {
		daoPeli.listarPeliculaNoVistas();
	}
	

}


