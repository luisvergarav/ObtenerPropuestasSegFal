package cl.falabella.seguros.obtenerpropuestas.model.entities;

import java.io.Serializable;

/**
 * Clase que define una poliza
 * 
 * @author VASS
 *
 */
public class PolizaResponse implements Serializable {

	private static final long serialVersionUID = -7728837478898483469L;
	private String rpCarpDeRamo;
	private String cgRvMeaning;
	private String poCapoNuPolizaCedente;
	private ClienteAsegurado clienteAsegurado;
	private CertificadoPoliza certificadoPoliza;
	private ContratoPoliza contratoPoliza;

	public void setRpCarpDeRamo(String rpCarpDeRamo) {
		this.rpCarpDeRamo = rpCarpDeRamo;
	}

	public String getRpCarpDeRamo() {
		return rpCarpDeRamo;
	}

	public void setCgRvMeaning(String cgRvMeaning) {
		this.cgRvMeaning = cgRvMeaning;
	}

	public String getCgRvMeaning() {
		return cgRvMeaning;
	}

	public void setPoCapoNuPolizaCedente(String poCapoNuPolizaCedente) {
		this.poCapoNuPolizaCedente = poCapoNuPolizaCedente;
	}

	public String getPoCapoNuPolizaCedente() {
		return poCapoNuPolizaCedente;
	}

	public void setClienteAsegurado(ClienteAsegurado clienteAsegurado) {
		this.clienteAsegurado = clienteAsegurado;
	}

	public ClienteAsegurado getClienteAsegurado() {
		return clienteAsegurado;
	}

	public void setCertificadoPoliza(CertificadoPoliza certificadoPoliza) {
		this.certificadoPoliza = certificadoPoliza;
	}

	public CertificadoPoliza getCertificadoPoliza() {
		return certificadoPoliza;
	}

	public void setContratoPoliza(ContratoPoliza contratoPoliza) {
		this.contratoPoliza = contratoPoliza;
	}

	public ContratoPoliza getContratoPoliza() {
		return contratoPoliza;
	}
}
