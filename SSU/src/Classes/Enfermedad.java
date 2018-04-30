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
public class Enfermedad {

    private String cod_3;
    private String descripcion_3;
    private String cod_4;
    private String Descripcion_4;

    public Enfermedad(String c3,String d3, String c4,String d4 ){
        
        this.cod_3=c3;
        this.descripcion_3=d3;
        this.cod_4=c4;
        this.Descripcion_4=d4;
        
    }
    
    public String getCodigo3(){return this.cod_3;}
    public void setCodigo3(String c3){this.cod_3=c3;}

    public String getCodigo4(){return this.cod_4;}
    public void setCodigo4(String c4){this.cod_4=c4;}
    
    public String getDescripcion3(){return this.descripcion_3;}
    public void setDescripcion3(String d3){this.descripcion_3=d3;}
    
    public String getDescripcion4(){return this.Descripcion_4;}
    public void setDescripcion4(String d4){this.Descripcion_4=d4;}
        
    
    
}
