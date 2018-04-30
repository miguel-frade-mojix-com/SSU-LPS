/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Miguel
 */
public class Examenes {
    
    
    private String nombre;
    private String codigo;
    private String categoria;
    
    
    public Examenes(String nom, String cod, String cat){
        this.nombre=nom;
        this.categoria=cat;
        this.codigo=cod;
        
    }
    
    public void setNombre(String nom){this.nombre=nom;}
    public String getNombre(){return this.nombre;}
    
    public void setCodigo(String cod){this.codigo=cod;}
    public String getCodigo(){return this.codigo;}
    
    public void setCategoria(String cat){this.categoria=cat;}
    public String getCategoria(){return this.categoria;}
    
    
    
}
