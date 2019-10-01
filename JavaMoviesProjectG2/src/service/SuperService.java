/**
 * @author Daniel
 * @author Sisa Romero
 */
package service;

import model.Usuario;
import model.dao.DaoPeliculaIMPL;
import model.dao.DaoUsuarioIMPL;

public class SuperService {
	
	static DaoUsuarioIMPL daoUsu = new DaoUsuarioIMPL();
	static DaoPeliculaIMPL daoPeli = new DaoPeliculaIMPL();
	
	public static void actualizarUsuario(Usuario usu) {
		daoUsu.actualizaUsuario(usu);
	}
	
	public static void borrarUsuario(Usuario usu) {
		daoUsu.eliminaUsuario(usu.getIdUsuario());
	}
	
	public static void eliminarPelicula(int Pelicula) {
        
        daoPeli.eliminaPelicula(Pelicula);
    }

}
