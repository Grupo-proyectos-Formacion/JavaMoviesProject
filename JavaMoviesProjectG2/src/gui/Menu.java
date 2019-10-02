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
	 * M�todo para mostrar men� inicial
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
	 * M�todo para mostrar opciones sobre usuario
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
	 * M�todo para llamar al metodo crear usuario
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
	 * M�todo para mostrar opciones sobre pel�cula
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
				+ "           ** 4. Mostrar todas las pel�culas        **\n"
				+ "           ** 5. Mostrar pel�culas por categor�a    **\n"
				+ "           ** 6. Ordenar por m�s vistas             **\n"
				+ "           ** 7. Ordenar por m�s valoradas          **\n"
				+ "           ** 8. Pel�culas no vistas                **\n"				
				+ "           *******************************************");
		
		return LecturaDato.LeerInt();
	}
	
	
	/**
	 * M�todo para llamar al m�todo crear pel�cula
	 * @return Devuelve un objeto pel�cula
	 */
	public static Pelicula menuCrearPelicula() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");
		
		 return CreadorObjeto.creaPelicula();
	}
	
	
	/**
	 * M�todo indicador de tarea realizada
	 */
	public static void menuTareaCompletada() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				+ "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           **           �TAREA COMPLETADA!          **\n"
				+ "           *******************************************");
		
	}
	


}


