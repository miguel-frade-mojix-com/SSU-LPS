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
public class Signos_Vitales {
    
    //atributos
    
    private int     estatura;
    private int     frecuenciaCardiaca;
    private int     frecuenciaRespiratoria;
    private float   indiceDeMasaCorporal;
    private float   peso;
    private short   presion1;
    private short   presion2;
    private int     pulso;
    private float   temperaturaAxilar;
    private float   temperaturaOral;
    private float   temperaturaRectal;
     
    //constructores
    public Signos_Vitales(int estatura,int freqCar,int freqResp,int peso,short presion1,short presion2,int pulso,float tempAx,float tempOral, float tempRectal ){
        this.estatura=estatura;
        this.frecuenciaCardiaca=freqCar;
        this.frecuenciaRespiratoria=freqResp;
        this.peso=peso;
        this.presion1=presion1;
        this.presion2=presion2;
        this.pulso=pulso;
        this.temperaturaAxilar=tempAx;
        this.temperaturaOral=tempOral;
        this.temperaturaRectal=tempRectal;
        this.indiceDeMasaCorporal=calcularIMC(estatura,peso);
        
    }
    
    //getters y setters
    
    public int getEstatura(){ return estatura;}
    public void setEstatura(int estatura){    this.estatura=estatura;    }
    
    
    
    
    
    //funciones adicionales
    public float calcularIMC(int est,int pes){
        return (float) (est/(float) pes) ;
    }
    
    
}
