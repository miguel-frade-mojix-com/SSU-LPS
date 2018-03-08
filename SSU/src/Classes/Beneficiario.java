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
    

    private Date fechaAfileacion;
    private String primerApellido;
    private String primerNombre;
    private String segundoApellido;
    private String segundoNombre;
    private String tipoDeSangre;
    private String tipoDeSeguro;
    
    
    
    
    public Beneficiario(String ciudad,String dir, Date fecha, char gen ){
        super(ciudad,dir,fecha,gen);
        
        
    }
    
    
    
}
