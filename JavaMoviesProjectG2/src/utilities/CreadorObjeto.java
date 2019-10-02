/**
 * @author Luis
 */

package utilities;

import java.util.Date;

import model.Pelicula;
import model.Usuario;

public class CreadorObjeto {
	
	/**
	 * M�todo creador de objetos Usuario
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
	 * M�todo creador de objetos Pel�cula
	 * @return Devuelve objeto tipo Pel�cula
	 */
	public static Pelicula creaPelicula() {
		
		String titulo = LecturaDato.LeerhTexto("           ** Introduce t�tulo de la pel�cula:             **\n");
		int anyo = LecturaDato.LeerInt("           ** Introduce a�o de la pel�cula:                **\n");
		String categoria = LecturaDato.LeerhTexto("           ** Introduce categor�a de pel�cula:             **\n");
		
		return new Pelicula(titulo, anyo, categoria);
	}

}