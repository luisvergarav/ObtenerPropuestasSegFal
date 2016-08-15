package cl.falabella.seguros.obtenerpropuestas.adapter;


import cl.falabella.seguros.obtenerpropuestas.model.entities.PolizaResponse;

import java.util.List;

public class PropuestasPolizasTransformer implements TransformerAdapter<List<PolizaResponse>> {
    private MediaAdapter adapter;

    public PropuestasPolizasTransformer(MediaAdapter adapter) {
        super();
        this.adapter = adapter;
    }

    public String transform(List<PolizaResponse> dto) {
        return this.adapter.transform(dto);
    }

    public List<PolizaResponse> transform(String dto) {
        return (List<PolizaResponse>)this.adapter.transform(dto);
    }
}
