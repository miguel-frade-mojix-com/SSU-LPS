
package Classes;

/**
 *
 * @author Miguel
 */
public class DetalleExamenesLaboratorio {

    private String iDOrdenLaboratorio;
    private String estudioExamen;
    private String ressultado;

    public DetalleExamenesLaboratorio(String ordenId, String estudioExamen, String resultado) {
        this.iDOrdenLaboratorio=ordenId;
        this.estudioExamen=estudioExamen;
        this.ressultado=resultado;
    }
    
    public void setIdOrdenLaboratorio(String id){ this.iDOrdenLaboratorio=id;}
    public String getIdOrdenLaboratorio(){return this.iDOrdenLaboratorio;}
    
    public String getEstudioExamen(){return this.estudioExamen;}
    public void setEstudioExamen(String estudio){this.estudioExamen=estudio;}
    
    public String getResultado(){return this.ressultado;}
    public void setResultado(String res){this.ressultado =res;}
    
}
