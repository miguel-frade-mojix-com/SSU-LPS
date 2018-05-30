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
public class RecetaMedica {

    private String beneficiarioId;
    private Date fecha;
    private String medicoId;
    private String recetaId;


    
    public RecetaMedica(String id, Date fecha){
        this.recetaId = id;
        this.fecha=fecha;
    }
    
    
    
    public void setFecha(Date fecha){
        this.fecha= fecha;
    }
    public Date getFecha(){return this.fecha;}
    
    public void setRecetaId(String id){this.recetaId=id;}
    public String getRecetaId(){return this.recetaId;}
    
}
