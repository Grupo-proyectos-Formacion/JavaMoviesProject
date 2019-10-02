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

/**
 * Clase Superservice
 * 
 * Contiene metodos relacionados con Usuario y Peliculas que llama al DaoUsuario y a DaoPelicula
 * 
 *
 */
public class SuperService {
	
	/**
	*
	* Creacion de daoUsu y daoPeli
	*/
	static DaoUsuarioIMPL daoUsu = new DaoUsuarioIMPL();
	static DaoPeliculaIMPL daoPeli = new DaoPeliculaIMPL();

	// -------------------------------
	// Metodos relacionado con Usuario
	// -------------------------------
	
	/**
	* Metodo para insertar un usuario
	* 
	* @param usu
	*/
	public static void insertarUsuario(Usuario usu) {
		daoUsu.insertaUsuario(usu);
	}
	/**
	* Metodo para actualizar un usuario
	* 
	*  @param usu
	*/
	public static void actualizarUsuario(Usuario usu) {
		daoUsu.actualizaUsuario(usu);
	}
	/**
	* Metodo para eliminar un usuario
	* 
	*  @param usu
	*/
	public static void eliminarUsuario(int usuario) {
		daoUsu.eliminaUsuario(usuario);
	}
	/**
	* Metodo para listar un usuario
	* @return
	*         <ul>
	*         <li>listarUsuario</li>
	*         </ul>
	*/
		public static ArrayList<Usuario> listarUsuario(){
		return daoUsu.listarUsuario();
	}
		
	// -------------------------------
	// Metodos relacionado con Película
	// -------------------------------
	/**
	* Metodo para listar peliculas
	* 
	* @return
	*         <ul>
	*         <li>listarPelicula/li>
	*         </ul>
	*/					
	public static ArrayList<Pelicula> listarPelicula() {
		return daoPeli.listarPelicula();				
	}
	/**
	* Metodo para listar peliculas por categoria
	* @param categoria
	* @return
	*         <ul>
	*         <li>listarPeliculaCategoria/li>
	*         </ul>
	*/	
	public static ArrayList<Pelicula> listarPeliculaCategoria(String categoria) {
		return daoPeli.listarPeliculaCategoria(categoria);
	}
	/**
	* Metodo para listar pelicula no vistas
	* @return
	*         <ul>
	*         <li>listarPeliculaNoVista/li>
	*         </ul>
	*/	
		public static ArrayList<Pelicula> listarPeliculaNoVistas() {
		return daoPeli.listarPeliculaNoVista();
	}
	/**
	* Metodo para eliminar pelicula
	* 
	* @param pelicula
	* 
	*/		
	public static void eliminarPelicula(int pelicula) {
        daoPeli.eliminaPelicula(pelicula);
    }
	/**
	* Metodo para insertar pelicula
	* 
	* @param peli
	* 
	*/	
	public static void insertarPelicula(Pelicula peli) {
		daoPeli.insertaPelicula(peli);
	}
	/**
	* Metodo para actualizar pelicula
	* 
	* @param peli
	* 
	*/
	public static void actualizarPelicula(Pelicula peli) {
        daoPeli.actualizaPelicula(peli);
    }
	/**
	* Metodo para listar pelicula por valoración
	* 
	* @param numero
	* @return
	*         <ul>
	*         <li>listarPeliculaNoVista/li>
	*         </ul>
	*/
	public ArrayList<Pelicula> listarPeliculaPorValoracion(int numero){
        return daoPeli.listarPeliculaPorValoracion(numero);
    }
}
