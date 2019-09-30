/**
 * @author Julian Bautista Velez
 */
package model.dao;

import model.Usuario;

public interface DaoUsuario {


	public Boolean insertaUsuario(Usuario user);
	public Boolean eliminaUsuario(int id);
	
}
