package model.dao;

/**
 * Interface DaoPelicula
 *
 * Contiene coleccion de metodos abstractos
 *
 * @author 
 * 
 */

import java.util.ArrayList;

import model.Pelicula;

public interface DaoPelicula {
	/**
	* Metodo para insertar pelicula
	* 
	* @param peli
	* 
	*/	
	public void insertaPelicula(Pelicula peli);
	/**
	* Metodo para eliminar pelicula
	* 
	* @param id
	* 
	*/
	public void eliminaPelicula(int id);
	/**
	* Metodo para buscar id
	* 
	* @param id
	* 
	*/
	public Pelicula buscarID(int id);
	/**
	* Metodo para actualizar pelicula
	* Devuelve un objeto tipo pelicula
	* @param peli
	* 
	*/
	public void actualizaPelicula(Pelicula peli);
	/**
	* Metodo para insertar una lista de peliculas
	* 
	* @param listaPelicula
	* 
	*/
	public void insertaListaPelicula(ArrayList<Pelicula> listaPelicula);
	/**
	* Metodo para listar Peliculas No Vistas
	* Devuelve una lista de peliculas de tipo ArrayList
	*/
	public ArrayList<Pelicula> listarPeliculaNoVista();
	/**
	* Metodo para listar peliculas por valoracion
	* Devuelve una lista de peliculas de tipo ArrayList
	* 
	* @param n
	* 
	*/
	public ArrayList<Pelicula> listarPeliculaPorValoracion(int n);
}
