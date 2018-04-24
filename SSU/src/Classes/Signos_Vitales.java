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
public class Signos_Vitales {
    
    //atributos
    
    private int     estatura;
    private Date    fecha;
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
    public Signos_Vitales(int estatura,Date fecha,int freqCar,int freqResp,float peso,short presion1,short presion2,int pulso,float tempAx,float tempOral, float tempRectal ){
        this.estatura=estatura;
        this.fecha=fecha;
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
    
    public Date getFecha(){return fecha;}
    public void setFecha(Date fecha){this.fecha=fecha;}
    
    public int getFrecuenciaCardiaca(){return this.frecuenciaCardiaca;}
    public void setFrecuenciaCardiaca(int freq){this.frecuenciaCardiaca=freq;}
    
    public int getFrecuenciaRespiratoria(){return this.frecuenciaRespiratoria;}
    public void setFrecuenciaRespiratoria(int frec){this.frecuenciaRespiratoria=frec;}
    
    public float getPeso(){return this.peso;}
    public void setPeso(float peso){this.peso=peso;}
    
    public short getPresion1(){return this.presion1;}
    public void setPresion1(short val) {this.presion1=val;}
    
    public short getPresion2(){return this.presion2;}
    public void setPresion2(short val) {this.presion2=val;}
    
    public int getPulso(){return this.pulso;}
    public void setPulso(int val){this.pulso=val;}
    
    public float getTemperaturaOral(){return this.temperaturaOral;}
    public void setTemperaturaOral(float val){this.temperaturaOral=val;}
    
    public float getTemperaturaAxilar(){return this.temperaturaAxilar;}
    public void setTemperaturaAxilar(float val){this.temperaturaAxilar=val;}
    
    public float getTemperaturaRectal(){return this.temperaturaRectal;}
    public void setTemperaturaRectal(float val){this.temperaturaRectal=val;}
    
    public float getIMC(){return this.indiceDeMasaCorporal;}
    public void setIMC(float val){this.indiceDeMasaCorporal=val;}
    
    public String getPresion(){return ""+presion1+"/"+presion2;}
    
    
    //funciones adicionales
    public float calcularIMC(int est,float pes){
        return (float) (est/(float) pes) ;
    }
    
    
}
