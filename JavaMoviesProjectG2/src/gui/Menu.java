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
	 * Mï¿½todo para mostrar menï¿½ inicial
	 * @return Devuelve un int que representa la opciï¿½n elegida por el usuario (usuario o pelï¿½culas)
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
	 * Mï¿½todo para mostrar opciones sobre usuario
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
	 * Mï¿½todo para llamar al metodo crear usuario
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
	 * Mï¿½todo para mostrar opciones sobre pelï¿½cula
	 * @return Devuelve un int que representa la opcion elegida sobre "pelï¿½culas"
	 */
	public static int menuPelicula() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           ** ELIGE UNA DE LAS SIGUIENTES OPCIONES: **\n"
				+ "           ** 0. Salir                              **\n"
				+ "           ** 1. Insertar pelï¿½cula                  **\n"
				+ "           ** 2. Modificar pelï¿½cula                 **\n"
				+ "           ** 3. Eliminar pelï¿½cula                  **\n"
				+ "           ** 4. Mostrar pelï¿½culas por categoria    **\n"
				+ "           ** 5. Mostrar pelï¿½culas mejor valoradas  **\n"
				+ "           ** 6. Mostrar pelï¿½culas mï¿½s vistas       **\n"
				+ "           ** 7. Mostrar pelï¿½culas no vistas        **\n"
				+ "           *******************************************");
		
		return LecturaDato.LeerInt();
	}
	
	
	/**
	 * Mï¿½todo para llamar al mï¿½todo crear pelï¿½cula
	 * @return Devuelve un objeto pelï¿½cula
	 */
	public static Pelicula menuCrearPelicula() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				                + "\n");
		
		 return CreadorObjeto.creaPelicula();
	}
	
	
	/**
	 * Mï¿½todo indicador de tarea realizada
	 */
	public static void menuTareaCompletada() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				+ "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           **           ï¿½TAREA COMPLETADA!          **\n"
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
				+ "           ** 5. Animaciï¿½n                             **\n"
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
	
	public static int menuModificarPelicula() {
		int eleccion = LecturaDato.LeerInt("**********************************************\n"
				+ "           ** ELIGE EL CAMPO A MODIFICAR:              **\n"
				+ "           ** 0. Título                                **\n"
				+ "           ** 1. Año		                              **\n"
				+ "           **********************************************");
		return eleccion;
	}
	


}


