/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Classes.Beneficiario;
import Classes.DetalleReceta;
import Classes.Medicamento;
import Classes.RecetaMedica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class RecetaDAO extends DataBaseConnector{
    
    public static LinkedList getMedicamentos(String nombre){
        LinkedList medicamentos = new LinkedList();
        PreparedStatement pst =null;
        ResultSet rs = null;
        Connection con = null;
        
        String query = "select * from medicamentos where Producto like ? order by producto";
        String res = "%"+nombre+"%";
        try{
            con= DriverManager.getConnection(connection, username, password);
            pst = con.prepareStatement(query);
            pst.setString(1, res);
            rs=pst.executeQuery();
            while(rs.next()){
                Medicamento aux = new Medicamento(rs.getInt("cantidad"),rs.getString("Codigo"),rs.getString("Forma_Fisica"),rs.getString("Forma_Administracion"),rs.getString("ID_Medicamento"),   rs.getString("Producto")  );
                medicamentos.add(aux);       
            }   
        }catch (SQLException ex){
            System.out.println("Controllers.RecetaDAO.getMedicamentos()" + ex.getMessage());
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
        return medicamentos;
    }
    
    public static void recetarMedicamentos(Beneficiario ben,String medicamentos[], int cantidades[],int dosificaciones[],String indicaciones[]){
   
        PreparedStatement pst2=null;
        PreparedStatement pst =null;
        Connection con = null;
        Date hoy = new Date();
        
        String query = "insert into recetas (ID_Receta,ID_Medico,ID_Beneficiario,Fecha_Receta)"
                + "values(?,?,?,?)";
        Timestamp timeStamp = new Timestamp(hoy.getTime());
        
        String query2="insert into detalle_receta (ID_Receta, ID_Medicamento,Cantidad,Dosificacion,Indicaciones)"+
                "values " ;
            String emptyResult="";
        for(int i=0;i<medicamentos.length;i++){
            query2+="('"+timeStamp.toString()+"','"+medicamentos[i]  +"',"+cantidades[i]+","+ dosificaciones[i]+",'"+ indicaciones[i] +"')";
            if(i==medicamentos.length-1)query2+=";";
            else query2+=",";
        }      
        
        
        try{
            con = DriverManager.getConnection(connection, username, password);
            pst=con.prepareStatement(query);
            pst.setString(1, timeStamp.toString());
            pst.setString(2, DataBaseConnector.getMedico().getID() );
            pst.setString(3, ben.getID());
            pst.setDate(4, new java.sql.Date(hoy.getTime()));
            pst.executeUpdate();
            
            pst2=con.prepareStatement(query2);
            pst2.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Receta prescrita en laboratorio");
            
        }catch (SQLException ex){
            System.out.println("Controllers.RecetaDAO.getMedicamentos()" + ex.getMessage());
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
    
    public static LinkedList getRecetas(String beneficiarioID){
        
        LinkedList recetas = new LinkedList();
        
        Connection con = null;
        PreparedStatement pst =null;
        ResultSet rs = null;
        
        String query = "Select * from recetas where ID_Beneficiario = ?";
        
           try{
            con= DriverManager.getConnection(connection, username, password);
            pst = con.prepareStatement(query);
            pst.setString(1, beneficiarioID);
            rs=pst.executeQuery();
            while(rs.next()){
              RecetaMedica receta = new RecetaMedica(rs.getString("ID_Receta"),new Date( rs.getDate("Fecha_Receta").getTime()));
              recetas.add(receta);
            }   
        }catch (SQLException ex){
            System.out.println("Controllers.RecetaDAO.getMedicamentos()" + ex.getMessage());
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
        
        return recetas;
    }
    
    public static LinkedList getDetalleReceta(String recetaId){
        
        LinkedList detalleRecetas= new LinkedList();
        
        Connection con = null;
        PreparedStatement pst =null;
        ResultSet rs = null;
        
        String query = "select medicamentos.Producto as \"Producto\", detalle_receta.Cantidad as \"Cantidad\", detalle_receta.Dosificacion as \"Dosificacion\", detalle_receta.Indicaciones as \"Indicaciones\" from detalle_receta  inner join medicamentos on detalle_receta.ID_Medicamento=medicamentos.ID_Medicamento where detalle_receta.ID_Receta=?;";
              try{
            con= DriverManager.getConnection(connection, username, password);
            pst = con.prepareStatement(query);
            pst.setString(1, recetaId);
            rs=pst.executeQuery();
            while(rs.next()){
                System.out.println("Controllers.RecetaDAO.getDetalleReceta()  Successful detalles"  );

                DetalleReceta detalle = new DetalleReceta(rs.getString("Producto"), rs.getInt("Cantidad"), rs.getString("Dosificacion"), rs.getString("Indicaciones"));
                detalleRecetas.add(detalle);
            }   
        }catch (SQLException ex){
            System.out.println("Controllers.RecetaDAO.DetalleMedicamentos() " + ex.getMessage());
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
        
        return detalleRecetas;
    }
    
}
