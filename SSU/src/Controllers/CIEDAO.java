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
import java.util.LinkedList;
import Classes.Enfermedad;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Miguel
 */
public class CIEDAO extends DataBaseConnector{
    
    
    public static LinkedList buscarEnfermedad(String nombre){
        
        LinkedList enfermedades = new LinkedList();
        
        Connection con = null;
        PreparedStatement pst=null;  
        ResultSet rs= null;
        
        String query = "select * from cie where Descripcion_3 like ? order by Descripcion_3";
        String res = "%"+nombre+"%";
        
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            pst.setString(1, res);
            rs=pst.executeQuery();
            
            while(rs.next()){
                
                enfermedades.add(new Enfermedad(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4) ) );
                
            }
            System.out.println("Enfermedades encontradas"+  enfermedades.size());
            
            
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
        
        return enfermedades;
    }
    
    public static void registrarEnfermedad(String beneficiarioId, String enfermedades[]  ){
        Connection con = null;
        PreparedStatement pst=null;  
        ResultSet rs= null;
        Date hoy = new Date();
        
        String query = "insert into Indice_De_Enfermedades (ID_Beneficiario, Enfermedad, Fecha_Registrada)values ";
        
        for (int i = 0;i<enfermedades.length;i++){
            query+="('" + beneficiarioId + "'," + enfermedades[i] + "'," +  new java.sql.Date(hoy.getTime()).toString() + ")";
            if(i==enfermedades.length-1) query+=";";
            else query+=",";
        }
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Diagnostico de enfermedad registrado exitosamente.");
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
