package com.nicode.crud_peliculas.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {  
    private static String url = "jdbc:mysql://localhost:3306/peliculas_db";
    private static String user = "root";
    private static String password = "nicolas";
    private static Connection conexion;

    public static Connection establecerConexion(){
        try{
            conexion = DriverManager.getConnection(url,user,password);                      
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conexion;
    }
}
