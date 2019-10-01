/**
 * @author Julian Bautista 
 * @author Sisa Romero
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Pelicula;

public class DaoPeliculaIMPL implements DaoPelicula {

	/**
	 * con Conexion Creada por la clase ConexionBD
	 */
	private Connection con = null;

	/**
	 * Constructor vacio           
	 */
    public DaoPeliculaIMPL() {
        con = new ConexionDB().getConn();
    }
    
	@Override
	public void insertaPelicula(Pelicula peli) {
		String sql = "INSERT INTO Pelicula (tituloPelicula, anyoPelicula, categoriaPelicula) VALUES (?, ?, ?)";
		PreparedStatement pstmt;
		
		
		
		try (Statement stmt = con.createStatement()) {
			pstmt = this.con.prepareStatement(sql);
			pstmt.setString(1, peli.getTituloPelicula());
			pstmt.setInt(2, peli.getAnyoPelicula());
			pstmt.setString(3, peli.getCategoriaPelicula());
            if (pstmt.executeUpdate() != 1) {
                throw new SQLException("Error adding Pelicula");
            }
        } catch (SQLException se) {
            se.printStackTrace();
            //MODIFICAR PARA USAR EL LOGIN
        }
		
	}

	@Override
	public void eliminaPelicula(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pelicula buscarID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizaPelicula(Pelicula peli) {
	        
	        String sql = "UPDATE PELICULA SET tituloPelicula=?, anyoPelicula=?, categoriaPelicula=? WHERE idPelicula=?";
	        PreparedStatement pstmt;
	        
	
			try (Statement stmt = con.createStatement()) {
				pstmt = this.con.prepareStatement(sql);
				pstmt.setString(1, peli.getTituloPelicula());
				pstmt.setInt(2, peli.getAnyoPelicula());
				pstmt.setString(3, peli.getCategoriaPelicula());
				pstmt.setInt(4, peli.getIdPelicula());
	            if (pstmt.executeUpdate() != 1) {
	                throw new SQLException("Error adding Pelicula");
	            }
	        } catch (SQLException se) {
	            se.printStackTrace();
	            //MODIFICAR PARA USAR EL LOGIN
	        }
	    }
	
	
	// Metodos privados
		/**
		 * Insertar peliculas a la Base de Datos desde una lista
		 * 
		 *@param listaPelicula
		 *		 lista de  peliculas 
		 */
	@Override
	public void insertaListaPelicula(ArrayList<Pelicula> listaPelicula) {
			
		for(Pelicula n: listaPelicula) {
			
			 insertaPelicula(n);
			
		}				
	}

}
