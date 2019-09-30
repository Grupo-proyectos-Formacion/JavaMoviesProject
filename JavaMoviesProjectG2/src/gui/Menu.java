/**
 * @author Luis
 */

package gui;

import utilities.LecturaDato;
import utilities.Writer;

public class Menu {
	
	/**
	 * 
	 * @return Devuelve un int que representa la opción elegida por el usuario
	 */
	public static int menuInicial() {
		
		Writer.escribirPantalla("          **********************");
		Writer.escribirPantalla("          ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("          **********************"
				+ "\n");

		Writer.escribirPantalla("*******************************************\n"
				+ "           ** ELIGE UNA DE LAS SIGUIENTES OPCIONES: **\n"
				+ "           ** 1. Crear usuario                      **\n"
				+ "           ** 2. Modificar usuario                  **\n"
				+ "           ** 3. Eliminar usuario                   **\n"
				+ "           ** 4. Mostrar usuarios                   **\n"
				+ "           *******************************************");
		
		return  LecturaDato.LeerInt();
	}

}


