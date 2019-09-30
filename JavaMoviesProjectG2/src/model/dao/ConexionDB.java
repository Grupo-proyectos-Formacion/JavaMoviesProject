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

		    // Do something with the Connection
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
}
	
	