/**
 * @author Julian Bautista Velez
 */
package model.dao;

import java.util.ArrayList;

import model.Usuario;

public interface DaoUsuario {


	public Boolean insertaUsuario(Usuario user);
	public void eliminaUsuario(int id);
	public Usuario buscarID(int id);
	public void actualizaUsuario(Usuario user);
	public ArrayList<Usuario> listarUsuario() throws Exception;
	
}
