/**
 * @author Luis
 */

package gui;

import utilities.LecturaDato;
import utilities.Writer;
import model.Pelicula;
import model.Usuario;
import utilities.CreadorObjeto;

public class Menu {
	
	/**
	 * Método para mostrar menú inicial
	 * @return Devuelve un int que representa la opción elegida por el usuario (usuario o películas)
	 */
	public static int menuInicial() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           ** ELIGE UNA DE LAS SIGUIENTES OPCIONES: **\n"
				+ "           ** 1. Peliculas                          **\n"
				+ "           ** 2. Usuarios                          **\n"
				+ "           ** otro. Salir                           **\n" 
				+ "           *******************************************");
		
		return LecturaDato.LeerInt();
	}

	
	/**
	 * Método para mostrar opciones sobre usuario
	 * @return Devuelve un int que representa la opcion elegida sobre "usuarios"
	 */
	public static int menuUsuario() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				+ "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           ** ELIGE UNA DE LAS SIGUIENTES OPCIONES: **\n"
				+ "           ** 0. Salir                              **\n"
				+ "           ** 1. Crear usuario                      **\n"
				+ "           ** 2. Modificar usuario                  **\n"
				+ "           ** 3. Eliminar usuario                   **\n"
				+ "           ** 4. Mostrar usuarios                   **\n"
				+ "           *******************************************");
		
		return LecturaDato.LeerInt();
	}
	
	/**
	 * Método para llamar al metodo crear usuario
	 * @return Devuelve un objeto usuario
	 */
	public static Usuario menuCrearUsuario() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");
		
		 return CreadorObjeto.creaUsuario();
	}
	
	

	/**
	 * Método para mostrar opciones sobre película
	 * @return Devuelve un int que representa la opcion elegida sobre "películas"
	 */
	public static int menuPelicula() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           ** ELIGE UNA DE LAS SIGUIENTES OPCIONES: **\n"
				+ "           ** 0. Salir                              **\n"
				+ "           ** 1. Insertar película                  **\n"
				+ "           ** 2. Modificar película                 **\n"
				+ "           ** 3. Eliminar película                  **\n"
				+ "           ** 4. Mostrar películas                  **\n"
				+ "           *******************************************");
		
		return LecturaDato.LeerInt();
	}
	
	
	/**
	 * Método para llamar al método crear película
	 * @return Devuelve un objeto película
	 */
	public static Pelicula menuCrearPelicula() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");
		
		 return CreadorObjeto.creaPelicula();
	}
	
	
	/**
	 * Método indicador de tarea realizada
	 */
	public static void menuTareaCompletada() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				+ "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           **           ¡TAREA COMPLETADA!          **\n"
				+ "           *******************************************");
		
	}
	


}


