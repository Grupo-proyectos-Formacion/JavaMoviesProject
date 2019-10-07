/**
 * @author Julian Bautista
 */

package controller;

import gui.Menu;
import model.Categoria;
import model.Pelicula;
import model.Usuario;
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
				int idPelicula = LecturaDato.LeerInt("Dame la id de la pelicula a modificar");
				Pelicula modificar= SuperService.getPelicula(idPelicula);
				Writer.escribirPantalla(modificar.toString());
				int campoModificar = Menu.menuModificarPelicula();
				if(campoModificar == 0) { modificar.setTituloPelicula(LecturaDato.LeerhTexto("Dame el nuevo titulo de la película: "));}
				else if(campoModificar == 1) { modificar.setAnyoPelicula(LecturaDato.LeerInt("Dame el nuevo año de la película: "));}
				else Writer.escribirPantalla("Un listillo eh?");
				SuperService.actualizarPelicula(modificar);
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
				Writer.escribirPantalla("Las 10 películas más vistas son: \n");
				Writer.escribirPantalla(SuperService.listarPeliculaMasVistas(10).toString());
				break;
			case 7:
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
			int idUsuario = LecturaDato.LeerInt("Dame la id del usuario a modificar");
			Usuario modificar= SuperService.getUsuario(idUsuario);
			Writer.escribirPantalla(modificar.toString());
			int campoModificar = Menu.menuModificarUsuario();
			if(campoModificar == 0) { modificar.setNombreUsuario(LecturaDato.LeerhTexto("Dame el nuevo nombre del ususaurio: "));}
			else if(campoModificar == 1) { modificar.setApellidoUsuario(LecturaDato.LeerhTexto("Dame los nuevos apellidos del ususaurio: "));}
			else if(campoModificar == 2) { modificar.setFechaNacimiento(LecturaDato.LeerFecha("Dame la nueva fecha de nacimiento del ususaurio: "));}
			else if(campoModificar == 3) { modificar.setFechaRegistro(LecturaDato.LeerFecha("Dame la nueva fecha de registro del usuario: "));}
			else Writer.escribirPantalla("Un listillo eh?");
			SuperService.actualizarUsuario(modificar);
			break;
		case 3:
			SuperService.eliminarUsuario(LecturaDato.LeerInt("Introduce el id del usuario a eliminar"));
			break;
		default:
			break;
		}
		
	}
	


}
