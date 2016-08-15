package cl.falabella.seguros.obtenerpropuestas.model.entities;

import java.io.Serializable;

public class ClienteAsegurado implements Serializable {

	private static final long serialVersionUID = -7481190668671683477L;
	private String cliCacnDiCobro_p;
	private String cliCacnNmApellidoRazon;
	private String cliCacnCdVerificacion;
	private String cliCacnFeNacimiento;

	public void setCliCacnDiCobro_p(String cliCacnDiCobro_p) {
		this.cliCacnDiCobro_p = cliCacnDiCobro_p;
	}

	public String getCliCacnDiCobro_p() {
		return cliCacnDiCobro_p;
	}

	public void setCliCacnNmApellidoRazon(String cliCacnNmApellidoRazon) {
		this.cliCacnNmApellidoRazon = cliCacnNmApellidoRazon;
	}

	public String getCliCacnNmApellidoRazon() {
		return cliCacnNmApellidoRazon;
	}

	public void setCliCacnCdVerificacion(String cliCacnCdVerificacion) {
		this.cliCacnCdVerificacion = cliCacnCdVerificacion;
	}

	public String getCliCacnCdVerificacion() {
		return cliCacnCdVerificacion;
	}

	public void setCliCacnFeNacimiento(String cliCacnFeNacimiento) {
		this.cliCacnFeNacimiento = cliCacnFeNacimiento;
	}

	public String getCliCacnFeNacimiento() {
		return cliCacnFeNacimiento;
	}
}
