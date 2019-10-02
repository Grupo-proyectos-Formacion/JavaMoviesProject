
/**
 * Interface DaoUsuario
 *
 * Contiene coleccion de metodos abstractos
 *
 * @author  Julian Bautista Velez
 * 
 */
package model.dao;

import java.util.ArrayList;

import model.Usuario;

public interface DaoUsuario {
	/**
	* Metodo para insertar Usuario
	* 
	* @param user
	* 
	*/
	public void insertaUsuario(Usuario user);
	/**
	* Metodo para eliminar usuario
	* 
	* @param id
	* 
	*/
	public void eliminaUsuario(int id);
	/**
	* Metodo para buscar un usuario por ID
	* Devuelve un objeto tipo usuario
	* @param id
	* 
	*/
	public Usuario buscarID(int id);
	/**
	* Metodo para actualizar usuario
	* @param user
	* 
	*/
	public void actualizaUsuario(Usuario user);
	/**
	* Metodo para listar Usuarios
	* Devuelve una lista de Usuarios de tipo ArrayList
	*/
	public ArrayList<Usuario> listarUsuario() throws Exception;
	
}
