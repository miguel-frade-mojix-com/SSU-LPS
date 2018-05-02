/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Classes.Medicamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.LinkedList;

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
        
        String query = "select * from medicamentos where Producto like ? ";
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
    
}
