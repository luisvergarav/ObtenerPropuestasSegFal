package cl.falabella.seguros.obtenerpropuestas.model.entities;

import java.io.Serializable;

public class Contrato implements Serializable{

	private static final long serialVersionUID = -5358333964213663034L;
	private Double mensualidad;
    private Double deducible;
    private Integer duracionContrato;


    public void setMensualidad(Double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public Double getMensualidad() {
        return mensualidad;
    }

    public void setDeducible(Double deducible) {
        this.deducible = deducible;
    }

    public Double getDeducible() {
        return deducible;
    }

    public void setDuracionContrato(Integer duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    public Integer getDuracionContrato() {
        return duracionContrato;
    }
}


