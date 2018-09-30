/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Classes.Medico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Classes.UX.MyLogger;

/**
 *
 * @author Miguel
 */
public class DataBaseConnector {
        
    protected static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
      
    private static String ip = "localhost";
    private static String port = "3307";
    private static String database = "segurosocialuniversitario";
    
    //VAriables to connecto to server 
    protected  static String connection= "jdbc:mysql://"+ip+":"+port+"/" + database;   
    protected static  String password ="ERINnb2uaUZxvlwh";//ERINnb2uaUZxvlwh
    protected static  String username= "admin";
    private static Medico medico;
    
//    
//    protected static final String connection= "jdbc:mysql://192.168.50.100:3306/mfrade13";
//    protected static final String username= "mfrade13";
//    protected static final String password ="Metallic@12";//ERINnb2uaUZxvlwh
//    
    
    public static Medico getMedico (){
        return DataBaseConnector.medico;
    }
    
    public static boolean coonectDB(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(connection, username,password );
            logger.log(Level.INFO,"Connection executed successfully");
            
        }catch(SQLException ex){
             logger.log(Level.WARNING,"Failed connection to " + connection + " " + ex.getMessage() ); 
             return false;
        }
        return true;
    }
    

    public static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(connection, username,password );
        }catch(SQLException ex){
             logger.log(Level.WARNING,"Failed connection to " + connection + " " + ex.getMessage() ); 
             return null;
        }
        return con;
    }
    
    
    private PreparedStatement pst;  
    private ResultSet rs;
    
    public int connect(String user, String pass ){
        Connection con = null;
        logger.setLevel(Level.INFO);

        if(user.compareTo("AJUSTES") ==0&&  pass.compareTo("AJUSTES")==0 ){

            return 9;
        }else{
            try {
                con = DriverManager.getConnection(connection, username,password );
                logger.log(Level.INFO,"Connection executed successfully");

                String query = "SELECT * FROM Usuarios WHERE Username =? and Password =? ";
                pst =  con.prepareStatement(query);
                pst.setString(1, user);
                pst.setString(2, pass);
                rs=pst.executeQuery();

                if( rs.next() ){
                    logger.log(Level.INFO,"Welcome user "+   rs.getString("Username"));
                    String medicoId= rs.getString("ID_Medico");
                    medico = getMedico(medicoId);
                    int permiso = rs.getInt("Permiso");
                    logger.info("Succesffully connected");
                    return permiso;
                }else{
                   return 0;
                }

            }catch(SQLException ex){
                logger.log(Level.WARNING , "Failed connection to {0} {1}", new Object[]{connection, ex.getMessage()});         
                JOptionPane.showMessageDialog(null, "Problemas de conexión con la base de datos. ","Login Eroor",JOptionPane.ERROR_MESSAGE );
                return 2;
            }finally{
                try {
                    if(con!=null){
                        con.close();
                        logger.log(Level.INFO,"Conecction was closed");
                    }
                }catch(SQLException ex2){
                    logger.log(Level.WARNING , "Controllers.DataBaseConnector.connect(){0}", ex2.getMessage());
                }    
            }
        }
    }
    
    public Medico getMedico(String id){
        String query= "SELECT * FROM  medicos where ID_Medico=?";
        Medico aux = null;
        PreparedStatement pst =null;
        ResultSet rs2 = null;
        Connection con = null;
        try{
            con = DriverManager.getConnection(connection, username, password);
            pst=con.prepareStatement(query);
            pst.setString(1, id);
            rs2=pst.executeQuery();
            while(rs2.next()){                
                aux = new Medico(rs2.getNString(4), rs2.getString(7), rs2.getDate(9), rs2.getString("Genero").charAt(0),
                        rs2.getString("Primer_Nombre"), rs2.getString("Segundo_Nombre"), rs2.getString(2),
                        rs2.getString(3), rs2.getString(5), rs2.getString(6), rs2.getString(8), rs2.getString(10),
                        rs2.getString(11),rs2.getString("ID_Medico") );
            }
        }catch (SQLException ex){
            logger.log(Level.WARNING , "Controllers.DataBaseConnector.getMedico(){0}", ex.getMessage());
            aux=new Medico();
        }finally{
            try{  
                if(con!=null){
                        con.close();
                        logger.log(Level.INFO,"Conecction was closed");
                }
                if(rs2 != null){
                    rs2.close();
                }
                if(pst!=null){
                    pst.close();
                }
            }catch(SQLException exe){
                logger.log(Level.WARNING,"" + exe.getMessage());
            }
        }
        return aux;
    }
    
    
    public static String[] config() {
       String [] results = new String[6];
     try{   
        FileInputStream file = new FileInputStream("config.txt");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(file) );
        logger.log(Level.INFO,"Controllers.DataBaseConnector.config()");
        String strLine;
        int i=0;
       
       while ((strLine = br.readLine()) != null)   {
         String aux[]=strLine.split(":");
         results[i]=aux[1];
         System.out.println (results[i]);
         i++;
       }
       //Close the input stream
       br.close();
     }catch(IOException ex){
        logger.log(Level.WARNING ,"Error file not found ");
     }       
     return results;
    }
    
    public static void guardarConfiguracion(String valores[]){
        ip = valores[0];
        port=valores[1];
        database=valores[2];
        username=valores[3];
        password=valores[4];
            
        StringBuilder sb = new StringBuilder();
        String s = System.lineSeparator();
        sb.append("IP:" +ip+s);

        sb.append("PORT:"+port +s );
        sb.append("DATABASE:"+database+s);
        sb.append("USERNAME:"+username+s);
        sb.append("PASSWORD:"+password+s);
        
        
        try{
            File file = new File("config.txt");
            FileOutputStream fileStream = new FileOutputStream(file,false);
            OutputStreamWriter writer2 = new OutputStreamWriter(fileStream, StandardCharsets.UTF_8);
            writer2.write(sb.toString());
            writer2.close();
        }catch(IOException ex){ // false to overwrite.
        
            logger.log(Level.WARNING,"Controllers.DataBaseConnector.guardarConfiguracion() error: "+ ex.getMessage());
        
        }
    }
    
    public static void actualizarTablad(String tabla, String []columnas, String[]valores){
         Connection con = null;
         PreparedStatement ps = null;
         String query ="update " + tabla + " set "  ;
         for(int i =0;i< columnas.length;i++){
             query+= columnas[i] + " = " + valores[i] ;
             if(i!=columnas.length-1 ){
                 query+=",";
            }
         }
         try{
            con=DriverManager.getConnection( connection, username,password );
            ps=con.prepareStatement(query);  
            ps.executeUpdate();
            
        }catch(SQLException ex){
            logger.log(Level.WARNING,"Insertar medico fallo:  "+ ex.getMessage());
        }finally{
            try{
               if(con!=null)
                   con.close();
           }catch(SQLException exe){
               logger.log(Level.WARNING,"Connection couldnot close: " + exe.getMessage());
           }
           try{
               if(ps!=null){
                   ps.close();
               }
           }catch(SQLException exe2){
               logger.log(Level.WARNING,"Controllers.AgendaDAO.getAgendados() resultSet couldnot close" + exe2.getMessage());
           }
        }
    }
    
    
}
