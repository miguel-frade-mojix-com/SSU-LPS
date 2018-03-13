/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Miguel
 */
public class Datos_Personales {

    //atributos de clse
    
    private String ciudad;
    private String direccion;
    private Date fechaNacimiento;
    private int edad;
    private char genero;

    //constructores
    
    public Datos_Personales(String ciudad, String dir, Date fecha,char gen){
        this.ciudad=ciudad;
        this.direccion=dir;
        this.fechaNacimiento=fecha;
        this.genero=gen;    
        this.edad = calcularEdad();
        
    }
    
    
    // getters y setters
    
    public String getCiudad(){return this.ciudad;}
    public void setCiudad(String ciudad){this.ciudad=ciudad; }
    public String getDireccion(){return this.direccion;}
    public void setDireccion(String dir){this.direccion=dir;}
    public int getEdad(){ return this.edad;  }
    public void setEdad(int edad){this.edad=edad;}
    public Date getFechaNacimiento(){return this.fechaNacimiento;}
    public void setFechaNacimiento(Date nuevaFecha){this.fechaNacimiento=nuevaFecha;}
    public String getGenero(){ if(genero=='M')return "Masculino" ;else return "Femenino";}
    public void setGenero(char gen){this.genero=gen;}
    
    //funciones complementarias
    private int calcularEdad(){
        Calendar fecha_actual = getCalendar(new Date() );
        Calendar fecha_nacimiento = getCalendar(fechaNacimiento);
        int fechaNacimiento = fecha_nacimiento.get(1)-1900;
        this.edad = fecha_actual.get(1) - fechaNacimiento;
        System.out.println("Classes.Datos_Personales.calcularEdad()" + fecha_actual.get(1) +"  fechaNacimiento: " + fechaNacimiento);
        if(fecha_actual.get(2)>fecha_nacimiento.get(2) || (fecha_actual.get(2) ==fecha_nacimiento.get(2) && fecha_actual.get(3) > fecha_nacimiento.get(3)) ){
            edad--;
        }
        
        return edad;  
    }
    
    public Calendar getCalendar(Date date){
        Calendar fecha = Calendar.getInstance(Locale.ITALY);
        fecha.setTime(date);
        return fecha;
    }
    
    
    
    
    
    
    
}
