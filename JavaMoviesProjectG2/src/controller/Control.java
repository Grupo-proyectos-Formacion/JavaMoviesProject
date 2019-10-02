/**
 * @author Luis
 */

package controller;

import gui.Menu;
import service.SuperService;
import utilities.LecturaDato;
import utilities.Writer;


public class Control {
	
	public static void controlStart() {
		int eleccion = 0;
		do {
			eleccion = Menu.menuInicial();
			if(eleccion == 1) {
				int accionPelicula = Menu.menuPelicula();
				if(accionPelicula == 1) { SuperService.insertarPelicula(Menu.menuCrearPelicula()); }
				
				else if (accionPelicula == 3) {
					Writer.escribirPantalla(SuperService.listarPelicula().toString());
					SuperService.eliminarPelicula(LecturaDato.LeerInt("Introduce el id de la pelicula a eliminar"));
					} 
				else if (accionPelicula == 3) {
					Writer.escribirPantalla(SuperService.listarPelicula().toString());
					SuperService.eliminarPelicula(LecturaDato.LeerInt("Introduce el id de la pelicula a eliminar"));
					}
			} else if(eleccion == 4) {
				Writer.escribirPantalla(SuperService.listarPelicula().toString());
			}
		}while(eleccion>0 && eleccion <3);
	}


}
