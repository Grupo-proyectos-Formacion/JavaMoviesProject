/**
 * @author Daniel
 * @author Sisa Romero
 * @author Julian Bautista
 */
package service;

import java.util.ArrayList;

import model.Pelicula;
import model.Usuario;
import model.dao.DaoPeliculaIMPL;
import model.dao.DaoUsuarioIMPL;
import model.dao.DaoPeliculaIMPL;

public class SuperService {
	
	static DaoUsuarioIMPL daoUsu = new DaoUsuarioIMPL();
	static DaoPeliculaIMPL daoPeli = new DaoPeliculaIMPL();
	
	public static void insertarUsuario(Usuario usu) {
		daoUsu.insertarUsuario(usu);
	}
	
	public static void actualizarUsuario(Usuario usu) {
		daoUsu.actualizaUsuario(usu);
	}
	
	public static void eliminarUsuario(int usuario) {
		daoUsu.eliminarUsuario(usuario);
	}
	
	public static void eliminarPelicula(int pelicula) {
        daoPeli.eliminaPelicula(pelicula);
    }

	public static ArrayList<Usuario> listarUsuario(){
		return daoUsu.listarUsuario();
	}
			
	public static ArrayList<Pelicula> listarPelicula() {
		return daoPeli.listarPelicula();				
<<<<<<< HEAD
	}
	
	public static ArrayList<Pelicula> listarPeliculaCategoria(String categoria) {
		return daoPeli.listarPeliculaCategoria(categoria);
	}

=======
	}
	
	public static ArrayList<Pelicula> listarPeliculaCategoria(String categoria) {
		return daoPeli.listarPeliculaCategoria(categoria);
	}
	
>>>>>>> branchJulian
	public static ArrayList<Pelicula> listarPeliculaNoVistas() {
		return daoPeli.listarPeliculaNoVista();
	}

<<<<<<< HEAD

=======
>>>>>>> branchJulian
	public static ArrayList<Usuario> listarUsuario(Usuario usu) {
		return daoUsu.listarUsuario();
	}
	
	public static void insertarPelicula(Pelicula peli) {
		daoPeli.insertaPelicula(peli);
	}
	
<<<<<<< HEAD

=======
>>>>>>> branchJulian
	public static void actualizarPelicula(Pelicula peli) {
        daoPeli.actualizaPelicula(peli);
    }
	
	public static ArrayList<Pelicula> listarPeliculaPorValoracion(int numero) {
        return daoPeli.listarPeliculaPorValoracion(numero);
    }
<<<<<<< HEAD

=======
>>>>>>> branchJulian
}
