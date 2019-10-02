/**
 * 
 * Clase DaoUsuario el cual lleva implementado la interfaz DaoUsuario
 * 
 * @author Julian Bautista
 * @author Daniel
 * @author Sisa Romero
 */


package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import model.dao.ConexionDB;
import utilities.Writer;
import model.Usuario;

public class DaoUsuarioIMPL implements DaoUsuario {

	private Connection con = null;

    // Metodo para abrir la conexion a la base de datos
    public DaoUsuarioIMPL() {

        con = new ConexionDB().getConn();
    }
    
	@Override
	/**
	* Metodo para insertar Usuario
	* 
	* @ejb.create-method
	* 
	* @param user
	* 
	*/
	public void insertaUsuario(Usuario user) {
		String sql = "INSERT INTO Usuario (nombreUsuario, apellidoUsuario, fechaNacimiento, fechaRegistro) VALUES (?, ?, ?, ?)";
		PreparedStatement pstmt;
		
		
		
		try (Statement stmt = con.createStatement()) {
			pstmt = this.con.prepareStatement(sql);
			pstmt.setString(1, user.getNombreUsuario());
			pstmt.setString(2, user.getApellidoUsuario());
			pstmt.setTimestamp(3, new java.sql.Timestamp(user.getFechaNacimiento().getTime()));
			pstmt.setTimestamp(4, new java.sql.Timestamp(user.getFechaRegistro().getTime()));
            if (pstmt.executeUpdate() != 1) {
                throw new SQLException("Error adding Usuario");
            }
        } catch (SQLException e) {
        	Writer.escribirLoggerWarning("La consulta para insertar usuario ha fallado " + e.getMessage());
            //MODIFICAR PARA USAR EL LOGIN
        }
	}

	/**
	* Metodo el cual borra  el usuario dependiendo de su ID en la base de datos
	*
	*@ejb.create-method 
	*
	*@param id
	*/
	@Override
	public void eliminaUsuario(int id) {
		
		Usuario usu = buscarID(id);
        if (usu == null) {
        	Writer.escribirPantalla("El usuario no existe");
            //LOGGEAR ERROR
        }
        try (Statement stmt = con.createStatement()) {
            String query = "DELETE FROM usuario WHERE idUsuario=" + id;
            if (stmt.executeUpdate(query) != 1) {

            }
        } catch (SQLException se) {
            //se.printStackTrace();

        }

	}
	/**
	* 
	* Metodo que retorna un usuario para ser borrado o modificado dependiendo de su ID
	* 
	*@ejb.create-method 
	*
	*@param id
	*
	*@return  <ul>
	*         <li>Usuario</li>
	*         </ul>
	*
	*/
	@Override
	public Usuario buscarID(int id) {
        try (Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM USUARIO WHERE ID=" + id;
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
            return (new Usuario(rs.getInt("ID"), rs.getString("NOMBRE"),
                    rs.getString("APELLIDO"), rs.getDate("FECHA DE NACIMIENTO"),
                    rs.getDate("FECHA DE REGISTRO")));
        } catch (SQLException se) {
            //se.printStackTrace();
        	//LOGEAR SQL EXCEPTION
 
        }
		return null;
    }
	/**
	* Metodo que modifica en base de datos el usuario pasado por parametro
	*
	*@ejb.create-method
	* 
	*@param user
	*
	*/
	@Override
	public void actualizaUsuario(Usuario user) {
		/**
		 * Sentencia sql para actualizar Usuarios en la base de datos
		 */      
        String sql = "UPDATE USUARIO SET nombreUsuario=?, apellidoUsuario=?, fechaNacimiento=?, fechaRegistro=? WHERE idUsuario=?";
        PreparedStatement pstmt;
                
        try (Statement stmt = con.createStatement()) {
            pstmt = this.con.prepareStatement(sql);
            pstmt.setString(1, user.getNombreUsuario());
            pstmt.setString(2, user.getApellidoUsuario());
            pstmt.setTimestamp(3, new java.sql.Timestamp(user.getFechaNacimiento().getTime()));
            pstmt.setTimestamp(4, new java.sql.Timestamp(user.getFechaRegistro().getTime()));
            pstmt.setInt(5, user.getIdUsuario());
           if (pstmt.executeUpdate() != 1) {
               throw new SQLException("Error actualizando Usuario");
           }
       } catch (SQLException e) {
    	   Writer.escribirLoggerWarning("La consulta para actualizar usuario ha fallado "+ e.getMessage());
       }
        
        
     }
	/**
	*  Metodo que lista Usuarios el cual devuelve un ArrayList de Usuarios
	*  
	*@ejb.create-method
	*
	*@return 
	*         <ul>
	*         <li>Usu</li>
	*         </ul>
	*
	*/
	public  ArrayList<Usuario>  listarUsuario() {
		
		Statement stmt;
		
		ArrayList<Usuario> usu = new ArrayList<>();
		try {
			stmt = con.createStatement();
			String query = "SELECT * FROM ERROR";
			ResultSet rs = stmt.executeQuery(query);
	        if(!rs.next()) {
	        	throw new SQLException("no ha devuelto valores");
	        }
	        while (rs.next()) {
	            usu.add(new Usuario(rs.getInt("idUsuario"), rs.getString("nombreUsuario"),
	                    rs.getString("apellidoUsuario"), rs.getDate("fechaNacimiento"),
	                    rs.getDate("fechaRegistro")));
	        }
		} catch (SQLException e) {
			Writer.escribirLoggerWarning("La consulta para listar todos los usarios ha fallado " + e.getMessage());
			//e.printStackTrace();
		}
		
        return usu;
		

	}
	
}
