/**
 * @author Julian Bautista
 */
package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Pelicula;

public class LectorPeliculasDesdeTxt {

	public static ArrayList<Pelicula> LeeArchivo() throws IOException {
		String row;
		ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
		BufferedReader csvReader = new BufferedReader(new FileReader("C:/Users/admin/peliculas_cat.txt"));
		while ((row = csvReader.readLine()) != null) {
		    String[] data = row.split(",");
		    pelis.add(new Pelicula(data[0],Integer.parseInt(data[1]),data[2]));
		}
		csvReader.close();
		return pelis;
	}
}
