/**
 * @author Luis
 */

package gui;

import utilities.LecturaDato;
import utilities.Writer;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import model.Categoria;
>>>>>>> branchJulian
=======
import model.Categoria;
>>>>>>> branchJulian
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
<<<<<<< HEAD
<<<<<<< HEAD
				+ "           ** 2. Usuarios                          **\n"
=======
				+ "           ** 2. Usuarios                           **\n"
>>>>>>> branchJulian
=======
				+ "           ** 2. Usuarios                           **\n"
>>>>>>> branchJulian
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
				+ "           ** 4. Mostrar películas por categoria    **\n"
				+ "           ** 5. Mostrar películas mejor valoradas  **\n"
				+ "           ** 6. Mostrar películas más vistas       **\n"
				+ "           ** 7. Mostrar películas no vistas        **\n"
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
		
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> branchJulian
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
				+ "           ** 5. Animación                             **\n"
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
<<<<<<< HEAD
>>>>>>> branchJulian
=======
>>>>>>> branchJulian
	}
	


}


