/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import static Controllers.DataBaseConnector.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class DiagnosticoDAO extends DataBaseConnector{
    
    
    public static void guardarDiagnostico(){
        
        Connection con = null;
        PreparedStatement pst=null;  
        
        String query = "insert into diagnosticos"  +
                "()"+
                "values (?,?,?,?,?,?,);";
      
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            
            
 
            
            pst.executeQuery();
            
        }catch(SQLException ex){
            System.out.println("Agendar pacientes has failed:  "+ ex.getMessage());
        }finally{
               try{
               if(con!=null)
                   con.close();
           }catch(SQLException exe){
               System.out.println("Connection couldnot close: " + exe.getMessage());
           }
            
           try{
               if(pst!=null){
                   pst.close();
               }
           }catch(SQLException exe2){
               System.out.println("Controllers.AgendaDAO.getAgendados() resultSet couldnot close" + exe2.getMessage());
           }
            
            
            
        }      
        
    }
    
    
    
    
}
