/**
 * @author Luis
 */

package gui;

import utilities.LecturaDato;
import utilities.Writer;
import model.Categoria;
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
				+ "           ** 1. Peliculas                          **\n"
				+ "           ** 2. Usuarios                           **\n"
				+ "           ** otro. Salir                           **\n" 
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
				+ "           ** 4. Mostrar pel�culas por categoria    **\n"
				+ "           ** 5. Mostrar pel�culas mejor valoradas  **\n"
				+ "           ** 6. Mostrar pel�culas m�s vistas       **\n"
				+ "           ** 7. Mostrar pel�culas no vistas        **\n"
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
	
	public static Categoria menuCategoria() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");

		Writer.escribirPantalla("**********************************************\n"
				+ "           ** ELIGE UNA DE LAS SIGUIENTES CATEGORIAS:  **\n"
				+ "           ** 0. Terror                                **\n"
				+ "           ** 1. Comedia                               **\n"
				+ "           ** 2. Romantica                             **\n"
				+ "           ** 3. Thriller                              **\n"
				+ "           ** 3. Aventura						      **\n"
				+ "           ** 4. Policiaca						      **\n"
				+ "           ** 5. Animaci�n                             **\n"
				+ "           **********************************************");
		
		int categoriaElegida=  LecturaDato.LeerInt();
		Categoria categoriaTraducida;
		switch (categoriaElegida) {
		case 0:
			categoriaTraducida= Categoria.TERROR;
			break;
		case 1:
			categoriaTraducida= Categoria.COMEDIA;
			break;
		case 2:
			categoriaTraducida= Categoria.ROMANTICA;
			break;
		case 3:
			categoriaTraducida= Categoria.AVENTURA;
			break;
		case 4:
			categoriaTraducida= Categoria.POLICIACA;
			break;
		case 5:
			categoriaTraducida= Categoria.ANIMACION;
			break;
		default:
			categoriaTraducida= Categoria.TODAS;
			break;
		}
		
		return categoriaTraducida;
	}
	
	public static int menuModificarUsuario() {
		int eleccion = LecturaDato.LeerInt("**********************************************\n"
				+ "           ** ELIGE EL CAMPO A MODIFICAR:              **\n"
				+ "           ** 0. Nombre                                **\n"
				+ "           ** 1. Apellidos                             **\n"
				+ "           ** 2. Fecha de nacimiento                   **\n"
				+ "           ** 3. Fecha de registro                     **\n"
				+ "           **********************************************");
		return eleccion;
	}
	


}


