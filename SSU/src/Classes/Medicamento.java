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
    private int codigo;
    private String formaFisica;
    private String formaAdministracion;
    private String producto;
    
    public Medicamento(int cant, int cod, String formF, String formAdmi,String prod ){
        this.cantidad=cant;
        this.codigo=cod;
        this.formaFisica=formF;
        this.formaAdministracion=formAdmi;
        this.producto=prod;
    }
    
    public int getCantidad(){    return this.cantidad;}
    public void setCantidad(int cant){this.cantidad=cant;}
    
    public int getCodigo(){return this.codigo;}
    public void setCodigo(int cod){this.codigo=cod; }
    
    public String getFormaFisica(){return this.formaFisica;}
    public void setFormaFisica(String formFis){this.formaFisica=formFis;}
    
    public String getFotmaAdministracion(){return this.formaAdministracion;}
    public void setFormaAdministracion(String formAdmi){ this.formaAdministracion=formAdmi; } 
    
    public String getProducto(){ return this.producto;}
    public void setProducto(String prod){ this.producto=prod; }
    
}
