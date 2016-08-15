package cl.falabella.seguros.obtenerpropuestas.model.entities;

import java.io.Serializable;

public class ContratoPoliza extends Contrato implements Serializable {

	private static final long serialVersionUID = 8601957730119898886L;
	private String moCamoDeMoneda;
	private String ppCapbDePlan;
	private String motivoAnulacion;
	private String coCacmDeCompania;

	public void setMoCamoDeMoneda(String moCamoDeMoneda) {
		this.moCamoDeMoneda = moCamoDeMoneda;
	}

	public String getMoCamoDeMoneda() {
		return moCamoDeMoneda;
	}

	public void setPpCapbDePlan(String ppCapbDePlan) {
		this.ppCapbDePlan = ppCapbDePlan;
	}

	public String getPpCapbDePlan() {
		return ppCapbDePlan;
	}

	public void setMotivoAnulacion(String motivoAnulacion) {
		this.motivoAnulacion = motivoAnulacion;
	}

	public String getMotivoAnulacion() {
		return motivoAnulacion;
	}

	public void setCoCacmDeCompania(String coCacmDeCompania) {
		this.coCacmDeCompania = coCacmDeCompania;
	}

	public String getCoCacmDeCompania() {
		return coCacmDeCompania;
	}
}
