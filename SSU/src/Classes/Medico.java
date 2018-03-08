/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Date;
/**
 *
 * @author Miguel
 */
public class Medico extends Datos_Personales{
    

    private String apellidoPaterno;
    private String apellidoMaterno;
    private String coore;
    private String especialidad;    
    private String nombre;

        
    public Medico(String ciudad,String dir, Date fecha, char gen,   String nombre,  String app,String apm, String correo, String esp ){
            super(ciudad,dir,fecha,gen );
            this.nombre=nombre;
            this.apellidoPaterno=app;
            this.apellidoMaterno=apm;
            this.coore=correo;
            this.especialidad=esp;
        
    }
    
    
    
    
}
