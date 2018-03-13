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
public class Beneficiario extends Datos_Personales{
    
    private String  estadoCivil;
    private Date    fechaAfileacion;
    private String  Ocupacion;
    private String  primerApellido;
    private String  primerNombre;
    private String  segundoApellido;
    private String  segundoNombre;
    private String  tipoDeSangre;
    private String  tipoDeSeguro;
    
    
    
    
    public Beneficiario(String ciudad,String dir, Date fecha, char gen ){
        super(ciudad,dir,fecha,gen);    
    }

    public Beneficiario(String ciudad,String dir, Date fecha, char gen , String primerNombre, String primerApellido,String segundoNombre, String segundoApellido,Date afiliacion, String tipoSeguro){
        super(ciudad,dir,fecha,gen);   
        this.primerNombre=primerNombre;
        this.primerApellido=primerApellido;
        this.segundoNombre=segundoNombre;
        this.segundoApellido=segundoApellido;
        this.tipoDeSeguro=tipoSeguro;
        this.fechaAfileacion=afiliacion;
        this.Ocupacion=null;
    }


    //getters y setters

    public String getEstadoCivil(){return this.estadoCivil;}
    public void setEstadoCivil(String estado){this.estadoCivil=estado;}
    
    public Date getFechaAfiliacion(){return this.fechaAfileacion; }     
    public void setFechaAfiliacion(Date fecha){this.fechaAfileacion=fecha;}
    
    public String getOcupacion(){return this.Ocupacion;}
    public void setOcupacion(String ocupacion){this.Ocupacion=ocupacion;}
    
    public String getPrimerApellido(){return this.primerApellido;}
    public void setPrierApellido(String apellido){this.primerApellido=apellido;}
    
    public String getPrimerNombre(){return this.primerNombre; }
    public void setPrimerNombre(String nombre){this.primerNombre=nombre;}
    
    public String getSegundoApellido(){return this.segundoApellido;}
    public void setSegundoApellido(String apellido){this.segundoApellido=apellido; }

    public String getSegundoNombre(){return this.segundoNombre;}
    public void setSegundoNombre(String nombre){this.segundoNombre=nombre;}
    
    public String getTipoDeSangre(){return this.tipoDeSangre;}
    public void setTipoDeSangre(String tipo){this.tipoDeSangre=tipo;}
    
    public String getTipoDeSeguro(){return this.tipoDeSeguro;}
    public void setTipoDeSeguro(String tipo){this.tipoDeSeguro=tipo;}  
    
    
}
