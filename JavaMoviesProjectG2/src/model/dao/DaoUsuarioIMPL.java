/**
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

    // package level access
    public DaoUsuarioIMPL() {

        con = new ConexionDB().getConn();
    }
    
	@Override
	public Boolean insertaUsuario(Usuario user) {
		String sql = "INSERT INTO Usuario (nombreUsuario, apellidoUsuario, fechaNacimiento, fechaRegistro) VALUES (?, ?, ?, ?)";
		PreparedStatement pstmt;
		
		
		
		try (Statement stmt = con.createStatement()) {
			pstmt = this.con.prepareStatement(sql);
			pstmt.setString(1, user.getNombreUsuario());
			pstmt.setString(2, user.getApellidoUsuario());
			pstmt.setTimestamp(3, new java.sql.Timestamp(user.getFechaNacimiento().getTime()));
			pstmt.setTimestamp(4, new java.sql.Timestamp(user.getFechaRegistro().getTime()));
            /*String query = "INSERT INTO USUARIO VALUES (" + user.getIdUsuario() + ","
                    + "'" + user.getApellidoUsuario() + "'," + "'" + user.fechaNacimiento + "',"
                    + "'" + new java.sql.Date(user.getFechaNacimiento().getDate()) + "'," + new java.sql.Date(user.getFechaRegistro().getDate()) + ")";*/
            if (pstmt.executeUpdate() != 1) {
                throw new SQLException("Error adding Usuario");
            }
        } catch (SQLException se) {
            se.printStackTrace();
            //MODIFICAR PARA USAR EL LOGIN
        }
		
		return null;
	}

	/**
	@ejb.create-method este metodo borra el usuario dependiendo de su ID en la base de datos
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
	@ejb.create-method este metodo retorna un usuario para ser borrado o modificado dependiendo de su ID
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
	@ejb.create-method Este metodo modifica en base de datos el usuario pasado por parmetro
	*/
	@Override
	public void actualizaUsuario(Usuario user) {
        
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
       } catch (SQLException se) {
           se.printStackTrace();
       }
        
        
        
    }
	
	
	public  Usuario[]  listarUsuario() throws Exception {
		
		Statement stmt = con.createStatement();
		String query = "SELECT * FROM EMPLOYEE";
        ResultSet rs = stmt.executeQuery(query);
        // Create an ArrayList to save resulting records
        ArrayList<Usuario> usu = new ArrayList<>();
        // Iterate through the results and create Employee objects
        while (rs.next()) {
            usu.add(new Usuario(rs.getInt("ID"), rs.getString("Nombre"),
                    rs.getString("Apellido"), rs.getDate("Fecha de nacimiento"),
                    rs.getDate("Fecha de alta")));
        }
        return usu.toArray(new Usuario[0]);
		

	}
	
	

}
