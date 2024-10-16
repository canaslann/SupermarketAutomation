package helper;

import java.sql.*;

public class dbHelper {
    private String dbUsername = "root";
    private String dbPassword = "123eeecan";
    private String dbUrl = "jdbc:mysql://localhost:3306/supermarket";
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public void showErrorMessage(SQLException e){
        e.printStackTrace();
    }
}
