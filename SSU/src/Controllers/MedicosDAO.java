/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Classes.Medico;
import static Controllers.DataBaseConnector.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Miguel
 */
public class MedicosDAO extends DataBaseConnector {
    
    public static void crearMedico(String [] params, Date nacimiento){
        Date hoy = new Date();
        
        Connection con = null;
        PreparedStatement pst=null;  
        String query = "insert into medicos"  +
                "(ID_Medico, Primer_Nombre, Primer_Apellido, Ciudad, ID_Oficina, Correo_Institucional, Direccion, Especialidad, Fecha Nacimiento,"
                + "Horario_Inicio, Horario_Salida, Segundo_Nombre, Segundo_Apellido, Genero, Telefono_Movil, Correo_Diario  )"+
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        Timestamp timeStamp = new Timestamp(hoy.getTime());
        
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            pst.setString(1, timeStamp.toString());
            pst.setString(2, params[0]);
            pst.setString(3, params[1]);
            pst.setString(4, params[2]);
            pst.setString(5, params[3]);
            pst.setString(6, params[4]);
            pst.setString(7, params[5]);
            pst.setString(8, params[6]);
            pst.setDate(9, new java.sql.Date(nacimiento.getTime()));
            pst.setString(10, params[7]);
            pst.setString(11, params[8]);
            pst.setString(12, params[9]);
            pst.setString(13, params[10]);
            pst.setString(0, params[11]);
            pst.setString(15, params[13]);
            pst.setString(16, params[14]);
            
            
        }catch(SQLException ex){
            System.out.println("Insertar medico fallo:  "+ ex.getMessage());
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
    
    
    public static boolean borrarMedico(String []params){
        
        String query = "delete * from medicos where Primer_Nombre = " + params[0] + " and Primer_Apellido = " + params[1] ;
        Connection con = null;
        PreparedStatement pst=null;  
        
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            
            pst.execute();
        
        }catch(SQLException ex){
            System.out.println("Insertar medico fallo:  "+ ex.getMessage());
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
        return true;
    }
    
    
    public static LinkedList getMedicos(){
        LinkedList medicos = new LinkedList<Medico>();
                        
        String query = "select * from medicos ";
        Connection con = null;
        PreparedStatement pst=null;  
        ResultSet rs = null;
        try{
            con=DriverManager.getConnection( connection, username,password );
            pst=con.prepareStatement(query);
            rs=pst.executeQuery();
            
            while(rs.next()){
                Date fechaNac = new java.util.Date( rs.getDate("Fecha_Nacimiento").getTime()  );
                Medico medico_aux = new Medico(rs.getString("Ciudad"), rs.getString("Direccion"), fechaNac, 'M', rs.getString("Primer_Nombre"),rs.getString("Primer_Apellido"), rs.getString("Segundo_Apellido"), rs.getString("ID_Medico") );
                medicos.add(medico_aux);
            }
            
        }catch(SQLException ex){
            System.out.println("Insertar medico fallo:  "+ ex.getMessage());
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
        
        
        return medicos;
    }
            
    
}
