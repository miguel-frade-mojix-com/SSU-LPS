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
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Miguel
 */
public class DiagnosticoDAO extends DataBaseConnector{
    
    
    public static void guardarDiagnostico(String analitico, String objetivo, String subjetivo, String plan,String idBeneficiario ){
        Date hoy = new Date();
        
        Connection con = null;
        PreparedStatement pst=null;  
        String query = "insert into diagnosticos"  +
                "(ID_Diagnostico, Analitico,Fecha_De_Consulta,ID_Beneficiario,ID_Medico,Objetivo,Plan,Subjetivo)"+
                "values (?,?,?,?,?,?,?,?);";
        
        Timestamp timeStamp = new Timestamp(hoy.getTime());
        
        
        
        
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            pst.setString(1, timeStamp.toString());
            pst.setString(2, analitico);
            pst.setDate(3, new java.sql.Date(hoy.getTime()) );
            pst.setString(4, idBeneficiario);
            pst.setString(5, DataBaseConnector.getMedico().getID());
            pst.setString(6, objetivo);
            pst.setString(7, plan);
            pst.setString(0, subjetivo);
            
            pst.executeUpdate();
            
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
