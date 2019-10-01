/**
 * @author Daniel
 * @author Sisa Romero
 * @author Julian Bautista
 */
package service;

import model.Pelicula;
import model.Usuario;
import model.dao.DaoPeliculaIMPL;
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
	
	public static void eliminarPelicula(int Pelicula) {
        daoPeli.eliminaPelicula(Pelicula);
    }

	public static void listarUsuario(){
		daoUsu.listarUsuario();
	}
			
	public static void listarPelicula() {
		daoPeli.listarPelicula();				
	}
	
	public static void listarPeliculaCategoria(String categoria) {
		daoPeli.listarPeliculaCategoria(String categoria);
	}
	
	public static void listarPeliculaNoVistas(String categoria) {
		daoPeli.listarPeliculaNoVistas();
	}

	public static void listarUsuario(Usuario usu) {
		daoUsu.listarUsuario();
	}
	
	public static void insertarPelicula(Pelicula peli) {
		daoPeli.crearPelicula();
	}
}
