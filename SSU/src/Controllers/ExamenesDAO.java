/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Classes.Beneficiario;
import Classes.DetalleExamenesLaboratorio;
import Classes.Enfermedad;
import Classes.Examenes;
import Classes.OrdenDeLaboratorio;
import static Controllers.DataBaseConnector.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

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
    
    
    
    
    public static void agendarExamenes(Beneficiario ben, String detalle,String[]examenes ){
        Date now = new Date();
        Connection con = null;
        PreparedStatement pst=null;        
        PreparedStatement pst2=null;
        String query= "insert into orden_laboratorio (ID_Orden_Laboratorio,ID_Beneficiario,ID_Laboratorio,Detalle,Fecha_Agendada) "+
                "values(?,?,?,?,?)";
        
        String query2 = "insert into detalle_examenes_laboratorio"+
                 "(ID_Orden_Laboratorio,ID_Estudio_Examen,Resultado_Examen )"+
                "values ";
        Timestamp timeStamp = new Timestamp(now.getTime() );
        String emptyResult="";
        for(int i=0;i<examenes.length;i++){
            query2+="('"+timeStamp.toString()+"','"+examenes[i]  +"','"+emptyResult+"')";
            if(i==examenes.length-1)query2+=";";
            else query2+=",";
        }
        try{
            con = DriverManager.getConnection(connection, username, password);
            
            pst= con.prepareStatement(query);
            pst.setString(1, timeStamp.toString());
            pst.setString(2, ben.getID());
            pst.setString(3, "L1");
            pst.setString(4,detalle);
            pst.setDate(5,new java.sql.Date(now.getTime()) );
            
            pst.executeUpdate();
            pst2=con.prepareStatement(query2);
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha agendado los examenes para laboratorio con exito");
            
        }catch(SQLException ex){
            System.out.println("Controllers.ExamenesDAO.agendarExamenes()" + ex.getMessage());
            
        }
        
    }
    
    
    public static LinkedList getExamenesDePaciente(String pacienteId){
        LinkedList ordenesDeLaboratorio = new LinkedList();
        
        Connection con = null;
        PreparedStatement pst=null;        
        ResultSet rs = null;
        
        String query="select * from orden_laboratorio where ID_Beneficiario =?;";
        
        try{
            con = DriverManager.getConnection(connection, username, password);
            pst= con.prepareStatement(query);
            pst.setString(1, pacienteId );
            rs= pst.executeQuery();
            while(rs.next()){
                ordenesDeLaboratorio.add(new OrdenDeLaboratorio(rs.getString(1), pacienteId, new Date(rs.getDate(5).getTime() ), rs.getString(4)));
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
        return ordenesDeLaboratorio;
    }
    
    public static LinkedList getDetalleExamenes(String ordenLaboratorioID){
        LinkedList detalles=new LinkedList();
        
        Connection con = null;
        PreparedStatement pst=null;        
        ResultSet rs = null;
        
        String query="select estudio_examen.Detalle as 'Estudio', detalle_examenes_laboratorio.Resultado_Examen as 'Resultado'  from detalle_examenes_laboratorio inner join estudio_examen on detalle_examenes_laboratorio.ID_Estudio_Examen=estudio_examen.ID_Estudio_Examen where ID_Orden_Laboratorio =?;";
        
           try {
            con = DriverManager.getConnection(connection, username, password);
            pst = con.prepareStatement(query);
            pst.setString(1, ordenLaboratorioID);

            rs = pst.executeQuery();

            while (rs.next()) {
                detalles.add(new DetalleExamenesLaboratorio(ordenLaboratorioID,rs.getString(1),  rs.getString(2)));
            }
               System.out.println("Controllers.ExamenesDAO.getDetalleExamenes() se han obtenido " +detalles.size() + " examenes;" );
        } catch (SQLException ex) {
            System.out.println("Agendar pacientes has failed:  " + ex.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException exe) {
                System.out.println("Connection couldnot close: " + exe.getMessage());
            }
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException exe2) {
                System.out.println("Controllers.AgendaDAO.getAgendados() resultSet couldnot close" + exe2.getMessage());
            }
        }     
        
        return detalles;
    }
    
    
    
}
