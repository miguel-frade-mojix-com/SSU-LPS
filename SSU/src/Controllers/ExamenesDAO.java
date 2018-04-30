/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Classes.Enfermedad;
import Classes.Examenes;
import static Controllers.DataBaseConnector.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Miguel
 */
public class ExamenesDAO extends DataBaseConnector {
    
    
    
    
    public static LinkedList getExamenes(){
        LinkedList examenes = new LinkedList();
        
        
        Connection con = null;
        PreparedStatement pst=null;  
        ResultSet rs= null;
        
        String query = "select * from estudio_examen;";
   
        
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                System.out.println("Examenes recibidos");
                Examenes examen = new Examenes(rs.getString(3), rs.getString(1), rs.getString(2));
                examenes.add(examen);
            }    
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
        return examenes;
    }
    
    
    
    
    public static void agendarExamenes(){
        
        Connection con = null;
        PreparedStatement pst=null;  
        
        String query= "insert into orden_laboratorio";
        
        
        try{
            con = DriverManager.getConnection(connection, username, password);
            
            pst= con.prepareStatement(query);
            
            pst.executeQuery();
            
            
        }catch(SQLException ex){
            System.out.println("Controllers.ExamenesDAO.agendarExamenes()" + ex.getMessage());
            
        }
        
    }
    
    
}
