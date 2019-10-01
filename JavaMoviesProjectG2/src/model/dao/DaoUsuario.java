/**
 * @author Julian Bautista Velez
 */
package model.dao;

import model.Usuario;

public interface DaoUsuario {


	public void insertaUsuario(Usuario user);
	public void eliminaUsuario(int id);
	public Usuario buscarID(int id);
	public void actualizaUsuario(Usuario user);
	
}
