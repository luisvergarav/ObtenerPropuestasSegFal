package cl.falabella.seguros.obtenerpropuestas.adapter;


import cl.falabella.seguros.obtenerpropuestas.model.entities.PolizaRequest;

public class ClientePropuestasPolizasTransformer implements TransformerAdapter<PolizaRequest> {
    private MediaAdapter adapter;

    public ClientePropuestasPolizasTransformer(MediaAdapter adapter) {
        super();
        this.adapter = adapter;
    }

    public String transform(PolizaRequest dto) {
        return adapter.transform(dto);
    }

    public PolizaRequest transform(String dto) {
        return (PolizaRequest)adapter.transform(dto);
    }
}
