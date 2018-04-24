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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import Classes.Signos_Vitales;

/**
 *
 * @author Miguel
 */
public class SignosVitalesDAO  extends DataBaseConnector{
    
        
    public static LinkedList getSignosVitales(String id_paciente){
        Connection con = null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        
        LinkedList signosPaciente = new LinkedList();
        
        String query = "Select * from signos_vitales where ID_Beneficiario=? order by Fecha";
        
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            
            pst.setString(1, id_paciente);
            rs=pst.executeQuery();
            System.out.println("Controllers.SignosVitalesDAO.getSignosVitales()" + id_paciente);
            while(rs.next()){
             Date fecha = new Date(   rs.getDate("fecha").getTime()   );
             Signos_Vitales sv= new Signos_Vitales(rs.getInt("Estatura"),fecha,rs.getInt("Frecuencia_Cardiaca"),rs.getInt("Frecuencia_Respiratoria"),rs.getInt("Peso"),(short) rs.getInt("Presion1"),(short) rs.getInt("Presion2"),rs.getInt("Pulso"),rs.getFloat("Temperatura_Axilar"),rs.getFloat("Temperatura_Oral"),rs.getFloat("Temperatra_Rectal") );
             signosPaciente.add(sv);
            
            
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

        return signosPaciente;
    }
    
    
    
    
    
    
    
    
    
}
