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
public class Medicamento {
    
    //atributos
    
    private int cantidad;
    private String codigo;
    private String formaFisica;
    private String formaAdministracion;
    private String ID;
    private String producto;
    
    public Medicamento(int cant, String cod, String formF, String formAdmi,String id,String prod ){
        this.cantidad=cant;
        this.codigo=cod;
        this.formaFisica=formF;
        this.formaAdministracion=formAdmi;
        this.ID=id;
        this.producto=prod;
    }
    
    public int getCantidad(){    return this.cantidad;}
    public void setCantidad(int cant){this.cantidad=cant;}
    
    public String getCodigo(){return this.codigo;}
    public void setCodigo(String cod){this.codigo=cod; }
    
    public String getFormaFisica(){return this.formaFisica;}
    public void setFormaFisica(String formFis){this.formaFisica=formFis;}
    
    public String getFotmaAdministracion(){return this.formaAdministracion;}
    public void setFormaAdministracion(String formAdmi){ this.formaAdministracion=formAdmi; } 
    
    public String getID(){return this.ID;}
    public void setID(String id){this.ID=id;}
    
    public String getProducto(){ return this.producto;}
    public void setProducto(String prod){ this.producto=prod; }
    
}
