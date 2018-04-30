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
    protected static final String connection= "jdbc:mysql://localhost:3307/segurosocialuniversitario";   
    protected static final String password ="ERINnb2uaUZxvlwh";//ERINnb2uaUZxvlwh
    protected static final String username= "admin";
//    
//    protected static final String connection= "jdbc:mysql://192.168.50.100:3306/mfrade13";
//    protected static final String username= "mfrade13";
//    protected static final String password ="Metallic@12";//ERINnb2uaUZxvlwh
//    
    
    
    
    public static boolean coonectDB(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(connection, username,password );
            System.out.println("Connection executed successfully");
        }catch(SQLException ex){
             System.err.println("Failed connection to " + connection + " " + ex.getMessage() ); 
             return false;
        }
        return true;
    }
    
    
    
    private PreparedStatement pst;  
    private ResultSet rs;
    
    public boolean connect(String user, String pass ){
        Connection con = null;
        try {
            con = DriverManager.getConnection(connection, username,password );
            System.out.println("Connection executed successfully");
        
            String query = "SELECT * FROM Usuarios WHERE Username =? and Password =? ";
            pst =  con.prepareStatement(query);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs=pst.executeQuery();
            
            
            if( rs.next() ){
                System.out.println("Welcome user "+   rs.getString("Username"));
                return true;
            }else{
               return false;
            }
            
        }catch(SQLException ex){
            System.err.println("Failed connection to " + connection + " " + ex.getMessage() );    
            return false;
        }finally{
            try {
                if(con!=null){
                    con.close();
                    System.out.println("Conecction was closed");
                }
            }catch(SQLException ex2){
                System.out.println("Controllers.DataBaseConnector.connect()"+ ex2.getMessage());
            } 
            
            
        }
        
    }
    
    
    
    
}
