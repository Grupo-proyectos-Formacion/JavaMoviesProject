/**
 * @author Julián Bautista Vélez
 */

package model.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import utilities.Writer;

import java.sql.ResultSet;

public class ConexionDB {
	private Connection conn = null;
	public ConexionDB(){
		super();
		try {
		    this.conn =
		       DriverManager.getConnection("jdbc:mysql://10.90.36.103:3306/movieflix?" +
		                                   "user=root&password=123456789&serverTimezone=UTC");

<<<<<<< HEAD
<<<<<<< HEAD
		    
=======
>>>>>>> branchJulian
=======
>>>>>>> branchJulian
		} catch (SQLException ex) {
		   Writer.escribirLoggerWarning("SQLException: " + ex.getMessage());
		   Writer.escribirLoggerWarning("SQLState: " + ex.getSQLState());
		   Writer.escribirLoggerWarning("VendorError: " + ex.getErrorCode());
		}
	}
	public Connection getConn() {
		return conn;
	}
	public void close() {
        try {
            this.conn.close();
        } catch (SQLException se) {
        	Writer.escribirLoggerFine("Exception closing Connection: " + se);
        }
    }
	
}
	
	