/**
 * @author Luis
 */

package gui;

import utilities.LecturaDato;
import utilities.Writer;

public class Menu {
	
	public static int menuInicial() {
		
		Writer.escribirPantalla("           **********************");
		Writer.escribirPantalla("           ***** MOVIE-FLIX *****");
		Writer.escribirPantalla("           **********************");
		Writer.escribirPantalla("\n");
		Writer.escribirPantalla("***** Elige una de las siguientes opciones: *****");
		Writer.escribirPantalla("***** 1. Crear usuario \n ***** 2. Modificar usuario **** \n");
		Writer.escribirPantalla("*");
		Writer.escribirPantalla("***** 3.Eliminar usuario");
		Writer.escribirPantalla("*****");
		LecturaDato.LeerInt("Elige una de las siguientes opciones\n"
				+ "1--");
		
		return 0;//Modificar
	}

}


