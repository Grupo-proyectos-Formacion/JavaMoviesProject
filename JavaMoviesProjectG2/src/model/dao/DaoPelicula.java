package model.dao;

import model.Pelicula;

public interface DaoPelicula {
	public void insertaPelicula(Pelicula peli);
	public void eliminaPelicula(int id);
	public Pelicula buscarID(int id);
	public void actualizaPelicula(Pelicula peli);
}
