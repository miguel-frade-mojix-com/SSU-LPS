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
public class Agenda {
    
    private Beneficiario    paciente;
    private Date            fechaDeAtencion;
    private int             numeroConsulta;    
    private Medico          medico;
    private int             turno ;

    public Agenda(Beneficiario ben,Date fecha,int consulta, Medico medico ){
        this.paciente=ben;
        this.fechaDeAtencion=fecha;
        this.numeroConsulta=consulta;
        this.medico=medico;           
    }
    
    public Agenda(Beneficiario ben,int consulta,Date fecha ){
        this.paciente=ben;
        this.numeroConsulta=consulta;
        this.fechaDeAtencion=fecha;
    }
    
    public Agenda(Beneficiario ben,int consulta,Date fecha,int turno ){
        this.paciente=ben;
        this.numeroConsulta=consulta;
        this.fechaDeAtencion=fecha;
        this.turno=turno;
    }
    
    public Beneficiario getPaciente(){return this.paciente;}
    public void setPaciente(Beneficiario ben){this.paciente=ben;}
    
    public Date getFechaDeAtencion(){return this.fechaDeAtencion;}
    public void setFechaDeAtencion(Date fecha){this.fechaDeAtencion=fecha;}
    
    public int getNumeroConsulta(){return this.numeroConsulta;}
    public void setNumeroDeConsulta(int consulta){this.numeroConsulta=consulta;}
    
    public Medico getMedico(){return this.medico;}
    public void setMedico(Medico medico){this.medico=medico;}
    

    
    public String getHoraConsulta2(){
        String hora="";     
        hora+= ((turno/4)+8)+":";
        int modulo=turno%4;     
        if (modulo==1) hora+="00";
        else if(modulo==2)hora+="15";
        else if(modulo==3)hora+="30";
        else hora+="45";

        return hora;
    }
    
    public String getHoraConsulta(){
        String minutes =""+fechaDeAtencion.getMinutes() ;
        if(minutes.length()==1){
            minutes="0"+minutes;
        }
        
        return ""+fechaDeAtencion.getHours()+":"+minutes;
    }
    
    public String getNombrePaciente(){
        return "" + paciente.getPrimerApellido()+" "+ paciente.getSegundoApellido() +" " +paciente.getPrimerNombre(); 
    }
    
}
