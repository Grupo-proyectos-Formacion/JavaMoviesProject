/**
 * @author Luis
 */

package gui;

import utilities.LecturaDato;
import utilities.Writer;

public class Menu {
	
	/**
	 * 
	 * @return Devuelve un int que representa la opci�n elegida por el usuario (usuario o pel�culas)
	 */
	public static int menuInicial() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           ** ELIGE UNA DE LAS SIGUIENTES OPCIONES: **\n"
				+ "           ** 1. Usuarios                           **\n"
				+ "           ** 2. Peliculas                          **\n"
				+ "           *******************************************");
		
		return LecturaDato.LeerInt();
	}
	
	/**
	 * 
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
	 * 
	 * @return Devuelve un int que representa la opcion elegida sobre "pel�culas"
	 */
	public static int menuPelicula() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				+ "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           ** ELIGE UNA DE LAS SIGUIENTES OPCIONES: **\n"
				+ "           ** 0. Salir                              **\n"
				+ "           ** 1. Insertar pel�cula                  **\n"
				+ "           ** 2. Modificar pel�cula                 **\n"
				+ "           ** 3. Eliminar pel�cula                  **\n"
				+ "           ** 4. Mostrar pel�culas                  **\n"
				+ "           *******************************************");
		
		return LecturaDato.LeerInt();
	}
	
	

}


