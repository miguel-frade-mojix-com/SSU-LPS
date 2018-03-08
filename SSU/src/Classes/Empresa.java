/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Miguel
 */
public class Empresa {
    
    private String descripcion;
    private Date fechaDeAfiliacion;
    private String nombre;
    private boolean validacion;
    private LinkedList<Beneficiario> Empleados;
    
    
    public Empresa(String desc,Date fecha,String nombre,boolean valid  ){
        this.descripcion=desc;
        this.fechaDeAfiliacion=fecha;
        this.nombre=nombre;
        this.validacion=valid;
        
    }
    
    
    
    public LinkedList<Beneficiario> getEmpleados(){
        return Empleados;
    }
    public void setEmpleados( LinkedList<Beneficiario>  beneficiarios ){
        this.Empleados=beneficiarios;
    }
    
    public Beneficiario getEmpleado(String nombre,String apellido  ){
        Beneficiario ben = null;
        for(Beneficiario beneficiario: Empleados){
            if(beneficiario.getPrimerNombre().compareTo(nombre)==0  && beneficiario.getPrimerApellido().compareTo(apellido)==0  ){
                ben=beneficiario;
            }
        }
        return ben;
    }
    
    
}
