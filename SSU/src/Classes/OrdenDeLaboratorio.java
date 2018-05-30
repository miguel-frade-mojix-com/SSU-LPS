
package Classes;

import java.util.Date;

/**
 *
 * @author Miguel
 */
public class OrdenDeLaboratorio {

    private String ordenDeLaboratorioID;
    private Date fechaDeEmision;
    private String pacienteId;
    private String detalle;
    
    public OrdenDeLaboratorio(String ordenId, String pacienteId,Date fecha,String detalle){
        this.ordenDeLaboratorioID=ordenId;
        this.fechaDeEmision=fecha;
        this.pacienteId=pacienteId;
        this.detalle=detalle;
    }

    public String getOrdenId(){  return this.ordenDeLaboratorioID; }
    public void setOrdenId(String ordenId){this.ordenDeLaboratorioID=ordenId;}
    
    public String getPacienteId(){return this.pacienteId;}
    public void setPacienteId(String id){this.pacienteId=id;}
    
    public Date getFechaDeEmision(){return this.fechaDeEmision;}
    public void setFechaDeEmision(Date fecha){ this.fechaDeEmision=fecha;}
    
}
