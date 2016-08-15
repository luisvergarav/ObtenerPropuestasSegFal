package cl.falabella.seguros.obtenerpropuestas.model.entities;

import java.io.Serializable;

/*
 * Request Poliza
 * 
 */
public class PolizaRequest implements Serializable {    

	private static final long serialVersionUID = -559314674941282859L;
	private String tipoDocumento;
	private Integer numeroDocumento;
	private Integer estado;
    private Integer codigoRamo ;
    private String tipoCliente ;

  public PolizaRequest() {
      super();
  }

  /**
   * 
   * 
   * @param tipoDocumento
   * @param numeroDocumento
   * @param estado
   * @param codigoRamo
   * @param tipoCliente
   */
  public PolizaRequest(String tipoDocumento, Integer numeroDocumento,
		Integer estado, Integer codigoRamo, String tipoCliente) {
	super();
	this.tipoDocumento = tipoDocumento;
	this.numeroDocumento = numeroDocumento;
	this.estado = estado;
	this.codigoRamo = codigoRamo;
	this.tipoCliente = tipoCliente;
}




public void setEstado(Integer estado) {
      this.estado = estado;
  }

  public Integer getEstado() {
      return estado;
  }

  public void setCodigoRamo(Integer codigoRamo) {
      this.codigoRamo = codigoRamo;
  }

  public Integer getCodigoRamo() {
      return codigoRamo;
  }

  public void setTipoCliente(String tipoCliente) {
      this.tipoCliente = tipoCliente;
  }

  public String getTipoCliente() {
      return tipoCliente;
  }


public String getTipoDocumento() {
	return tipoDocumento;
}


public void setTipoDocumento(String tipoDocumento) {
	this.tipoDocumento = tipoDocumento;
}


public Integer getNumeroDocumento() {
	return numeroDocumento;
}


public void setNumeroDocumento(Integer numeroDocumento) {
	this.numeroDocumento = numeroDocumento;
}
  
  
}
