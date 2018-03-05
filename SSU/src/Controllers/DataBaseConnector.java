/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;



import java.sql.*;
/**
 *
 * @author Miguel
 */
public class DataBaseConnector {
    
    //VAriables to connecto to server 
    private static final String connection= "jdbc:mysql://localhost:3307/segurosocialuniversitario";
    private static final String password = "";
    private static final String username= "root";
    
    public void connect(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(connection, username,password   );
            System.out.println("Connection executed successfully");
        
        }catch(SQLException ex){
            System.err.println("Failed connection to " + connection + " " + ex.getMessage() );
        }
        
        
    }
    
    
    
    
}
