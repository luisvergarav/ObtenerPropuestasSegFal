package cl.falabella.seguros.obtenerpropuestas.model.entities;

import java.io.Serializable;

public class CertificadoPoliza implements Serializable {

	private static final long serialVersionUID = -2753292349599623109L;
	private Integer caceCarpCdRamo;
	private String caceCasuCdSucursal;
	private Integer caceCapoNuPoliza;
	private Integer caceNuCertificado;
	private String caceFeSuscripcion;
	private String caceCapbCdPplan;
	private Integer caceNuCertificadoLider;
	private Integer caceNuPropuesta;

	public void setCaceCarpCdRamo(Integer caceCarpCdRamo) {
		this.caceCarpCdRamo = caceCarpCdRamo;
	}

	public Integer getCaceCarpCdRamo() {
		return caceCarpCdRamo;
	}

	public void setCaceCasuCdSucursal(String caceCasuCdSucursal) {
		this.caceCasuCdSucursal = caceCasuCdSucursal;
	}

	public String getCaceCasuCdSucursal() {
		return caceCasuCdSucursal;
	}

	public void setCaceCapoNuPoliza(Integer caceCapoNuPoliza) {
		this.caceCapoNuPoliza = caceCapoNuPoliza;
	}

	public Integer getCaceCapoNuPoliza() {
		return caceCapoNuPoliza;
	}

	public void setCaceNuCertificado(Integer caceNuCertificado) {
		this.caceNuCertificado = caceNuCertificado;
	}

	public Integer getCaceNuCertificado() {
		return caceNuCertificado;
	}

	public void setCaceFeSuscripcion(String caceFeSuscripcion) {
		this.caceFeSuscripcion = caceFeSuscripcion;
	}

	public String getCaceFeSuscripcion() {
		return caceFeSuscripcion;
	}

	public void setCaceCapbCdPplan(String caceCapbCdPplan) {
		this.caceCapbCdPplan = caceCapbCdPplan;
	}

	public String getCaceCapbCdPplan() {
		return caceCapbCdPplan;
	}

	public void setCaceNuCertificadoLider(Integer caceNuCertificadoLider) {
		this.caceNuCertificadoLider = caceNuCertificadoLider;
	}

	public Integer getCaceNuCertificadoLider() {
		return caceNuCertificadoLider;
	}

	public void setCaceNuPropuesta(Integer caceNuPropuesta) {
		this.caceNuPropuesta = caceNuPropuesta;
	}

	public Integer getCaceNuPropuesta() {
		return caceNuPropuesta;
	}
}
