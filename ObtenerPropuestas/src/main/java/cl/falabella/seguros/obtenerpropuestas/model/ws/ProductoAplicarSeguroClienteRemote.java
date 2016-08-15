package cl.falabella.seguros.obtenerpropuestas.model.ws;


import cl.falabella.seguros.obtenerpropuestas.model.entities.PolizaRequest;

import cl.falabella.seguros.obtenerpropuestas.model.entities.PolizaResponse;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ProductoAplicarSeguroClienteRemote {
    
    public List<PolizaResponse> obtenerPropuestasPolizas(PolizaRequest polizaRequest) throws Exception ;
}
