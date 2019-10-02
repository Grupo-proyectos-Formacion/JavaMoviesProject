/**
 * @author Luis
 */

package controller;

import gui.Menu;
import model.Categoria;
import service.SuperService;
import utilities.LecturaDato;
import utilities.Writer;


public class Control {
	
	public static void controlStart() {
		int eleccion = 0;
		do {
			eleccion = Menu.menuInicial();
			controlMenuInicial(eleccion);
			
		}while(eleccion>0 && eleccion <3);
	}
	public static void controlMenuInicial(int eleccion) {
		switch(eleccion) {
		case 1:
			Writer.escribirPantalla(SuperService.listarPelicula().toString());
			int accionPelicula = Menu.menuPelicula();
			controlMenuPelicula(accionPelicula);
		break;
		case 2:
			Writer.escribirPantalla(SuperService.listarUsuario().toString());
			int accionUsuario = Menu.menuUsuario();
			controlMenuUsuario(accionUsuario);
		break;
		default:
			break;
		}
		
	}
	
	
	public static void controlMenuPelicula(int eleccion) {
			switch (eleccion) {
			case 1:
				SuperService.insertarPelicula(Menu.menuCrearPelicula());
				break;
			case 2:
				
				break;
			case 3:
				SuperService.eliminarPelicula(LecturaDato.LeerInt("Introduce el id de la pelicula a eliminar"));
				break;
			case 4:
				Categoria categoria = Menu.menuCategoria();
				Writer.escribirPantalla(SuperService.listarPeliculaCategoria(categoria.name()).toString());
				break;
			case 5:
				Writer.escribirPantalla("Las 5 peliculas mejor valoradas son: \n");
				Writer.escribirPantalla(SuperService.listarPeliculaPorValoracion(5).toString());
				break;
			case 6:
				Writer.escribirPantalla("Las peliculas que nunca han sido visualizadas son: \n");
				Writer.escribirPantalla(SuperService.listarPeliculaNoVistas().toString());
				break;

			default:
				break;
			}
	}
	
	public static void controlMenuUsuario(int eleccion) {
		switch (eleccion) {
		case 1:
			SuperService.insertarUsuario(Menu.menuCrearUsuario());
			break;
		case 2:
			
			break;
		case 3:
			SuperService.eliminarUsuario(LecturaDato.LeerInt("Introduce el id del usuario a eliminar"));
			break;
		default:
			break;
		}
}


}
