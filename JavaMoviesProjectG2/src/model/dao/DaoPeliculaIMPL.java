/**
 * @author Julian Bautista
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Pelicula;
import model.Usuario;
import utilities.Writer;

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
		
		System.out.println("selecciona la id para borrar la pelicula");
		System.out.println(listarPelicula());

		Pelicula peli = buscarID(id);
        if (peli == null) {
        	Writer.escribirPantalla("La pelicula se ha borrado");
            //LOGGEAR ERROR
        }
        try (Statement stmt = con.createStatement()) {
            String query = "DELETE FROM pelicula WHERE idPelicula=" + id;
            if (stmt.executeUpdate(query) != 1) {
            	System.out.println("La pelicula con id"+ id+ "ha sido borrada");
            }
        } catch (SQLException se) {
            //se.printStackTrace();

        }
		
		
	}

	@Override
	public Pelicula buscarID(int id) {
		// TODO Auto-generated method stub
		try (Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM pelicula WHERE ID=" + id;
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
            return (new Pelicula(rs.getInt("idPelicula"), rs.getString("nombrePelicula"),
                    rs.getInt("anio"), rs.getString("categoriaPelicula")));
        } catch (SQLException se) {
            
 
        }
		return null;
	}

	@Override
	public void actualizaPelicula(Pelicula peli) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 * @return arrayList de peliculas
	 */
	
	public ArrayList<Pelicula> listarPelicula(){
		
		
		try {
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM pelicula";
	        ResultSet rs = stmt.executeQuery(query);
	        ArrayList<Pelicula> peli = new ArrayList<>();
	        while (rs.next()) {
	            peli.add(new Pelicula(rs.getInt("idPelicula"), rs.getString("tituloPelicula"),
	                    rs.getInt("anyoPelicula"), rs.getString("categoriaPelicula")));
	        }
	        	return peli;
	        
		}catch(Exception e) {
			e.printStackTrace();
			}
		return null;
	}

	public void crearPelicula() {
		// TODO Auto-generated method stub
		
	}
	
	

}
