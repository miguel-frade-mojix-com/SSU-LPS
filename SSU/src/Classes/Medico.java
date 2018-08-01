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
    private String consultorio;
    private String correo;
    private String especialidad;    
    private String horarioInicio;
    private String horarioSalida;
    private String id;
    private String primerNombre;
    private String segundoNombre;
    private String turno;
        
    public Medico(String ciudad,String dir, Date fechaNac, char gen,String primerNombre, String segundoNombre, String app,String apm,String consultorio, String correo, String esp,String horaIn, String horaSal, String id  ){
            super(ciudad,dir,fechaNac,gen );
            this.primerNombre=primerNombre;
            this.apellidoPaterno=app;
            this.apellidoMaterno=apm;
            this.correo=correo;
            this.especialidad=esp;
            this.horarioInicio=horaIn;
            this.horarioSalida=horaSal;
            this.segundoNombre=segundoNombre;
            this.consultorio=consultorio;
            this.turno=calcularTurno(horaIn);
            this.id=id;
    }       
    
    public Medico(String ciudad,String dir, Date fechaNac, char gen,String primerNombre, String app,String apm,String id){
            super(ciudad,dir,fechaNac,gen );
            this.primerNombre=primerNombre;
            this.apellidoPaterno=app;
            this.apellidoMaterno=apm;
            this.id=id;
    }
    
    public Medico(){
        super("La Paz","AV 6 de Agosto",new Date(),'M' );
    }
    
    //getters y setters
    
    public String getApellidoPaterno(){return this.apellidoPaterno;}
    public void setApellidoPaterno(String apellido){this.apellidoMaterno=apellido;}
    
    public String getApellidoMaterno(){return this.apellidoMaterno;}
    public void setApellidoMaterno(String apellido){this.apellidoMaterno=apellido;}
    
    public String getConsultorio(){return this.consultorio;}
    public void setConsultorio(String consultorio){this.consultorio=consultorio;}
    
    public String getCorreo(){return this.correo;}
    public void setCorreo(String correo){ this.correo=correo;}
    
    public String getEspecialidad(){return this.especialidad;}
    public void setEspecialidad(String esp){this.especialidad=esp;}
    
    public String getHorarioInicio(){return this.horarioInicio;}
    public void setHorarioInicio(String inicio){this.horarioInicio=inicio;}
    
    public String getHorarioSalida(){return this.horarioSalida;}
    public void setHorarioSalida(String salida){this.horarioSalida=salida; }
    
    public String getPrimerNombre(){return this.primerNombre;}
    public void setPrimerNombre(String nombre){ this.primerNombre=nombre; }
    
    public String getSegundoNombre(){return this.segundoNombre;}
    public void setSegundoNombre(String nombre){this.segundoNombre=nombre; }
    
    public String getTurno(){return this.turno;}
    public void setTurno(String turn){this.turno=turn;}
    
    public String getID(){return this.id;}
    public void setID(String id){this.id=id; }
    
    
    
    //funciones
    
    public String getNombreCompleto(){
        return ""+primerNombre +" " + apellidoPaterno + " " + apellidoMaterno ;
    }
    
    public int getCalcularTurno(String hora){
        int val = ((Integer.parseInt(hora)-8) *4) ;
        return val;
    }
      
    private String calcularTurno(String hora){
        String turn=null;
        System.out.println("Classes.Medico.calcularTurno() =" + hora.compareTo("12:00"));
                
        if(hora.compareTo("12:00")>=0){
            turn="TT";
        }else{
            turn="TM";
        }    
        return turn;
    }
    
    
    
}
