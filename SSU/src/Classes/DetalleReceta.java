
package Classes;

/**
 *
 * @author Miguel
 */
public class DetalleReceta {

    private String recetaId;
    private String producto;
    private int cantidad;
    private String dosificacion;
    private String indicaciones;
    
    public DetalleReceta(){
        
    }

     public DetalleReceta(String producto,int cantidad,String dosificacion, String indicaciones ){
        this.producto=producto;
        this.cantidad=cantidad;
        this.dosificacion=dosificacion;
        this.indicaciones=indicaciones;
    }
    
     
     public String getProducto(){return this.producto;}
     public void setProducto(String producto){this.producto=producto; }
     
     public int getCantidad(){return this.cantidad;}
     public void setCantidad(int cant){this.cantidad=cant;}
     
     public String getDosificacion(){return this.dosificacion;}
     public void setDosificacion(String dosis){this.dosificacion=dosis;}
     
     public String getIndicacion(){return this.indicaciones;}
     public void setIndicacion(String indicacion){this.indicaciones=indicacion;}
     
}
