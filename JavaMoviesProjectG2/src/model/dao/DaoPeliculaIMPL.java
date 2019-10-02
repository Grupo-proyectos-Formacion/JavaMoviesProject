/**
 * @author Julian Bautista 
 * @author Sisa Romero
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Pelicula;
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
	/**
	 * Metodo que inserta Pelïcula 
	 * 
	 * @param peli
	 *
	 */
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
	/**
	 * Metodo que elimina Pelïcula por ID
	 * 
	 * @param peli
	 *
	 */
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
        } catch (SQLException se) {
            //se.printStackTrace();

        }
		System.out.println(listarPelicula());
		
	}

	@Override
	/**
	 * Metodo que busca Pelïcula por ID
	 * 
	 * @param peli
	 * 
	 *@return 
	 *         <ul>
	 *         <li>Pelicula o null en caso de fallo en la query</li>
	 *         </ul>
	 *
	 */
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
	
	/**
	 * Metodo que actualiza Pelïcula
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
	        	
	            Writer.escribirLoggerWarning("La sentencia para insertar usuario ha fallado " + e.getMessage());
	        
	        }
	    }

	/**
	*  Metodo que lista todas las Peliculas y devuelve un ArrayList de Peliculas 
	*  
	*@ejb.create-method
	*
	*@return 
	*         <ul>
	*         <li>pelis</li>
	*         </ul>
	*
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
			//e.printStackTrace();
			}
		return pelis;
	}
	
	/**
	* Metodo que insertar peliculas en la Base de Datos desde una lista
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
	*  Metodo que lista Peliculas por categoria y devuelve un ArrayList de Peliculas 
	*  
	*@ejb.create-method
	*
	*@return 
	*         <ul>
	*         <li>peli</li>
	*         </ul>
	*
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
			Writer.escribirLoggerWarning("La consulta para filtrar por categoria ha fallado" + e.getMessage());
			}
		return peli;
	}

	/**
	*  Metodo que lista Peliculas por valoracion devuelve un ArrayList de Peliculas no vistas
	*  
	*@ejb.create-method
	*
	*@return 
	*         <ul>
	*         <li>pelis</li>
	*         </ul>
	*
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
	        e.printStackTrace();
	        }
	    return pelis;
	}
	

	/**
	*  Metodo que lista Peliculas el cual devuelve un ArrayList de Peliculas no vistas
	*  
	*@ejb.create-method
	*
	*@return 
	*         <ul>
	*         <li>pelis</li>
	*         </ul>
	*
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
	        e.printStackTrace();
	        }
	    return pelis;
	}
	
	

}
