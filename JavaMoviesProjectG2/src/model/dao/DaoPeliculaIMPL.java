/**
 * @author Julian Bautista 
 * @author Sisa Romero
 * @author Luis 
 * @author Daniel
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
        } catch (SQLException e) {
        	Writer.escribirLoggerWarning("La consulta para insertar pel�cula ha fallado " + e.getMessage());
        }
		
	}

	@Override
	public void eliminaPelicula(int id) {
		// TODO Auto-generated method stub
		

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
        } catch (SQLException e) {
        	Writer.escribirLoggerWarning("La consulta para eliminar pel�cula ha fallado " + e.getMessage());

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
        } catch (SQLException e) {
        	Writer.escribirLoggerWarning("La consulta para buscar pel�cula por id ha fallado " + e.getMessage());
 
        }
		return null;
	}
	
	/**
	 * M�todo que actualiza Pel�cula
	 * 
	 * @param peli
	 * 		  objeto pelicula
	 * 
	 */
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
	                throw new SQLException("Error actualizando Pelicula");
	            }
	        } catch (SQLException e) {
	        	
	            Writer.escribirLoggerWarning("La sentencia para actualizar pel�cula ha fallado " + e.getMessage());
	        
	        }
	    }

	/**
	 * listar todas las peliculas
	 * 
	 * @return arrayList de peliculas
	 */
	
	public ArrayList<Pelicula> listarPelicula(){
		
		ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
		try {
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM PELICULA";
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            pelis.add(new Pelicula(rs.getInt("idPelicula"), rs.getString("tituloPelicula"),
	                    rs.getInt("anyoPelicula"), rs.getString("categoriaPelicula"), rs.getInt("valoracionPelicula"), rs.getInt("visualizacionPelicula")));
	        }
	        	return pelis;
		}catch(Exception e) {
			Writer.escribirLoggerWarning("La consulta para listar todas las peliculas ha fallado: " + e.getMessage());
			}
		return pelis;
	}
	
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
	/**
	 * 
	 * @return arrayList de peliculas
	 */	
	public ArrayList<Pelicula> listarPeliculaCategoria(String categoria){
		ArrayList<Pelicula> peli = new ArrayList<>();
		try {
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM pelicula WHERE categoriaPelicula='"+categoria+"'";
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            peli.add(new Pelicula(rs.getInt("idPelicula"), rs.getString("tituloPelicula"),
	                    rs.getInt("anyoPelicula"), rs.getString("categoriaPelicula")));
	        }
	        	return peli;
	        
		}catch(Exception e) {
			Writer.escribirLoggerWarning("La consulta para filtrar pel�culas por categoria ha fallado" + e.getMessage());
			}
		return peli;
	}
	/**
	 * @return Devuelve arraylist de pel�culas ordenadas por valoraci�n
	 */
	@Override
	public ArrayList<Pelicula> listarPeliculaPorValoracion(int n){
	    
	    ArrayList<Pelicula> pelis = new ArrayList<>();
	    try {
	        Statement stmt = con.createStatement();
	        String query = "SELECT * FROM pelicula ORDER BY valoracionPelicula DESC LIMIT "+ n;
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            pelis.add(new Pelicula(rs.getInt("idPelicula"), rs.getString("tituloPelicula"),
	                    rs.getInt("anyoPelicula"), rs.getString("categoriaPelicula"), rs.getInt("valoracionPelicula")));
	        }
	            return pelis;
	        
	    }catch(Exception e) {
	    	Writer.escribirLoggerWarning("La consulta para listar pel�culas por valoraci�n ha fallado " + e.getMessage());
	        }
	    return pelis;
	}
	
	/**
	 * @return Devuelve arraylist de pel�culas no vistas
	 */
	@Override
	public ArrayList<Pelicula> listarPeliculaNoVista(){
	    
	    ArrayList<Pelicula> pelis = new ArrayList<>();
	    try {
	        Statement stmt = con.createStatement();
	        String query = "SELECT * FROM pelicula WHERE visualizacionPelicula = 0";
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            pelis.add(new Pelicula(rs.getInt("idPelicula"), rs.getString("tituloPelicula"),
	                    rs.getInt("anyoPelicula"), rs.getString("categoriaPelicula"), rs.getInt("valoracionPelicula")));
	        }
	            return pelis;
	        
	    }catch(Exception e) {
	    	Writer.escribirLoggerWarning("La consulta para listar pel�culas no vistas ha fallado " + e.getMessage());
	        }
	    return pelis;
	}
	
	public  Pelicula getPelicula(int id) {
		
		Statement stmt;
		Pelicula peli = new Pelicula();
		try {
			stmt = con.createStatement();
			String query = "SELECT * FROM PELICULA WHERE IDPELICULA = "+ id +";" ;
			ResultSet rs = stmt.executeQuery(query);
			
	        if(!rs.next()) {
	        	throw new SQLException("no ha devuelto valores");
	        }
	        
	        peli = new Pelicula(rs.getInt("idPelicula"), rs.getString("tituloPelicula"),
                    rs.getInt("anyoPelicula"), rs.getString("categoriaPelicula"), rs.getInt("valoracionPelicula"), rs.getInt("visualizacionPelicula"));
	        
		} catch (SQLException e) {
			Writer.escribirLoggerWarning("La consulta para regresar una pel�cula especifica ha fallado: " + e.getMessage());
	
		}
		
        return peli;
	}
	
	@Override
	public ArrayList<Pelicula> listarPeliculaMasVista(int n){
	    
	    ArrayList<Pelicula> pelis = new ArrayList<>();
	    try {
	        Statement stmt = con.createStatement();
	        String query = "SELECT * FROM pelicula ORDER BY visualizacionPelicula DESC LIMIT "+ n;
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            pelis.add(new Pelicula(rs.getInt("idPelicula"), rs.getString("tituloPelicula"),
	                    rs.getInt("anyoPelicula"), rs.getString("categoriaPelicula"), rs.getInt("valoracionPelicula"), rs.getInt("visualizacionPelicula")));
	        }
	            return pelis;
	        
	    }catch(Exception e) {
	    	Writer.escribirLoggerWarning("La consulta para listar pel�culas por numero de visualizaciones " + e.getMessage());
	        }
	    return pelis;
	}
	
	

}
