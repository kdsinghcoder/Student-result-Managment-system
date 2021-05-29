package Project;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
    public static Connection getCon(){
    	
        String dbName="project1";
        String userName="root";
        String password="";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }

}
