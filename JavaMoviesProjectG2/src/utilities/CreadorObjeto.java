/**
 * @author Luis
 */

package utilities;

import java.util.Date;

import model.Pelicula;
import model.Usuario;

public class CreadorObjeto {
	
	/**
	 * Método creador de objetos Usuario
	 * @return Devuelve objeto tipo Usuario
	 */
	public static Usuario creaUsuario() {
		
		String nombre = LecturaDato.LeerhTexto("           ** Introduce un nombre de usuario:              **\n");
		String apellido = LecturaDato.LeerhTexto("           ** Introduce el apellido:                       **\n");
		Date fechaNacimiento = LecturaDato.LeerFecha("           ** Fecha de nacimiento, con formato dd-MM-yyyy: **\n");
		Date fechaRegistro = LecturaDato.LeerFecha("           ** Fecha de registro, con formato dd-MM-yyyy:   **\n");
		
		return new Usuario(nombre, apellido, fechaNacimiento, fechaRegistro);
	}
	
	/**
	 * Método creador de objetos Película
	 * @return Devuelve objeto tipo Película
	 */
	public static Pelicula creaPelicula() {
		
		String titulo = LecturaDato.LeerhTexto("           ** Introduce título de la película:             **\n");
		int anyo = LecturaDato.LeerInt("           ** Introduce año de la película:                **\n");
		String categoria = LecturaDato.LeerhTexto("           ** Introduce categoría de película:             **\n");
		
		return new Pelicula(titulo, anyo, categoria);
	}

}