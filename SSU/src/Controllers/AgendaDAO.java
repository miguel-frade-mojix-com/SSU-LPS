/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.sql.*;
import java.util.LinkedList;
import Classes.Agenda;
/**
 *
 * @author Miguel
 */
public class AgendaDAO extends DataBaseConnector {
    

    
    
    
    public LinkedList<Agenda> getAgendados(Date fechaConsulta, String nombreMedico){
        LinkedList agendados = new LinkedList();
        String ID_Medico = getIDMedico(nombreMedico);
        String fecha = fechaConsulta.toString();
        String query="SELECT * FROM AGENDAS WHERE ID_MEDICO=?  AND Fecha_Agenda >=? ;";
        
        Connection con = null;
        PreparedStatement pst;  
        ResultSet rs=null;
        
        try{
           con=DriverManager.getConnection( connection, username,password );
           pst =  con.prepareStatement(query);
           pst.setString(1, ID_Medico);
           pst.setDate(2, fechaConsulta);
           rs=pst.executeQuery();
           
        }catch (SQLException ex){
            
        }finally{
           try{
               if(con!=null)
                   con.close();
           }catch(SQLException exe){
               System.out.println("Connection couldnot close: " + exe.getMessage());
           }
            
           try{
               if(rs!=null){
                   rs.close();
               }
           }catch(SQLException exe2){
               System.out.println("Controllers.AgendaDAO.getAgendados() resultSet couldnot close" + exe2.getMessage());
           }
            
        }
        
        
        return agendados;
    }
    

    public String getIDMedico(String nombreMedico){
        String campos[] = nombreMedico.split(" ");
        String nombre =campos[0];
        String apellidoPaterno = campos[1];
        String apellidoMaterno = campos[2];
        String result="";
 
        String statement= "SELECT ID_MEDICO FROM MEDICOS WHERE Primer_Nombre=? and Primer_Apellido=? ;";
         
        Connection con = null;
        PreparedStatement pst;  
        ResultSet rs=null;
        
        try{
           con=DriverManager.getConnection( connection, username,password );
           pst=con.prepareStatement(statement);
           pst.setString(1, nombre);
           pst.setString(2, apellidoPaterno);
           rs =pst.executeQuery();
           
           result = rs.getString("ID_Medico");
           
           
        }catch(SQLException ex ){
            System.out.println("Controllers.AgendaDAO.getIDMedico()"); 
        }finally{
            
            try{
               if(con!=null)
                   con.close();
           }catch(SQLException exe){
               System.out.println("Connection couldnot close: " + exe.getMessage());
           }
            
           try{
               if(rs!=null){
                   rs.close();
               }
           }catch(SQLException exe2){
               System.out.println("Controllers.AgendaDAO.getAgendados() resultSet couldnot close" + exe2.getMessage());
           }
            
            
        }
        
        return result;
    }
    
    
}
