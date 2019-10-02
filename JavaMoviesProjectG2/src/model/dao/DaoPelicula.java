package model.dao;

import java.util.ArrayList;

import model.Pelicula;

public interface DaoPelicula {
	public void insertaPelicula(Pelicula peli);
	public void eliminaPelicula(int id);
	public Pelicula buscarID(int id);
	public void actualizaPelicula(Pelicula peli);
	public void insertaListaPelicula(ArrayList<Pelicula> listaPelicula);
	public ArrayList<Pelicula> listarPeliculaNoVista();
	public ArrayList<Pelicula> listarPeliculaPorValoracion(int n);
}
