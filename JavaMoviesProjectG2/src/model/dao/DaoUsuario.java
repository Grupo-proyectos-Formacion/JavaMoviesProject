package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoUsuario implements Dao{

	@Override
	public Boolean creaConexion() {
		Boolean exito = false;
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.
                getConnection("jdbc:oracle:thin:@10.90.36.103:3306:movieFlix"
                    ,"user","password");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            exito = true;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		return exito;
		
	}
	
	
}
